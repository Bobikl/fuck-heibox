package q8;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.v0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f138590j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f138591k = new q() { // from class: q8.a
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final k[] b() {
            return b.e();
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f138592l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f138593m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f138594n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f138595o = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f138596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e0 f138597e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC1256b f138599g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f138598f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f138600h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f138601i = -1;

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class a implements InterfaceC1256b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f138602m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f138603n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, bb.c.b.f30528b0, bb.c.b.f30896r0, bb.c.b.I0, 209, bb.c.b.f31007w1, 253, bb.c.b.f30942t2, 307, bb.c.b.f31075z3, bb.c.b.f30671h4, bb.c.b.S4, bb.c.b.H5, bb.c.b.A6, bb.c.b.f31057y7, bb.c.b.A8, bb.c.b.I9, bb.c.b.Wa, bb.c.b.f30886qc, bb.c.b.Sd, bb.c.b.Bf, 1060, bb.c.b.f31025wj, bb.c.b.Il, bb.c.b.ho, bb.c.b.Sq, bb.c.b.St, bb.c.b.hx, bb.c.d.L, bb.c.d.J3, bb.c.d.f31158c8, bb.c.d.Sc, bb.c.d.f31284hi, bb.c.d.Yn, bb.c.e.I1, bb.c.e.K8, bb.c.f.I, bb.c.f.f32350j8, bb.c.f.Ch, bb.c.f.Sr, bb.c.g.f32782d, bb.c.g.Bb, bb.c.i.f33318f4, bb.c.k.f33505de, bb.c.k.Ju, bb.c.l.f34518w9, bb.c.m.L5, bb.c.m.Pr, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f138604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e0 f138605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q8.c f138606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f138607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f138608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.e0 f138609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f138610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final a2 f138611h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f138612i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f138613j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f138614k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f138615l;

        public a(m mVar, e0 e0Var, q8.c cVar) throws ParserException {
            this.f138604a = mVar;
            this.f138605b = e0Var;
            this.f138606c = cVar;
            int iMax = Math.max(1, cVar.f138626c / 10);
            this.f138610g = iMax;
            com.google.android.exoplayer2.util.e0 e0Var2 = new com.google.android.exoplayer2.util.e0(cVar.f138630g);
            e0Var2.y();
            int iY = e0Var2.y();
            this.f138607d = iY;
            int i10 = cVar.f138625b;
            int i11 = (((cVar.f138628e - (i10 * 4)) * 8) / (cVar.f138629f * i10)) + 1;
            if (iY == i11) {
                int iM = u0.m(iMax, iY);
                this.f138608e = new byte[cVar.f138628e * iM];
                this.f138609f = new com.google.android.exoplayer2.util.e0(iM * h(iY, i10));
                int i12 = ((cVar.f138626c * cVar.f138628e) * 8) / iY;
                this.f138611h = new a2.b().e0(y.I).G(i12).Z(i12).W(h(iMax, i10)).H(cVar.f138625b).f0(cVar.f138626c).Y(2).E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Expected frames per block: ");
            sb2.append(i11);
            sb2.append("; got: ");
            sb2.append(iY);
            throw ParserException.a(sb2.toString(), null);
        }

        private void d(byte[] bArr, int i10, com.google.android.exoplayer2.util.e0 e0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f138606c.f138625b; i12++) {
                    e(bArr, i11, i12, e0Var.d());
                }
            }
            int iG = g(this.f138607d * i10);
            e0Var.S(0);
            e0Var.R(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            q8.c cVar = this.f138606c;
            int i12 = cVar.f138628e;
            int i13 = cVar.f138625b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iS = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f138603n[iMin];
            int i18 = ((i10 * this.f138607d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iS & 255);
            bArr2[i18 + 1] = (byte) (iS >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
                int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                iS = u0.s(iS + i22, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iS & 255);
                bArr2[i18 + 1] = (byte) (iS >> 8);
                int i23 = iMin + f138602m[i21];
                int[] iArr = f138603n;
                iMin = u0.s(i23, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f138606c.f138625b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f138606c.f138625b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jJ1 = this.f138613j + u0.j1(this.f138615l, 1000000L, this.f138606c.f138626c);
            int iG = g(i10);
            this.f138605b.e(jJ1, 1, iG, this.f138614k - iG, null);
            this.f138615l += (long) i10;
            this.f138614k -= iG;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // q8.b.InterfaceC1256b
        public boolean a(com.google.android.exoplayer2.extractor.l r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f138610g
                int r1 = r6.f138614k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f138607d
                int r0 = com.google.android.exoplayer2.util.u0.m(r0, r1)
                q8.c r1 = r6.f138606c
                int r1 = r1.f138628e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f138612i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f138608e
                int r5 = r6.f138612i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f138612i
                int r4 = r4 + r3
                r6.f138612i = r4
                goto L1e
            L3e:
                int r7 = r6.f138612i
                q8.c r8 = r6.f138606c
                int r8 = r8.f138628e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f138608e
                com.google.android.exoplayer2.util.e0 r9 = r6.f138609f
                r6.d(r8, r7, r9)
                int r8 = r6.f138612i
                q8.c r9 = r6.f138606c
                int r9 = r9.f138628e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f138612i = r8
                com.google.android.exoplayer2.util.e0 r7 = r6.f138609f
                int r7 = r7.f()
                com.google.android.exoplayer2.extractor.e0 r8 = r6.f138605b
                com.google.android.exoplayer2.util.e0 r9 = r6.f138609f
                r8.c(r9, r7)
                int r8 = r6.f138614k
                int r8 = r8 + r7
                r6.f138614k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f138610g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f138614k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q8.b.a.a(com.google.android.exoplayer2.extractor.l, long):boolean");
        }

        @Override // q8.b.InterfaceC1256b
        public void b(int i10, long j10) {
            this.f138604a.t(new e(this.f138606c, this.f138607d, i10, j10));
            this.f138605b.d(this.f138611h);
        }

        @Override // q8.b.InterfaceC1256b
        public void c(long j10) {
            this.f138612i = 0;
            this.f138613j = j10;
            this.f138614k = 0;
            this.f138615l = 0L;
        }
    }

    /* JADX INFO: renamed from: q8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WavExtractor.java */
    public interface InterfaceC1256b {
        boolean a(l lVar, long j10) throws IOException;

        void b(int i10, long j10) throws ParserException;

        void c(long j10);
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class c implements InterfaceC1256b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f138616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e0 f138617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q8.c f138618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a2 f138619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f138620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f138621f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f138622g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f138623h;

        public c(m mVar, e0 e0Var, q8.c cVar, String str, int i10) throws ParserException {
            this.f138616a = mVar;
            this.f138617b = e0Var;
            this.f138618c = cVar;
            int i11 = (cVar.f138625b * cVar.f138629f) / 8;
            int i12 = cVar.f138628e;
            if (i12 == i11) {
                int i13 = cVar.f138626c;
                int i14 = i13 * i11 * 8;
                int iMax = Math.max(i11, (i13 * i11) / 10);
                this.f138620e = iMax;
                this.f138619d = new a2.b().e0(str).G(i14).Z(i14).W(iMax).H(cVar.f138625b).f0(cVar.f138626c).Y(i10).E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Expected block size: ");
            sb2.append(i11);
            sb2.append("; got: ");
            sb2.append(i12);
            throw ParserException.a(sb2.toString(), null);
        }

        @Override // q8.b.InterfaceC1256b
        public boolean a(l lVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f138622g) < (i11 = this.f138620e)) {
                int iB = this.f138617b.b(lVar, (int) Math.min(i11 - i10, j11), true);
                if (iB == -1) {
                    j11 = 0;
                } else {
                    this.f138622g += iB;
                    j11 -= (long) iB;
                }
            }
            q8.c cVar = this.f138618c;
            int i12 = cVar.f138628e;
            int i13 = this.f138622g / i12;
            if (i13 > 0) {
                long jJ1 = this.f138621f + u0.j1(this.f138623h, 1000000L, cVar.f138626c);
                int i14 = i13 * i12;
                int i15 = this.f138622g - i14;
                this.f138617b.e(jJ1, 1, i14, i15, null);
                this.f138623h += (long) i13;
                this.f138622g = i15;
            }
            return j11 <= 0;
        }

        @Override // q8.b.InterfaceC1256b
        public void b(int i10, long j10) {
            this.f138616a.t(new e(this.f138618c, 1, i10, j10));
            this.f138617b.d(this.f138619d);
        }

        @Override // q8.b.InterfaceC1256b
        public void c(long j10) {
            this.f138621f = j10;
            this.f138622g = 0;
            this.f138623h = 0L;
        }
    }

    @mk.d({"extractorOutput", "trackOutput"})
    private void d() {
        com.google.android.exoplayer2.util.a.k(this.f138597e);
        u0.k(this.f138596d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] e() {
        return new k[]{new b()};
    }

    private void h(l lVar) throws IOException {
        com.google.android.exoplayer2.util.a.i(lVar.getPosition() == 0);
        int i10 = this.f138600h;
        if (i10 != -1) {
            lVar.t(i10);
            this.f138598f = 3;
        } else {
            if (!d.a(lVar)) {
                throw ParserException.a("Unsupported or unrecognized wav file type.", null);
            }
            lVar.t((int) (lVar.q() - lVar.getPosition()));
            this.f138598f = 1;
        }
    }

    @mk.m({"extractorOutput", "trackOutput"})
    private void i(l lVar) throws IOException {
        q8.c cVarB = d.b(lVar);
        int i10 = cVarB.f138624a;
        if (i10 == 17) {
            this.f138599g = new a(this.f138596d, this.f138597e, cVarB);
        } else if (i10 == 6) {
            this.f138599g = new c(this.f138596d, this.f138597e, cVarB, y.J, -1);
        } else if (i10 == 7) {
            this.f138599g = new c(this.f138596d, this.f138597e, cVarB, y.K, -1);
        } else {
            int iA = v0.a(i10, cVarB.f138629f);
            if (iA == 0) {
                int i11 = cVarB.f138624a;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Unsupported WAV format type: ");
                sb2.append(i11);
                throw ParserException.e(sb2.toString());
            }
            this.f138599g = new c(this.f138596d, this.f138597e, cVarB, y.I, iA);
        }
        this.f138598f = 2;
    }

    private int j(l lVar) throws IOException {
        com.google.android.exoplayer2.util.a.i(this.f138601i != -1);
        return ((InterfaceC1256b) com.google.android.exoplayer2.util.a.g(this.f138599g)).a(lVar, this.f138601i - lVar.getPosition()) ? -1 : 0;
    }

    private void k(l lVar) throws IOException {
        Pair<Long, Long> pairC = d.c(lVar);
        this.f138600h = ((Long) pairC.first).intValue();
        this.f138601i = ((Long) pairC.second).longValue();
        ((InterfaceC1256b) com.google.android.exoplayer2.util.a.g(this.f138599g)).b(this.f138600h, this.f138601i);
        this.f138598f = 3;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f138598f = j10 == 0 ? 0 : 3;
        InterfaceC1256b interfaceC1256b = this.f138599g;
        if (interfaceC1256b != null) {
            interfaceC1256b.c(j11);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(m mVar) {
        this.f138596d = mVar;
        this.f138597e = mVar.b(0, 1);
        mVar.n();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        return d.a(lVar);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        d();
        int i10 = this.f138598f;
        if (i10 == 0) {
            h(lVar);
            return 0;
        }
        if (i10 == 1) {
            i(lVar);
            return 0;
        }
        if (i10 == 2) {
            k(lVar);
            return 0;
        }
        if (i10 == 3) {
            return j(lVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
