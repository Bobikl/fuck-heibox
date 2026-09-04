package com.ss.bytertc.engine.data;

import com.ss.bytertc.engine.type.RecordingFileType;

/* JADX INFO: loaded from: classes4.dex */
public class RecordingConfig {
    public String dirPath;
    public RecordingFileType recordingFileType;

    public RecordingConfig() {
        this.recordingFileType = RecordingFileType.MP4;
    }

    public RecordingConfig(String str, RecordingFileType recordingFileType) {
        RecordingFileType recordingFileType2 = RecordingFileType.MP4;
        this.dirPath = str;
        this.recordingFileType = recordingFileType;
    }
}
