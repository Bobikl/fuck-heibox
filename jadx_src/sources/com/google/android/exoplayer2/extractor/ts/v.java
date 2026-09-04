package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: PassthroughSectionPayloadReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a2 f46152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n0 f46153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f46154c;

    public v(String str) {
        this.f46152a = new a2.b().e0(str).E();
    }

    @mk.d({"timestampAdjuster", "output"})
    private void b() {
        com.google.android.exoplayer2.util.a.k(this.f46153b);
        u0.k(this.f46154c);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.b0
    public void a(n0 n0Var, com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        this.f46153b = n0Var;
        eVar.a();
        com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 5);
        this.f46154c = e0VarB;
        e0VarB.d(this.f46152a);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.b0
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        b();
        long jD = this.f46153b.d();
        long jE = this.f46153b.e();
        if (jD == com.google.android.exoplayer2.j.f46377b || jE == com.google.android.exoplayer2.j.f46377b) {
            return;
        }
        a2 a2Var = this.f46152a;
        if (jE != a2Var.f43597q) {
            a2 a2VarE = a2Var.c().i0(jE).E();
            this.f46152a = a2VarE;
            this.f46154c.d(a2VarE);
        }
        int iA = e0Var.a();
        this.f46154c.c(e0Var, iA);
        this.f46154c.e(jD, 1, iA, 0, null);
    }
}
