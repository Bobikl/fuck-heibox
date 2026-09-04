package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.b0;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.l1;
import com.google.common.collect.o1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l extends com.google.android.exoplayer2.source.a implements f0.b, n0, s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f47549h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @b0("this")
    @p0
    private Handler f47553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private d f47554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private z3 f47555n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o1<Long, d> f47550i = ArrayListMultimap.K();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.exoplayer2.source.ads.c f47556o = com.google.android.exoplayer2.source.ads.c.f47508m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n0.a f47551j = x(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s.a f47552k = v(null);

    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    public static final class a implements c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f47557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0.a f47558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n0.a f47559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s.a f47560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c0.a f47561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f47562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean[] f47563h = new boolean[0];

        public a(d dVar, f0.a aVar, n0.a aVar2, s.a aVar3) {
            this.f47557b = dVar;
            this.f47558c = aVar;
            this.f47559d = aVar2;
            this.f47560e = aVar3;
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public boolean a() {
            return this.f47557b.t(this);
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public boolean d(long j10) {
            return this.f47557b.f(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public long e() {
            return this.f47557b.j(this);
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public void f(long j10) {
            this.f47557b.G(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public long g() {
            return this.f47557b.m(this);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long h(long j10, r3 r3Var) {
            return this.f47557b.i(this, j10, r3Var);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public List<StreamKey> i(List<com.google.android.exoplayer2.trackselection.j> list) {
            return this.f47557b.o(list);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long j(long j10) {
            return this.f47557b.J(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long k() {
            return this.f47557b.F(this);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
            if (this.f47563h.length == 0) {
                this.f47563h = new boolean[d1VarArr.length];
            }
            return this.f47557b.K(this, jVarArr, zArr, d1VarArr, zArr2, j10);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public p1 o() {
            return this.f47557b.s();
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void r(c0.a aVar, long j10) {
            this.f47561f = aVar;
            this.f47557b.D(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void u() throws IOException {
            this.f47557b.y();
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void v(long j10, boolean z10) {
            this.f47557b.g(this, j10, z10);
        }
    }

    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    public static final class b implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f47564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47565c;

        public b(a aVar, int i10) {
            this.f47564b = aVar;
            this.f47565c = i10;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() throws IOException {
            this.f47564b.f47557b.x(this.f47565c);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            a aVar = this.f47564b;
            return aVar.f47557b.E(aVar, this.f47565c, b2Var, decoderInputBuffer, i10);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return this.f47564b.f47557b.u(this.f47565c);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            a aVar = this.f47564b;
            return aVar.f47557b.L(aVar, this.f47565c, j10);
        }
    }

    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    public static final class c extends com.google.android.exoplayer2.source.s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.ads.c f47566h;

        public c(z3 z3Var, com.google.android.exoplayer2.source.ads.c cVar) {
            super(z3Var);
            com.google.android.exoplayer2.util.a.i(z3Var.n() == 1);
            com.google.android.exoplayer2.util.a.i(z3Var.w() == 1);
            this.f47566h = cVar;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            super.l(i10, bVar, z10);
            long j10 = bVar.f52096e;
            bVar.y(bVar.f52093b, bVar.f52094c, bVar.f52095d, j10 == com.google.android.exoplayer2.j.f46377b ? this.f47566h.f47518e : m.e(j10, -1, this.f47566h), -m.e(-bVar.s(), -1, this.f47566h), this.f47566h, bVar.f52098g);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            super.v(i10, dVar, j10);
            long jE = m.e(dVar.f52128r, -1, this.f47566h);
            long j11 = dVar.f52125o;
            if (j11 == com.google.android.exoplayer2.j.f46377b) {
                long j12 = this.f47566h.f47518e;
                if (j12 != com.google.android.exoplayer2.j.f46377b) {
                    dVar.f52125o = j12 - jE;
                }
            } else {
                dVar.f52125o = m.e(dVar.f52128r + j11, -1, this.f47566h) - jE;
            }
            dVar.f52128r = jE;
            return dVar;
        }
    }

    /* JADX INFO: compiled from: ServerSideInsertedAdsMediaSource.java */
    public static final class d implements c0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f47567b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.exoplayer2.source.ads.c f47570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private a f47571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f47572g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f47573h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<a> f47568c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<Long, Pair<u, y>> f47569d = new HashMap();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public com.google.android.exoplayer2.trackselection.j[] f47574i = new com.google.android.exoplayer2.trackselection.j[0];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public d1[] f47575j = new d1[0];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public y[] f47576k = new y[0];

        public d(c0 c0Var, com.google.android.exoplayer2.source.ads.c cVar) {
            this.f47567b = c0Var;
            this.f47570e = cVar;
        }

        private int h(y yVar) {
            String str;
            if (yVar.f49284c == null) {
                return -1;
            }
            int i10 = 0;
            while (true) {
                com.google.android.exoplayer2.trackselection.j[] jVarArr = this.f47574i;
                if (i10 >= jVarArr.length) {
                    return -1;
                }
                com.google.android.exoplayer2.trackselection.j jVar = jVarArr[i10];
                if (jVar != null) {
                    n1 n1VarH = jVar.h();
                    boolean z10 = yVar.f49283b == 0 && n1VarH.equals(s().c(0));
                    for (int i11 = 0; i11 < n1VarH.f48599b; i11++) {
                        a2 a2VarC = n1VarH.c(i11);
                        if (a2VarC.equals(yVar.f49284c) || (z10 && (str = a2VarC.f43582b) != null && str.equals(yVar.f49284c.f43582b))) {
                            return i10;
                        }
                    }
                }
                i10++;
            }
        }

        private long l(a aVar, long j10) {
            if (j10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long jC = m.c(j10, aVar.f47558c, this.f47570e);
            if (jC >= l.P(aVar, this.f47570e)) {
                return Long.MIN_VALUE;
            }
            return jC;
        }

        private long r(a aVar, long j10) {
            long j11 = aVar.f47562g;
            return j10 < j11 ? m.g(j11, aVar.f47558c, this.f47570e) - (aVar.f47562g - j10) : m.g(j10, aVar.f47558c, this.f47570e);
        }

        private void w(a aVar, int i10) {
            y yVar;
            boolean[] zArr = aVar.f47563h;
            if (zArr[i10] || (yVar = this.f47576k[i10]) == null) {
                return;
            }
            zArr[i10] = true;
            aVar.f47559d.j(l.K(aVar, yVar, this.f47570e));
        }

        public void A(a aVar, y yVar) {
            int iH = h(yVar);
            if (iH != -1) {
                this.f47576k[iH] = yVar;
                aVar.f47563h[iH] = true;
            }
        }

        public void B(u uVar) {
            this.f47569d.remove(Long.valueOf(uVar.f49173a));
        }

        public void C(u uVar, y yVar) {
            this.f47569d.put(Long.valueOf(uVar.f49173a), Pair.create(uVar, yVar));
        }

        public void D(a aVar, long j10) {
            aVar.f47562g = j10;
            if (this.f47572g) {
                if (this.f47573h) {
                    ((c0.a) com.google.android.exoplayer2.util.a.g(aVar.f47561f)).q(aVar);
                }
            } else {
                this.f47572g = true;
                this.f47567b.r(this, m.g(j10, aVar.f47558c, this.f47570e));
            }
        }

        public int E(a aVar, int i10, b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i11) {
            int iC = ((d1) u0.k(this.f47575j[i10])).c(b2Var, decoderInputBuffer, i11 | 1 | 4);
            long jL = l(aVar, decoderInputBuffer.f44490g);
            if ((iC == -4 && jL == Long.MIN_VALUE) || (iC == -3 && j(aVar) == Long.MIN_VALUE && !decoderInputBuffer.f44489f)) {
                w(aVar, i10);
                decoderInputBuffer.f();
                decoderInputBuffer.e(4);
                return -4;
            }
            if (iC == -4) {
                w(aVar, i10);
                ((d1) u0.k(this.f47575j[i10])).c(b2Var, decoderInputBuffer, i11);
                decoderInputBuffer.f44490g = jL;
            }
            return iC;
        }

        public long F(a aVar) {
            if (!aVar.equals(this.f47568c.get(0))) {
                return com.google.android.exoplayer2.j.f46377b;
            }
            long jK = this.f47567b.k();
            return jK == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.j.f46377b : m.c(jK, aVar.f47558c, this.f47570e);
        }

        public void G(a aVar, long j10) {
            this.f47567b.f(r(aVar, j10));
        }

        public void H(f0 f0Var) {
            f0Var.k(this.f47567b);
        }

        public void I(a aVar) {
            if (aVar.equals(this.f47571f)) {
                this.f47571f = null;
                this.f47569d.clear();
            }
            this.f47568c.remove(aVar);
        }

        public long J(a aVar, long j10) {
            return m.c(this.f47567b.j(m.g(j10, aVar.f47558c, this.f47570e)), aVar.f47558c, this.f47570e);
        }

        public long K(a aVar, com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
            aVar.f47562g = j10;
            if (!aVar.equals(this.f47568c.get(0))) {
                for (int i10 = 0; i10 < jVarArr.length; i10++) {
                    com.google.android.exoplayer2.trackselection.j jVar = jVarArr[i10];
                    boolean z10 = true;
                    if (jVar != null) {
                        if (zArr[i10] && d1VarArr[i10] != null) {
                            z10 = false;
                        }
                        zArr2[i10] = z10;
                        if (z10) {
                            d1VarArr[i10] = u0.c(this.f47574i[i10], jVar) ? new b(aVar, i10) : new r();
                        }
                    } else {
                        d1VarArr[i10] = null;
                        zArr2[i10] = true;
                    }
                }
                return j10;
            }
            this.f47574i = (com.google.android.exoplayer2.trackselection.j[]) Arrays.copyOf(jVarArr, jVarArr.length);
            long jG = m.g(j10, aVar.f47558c, this.f47570e);
            d1[] d1VarArr2 = this.f47575j;
            d1[] d1VarArr3 = d1VarArr2.length == 0 ? new d1[jVarArr.length] : (d1[]) Arrays.copyOf(d1VarArr2, d1VarArr2.length);
            long jL = this.f47567b.l(jVarArr, zArr, d1VarArr3, zArr2, jG);
            this.f47575j = (d1[]) Arrays.copyOf(d1VarArr3, d1VarArr3.length);
            this.f47576k = (y[]) Arrays.copyOf(this.f47576k, d1VarArr3.length);
            for (int i11 = 0; i11 < d1VarArr3.length; i11++) {
                if (d1VarArr3[i11] == null) {
                    d1VarArr[i11] = null;
                    this.f47576k[i11] = null;
                } else if (d1VarArr[i11] == null || zArr2[i11]) {
                    d1VarArr[i11] = new b(aVar, i11);
                    this.f47576k[i11] = null;
                }
            }
            return m.c(jL, aVar.f47558c, this.f47570e);
        }

        public int L(a aVar, int i10, long j10) {
            return ((d1) u0.k(this.f47575j[i10])).n(m.g(j10, aVar.f47558c, this.f47570e));
        }

        public void M(com.google.android.exoplayer2.source.ads.c cVar) {
            this.f47570e = cVar;
        }

        public void d(a aVar) {
            this.f47568c.add(aVar);
        }

        public boolean e(f0.a aVar, long j10) {
            a aVar2 = (a) l1.w(this.f47568c);
            return m.g(j10, aVar, this.f47570e) == m.g(l.P(aVar2, this.f47570e), aVar2.f47558c, this.f47570e);
        }

        public boolean f(a aVar, long j10) {
            a aVar2 = this.f47571f;
            if (aVar2 != null && !aVar.equals(aVar2)) {
                for (Pair<u, y> pair : this.f47569d.values()) {
                    aVar2.f47559d.v((u) pair.first, l.K(aVar2, (y) pair.second, this.f47570e));
                    aVar.f47559d.B((u) pair.first, l.K(aVar, (y) pair.second, this.f47570e));
                }
            }
            this.f47571f = aVar;
            return this.f47567b.d(r(aVar, j10));
        }

        public void g(a aVar, long j10, boolean z10) {
            this.f47567b.v(m.g(j10, aVar.f47558c, this.f47570e), z10);
        }

        public long i(a aVar, long j10, r3 r3Var) {
            return m.c(this.f47567b.h(m.g(j10, aVar.f47558c, this.f47570e), r3Var), aVar.f47558c, this.f47570e);
        }

        public long j(a aVar) {
            return l(aVar, this.f47567b.e());
        }

        @p0
        public a k(@p0 y yVar) {
            if (yVar == null || yVar.f49287f == com.google.android.exoplayer2.j.f46377b) {
                return null;
            }
            for (int i10 = 0; i10 < this.f47568c.size(); i10++) {
                a aVar = this.f47568c.get(i10);
                long jC = m.c(u0.U0(yVar.f49287f), aVar.f47558c, this.f47570e);
                long jP = l.P(aVar, this.f47570e);
                if (jC >= 0 && jC < jP) {
                    return aVar;
                }
            }
            return null;
        }

        public long m(a aVar) {
            return l(aVar, this.f47567b.g());
        }

        public List<StreamKey> o(List<com.google.android.exoplayer2.trackselection.j> list) {
            return this.f47567b.i(list);
        }

        @Override // com.google.android.exoplayer2.source.c0.a
        public void q(c0 c0Var) {
            this.f47573h = true;
            for (int i10 = 0; i10 < this.f47568c.size(); i10++) {
                a aVar = this.f47568c.get(i10);
                c0.a aVar2 = aVar.f47561f;
                if (aVar2 != null) {
                    aVar2.q(aVar);
                }
            }
        }

        public p1 s() {
            return this.f47567b.o();
        }

        public boolean t(a aVar) {
            return aVar.equals(this.f47571f) && this.f47567b.a();
        }

        public boolean u(int i10) {
            return ((d1) u0.k(this.f47575j[i10])).isReady();
        }

        public boolean v() {
            return this.f47568c.isEmpty();
        }

        public void x(int i10) throws IOException {
            ((d1) u0.k(this.f47575j[i10])).b();
        }

        public void y() throws IOException {
            this.f47567b.u();
        }

        @Override // com.google.android.exoplayer2.source.e1.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void n(c0 c0Var) {
            a aVar = this.f47571f;
            if (aVar == null) {
                return;
            }
            ((c0.a) com.google.android.exoplayer2.util.a.g(aVar.f47561f)).n(this.f47571f);
        }
    }

    public l(f0 f0Var) {
        this.f47549h = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y K(a aVar, y yVar, com.google.android.exoplayer2.source.ads.c cVar) {
        return new y(yVar.f49282a, yVar.f49283b, yVar.f49284c, yVar.f49285d, yVar.f49286e, M(yVar.f49287f, aVar, cVar), M(yVar.f49288g, aVar, cVar));
    }

    private static long M(long j10, a aVar, com.google.android.exoplayer2.source.ads.c cVar) {
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        long jU0 = u0.U0(j10);
        f0.a aVar2 = aVar.f47558c;
        return u0.B1(aVar2.c() ? m.d(jU0, aVar2.f47720b, aVar2.f47721c, cVar) : m.e(jU0, -1, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long P(a aVar, com.google.android.exoplayer2.source.ads.c cVar) {
        f0.a aVar2 = aVar.f47558c;
        if (aVar2.c()) {
            com.google.android.exoplayer2.source.ads.c.a aVarE = cVar.e(aVar2.f47720b);
            if (aVarE.f47530c == -1) {
                return 0L;
            }
            return aVarE.f47533f[aVar2.f47721c];
        }
        int i10 = aVar2.f47723e;
        if (i10 == -1) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.e(i10).f47529b;
        if (j10 == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    @p0
    private a R(@p0 f0.a aVar, @p0 y yVar, boolean z10) {
        if (aVar == null) {
            return null;
        }
        List<d> listV = this.f47550i.v(Long.valueOf(aVar.f47722d));
        if (listV.isEmpty()) {
            return null;
        }
        if (z10) {
            d dVar = (d) l1.w(listV);
            return dVar.f47571f != null ? dVar.f47571f : (a) l1.w(dVar.f47568c);
        }
        for (int i10 = 0; i10 < listV.size(); i10++) {
            a aVarK = listV.get(i10).k(yVar);
            if (aVarK != null) {
                return aVarK;
            }
        }
        return (a) listV.get(0).f47568c.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(com.google.android.exoplayer2.source.ads.c cVar) {
        Iterator<d> it = this.f47550i.values().iterator();
        while (it.hasNext()) {
            it.next().M(cVar);
        }
        d dVar = this.f47554m;
        if (dVar != null) {
            dVar.M(cVar);
        }
        this.f47556o = cVar;
        if (this.f47555n != null) {
            E(new c(this.f47555n, cVar));
        }
    }

    private void V() {
        d dVar = this.f47554m;
        if (dVar != null) {
            dVar.H(this.f47549h);
            this.f47554m = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.n0
    public void A(int i10, @p0 f0.a aVar, u uVar, y yVar) {
        a aVarR = R(aVar, yVar, true);
        if (aVarR == null) {
            this.f47551j.s(uVar, yVar);
        } else {
            aVarR.f47557b.B(uVar);
            aVarR.f47559d.s(uVar, K(aVarR, yVar, this.f47556o));
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B() {
        this.f47549h.l(this);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        Handler handlerY = u0.y();
        synchronized (this) {
            this.f47553l = handlerY;
        }
        this.f47549h.j(handlerY, this);
        this.f47549h.o(handlerY, this);
        this.f47549h.d(this, u0Var);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
        V();
        this.f47555n = null;
        synchronized (this) {
            this.f47553l = null;
        }
        this.f47549h.a(this);
        this.f47549h.b(this);
        this.f47549h.r(this);
    }

    @Override // com.google.android.exoplayer2.source.n0
    public void G(int i10, f0.a aVar, y yVar) {
        a aVarR = R(aVar, yVar, false);
        if (aVarR == null) {
            this.f47551j.E(yVar);
        } else {
            aVarR.f47559d.E(K(aVarR, yVar, this.f47556o));
        }
    }

    @Override // com.google.android.exoplayer2.drm.s
    public void L(int i10, @p0 f0.a aVar) {
        a aVarR = R(aVar, null, false);
        if (aVarR == null) {
            this.f47552k.h();
        } else {
            aVarR.f47560e.h();
        }
    }

    @Override // com.google.android.exoplayer2.drm.s
    public void N(int i10, @p0 f0.a aVar, int i11) {
        a aVarR = R(aVar, null, true);
        if (aVarR == null) {
            this.f47552k.k(i11);
        } else {
            aVarR.f47560e.k(i11);
        }
    }

    @Override // com.google.android.exoplayer2.source.n0
    public void O(int i10, @p0 f0.a aVar, u uVar, y yVar, IOException iOException, boolean z10) {
        a aVarR = R(aVar, yVar, true);
        if (aVarR == null) {
            this.f47551j.y(uVar, yVar, iOException, z10);
            return;
        }
        if (z10) {
            aVarR.f47557b.B(uVar);
        }
        aVarR.f47559d.y(uVar, K(aVarR, yVar, this.f47556o), iOException, z10);
    }

    @Override // com.google.android.exoplayer2.drm.s
    public void Q(int i10, @p0 f0.a aVar) {
        a aVarR = R(aVar, null, false);
        if (aVarR == null) {
            this.f47552k.j();
        } else {
            aVarR.f47560e.j();
        }
    }

    @Override // com.google.android.exoplayer2.source.n0
    public void T(int i10, @p0 f0.a aVar, y yVar) {
        a aVarR = R(aVar, yVar, false);
        if (aVarR == null) {
            this.f47551j.j(yVar);
        } else {
            aVarR.f47557b.A(aVarR, yVar);
            aVarR.f47559d.j(K(aVarR, yVar, this.f47556o));
        }
    }

    @Override // com.google.android.exoplayer2.source.n0
    public void U(int i10, @p0 f0.a aVar, u uVar, y yVar) {
        a aVarR = R(aVar, yVar, true);
        if (aVarR == null) {
            this.f47551j.B(uVar, yVar);
        } else {
            aVarR.f47557b.C(uVar, yVar);
            aVarR.f47559d.B(uVar, K(aVarR, yVar, this.f47556o));
        }
    }

    @Override // com.google.android.exoplayer2.drm.s
    public void W(int i10, @p0 f0.a aVar) {
        a aVarR = R(aVar, null, false);
        if (aVarR == null) {
            this.f47552k.i();
        } else {
            aVarR.f47560e.i();
        }
    }

    public void X(final com.google.android.exoplayer2.source.ads.c cVar) {
        com.google.android.exoplayer2.util.a.a(cVar.f47516c >= this.f47556o.f47516c);
        for (int i10 = cVar.f47519f; i10 < cVar.f47516c; i10++) {
            com.google.android.exoplayer2.source.ads.c.a aVarE = cVar.e(i10);
            com.google.android.exoplayer2.util.a.a(aVarE.f47535h);
            if (i10 < this.f47556o.f47516c) {
                com.google.android.exoplayer2.util.a.a(m.b(cVar, i10) >= m.b(this.f47556o, i10));
            }
            if (aVarE.f47529b == Long.MIN_VALUE) {
                com.google.android.exoplayer2.util.a.a(m.b(cVar, i10) == 0);
            }
        }
        synchronized (this) {
            Handler handler = this.f47553l;
            if (handler == null) {
                this.f47556o = cVar;
            } else {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47547b.S(cVar);
                    }
                });
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.s
    public /* synthetic */ void Y(int i10, f0.a aVar) {
        com.google.android.exoplayer2.drm.l.d(this, i10, aVar);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f47549h.c();
    }

    @Override // com.google.android.exoplayer2.source.f0.b
    public void e(f0 f0Var, z3 z3Var) {
        this.f47555n = z3Var;
        if (com.google.android.exoplayer2.source.ads.c.f47508m.equals(this.f47556o)) {
            return;
        }
        E(new c(z3Var, this.f47556o));
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() throws IOException {
        this.f47549h.f();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        d dVar = this.f47554m;
        if (dVar != null) {
            this.f47554m = null;
            this.f47550i.put(Long.valueOf(aVar.f47722d), dVar);
        } else {
            dVar = (d) l1.x(this.f47550i.v(Long.valueOf(aVar.f47722d)), null);
            if (dVar == null || !dVar.e(aVar, j10)) {
                dVar = new d(this.f47549h.h(new f0.a(aVar.f47719a, aVar.f47722d), bVar, m.g(j10, aVar, this.f47556o)), this.f47556o);
                this.f47550i.put(Long.valueOf(aVar.f47722d), dVar);
            }
        }
        a aVar2 = new a(dVar, aVar, x(aVar), v(aVar));
        dVar.d(aVar2);
        return aVar2;
    }

    @Override // com.google.android.exoplayer2.drm.s
    public void j0(int i10, @p0 f0.a aVar, Exception exc) {
        a aVarR = R(aVar, null, false);
        if (aVarR == null) {
            this.f47552k.l(exc);
        } else {
            aVarR.f47560e.l(exc);
        }
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        a aVar = (a) c0Var;
        aVar.f47557b.I(aVar);
        if (aVar.f47557b.v()) {
            this.f47550i.remove(Long.valueOf(aVar.f47558c.f47722d), aVar.f47557b);
            if (this.f47550i.isEmpty()) {
                this.f47554m = aVar.f47557b;
            } else {
                aVar.f47557b.H(this.f47549h);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.n0
    public void q0(int i10, @p0 f0.a aVar, u uVar, y yVar) {
        a aVarR = R(aVar, yVar, true);
        if (aVarR == null) {
            this.f47551j.v(uVar, yVar);
        } else {
            aVarR.f47557b.B(uVar);
            aVarR.f47559d.v(uVar, K(aVarR, yVar, this.f47556o));
        }
    }

    @Override // com.google.android.exoplayer2.drm.s
    public void r0(int i10, @p0 f0.a aVar) {
        a aVarR = R(aVar, null, false);
        if (aVarR == null) {
            this.f47552k.m();
        } else {
            aVarR.f47560e.m();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void z() {
        V();
        this.f47549h.m(this);
    }
}
