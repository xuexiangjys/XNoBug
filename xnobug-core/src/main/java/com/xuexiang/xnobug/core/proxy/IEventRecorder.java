package com.xuexiang.xnobug.core.proxy;

import android.content.Context;

import java.util.Map;

/**
 * 事件记录者的实现接口
 *
 * @author xuexiang
 * @since 2019-06-14 15:34
 */
public interface IEventRecorder {

    /**
     * 记录事件
     *
     * @param context
     * @param eventID    事件ID
     * @param eventLabel 事件名
     */
    void recordEvent(Context context, String eventID, String eventLabel);

    /**
     * 记录事件
     *
     * @param context
     * @param eventID    事件ID
     * @param eventLabel 事件名
     * @param eventData  事件携带的数据
     */
    void recordEvent(Context context, String eventID, String eventLabel, Map<String, Object> eventData);

}
