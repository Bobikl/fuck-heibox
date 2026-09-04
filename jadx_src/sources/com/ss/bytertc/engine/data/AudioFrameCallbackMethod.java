package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioFrameCallbackMethod {
    AUDIO_FRAME_CALLBACK_RECORD(0),
    AUDIO_FRAME_CALLBACK_PLAYBACK(1),
    AUDIO_FRAME_CALLBACK_MIXED(2),
    AUDIO_FRAME_CALLBACK_REMOTE_USER(3);

    private int value;

    AudioFrameCallbackMethod(int i10) {
        this.value = i10;
    }

    public static AudioFrameCallbackMethod fromId(int i10) {
        for (AudioFrameCallbackMethod audioFrameCallbackMethod : values()) {
            if (audioFrameCallbackMethod.value() == i10) {
                return audioFrameCallbackMethod;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
