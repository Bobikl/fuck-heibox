package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.h1;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.u0;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.y1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class HlsMediaSource extends com.google.android.exoplayer2.source.a implements HlsPlaylistTracker.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f48049v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f48050w = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f48051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i2.h f48052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f48053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.g f48054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.u f48055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g0 f48056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f48057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f48058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f48059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final HlsPlaylistTracker f48060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f48061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i2 f48062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private i2.g f48063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private u0 f48064u;

    public static final class Factory implements com.google.android.exoplayer2.source.p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f48065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f48066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.hls.playlist.i f48067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private HlsPlaylistTracker.a f48068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.source.g f48069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f48070g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.x f48071h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g0 f48072i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f48073j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f48074k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f48075l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<StreamKey> f48076m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @p0
        private Object f48077n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f48078o;

        public Factory(g gVar) {
            this.f48065b = (g) com.google.android.exoplayer2.util.a.g(gVar);
            this.f48071h = new com.google.android.exoplayer2.drm.j();
            this.f48067d = new com.google.android.exoplayer2.source.hls.playlist.a();
            this.f48068e = com.google.android.exoplayer2.source.hls.playlist.c.f48256q;
            this.f48066c = h.f48146a;
            this.f48072i = new y();
            this.f48069f = new com.google.android.exoplayer2.source.j();
            this.f48074k = 1;
            this.f48076m = Collections.emptyList();
            this.f48078o = com.google.android.exoplayer2.j.f46377b;
        }

        public Factory(com.google.android.exoplayer2.upstream.o.a aVar) {
            this(new d(aVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.drm.u m(com.google.android.exoplayer2.drm.u uVar, i2 i2Var) {
            return uVar;
        }

        @Deprecated
        public Factory A(@p0 Object obj) {
            this.f48077n = obj;
            return this;
        }

        public Factory B(boolean z10) {
            this.f48075l = z10;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        public int[] b() {
            return new int[]{2};
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource d(Uri uri) {
            return g(new i2.c().K(uri).F(com.google.android.exoplayer2.util.y.f51587n0).a());
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource g(i2 i2Var) {
            i2 i2VarA = i2Var;
            com.google.android.exoplayer2.util.a.g(i2VarA.f46269c);
            com.google.android.exoplayer2.source.hls.playlist.i eVar = this.f48067d;
            List<StreamKey> list = i2VarA.f46269c.f46349e.isEmpty() ? this.f48076m : i2VarA.f46269c.f46349e;
            if (!list.isEmpty()) {
                eVar = new com.google.android.exoplayer2.source.hls.playlist.e(eVar, list);
            }
            i2.h hVar = i2VarA.f46269c;
            boolean z10 = hVar.f46353i == null && this.f48077n != null;
            boolean z11 = hVar.f46349e.isEmpty() && !list.isEmpty();
            if (z10 && z11) {
                i2VarA = i2Var.c().J(this.f48077n).G(list).a();
            } else if (z10) {
                i2VarA = i2Var.c().J(this.f48077n).a();
            } else if (z11) {
                i2VarA = i2Var.c().G(list).a();
            }
            i2 i2Var2 = i2VarA;
            g gVar = this.f48065b;
            h hVar2 = this.f48066c;
            com.google.android.exoplayer2.source.g gVar2 = this.f48069f;
            com.google.android.exoplayer2.drm.u uVarA = this.f48071h.a(i2Var2);
            g0 g0Var = this.f48072i;
            return new HlsMediaSource(i2Var2, gVar, hVar2, gVar2, uVarA, g0Var, this.f48068e.a(this.f48065b, g0Var, eVar), this.f48078o, this.f48073j, this.f48074k, this.f48075l);
        }

        public Factory n(boolean z10) {
            this.f48073j = z10;
            return this;
        }

        public Factory o(@p0 com.google.android.exoplayer2.source.g gVar) {
            if (gVar == null) {
                gVar = new com.google.android.exoplayer2.source.j();
            }
            this.f48069f = gVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Factory h(@p0 HttpDataSource.b bVar) {
            if (!this.f48070g) {
                ((com.google.android.exoplayer2.drm.j) this.f48071h).c(bVar);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Factory i(@p0 final com.google.android.exoplayer2.drm.u uVar) {
            if (uVar == null) {
                c(null);
            } else {
                c(new com.google.android.exoplayer2.drm.x() { // from class: com.google.android.exoplayer2.source.hls.m
                    @Override // com.google.android.exoplayer2.drm.x
                    public final com.google.android.exoplayer2.drm.u a(i2 i2Var) {
                        return HlsMediaSource.Factory.m(uVar, i2Var);
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Factory c(@p0 com.google.android.exoplayer2.drm.x xVar) {
            if (xVar != null) {
                this.f48071h = xVar;
                this.f48070g = true;
            } else {
                this.f48071h = new com.google.android.exoplayer2.drm.j();
                this.f48070g = false;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Factory a(@p0 String str) {
            if (!this.f48070g) {
                ((com.google.android.exoplayer2.drm.j) this.f48071h).d(str);
            }
            return this;
        }

        @j1
        Factory t(long j10) {
            this.f48078o = j10;
            return this;
        }

        public Factory u(@p0 h hVar) {
            if (hVar == null) {
                hVar = h.f48146a;
            }
            this.f48066c = hVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Factory e(@p0 g0 g0Var) {
            if (g0Var == null) {
                g0Var = new y();
            }
            this.f48072i = g0Var;
            return this;
        }

        public Factory w(int i10) {
            this.f48074k = i10;
            return this;
        }

        public Factory x(@p0 com.google.android.exoplayer2.source.hls.playlist.i iVar) {
            if (iVar == null) {
                iVar = new com.google.android.exoplayer2.source.hls.playlist.a();
            }
            this.f48067d = iVar;
            return this;
        }

        public Factory y(@p0 HlsPlaylistTracker.a aVar) {
            if (aVar == null) {
                aVar = com.google.android.exoplayer2.source.hls.playlist.c.f48256q;
            }
            this.f48068e = aVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public Factory f(@p0 List<StreamKey> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f48076m = list;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    static {
        y1.a("goog.exo.hls");
    }

    private HlsMediaSource(i2 i2Var, g gVar, h hVar, com.google.android.exoplayer2.source.g gVar2, com.google.android.exoplayer2.drm.u uVar, g0 g0Var, HlsPlaylistTracker hlsPlaylistTracker, long j10, boolean z10, int i10, boolean z11) {
        this.f48052i = (i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        this.f48062s = i2Var;
        this.f48063t = i2Var.f46271e;
        this.f48053j = gVar;
        this.f48051h = hVar;
        this.f48054k = gVar2;
        this.f48055l = uVar;
        this.f48056m = g0Var;
        this.f48060q = hlsPlaylistTracker;
        this.f48061r = j10;
        this.f48057n = z10;
        this.f48058o = i10;
        this.f48059p = z11;
    }

    private h1 H(com.google.android.exoplayer2.source.hls.playlist.g gVar, long j10, long j11, i iVar) {
        long jB = gVar.f48323h - this.f48060q.b();
        long j12 = gVar.f48330o ? jB + gVar.f48336u : -9223372036854775807L;
        long jM = M(gVar);
        long j13 = this.f48063t.f46335b;
        S(com.google.android.exoplayer2.util.u0.t(j13 != com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.util.u0.U0(j13) : R(gVar, jM), jM, gVar.f48336u + jM));
        return new h1(j10, j11, com.google.android.exoplayer2.j.f46377b, j12, gVar.f48336u, jB, P(gVar, jM), true, !gVar.f48330o, gVar.f48319d == 2 && gVar.f48321f, iVar, this.f48062s, this.f48063t);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    private h1 I(com.google.android.exoplayer2.source.hls.playlist.g gVar, long j10, long j11, i iVar) {
        long j12;
        if (gVar.f48320e == com.google.android.exoplayer2.j.f46377b || gVar.f48333r.isEmpty()) {
            j12 = 0;
        } else if (gVar.f48322g) {
            j12 = gVar.f48320e;
        } else {
            long j13 = gVar.f48320e;
            if (j13 == gVar.f48336u) {
                j12 = gVar.f48320e;
            } else {
                j12 = K(gVar.f48333r, j13).f48349f;
            }
        }
        long j14 = gVar.f48336u;
        return new h1(j10, j11, com.google.android.exoplayer2.j.f46377b, j14, j14, 0L, j12, true, false, true, iVar, this.f48062s, null);
    }

    @p0
    private static com.google.android.exoplayer2.source.hls.playlist.g.b J(List<com.google.android.exoplayer2.source.hls.playlist.g.b> list, long j10) {
        com.google.android.exoplayer2.source.hls.playlist.g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.exoplayer2.source.hls.playlist.g.b bVar2 = list.get(i10);
            long j11 = bVar2.f48349f;
            if (j11 > j10 || !bVar2.f48338m) {
                if (j11 > j10) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static com.google.android.exoplayer2.source.hls.playlist.g.e K(List<com.google.android.exoplayer2.source.hls.playlist.g.e> list, long j10) {
        return list.get(com.google.android.exoplayer2.util.u0.h(list, Long.valueOf(j10), true, true));
    }

    private long M(com.google.android.exoplayer2.source.hls.playlist.g gVar) {
        if (gVar.f48331p) {
            return com.google.android.exoplayer2.util.u0.U0(com.google.android.exoplayer2.util.u0.l0(this.f48061r)) - gVar.e();
        }
        return 0L;
    }

    private long P(com.google.android.exoplayer2.source.hls.playlist.g gVar, long j10) {
        long jU0 = gVar.f48320e;
        if (jU0 == com.google.android.exoplayer2.j.f46377b) {
            jU0 = (gVar.f48336u + j10) - com.google.android.exoplayer2.util.u0.U0(this.f48063t.f46335b);
        }
        if (gVar.f48322g) {
            return jU0;
        }
        com.google.android.exoplayer2.source.hls.playlist.g.b bVarJ = J(gVar.f48334s, jU0);
        if (bVarJ != null) {
            return bVarJ.f48349f;
        }
        if (gVar.f48333r.isEmpty()) {
            return 0L;
        }
        com.google.android.exoplayer2.source.hls.playlist.g.e eVarK = K(gVar.f48333r, jU0);
        com.google.android.exoplayer2.source.hls.playlist.g.b bVarJ2 = J(eVarK.f48344n, jU0);
        return bVarJ2 != null ? bVarJ2.f48349f : eVarK.f48349f;
    }

    private static long R(com.google.android.exoplayer2.source.hls.playlist.g gVar, long j10) {
        long j11;
        com.google.android.exoplayer2.source.hls.playlist.g.C0385g c0385g = gVar.f48337v;
        long j12 = gVar.f48320e;
        if (j12 != com.google.android.exoplayer2.j.f46377b) {
            j11 = gVar.f48336u - j12;
        } else {
            long j13 = c0385g.f48359d;
            if (j13 == com.google.android.exoplayer2.j.f46377b || gVar.f48329n == com.google.android.exoplayer2.j.f46377b) {
                long j14 = c0385g.f48358c;
                j11 = j14 != com.google.android.exoplayer2.j.f46377b ? j14 : gVar.f48328m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    private void S(long j10) {
        long jB1 = com.google.android.exoplayer2.util.u0.B1(j10);
        i2.g gVar = this.f48063t;
        if (jB1 != gVar.f46335b) {
            this.f48063t = gVar.c().k(jB1).f();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@p0 u0 u0Var) {
        this.f48064u = u0Var;
        this.f48055l.prepare();
        this.f48060q.d(this.f48052i.f46345a, x(null), this);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
        this.f48060q.stop();
        this.f48055l.release();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f48062s;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() throws IOException {
        this.f48060q.k();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        n0.a aVarX = x(aVar);
        return new l(this.f48051h, this.f48060q, this.f48053j, this.f48064u, this.f48055l, v(aVar), this.f48056m, aVarX, bVar, this.f48054k, this.f48057n, this.f48058o, this.f48059p);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c
    public void i(com.google.android.exoplayer2.source.hls.playlist.g gVar) {
        long jB1 = gVar.f48331p ? com.google.android.exoplayer2.util.u0.B1(gVar.f48323h) : -9223372036854775807L;
        int i10 = gVar.f48319d;
        long j10 = (i10 == 2 || i10 == 1) ? jB1 : -9223372036854775807L;
        i iVar = new i((com.google.android.exoplayer2.source.hls.playlist.f) com.google.android.exoplayer2.util.a.g(this.f48060q.c()), gVar);
        E(this.f48060q.i() ? H(gVar, j10, jB1, iVar) : I(gVar, j10, jB1, iVar));
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        ((l) c0Var).C();
    }
}
