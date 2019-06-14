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

package com.xuexiang.xnobug.core.proxy;

import android.content.Context;

import com.xuexiang.xnobug.core.model.AppInfo;
import com.xuexiang.xnobug.core.model.DeviceInfo;
import com.xuexiang.xnobug.core.model.DeviceStatusInfo;
import com.xuexiang.xnobug.core.model.ErrorInfo;

/**
 * 信息收集者【收集设备信息、设备状态信息、应用信息】的实现接口
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

    /**
     * 收集错误信息
     *
     * @param throwable 错误
     * @return
     */
    ErrorInfo getErrorInfo(Throwable throwable);
}
