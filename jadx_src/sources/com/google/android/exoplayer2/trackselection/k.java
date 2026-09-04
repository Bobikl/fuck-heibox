package com.google.android.exoplayer2.trackselection;

import androidx.annotation.p0;
import com.google.android.exoplayer2.source.n1;
import java.util.List;

/* JADX INFO: compiled from: FixedTrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f50105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final Object f50106k;

    public k(n1 n1Var, int i10) {
        this(n1Var, i10, 0);
    }

    public k(n1 n1Var, int i10, int i11) {
        this(n1Var, i10, i11, 0, null);
    }

    public k(n1 n1Var, int i10, int i11, int i12, @p0 Object obj) {
        super(n1Var, new int[]{i10}, i11);
        this.f50105j = i12;
        this.f50106k = obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public int a() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public void k(long j10, long j11, long j12, List<? extends com.google.android.exoplayer2.source.chunk.n> list, com.google.android.exoplayer2.source.chunk.o[] oVarArr) {
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    @p0
    public Object r() {
        return this.f50106k;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public int u() {
        return this.f50105j;
    }
}
