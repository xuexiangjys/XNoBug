package com.xuexiang.xnobug.core.proxy;

import android.content.Context;

import com.xuexiang.xnobug.core.model.AppInfo;
import com.xuexiang.xnobug.core.model.DeviceInfo;
import com.xuexiang.xnobug.core.model.DeviceStatusInfo;

/**
 * 信息收集者【收集设备信息、设备状态信息、应用信息】
 *
 * @author xuexiang
 * @since 2019-05-04 17:09
 */
public interface IInformationCollector {

    /**
     * 收集设备信息
     *
     * @param context
     * @return
     */
    DeviceInfo getDeviceInfo(Context context);


    /**
     * 收集应用信息
     *
     * @param context
     * @return
     */
    AppInfo getAppInfo(Context context);


    /**
     * 收集设备状态信息
     *
     * @param context
     * @return
     */
    DeviceStatusInfo getDeviceStatusInfo(Context context);
}
