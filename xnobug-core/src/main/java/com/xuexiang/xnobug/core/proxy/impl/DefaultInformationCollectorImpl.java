package com.xuexiang.xnobug.core.proxy.impl;

import android.content.Context;

import com.xuexiang.xnobug.core.model.AppInfo;
import com.xuexiang.xnobug.core.model.DeviceInfo;
import com.xuexiang.xnobug.core.model.DeviceStatusInfo;
import com.xuexiang.xnobug.core.model.ErrorInfo;
import com.xuexiang.xnobug.core.proxy.IInformationCollector;
import com.xuexiang.xnobug.utils.AppUtils;
import com.xuexiang.xnobug.utils.DeviceUtils;

/**
 * 默认信息收集者
 *
 * @author xuexiang
 * @since 2019-05-04 17:50
 */
public class DefaultInformationCollectorImpl implements IInformationCollector {

    private DeviceInfo mDeviceInfo;

    private AppInfo mAppInfo;

    /**
     * 收集设备信息【基本不会变】
     *
     * @param context
     * @return
     */
    @Override
    public DeviceInfo getDeviceInfo(Context context) {
        if (mDeviceInfo == null) {
            mDeviceInfo = DeviceUtils.getDeviceInfo(context);
        }
        return mDeviceInfo;
    }

    /**
     * 收集应用信息【基本不会变】
     *
     * @param context
     * @return
     */
    @Override
    public AppInfo getAppInfo(Context context) {
        if (mAppInfo == null) {
            mAppInfo = AppUtils.getAppInfo(context);
        }
        return mAppInfo;
    }

    /**
     * 收集设备状态信息[由于会随时间变化，因此不做缓存]
     *
     * @param context
     * @return
     */
    @Override
    public DeviceStatusInfo getDeviceStatusInfo(Context context) {
        return DeviceUtils.getDeviceStatusInfo(context);
    }

    /**
     * 收集错误信息
     *
     * @param throwable 错误
     * @return
     */
    @Override
    public ErrorInfo getErrorInfo(Throwable throwable) {
        return AppUtils.getErrorInfo(throwable);
    }
}
