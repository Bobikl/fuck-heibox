package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.a2;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i0.a> f45926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.e0[] f45927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f45931f = com.google.android.exoplayer2.j.f46377b;

    public l(List<i0.a> list) {
        this.f45926a = list;
        this.f45927b = new com.google.android.exoplayer2.extractor.e0[list.size()];
    }

    private boolean a(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        if (e0Var.a() == 0) {
            return false;
        }
        if (e0Var.G() != i10) {
            this.f45928c = false;
        }
        this.f45929d--;
        return this.f45928c;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f45928c = false;
        this.f45931f = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        if (this.f45928c) {
            if (this.f45929d != 2 || a(e0Var, 32)) {
                if (this.f45929d != 1 || a(e0Var, 0)) {
                    int iE = e0Var.e();
                    int iA = e0Var.a();
                    for (com.google.android.exoplayer2.extractor.e0 e0Var2 : this.f45927b) {
                        e0Var.S(iE);
                        e0Var2.c(e0Var, iA);
                    }
                    this.f45930e += iA;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
        if (this.f45928c) {
            if (this.f45931f != com.google.android.exoplayer2.j.f46377b) {
                for (com.google.android.exoplayer2.extractor.e0 e0Var : this.f45927b) {
                    e0Var.e(this.f45931f, 1, this.f45930e, 0, null);
                }
            }
            this.f45928c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f45928c = true;
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f45931f = j10;
        }
        this.f45930e = 0;
        this.f45929d = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        for (int i10 = 0; i10 < this.f45927b.length; i10++) {
            i0.a aVar = this.f45926a.get(i10);
            eVar.a();
            com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 3);
            e0VarB.d(new a2.b().S(eVar.b()).e0(com.google.android.exoplayer2.util.y.D0).T(Collections.singletonList(aVar.f45887c)).V(aVar.f45885a).E());
            this.f45927b[i10] = e0VarB;
        }
    }
}
