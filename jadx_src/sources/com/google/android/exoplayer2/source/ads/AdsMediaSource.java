package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.p0;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class AdsMediaSource extends com.google.android.exoplayer2.source.e<f0.a> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final f0.a f47474w = new f0.a(new Object());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0 f47475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p0 f47476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f47477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.c f47478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r f47479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f47480p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private c f47483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private z3 f47484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.source.ads.c f47485u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f47481q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final z3.b f47482r = new z3.b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a[][] f47486v = new a[0][];

    public static final class AdLoadException extends IOException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f47487c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f47488d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f47489e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f47490f = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47491b;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private AdLoadException(int i10, Exception exc) {
            super(exc);
            this.f47491b = i10;
        }

        public static AdLoadException a(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException b(Exception exc, int i10) {
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Failed to load ad group ");
            sb2.append(i10);
            return new AdLoadException(1, new IOException(sb2.toString(), exc));
        }

        public static AdLoadException c(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException d(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException e() {
            com.google.android.exoplayer2.util.a.i(this.f47491b == 3);
            return (RuntimeException) com.google.android.exoplayer2.util.a.g(getCause());
        }
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0.a f47492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<w> f47493b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f47494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f0 f47495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private z3 f47496e;

        public a(f0.a aVar) {
            this.f47492a = aVar;
        }

        public c0 a(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
            w wVar = new w(aVar, bVar, j10);
            this.f47493b.add(wVar);
            f0 f0Var = this.f47495d;
            if (f0Var != null) {
                wVar.z(f0Var);
                wVar.A(AdsMediaSource.this.new b((Uri) com.google.android.exoplayer2.util.a.g(this.f47494c)));
            }
            z3 z3Var = this.f47496e;
            if (z3Var != null) {
                wVar.b(new f0.a(z3Var.t(0), aVar.f47722d));
            }
            return wVar;
        }

        public long b() {
            z3 z3Var = this.f47496e;
            return z3Var == null ? com.google.android.exoplayer2.j.f46377b : z3Var.k(0, AdsMediaSource.this.f47482r).o();
        }

        public void c(z3 z3Var) {
            com.google.android.exoplayer2.util.a.a(z3Var.n() == 1);
            if (this.f47496e == null) {
                Object objT = z3Var.t(0);
                for (int i10 = 0; i10 < this.f47493b.size(); i10++) {
                    w wVar = this.f47493b.get(i10);
                    wVar.b(new f0.a(objT, wVar.f49238b.f47722d));
                }
            }
            this.f47496e = z3Var;
        }

        public boolean d() {
            return this.f47495d != null;
        }

        public void e(f0 f0Var, Uri uri) {
            this.f47495d = f0Var;
            this.f47494c = uri;
            for (int i10 = 0; i10 < this.f47493b.size(); i10++) {
                w wVar = this.f47493b.get(i10);
                wVar.z(f0Var);
                wVar.A(AdsMediaSource.this.new b(uri));
            }
            AdsMediaSource.this.V(this.f47492a, f0Var);
        }

        public boolean f() {
            return this.f47493b.isEmpty();
        }

        public void g() {
            if (d()) {
                AdsMediaSource.this.X(this.f47492a);
            }
        }

        public void h(w wVar) {
            this.f47493b.remove(wVar);
            wVar.y();
        }
    }

    public final class b implements w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f47498a;

        public b(Uri uri) {
            this.f47498a = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(f0.a aVar) {
            AdsMediaSource.this.f47477m.f(AdsMediaSource.this, aVar.f47720b, aVar.f47721c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(f0.a aVar, IOException iOException) {
            AdsMediaSource.this.f47477m.c(AdsMediaSource.this, aVar.f47720b, aVar.f47721c, iOException);
        }

        @Override // com.google.android.exoplayer2.source.w.a
        public void a(final f0.a aVar, final IOException iOException) {
            AdsMediaSource.this.x(aVar).x(new u(u.a(), new r(this.f47498a), SystemClock.elapsedRealtime()), 6, AdLoadException.a(iOException), true);
            AdsMediaSource.this.f47481q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47542b.f(aVar, iOException);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.w.a
        public void b(final f0.a aVar) {
            AdsMediaSource.this.f47481q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47540b.e(aVar);
                }
            });
        }
    }

    public final class c implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f47500a = u0.y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f47501b;

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(com.google.android.exoplayer2.source.ads.c cVar) {
            if (this.f47501b) {
                return;
            }
            AdsMediaSource.this.s0(cVar);
        }

        @Override // com.google.android.exoplayer2.source.ads.e.a
        public void a(final com.google.android.exoplayer2.source.ads.c cVar) {
            if (this.f47501b) {
                return;
            }
            this.f47500a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47545b.f(cVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.e.a
        public void b(AdLoadException adLoadException, r rVar) {
            if (this.f47501b) {
                return;
            }
            AdsMediaSource.this.x(null).x(new u(u.a(), rVar, SystemClock.elapsedRealtime()), 6, adLoadException, true);
        }

        @Override // com.google.android.exoplayer2.source.ads.e.a
        public /* synthetic */ void c() {
            d.a(this);
        }

        @Override // com.google.android.exoplayer2.source.ads.e.a
        public /* synthetic */ void d() {
            d.d(this);
        }

        public void g() {
            this.f47501b = true;
            this.f47500a.removeCallbacksAndMessages(null);
        }
    }

    public AdsMediaSource(f0 f0Var, r rVar, Object obj, p0 p0Var, e eVar, com.google.android.exoplayer2.ui.c cVar) {
        this.f47475k = f0Var;
        this.f47476l = p0Var;
        this.f47477m = eVar;
        this.f47478n = cVar;
        this.f47479o = rVar;
        this.f47480p = obj;
        eVar.e(p0Var.b());
    }

    private long[][] k0() {
        long[][] jArr = new long[this.f47486v.length][];
        int i10 = 0;
        while (true) {
            a[][] aVarArr = this.f47486v;
            if (i10 >= aVarArr.length) {
                return jArr;
            }
            jArr[i10] = new long[aVarArr[i10].length];
            int i11 = 0;
            while (true) {
                a[] aVarArr2 = this.f47486v[i10];
                if (i11 < aVarArr2.length) {
                    a aVar = aVarArr2[i11];
                    jArr[i10][i11] = aVar == null ? com.google.android.exoplayer2.j.f46377b : aVar.b();
                    i11++;
                }
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(c cVar) {
        this.f47477m.b(this, this.f47479o, this.f47480p, this.f47478n, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(c cVar) {
        this.f47477m.d(this, cVar);
    }

    private void o0() {
        Uri uri;
        com.google.android.exoplayer2.source.ads.c cVar = this.f47485u;
        if (cVar == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f47486v.length; i10++) {
            int i11 = 0;
            while (true) {
                a[] aVarArr = this.f47486v[i10];
                if (i11 < aVarArr.length) {
                    a aVar = aVarArr[i11];
                    com.google.android.exoplayer2.source.ads.c.a aVarE = cVar.e(i10);
                    if (aVar != null && !aVar.d()) {
                        Uri[] uriArr = aVarE.f47531d;
                        if (i11 < uriArr.length && (uri = uriArr[i11]) != null) {
                            i2.c cVarK = new i2.c().K(uri);
                            i2.h hVar = this.f47475k.c().f46269c;
                            if (hVar != null) {
                                cVarK.m(hVar.f46347c);
                            }
                            aVar.e(this.f47476l.g(cVarK.a()), uri);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    private void p0() {
        z3 z3Var = this.f47484t;
        com.google.android.exoplayer2.source.ads.c cVar = this.f47485u;
        if (cVar == null || z3Var == null) {
            return;
        }
        if (cVar.f47516c == 0) {
            E(z3Var);
        } else {
            this.f47485u = cVar.m(k0());
            E(new n(z3Var, this.f47485u));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(com.google.android.exoplayer2.source.ads.c cVar) {
        com.google.android.exoplayer2.source.ads.c cVar2 = this.f47485u;
        if (cVar2 == null) {
            a[][] aVarArr = new a[cVar.f47516c][];
            this.f47486v = aVarArr;
            Arrays.fill(aVarArr, new a[0]);
        } else {
            com.google.android.exoplayer2.util.a.i(cVar.f47516c == cVar2.f47516c);
        }
        this.f47485u = cVar;
        o0();
        p0();
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        super.D(u0Var);
        final c cVar = new c();
        this.f47483s = cVar;
        V(f47474w, this.f47475k);
        this.f47481q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f47538b.m0(cVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void F() {
        super.F();
        final c cVar = (c) com.google.android.exoplayer2.util.a.g(this.f47483s);
        this.f47483s = null;
        cVar.g();
        this.f47484t = null;
        this.f47485u = null;
        this.f47486v = new a[0][];
        this.f47481q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f47536b.n0(cVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f47475k.c();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        if (((com.google.android.exoplayer2.source.ads.c) com.google.android.exoplayer2.util.a.g(this.f47485u)).f47516c <= 0 || !aVar.c()) {
            w wVar = new w(aVar, bVar, j10);
            wVar.z(this.f47475k);
            wVar.b(aVar);
            return wVar;
        }
        int i10 = aVar.f47720b;
        int i11 = aVar.f47721c;
        a[][] aVarArr = this.f47486v;
        a[] aVarArr2 = aVarArr[i10];
        if (aVarArr2.length <= i11) {
            aVarArr[i10] = (a[]) Arrays.copyOf(aVarArr2, i11 + 1);
        }
        a aVar2 = this.f47486v[i10][i11];
        if (aVar2 == null) {
            aVar2 = new a(aVar);
            this.f47486v[i10][i11] = aVar2;
            o0();
        }
        return aVar2.a(aVar, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        w wVar = (w) c0Var;
        f0.a aVar = wVar.f49238b;
        if (!aVar.c()) {
            wVar.y();
            return;
        }
        a aVar2 = (a) com.google.android.exoplayer2.util.a.g(this.f47486v[aVar.f47720b][aVar.f47721c]);
        aVar2.h(wVar);
        if (aVar2.f()) {
            aVar2.g();
            this.f47486v[aVar.f47720b][aVar.f47721c] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public f0.a K(f0.a aVar, f0.a aVar2) {
        return aVar.c() ? aVar : aVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void R(f0.a aVar, f0 f0Var, z3 z3Var) {
        if (aVar.c()) {
            ((a) com.google.android.exoplayer2.util.a.g(this.f47486v[aVar.f47720b][aVar.f47721c])).c(z3Var);
        } else {
            com.google.android.exoplayer2.util.a.a(z3Var.n() == 1);
            this.f47484t = z3Var;
        }
        p0();
    }
}
