package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioFrameType {
    FRAME_TYPE_PCM16(0);

    private int value;

    AudioFrameType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioFrameType fromId(int i10) {
        for (AudioFrameType audioFrameType : values()) {
            if (audioFrameType.value() == i10) {
                return audioFrameType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == FRAME_TYPE_PCM16 ? "kFrameTypePCM16" : "kFrameTypeUnknown";
    }

    public int value() {
        return this.value;
    }
}
