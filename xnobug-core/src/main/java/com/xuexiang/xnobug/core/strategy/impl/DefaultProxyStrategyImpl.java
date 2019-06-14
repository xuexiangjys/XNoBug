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

import com.xuexiang.xnobug.core.proxy.IBugRecorder;
import com.xuexiang.xnobug.core.proxy.IEventRecorder;
import com.xuexiang.xnobug.core.proxy.IHttpService;
import com.xuexiang.xnobug.core.proxy.IInformationCollector;
import com.xuexiang.xnobug.core.proxy.impl.DefaultBugRecorderImpl;
import com.xuexiang.xnobug.core.proxy.impl.DefaultEventRecorderImpl;
import com.xuexiang.xnobug.core.proxy.impl.DefaultHttpServiceImpl;
import com.xuexiang.xnobug.core.proxy.impl.DefaultInformationCollectorImpl;
import com.xuexiang.xnobug.core.strategy.IProxyStrategy;

/**
 * 默认代理策略
 *
 * @author xuexiang
 * @since 2019-06-14 18:17
 */
public class DefaultProxyStrategyImpl implements IProxyStrategy {

    @Override
    public IHttpService getIHttpService() {
        return new DefaultHttpServiceImpl();
    }

    @Override
    public IInformationCollector getIInformationCollector() {
        return new DefaultInformationCollectorImpl();
    }

    @Override
    public IEventRecorder getIEventRecorder() {
        return new DefaultEventRecorderImpl();
    }

    @Override
    public IBugRecorder getIBugRecorder() {
        return new DefaultBugRecorderImpl();
    }
}
