package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.a2;
import java.util.List;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a2> f45755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.e0[] f45756b;

    public d0(List<a2> list) {
        this.f45755a = list;
        this.f45756b = new com.google.android.exoplayer2.extractor.e0[list.size()];
    }

    public void a(long j10, com.google.android.exoplayer2.util.e0 e0Var) {
        com.google.android.exoplayer2.extractor.d.a(j10, e0Var, this.f45756b);
    }

    public void b(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        for (int i10 = 0; i10 < this.f45756b.length; i10++) {
            eVar.a();
            com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 3);
            a2 a2Var = this.f45755a.get(i10);
            String str = a2Var.f43593m;
            boolean z10 = com.google.android.exoplayer2.util.y.f51593q0.equals(str) || com.google.android.exoplayer2.util.y.f51595r0.equals(str);
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.a.b(z10, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            String strB = a2Var.f43582b;
            if (strB == null) {
                strB = eVar.b();
            }
            e0VarB.d(new a2.b().S(strB).e0(str).g0(a2Var.f43585e).V(a2Var.f43584d).F(a2Var.E).T(a2Var.f43595o).E());
            this.f45756b[i10] = e0VarB;
        }
    }
}
