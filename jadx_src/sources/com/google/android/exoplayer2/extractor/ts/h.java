package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements com.google.android.exoplayer2.extractor.k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.q f45796p = new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.extractor.ts.g
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return h.i();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f45797q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f45798r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f45799s = 2048;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f45800t = 8192;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f45801u = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f45803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.d0 f45806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.m f45807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f45808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f45811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f45812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f45813o;

    /* JADX INFO: compiled from: AdtsExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public h() {
        this(0);
    }

    public h(int i10) {
        this.f45802d = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f45803e = new i(true);
        this.f45804f = new com.google.android.exoplayer2.util.e0(2048);
        this.f45810l = -1;
        this.f45809k = -1L;
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(10);
        this.f45805g = e0Var;
        this.f45806h = new com.google.android.exoplayer2.util.d0(e0Var.d());
    }

    private void d(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        if (this.f45811m) {
            return;
        }
        this.f45810l = -1;
        lVar.o();
        long j10 = 0;
        if (lVar.getPosition() == 0) {
            k(lVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (lVar.n(this.f45805g.d(), 0, 2, true)) {
                    this.f45805g.S(0);
                    if (!i.m(this.f45805g.M())) {
                        break;
                    }
                    if (lVar.n(this.f45805g.d(), 0, 4, true)) {
                        this.f45806h.q(14);
                        int iH = this.f45806h.h(13);
                        if (iH <= 6) {
                            this.f45811m = true;
                            throw ParserException.a("Malformed ADTS stream", null);
                        }
                        j10 += (long) iH;
                        i11++;
                        if (i11 != 1000 && lVar.u(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        lVar.o();
        if (i10 > 0) {
            this.f45810l = (int) (j10 / ((long) i10));
        } else {
            this.f45810l = -1;
        }
        this.f45811m = true;
    }

    private static int e(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    private com.google.android.exoplayer2.extractor.b0 h(long j10, boolean z10) {
        return new com.google.android.exoplayer2.extractor.f(j10, this.f45809k, e(this.f45810l, this.f45803e.k()), this.f45810l, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] i() {
        return new com.google.android.exoplayer2.extractor.k[]{new h()};
    }

    @mk.m({"extractorOutput"})
    private void j(long j10, boolean z10) {
        if (this.f45813o) {
            return;
        }
        boolean z11 = (this.f45802d & 1) != 0 && this.f45810l > 0;
        if (z11 && this.f45803e.k() == com.google.android.exoplayer2.j.f46377b && !z10) {
            return;
        }
        if (!z11 || this.f45803e.k() == com.google.android.exoplayer2.j.f46377b) {
            this.f45807i.t(new com.google.android.exoplayer2.extractor.b0.b(com.google.android.exoplayer2.j.f46377b));
        } else {
            this.f45807i.t(h(j10, (this.f45802d & 2) != 0));
        }
        this.f45813o = true;
    }

    private int k(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int i10 = 0;
        while (true) {
            lVar.l(this.f45805g.d(), 0, 10);
            this.f45805g.S(0);
            if (this.f45805g.J() != 4801587) {
                break;
            }
            this.f45805g.T(3);
            int iF = this.f45805g.F();
            i10 += iF + 10;
            lVar.s(iF);
        }
        lVar.o();
        lVar.s(i10);
        if (this.f45809k == -1) {
            this.f45809k = i10;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f45812n = false;
        this.f45803e.b();
        this.f45808j = j11;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f45807i = mVar;
        this.f45803e.f(mVar, new i0.e(0, 1));
        mVar.n();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int iK = k(lVar);
        int i10 = iK;
        int i11 = 0;
        int i12 = 0;
        do {
            lVar.l(this.f45805g.d(), 0, 2);
            this.f45805g.S(0);
            if (i.m(this.f45805g.M())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.l(this.f45805g.d(), 0, 4);
                this.f45806h.q(14);
                int iH = this.f45806h.h(13);
                if (iH <= 6) {
                    i10++;
                    lVar.o();
                    lVar.s(i10);
                } else {
                    lVar.s(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                lVar.o();
                lVar.s(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iK < 8192);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        com.google.android.exoplayer2.util.a.k(this.f45807i);
        long length = lVar.getLength();
        int i10 = this.f45802d;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || length == -1)) ? false : true) {
            d(lVar);
        }
        int i11 = lVar.read(this.f45804f.d(), 0, 2048);
        boolean z10 = i11 == -1;
        j(length, z10);
        if (z10) {
            return -1;
        }
        this.f45804f.S(0);
        this.f45804f.R(i11);
        if (!this.f45812n) {
            this.f45803e.e(this.f45808j, 4);
            this.f45812n = true;
        }
        this.f45803e.c(this.f45804f);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
