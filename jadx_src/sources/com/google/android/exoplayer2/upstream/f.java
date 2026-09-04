package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f51104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<u0> f51105c = new ArrayList<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private r f51107e;

    protected f(boolean z10) {
        this.f51104b = z10;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public /* synthetic */ Map b() {
        return n.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public final void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        if (this.f51105c.contains(u0Var)) {
            return;
        }
        this.f51105c.add(u0Var);
        this.f51106d++;
    }

    protected final void w(int i10) {
        r rVar = (r) com.google.android.exoplayer2.util.u0.k(this.f51107e);
        for (int i11 = 0; i11 < this.f51106d; i11++) {
            this.f51105c.get(i11).d(this, rVar, this.f51104b, i10);
        }
    }

    protected final void x() {
        r rVar = (r) com.google.android.exoplayer2.util.u0.k(this.f51107e);
        for (int i10 = 0; i10 < this.f51106d; i10++) {
            this.f51105c.get(i10).b(this, rVar, this.f51104b);
        }
        this.f51107e = null;
    }

    protected final void y(r rVar) {
        for (int i10 = 0; i10 < this.f51106d; i10++) {
            this.f51105c.get(i10).i(this, rVar, this.f51104b);
        }
    }

    protected final void z(r rVar) {
        this.f51107e = rVar;
        for (int i10 = 0; i10 < this.f51106d; i10++) {
            this.f51105c.get(i10).f(this, rVar, this.f51104b);
        }
    }
}
