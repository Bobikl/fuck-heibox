package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioSourceType {
    AUDIO_SOURCE_TYPE_EXTERNAL(0),
    AUDIO_SOURCE_TYPE_INTERNAL(1);

    private int value;

    AudioSourceType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioSourceType fromId(int i10) {
        for (AudioSourceType audioSourceType : values()) {
            if (audioSourceType.value() == i10) {
                return audioSourceType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == AUDIO_SOURCE_TYPE_EXTERNAL ? "AUDIO_SOURCE_TYPE_EXTERNAL" : "AUDIO_SOURCE_TYPE_INTERNAL";
    }

    public int value() {
        return this.value;
    }
}
