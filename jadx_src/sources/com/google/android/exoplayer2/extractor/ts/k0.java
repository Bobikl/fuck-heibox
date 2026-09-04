package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.a2;
import java.util.List;

/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f45923c = 434;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a2> f45924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.e0[] f45925b;

    public k0(List<a2> list) {
        this.f45924a = list;
        this.f45925b = new com.google.android.exoplayer2.extractor.e0[list.size()];
    }

    public void a(long j10, com.google.android.exoplayer2.util.e0 e0Var) {
        if (e0Var.a() < 9) {
            return;
        }
        int iO = e0Var.o();
        int iO2 = e0Var.o();
        int iG = e0Var.G();
        if (iO == 434 && iO2 == 1195456820 && iG == 3) {
            com.google.android.exoplayer2.extractor.d.b(j10, e0Var, this.f45925b);
        }
    }

    public void b(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        for (int i10 = 0; i10 < this.f45925b.length; i10++) {
            eVar.a();
            com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 3);
            a2 a2Var = this.f45924a.get(i10);
            String str = a2Var.f43593m;
            boolean z10 = com.google.android.exoplayer2.util.y.f51593q0.equals(str) || com.google.android.exoplayer2.util.y.f51595r0.equals(str);
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.a.b(z10, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            e0VarB.d(new a2.b().S(eVar.b()).e0(str).g0(a2Var.f43585e).V(a2Var.f43584d).F(a2Var.E).T(a2Var.f43595o).E());
            this.f45925b[i10] = e0VarB;
        }
    }
}
