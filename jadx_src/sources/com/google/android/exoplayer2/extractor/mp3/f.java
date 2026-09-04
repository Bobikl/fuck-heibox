package com.google.android.exoplayer2.extractor.mp3;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.n0;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.extractor.x;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements k {
    public static final int A = 4;
    public static final int B = 8;
    private static final int D = 131072;
    private static final int E = 32768;
    private static final int F = 10;
    private static final int G = -128000;
    private static final int H = 1483304551;
    private static final int I = 1231971951;
    private static final int J = 1447187017;
    private static final int K = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f45266y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f45267z = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f45269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0 f45270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n0.a f45271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f45272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f45273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.e0 f45274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m f45275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f45278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Metadata f45279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f45280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f45281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f45282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f45283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g f45284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f45285u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f45286v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f45287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q f45265x = new q() { // from class: com.google.android.exoplayer2.extractor.mp3.d
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final k[] b() {
            return f.o();
        }
    };
    private static final com.google.android.exoplayer2.metadata.id3.b.a C = new com.google.android.exoplayer2.metadata.id3.b.a() { // from class: com.google.android.exoplayer2.extractor.mp3.e
        @Override // com.google.android.exoplayer2.metadata.id3.b.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.p(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: compiled from: Mp3Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, com.google.android.exoplayer2.j.f46377b);
    }

    public f(int i10, long j10) {
        this.f45268d = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f45269e = j10;
        this.f45270f = new e0(10);
        this.f45271g = new n0.a();
        this.f45272h = new w();
        this.f45280p = com.google.android.exoplayer2.j.f46377b;
        this.f45273i = new x();
        com.google.android.exoplayer2.extractor.j jVar = new com.google.android.exoplayer2.extractor.j();
        this.f45274j = jVar;
        this.f45277m = jVar;
    }

    @mk.d({"extractorOutput", "realTrackOutput"})
    private void e() {
        com.google.android.exoplayer2.util.a.k(this.f45276l);
        u0.k(this.f45275k);
    }

    private g h(l lVar) throws IOException {
        long jL;
        long j10;
        long jI;
        long jH;
        g gVarR = r(lVar);
        c cVarQ = q(this.f45279o, lVar.getPosition());
        if (this.f45285u) {
            return new g.a();
        }
        if ((this.f45268d & 4) != 0) {
            if (cVarQ != null) {
                jI = cVarQ.i();
                jH = cVarQ.h();
            } else {
                if (gVarR != null) {
                    jI = gVarR.i();
                    jH = gVarR.h();
                } else {
                    jL = l(this.f45279o);
                    j10 = -1;
                }
                gVarR = new b(jL, lVar.getPosition(), j10);
            }
            j10 = jH;
            jL = jI;
            gVarR = new b(jL, lVar.getPosition(), j10);
        } else if (cVarQ != null) {
            gVarR = cVarQ;
        } else if (gVarR == null) {
            gVarR = null;
        }
        if (gVarR == null || !(gVarR.e() || (this.f45268d & 1) == 0)) {
            return k(lVar, (this.f45268d & 2) != 0);
        }
        return gVarR;
    }

    private long i(long j10) {
        return this.f45280p + ((j10 * 1000000) / ((long) this.f45271g.f44186d));
    }

    private g k(l lVar, boolean z10) throws IOException {
        lVar.l(this.f45270f.d(), 0, 4);
        this.f45270f.S(0);
        this.f45271g.a(this.f45270f.o());
        return new com.google.android.exoplayer2.extractor.mp3.a(lVar.getLength(), lVar.getPosition(), this.f45271g, z10);
    }

    private static long l(@p0 Metadata metadata) {
        if (metadata == null) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        int iD = metadata.d();
        for (int i10 = 0; i10 < iD; i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryC;
                if (textInformationFrame.f46914b.equals("TLEN")) {
                    return u0.U0(Long.parseLong(textInformationFrame.f46929d));
                }
            }
        }
        return com.google.android.exoplayer2.j.f46377b;
    }

    private static int m(e0 e0Var, int i10) {
        if (e0Var.f() >= i10 + 4) {
            e0Var.S(i10);
            int iO = e0Var.o();
            if (iO == H || iO == I) {
                return iO;
            }
        }
        if (e0Var.f() < 40) {
            return 0;
        }
        e0Var.S(36);
        if (e0Var.o() == J) {
            return J;
        }
        return 0;
    }

    private static boolean n(int i10, long j10) {
        return ((long) (i10 & G)) == (j10 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] o() {
        return new k[]{new f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @p0
    private static c q(@p0 Metadata metadata, long j10) {
        if (metadata == null) {
            return null;
        }
        int iD = metadata.d();
        for (int i10 = 0; i10 < iD; i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof MlltFrame) {
                return c.a(j10, (MlltFrame) entryC, l(metadata));
            }
        }
        return null;
    }

    @p0
    private g r(l lVar) throws IOException {
        e0 e0Var = new e0(this.f45271g.f44185c);
        lVar.l(e0Var.d(), 0, this.f45271g.f44185c);
        n0.a aVar = this.f45271g;
        int i10 = 21;
        if ((aVar.f44183a & 1) != 0) {
            if (aVar.f44187e != 1) {
                i10 = 36;
            }
        } else if (aVar.f44187e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int iM = m(e0Var, i11);
        if (iM != H && iM != I) {
            if (iM != J) {
                lVar.o();
                return null;
            }
            h hVarA = h.a(lVar.getLength(), lVar.getPosition(), this.f45271g, e0Var);
            lVar.t(this.f45271g.f44185c);
            return hVarA;
        }
        i iVarA = i.a(lVar.getLength(), lVar.getPosition(), this.f45271g, e0Var);
        if (iVarA != null && !this.f45272h.a()) {
            lVar.o();
            lVar.s(i11 + 141);
            lVar.l(this.f45270f.d(), 0, 3);
            this.f45270f.S(0);
            this.f45272h.d(this.f45270f.J());
        }
        lVar.t(this.f45271g.f44185c);
        return (iVarA == null || iVarA.e() || iM != I) ? iVarA : k(lVar, false);
    }

    private boolean s(l lVar) throws IOException {
        g gVar = this.f45284t;
        if (gVar != null) {
            long jH = gVar.h();
            if (jH != -1 && lVar.q() > jH - 4) {
                return true;
            }
        }
        try {
            return !lVar.n(this.f45270f.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @mk.m({"extractorOutput", "realTrackOutput"})
    private int t(l lVar) throws IOException {
        if (this.f45278n == 0) {
            try {
                v(lVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f45284t == null) {
            g gVarH = h(lVar);
            this.f45284t = gVarH;
            this.f45275k.t(gVarH);
            this.f45277m.d(new a2.b().e0(this.f45271g.f44184b).W(4096).H(this.f45271g.f44187e).f0(this.f45271g.f44186d).N(this.f45272h.f46211a).O(this.f45272h.f46212b).X((this.f45268d & 8) != 0 ? null : this.f45279o).E());
            this.f45282r = lVar.getPosition();
        } else if (this.f45282r != 0) {
            long position = lVar.getPosition();
            long j10 = this.f45282r;
            if (position < j10) {
                lVar.t((int) (j10 - position));
            }
        }
        return u(lVar);
    }

    @mk.m({"realTrackOutput", "seeker"})
    private int u(l lVar) throws IOException {
        if (this.f45283s == 0) {
            lVar.o();
            if (s(lVar)) {
                return -1;
            }
            this.f45270f.S(0);
            int iO = this.f45270f.o();
            if (!n(iO, this.f45278n) || n0.j(iO) == -1) {
                lVar.t(1);
                this.f45278n = 0;
                return 0;
            }
            this.f45271g.a(iO);
            if (this.f45280p == com.google.android.exoplayer2.j.f46377b) {
                this.f45280p = this.f45284t.c(lVar.getPosition());
                if (this.f45269e != com.google.android.exoplayer2.j.f46377b) {
                    this.f45280p += this.f45269e - this.f45284t.c(0L);
                }
            }
            n0.a aVar = this.f45271g;
            this.f45283s = aVar.f44185c;
            g gVar = this.f45284t;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(i(this.f45281q + ((long) aVar.f44189g)), lVar.getPosition() + ((long) this.f45271g.f44185c));
                if (this.f45286v && bVar.a(this.f45287w)) {
                    this.f45286v = false;
                    this.f45277m = this.f45276l;
                }
            }
        }
        int iB = this.f45277m.b(lVar, this.f45283s, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f45283s - iB;
        this.f45283s = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f45277m.e(i(this.f45281q), 1, this.f45271g.f44185c, 0, null);
        this.f45281q += (long) this.f45271g.f44189g;
        this.f45283s = 0;
        return 0;
    }

    private boolean v(l lVar, boolean z10) throws IOException {
        int iQ;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        lVar.o();
        if (lVar.getPosition() == 0) {
            Metadata metadataA = this.f45273i.a(lVar, (this.f45268d & 8) == 0 ? null : C);
            this.f45279o = metadataA;
            if (metadataA != null) {
                this.f45272h.c(metadataA);
            }
            iQ = (int) lVar.q();
            if (!z10) {
                lVar.t(iQ);
            }
            i10 = 0;
        } else {
            iQ = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (s(lVar)) {
                if (i12 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f45270f.S(0);
            int iO = this.f45270f.o();
            if ((i10 == 0 || n(iO, i10)) && (iJ = n0.j(iO)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f45271g.a(iO);
                    i10 = iO;
                }
                lVar.s(iJ - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    throw ParserException.a("Searched too many bytes.", null);
                }
                if (z10) {
                    lVar.o();
                    lVar.s(iQ + i14);
                } else {
                    lVar.t(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            lVar.t(iQ + i13);
        } else {
            lVar.o();
        }
        this.f45278n = i10;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f45278n = 0;
        this.f45280p = com.google.android.exoplayer2.j.f46377b;
        this.f45281q = 0L;
        this.f45283s = 0;
        this.f45287w = j11;
        g gVar = this.f45284t;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f45286v = true;
        this.f45277m = this.f45274j;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(m mVar) {
        this.f45275k = mVar;
        com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(0, 1);
        this.f45276l = e0VarB;
        this.f45277m = e0VarB;
        this.f45275k.n();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        return v(lVar, true);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        e();
        int iT = t(lVar);
        if (iT == -1 && (this.f45284t instanceof b)) {
            long jI = i(this.f45281q);
            if (this.f45284t.i() != jI) {
                ((b) this.f45284t).f(jI);
                this.f45275k.t(this.f45284t);
            }
        }
        return iT;
    }

    public void j() {
        this.f45285u = true;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
