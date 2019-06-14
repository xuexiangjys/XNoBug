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
