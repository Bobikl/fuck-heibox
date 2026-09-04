package p8;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.j;
import java.io.IOException;
import mk.m;

/* JADX INFO: compiled from: RawCcExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f138181l = 9;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f138182m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f138183n = 1380139777;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f138184o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f138185p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f138186q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f138187r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f138188s = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2 f138189d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e0 f138191f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f138193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f138194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f138195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f138196k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f138190e = new com.google.android.exoplayer2.util.e0(9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f138192g = 0;

    public a(a2 a2Var) {
        this.f138189d = a2Var;
    }

    private boolean c(l lVar) throws IOException {
        this.f138190e.O(8);
        if (!lVar.g(this.f138190e.d(), 0, 8, true)) {
            return false;
        }
        if (this.f138190e.o() != f138183n) {
            throw new IOException("Input not RawCC");
        }
        this.f138193h = this.f138190e.G();
        return true;
    }

    @m({"trackOutput"})
    private void d(l lVar) throws IOException {
        while (this.f138195j > 0) {
            this.f138190e.O(3);
            lVar.readFully(this.f138190e.d(), 0, 3);
            this.f138191f.c(this.f138190e, 3);
            this.f138196k += 3;
            this.f138195j--;
        }
        int i10 = this.f138196k;
        if (i10 > 0) {
            this.f138191f.e(this.f138194i, 1, i10, 0, null);
        }
    }

    private boolean e(l lVar) throws IOException {
        int i10 = this.f138193h;
        if (i10 == 0) {
            this.f138190e.O(5);
            if (!lVar.g(this.f138190e.d(), 0, 5, true)) {
                return false;
            }
            this.f138194i = (this.f138190e.I() * 1000) / 45;
        } else {
            if (i10 != 1) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Unsupported version number: ");
                sb2.append(i10);
                throw ParserException.a(sb2.toString(), null);
            }
            this.f138190e.O(9);
            if (!lVar.g(this.f138190e.d(), 0, 9, true)) {
                return false;
            }
            this.f138194i = this.f138190e.z();
        }
        this.f138195j = this.f138190e.G();
        this.f138196k = 0;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f138192g = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        mVar.t(new b0.b(j.f46377b));
        e0 e0VarB = mVar.b(0, 3);
        this.f138191f = e0VarB;
        e0VarB.d(this.f138189d);
        mVar.n();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        this.f138190e.O(8);
        lVar.l(this.f138190e.d(), 0, 8);
        return this.f138190e.o() == f138183n;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        com.google.android.exoplayer2.util.a.k(this.f138191f);
        while (true) {
            int i10 = this.f138192g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    d(lVar);
                    this.f138192g = 1;
                    return 0;
                }
                if (!e(lVar)) {
                    this.f138192g = 0;
                    return -1;
                }
                this.f138192g = 2;
            } else {
                if (!c(lVar)) {
                    return -1;
                }
                this.f138192g = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
