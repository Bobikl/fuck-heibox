package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i1 implements c0, Loader.b<c> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f48460p = "SingleSampleMediaPeriod";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f48461q = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.r f48462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o.a f48463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.exoplayer2.upstream.u0 f48464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g0 f48465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0.a f48466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p1 f48467g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f48469i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final a2 f48471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f48472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f48473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    byte[] f48474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f48475o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList<b> f48468h = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Loader f48470j = new Loader(f48460p);

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public final class b implements d1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f48476e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f48477f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f48478g = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48480c;

        private b() {
        }

        private void a() {
            if (this.f48480c) {
                return;
            }
            i1.this.f48466f.i(com.google.android.exoplayer2.util.y.l(i1.this.f48471k.f43593m), i1.this.f48471k, 0, null, 0L);
            this.f48480c = true;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() throws IOException {
            i1 i1Var = i1.this;
            if (i1Var.f48472l) {
                return;
            }
            i1Var.f48470j.b();
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            a();
            i1 i1Var = i1.this;
            boolean z10 = i1Var.f48473m;
            if (z10 && i1Var.f48474n == null) {
                this.f48479b = 2;
            }
            int i11 = this.f48479b;
            if (i11 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                b2Var.f44366b = i1Var.f48471k;
                this.f48479b = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            com.google.android.exoplayer2.util.a.g(i1Var.f48474n);
            decoderInputBuffer.e(1);
            decoderInputBuffer.f44490g = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.o(i1.this.f48475o);
                ByteBuffer byteBuffer = decoderInputBuffer.f44488e;
                i1 i1Var2 = i1.this;
                byteBuffer.put(i1Var2.f48474n, 0, i1Var2.f48475o);
            }
            if ((i10 & 1) == 0) {
                this.f48479b = 2;
            }
            return -4;
        }

        public void d() {
            if (this.f48479b == 2) {
                this.f48479b = 1;
            }
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return i1.this.f48473m;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            a();
            if (j10 <= 0 || this.f48479b == 2) {
                return 0;
            }
            this.f48479b = 2;
            return 1;
        }
    }

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48482a = u.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.r f48483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.r0 f48484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f48485d;

        public c(com.google.android.exoplayer2.upstream.r rVar, com.google.android.exoplayer2.upstream.o oVar) {
            this.f48483b = rVar;
            this.f48484c = new com.google.android.exoplayer2.upstream.r0(oVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() throws IOException {
            this.f48484c.y();
            try {
                this.f48484c.a(this.f48483b);
                int i10 = 0;
                while (i10 != -1) {
                    int iP = (int) this.f48484c.p();
                    byte[] bArr = this.f48485d;
                    if (bArr == null) {
                        this.f48485d = new byte[1024];
                    } else if (iP == bArr.length) {
                        this.f48485d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    com.google.android.exoplayer2.upstream.r0 r0Var = this.f48484c;
                    byte[] bArr2 = this.f48485d;
                    i10 = r0Var.read(bArr2, iP, bArr2.length - iP);
                }
            } finally {
                com.google.android.exoplayer2.upstream.q.a(this.f48484c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
        }
    }

    public i1(com.google.android.exoplayer2.upstream.r rVar, com.google.android.exoplayer2.upstream.o.a aVar, @androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var, a2 a2Var, long j10, com.google.android.exoplayer2.upstream.g0 g0Var, n0.a aVar2, boolean z10) {
        this.f48462b = rVar;
        this.f48463c = aVar;
        this.f48464d = u0Var;
        this.f48471k = a2Var;
        this.f48469i = j10;
        this.f48465e = g0Var;
        this.f48466f = aVar2;
        this.f48472l = z10;
        this.f48467g = new p1(new n1(a2Var));
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f48470j.k();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void p(c cVar, long j10, long j11, boolean z10) {
        com.google.android.exoplayer2.upstream.r0 r0Var = cVar.f48484c;
        u uVar = new u(cVar.f48482a, cVar.f48483b, r0Var.w(), r0Var.x(), j10, j11, r0Var.p());
        this.f48465e.c(cVar.f48482a);
        this.f48466f.r(uVar, 1, -1, null, 0, null, 0L, this.f48469i);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        if (this.f48473m || this.f48470j.k() || this.f48470j.j()) {
            return false;
        }
        com.google.android.exoplayer2.upstream.o oVarA = this.f48463c.a();
        com.google.android.exoplayer2.upstream.u0 u0Var = this.f48464d;
        if (u0Var != null) {
            oVarA.e(u0Var);
        }
        c cVar = new c(this.f48462b, oVarA);
        this.f48466f.A(new u(cVar.f48482a, this.f48462b, this.f48470j.n(cVar, this, this.f48465e.d(1))), 1, -1, this.f48471k, 0, null, 0L, this.f48469i);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        return this.f48473m ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        return (this.f48473m || this.f48470j.k()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public /* synthetic */ List i(List list) {
        return b0.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        for (int i10 = 0; i10 < this.f48468h.size(); i10++) {
            this.f48468h.get(i10).d();
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        return com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            if (d1Var != null && (jVarArr[i10] == null || !zArr[i10])) {
                this.f48468h.remove(d1Var);
                d1VarArr[i10] = null;
            }
            if (d1VarArr[i10] == null && jVarArr[i10] != null) {
                b bVar = new b();
                this.f48468h.add(bVar);
                d1VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void q(c cVar, long j10, long j11) {
        this.f48475o = (int) cVar.f48484c.p();
        this.f48474n = (byte[]) com.google.android.exoplayer2.util.a.g(cVar.f48485d);
        this.f48473m = true;
        com.google.android.exoplayer2.upstream.r0 r0Var = cVar.f48484c;
        u uVar = new u(cVar.f48482a, cVar.f48483b, r0Var.w(), r0Var.x(), j10, j11, this.f48475o);
        this.f48465e.c(cVar.f48482a);
        this.f48466f.u(uVar, 1, -1, this.f48471k, 0, null, 0L, this.f48469i);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Loader.c s(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarI;
        com.google.android.exoplayer2.upstream.r0 r0Var = cVar.f48484c;
        u uVar = new u(cVar.f48482a, cVar.f48483b, r0Var.w(), r0Var.x(), j10, j11, r0Var.p());
        long jA = this.f48465e.a(new com.google.android.exoplayer2.upstream.g0.d(uVar, new y(1, -1, this.f48471k, 0, null, 0L, com.google.android.exoplayer2.util.u0.B1(this.f48469i)), iOException, i10));
        boolean z10 = jA == com.google.android.exoplayer2.j.f46377b || i10 >= this.f48465e.d(1);
        if (this.f48472l && z10) {
            com.google.android.exoplayer2.util.u.n(f48460p, "Loading failed, treating as end-of-stream.", iOException);
            this.f48473m = true;
            cVarI = Loader.f50885k;
        } else {
            cVarI = jA != com.google.android.exoplayer2.j.f46377b ? Loader.i(false, jA) : Loader.f50886l;
        }
        Loader.c cVar2 = cVarI;
        boolean z11 = !cVar2.c();
        this.f48466f.w(uVar, 1, -1, this.f48471k, 0, null, 0L, this.f48469i, iOException, z11);
        if (z11) {
            this.f48465e.c(cVar.f48482a);
        }
        return cVar2;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        return this.f48467g;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        aVar.q(this);
    }

    public void t() {
        this.f48470j.l();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() {
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
    }
}
