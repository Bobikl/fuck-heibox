package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum PublishFallbackOption {
    DISABLE(0),
    SIMULCAST_SMALL_VIDEO_ONLY(1);

    private int value;

    PublishFallbackOption(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static PublishFallbackOption fromId(int i10) {
        for (PublishFallbackOption publishFallbackOption : values()) {
            if (publishFallbackOption.value() == i10) {
                return publishFallbackOption;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
