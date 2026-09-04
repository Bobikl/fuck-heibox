package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum SubscribeFallbackOptions {
    SUBSCRIBE_FALLBACK_OPTIONS_DISABLED(0),
    SUBSCRIBE_FALLBACK_OPTIONS_STREAM_LOW(1),
    SUBSCRIBE_FALLBACK_OPTIONS_AUDIO_ONLY(2);

    private int value;

    SubscribeFallbackOptions(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static SubscribeFallbackOptions fromId(int i10) {
        for (SubscribeFallbackOptions subscribeFallbackOptions : values()) {
            if (subscribeFallbackOptions.value() == i10) {
                return subscribeFallbackOptions;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
