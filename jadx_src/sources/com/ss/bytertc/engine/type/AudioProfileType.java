package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioProfileType {
    AUDIO_PROFILE_DEFAULT(0),
    AUDIO_PROFILE_FLUENT(1),
    AUDIO_PROFILE_STANDARD(2),
    AUDIO_PROFILE_HD(3),
    AUDIO_PROFILE_STANDARD_STEREO(4),
    AUDIO_PROFILE_HD_MONO(5);

    private final int value;

    AudioProfileType(int i10) {
        this.value = i10;
    }

    public static AudioProfileType fromId(int i10) {
        for (AudioProfileType audioProfileType : values()) {
            if (audioProfileType.value() == i10) {
                return audioProfileType;
            }
        }
        return AUDIO_PROFILE_DEFAULT;
    }

    public int value() {
        return this.value;
    }
}
