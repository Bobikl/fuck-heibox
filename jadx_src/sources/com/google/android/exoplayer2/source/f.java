package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes7.dex */
public class f implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e1[] f48005b;

    public f(e1[] e1VarArr) {
        this.f48005b = e1VarArr;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public boolean a() {
        for (e1 e1Var : this.f48005b) {
            if (e1Var.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        boolean zD;
        boolean z10 = false;
        do {
            long jG = g();
            if (jG == Long.MIN_VALUE) {
                break;
            }
            zD = false;
            for (e1 e1Var : this.f48005b) {
                long jG2 = e1Var.g();
                boolean z11 = jG2 != Long.MIN_VALUE && jG2 <= j10;
                if (jG2 == jG || z11) {
                    zD |= e1Var.d(j10);
                }
            }
            z10 |= zD;
        } while (zD);
        return z10;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public final long e() {
        long jMin = Long.MAX_VALUE;
        for (e1 e1Var : this.f48005b) {
            long jE = e1Var.e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public final void f(long j10) {
        for (e1 e1Var : this.f48005b) {
            e1Var.f(j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.e1
    public final long g() {
        long jMin = Long.MAX_VALUE;
        for (e1 e1Var : this.f48005b) {
            long jG = e1Var.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
