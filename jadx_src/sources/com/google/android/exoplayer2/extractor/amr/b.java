package com.google.android.exoplayer2.extractor.amr;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.q0;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Map;
import mk.d;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements k {
    private static final int A = 20;
    private static final int B = 16000;
    private static final int C = 8000;
    private static final int D = 20000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f44825t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f44826u = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f44828w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f44831z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f44832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f44833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f44835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f44838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f44839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f44842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f44843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e0 f44844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b0 f44845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f44846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f44824s = new q() { // from class: com.google.android.exoplayer2.extractor.amr.a
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final k[] b() {
            return b.q();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int[] f44827v = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f44829x = u0.y0("#!AMR\n");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final byte[] f44830y = u0.y0("#!AMR-WB\n");

    /* JADX INFO: compiled from: AmrExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f44828w = iArr;
        f44831z = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f44833e = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f44832d = new byte[1];
        this.f44840l = -1;
    }

    static byte[] d() {
        byte[] bArr = f44829x;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static byte[] e() {
        byte[] bArr = f44830y;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @d({"extractorOutput", "trackOutput"})
    private void h() {
        com.google.android.exoplayer2.util.a.k(this.f44844p);
        u0.k(this.f44843o);
    }

    static int i(int i10) {
        return f44827v[i10];
    }

    static int j(int i10) {
        return f44828w[i10];
    }

    private static int k(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    private b0 l(long j10, boolean z10) {
        return new f(j10, this.f44839k, k(this.f44840l, q0.f44202v), this.f44840l, z10);
    }

    private int m(int i10) throws ParserException {
        if (o(i10)) {
            return this.f44834f ? f44828w[i10] : f44827v[i10];
        }
        String str = this.f44834f ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.a(sb2.toString(), null);
    }

    private boolean n(int i10) {
        return !this.f44834f && (i10 < 12 || i10 > 14);
    }

    private boolean o(int i10) {
        return i10 >= 0 && i10 <= 15 && (p(i10) || n(i10));
    }

    private boolean p(int i10) {
        return this.f44834f && (i10 < 10 || i10 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] q() {
        return new k[]{new b()};
    }

    @mk.m({"trackOutput"})
    private void r() {
        if (this.f44846r) {
            return;
        }
        this.f44846r = true;
        boolean z10 = this.f44834f;
        this.f44844p.d(new a2.b().e0(z10 ? y.Y : y.X).W(f44831z).H(1).f0(z10 ? 16000 : 8000).E());
    }

    @mk.m({"extractorOutput"})
    private void s(long j10, int i10) {
        int i11;
        if (this.f44838j) {
            return;
        }
        int i12 = this.f44833e;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f44840l) == -1 || i11 == this.f44836h)) {
            b0.b bVar = new b0.b(j.f46377b);
            this.f44845q = bVar;
            this.f44843o.t(bVar);
            this.f44838j = true;
            return;
        }
        if (this.f44841m >= 20 || i10 == -1) {
            b0 b0VarL = l(j10, (i12 & 2) != 0);
            this.f44845q = b0VarL;
            this.f44843o.t(b0VarL);
            this.f44838j = true;
        }
    }

    private static boolean t(l lVar, byte[] bArr) throws IOException {
        lVar.o();
        byte[] bArr2 = new byte[bArr.length];
        lVar.l(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int u(l lVar) throws IOException {
        lVar.o();
        lVar.l(this.f44832d, 0, 1);
        byte b10 = this.f44832d[0];
        if ((b10 & 131) <= 0) {
            return m((b10 >> 3) & 15);
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("Invalid padding bits for frame header ");
        sb2.append((int) b10);
        throw ParserException.a(sb2.toString(), null);
    }

    private boolean v(l lVar) throws IOException {
        byte[] bArr = f44829x;
        if (t(lVar, bArr)) {
            this.f44834f = false;
            lVar.t(bArr.length);
            return true;
        }
        byte[] bArr2 = f44830y;
        if (!t(lVar, bArr2)) {
            return false;
        }
        this.f44834f = true;
        lVar.t(bArr2.length);
        return true;
    }

    @mk.m({"trackOutput"})
    private int w(l lVar) throws IOException {
        if (this.f44837i == 0) {
            try {
                int iU = u(lVar);
                this.f44836h = iU;
                this.f44837i = iU;
                if (this.f44840l == -1) {
                    this.f44839k = lVar.getPosition();
                    this.f44840l = this.f44836h;
                }
                if (this.f44840l == this.f44836h) {
                    this.f44841m++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iB = this.f44844p.b(lVar, this.f44837i, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f44837i - iB;
        this.f44837i = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f44844p.e(this.f44842n + this.f44835g, 1, this.f44836h, 0, null);
        this.f44835g += q0.f44202v;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f44835g = 0L;
        this.f44836h = 0;
        this.f44837i = 0;
        if (j10 != 0) {
            b0 b0Var = this.f44845q;
            if (b0Var instanceof f) {
                this.f44842n = ((f) b0Var).b(j10);
                return;
            }
        }
        this.f44842n = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(m mVar) {
        this.f44843o = mVar;
        this.f44844p = mVar.b(0, 1);
        mVar.n();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        return v(lVar);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        h();
        if (lVar.getPosition() == 0 && !v(lVar)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        r();
        int iW = w(lVar);
        s(lVar.getLength(), iW);
        return iW;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
