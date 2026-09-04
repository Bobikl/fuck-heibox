package com.ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ByteRTCStreamSinglePushEvent {
    SINGLE_STREAM_PUSH_BASE(0),
    SINGLE_STREAM_PUSH_START(1),
    SINGLE_STREAM_PUSH_SUCCESS(2),
    SINGLE_STREAM_PUSH_FAILED(3),
    SINGLE_STREAM_PUSH_STOP(4),
    SINGLE_STREAM_PUSH_TIMEOUT(5),
    SINGLE_STREAM_PUSH_PARAM_ERROR(6);

    private int value;

    ByteRTCStreamSinglePushEvent(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ByteRTCStreamSinglePushEvent fromId(int i10) {
        for (ByteRTCStreamSinglePushEvent byteRTCStreamSinglePushEvent : values()) {
            if (byteRTCStreamSinglePushEvent.value() == i10) {
                return byteRTCStreamSinglePushEvent;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
