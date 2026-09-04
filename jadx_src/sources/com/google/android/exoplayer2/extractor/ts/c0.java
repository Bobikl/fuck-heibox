package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements i0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45746j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f45747k = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45748l = 4098;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f45749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45750e = new com.google.android.exoplayer2.util.e0(32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45754i;

    public c0(b0 b0Var) {
        this.f45749d = b0Var;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0
    public void a(n0 n0Var, com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        this.f45749d.a(n0Var, mVar, eVar);
        this.f45754i = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0
    public void b() {
        this.f45754i = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0
    public void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        int iE;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iE = e0Var.e() + e0Var.G();
        } else {
            iE = -1;
        }
        if (this.f45754i) {
            if (!z10) {
                return;
            }
            this.f45754i = false;
            e0Var.S(iE);
            this.f45752g = 0;
        }
        while (e0Var.a() > 0) {
            int i11 = this.f45752g;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iG = e0Var.G();
                    e0Var.S(e0Var.e() - 1);
                    if (iG == 255) {
                        this.f45754i = true;
                        return;
                    }
                }
                int iMin = Math.min(e0Var.a(), 3 - this.f45752g);
                e0Var.k(this.f45750e.d(), this.f45752g, iMin);
                int i12 = this.f45752g + iMin;
                this.f45752g = i12;
                if (i12 == 3) {
                    this.f45750e.S(0);
                    this.f45750e.R(3);
                    this.f45750e.T(1);
                    int iG2 = this.f45750e.G();
                    int iG3 = this.f45750e.G();
                    this.f45753h = (iG2 & 128) != 0;
                    this.f45751f = (((iG2 & 15) << 8) | iG3) + 3;
                    int iB = this.f45750e.b();
                    int i13 = this.f45751f;
                    if (iB < i13) {
                        this.f45750e.c(Math.min(4098, Math.max(i13, this.f45750e.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(e0Var.a(), this.f45751f - this.f45752g);
                e0Var.k(this.f45750e.d(), this.f45752g, iMin2);
                int i14 = this.f45752g + iMin2;
                this.f45752g = i14;
                int i15 = this.f45751f;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f45753h) {
                        this.f45750e.R(i15);
                    } else {
                        if (u0.v(this.f45750e.d(), 0, this.f45751f, -1) != 0) {
                            this.f45754i = true;
                            return;
                        }
                        this.f45750e.R(this.f45751f - 4);
                    }
                    this.f45750e.S(0);
                    this.f45749d.c(this.f45750e);
                    this.f45752g = 0;
                }
            }
        }
    }
}
