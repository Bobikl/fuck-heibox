package com.google.android.exoplayer2.extractor.flv;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.e0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements k {
    private static final int A = 8;
    private static final int B = 9;
    private static final int C = 18;
    private static final int D = 4607062;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f44938t = new q() { // from class: com.google.android.exoplayer2.extractor.flv.b
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final k[] b() {
            return c.h();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f44939u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f44940v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f44941w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f44942x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f44943y = 9;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f44944z = 11;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m f44950i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f44953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f44956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f44957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f44958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f44959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f44960s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f44945d = new e0(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e0 f44946e = new e0(9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0 f44947f = new e0(11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0 f44948g = new e0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f44949h = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44951j = 1;

    @mk.m({"extractorOutput"})
    private void d() {
        if (this.f44958q) {
            return;
        }
        this.f44950i.t(new b0.b(j.f46377b));
        this.f44958q = true;
    }

    private long e() {
        if (this.f44952k) {
            return this.f44953l + this.f44957p;
        }
        if (this.f44949h.e() == j.f46377b) {
            return 0L;
        }
        return this.f44957p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] h() {
        return new k[]{new c()};
    }

    private e0 i(l lVar) throws IOException {
        if (this.f44956o > this.f44948g.b()) {
            e0 e0Var = this.f44948g;
            e0Var.Q(new byte[Math.max(e0Var.b() * 2, this.f44956o)], 0);
        } else {
            this.f44948g.S(0);
        }
        this.f44948g.R(this.f44956o);
        lVar.readFully(this.f44948g.d(), 0, this.f44956o);
        return this.f44948g;
    }

    @mk.m({"extractorOutput"})
    private boolean j(l lVar) throws IOException {
        if (!lVar.g(this.f44946e.d(), 0, 9, true)) {
            return false;
        }
        this.f44946e.S(0);
        this.f44946e.T(4);
        int iG = this.f44946e.G();
        boolean z10 = (iG & 4) != 0;
        boolean z11 = (iG & 1) != 0;
        if (z10 && this.f44959r == null) {
            this.f44959r = new a(this.f44950i.b(8, 1));
        }
        if (z11 && this.f44960s == null) {
            this.f44960s = new e(this.f44950i.b(9, 2));
        }
        this.f44950i.n();
        this.f44954m = (this.f44946e.o() - 9) + 4;
        this.f44951j = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @mk.m({"extractorOutput"})
    private boolean k(l lVar) throws IOException {
        boolean z10;
        long j10;
        long jE = e();
        int i10 = this.f44955n;
        boolean zA = false;
        if (i10 == 8 && this.f44959r != null) {
            d();
            zA = this.f44959r.a(i(lVar), jE);
        } else {
            if (i10 != 9 || this.f44960s == null) {
                if (i10 != 18 || this.f44958q) {
                    lVar.t(this.f44956o);
                    z10 = false;
                } else {
                    zA = this.f44949h.a(i(lVar), jE);
                    long jE2 = this.f44949h.e();
                    if (jE2 != j.f46377b) {
                        this.f44950i.t(new y(this.f44949h.f(), this.f44949h.g(), jE2));
                        this.f44958q = true;
                    }
                }
                if (!this.f44952k && zA) {
                    this.f44952k = true;
                    if (this.f44949h.e() == j.f46377b) {
                        j10 = -this.f44957p;
                    } else {
                        j10 = 0;
                    }
                    this.f44953l = j10;
                }
                this.f44954m = 4;
                this.f44951j = 2;
                return z10;
            }
            d();
            zA = this.f44960s.a(i(lVar), jE);
        }
        z10 = true;
        if (!this.f44952k) {
            this.f44952k = true;
            if (this.f44949h.e() == j.f46377b) {
                j10 = -this.f44957p;
            } else {
                j10 = 0;
            }
            this.f44953l = j10;
        }
        this.f44954m = 4;
        this.f44951j = 2;
        return z10;
    }

    private boolean l(l lVar) throws IOException {
        if (!lVar.g(this.f44947f.d(), 0, 11, true)) {
            return false;
        }
        this.f44947f.S(0);
        this.f44955n = this.f44947f.G();
        this.f44956o = this.f44947f.J();
        this.f44957p = this.f44947f.J();
        this.f44957p = (((long) (this.f44947f.G() << 24)) | this.f44957p) * 1000;
        this.f44947f.T(3);
        this.f44951j = 4;
        return true;
    }

    private void m(l lVar) throws IOException {
        lVar.t(this.f44954m);
        this.f44954m = 0;
        this.f44951j = 3;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f44951j = 1;
            this.f44952k = false;
        } else {
            this.f44951j = 3;
        }
        this.f44954m = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(m mVar) {
        this.f44950i = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        lVar.l(this.f44945d.d(), 0, 3);
        this.f44945d.S(0);
        if (this.f44945d.J() != D) {
            return false;
        }
        lVar.l(this.f44945d.d(), 0, 2);
        this.f44945d.S(0);
        if ((this.f44945d.M() & 250) != 0) {
            return false;
        }
        lVar.l(this.f44945d.d(), 0, 4);
        this.f44945d.S(0);
        int iO = this.f44945d.o();
        lVar.o();
        lVar.s(iO);
        lVar.l(this.f44945d.d(), 0, 4);
        this.f44945d.S(0);
        return this.f44945d.o() == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        com.google.android.exoplayer2.util.a.k(this.f44950i);
        while (true) {
            int i10 = this.f44951j;
            if (i10 != 1) {
                if (i10 == 2) {
                    m(lVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (k(lVar)) {
                        return 0;
                    }
                } else if (!l(lVar)) {
                    return -1;
                }
            } else if (!j(lVar)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
