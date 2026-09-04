package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum RecordingFileType {
    AAC(0),
    MP4(1);

    private int value;

    RecordingFileType(int i10) {
        this.value = i10;
    }

    public static RecordingFileType fromId(int i10) {
        for (RecordingFileType recordingFileType : values()) {
            if (recordingFileType.value() == i10) {
                return recordingFileType;
            }
        }
        return AAC;
    }

    public int value() {
        return this.value;
    }
}
