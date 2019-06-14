package com.xuexiang.xnobug.core.proxy.impl;

import android.content.Context;

import com.xuexiang.xnobug.core.proxy.IEventRecorder;

import java.util.Map;

/**
 * 默认事件记录者
 *
 * @author xuexiang
 * @since 2019-06-14 18:11
 */
public class DefaultEventRecorderImpl implements IEventRecorder {
    @Override
    public void recordEvent(Context context, String eventID, String eventLabel) {

    }

    @Override
    public void recordEvent(Context context, String eventID, String eventLabel, Map<String, Object> eventData) {

    }
}
