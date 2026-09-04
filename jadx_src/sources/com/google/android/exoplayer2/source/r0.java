package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public interface r0 {

    /* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
    public interface a {
        r0 a();
    }

    void a(long j10, long j11);

    int b(com.google.android.exoplayer2.extractor.z zVar) throws IOException;

    long c();

    void d();

    void e(com.google.android.exoplayer2.upstream.k kVar, Uri uri, Map<String, List<String>> map, long j10, long j11, com.google.android.exoplayer2.extractor.m mVar) throws IOException;

    void release();
}
