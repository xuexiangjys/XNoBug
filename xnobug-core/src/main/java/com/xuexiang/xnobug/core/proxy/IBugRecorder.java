package com.xuexiang.xnobug.core.proxy;

import android.content.Context;

/**
 * Bug记录者
 *
 * @author xuexiang
 * @since 2019-05-04 23:44
 */
public interface IBugRecorder {

    /**
     * 记录崩溃
     *
     * @param context
     * @param throwable
     */
    void recordCrash(Context context, Throwable throwable);

    /**
     * 记录重要错误
     *
     * @param context
     * @param throwable
     */
    void recordError(Context context, Throwable throwable);
}
