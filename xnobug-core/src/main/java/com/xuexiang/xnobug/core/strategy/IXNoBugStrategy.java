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
