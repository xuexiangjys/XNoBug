package com.xuexiang.xnobug.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.text.format.Formatter;

import com.xuexiang.xnobug.core.model.DeviceInfo;
import com.xuexiang.xnobug.core.model.DeviceStatusInfo;

import java.io.File;
import java.util.Arrays;

import static android.os.BatteryManager.EXTRA_LEVEL;
import static android.os.BatteryManager.EXTRA_SCALE;
import static android.os.BatteryManager.EXTRA_TEMPERATURE;

/**
 * 设备工具类
 *
 * @author xuexiang
 * @since 2019-05-04 17:53
 */
public final class DeviceUtils {

    private DeviceUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private final static String ANDROID = "Android";

    /**
     * 获取设备信息
     *
     * @return 设备信息
     */
    @SuppressLint("HardwareIds")
    public static DeviceInfo getDeviceInfo(@NonNull Context context) {
        DeviceInfo info = new DeviceInfo();
        info.androidID = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            info.cpuABI = Arrays.toString(Build.SUPPORTED_ABIS);
        } else {
            info.cpuABI = Build.CPU_ABI;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
            info.deviceName = Settings.Global.getString(context.getContentResolver(), Settings.Global.DEVICE_NAME);
        } else {
            if (BluetoothAdapter.getDefaultAdapter() != null) {
                info.deviceName = BluetoothAdapter.getDefaultAdapter().getName();
            }
        }
        info.deviceBrand = Build.BOARD + "  " + Build.MANUFACTURER;
        info.systemVersion = ANDROID + " " + Build.VERSION.RELEASE + ", API " + Build.VERSION.SDK_INT;
        info.isRoot = isDeviceRooted();
        return info;
    }

    /**
     * 获取设备状态信息
     *
     * @param context
     * @return
     */
    @SuppressLint("DefaultLocale")
    public static DeviceStatusInfo getDeviceStatusInfo(@NonNull Context context) {
        DeviceStatusInfo info = new DeviceStatusInfo();

        Intent battery = context.getApplicationContext().registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        if (battery != null) {
            int level = battery.getIntExtra(EXTRA_LEVEL, 0);
            int batterySum = battery.getIntExtra(EXTRA_SCALE, 100);
            int temperature = battery.getIntExtra(EXTRA_TEMPERATURE, 0);
            int batteryPercent = 100 * level / batterySum;
            info.batteryLevel = batteryPercent + "%";
            info.batteryTemperature = String.format("%.1f°C", (double) temperature / 10F);
        }
        info.sdcardAvailableRatio = getSDCardSpace(context);
        info.diskAvailableRatio = getDiskSpace(context);
        info.memoryAvailableRatio = getMemorySpace(context);
        info.timeStamp = System.currentTimeMillis();
        return info;
    }


    /**
     * 获得SD卡总大小
     *
     * @return
     */
    private static String getSDTotalSize(Context context) {
        File path = Environment.getExternalStorageDirectory();
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long totalBlocks = stat.getBlockCount();
        return Formatter.formatFileSize(context, blockSize * totalBlocks);
    }

    /**
     * 获得sd卡剩余容量，即可用大小
     *
     * @return
     */
    private static String getSDAvailableSize(Context context) {
        File path = Environment.getExternalStorageDirectory();
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long availableBlocks = stat.getAvailableBlocks();
        return Formatter.formatFileSize(context, blockSize * availableBlocks);
    }

    /**
     * 获得磁盘总大小
     *
     * @return
     */
    private static String getDiskTotalSize(Context context) {
        File path = Environment.getDataDirectory();
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long totalBlocks = stat.getBlockCount();
        return Formatter.formatFileSize(context, blockSize * totalBlocks);
    }

    /**
     * 获得磁盘可用大小
     *
     * @return
     */
    private static String getDiskAvailableSize(Context context) {
        File path = Environment.getDataDirectory();
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long availableBlocks = stat.getAvailableBlocks();
        return Formatter.formatFileSize(context, blockSize * availableBlocks);
    }


    public static String getSDCardSpace(Context context) {
        try {
            String free = getSDAvailableSize(context);
            String total = getSDTotalSize(context);
            return free + "/" + total;
        } catch (Exception e) {
            return "-/-";
        }
    }

    public static String getDiskSpace(Context context) {
        try {
            String free = getDiskAvailableSize(context);
            String total = getDiskTotalSize(context);
            return free + "/" + total;
        } catch (Exception e) {
            return "-/-";
        }
    }

    /**
     * 获取系统内存可用占比
     *
     * @return
     */
    private static String getMemorySpace(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                manager.getMemoryInfo(memoryInfo);
                String free = Formatter.formatFileSize(context, memoryInfo.availMem);
                String total = Formatter.formatFileSize(context, memoryInfo.totalMem);
                return free + "/" + total;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "-/-";
    }


    /**
     * 判断设备是否 root
     *
     * @return the boolean{@code true}: 是<br>{@code false}: 否
     */
    private static boolean isDeviceRooted() {
        String su = "su";
        String[] locations = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/",
                "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/"};
        for (String location : locations) {
            if (new File(location + su).exists()) {
                return true;
            }
        }
        return false;
    }


}
