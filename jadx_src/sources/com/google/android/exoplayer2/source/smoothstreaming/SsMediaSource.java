package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.u;
import com.google.android.exoplayer2.drm.x;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.a0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.h1;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.u0;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SsMediaSource extends com.google.android.exoplayer2.source.a implements Loader.b<i0<com.google.android.exoplayer2.source.smoothstreaming.manifest.a>> {
    public static final long B = 30000;
    private static final int C = 5000;
    private static final long D = 5000000;
    private Handler A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f49010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f49011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i2.h f49012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i2 f49013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o.a f49014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c.a f49015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.g f49016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final u f49017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final g0 f49018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f49019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final n0.a f49020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i0.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> f49021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList<d> f49022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private o f49023u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Loader f49024v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h0 f49025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private u0 f49026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f49027y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f49028z;

    public static final class Factory implements com.google.android.exoplayer2.source.p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c.a f49029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final o.a f49030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.g f49031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f49032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private x f49033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g0 f49034g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f49035h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private i0.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> f49036i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<StreamKey> f49037j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private Object f49038k;

        public Factory(c.a aVar, @p0 o.a aVar2) {
            this.f49029b = (c.a) com.google.android.exoplayer2.util.a.g(aVar);
            this.f49030c = aVar2;
            this.f49033f = new j();
            this.f49034g = new y();
            this.f49035h = 30000L;
            this.f49031d = new com.google.android.exoplayer2.source.j();
            this.f49037j = Collections.emptyList();
        }

        public Factory(o.a aVar) {
            this(new b.a(aVar), aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u o(u uVar, i2 i2Var) {
            return uVar;
        }

        @Override // com.google.android.exoplayer2.source.p0
        public int[] b() {
            return new int[]{1};
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SsMediaSource d(Uri uri) {
            return g(new i2.c().K(uri).a());
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public SsMediaSource g(i2 i2Var) {
            i2 i2VarA = i2Var;
            com.google.android.exoplayer2.util.a.g(i2VarA.f46269c);
            i0.a ssManifestParser = this.f49036i;
            if (ssManifestParser == null) {
                ssManifestParser = new SsManifestParser();
            }
            List<StreamKey> list = !i2VarA.f46269c.f46349e.isEmpty() ? i2VarA.f46269c.f46349e : this.f49037j;
            i0.a a0Var = !list.isEmpty() ? new a0(ssManifestParser, list) : ssManifestParser;
            i2.h hVar = i2VarA.f46269c;
            boolean z10 = hVar.f46353i == null && this.f49038k != null;
            boolean z11 = hVar.f46349e.isEmpty() && !list.isEmpty();
            if (z10 && z11) {
                i2VarA = i2Var.c().J(this.f49038k).G(list).a();
            } else if (z10) {
                i2VarA = i2Var.c().J(this.f49038k).a();
            } else if (z11) {
                i2VarA = i2Var.c().G(list).a();
            }
            i2 i2Var2 = i2VarA;
            return new SsMediaSource(i2Var2, null, this.f49030c, a0Var, this.f49029b, this.f49031d, this.f49033f.a(i2Var2), this.f49034g, this.f49035h);
        }

        public SsMediaSource m(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
            return n(aVar, i2.e(Uri.EMPTY));
        }

        public SsMediaSource n(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, i2 i2Var) {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVarA = aVar;
            com.google.android.exoplayer2.util.a.a(!aVarA.f49138d);
            i2.h hVar = i2Var.f46269c;
            List<StreamKey> list = (hVar == null || hVar.f46349e.isEmpty()) ? this.f49037j : i2Var.f46269c.f46349e;
            if (!list.isEmpty()) {
                aVarA = aVarA.a(list);
            }
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar2 = aVarA;
            i2.h hVar2 = i2Var.f46269c;
            boolean z10 = hVar2 != null;
            i2 i2VarA = i2Var.c().F(com.google.android.exoplayer2.util.y.f51589o0).K(z10 ? i2Var.f46269c.f46345a : Uri.EMPTY).J(z10 && hVar2.f46353i != null ? i2Var.f46269c.f46353i : this.f49038k).G(list).a();
            return new SsMediaSource(i2VarA, aVar2, null, null, this.f49029b, this.f49031d, this.f49033f.a(i2VarA), this.f49034g, this.f49035h);
        }

        public Factory p(@p0 com.google.android.exoplayer2.source.g gVar) {
            if (gVar == null) {
                gVar = new com.google.android.exoplayer2.source.j();
            }
            this.f49031d = gVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Factory h(@p0 HttpDataSource.b bVar) {
            if (!this.f49032e) {
                ((j) this.f49033f).c(bVar);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Factory i(@p0 final u uVar) {
            if (uVar == null) {
                c(null);
            } else {
                c(new x() { // from class: com.google.android.exoplayer2.source.smoothstreaming.f
                    @Override // com.google.android.exoplayer2.drm.x
                    public final u a(i2 i2Var) {
                        return SsMediaSource.Factory.o(uVar, i2Var);
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Factory c(@p0 x xVar) {
            if (xVar != null) {
                this.f49033f = xVar;
                this.f49032e = true;
            } else {
                this.f49033f = new j();
                this.f49032e = false;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Factory a(@p0 String str) {
            if (!this.f49032e) {
                ((j) this.f49033f).d(str);
            }
            return this;
        }

        public Factory u(long j10) {
            this.f49035h = j10;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Factory e(@p0 g0 g0Var) {
            if (g0Var == null) {
                g0Var = new y();
            }
            this.f49034g = g0Var;
            return this;
        }

        public Factory w(@p0 i0.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> aVar) {
            this.f49036i = aVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public Factory f(@p0 List<StreamKey> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f49037j = list;
            return this;
        }

        @Deprecated
        public Factory y(@p0 Object obj) {
            this.f49038k = obj;
            return this;
        }
    }

    static {
        y1.a("goog.exo.smoothstreaming");
    }

    private SsMediaSource(i2 i2Var, @p0 com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, @p0 o.a aVar2, @p0 i0.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> aVar3, c.a aVar4, com.google.android.exoplayer2.source.g gVar, u uVar, g0 g0Var, long j10) {
        com.google.android.exoplayer2.util.a.i(aVar == null || !aVar.f49138d);
        this.f49013k = i2Var;
        i2.h hVar = (i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        this.f49012j = hVar;
        this.f49028z = aVar;
        this.f49011i = hVar.f46345a.equals(Uri.EMPTY) ? null : com.google.android.exoplayer2.util.u0.G(hVar.f46345a);
        this.f49014l = aVar2;
        this.f49021s = aVar3;
        this.f49015m = aVar4;
        this.f49016n = gVar;
        this.f49017o = uVar;
        this.f49018p = g0Var;
        this.f49019q = j10;
        this.f49020r = x(null);
        this.f49010h = aVar != null;
        this.f49022t = new ArrayList<>();
    }

    private void M() {
        h1 h1Var;
        for (int i10 = 0; i10 < this.f49022t.size(); i10++) {
            this.f49022t.get(i10).x(this.f49028z);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar : this.f49028z.f49140f) {
            if (bVar.f49160k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f49160k - 1) + bVar.c(bVar.f49160k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j10 = this.f49028z.f49138d ? -9223372036854775807L : 0L;
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f49028z;
            boolean z10 = aVar.f49138d;
            h1Var = new h1(j10, 0L, 0L, 0L, true, z10, z10, (Object) aVar, this.f49013k);
        } else {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar2 = this.f49028z;
            if (aVar2.f49138d) {
                long j11 = aVar2.f49142h;
                if (j11 != com.google.android.exoplayer2.j.f46377b && j11 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j11);
                }
                long j12 = jMax2;
                long j13 = jMax - j12;
                long jU0 = j13 - com.google.android.exoplayer2.util.u0.U0(this.f49019q);
                if (jU0 < D) {
                    jU0 = Math.min(D, j13 / 2);
                }
                h1Var = new h1(com.google.android.exoplayer2.j.f46377b, j13, j12, jU0, true, true, true, (Object) this.f49028z, this.f49013k);
            } else {
                long j14 = aVar2.f49141g;
                long j15 = j14 != com.google.android.exoplayer2.j.f46377b ? j14 : jMax - jMax2;
                h1Var = new h1(jMax2 + j15, j15, jMax2, 0L, true, false, false, (Object) this.f49028z, this.f49013k);
            }
        }
        E(h1Var);
    }

    private void P() {
        if (this.f49028z.f49138d) {
            this.A.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.smoothstreaming.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49067b.R();
                }
            }, Math.max(0L, (this.f49027y + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (this.f49024v.j()) {
            return;
        }
        i0 i0Var = new i0(this.f49023u, this.f49011i, 4, this.f49021s);
        this.f49020r.z(new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, this.f49024v.n(i0Var, this, this.f49018p.d(i0Var.f51131c))), i0Var.f51131c);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@p0 u0 u0Var) {
        this.f49026x = u0Var;
        this.f49017o.prepare();
        if (this.f49010h) {
            this.f49025w = new h0.a();
            M();
            return;
        }
        this.f49023u = this.f49014l.a();
        Loader loader = new Loader("SsMediaSource");
        this.f49024v = loader;
        this.f49025w = loader;
        this.A = com.google.android.exoplayer2.util.u0.y();
        R();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
        this.f49028z = this.f49010h ? this.f49028z : null;
        this.f49023u = null;
        this.f49027y = 0L;
        Loader loader = this.f49024v;
        if (loader != null) {
            loader.l();
            this.f49024v = null;
        }
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A = null;
        }
        this.f49017o.release();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void p(i0<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> i0Var, long j10, long j11, boolean z10) {
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        this.f49018p.c(i0Var.f51129a);
        this.f49020r.q(uVar, i0Var.f51131c);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void q(i0<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> i0Var, long j10, long j11) {
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        this.f49018p.c(i0Var.f51129a);
        this.f49020r.t(uVar, i0Var.f51131c);
        this.f49028z = i0Var.e();
        this.f49027y = j10 - j11;
        M();
        P();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Loader.c s(i0<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> i0Var, long j10, long j11, IOException iOException, int i10) {
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        long jA = this.f49018p.a(new g0.d(uVar, new com.google.android.exoplayer2.source.y(i0Var.f51131c), iOException, i10));
        Loader.c cVarI = jA == com.google.android.exoplayer2.j.f46377b ? Loader.f50886l : Loader.i(false, jA);
        boolean z10 = !cVarI.c();
        this.f49020r.x(uVar, i0Var.f51131c, iOException, z10);
        if (z10) {
            this.f49018p.c(i0Var.f51129a);
        }
        return cVarI;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f49013k;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() throws IOException {
        this.f49025w.b();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        n0.a aVarX = x(aVar);
        d dVar = new d(this.f49028z, this.f49015m, this.f49026x, this.f49016n, this.f49017o, v(aVar), this.f49018p, aVarX, this.f49025w, bVar);
        this.f49022t.add(dVar);
        return dVar;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        ((d) c0Var).w();
        this.f49022t.remove(c0Var);
    }
}
