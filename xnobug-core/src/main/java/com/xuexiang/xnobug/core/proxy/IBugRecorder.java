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

/**
 * Bug/错误信息记录者的实现接口
 *
 * @author xuexiang
 * @since 2019-05-04 23:44
 */
public interface IBugRecorder {

    /**
     * 记录崩溃
     *
     * @param context
     * @param throwable 崩溃信息
     */
    void recordCrash(Context context, Throwable throwable);

    /**
     * 记录重要错误
     *
     * @param context
     * @param throwable 错误信息
     */
    void recordError(Context context, Throwable throwable);
}
