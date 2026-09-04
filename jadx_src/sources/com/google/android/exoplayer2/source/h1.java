package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;

/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h1 extends z3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f48032t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final i2 f48033u = new i2.c().D("SinglePeriodTimeline").K(Uri.EMPTY).a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f48034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f48035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f48036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f48037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f48038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f48039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f48040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f48041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f48042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f48043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f48044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private final i2 f48045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private final i2.g f48046s;

    @Deprecated
    public h1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, @androidx.annotation.p0 Object obj, i2 i2Var, @androidx.annotation.p0 i2.g gVar) {
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, i2Var, gVar);
    }

    public h1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, i2 i2Var, @androidx.annotation.p0 i2.g gVar) {
        this.f48034g = j10;
        this.f48035h = j11;
        this.f48036i = j12;
        this.f48037j = j13;
        this.f48038k = j14;
        this.f48039l = j15;
        this.f48040m = j16;
        this.f48041n = z10;
        this.f48042o = z11;
        this.f48043p = z12;
        this.f48044q = obj;
        this.f48045r = (i2) com.google.android.exoplayer2.util.a.g(i2Var);
        this.f48046s = gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public h1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        i2 i2Var = f48033u;
        this(j10, j11, j12, j13, j14, j15, j16, z10, z11, false, obj, i2Var.c().J(obj2).a(), z12 ? i2Var.f46271e : null);
    }

    public h1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, i2 i2Var) {
        this(com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, j10, j11, j12, j13, z10, z11, false, obj, i2Var, z12 ? i2Var.f46271e : null);
    }

    @Deprecated
    public h1(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        this(com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    public h1(long j10, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, i2 i2Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, i2Var);
    }

    @Deprecated
    public h1(long j10, boolean z10, boolean z11, boolean z12, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // com.google.android.exoplayer2.z3
    public int g(Object obj) {
        return f48032t.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.z3
    public z3.b l(int i10, z3.b bVar, boolean z10) {
        com.google.android.exoplayer2.util.a.c(i10, 0, 1);
        return bVar.x(null, z10 ? f48032t : null, 0, this.f48037j, -this.f48039l);
    }

    @Override // com.google.android.exoplayer2.z3
    public int n() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.z3
    public Object t(int i10) {
        com.google.android.exoplayer2.util.a.c(i10, 0, 1);
        return f48032t;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.z3
    public z3.d v(int i10, z3.d dVar, long j10) {
        long j11;
        com.google.android.exoplayer2.util.a.c(i10, 0, 1);
        long j12 = this.f48040m;
        boolean z10 = this.f48042o;
        if (!z10 || this.f48043p || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f48038k;
            if (j13 != com.google.android.exoplayer2.j.f46377b) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return dVar.n(z3.d.f52104s, this.f48045r, this.f48044q, this.f48034g, this.f48035h, this.f48036i, this.f48041n, z10, this.f48046s, j11, this.f48038k, 0, 0, this.f48039l);
    }

    @Override // com.google.android.exoplayer2.z3
    public int w() {
        return 1;
    }
}
