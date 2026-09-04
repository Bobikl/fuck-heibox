package com.google.android.exoplayer2.source.ads;

import androidx.annotation.j1;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.z3;

/* JADX INFO: compiled from: SinglePeriodAdTimeline.java */
/* JADX INFO: loaded from: classes7.dex */
@j1(otherwise = 3)
public final class n extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f47577h;

    public n(z3 z3Var, c cVar) {
        super(z3Var);
        com.google.android.exoplayer2.util.a.i(z3Var.n() == 1);
        com.google.android.exoplayer2.util.a.i(z3Var.w() == 1);
        this.f47577h = cVar;
    }

    @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
    public z3.b l(int i10, z3.b bVar, boolean z10) {
        this.f49002g.l(i10, bVar, z10);
        long j10 = bVar.f52096e;
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            j10 = this.f47577h.f47518e;
        }
        bVar.y(bVar.f52093b, bVar.f52094c, bVar.f52095d, j10, bVar.s(), this.f47577h, bVar.f52098g);
        return bVar;
    }
}
