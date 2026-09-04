package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.e0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: ChunkExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public interface g {

    /* JADX INFO: compiled from: ChunkExtractor.java */
    public interface a {
        @p0
        g a(int i10, a2 a2Var, boolean z10, List<a2> list, @p0 e0 e0Var);
    }

    /* JADX INFO: compiled from: ChunkExtractor.java */
    public interface b {
        e0 b(int i10, int i11);
    }

    boolean a(com.google.android.exoplayer2.extractor.l lVar) throws IOException;

    void c(@p0 b bVar, long j10, long j11);

    @p0
    com.google.android.exoplayer2.extractor.e d();

    @p0
    a2[] e();

    void release();
}
