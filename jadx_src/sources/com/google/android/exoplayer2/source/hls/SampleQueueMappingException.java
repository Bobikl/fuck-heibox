package com.google.android.exoplayer2.source.hls;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@p0 String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 60);
        sb2.append("Unable to bind a sample queue to TrackGroup with mime type ");
        sb2.append(str);
        sb2.append(".");
        super(sb2.toString());
    }
}
