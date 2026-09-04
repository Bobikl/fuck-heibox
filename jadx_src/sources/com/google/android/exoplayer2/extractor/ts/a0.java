package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.n0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements com.google.android.exoplayer2.extractor.k {
    public static final int A = 240;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.q f45691o = new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.extractor.ts.z
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return a0.d();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f45692p = 442;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f45693q = 443;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f45694r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f45695s = 441;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f45696t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f45697u = 1048576;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f45698v = 8192;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f45699w = 189;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f45700x = 192;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f45701y = 224;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f45702z = 224;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0 f45703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<a> f45704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y f45706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f45709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private x f45711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.m f45712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f45713n;

    /* JADX INFO: compiled from: PsExtractor.java */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45714i = 64;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f45715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n0 f45716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.d0 f45717c = new com.google.android.exoplayer2.util.d0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f45718d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f45719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f45720f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f45721g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f45722h;

        public a(m mVar, n0 n0Var) {
            this.f45715a = mVar;
            this.f45716b = n0Var;
        }

        private void b() {
            this.f45717c.s(8);
            this.f45718d = this.f45717c.g();
            this.f45719e = this.f45717c.g();
            this.f45717c.s(6);
            this.f45721g = this.f45717c.h(8);
        }

        private void c() {
            this.f45722h = 0L;
            if (this.f45718d) {
                this.f45717c.s(4);
                long jH = ((long) this.f45717c.h(3)) << 30;
                this.f45717c.s(1);
                long jH2 = jH | ((long) (this.f45717c.h(15) << 15));
                this.f45717c.s(1);
                long jH3 = jH2 | ((long) this.f45717c.h(15));
                this.f45717c.s(1);
                if (!this.f45720f && this.f45719e) {
                    this.f45717c.s(4);
                    long jH4 = ((long) this.f45717c.h(3)) << 30;
                    this.f45717c.s(1);
                    long jH5 = jH4 | ((long) (this.f45717c.h(15) << 15));
                    this.f45717c.s(1);
                    long jH6 = jH5 | ((long) this.f45717c.h(15));
                    this.f45717c.s(1);
                    this.f45716b.b(jH6);
                    this.f45720f = true;
                }
                this.f45722h = this.f45716b.b(jH3);
            }
        }

        public void a(com.google.android.exoplayer2.util.e0 e0Var) throws ParserException {
            e0Var.k(this.f45717c.f51383a, 0, 3);
            this.f45717c.q(0);
            b();
            e0Var.k(this.f45717c.f51383a, 0, this.f45721g);
            this.f45717c.q(0);
            c();
            this.f45715a.e(this.f45722h, 4);
            this.f45715a.c(e0Var);
            this.f45715a.d();
        }

        public void d() {
            this.f45720f = false;
            this.f45715a.b();
        }
    }

    public a0() {
        this(new n0(0L));
    }

    public a0(n0 n0Var) {
        this.f45703d = n0Var;
        this.f45705f = new com.google.android.exoplayer2.util.e0(4096);
        this.f45704e = new SparseArray<>();
        this.f45706g = new y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] d() {
        return new com.google.android.exoplayer2.extractor.k[]{new a0()};
    }

    @mk.m({"output"})
    private void e(long j10) {
        if (this.f45713n) {
            return;
        }
        this.f45713n = true;
        if (this.f45706g.c() == com.google.android.exoplayer2.j.f46377b) {
            this.f45712m.t(new com.google.android.exoplayer2.extractor.b0.b(this.f45706g.c()));
            return;
        }
        x xVar = new x(this.f45706g.d(), this.f45706g.c(), j10);
        this.f45711l = xVar;
        this.f45712m.t(xVar.b());
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        boolean z10 = this.f45703d.e() == com.google.android.exoplayer2.j.f46377b;
        if (!z10) {
            long jC = this.f45703d.c();
            z10 = (jC == com.google.android.exoplayer2.j.f46377b || jC == 0 || jC == j11) ? false : true;
        }
        if (z10) {
            this.f45703d.g(j11);
        }
        x xVar = this.f45711l;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f45704e.size(); i10++) {
            this.f45704e.valueAt(i10).d();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f45712m = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        byte[] bArr = new byte[14];
        lVar.l(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.s(bArr[13] & 7);
        lVar.l(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        com.google.android.exoplayer2.util.a.k(this.f45712m);
        long length = lVar.getLength();
        if ((length != -1) && !this.f45706g.e()) {
            return this.f45706g.g(lVar, zVar);
        }
        e(length);
        x xVar = this.f45711l;
        if (xVar != null && xVar.d()) {
            return this.f45711l.c(lVar, zVar);
        }
        lVar.o();
        long jQ = length != -1 ? length - lVar.q() : -1L;
        if ((jQ != -1 && jQ < 4) || !lVar.n(this.f45705f.d(), 0, 4, true)) {
            return -1;
        }
        this.f45705f.S(0);
        int iO = this.f45705f.o();
        if (iO == 441) {
            return -1;
        }
        if (iO == 442) {
            lVar.l(this.f45705f.d(), 0, 10);
            this.f45705f.S(9);
            lVar.t((this.f45705f.G() & 7) + 14);
            return 0;
        }
        if (iO == 443) {
            lVar.l(this.f45705f.d(), 0, 2);
            this.f45705f.S(0);
            lVar.t(this.f45705f.M() + 6);
            return 0;
        }
        if (((iO & androidx.core.view.o.f21773u) >> 8) != 1) {
            lVar.t(1);
            return 0;
        }
        int i10 = iO & 255;
        a aVar = this.f45704e.get(i10);
        if (!this.f45707h) {
            if (aVar == null) {
                m nVar = null;
                if (i10 == 189) {
                    nVar = new c();
                    this.f45708i = true;
                    this.f45710k = lVar.getPosition();
                } else if ((i10 & 224) == 192) {
                    nVar = new t();
                    this.f45708i = true;
                    this.f45710k = lVar.getPosition();
                } else if ((i10 & 240) == 224) {
                    nVar = new n();
                    this.f45709j = true;
                    this.f45710k = lVar.getPosition();
                }
                if (nVar != null) {
                    nVar.f(this.f45712m, new i0.e(i10, 256));
                    aVar = new a(nVar, this.f45703d);
                    this.f45704e.put(i10, aVar);
                }
            }
            if (lVar.getPosition() > ((this.f45708i && this.f45709j) ? this.f45710k + 8192 : 1048576L)) {
                this.f45707h = true;
                this.f45712m.n();
            }
        }
        lVar.l(this.f45705f.d(), 0, 2);
        this.f45705f.S(0);
        int iM = this.f45705f.M() + 6;
        if (aVar == null) {
            lVar.t(iM);
        } else {
            this.f45705f.O(iM);
            lVar.readFully(this.f45705f.d(), 0, iM);
            this.f45705f.S(6);
            aVar.a(this.f45705f);
            com.google.android.exoplayer2.util.e0 e0Var = this.f45705f;
            e0Var.R(e0Var.b());
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
