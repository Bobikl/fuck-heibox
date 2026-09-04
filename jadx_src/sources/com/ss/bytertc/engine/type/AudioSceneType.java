package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioSceneType {
    AUDIO_SCENE_DEFAULT(0),
    AUDIO_SCENE_CHATROOM(1),
    AUDIO_SCENE_HIGH_QUALITY_CHATROOM(2),
    AUDIO_SCENE_LOW_LATENCY(3);

    public final int value;

    AudioSceneType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioSceneType fromId(int i10) {
        for (AudioSceneType audioSceneType : values()) {
            if (audioSceneType.value() == i10) {
                return audioSceneType;
            }
        }
        return AUDIO_SCENE_DEFAULT;
    }

    public int value() {
        return this.value;
    }
}
