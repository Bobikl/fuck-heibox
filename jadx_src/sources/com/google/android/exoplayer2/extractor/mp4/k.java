package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.extractor.f0;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import com.google.android.exoplayer2.util.z;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements com.google.android.exoplayer2.extractor.k, b0 {
    public static final com.google.android.exoplayer2.extractor.q B = new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.extractor.mp4.i
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return k.r();
        }
    };
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    private static final int F = 0;
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final long M = 262144;
    private static final long N = 10485760;

    @p0
    private MotionPhotoMetadata A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e0 f45493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0 f45494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0 f45495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0 f45496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.a.C0377a> f45497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f45498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<Metadata.Entry> f45499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f45501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f45502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f45503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private e0 f45504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f45505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f45506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f45507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f45508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.m f45509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b[] f45510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long[][] f45511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f45512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f45513y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f45514z;

    /* JADX INFO: compiled from: Mp4Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: Mp4Extractor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f45515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f45516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.e0 f45517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final f0 f45518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45519e;

        public b(o oVar, r rVar, com.google.android.exoplayer2.extractor.e0 e0Var) {
            this.f45515a = oVar;
            this.f45516b = rVar;
            this.f45517c = e0Var;
            this.f45518d = y.P.equals(oVar.f45557f.f43593m) ? new f0() : null;
        }
    }

    public k() {
        this(0);
    }

    public k(int i10) {
        this.f45492d = i10;
        this.f45500l = (i10 & 4) != 0 ? 3 : 0;
        this.f45498j = new m();
        this.f45499k = new ArrayList();
        this.f45496h = new e0(16);
        this.f45497i = new ArrayDeque<>();
        this.f45493e = new e0(z.f51618b);
        this.f45494f = new e0(4);
        this.f45495g = new e0();
        this.f45505q = -1;
    }

    private boolean A(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        boolean z10;
        long j10 = this.f45502n - ((long) this.f45503o);
        long position = lVar.getPosition() + j10;
        e0 e0Var = this.f45504p;
        if (e0Var == null) {
            if (j10 < 262144) {
                lVar.t((int) j10);
            } else {
                zVar.f46218a = lVar.getPosition() + j10;
                z10 = true;
            }
            u(position);
            return (z10 || this.f45500l == 2) ? false : true;
        }
        lVar.readFully(e0Var.d(), this.f45503o, (int) j10);
        if (this.f45501m == 1718909296) {
            this.f45514z = w(e0Var);
        } else if (!this.f45497i.isEmpty()) {
            this.f45497i.peek().e(new com.google.android.exoplayer2.extractor.mp4.a.b(this.f45501m, e0Var));
        }
        z10 = false;
        u(position);
        if (z10) {
        }
    }

    private int B(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        long position = lVar.getPosition();
        if (this.f45505q == -1) {
            int iP = p(position);
            this.f45505q = iP;
            if (iP == -1) {
                return -1;
            }
        }
        b bVar = ((b[]) u0.k(this.f45510v))[this.f45505q];
        com.google.android.exoplayer2.extractor.e0 e0Var = bVar.f45517c;
        int i10 = bVar.f45519e;
        r rVar = bVar.f45516b;
        long j10 = rVar.f45589c[i10];
        int i11 = rVar.f45590d[i10];
        f0 f0Var = bVar.f45518d;
        long j11 = (j10 - position) + ((long) this.f45506r);
        if (j11 < 0 || j11 >= 262144) {
            zVar.f46218a = j10;
            return 1;
        }
        if (bVar.f45515a.f45558g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        lVar.t((int) j11);
        o oVar = bVar.f45515a;
        if (oVar.f45561j == 0) {
            if (y.O.equals(oVar.f45557f.f43593m)) {
                if (this.f45507s == 0) {
                    com.google.android.exoplayer2.audio.c.a(i11, this.f45495g);
                    e0Var.c(this.f45495g, 7);
                    this.f45507s += 7;
                }
                i11 += 7;
            } else if (f0Var != null) {
                f0Var.d(lVar);
            }
            while (true) {
                int i12 = this.f45507s;
                if (i12 >= i11) {
                    break;
                }
                int iB = e0Var.b(lVar, i11 - i12, false);
                this.f45506r += iB;
                this.f45507s += iB;
                this.f45508t -= iB;
            }
        } else {
            byte[] bArrD = this.f45494f.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i13 = bVar.f45515a.f45561j;
            int i14 = 4 - i13;
            while (this.f45507s < i11) {
                int i15 = this.f45508t;
                if (i15 == 0) {
                    lVar.readFully(bArrD, i14, i13);
                    this.f45506r += i13;
                    this.f45494f.S(0);
                    int iO = this.f45494f.o();
                    if (iO < 0) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.f45508t = iO;
                    this.f45493e.S(0);
                    e0Var.c(this.f45493e, 4);
                    this.f45507s += 4;
                    i11 += i14;
                } else {
                    int iB2 = e0Var.b(lVar, i15, false);
                    this.f45506r += iB2;
                    this.f45507s += iB2;
                    this.f45508t -= iB2;
                }
            }
        }
        int i16 = i11;
        r rVar2 = bVar.f45516b;
        long j12 = rVar2.f45592f[i10];
        int i17 = rVar2.f45593g[i10];
        if (f0Var != null) {
            f0Var.c(e0Var, j12, i17, i16, 0, null);
            if (i10 + 1 == bVar.f45516b.f45588b) {
                f0Var.a(e0Var, null);
            }
        } else {
            e0Var.e(j12, i17, i16, 0, null);
        }
        bVar.f45519e++;
        this.f45505q = -1;
        this.f45506r = 0;
        this.f45507s = 0;
        this.f45508t = 0;
        return 0;
    }

    private int C(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        int iC = this.f45498j.c(lVar, zVar, this.f45499k);
        if (iC == 1 && zVar.f46218a == 0) {
            n();
        }
        return iC;
    }

    private static boolean D(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean E(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void F(b bVar, long j10) {
        r rVar = bVar.f45516b;
        int iA = rVar.a(j10);
        if (iA == -1) {
            iA = rVar.b(j10);
        }
        bVar.f45519e = iA;
    }

    private static int l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] m(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            jArr[i10] = new long[bVarArr[i10].f45516b.f45588b];
            jArr2[i10] = bVarArr[i10].f45516b.f45592f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < bVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < bVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            r rVar = bVarArr[i12].f45516b;
            j10 += (long) rVar.f45590d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = rVar.f45592f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void n() {
        this.f45500l = 0;
        this.f45503o = 0;
    }

    private static int o(r rVar, long j10) {
        int iA = rVar.a(j10);
        return iA == -1 ? rVar.b(j10) : iA;
    }

    private int p(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((b[]) u0.k(this.f45510v)).length; i12++) {
            b bVar = this.f45510v[i12];
            int i13 = bVar.f45519e;
            r rVar = bVar.f45516b;
            if (i13 != rVar.f45588b) {
                long j14 = rVar.f45589c[i13];
                long j15 = ((long[][]) u0.k(this.f45511w))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + N) ? i11 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o q(o oVar) {
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] r() {
        return new com.google.android.exoplayer2.extractor.k[]{new k()};
    }

    private static long s(r rVar, long j10, long j11) {
        int iO = o(rVar, j10);
        return iO == -1 ? j11 : Math.min(rVar.f45589c[iO], j11);
    }

    private void t(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        this.f45495g.O(8);
        lVar.l(this.f45495g.d(), 0, 8);
        com.google.android.exoplayer2.extractor.mp4.b.e(this.f45495g);
        lVar.t(this.f45495g.e());
        lVar.o();
    }

    private void u(long j10) throws ParserException {
        while (!this.f45497i.isEmpty() && this.f45497i.peek().C1 == j10) {
            com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377aPop = this.f45497i.pop();
            if (c0377aPop.f45377a == 1836019574) {
                x(c0377aPop);
                this.f45497i.clear();
                this.f45500l = 2;
            } else if (!this.f45497i.isEmpty()) {
                this.f45497i.peek().d(c0377aPop);
            }
        }
        if (this.f45500l != 2) {
            n();
        }
    }

    private void v() {
        if (this.f45514z != 2 || (this.f45492d & 2) == 0) {
            return;
        }
        com.google.android.exoplayer2.extractor.m mVar = (com.google.android.exoplayer2.extractor.m) com.google.android.exoplayer2.util.a.g(this.f45509u);
        mVar.b(0, 4).d(new a2.b().X(this.A == null ? null : new Metadata(this.A)).E());
        mVar.n();
        mVar.t(new b0.b(com.google.android.exoplayer2.j.f46377b));
    }

    private static int w(e0 e0Var) {
        e0Var.S(8);
        int iL = l(e0Var.o());
        if (iL != 0) {
            return iL;
        }
        e0Var.T(4);
        while (e0Var.a() > 0) {
            int iL2 = l(e0Var.o());
            if (iL2 != 0) {
                return iL2;
            }
        }
        return 0;
    }

    private void x(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f45514z == 1;
        w wVar = new w();
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45310d1);
        if (bVarH != null) {
            Pair<Metadata, Metadata> pairB = com.google.android.exoplayer2.extractor.mp4.b.B(bVarH);
            Metadata metadata3 = (Metadata) pairB.first;
            Metadata metadata4 = (Metadata) pairB.second;
            if (metadata3 != null) {
                wVar.c(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377aG = c0377a.g(com.google.android.exoplayer2.extractor.mp4.a.f45313e1);
        Metadata metadataN = c0377aG != null ? com.google.android.exoplayer2.extractor.mp4.b.n(c0377aG) : null;
        List<r> listA = com.google.android.exoplayer2.extractor.mp4.b.A(c0377a, wVar, com.google.android.exoplayer2.j.f46377b, null, (this.f45492d & 1) != 0, z10, new com.google.common.base.n() { // from class: com.google.android.exoplayer2.extractor.mp4.j
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return k.q((o) obj);
            }
        });
        com.google.android.exoplayer2.extractor.m mVar = (com.google.android.exoplayer2.extractor.m) com.google.android.exoplayer2.util.a.g(this.f45509u);
        int i11 = 0;
        int size = -1;
        long j10 = com.google.android.exoplayer2.j.f46377b;
        for (int size2 = listA.size(); i11 < size2; size2 = size2) {
            r rVar = listA.get(i11);
            if (rVar.f45588b == 0) {
                arrayList = arrayList2;
            } else {
                o oVar = rVar.f45587a;
                int i12 = size;
                arrayList = arrayList2;
                long j11 = oVar.f45556e;
                if (j11 == com.google.android.exoplayer2.j.f46377b) {
                    j11 = rVar.f45594h;
                }
                long jMax = Math.max(j10, j11);
                b bVar = new b(oVar, rVar, mVar.b(i11, oVar.f45553b));
                int i13 = y.P.equals(oVar.f45557f.f43593m) ? rVar.f45591e * 16 : rVar.f45591e + 30;
                a2.b bVarC = oVar.f45557f.c();
                bVarC.W(i13);
                if (oVar.f45553b == 2 && j11 > 0 && (i10 = rVar.f45588b) > 1) {
                    bVarC.P(i10 / (j11 / 1000000.0f));
                }
                h.k(oVar.f45553b, wVar, bVarC);
                int i14 = oVar.f45553b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.f45499k.isEmpty() ? null : new Metadata(this.f45499k);
                h.l(i14, metadata2, metadataN, bVarC, metadataArr);
                bVar.f45517c.d(bVarC.E());
                size = (oVar.f45553b == 2 && i12 == -1) ? arrayList.size() : i12;
                arrayList.add(bVar);
                j10 = jMax;
            }
            i11++;
            arrayList2 = arrayList;
            listA = listA;
        }
        this.f45512x = size;
        this.f45513y = j10;
        b[] bVarArr = (b[]) arrayList2.toArray(new b[0]);
        this.f45510v = bVarArr;
        this.f45511w = m(bVarArr);
        mVar.n();
        mVar.t(this);
    }

    private void y(long j10) {
        if (this.f45501m == 1836086884) {
            int i10 = this.f45503o;
            this.A = new MotionPhotoMetadata(0L, j10, com.google.android.exoplayer2.j.f46377b, j10 + ((long) i10), this.f45502n - ((long) i10));
        }
    }

    private boolean z(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377aPeek;
        if (this.f45503o == 0) {
            if (!lVar.g(this.f45496h.d(), 0, 8, true)) {
                v();
                return false;
            }
            this.f45503o = 8;
            this.f45496h.S(0);
            this.f45502n = this.f45496h.I();
            this.f45501m = this.f45496h.o();
        }
        long j10 = this.f45502n;
        if (j10 == 1) {
            lVar.readFully(this.f45496h.d(), 8, 8);
            this.f45503o += 8;
            this.f45502n = this.f45496h.L();
        } else if (j10 == 0) {
            long length = lVar.getLength();
            if (length == -1 && (c0377aPeek = this.f45497i.peek()) != null) {
                length = c0377aPeek.C1;
            }
            if (length != -1) {
                this.f45502n = (length - lVar.getPosition()) + ((long) this.f45503o);
            }
        }
        if (this.f45502n < this.f45503o) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        if (D(this.f45501m)) {
            long position = lVar.getPosition();
            long j11 = this.f45502n;
            int i10 = this.f45503o;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f45501m == 1835365473) {
                t(lVar);
            }
            this.f45497i.push(new com.google.android.exoplayer2.extractor.mp4.a.C0377a(this.f45501m, j12));
            if (this.f45502n == this.f45503o) {
                u(j12);
            } else {
                n();
            }
        } else if (E(this.f45501m)) {
            com.google.android.exoplayer2.util.a.i(this.f45503o == 8);
            com.google.android.exoplayer2.util.a.i(this.f45502n <= 2147483647L);
            e0 e0Var = new e0((int) this.f45502n);
            System.arraycopy(this.f45496h.d(), 0, e0Var.d(), 0, 8);
            this.f45504p = e0Var;
            this.f45500l = 1;
        } else {
            y(lVar.getPosition() - ((long) this.f45503o));
            this.f45504p = null;
            this.f45500l = 1;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f45497i.clear();
        this.f45503o = 0;
        this.f45505q = -1;
        this.f45506r = 0;
        this.f45507s = 0;
        this.f45508t = 0;
        if (j10 == 0) {
            if (this.f45500l != 3) {
                n();
                return;
            } else {
                this.f45498j.g();
                this.f45499k.clear();
                return;
            }
        }
        b[] bVarArr = this.f45510v;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                F(bVar, j11);
                f0 f0Var = bVar.f45518d;
                if (f0Var != null) {
                    f0Var.b();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f45509u = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        long j11;
        long jS;
        long j12;
        long j13;
        int iB;
        if (((b[]) com.google.android.exoplayer2.util.a.g(this.f45510v)).length == 0) {
            return new b0.a(c0.f44854c);
        }
        int i10 = this.f45512x;
        if (i10 != -1) {
            r rVar = this.f45510v[i10].f45516b;
            int iO = o(rVar, j10);
            if (iO == -1) {
                return new b0.a(c0.f44854c);
            }
            long j14 = rVar.f45592f[iO];
            j11 = rVar.f45589c[iO];
            if (j14 >= j10 || iO >= rVar.f45588b - 1 || (iB = rVar.b(j10)) == -1 || iB == iO) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = rVar.f45592f[iB];
                j13 = rVar.f45589c[iB];
            }
            jS = j13;
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            jS = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            b[] bVarArr = this.f45510v;
            if (i11 >= bVarArr.length) {
                break;
            }
            if (i11 != this.f45512x) {
                r rVar2 = bVarArr[i11].f45516b;
                long jS2 = s(rVar2, j10, j11);
                if (j12 != com.google.android.exoplayer2.j.f46377b) {
                    jS = s(rVar2, j12, jS);
                }
                j11 = jS2;
            }
            i11++;
        }
        c0 c0Var = new c0(j10, j11);
        return j12 == com.google.android.exoplayer2.j.f46377b ? new b0.a(c0Var) : new b0.a(c0Var, new c0(j12, jS));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        return n.e(lVar, (this.f45492d & 2) != 0);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        while (true) {
            int i10 = this.f45500l;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return B(lVar, zVar);
                    }
                    if (i10 == 3) {
                        return C(lVar, zVar);
                    }
                    throw new IllegalStateException();
                }
                if (A(lVar, zVar)) {
                    return 1;
                }
            } else if (!z(lVar)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f45513y;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
