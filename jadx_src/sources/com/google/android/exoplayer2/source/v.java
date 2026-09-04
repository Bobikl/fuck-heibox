package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: LoopingMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class v extends e<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x f49182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f49183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<f0.a, f0.a> f49184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<c0, f0.a> f49185n;

    /* JADX INFO: compiled from: LoopingMediaSource.java */
    public static final class a extends s {
        public a(z3 z3Var) {
            super(z3Var);
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public int j(int i10, int i11, boolean z10) {
            int iJ = this.f49002g.j(i10, i11, z10);
            return iJ == -1 ? f(z10) : iJ;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public int s(int i10, int i11, boolean z10) {
            int iS = this.f49002g.s(i10, i11, z10);
            return iS == -1 ? h(z10) : iS;
        }
    }

    /* JADX INFO: compiled from: LoopingMediaSource.java */
    public static final class b extends com.google.android.exoplayer2.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final z3 f49186j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f49187k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f49188l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f49189m;

        public b(z3 z3Var, int i10) {
            super(false, new f1.b(i10));
            this.f49186j = z3Var;
            int iN = z3Var.n();
            this.f49187k = iN;
            this.f49188l = z3Var.w();
            this.f49189m = i10;
            if (iN > 0) {
                com.google.android.exoplayer2.util.a.j(i10 <= Integer.MAX_VALUE / iN, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.a
        protected int B(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.a
        protected int C(int i10) {
            return i10 / this.f49187k;
        }

        @Override // com.google.android.exoplayer2.a
        protected int D(int i10) {
            return i10 / this.f49188l;
        }

        @Override // com.google.android.exoplayer2.a
        protected Object G(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // com.google.android.exoplayer2.a
        protected int I(int i10) {
            return i10 * this.f49187k;
        }

        @Override // com.google.android.exoplayer2.a
        protected int J(int i10) {
            return i10 * this.f49188l;
        }

        @Override // com.google.android.exoplayer2.a
        protected z3 M(int i10) {
            return this.f49186j;
        }

        @Override // com.google.android.exoplayer2.z3
        public int n() {
            return this.f49187k * this.f49189m;
        }

        @Override // com.google.android.exoplayer2.z3
        public int w() {
            return this.f49188l * this.f49189m;
        }
    }

    public v(f0 f0Var) {
        this(f0Var, Integer.MAX_VALUE);
    }

    public v(f0 f0Var, int i10) {
        com.google.android.exoplayer2.util.a.a(i10 > 0);
        this.f49182k = new x(f0Var, false);
        this.f49183l = i10;
        this.f49184m = new HashMap();
        this.f49185n = new HashMap();
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        super.D(u0Var);
        V(null, this.f49182k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    @androidx.annotation.p0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public f0.a K(Void r10, f0.a aVar) {
        return this.f49183l != Integer.MAX_VALUE ? this.f49184m.get(aVar) : aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void R(Void r10, f0 f0Var, z3 z3Var) {
        E(this.f49183l != Integer.MAX_VALUE ? new b(z3Var, this.f49183l) : new a(z3Var));
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f49182k.c();
    }

    @Override // com.google.android.exoplayer2.source.a, com.google.android.exoplayer2.source.f0
    @androidx.annotation.p0
    public z3 g() {
        return this.f49183l != Integer.MAX_VALUE ? new b(this.f49182k.d0(), this.f49183l) : new a(this.f49182k.d0());
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        if (this.f49183l == Integer.MAX_VALUE) {
            return this.f49182k.h(aVar, bVar, j10);
        }
        f0.a aVarA = aVar.a(com.google.android.exoplayer2.a.E(aVar.f47719a));
        this.f49184m.put(aVarA, aVar);
        w wVarH = this.f49182k.h(aVarA, bVar, j10);
        this.f49185n.put(wVarH, aVarA);
        return wVarH;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        this.f49182k.k(c0Var);
        f0.a aVarRemove = this.f49185n.remove(c0Var);
        if (aVarRemove != null) {
            this.f49184m.remove(aVarRemove);
        }
    }

    @Override // com.google.android.exoplayer2.source.a, com.google.android.exoplayer2.source.f0
    public boolean t() {
        return false;
    }
}
