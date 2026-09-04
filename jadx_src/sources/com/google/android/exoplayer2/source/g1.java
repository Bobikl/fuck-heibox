package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.r3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SilenceMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g1 extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f48010j = "SilenceMediaSource";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f48011k = 44100;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f48012l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f48013m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a2 f48014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final i2 f48015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f48016p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f48017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i2 f48018i;

    /* JADX INFO: compiled from: SilenceMediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f48019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f48020b;

        public g1 a() {
            com.google.android.exoplayer2.util.a.i(this.f48019a > 0);
            return new g1(this.f48019a, g1.f48015o.c().J(this.f48020b).a());
        }

        public b b(@androidx.annotation.f0(from = 1) long j10) {
            this.f48019a = j10;
            return this;
        }

        public b c(@androidx.annotation.p0 Object obj) {
            this.f48020b = obj;
            return this;
        }
    }

    /* JADX INFO: compiled from: SilenceMediaSource.java */
    public static final class c implements c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final p1 f48021d = new p1(new n1(g1.f48014n));

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<d1> f48023c = new ArrayList<>();

        public c(long j10) {
            this.f48022b = j10;
        }

        private long b(long j10) {
            return com.google.android.exoplayer2.util.u0.t(j10, 0L, this.f48022b);
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public boolean a() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public boolean d(long j10) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public long e() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public void f(long j10) {
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public long g() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long h(long j10, r3 r3Var) {
            return b(j10);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public /* synthetic */ List i(List list) {
            return b0.a(this, list);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long j(long j10) {
            long jB = b(j10);
            for (int i10 = 0; i10 < this.f48023c.size(); i10++) {
                ((d) this.f48023c.get(i10)).a(jB);
            }
            return jB;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long k() {
            return com.google.android.exoplayer2.j.f46377b;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
            long jB = b(j10);
            for (int i10 = 0; i10 < jVarArr.length; i10++) {
                d1 d1Var = d1VarArr[i10];
                if (d1Var != null && (jVarArr[i10] == null || !zArr[i10])) {
                    this.f48023c.remove(d1Var);
                    d1VarArr[i10] = null;
                }
                if (d1VarArr[i10] == null && jVarArr[i10] != null) {
                    d dVar = new d(this.f48022b);
                    dVar.a(jB);
                    this.f48023c.add(dVar);
                    d1VarArr[i10] = dVar;
                    zArr2[i10] = true;
                }
            }
            return jB;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public p1 o() {
            return f48021d;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void r(c0.a aVar, long j10) {
            aVar.q(this);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void u() {
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void v(long j10, boolean z10) {
        }
    }

    /* JADX INFO: compiled from: SilenceMediaSource.java */
    public static final class d implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f48026d;

        public d(long j10) {
            this.f48024b = g1.P(j10);
            a(0L);
        }

        public void a(long j10) {
            this.f48026d = com.google.android.exoplayer2.util.u0.t(g1.P(j10), 0L, this.f48024b);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() {
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (!this.f48025c || (i10 & 2) != 0) {
                b2Var.f44366b = g1.f48014n;
                this.f48025c = true;
                return -5;
            }
            long j10 = this.f48024b;
            long j11 = this.f48026d;
            long j12 = j10 - j11;
            if (j12 == 0) {
                decoderInputBuffer.e(4);
                return -4;
            }
            decoderInputBuffer.f44490g = g1.R(j11);
            decoderInputBuffer.e(1);
            int iMin = (int) Math.min(g1.f48016p.length, j12);
            if ((i10 & 4) == 0) {
                decoderInputBuffer.o(iMin);
                decoderInputBuffer.f44488e.put(g1.f48016p, 0, iMin);
            }
            if ((i10 & 1) == 0) {
                this.f48026d += (long) iMin;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            long j11 = this.f48026d;
            a(j10);
            return (int) ((this.f48026d - j11) / ((long) g1.f48016p.length));
        }
    }

    static {
        a2 a2VarE = new a2.b().e0(com.google.android.exoplayer2.util.y.I).H(2).f0(44100).Y(2).E();
        f48014n = a2VarE;
        f48015o = new i2.c().D(f48010j).K(Uri.EMPTY).F(a2VarE.f43593m).a();
        f48016p = new byte[com.google.android.exoplayer2.util.u0.o0(2, 2) * 1024];
    }

    public g1(long j10) {
        this(j10, f48015o);
    }

    private g1(long j10, i2 i2Var) {
        com.google.android.exoplayer2.util.a.a(j10 >= 0);
        this.f48017h = j10;
        this.f48018i = i2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long P(long j10) {
        return ((long) com.google.android.exoplayer2.util.u0.o0(2, 2)) * ((j10 * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long R(long j10) {
        return ((j10 / ((long) com.google.android.exoplayer2.util.u0.o0(2, 2))) * 1000000) / 44100;
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        E(new h1(this.f48017h, true, false, false, (Object) null, this.f48018i));
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f48018i;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        return new c(this.f48017h);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
    }
}
