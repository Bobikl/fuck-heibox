package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioDeviceType {
    AUDIO_DEVICE_TYPE_UNKNOWN(-1),
    AUDIO_DEVICE_TYPE_RENDER_DEVICE(0),
    AUDIO_DEVICE_TYPE_CAPTURE_DEVICE(1),
    AUDIO_DEVICE_TYPE_SCREEN_CAPTURE_DEVICE(2);

    private final int value;

    AudioDeviceType() {
        this.value = 0;
    }

    AudioDeviceType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioDeviceType fromId(int i10) {
        for (AudioDeviceType audioDeviceType : values()) {
            if (audioDeviceType.value() == i10) {
                return audioDeviceType;
            }
        }
        return AUDIO_DEVICE_TYPE_UNKNOWN;
    }

    public int value() {
        return this.value;
    }
}
