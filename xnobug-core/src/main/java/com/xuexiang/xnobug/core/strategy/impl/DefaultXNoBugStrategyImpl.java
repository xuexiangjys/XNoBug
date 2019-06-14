package com.xuexiang.xnobug.core.strategy.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;

import com.xuexiang.xnobug.core.strategy.IXNoBugStrategy;
import com.xuexiang.xnobug.utils.AppUtils;

/**
 * 默认提供的XNoBug策略
 *
 * @author xuexiang
 * @since 2019-06-14 16:41
 */
public class DefaultXNoBugStrategyImpl implements IXNoBugStrategy {

    private static final String KEY_CHANNEL_ID = "Channel_ID";

    @SuppressLint("HardwareIds")
    @Override
    public String getDeviceID(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    @Override
    public String getAppChannel(Context context) {
        return AppUtils.getFitMetaDataInApp(context, KEY_CHANNEL_ID);
    }

    @Override
    public int getVersionCode(Context context) {
        return AppUtils.getVersionCode(context);
    }

    @Override
    public String getVersionName(Context context) {
        return AppUtils.getVersionName(context);
    }


}
