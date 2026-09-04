package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.p0;
import com.google.android.exoplayer2.source.chunk.j;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.u0;

/* JADX INFO: compiled from: SsChunkSource.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c extends j {

    /* JADX INFO: compiled from: SsChunkSource.java */
    public interface a {
        c a(h0 h0Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, com.google.android.exoplayer2.trackselection.j jVar, @p0 u0 u0Var);
    }

    void a(com.google.android.exoplayer2.trackselection.j jVar);

    void f(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar);
}
