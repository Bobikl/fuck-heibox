package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.l;
import java.io.IOException;
import java.util.ArrayDeque;
import mk.m;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45084h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f45085i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45086j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f45087k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45088l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45089m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45090n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45091o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f45092a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f45093b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f45094c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.mkv.b f45095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45098g;

    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f45100b;

        private b(int i10, long j10) {
            this.f45099a = i10;
            this.f45100b = j10;
        }
    }

    @m({"processor"})
    private long c(l lVar) throws IOException {
        lVar.o();
        while (true) {
            lVar.l(this.f45092a, 0, 4);
            int iC = g.c(this.f45092a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f45092a, iC, false);
                if (this.f45095d.h(iA)) {
                    lVar.t(iC);
                    return iA;
                }
            }
            lVar.t(1);
        }
    }

    private double d(l lVar, int i10) throws IOException {
        long jE = e(lVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(l lVar, int i10) throws IOException {
        lVar.readFully(this.f45092a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f45092a[i11] & 255));
        }
        return j10;
    }

    private static String f(l lVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        lVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.c
    public boolean a(l lVar) throws IOException {
        com.google.android.exoplayer2.util.a.k(this.f45095d);
        while (true) {
            b bVarPeek = this.f45093b.peek();
            if (bVarPeek != null && lVar.getPosition() >= bVarPeek.f45100b) {
                this.f45095d.a(this.f45093b.pop().f45099a);
                return true;
            }
            if (this.f45096e == 0) {
                long jD = this.f45094c.d(lVar, true, false, 4);
                if (jD == -2) {
                    jD = c(lVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f45097f = (int) jD;
                this.f45096e = 1;
            }
            if (this.f45096e == 1) {
                this.f45098g = this.f45094c.d(lVar, false, true, 8);
                this.f45096e = 2;
            }
            int iG = this.f45095d.g(this.f45097f);
            if (iG != 0) {
                if (iG == 1) {
                    long position = lVar.getPosition();
                    this.f45093b.push(new b(this.f45097f, this.f45098g + position));
                    this.f45095d.f(this.f45097f, position, this.f45098g);
                    this.f45096e = 0;
                    return true;
                }
                if (iG == 2) {
                    long j10 = this.f45098g;
                    if (j10 <= 8) {
                        this.f45095d.c(this.f45097f, e(lVar, (int) j10));
                        this.f45096e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid integer size: ");
                    sb2.append(j10);
                    throw ParserException.a(sb2.toString(), null);
                }
                if (iG == 3) {
                    long j11 = this.f45098g;
                    if (j11 <= 2147483647L) {
                        this.f45095d.e(this.f45097f, f(lVar, (int) j11));
                        this.f45096e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j11);
                    throw ParserException.a(sb3.toString(), null);
                }
                if (iG == 4) {
                    this.f45095d.d(this.f45097f, (int) this.f45098g, lVar);
                    this.f45096e = 0;
                    return true;
                }
                if (iG != 5) {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(iG);
                    throw ParserException.a(sb4.toString(), null);
                }
                long j12 = this.f45098g;
                if (j12 == 4 || j12 == 8) {
                    this.f45095d.b(this.f45097f, d(lVar, (int) j12));
                    this.f45096e = 0;
                    return true;
                }
                StringBuilder sb5 = new StringBuilder(40);
                sb5.append("Invalid float size: ");
                sb5.append(j12);
                throw ParserException.a(sb5.toString(), null);
            }
            lVar.t((int) this.f45098g);
            this.f45096e = 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.c
    public void b(com.google.android.exoplayer2.extractor.mkv.b bVar) {
        this.f45095d = bVar;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.c
    public void reset() {
        this.f45096e = 0;
        this.f45093b.clear();
        this.f45094c.e();
    }
}
