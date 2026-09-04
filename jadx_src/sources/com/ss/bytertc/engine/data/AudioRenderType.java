package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioRenderType {
    AUDIO_RENDER_TYPE_EXTERNAL(0),
    AUDIO_RENDER_TYPE_INTERNAL(1);

    private int value;

    AudioRenderType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioRenderType fromId(int i10) {
        for (AudioRenderType audioRenderType : values()) {
            if (audioRenderType.value() == i10) {
                return audioRenderType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == AUDIO_RENDER_TYPE_EXTERNAL ? "AUDIO_RENDER_TYPE_EXTERNAL" : "AUDIO_RENDER_TYPE_INTERNAL";
    }

    public int value() {
        return this.value;
    }
}
