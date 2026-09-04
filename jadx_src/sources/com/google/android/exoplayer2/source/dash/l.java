package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DefaultDashChunkSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f47827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.dash.b f47828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f47829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f47831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f47832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f47833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final n.c f47834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final b[] f47835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.trackselection.j f47836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.exoplayer2.source.dash.manifest.c f47837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private IOException f47839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47840n;

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.o.a f47841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.chunk.g.a f47843c;

        public a(com.google.android.exoplayer2.source.chunk.g.a aVar, com.google.android.exoplayer2.upstream.o.a aVar2, int i10) {
            this.f47843c = aVar;
            this.f47841a = aVar2;
            this.f47842b = i10;
        }

        public a(com.google.android.exoplayer2.upstream.o.a aVar) {
            this(aVar, 1);
        }

        public a(com.google.android.exoplayer2.upstream.o.a aVar, int i10) {
            this(com.google.android.exoplayer2.source.chunk.e.f47629k, aVar, i10);
        }

        @Override // com.google.android.exoplayer2.source.dash.d.a
        public d a(h0 h0Var, com.google.android.exoplayer2.source.dash.manifest.c cVar, com.google.android.exoplayer2.source.dash.b bVar, int i10, int[] iArr, com.google.android.exoplayer2.trackselection.j jVar, int i11, long j10, boolean z10, List<a2> list, @p0 n.c cVar2, @p0 u0 u0Var) {
            com.google.android.exoplayer2.upstream.o oVarA = this.f47841a.a();
            if (u0Var != null) {
                oVarA.e(u0Var);
            }
            return new l(this.f47843c, h0Var, cVar, bVar, i10, iArr, jVar, i11, oVarA, j10, this.f47842b, z10, list, cVar2);
        }
    }

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        final com.google.android.exoplayer2.source.chunk.g f47844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.dash.manifest.j f47845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.dash.manifest.b f47846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final i f47847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f47848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f47849f;

        b(long j10, com.google.android.exoplayer2.source.dash.manifest.j jVar, com.google.android.exoplayer2.source.dash.manifest.b bVar, @p0 com.google.android.exoplayer2.source.chunk.g gVar, long j11, @p0 i iVar) {
            this.f47848e = j10;
            this.f47845b = jVar;
            this.f47846c = bVar;
            this.f47849f = j11;
            this.f47844a = gVar;
            this.f47847d = iVar;
        }

        @androidx.annotation.j
        b b(long j10, com.google.android.exoplayer2.source.dash.manifest.j jVar) throws BehindLiveWindowException {
            long jE;
            long jE2;
            i iVarL = this.f47845b.l();
            i iVarL2 = jVar.l();
            if (iVarL == null) {
                return new b(j10, jVar, this.f47846c, this.f47844a, this.f47849f, iVarL);
            }
            if (!iVarL.i()) {
                return new b(j10, jVar, this.f47846c, this.f47844a, this.f47849f, iVarL2);
            }
            long jF = iVarL.f(j10);
            if (jF == 0) {
                return new b(j10, jVar, this.f47846c, this.f47844a, this.f47849f, iVarL2);
            }
            long jG = iVarL.g();
            long jC = iVarL.c(jG);
            long j11 = (jF + jG) - 1;
            long jC2 = iVarL.c(j11) + iVarL.a(j11, j10);
            long jG2 = iVarL2.g();
            long jC3 = iVarL2.c(jG2);
            long j12 = this.f47849f;
            if (jC2 != jC3) {
                if (jC2 < jC3) {
                    throw new BehindLiveWindowException();
                }
                if (jC3 < jC) {
                    jE2 = j12 - (iVarL2.e(jC, j10) - jG);
                } else {
                    jE = iVarL.e(jC3, j10);
                }
                return new b(j10, jVar, this.f47846c, this.f47844a, jE2, iVarL2);
            }
            jE = j11 + 1;
            jE2 = j12 + (jE - jG2);
            return new b(j10, jVar, this.f47846c, this.f47844a, jE2, iVarL2);
        }

        @androidx.annotation.j
        b c(i iVar) {
            return new b(this.f47848e, this.f47845b, this.f47846c, this.f47844a, this.f47849f, iVar);
        }

        @androidx.annotation.j
        b d(com.google.android.exoplayer2.source.dash.manifest.b bVar) {
            return new b(this.f47848e, this.f47845b, bVar, this.f47844a, this.f47849f, this.f47847d);
        }

        public long e(long j10) {
            return this.f47847d.b(this.f47848e, j10) + this.f47849f;
        }

        public long f() {
            return this.f47847d.g() + this.f47849f;
        }

        public long g(long j10) {
            return (e(j10) + this.f47847d.j(this.f47848e, j10)) - 1;
        }

        public long h() {
            return this.f47847d.f(this.f47848e);
        }

        public long i(long j10) {
            return k(j10) + this.f47847d.a(j10 - this.f47849f, this.f47848e);
        }

        public long j(long j10) {
            return this.f47847d.e(j10, this.f47848e) + this.f47849f;
        }

        public long k(long j10) {
            return this.f47847d.c(j10 - this.f47849f);
        }

        public com.google.android.exoplayer2.source.dash.manifest.i l(long j10) {
            return this.f47847d.h(j10 - this.f47849f);
        }

        public boolean m(long j10, long j11) {
            return this.f47847d.i() || j11 == com.google.android.exoplayer2.j.f46377b || i(j10) <= j11;
        }
    }

    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class c extends com.google.android.exoplayer2.source.chunk.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f47850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f47851f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f47850e = bVar;
            this.f47851f = j12;
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long a() {
            e();
            return this.f47850e.i(f());
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long c() {
            e();
            return this.f47850e.k(f());
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public r d() {
            e();
            long jF = f();
            com.google.android.exoplayer2.source.dash.manifest.i iVarL = this.f47850e.l(jF);
            int i10 = this.f47850e.m(jF, this.f47851f) ? 0 : 8;
            b bVar = this.f47850e;
            return j.b(bVar.f47845b, bVar.f47846c.f47869a, iVarL, i10);
        }
    }

    public l(com.google.android.exoplayer2.source.chunk.g.a aVar, h0 h0Var, com.google.android.exoplayer2.source.dash.manifest.c cVar, com.google.android.exoplayer2.source.dash.b bVar, int i10, int[] iArr, com.google.android.exoplayer2.trackselection.j jVar, int i11, com.google.android.exoplayer2.upstream.o oVar, long j10, int i12, boolean z10, List<a2> list, @p0 n.c cVar2) {
        this.f47827a = h0Var;
        this.f47837k = cVar;
        this.f47828b = bVar;
        this.f47829c = iArr;
        this.f47836j = jVar;
        this.f47830d = i11;
        this.f47831e = oVar;
        this.f47838l = i10;
        this.f47832f = j10;
        this.f47833g = i12;
        this.f47834h = cVar2;
        long jG = cVar.g(i10);
        ArrayList<com.google.android.exoplayer2.source.dash.manifest.j> arrayListN = n();
        this.f47835i = new b[jVar.length()];
        int i13 = 0;
        while (i13 < this.f47835i.length) {
            com.google.android.exoplayer2.source.dash.manifest.j jVar2 = arrayListN.get(jVar.e(i13));
            com.google.android.exoplayer2.source.dash.manifest.b bVarJ = bVar.j(jVar2.f47924d);
            b[] bVarArr = this.f47835i;
            if (bVarJ == null) {
                bVarJ = jVar2.f47924d.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(jG, jVar2, bVarJ, com.google.android.exoplayer2.source.chunk.e.f47629k.a(i11, jVar2.f47923c, z10, list, cVar2), 0L, jVar2.l());
            i13 = i14 + 1;
        }
    }

    private g0.a k(com.google.android.exoplayer2.trackselection.j jVar, List<com.google.android.exoplayer2.source.dash.manifest.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = jVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (jVar.b(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int iF = com.google.android.exoplayer2.source.dash.b.f(list);
        return new g0.a(iF, iF - this.f47828b.g(list), length, i10);
    }

    private long l(long j10, long j11) {
        if (!this.f47837k.f47876d) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        return Math.max(0L, Math.min(m(j10), this.f47835i[0].i(this.f47835i[0].g(j10))) - j11);
    }

    private long m(long j10) {
        com.google.android.exoplayer2.source.dash.manifest.c cVar = this.f47837k;
        long j11 = cVar.f47873a;
        return j11 == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.j.f46377b : j10 - com.google.android.exoplayer2.util.u0.U0(j11 + cVar.d(this.f47838l).f47908b);
    }

    private ArrayList<com.google.android.exoplayer2.source.dash.manifest.j> n() {
        List<com.google.android.exoplayer2.source.dash.manifest.a> list = this.f47837k.d(this.f47838l).f47909c;
        ArrayList<com.google.android.exoplayer2.source.dash.manifest.j> arrayList = new ArrayList<>();
        for (int i10 : this.f47829c) {
            arrayList.addAll(list.get(i10).f47863c);
        }
        return arrayList;
    }

    private long o(b bVar, @p0 com.google.android.exoplayer2.source.chunk.n nVar, long j10, long j11, long j12) {
        return nVar != null ? nVar.g() : com.google.android.exoplayer2.util.u0.t(bVar.j(j10), j11, j12);
    }

    private b r(int i10) {
        b bVar = this.f47835i[i10];
        com.google.android.exoplayer2.source.dash.manifest.b bVarJ = this.f47828b.j(bVar.f47845b.f47924d);
        if (bVarJ == null || bVarJ.equals(bVar.f47846c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f47835i[i10] = bVarD;
        return bVarD;
    }

    @Override // com.google.android.exoplayer2.source.dash.d
    public void a(com.google.android.exoplayer2.trackselection.j jVar) {
        this.f47836j = jVar;
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public void b() throws IOException {
        IOException iOException = this.f47839m;
        if (iOException != null) {
            throw iOException;
        }
        this.f47827a.b();
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public boolean c(long j10, com.google.android.exoplayer2.source.chunk.f fVar, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        if (this.f47839m != null) {
            return false;
        }
        return this.f47836j.d(j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public boolean d(com.google.android.exoplayer2.source.chunk.f fVar, boolean z10, g0.d dVar, g0 g0Var) {
        g0.b bVarB;
        if (!z10) {
            return false;
        }
        n.c cVar = this.f47834h;
        if (cVar != null && cVar.j(fVar)) {
            return true;
        }
        if (!this.f47837k.f47876d && (fVar instanceof com.google.android.exoplayer2.source.chunk.n)) {
            IOException iOException = dVar.f51121c;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).f50871i == 404) {
                b bVar = this.f47835i[this.f47836j.t(fVar.f47650d)];
                long jH = bVar.h();
                if (jH != -1 && jH != 0) {
                    if (((com.google.android.exoplayer2.source.chunk.n) fVar).g() > (bVar.f() + jH) - 1) {
                        this.f47840n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f47835i[this.f47836j.t(fVar.f47650d)];
        com.google.android.exoplayer2.source.dash.manifest.b bVarJ = this.f47828b.j(bVar2.f47845b.f47924d);
        if (bVarJ != null && !bVar2.f47846c.equals(bVarJ)) {
            return true;
        }
        g0.a aVarK = k(this.f47836j, bVar2.f47845b.f47924d);
        if ((!aVarK.a(2) && !aVarK.a(1)) || (bVarB = g0Var.b(aVarK, dVar)) == null || !aVarK.a(bVarB.f51117a)) {
            return false;
        }
        int i10 = bVarB.f51117a;
        if (i10 == 2) {
            com.google.android.exoplayer2.trackselection.j jVar = this.f47836j;
            return jVar.o(jVar.t(fVar.f47650d), bVarB.f51118b);
        }
        if (i10 != 1) {
            return false;
        }
        this.f47828b.e(bVar2.f47846c, bVarB.f51118b);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public int e(long j10, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        return (this.f47839m != null || this.f47836j.length() < 2) ? list.size() : this.f47836j.j(j10, list);
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public void g(com.google.android.exoplayer2.source.chunk.f fVar) {
        com.google.android.exoplayer2.extractor.e eVarD;
        if (fVar instanceof com.google.android.exoplayer2.source.chunk.m) {
            int iT = this.f47836j.t(((com.google.android.exoplayer2.source.chunk.m) fVar).f47650d);
            b bVar = this.f47835i[iT];
            if (bVar.f47847d == null && (eVarD = bVar.f47844a.d()) != null) {
                this.f47835i[iT] = bVar.c(new k(eVarD, bVar.f47845b.f47925e));
            }
        }
        n.c cVar = this.f47834h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public long h(long j10, r3 r3Var) {
        for (b bVar : this.f47835i) {
            if (bVar.f47847d != null) {
                long j11 = bVar.j(j10);
                long jK = bVar.k(j11);
                long jH = bVar.h();
                return r3Var.a(j10, jK, (jK >= j10 || (jH != -1 && j11 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j11 + 1));
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.dash.d
    public void i(com.google.android.exoplayer2.source.dash.manifest.c cVar, int i10) {
        try {
            this.f47837k = cVar;
            this.f47838l = i10;
            long jG = cVar.g(i10);
            ArrayList<com.google.android.exoplayer2.source.dash.manifest.j> arrayListN = n();
            for (int i11 = 0; i11 < this.f47835i.length; i11++) {
                com.google.android.exoplayer2.source.dash.manifest.j jVar = arrayListN.get(this.f47836j.e(i11));
                b[] bVarArr = this.f47835i;
                bVarArr[i11] = bVarArr[i11].b(jG, jVar);
            }
        } catch (BehindLiveWindowException e10) {
            this.f47839m = e10;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public void j(long j10, long j11, List<? extends com.google.android.exoplayer2.source.chunk.n> list, com.google.android.exoplayer2.source.chunk.h hVar) {
        int i10;
        int i11;
        com.google.android.exoplayer2.source.chunk.o[] oVarArr;
        long j12;
        long j13;
        if (this.f47839m != null) {
            return;
        }
        long j14 = j11 - j10;
        long jU0 = com.google.android.exoplayer2.util.u0.U0(this.f47837k.f47873a) + com.google.android.exoplayer2.util.u0.U0(this.f47837k.d(this.f47838l).f47908b) + j11;
        n.c cVar = this.f47834h;
        if (cVar == null || !cVar.h(jU0)) {
            long jU1 = com.google.android.exoplayer2.util.u0.U0(com.google.android.exoplayer2.util.u0.l0(this.f47832f));
            long jM = m(jU1);
            com.google.android.exoplayer2.source.chunk.n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f47836j.length();
            com.google.android.exoplayer2.source.chunk.o[] oVarArr2 = new com.google.android.exoplayer2.source.chunk.o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f47835i[i12];
                if (bVar.f47847d == null) {
                    oVarArr2[i12] = com.google.android.exoplayer2.source.chunk.o.f47701a;
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = jU1;
                } else {
                    long jE = bVar.e(jU1);
                    long jG = bVar.g(jU1);
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = jU1;
                    long jO = o(bVar, nVar, j11, jE, jG);
                    if (jO < jE) {
                        oVarArr[i10] = com.google.android.exoplayer2.source.chunk.o.f47701a;
                    } else {
                        oVarArr[i10] = new c(r(i10), jO, jG, jM);
                    }
                }
                i12 = i10 + 1;
                jU1 = j13;
                oVarArr2 = oVarArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = jU1;
            this.f47836j.k(j10, j15, l(j16, j10), list, oVarArr2);
            b bVarR = r(this.f47836j.a());
            com.google.android.exoplayer2.source.chunk.g gVar = bVarR.f47844a;
            if (gVar != null) {
                com.google.android.exoplayer2.source.dash.manifest.j jVar = bVarR.f47845b;
                com.google.android.exoplayer2.source.dash.manifest.i iVarN = gVar.e() == null ? jVar.n() : null;
                com.google.android.exoplayer2.source.dash.manifest.i iVarM = bVarR.f47847d == null ? jVar.m() : null;
                if (iVarN != null || iVarM != null) {
                    hVar.f47656a = p(bVarR, this.f47831e, this.f47836j.m(), this.f47836j.u(), this.f47836j.r(), iVarN, iVarM);
                    return;
                }
            }
            long j17 = bVarR.f47848e;
            long j18 = com.google.android.exoplayer2.j.f46377b;
            boolean z10 = j17 != com.google.android.exoplayer2.j.f46377b;
            if (bVarR.h() == 0) {
                hVar.f47657b = z10;
                return;
            }
            long jE2 = bVarR.e(j16);
            long jG2 = bVarR.g(j16);
            long jO2 = o(bVarR, nVar, j11, jE2, jG2);
            if (jO2 < jE2) {
                this.f47839m = new BehindLiveWindowException();
                return;
            }
            if (jO2 > jG2 || (this.f47840n && jO2 >= jG2)) {
                hVar.f47657b = z10;
                return;
            }
            if (z10 && bVarR.k(jO2) >= j17) {
                hVar.f47657b = true;
                return;
            }
            int iMin = (int) Math.min(this.f47833g, (jG2 - jO2) + 1);
            if (j17 != com.google.android.exoplayer2.j.f46377b) {
                while (iMin > 1 && bVarR.k((((long) iMin) + jO2) - 1) >= j17) {
                    iMin--;
                }
            }
            int i13 = iMin;
            if (list.isEmpty()) {
                j18 = j11;
            }
            hVar.f47656a = q(bVarR, this.f47831e, this.f47830d, this.f47836j.m(), this.f47836j.u(), this.f47836j.r(), jO2, i13, j18, jM);
        }
    }

    protected com.google.android.exoplayer2.source.chunk.f p(b bVar, com.google.android.exoplayer2.upstream.o oVar, a2 a2Var, int i10, @p0 Object obj, @p0 com.google.android.exoplayer2.source.dash.manifest.i iVar, @p0 com.google.android.exoplayer2.source.dash.manifest.i iVar2) {
        com.google.android.exoplayer2.source.dash.manifest.i iVar3 = iVar;
        com.google.android.exoplayer2.source.dash.manifest.j jVar = bVar.f47845b;
        if (iVar3 != null) {
            com.google.android.exoplayer2.source.dash.manifest.i iVarA = iVar3.a(iVar2, bVar.f47846c.f47869a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = iVar2;
        }
        return new com.google.android.exoplayer2.source.chunk.m(oVar, j.b(jVar, bVar.f47846c.f47869a, iVar3, 0), a2Var, i10, obj, bVar.f47844a);
    }

    protected com.google.android.exoplayer2.source.chunk.f q(b bVar, com.google.android.exoplayer2.upstream.o oVar, int i10, a2 a2Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        com.google.android.exoplayer2.source.dash.manifest.j jVar = bVar.f47845b;
        long jK = bVar.k(j10);
        com.google.android.exoplayer2.source.dash.manifest.i iVarL = bVar.l(j10);
        if (bVar.f47844a == null) {
            return new com.google.android.exoplayer2.source.chunk.r(oVar, j.b(jVar, bVar.f47846c.f47869a, iVarL, bVar.m(j10, j12) ? 0 : 8), a2Var, i11, obj, jK, bVar.i(j10), j10, i10, a2Var);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            com.google.android.exoplayer2.source.dash.manifest.i iVarA = iVarL.a(bVar.l(((long) i13) + j10), bVar.f47846c.f47869a);
            if (iVarA == null) {
                break;
            }
            i14++;
            i13++;
            iVarL = iVarA;
        }
        long j13 = (((long) i14) + j10) - 1;
        long jI = bVar.i(j13);
        long j14 = bVar.f47848e;
        return new com.google.android.exoplayer2.source.chunk.k(oVar, j.b(jVar, bVar.f47846c.f47869a, iVarL, bVar.m(j13, j12) ? 0 : 8), a2Var, i11, obj, jK, jI, j11, (j14 == com.google.android.exoplayer2.j.f46377b || j14 > jI) ? -9223372036854775807L : j14, j10, i14, -jVar.f47925e, bVar.f47844a);
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public void release() {
        for (b bVar : this.f47835i) {
            com.google.android.exoplayer2.source.chunk.g gVar = bVar.f47844a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
