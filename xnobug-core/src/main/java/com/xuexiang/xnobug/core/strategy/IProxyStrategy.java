package com.xuexiang.xnobug.core.strategy;

import com.xuexiang.xnobug.core.proxy.IBugRecorder;
import com.xuexiang.xnobug.core.proxy.IEventRecorder;
import com.xuexiang.xnobug.core.proxy.IHttpService;
import com.xuexiang.xnobug.core.proxy.IInformationCollector;

/**
 * 代理接口策略
 *
 * @author xuexiang
 * @since 2019-06-14 18:16
 */
public interface IProxyStrategy {

    /**
     * 获取网络请求服务
     *
     * @return 网络请求服务
     */
    IHttpService getIHttpService();

    /**
     * 获取信息收集者
     *
     * @return 信息收集者
     */
    IInformationCollector getIInformationCollector();

    /**
     * 获取事件记录者
     *
     * @return 事件记录者
     */
    IEventRecorder getIEventRecorder();

    /**
     * 获取Bug/错误信息记录者
     *
     * @return Bug/错误信息记录者
     */
    IBugRecorder getIBugRecorder();

}
