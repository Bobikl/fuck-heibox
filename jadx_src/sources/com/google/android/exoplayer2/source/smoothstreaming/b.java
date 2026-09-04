package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.mp4.p;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.h;
import com.google.android.exoplayer2.source.chunk.k;
import com.google.android.exoplayer2.source.chunk.n;
import com.google.android.exoplayer2.trackselection.j;
import com.google.android.exoplayer2.trackselection.v;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.u0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: DefaultSsChunkSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f49042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.chunk.g[] f49044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f49045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f49046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f49047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private IOException f49049h;

    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o.a f49050a;

        public a(o.a aVar) {
            this.f49050a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.c.a
        public c a(h0 h0Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, j jVar, @p0 u0 u0Var) {
            o oVarA = this.f49050a.a();
            if (u0Var != null) {
                oVarA.e(u0Var);
            }
            return new b(h0Var, aVar, i10, jVar, oVarA);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class C0388b extends com.google.android.exoplayer2.source.chunk.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b f49051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f49052f;

        public C0388b(com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar, int i10, int i11) {
            super(i11, bVar.f49160k - 1);
            this.f49051e = bVar;
            this.f49052f = i10;
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long a() {
            return c() + this.f49051e.c((int) f());
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long c() {
            e();
            return this.f49051e.e((int) f());
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public r d() {
            e();
            return new r(this.f49051e.a(this.f49052f, (int) f()));
        }
    }

    public b(h0 h0Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, j jVar, o oVar) {
        this.f49042a = h0Var;
        this.f49047f = aVar;
        this.f49043b = i10;
        this.f49046e = jVar;
        this.f49045d = oVar;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f49140f[i10];
        this.f49044c = new com.google.android.exoplayer2.source.chunk.g[jVar.length()];
        int i11 = 0;
        while (i11 < this.f49044c.length) {
            int iE = jVar.e(i11);
            a2 a2Var = bVar.f49159j[iE];
            p[] pVarArr = a2Var.f43596p != null ? ((com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0389a) com.google.android.exoplayer2.util.a.g(aVar.f49139e)).f49145c : null;
            int i12 = bVar.f49150a;
            int i13 = i11;
            this.f49044c[i13] = new com.google.android.exoplayer2.source.chunk.e(new com.google.android.exoplayer2.extractor.mp4.g(3, null, new com.google.android.exoplayer2.extractor.mp4.o(iE, i12, bVar.f49152c, com.google.android.exoplayer2.j.f46377b, aVar.f49141g, a2Var, 0, pVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f49150a, a2Var);
            i11 = i13 + 1;
        }
    }

    private static n k(a2 a2Var, o oVar, Uri uri, int i10, long j10, long j11, long j12, int i11, @p0 Object obj, com.google.android.exoplayer2.source.chunk.g gVar) {
        return new k(oVar, new r(uri), a2Var, i11, obj, j10, j11, j12, com.google.android.exoplayer2.j.f46377b, i10, 1, j10, gVar);
    }

    private long l(long j10) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f49047f;
        if (!aVar.f49138d) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f49140f[this.f49043b];
        int i10 = bVar.f49160k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.c
    public void a(j jVar) {
        this.f49046e = jVar;
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public void b() throws IOException {
        IOException iOException = this.f49049h;
        if (iOException != null) {
            throw iOException;
        }
        this.f49042a.b();
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public boolean c(long j10, com.google.android.exoplayer2.source.chunk.f fVar, List<? extends n> list) {
        if (this.f49049h != null) {
            return false;
        }
        return this.f49046e.d(j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public boolean d(com.google.android.exoplayer2.source.chunk.f fVar, boolean z10, g0.d dVar, g0 g0Var) {
        g0.b bVarB = g0Var.b(v.a(this.f49046e), dVar);
        if (z10 && bVarB != null && bVarB.f51117a == 2) {
            j jVar = this.f49046e;
            if (jVar.o(jVar.t(fVar.f47650d), bVarB.f51118b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public int e(long j10, List<? extends n> list) {
        return (this.f49049h != null || this.f49046e.length() < 2) ? list.size() : this.f49046e.j(j10, list);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.c
    public void f(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = this.f49047f.f49140f;
        int i10 = this.f49043b;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i10];
        int i11 = bVar.f49160k;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar2 = aVar.f49140f[i10];
        if (i11 == 0 || bVar2.f49160k == 0) {
            this.f49048g += i11;
        } else {
            int i12 = i11 - 1;
            long jE = bVar.e(i12) + bVar.c(i12);
            long jE2 = bVar2.e(0);
            if (jE <= jE2) {
                this.f49048g += i11;
            } else {
                this.f49048g += bVar.d(jE2);
            }
        }
        this.f49047f = aVar;
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public void g(com.google.android.exoplayer2.source.chunk.f fVar) {
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public long h(long j10, r3 r3Var) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = this.f49047f.f49140f[this.f49043b];
        int iD = bVar.d(j10);
        long jE = bVar.e(iD);
        return r3Var.a(j10, jE, (jE >= j10 || iD >= bVar.f49160k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public final void j(long j10, long j11, List<? extends n> list, h hVar) {
        int iG;
        long j12 = j11;
        if (this.f49049h != null) {
            return;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f49047f;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f49140f[this.f49043b];
        if (bVar.f49160k == 0) {
            hVar.f47657b = !aVar.f49138d;
            return;
        }
        if (list.isEmpty()) {
            iG = bVar.d(j12);
        } else {
            iG = (int) (list.get(list.size() - 1).g() - ((long) this.f49048g));
            if (iG < 0) {
                this.f49049h = new BehindLiveWindowException();
                return;
            }
        }
        if (iG >= bVar.f49160k) {
            hVar.f47657b = !this.f49047f.f49138d;
            return;
        }
        long j13 = j12 - j10;
        long jL = l(j10);
        int length = this.f49046e.length();
        com.google.android.exoplayer2.source.chunk.o[] oVarArr = new com.google.android.exoplayer2.source.chunk.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = new C0388b(bVar, this.f49046e.e(i10), iG);
        }
        this.f49046e.k(j10, j13, jL, list, oVarArr);
        long jE = bVar.e(iG);
        long jC = jE + bVar.c(iG);
        if (!list.isEmpty()) {
            j12 = com.google.android.exoplayer2.j.f46377b;
        }
        long j14 = j12;
        int i11 = iG + this.f49048g;
        int iA = this.f49046e.a();
        hVar.f47656a = k(this.f49046e.m(), this.f49045d, bVar.a(this.f49046e.e(iA), iG), i11, jE, jC, j14, this.f49046e.u(), this.f49046e.r(), this.f49044c[iA]);
    }

    @Override // com.google.android.exoplayer2.source.chunk.j
    public void release() {
        for (com.google.android.exoplayer2.source.chunk.g gVar : this.f49044c) {
            gVar.release();
        }
    }
}
