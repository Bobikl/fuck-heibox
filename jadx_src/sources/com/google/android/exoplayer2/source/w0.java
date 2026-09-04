package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.z3;
import java.util.List;

/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w0 extends com.google.android.exoplayer2.source.a implements v0.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f49247t = 1048576;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i2 f49248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i2.h f49249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o.a f49250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r0.a f49251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.u f49252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g0 f49253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f49254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f49255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f49256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f49257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f49258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.upstream.u0 f49259s;

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public class a extends s {
        a(w0 w0Var, z3 z3Var) {
            super(z3Var);
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            super.l(i10, bVar, z10);
            bVar.f52098g = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            super.v(i10, dVar, j10);
            dVar.f52123m = true;
            return dVar;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class b implements p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.o.a f49260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r0.a f49261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f49262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.x f49263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.g0 f49264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private String f49266h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f49267i;

        public b(com.google.android.exoplayer2.upstream.o.a aVar) {
            this(aVar, new com.google.android.exoplayer2.extractor.h());
        }

        public b(com.google.android.exoplayer2.upstream.o.a aVar, final com.google.android.exoplayer2.extractor.q qVar) {
            this(aVar, new r0.a() { // from class: com.google.android.exoplayer2.source.x0
                @Override // com.google.android.exoplayer2.source.r0.a
                public final r0 a() {
                    return w0.b.o(qVar);
                }
            });
        }

        public b(com.google.android.exoplayer2.upstream.o.a aVar, r0.a aVar2) {
            this.f49260b = aVar;
            this.f49261c = aVar2;
            this.f49263e = new com.google.android.exoplayer2.drm.j();
            this.f49264f = new com.google.android.exoplayer2.upstream.y();
            this.f49265g = 1048576;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ r0 o(com.google.android.exoplayer2.extractor.q qVar) {
            return new com.google.android.exoplayer2.source.b(qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.drm.u p(com.google.android.exoplayer2.drm.u uVar, i2 i2Var) {
            return uVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ r0 q(com.google.android.exoplayer2.extractor.q qVar) {
            if (qVar == null) {
                qVar = new com.google.android.exoplayer2.extractor.h();
            }
            return new com.google.android.exoplayer2.source.b(qVar);
        }

        @Override // com.google.android.exoplayer2.source.p0
        public int[] b() {
            return new int[]{4};
        }

        @Override // com.google.android.exoplayer2.source.p0
        public /* synthetic */ p0 f(List list) {
            return o0.b(this, list);
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public w0 d(Uri uri) {
            return g(new i2.c().K(uri).a());
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public w0 g(i2 i2Var) {
            com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
            i2.h hVar = i2Var.f46269c;
            boolean z10 = hVar.f46353i == null && this.f49267i != null;
            boolean z11 = hVar.f46350f == null && this.f49266h != null;
            if (z10 && z11) {
                i2Var = i2Var.c().J(this.f49267i).l(this.f49266h).a();
            } else if (z10) {
                i2Var = i2Var.c().J(this.f49267i).a();
            } else if (z11) {
                i2Var = i2Var.c().l(this.f49266h).a();
            }
            i2 i2Var2 = i2Var;
            return new w0(i2Var2, this.f49260b, this.f49261c, this.f49263e.a(i2Var2), this.f49264f, this.f49265g, null);
        }

        public b r(int i10) {
            this.f49265g = i10;
            return this;
        }

        @Deprecated
        public b s(@androidx.annotation.p0 String str) {
            this.f49266h = str;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b h(@androidx.annotation.p0 HttpDataSource.b bVar) {
            if (!this.f49262d) {
                ((com.google.android.exoplayer2.drm.j) this.f49263e).c(bVar);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b i(@androidx.annotation.p0 final com.google.android.exoplayer2.drm.u uVar) {
            if (uVar == null) {
                c(null);
            } else {
                c(new com.google.android.exoplayer2.drm.x() { // from class: com.google.android.exoplayer2.source.y0
                    @Override // com.google.android.exoplayer2.drm.x
                    public final com.google.android.exoplayer2.drm.u a(i2 i2Var) {
                        return w0.b.p(uVar, i2Var);
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b c(@androidx.annotation.p0 com.google.android.exoplayer2.drm.x xVar) {
            if (xVar != null) {
                this.f49263e = xVar;
                this.f49262d = true;
            } else {
                this.f49263e = new com.google.android.exoplayer2.drm.j();
                this.f49262d = false;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b a(@androidx.annotation.p0 String str) {
            if (!this.f49262d) {
                ((com.google.android.exoplayer2.drm.j) this.f49263e).d(str);
            }
            return this;
        }

        @Deprecated
        public b x(@androidx.annotation.p0 final com.google.android.exoplayer2.extractor.q qVar) {
            this.f49261c = new r0.a() { // from class: com.google.android.exoplayer2.source.z0
                @Override // com.google.android.exoplayer2.source.r0.a
                public final r0 a() {
                    return w0.b.q(qVar);
                }
            };
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b e(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.g0 g0Var) {
            if (g0Var == null) {
                g0Var = new com.google.android.exoplayer2.upstream.y();
            }
            this.f49264f = g0Var;
            return this;
        }

        @Deprecated
        public b z(@androidx.annotation.p0 Object obj) {
            this.f49267i = obj;
            return this;
        }
    }

    private w0(i2 i2Var, com.google.android.exoplayer2.upstream.o.a aVar, r0.a aVar2, com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.upstream.g0 g0Var, int i10) {
        this.f49249i = (i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        this.f49248h = i2Var;
        this.f49250j = aVar;
        this.f49251k = aVar2;
        this.f49252l = uVar;
        this.f49253m = g0Var;
        this.f49254n = i10;
        this.f49255o = true;
        this.f49256p = com.google.android.exoplayer2.j.f46377b;
    }

    /* synthetic */ w0(i2 i2Var, com.google.android.exoplayer2.upstream.o.a aVar, r0.a aVar2, com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.upstream.g0 g0Var, int i10, a aVar3) {
        this(i2Var, aVar, aVar2, uVar, g0Var, i10);
    }

    private void H() {
        z3 h1Var = new h1(this.f49256p, this.f49257q, false, this.f49258r, (Object) null, this.f49248h);
        if (this.f49255o) {
            h1Var = new a(this, h1Var);
        }
        E(h1Var);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        this.f49259s = u0Var;
        this.f49252l.prepare();
        H();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
        this.f49252l.release();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f49248h;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        com.google.android.exoplayer2.upstream.o oVarA = this.f49250j.a();
        com.google.android.exoplayer2.upstream.u0 u0Var = this.f49259s;
        if (u0Var != null) {
            oVarA.e(u0Var);
        }
        return new v0(this.f49249i.f46345a, oVarA, this.f49251k.a(), this.f49252l, v(aVar), this.f49253m, x(aVar), this, bVar, this.f49249i.f46350f, this.f49254n);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        ((v0) c0Var).d0();
    }

    @Override // com.google.android.exoplayer2.source.v0.b
    public void n(long j10, boolean z10, boolean z11) {
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            j10 = this.f49256p;
        }
        if (!this.f49255o && this.f49256p == j10 && this.f49257q == z10 && this.f49258r == z11) {
            return;
        }
        this.f49256p = j10;
        this.f49257q = z10;
        this.f49258r = z11;
        this.f49255o = false;
        H();
    }
}
