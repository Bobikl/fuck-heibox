package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.q0;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HlsMediaChunk.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j extends com.google.android.exoplayer2.source.chunk.n {
    public static final String L = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private k C;
    private s D;
    private int E;
    private boolean F;
    private volatile boolean G;
    private boolean H;
    private ImmutableList<Integer> I;
    private boolean J;
    private boolean K;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f48149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f48151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f48152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f48153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private final com.google.android.exoplayer2.upstream.o f48154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private final r f48155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private final k f48156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f48157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f48158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final n0 f48159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f48160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private final List<a2> f48161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private final DrmInitData f48162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.google.android.exoplayer2.metadata.id3.b f48163y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e0 f48164z;

    private j(h hVar, com.google.android.exoplayer2.upstream.o oVar, r rVar, a2 a2Var, boolean z10, @p0 com.google.android.exoplayer2.upstream.o oVar2, @p0 r rVar2, boolean z11, Uri uri, @p0 List<a2> list, int i10, @p0 Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, n0 n0Var, @p0 DrmInitData drmInitData, @p0 k kVar, com.google.android.exoplayer2.metadata.id3.b bVar, e0 e0Var, boolean z15) {
        super(oVar, rVar, a2Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f48153o = i11;
        this.K = z12;
        this.f48150l = i12;
        this.f48155q = rVar2;
        this.f48154p = oVar2;
        this.F = rVar2 != null;
        this.B = z11;
        this.f48151m = uri;
        this.f48157s = z14;
        this.f48159u = n0Var;
        this.f48158t = z13;
        this.f48160v = hVar;
        this.f48161w = list;
        this.f48162x = drmInitData;
        this.f48156r = kVar;
        this.f48163y = bVar;
        this.f48164z = e0Var;
        this.f48152n = z15;
        this.I = ImmutableList.B();
        this.f48149k = M.getAndIncrement();
    }

    private static com.google.android.exoplayer2.upstream.o i(com.google.android.exoplayer2.upstream.o oVar, @p0 byte[] bArr, @p0 byte[] bArr2) {
        if (bArr == null) {
            return oVar;
        }
        com.google.android.exoplayer2.util.a.g(bArr2);
        return new a(oVar, bArr, bArr2);
    }

    public static j j(h hVar, com.google.android.exoplayer2.upstream.o oVar, a2 a2Var, long j10, com.google.android.exoplayer2.source.hls.playlist.g gVar, f.e eVar, Uri uri, @p0 List<a2> list, int i10, @p0 Object obj, boolean z10, v vVar, @p0 j jVar, @p0 byte[] bArr, @p0 byte[] bArr2, boolean z11) {
        com.google.android.exoplayer2.upstream.o oVarI;
        r rVar;
        boolean z12;
        com.google.android.exoplayer2.metadata.id3.b bVar;
        e0 e0Var;
        k kVar;
        com.google.android.exoplayer2.source.hls.playlist.g.f fVar = eVar.f48142a;
        r rVarA = new r.b().j(q0.f(gVar.f48361a, fVar.f48345b)).i(fVar.f48353j).h(fVar.f48354k).c(eVar.f48145d ? 8 : 0).a();
        boolean z13 = bArr != null;
        com.google.android.exoplayer2.upstream.o oVarI2 = i(oVar, bArr, z13 ? l((String) com.google.android.exoplayer2.util.a.g(fVar.f48352i)) : null);
        com.google.android.exoplayer2.source.hls.playlist.g.e eVar2 = fVar.f48346c;
        if (eVar2 != null) {
            boolean z14 = bArr2 != null;
            byte[] bArrL = z14 ? l((String) com.google.android.exoplayer2.util.a.g(eVar2.f48352i)) : null;
            rVar = new r(q0.f(gVar.f48361a, eVar2.f48345b), eVar2.f48353j, eVar2.f48354k);
            oVarI = i(oVar, bArr2, bArrL);
            z12 = z14;
        } else {
            oVarI = null;
            rVar = null;
            z12 = false;
        }
        long j11 = j10 + fVar.f48349f;
        long j12 = j11 + fVar.f48347d;
        int i11 = gVar.f48325j + fVar.f48348e;
        if (jVar != null) {
            r rVar2 = jVar.f48155q;
            boolean z15 = rVar == rVar2 || (rVar != null && rVar2 != null && rVar.f51194a.equals(rVar2.f51194a) && rVar.f51200g == jVar.f48155q.f51200g);
            boolean z16 = uri.equals(jVar.f48151m) && jVar.H;
            bVar = jVar.f48163y;
            e0Var = jVar.f48164z;
            kVar = (z15 && z16 && !jVar.J && jVar.f48150l == i11) ? jVar.C : null;
        } else {
            bVar = new com.google.android.exoplayer2.metadata.id3.b();
            e0Var = new e0(10);
            kVar = null;
        }
        return new j(hVar, oVarI2, rVarA, a2Var, z13, oVarI, rVar, z12, uri, list, i10, obj, j11, j12, eVar.f48143b, eVar.f48144c, !eVar.f48145d, i11, fVar.f48355l, z10, vVar.a(i11), fVar.f48350g, kVar, bVar, e0Var, z11);
    }

    @mk.m({"output"})
    private void k(com.google.android.exoplayer2.upstream.o oVar, r rVar, boolean z10) throws IOException {
        r rVarE;
        long position;
        long j10;
        boolean z11 = false;
        if (z10) {
            z11 = this.E != 0;
            rVarE = rVar;
        } else {
            rVarE = rVar.e(this.E);
        }
        try {
            com.google.android.exoplayer2.extractor.g gVarU = u(oVar, rVarE);
            if (z11) {
                gVarU.t(this.E);
            }
            while (!this.G && this.C.a(gVarU)) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f47650d.f43586f & 16384) == 0) {
                            throw e10;
                        }
                        this.C.c();
                        position = gVarU.getPosition();
                        j10 = rVar.f51200g;
                    }
                } catch (Throwable th2) {
                    this.E = (int) (gVarU.getPosition() - rVar.f51200g);
                    throw th2;
                }
            }
            position = gVarU.getPosition();
            j10 = rVar.f51200g;
            this.E = (int) (position - j10);
            com.google.android.exoplayer2.upstream.q.a(oVar);
        } catch (Throwable th3) {
            com.google.android.exoplayer2.upstream.q.a(oVar);
            throw th3;
        }
    }

    private static byte[] l(String str) {
        if (com.google.common.base.a.g(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, com.google.android.exoplayer2.source.hls.playlist.g gVar) {
        com.google.android.exoplayer2.source.hls.playlist.g.f fVar = eVar.f48142a;
        if (fVar instanceof com.google.android.exoplayer2.source.hls.playlist.g.b) {
            return ((com.google.android.exoplayer2.source.hls.playlist.g.b) fVar).f48338m || (eVar.f48144c == 0 && gVar.f48363c);
        }
        return gVar.f48363c;
    }

    @mk.m({"output"})
    private void r() throws IOException {
        try {
            this.f48159u.h(this.f48157s, this.f47653g);
            k(this.f47655i, this.f47648b, this.A);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    @mk.m({"output"})
    private void s() throws IOException {
        if (this.F) {
            com.google.android.exoplayer2.util.a.g(this.f48154p);
            com.google.android.exoplayer2.util.a.g(this.f48155q);
            k(this.f48154p, this.f48155q, this.B);
            this.E = 0;
            this.F = false;
        }
    }

    private long t(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        lVar.o();
        try {
            this.f48164z.O(10);
            lVar.l(this.f48164z.d(), 0, 10);
            if (this.f48164z.J() != 4801587) {
                return com.google.android.exoplayer2.j.f46377b;
            }
            this.f48164z.T(3);
            int iF = this.f48164z.F();
            int i10 = iF + 10;
            if (i10 > this.f48164z.b()) {
                byte[] bArrD = this.f48164z.d();
                this.f48164z.O(i10);
                System.arraycopy(bArrD, 0, this.f48164z.d(), 0, 10);
            }
            lVar.l(this.f48164z.d(), 10, iF);
            Metadata metadataE = this.f48163y.e(this.f48164z.d(), iF);
            if (metadataE == null) {
                return com.google.android.exoplayer2.j.f46377b;
            }
            int iD = metadataE.d();
            for (int i11 = 0; i11 < iD; i11++) {
                Metadata.Entry entryC = metadataE.c(i11);
                if (entryC instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entryC;
                    if (L.equals(privFrame.f46926c)) {
                        System.arraycopy(privFrame.f46927d, 0, this.f48164z.d(), 0, 8);
                        this.f48164z.S(0);
                        this.f48164z.R(8);
                        return this.f48164z.z() & org.apache.tools.tar.c.f137288j;
                    }
                }
            }
            return com.google.android.exoplayer2.j.f46377b;
        } catch (EOFException unused) {
        }
    }

    @mk.d({"extractor"})
    @mk.m({"output"})
    private com.google.android.exoplayer2.extractor.g u(com.google.android.exoplayer2.upstream.o oVar, r rVar) throws IOException {
        com.google.android.exoplayer2.extractor.g gVar = new com.google.android.exoplayer2.extractor.g(oVar, rVar.f51200g, oVar.a(rVar));
        if (this.C == null) {
            long jT = t(gVar);
            gVar.o();
            k kVar = this.f48156r;
            k kVarF = kVar != null ? kVar.f() : this.f48160v.a(rVar.f51194a, this.f47650d, this.f48161w, this.f48159u, oVar.b(), gVar);
            this.C = kVarF;
            if (kVarF.e()) {
                this.D.o0(jT != com.google.android.exoplayer2.j.f46377b ? this.f48159u.b(jT) : this.f47653g);
            } else {
                this.D.o0(0L);
            }
            this.D.a0();
            this.C.b(this.D);
        }
        this.D.l0(this.f48162x);
        return gVar;
    }

    public static boolean w(@p0 j jVar, Uri uri, com.google.android.exoplayer2.source.hls.playlist.g gVar, f.e eVar, long j10) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.f48151m) && jVar.H) {
            return false;
        }
        return !p(eVar, gVar) || j10 + eVar.f48142a.f48349f < jVar.f47654h;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() throws IOException {
        k kVar;
        com.google.android.exoplayer2.util.a.g(this.D);
        if (this.C == null && (kVar = this.f48156r) != null && kVar.d()) {
            this.C = this.f48156r;
            this.F = false;
        }
        s();
        if (this.G) {
            return;
        }
        if (!this.f48158t) {
            r();
        }
        this.H = !this.G;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
        this.G = true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.n
    public boolean h() {
        return this.H;
    }

    public int m(int i10) {
        com.google.android.exoplayer2.util.a.i(!this.f48152n);
        if (i10 >= this.I.size()) {
            return 0;
        }
        return this.I.get(i10).intValue();
    }

    public void n(s sVar, ImmutableList<Integer> immutableList) {
        this.D = sVar;
        this.I = immutableList;
    }

    public void o() {
        this.J = true;
    }

    public boolean q() {
        return this.K;
    }

    public void v() {
        this.K = true;
    }
}
