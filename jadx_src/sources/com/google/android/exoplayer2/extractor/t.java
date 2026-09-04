package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f45689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f45690e;

    public t(u uVar, long j10) {
        this.f45689d = uVar;
        this.f45690e = j10;
    }

    private c0 a(long j10, long j11) {
        return new c0((j10 * 1000000) / ((long) this.f45689d.f46197e), this.f45690e + j11);
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        com.google.android.exoplayer2.util.a.k(this.f45689d.f46203k);
        u uVar = this.f45689d;
        u.a aVar = uVar.f46203k;
        long[] jArr = aVar.f46205a;
        long[] jArr2 = aVar.f46206b;
        int iJ = u0.j(jArr, uVar.l(j10), true, false);
        c0 c0VarA = a(iJ == -1 ? 0L : jArr[iJ], iJ != -1 ? jArr2[iJ] : 0L);
        if (c0VarA.f44855a == j10 || iJ == jArr.length - 1) {
            return new b0.a(c0VarA);
        }
        int i10 = iJ + 1;
        return new b0.a(c0VarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f45689d.h();
    }
}
