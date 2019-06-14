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
