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

package com.xuexiang.xnobug.core;

import com.xuexiang.xnobug.core.proxy.IBugRecorder;
import com.xuexiang.xnobug.core.proxy.IEventRecorder;
import com.xuexiang.xnobug.core.proxy.IInformationCollector;
import com.xuexiang.xnobug.core.proxy.IHttpService;

/**
 * Bug上报管理者
 *
 * @author xuexiang
 * @since 2019-05-04 16:18
 */
public class BugReporter {

    /**
     * Bug记录者
     */
    private IBugRecorder mBugRecorder;
    /**
     * Bug记录者
     */
    private IEventRecorder mEventRecorder;
    /**
     * 信息收集者
     */
    private IInformationCollector mInformationCollector;
    /**
     * 文件上传服务
     */
    private IHttpService mUploadHttpService;




}
