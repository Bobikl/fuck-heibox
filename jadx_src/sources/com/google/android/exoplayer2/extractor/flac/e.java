package com.google.android.exoplayer2.extractor.flac;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.extractor.s;
import com.google.android.exoplayer2.extractor.t;
import com.google.android.exoplayer2.extractor.u;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements k {
    private static final int A = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f44904r = new q() { // from class: com.google.android.exoplayer2.extractor.flac.d
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final k[] b() {
            return e.j();
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f44905s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f44906t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f44907u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f44908v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f44909w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f44910x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f44911y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f44912z = 32768;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f44913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e0 f44914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f44915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r.a f44916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f44917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f44918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private Metadata f44920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private u f44921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f44924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f44925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f44926q;

    /* JADX INFO: compiled from: FlacExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this.f44913d = new byte[42];
        this.f44914e = new e0(new byte[32768], 0);
        this.f44915f = (i10 & 1) != 0;
        this.f44916g = new r.a();
        this.f44919j = 0;
    }

    private long d(e0 e0Var, boolean z10) {
        boolean zD;
        com.google.android.exoplayer2.util.a.g(this.f44921l);
        int iE = e0Var.e();
        while (iE <= e0Var.f() - 16) {
            e0Var.S(iE);
            if (r.d(e0Var, this.f44921l, this.f44923n, this.f44916g)) {
                e0Var.S(iE);
                return this.f44916g.f45684a;
            }
            iE++;
        }
        if (!z10) {
            e0Var.S(iE);
            return -1L;
        }
        while (iE <= e0Var.f() - this.f44922m) {
            e0Var.S(iE);
            try {
                zD = r.d(e0Var, this.f44921l, this.f44923n, this.f44916g);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (e0Var.e() <= e0Var.f() ? zD : false) {
                e0Var.S(iE);
                return this.f44916g.f45684a;
            }
            iE++;
        }
        e0Var.S(e0Var.f());
        return -1L;
    }

    private void e(l lVar) throws IOException {
        this.f44923n = s.b(lVar);
        ((m) u0.k(this.f44917h)).t(h(lVar.getPosition(), lVar.getLength()));
        this.f44919j = 5;
    }

    private b0 h(long j10, long j11) {
        com.google.android.exoplayer2.util.a.g(this.f44921l);
        u uVar = this.f44921l;
        if (uVar.f46203k != null) {
            return new t(uVar, j10);
        }
        if (j11 == -1 || uVar.f46202j <= 0) {
            return new b0.b(uVar.h());
        }
        b bVar = new b(uVar, this.f44923n, j10, j11);
        this.f44924o = bVar;
        return bVar.b();
    }

    private void i(l lVar) throws IOException {
        byte[] bArr = this.f44913d;
        lVar.l(bArr, 0, bArr.length);
        lVar.o();
        this.f44919j = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] j() {
        return new k[]{new e()};
    }

    private void k() {
        ((com.google.android.exoplayer2.extractor.e0) u0.k(this.f44918i)).e((this.f44926q * 1000000) / ((long) ((u) u0.k(this.f44921l)).f46197e), 1, this.f44925p, 0, null);
    }

    private int l(l lVar, z zVar) throws IOException {
        boolean z10;
        com.google.android.exoplayer2.util.a.g(this.f44918i);
        com.google.android.exoplayer2.util.a.g(this.f44921l);
        b bVar = this.f44924o;
        if (bVar != null && bVar.d()) {
            return this.f44924o.c(lVar, zVar);
        }
        if (this.f44926q == -1) {
            this.f44926q = r.i(lVar, this.f44921l);
            return 0;
        }
        int iF = this.f44914e.f();
        if (iF < 32768) {
            int i10 = lVar.read(this.f44914e.d(), iF, 32768 - iF);
            z10 = i10 == -1;
            if (!z10) {
                this.f44914e.R(iF + i10);
            } else if (this.f44914e.a() == 0) {
                k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iE = this.f44914e.e();
        int i11 = this.f44925p;
        int i12 = this.f44922m;
        if (i11 < i12) {
            e0 e0Var = this.f44914e;
            e0Var.T(Math.min(i12 - i11, e0Var.a()));
        }
        long jD = d(this.f44914e, z10);
        int iE2 = this.f44914e.e() - iE;
        this.f44914e.S(iE);
        this.f44918i.c(this.f44914e, iE2);
        this.f44925p += iE2;
        if (jD != -1) {
            k();
            this.f44925p = 0;
            this.f44926q = jD;
        }
        if (this.f44914e.a() < 16) {
            int iA = this.f44914e.a();
            System.arraycopy(this.f44914e.d(), this.f44914e.e(), this.f44914e.d(), 0, iA);
            this.f44914e.S(0);
            this.f44914e.R(iA);
        }
        return 0;
    }

    private void m(l lVar) throws IOException {
        this.f44920k = s.d(lVar, !this.f44915f);
        this.f44919j = 1;
    }

    private void n(l lVar) throws IOException {
        s.a aVar = new s.a(this.f44921l);
        boolean zE = false;
        while (!zE) {
            zE = s.e(lVar, aVar);
            this.f44921l = (u) u0.k(aVar.f45688a);
        }
        com.google.android.exoplayer2.util.a.g(this.f44921l);
        this.f44922m = Math.max(this.f44921l.f46195c, 6);
        ((com.google.android.exoplayer2.extractor.e0) u0.k(this.f44918i)).d(this.f44921l.i(this.f44913d, this.f44920k));
        this.f44919j = 4;
    }

    private void o(l lVar) throws IOException {
        s.j(lVar);
        this.f44919j = 3;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f44919j = 0;
        } else {
            b bVar = this.f44924o;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f44926q = j11 != 0 ? -1L : 0L;
        this.f44925p = 0;
        this.f44914e.O(0);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(m mVar) {
        this.f44917h = mVar;
        this.f44918i = mVar.b(0, 1);
        mVar.n();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        s.c(lVar, false);
        return s.a(lVar);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        int i10 = this.f44919j;
        if (i10 == 0) {
            m(lVar);
            return 0;
        }
        if (i10 == 1) {
            i(lVar);
            return 0;
        }
        if (i10 == 2) {
            o(lVar);
            return 0;
        }
        if (i10 == 3) {
            n(lVar);
            return 0;
        }
        if (i10 == 4) {
            e(lVar);
            return 0;
        }
        if (i10 == 5) {
            return l(lVar, zVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
