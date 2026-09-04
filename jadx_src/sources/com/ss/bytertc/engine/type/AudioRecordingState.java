package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioRecordingState {
    AUDIO_RECORDING_STATE_ERROR(0),
    AUDIO_RECORDING_STATE_PROCESSING(1),
    AUDIO_RECORDING_STATE_SUCCESS(2);

    private int value;

    AudioRecordingState(int i10) {
        this.value = i10;
    }

    public static AudioRecordingState fromId(int i10) {
        for (AudioRecordingState audioRecordingState : values()) {
            if (audioRecordingState.value() == i10) {
                return audioRecordingState;
            }
        }
        return AUDIO_RECORDING_STATE_ERROR;
    }

    public int value() {
        return this.value;
    }
}
