package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.z3;

/* JADX INFO: compiled from: ForwardingTimeline.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class s extends z3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final z3 f49002g;

    public s(z3 z3Var) {
        this.f49002g = z3Var;
    }

    @Override // com.google.android.exoplayer2.z3
    public int f(boolean z10) {
        return this.f49002g.f(z10);
    }

    @Override // com.google.android.exoplayer2.z3
    public int g(Object obj) {
        return this.f49002g.g(obj);
    }

    @Override // com.google.android.exoplayer2.z3
    public int h(boolean z10) {
        return this.f49002g.h(z10);
    }

    @Override // com.google.android.exoplayer2.z3
    public int j(int i10, int i11, boolean z10) {
        return this.f49002g.j(i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.z3
    public z3.b l(int i10, z3.b bVar, boolean z10) {
        return this.f49002g.l(i10, bVar, z10);
    }

    @Override // com.google.android.exoplayer2.z3
    public int n() {
        return this.f49002g.n();
    }

    @Override // com.google.android.exoplayer2.z3
    public int s(int i10, int i11, boolean z10) {
        return this.f49002g.s(i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.z3
    public Object t(int i10) {
        return this.f49002g.t(i10);
    }

    @Override // com.google.android.exoplayer2.z3
    public z3.d v(int i10, z3.d dVar, long j10) {
        return this.f49002g.v(i10, dVar, j10);
    }

    @Override // com.google.android.exoplayer2.z3
    public int w() {
        return this.f49002g.w();
    }
}
