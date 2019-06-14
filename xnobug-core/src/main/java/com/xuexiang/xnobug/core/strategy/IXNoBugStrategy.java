package com.xuexiang.xnobug.core.strategy;

import android.content.Context;

import com.xuexiang.xnobug.core.proxy.IBugRecorder;
import com.xuexiang.xnobug.core.proxy.IEventRecorder;
import com.xuexiang.xnobug.core.proxy.IHttpService;
import com.xuexiang.xnobug.core.proxy.IInformationCollector;

/**
 * XNoBug的策略
 *
 * @author xuexiang
 * @since 2019-06-14 16:27
 */
public interface IXNoBugStrategy {

    /**
     * 获取设备唯一号
     *
     * @param context
     * @return 设备唯一号
     */
    String getDeviceID(Context context);

    /**
     * 获取应用的渠道号
     *
     * @param context
     * @return 应用的渠道号
     */
    String getAppChannel(Context context);

    /**
     * 获取应用的版本号
     *
     * @param context
     * @return 应用的版本号
     */
    int getVersionCode(Context context);

    /**
     * 获取应用的版本名
     *
     * @param context
     * @return 应用的版本名
     */
    String getVersionName(Context context);


}
