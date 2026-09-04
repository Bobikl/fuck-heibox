package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: MediaChunk.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class n extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f47700j;

    public n(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, a2 a2Var, int i10, @p0 Object obj, long j10, long j11, long j12) {
        super(oVar, rVar, 1, a2Var, i10, obj, j10, j11);
        com.google.android.exoplayer2.util.a.g(a2Var);
        this.f47700j = j12;
    }

    public long g() {
        long j10 = this.f47700j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean h();
}
