package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements c0, com.google.android.exoplayer2.extractor.m, Loader.b<a>, Loader.f, c1.d {
    private static final long N = 10000;
    private static final Map<String, String> O = L();
    private static final a2 P = new a2.b().S("icy").e0(com.google.android.exoplayer2.util.y.F0).E();
    private boolean B;
    private boolean D;
    private boolean E;
    private int F;
    private long H;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f49190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f49191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.u f49192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g0 f49193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0.a f49194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.s.a f49195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f49196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f49197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f49198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f49199k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r0 f49201m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private c0.a f49206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private IcyHeaders f49207s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f49210v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f49211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f49212x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e f49213y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.b0 f49214z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Loader f49200l = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.h f49202n = new com.google.android.exoplayer2.util.h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f49203o = new Runnable() { // from class: com.google.android.exoplayer2.source.s0
        @Override // java.lang.Runnable
        public final void run() {
            this.f49003b.T();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f49204p = new Runnable() { // from class: com.google.android.exoplayer2.source.t0
        @Override // java.lang.Runnable
        public final void run() {
            this.f49171b.R();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f49205q = com.google.android.exoplayer2.util.u0.y();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d[] f49209u = new d[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c1[] f49208t = new c1[0];
    private long I = com.google.android.exoplayer2.j.f46377b;
    private long G = -1;
    private long A = com.google.android.exoplayer2.j.f46377b;
    private int C = 1;

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class a implements Loader.e, t.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f49216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.r0 f49217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final r0 f49218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.m f49219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.h f49220f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f49222h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f49224j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.extractor.e0 f49227m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f49228n;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.z f49221g = new com.google.android.exoplayer2.extractor.z();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f49223i = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f49226l = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f49215a = u.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.r f49225k = j(0);

        public a(Uri uri, com.google.android.exoplayer2.upstream.o oVar, r0 r0Var, com.google.android.exoplayer2.extractor.m mVar, com.google.android.exoplayer2.util.h hVar) {
            this.f49216b = uri;
            this.f49217c = new com.google.android.exoplayer2.upstream.r0(oVar);
            this.f49218d = r0Var;
            this.f49219e = mVar;
            this.f49220f = hVar;
        }

        private com.google.android.exoplayer2.upstream.r j(long j10) {
            return new com.google.android.exoplayer2.upstream.r.b().j(this.f49216b).i(j10).g(v0.this.f49198j).c(6).f(v0.O).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(long j10, long j11) {
            this.f49221g.f46218a = j10;
            this.f49224j = j11;
            this.f49223i = true;
            this.f49228n = false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() throws IOException {
            int iB = 0;
            while (iB == 0 && !this.f49222h) {
                try {
                    long j10 = this.f49221g.f46218a;
                    com.google.android.exoplayer2.upstream.r rVarJ = j(j10);
                    this.f49225k = rVarJ;
                    long jA = this.f49217c.a(rVarJ);
                    this.f49226l = jA;
                    if (jA != -1) {
                        this.f49226l = jA + j10;
                    }
                    v0.this.f49207s = IcyHeaders.a(this.f49217c.b());
                    com.google.android.exoplayer2.upstream.k tVar = this.f49217c;
                    if (v0.this.f49207s != null && v0.this.f49207s.f46877g != -1) {
                        tVar = new t(this.f49217c, v0.this.f49207s.f46877g, this);
                        com.google.android.exoplayer2.extractor.e0 e0VarO = v0.this.O();
                        this.f49227m = e0VarO;
                        e0VarO.d(v0.P);
                    }
                    long jC = j10;
                    this.f49218d.e(tVar, this.f49216b, this.f49217c.b(), j10, this.f49226l, this.f49219e);
                    if (v0.this.f49207s != null) {
                        this.f49218d.d();
                    }
                    if (this.f49223i) {
                        this.f49218d.a(jC, this.f49224j);
                        this.f49223i = false;
                    }
                    while (true) {
                        long j11 = jC;
                        while (true) {
                            if (iB != 0 || this.f49222h) {
                                break;
                            }
                            try {
                                this.f49220f.a();
                                iB = this.f49218d.b(this.f49221g);
                                jC = this.f49218d.c();
                                if (jC > v0.this.f49199k + j11) {
                                    this.f49220f.d();
                                    v0.this.f49205q.post(v0.this.f49204p);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iB == 1) {
                        iB = 0;
                    } else if (this.f49218d.c() != -1) {
                        this.f49221g.f46218a = this.f49218d.c();
                    }
                    com.google.android.exoplayer2.upstream.q.a(this.f49217c);
                } catch (Throwable th2) {
                    if (iB != 1 && this.f49218d.c() != -1) {
                        this.f49221g.f46218a = this.f49218d.c();
                    }
                    com.google.android.exoplayer2.upstream.q.a(this.f49217c);
                    throw th2;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.t.a
        public void b(com.google.android.exoplayer2.util.e0 e0Var) {
            long jMax = !this.f49228n ? this.f49224j : Math.max(v0.this.N(), this.f49224j);
            int iA = e0Var.a();
            com.google.android.exoplayer2.extractor.e0 e0Var2 = (com.google.android.exoplayer2.extractor.e0) com.google.android.exoplayer2.util.a.g(this.f49227m);
            e0Var2.c(e0Var, iA);
            e0Var2.e(jMax, 1, iA, 0, null);
            this.f49228n = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
            this.f49222h = true;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public interface b {
        void n(long j10, boolean z10, boolean z11);
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class c implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f49230b;

        public c(int i10) {
            this.f49230b = i10;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() throws IOException {
            v0.this.X(this.f49230b);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            return v0.this.c0(this.f49230b, b2Var, decoderInputBuffer, i10);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return v0.this.Q(this.f49230b);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            return v0.this.g0(this.f49230b, j10);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49233b;

        public d(int i10, boolean z10) {
            this.f49232a = i10;
            this.f49233b = z10;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f49232a == dVar.f49232a && this.f49233b == dVar.f49233b;
        }

        public int hashCode() {
            return (this.f49232a * 31) + (this.f49233b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1 f49234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f49235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f49236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f49237d;

        public e(p1 p1Var, boolean[] zArr) {
            this.f49234a = p1Var;
            this.f49235b = zArr;
            int i10 = p1Var.f48609b;
            this.f49236c = new boolean[i10];
            this.f49237d = new boolean[i10];
        }
    }

    public v0(Uri uri, com.google.android.exoplayer2.upstream.o oVar, r0 r0Var, com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.drm.s.a aVar, com.google.android.exoplayer2.upstream.g0 g0Var, n0.a aVar2, b bVar, com.google.android.exoplayer2.upstream.b bVar2, @androidx.annotation.p0 String str, int i10) {
        this.f49190b = uri;
        this.f49191c = oVar;
        this.f49192d = uVar;
        this.f49195g = aVar;
        this.f49193e = g0Var;
        this.f49194f = aVar2;
        this.f49196h = bVar;
        this.f49197i = bVar2;
        this.f49198j = str;
        this.f49199k = i10;
        this.f49201m = r0Var;
    }

    @mk.d({"trackState", "seekMap"})
    private void I() {
        com.google.android.exoplayer2.util.a.i(this.f49211w);
        com.google.android.exoplayer2.util.a.g(this.f49213y);
        com.google.android.exoplayer2.util.a.g(this.f49214z);
    }

    private boolean J(a aVar, int i10) {
        com.google.android.exoplayer2.extractor.b0 b0Var;
        if (this.G != -1 || ((b0Var = this.f49214z) != null && b0Var.i() != com.google.android.exoplayer2.j.f46377b)) {
            this.K = i10;
            return true;
        }
        if (this.f49211w && !i0()) {
            this.J = true;
            return false;
        }
        this.E = this.f49211w;
        this.H = 0L;
        this.K = 0;
        for (c1 c1Var : this.f49208t) {
            c1Var.W();
        }
        aVar.k(0L, 0L);
        return true;
    }

    private void K(a aVar) {
        if (this.G == -1) {
            this.G = aVar.f49226l;
        }
    }

    private static Map<String, String> L() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.f46863h, "1");
        return Collections.unmodifiableMap(map);
    }

    private int M() {
        int iH = 0;
        for (c1 c1Var : this.f49208t) {
            iH += c1Var.H();
        }
        return iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long N() {
        long jMax = Long.MIN_VALUE;
        for (c1 c1Var : this.f49208t) {
            jMax = Math.max(jMax, c1Var.A());
        }
        return jMax;
    }

    private boolean P() {
        return this.I != com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        if (this.M) {
            return;
        }
        ((c0.a) com.google.android.exoplayer2.util.a.g(this.f49206r)).n(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.M || this.f49211w || !this.f49210v || this.f49214z == null) {
            return;
        }
        for (c1 c1Var : this.f49208t) {
            if (c1Var.G() == null) {
                return;
            }
        }
        this.f49202n.d();
        int length = this.f49208t.length;
        n1[] n1VarArr = new n1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            a2 a2VarE = (a2) com.google.android.exoplayer2.util.a.g(this.f49208t[i10].G());
            String str = a2VarE.f43593m;
            boolean zP = com.google.android.exoplayer2.util.y.p(str);
            boolean z10 = zP || com.google.android.exoplayer2.util.y.t(str);
            zArr[i10] = z10;
            this.f49212x = z10 | this.f49212x;
            IcyHeaders icyHeaders = this.f49207s;
            if (icyHeaders != null) {
                if (zP || this.f49209u[i10].f49233b) {
                    Metadata metadata = a2VarE.f43591k;
                    a2VarE = a2VarE.c().X(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders)).E();
                }
                if (zP && a2VarE.f43587g == -1 && a2VarE.f43588h == -1 && icyHeaders.f46872b != -1) {
                    a2VarE = a2VarE.c().G(icyHeaders.f46872b).E();
                }
            }
            n1VarArr[i10] = new n1(a2VarE.e(this.f49192d.b(a2VarE)));
        }
        this.f49213y = new e(new p1(n1VarArr), zArr);
        this.f49211w = true;
        ((c0.a) com.google.android.exoplayer2.util.a.g(this.f49206r)).q(this);
    }

    private void U(int i10) {
        I();
        e eVar = this.f49213y;
        boolean[] zArr = eVar.f49237d;
        if (zArr[i10]) {
            return;
        }
        a2 a2VarC = eVar.f49234a.c(i10).c(0);
        this.f49194f.i(com.google.android.exoplayer2.util.y.l(a2VarC.f43593m), a2VarC, 0, null, this.H);
        zArr[i10] = true;
    }

    private void V(int i10) {
        I();
        boolean[] zArr = this.f49213y.f49235b;
        if (this.J && zArr[i10]) {
            if (this.f49208t[i10].L(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (c1 c1Var : this.f49208t) {
                c1Var.W();
            }
            ((c0.a) com.google.android.exoplayer2.util.a.g(this.f49206r)).n(this);
        }
    }

    private com.google.android.exoplayer2.extractor.e0 b0(d dVar) {
        int length = this.f49208t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f49209u[i10])) {
                return this.f49208t[i10];
            }
        }
        c1 c1VarK = c1.k(this.f49197i, this.f49205q.getLooper(), this.f49192d, this.f49195g);
        c1VarK.e0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f49209u, i11);
        dVarArr[length] = dVar;
        this.f49209u = (d[]) com.google.android.exoplayer2.util.u0.l(dVarArr);
        c1[] c1VarArr = (c1[]) Arrays.copyOf(this.f49208t, i11);
        c1VarArr[length] = c1VarK;
        this.f49208t = (c1[]) com.google.android.exoplayer2.util.u0.l(c1VarArr);
        return c1VarK;
    }

    private boolean e0(boolean[] zArr, long j10) {
        int length = this.f49208t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f49208t[i10].a0(j10, false) && (zArr[i10] || !this.f49212x)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void S(com.google.android.exoplayer2.extractor.b0 b0Var) {
        this.f49214z = this.f49207s == null ? b0Var : new com.google.android.exoplayer2.extractor.b0.b(com.google.android.exoplayer2.j.f46377b);
        this.A = b0Var.i();
        boolean z10 = this.G == -1 && b0Var.i() == com.google.android.exoplayer2.j.f46377b;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        this.f49196h.n(this.A, b0Var.e(), this.B);
        if (this.f49211w) {
            return;
        }
        T();
    }

    private void h0() {
        a aVar = new a(this.f49190b, this.f49191c, this.f49201m, this, this.f49202n);
        if (this.f49211w) {
            com.google.android.exoplayer2.util.a.i(P());
            long j10 = this.A;
            if (j10 != com.google.android.exoplayer2.j.f46377b && this.I > j10) {
                this.L = true;
                this.I = com.google.android.exoplayer2.j.f46377b;
                return;
            }
            aVar.k(((com.google.android.exoplayer2.extractor.b0) com.google.android.exoplayer2.util.a.g(this.f49214z)).d(this.I).f44847a.f44856b, this.I);
            for (c1 c1Var : this.f49208t) {
                c1Var.c0(this.I);
            }
            this.I = com.google.android.exoplayer2.j.f46377b;
        }
        this.K = M();
        this.f49194f.A(new u(aVar.f49215a, aVar.f49225k, this.f49200l.n(aVar, this, this.f49193e.d(this.C))), 1, -1, null, 0, null, aVar.f49224j, this.A);
    }

    private boolean i0() {
        return this.E || P();
    }

    com.google.android.exoplayer2.extractor.e0 O() {
        return b0(new d(0, true));
    }

    boolean Q(int i10) {
        return !i0() && this.f49208t[i10].L(this.L);
    }

    void W() throws IOException {
        this.f49200l.a(this.f49193e.d(this.C));
    }

    void X(int i10) throws IOException {
        this.f49208t[i10].O();
        W();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void p(a aVar, long j10, long j11, boolean z10) {
        com.google.android.exoplayer2.upstream.r0 r0Var = aVar.f49217c;
        u uVar = new u(aVar.f49215a, aVar.f49225k, r0Var.w(), r0Var.x(), j10, j11, r0Var.p());
        this.f49193e.c(aVar.f49215a);
        this.f49194f.r(uVar, 1, -1, null, 0, null, aVar.f49224j, this.A);
        if (z10) {
            return;
        }
        K(aVar);
        for (c1 c1Var : this.f49208t) {
            c1Var.W();
        }
        if (this.F > 0) {
            ((c0.a) com.google.android.exoplayer2.util.a.g(this.f49206r)).n(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void q(a aVar, long j10, long j11) {
        com.google.android.exoplayer2.extractor.b0 b0Var;
        if (this.A == com.google.android.exoplayer2.j.f46377b && (b0Var = this.f49214z) != null) {
            boolean zE = b0Var.e();
            long jN = N();
            long j12 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.A = j12;
            this.f49196h.n(j12, zE, this.B);
        }
        com.google.android.exoplayer2.upstream.r0 r0Var = aVar.f49217c;
        u uVar = new u(aVar.f49215a, aVar.f49225k, r0Var.w(), r0Var.x(), j10, j11, r0Var.p());
        this.f49193e.c(aVar.f49215a);
        this.f49194f.u(uVar, 1, -1, null, 0, null, aVar.f49224j, this.A);
        K(aVar);
        this.L = true;
        ((c0.a) com.google.android.exoplayer2.util.a.g(this.f49206r)).n(this);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f49200l.k() && this.f49202n.e();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Loader.c s(a aVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarI;
        K(aVar);
        com.google.android.exoplayer2.upstream.r0 r0Var = aVar.f49217c;
        u uVar = new u(aVar.f49215a, aVar.f49225k, r0Var.w(), r0Var.x(), j10, j11, r0Var.p());
        long jA = this.f49193e.a(new com.google.android.exoplayer2.upstream.g0.d(uVar, new y(1, -1, null, 0, null, com.google.android.exoplayer2.util.u0.B1(aVar.f49224j), com.google.android.exoplayer2.util.u0.B1(this.A)), iOException, i10));
        if (jA == com.google.android.exoplayer2.j.f46377b) {
            cVarI = Loader.f50886l;
        } else {
            int iM = M();
            cVarI = J(aVar, iM) ? Loader.i(iM > this.K, jA) : Loader.f50885k;
        }
        boolean z10 = !cVarI.c();
        this.f49194f.w(uVar, 1, -1, null, 0, null, aVar.f49224j, this.A, iOException, z10);
        if (z10) {
            this.f49193e.c(aVar.f49215a);
        }
        return cVarI;
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public com.google.android.exoplayer2.extractor.e0 b(int i10, int i11) {
        return b0(new d(i10, false));
    }

    @Override // com.google.android.exoplayer2.source.c1.d
    public void c(a2 a2Var) {
        this.f49205q.post(this.f49203o);
    }

    int c0(int i10, b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (i0()) {
            return -3;
        }
        U(i10);
        int iT = this.f49208t[i10].T(b2Var, decoderInputBuffer, i11, this.L);
        if (iT == -3) {
            V(i10);
        }
        return iT;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        if (this.L || this.f49200l.j() || this.J) {
            return false;
        }
        if (this.f49211w && this.F == 0) {
            return false;
        }
        boolean zF = this.f49202n.f();
        if (this.f49200l.k()) {
            return zF;
        }
        h0();
        return true;
    }

    public void d0() {
        if (this.f49211w) {
            for (c1 c1Var : this.f49208t) {
                c1Var.S();
            }
        }
        this.f49200l.m(this);
        this.f49205q.removeCallbacksAndMessages(null);
        this.f49206r = null;
        this.M = true;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        long jN;
        I();
        boolean[] zArr = this.f49213y.f49235b;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.I;
        }
        if (this.f49212x) {
            int length = this.f49208t.length;
            jN = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f49208t[i10].K()) {
                    jN = Math.min(jN, this.f49208t[i10].A());
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = N();
        }
        return jN == Long.MIN_VALUE ? this.H : jN;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        if (this.F == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    int g0(int i10, long j10) {
        if (i0()) {
            return 0;
        }
        U(i10);
        c1 c1Var = this.f49208t[i10];
        int iF = c1Var.F(j10, this.L);
        c1Var.f0(iF);
        if (iF == 0) {
            V(i10);
        }
        return iF;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        I();
        if (!this.f49214z.e()) {
            return 0L;
        }
        com.google.android.exoplayer2.extractor.b0.a aVarD = this.f49214z.d(j10);
        return r3Var.a(j10, aVarD.f44847a.f44855a, aVarD.f44848b.f44855a);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public /* synthetic */ List i(List list) {
        return b0.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        I();
        boolean[] zArr = this.f49213y.f49235b;
        if (!this.f49214z.e()) {
            j10 = 0;
        }
        int i10 = 0;
        this.E = false;
        this.H = j10;
        if (P()) {
            this.I = j10;
            return j10;
        }
        if (this.C != 7 && e0(zArr, j10)) {
            return j10;
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f49200l.k()) {
            c1[] c1VarArr = this.f49208t;
            int length = c1VarArr.length;
            while (i10 < length) {
                c1VarArr[i10].r();
                i10++;
            }
            this.f49200l.g();
        } else {
            this.f49200l.h();
            c1[] c1VarArr2 = this.f49208t;
            int length2 = c1VarArr2.length;
            while (i10 < length2) {
                c1VarArr2[i10].W();
                i10++;
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        if (!this.E) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        if (!this.L && M() <= this.K) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        this.E = false;
        return this.H;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        com.google.android.exoplayer2.trackselection.j jVar;
        I();
        e eVar = this.f49213y;
        p1 p1Var = eVar.f49234a;
        boolean[] zArr3 = eVar.f49236c;
        int i10 = this.F;
        int i11 = 0;
        for (int i12 = 0; i12 < jVarArr.length; i12++) {
            d1 d1Var = d1VarArr[i12];
            if (d1Var != null && (jVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) d1Var).f49230b;
                com.google.android.exoplayer2.util.a.i(zArr3[i13]);
                this.F--;
                zArr3[i13] = false;
                d1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.D ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < jVarArr.length; i14++) {
            if (d1VarArr[i14] == null && (jVar = jVarArr[i14]) != null) {
                com.google.android.exoplayer2.util.a.i(jVar.length() == 1);
                com.google.android.exoplayer2.util.a.i(jVar.e(0) == 0);
                int iD = p1Var.d(jVar.h());
                com.google.android.exoplayer2.util.a.i(!zArr3[iD]);
                this.F++;
                zArr3[iD] = true;
                d1VarArr[i14] = new c(iD);
                zArr2[i14] = true;
                if (!z10) {
                    c1 c1Var = this.f49208t[iD];
                    z10 = (c1Var.a0(j10, true) || c1Var.D() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f49200l.k()) {
                c1[] c1VarArr = this.f49208t;
                int length = c1VarArr.length;
                while (i11 < length) {
                    c1VarArr[i11].r();
                    i11++;
                }
                this.f49200l.g();
            } else {
                c1[] c1VarArr2 = this.f49208t;
                int length2 = c1VarArr2.length;
                while (i11 < length2) {
                    c1VarArr2[i11].W();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = j(j10);
            while (i11 < d1VarArr.length) {
                if (d1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.D = true;
        return j10;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void m() {
        for (c1 c1Var : this.f49208t) {
            c1Var.U();
        }
        this.f49201m.release();
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void n() {
        this.f49210v = true;
        this.f49205q.post(this.f49203o);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        I();
        return this.f49213y.f49234a;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        this.f49206r = aVar;
        this.f49202n.f();
        h0();
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void t(final com.google.android.exoplayer2.extractor.b0 b0Var) {
        this.f49205q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f49180b.S(b0Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        W();
        if (this.L && !this.f49211w) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        I();
        if (P()) {
            return;
        }
        boolean[] zArr = this.f49213y.f49236c;
        int length = this.f49208t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f49208t[i10].q(j10, z10, zArr[i10]);
        }
    }
}
