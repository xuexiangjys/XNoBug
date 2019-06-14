package com.xuexiang.xnobug.core.proxy.impl;

import android.content.Context;

import com.xuexiang.xnobug.core.proxy.IBugRecorder;

/**
 * 默认Bug/错误信息记录者
 *
 * @author xuexiang
 * @since 2019-06-14 18:09
 */
public class DefaultBugRecorderImpl implements IBugRecorder {

    @Override
    public void recordCrash(Context context, Throwable throwable) {

    }

    @Override
    public void recordError(Context context, Throwable throwable) {

    }
}
