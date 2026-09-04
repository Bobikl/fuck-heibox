package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: BaseMediaChunk.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f47619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f47620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f47621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f47622n;

    public a(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, a2 a2Var, int i10, @p0 Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(oVar, rVar, a2Var, i10, obj, j10, j11, j14);
        this.f47619k = j12;
        this.f47620l = j13;
    }

    public final int i(int i10) {
        return ((int[]) com.google.android.exoplayer2.util.a.k(this.f47622n))[i10];
    }

    protected final c j() {
        return (c) com.google.android.exoplayer2.util.a.k(this.f47621m);
    }

    public void k(c cVar) {
        this.f47621m = cVar;
        this.f47622n = cVar.a();
    }
}
