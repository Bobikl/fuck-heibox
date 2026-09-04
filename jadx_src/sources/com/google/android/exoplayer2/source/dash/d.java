package com.google.android.exoplayer2.source.dash;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.u0;
import java.util.List;

/* JADX INFO: compiled from: DashChunkSource.java */
/* JADX INFO: loaded from: classes7.dex */
public interface d extends com.google.android.exoplayer2.source.chunk.j {

    /* JADX INFO: compiled from: DashChunkSource.java */
    public interface a {
        d a(h0 h0Var, com.google.android.exoplayer2.source.dash.manifest.c cVar, b bVar, int i10, int[] iArr, com.google.android.exoplayer2.trackselection.j jVar, int i11, long j10, boolean z10, List<a2> list, @p0 n.c cVar2, @p0 u0 u0Var);
    }

    void a(com.google.android.exoplayer2.trackselection.j jVar);

    void i(com.google.android.exoplayer2.source.dash.manifest.c cVar, int i10);
}
