package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class RecordingProgress {
    public long duration;
    public long fileSize;

    public RecordingProgress(long j10, long j11) {
        this.duration = j10;
        this.fileSize = j11;
    }

    @CalledByNative
    public static RecordingProgress create(long j10, long j11) {
        return new RecordingProgress(j10, j11);
    }
}
