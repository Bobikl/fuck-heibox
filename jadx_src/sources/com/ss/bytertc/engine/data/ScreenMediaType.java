package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum ScreenMediaType {
    SCREEN_MEDIA_TYPE_VIDEO_ONLY(0),
    SCREEN_MEDIA_TYPE_AUDIO_ONLY(1),
    SCREEN_MEDIA_TYPE_VIDEO_AND_AUDIO(2);

    private int value;

    ScreenMediaType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static ScreenMediaType fromId(int i10) {
        for (ScreenMediaType screenMediaType : values()) {
            if (screenMediaType.value() == i10) {
                return screenMediaType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
