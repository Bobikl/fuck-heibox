package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.upstream.g0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: ChunkSource.java */
/* JADX INFO: loaded from: classes7.dex */
public interface j {
    void b() throws IOException;

    boolean c(long j10, f fVar, List<? extends n> list);

    boolean d(f fVar, boolean z10, g0.d dVar, g0 g0Var);

    int e(long j10, List<? extends n> list);

    void g(f fVar);

    long h(long j10, r3 r3Var);

    void j(long j10, long j11, List<? extends n> list, h hVar);

    void release();
}
