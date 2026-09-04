package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum RecordingType {
    RECORD_AUDIO_ONLY(0),
    RECORD_VIDEO_ONLY(1),
    RECORD_VIDEO_AND_AUDIO(2);

    private int value;

    RecordingType(int i10) {
        this.value = i10;
    }

    public static RecordingType fromId(int i10) {
        for (RecordingType recordingType : values()) {
            if (recordingType.value() == i10) {
                return recordingType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
