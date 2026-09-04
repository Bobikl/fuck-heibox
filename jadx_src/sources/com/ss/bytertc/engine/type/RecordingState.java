package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum RecordingState {
    RECORDING_STATE_ERROE(0),
    RECORDING_STATE_PROCESSING(1),
    RECORDING_STATE_SUCCESS(2);

    private int value;

    RecordingState(int i10) {
        this.value = i10;
    }

    public static RecordingState fromId(int i10) {
        for (RecordingState recordingState : values()) {
            if (recordingState.value() == i10) {
                return recordingState;
            }
        }
        return RECORDING_STATE_ERROE;
    }

    public int value() {
        return this.value;
    }
}
