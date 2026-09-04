package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.e0;
import java.io.IOException;

/* JADX INFO: compiled from: TrackFragment.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f45569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45574f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45580l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    public p f45582n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f45586r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f45575g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f45576h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f45577i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f45578j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f45579k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f45581m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e0 f45583o = new e0();

    public void a(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        lVar.readFully(this.f45583o.d(), 0, this.f45583o.f());
        this.f45583o.S(0);
        this.f45584p = false;
    }

    public void b(e0 e0Var) {
        e0Var.k(this.f45583o.d(), 0, this.f45583o.f());
        this.f45583o.S(0);
        this.f45584p = false;
    }

    public long c(int i10) {
        return this.f45578j[i10];
    }

    public void d(int i10) {
        this.f45583o.O(i10);
        this.f45580l = true;
        this.f45584p = true;
    }

    public void e(int i10, int i11) {
        this.f45573e = i10;
        this.f45574f = i11;
        if (this.f45576h.length < i10) {
            this.f45575g = new long[i10];
            this.f45576h = new int[i10];
        }
        if (this.f45577i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f45577i = new int[i12];
            this.f45578j = new long[i12];
            this.f45579k = new boolean[i12];
            this.f45581m = new boolean[i12];
        }
    }

    public void f() {
        this.f45573e = 0;
        this.f45585q = 0L;
        this.f45586r = false;
        this.f45580l = false;
        this.f45584p = false;
        this.f45582n = null;
    }

    public boolean g(int i10) {
        return this.f45580l && this.f45581m[i10];
    }
}
