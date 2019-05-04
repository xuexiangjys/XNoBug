package com.xuexiang.xnobug.core;

import com.xuexiang.xnobug.core.proxy.IBugRecorder;
import com.xuexiang.xnobug.core.proxy.IInformationCollector;
import com.xuexiang.xnobug.core.proxy.IUploadHttpService;

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
     * 信息收集者
     */
    private IInformationCollector mInformationCollector;
    /**
     * 文件上传服务
     */
    private IUploadHttpService mUploadHttpService;


}
