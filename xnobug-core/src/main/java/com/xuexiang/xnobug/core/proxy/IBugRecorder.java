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
