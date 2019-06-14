/*
 * Copyright (C) 2019 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

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
