package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum StreamPriority {
    STREAM_PRIORITY_LOW(0),
    STREAM_PRIORITY_MEDIAM(1),
    STREAM_PRIORITY_HIGH(2);

    private int value;

    StreamPriority(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static StreamPriority fromId(int i10) {
        for (StreamPriority streamPriority : values()) {
            if (streamPriority.value() == i10) {
                return streamPriority;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
