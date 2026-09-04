package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.n;
import com.google.android.exoplayer2.util.e0;
import java.io.IOException;

/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45634l = 27;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f45635m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45636n = 65025;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f45637o = 65307;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45638p = 1332176723;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45639q = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f45649j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e0 f45650k = new e0(255);

    f() {
    }

    public boolean a(l lVar, boolean z10) throws IOException {
        b();
        this.f45650k.O(27);
        if (!n.b(lVar, this.f45650k.d(), 0, 27, z10) || this.f45650k.I() != 1332176723) {
            return false;
        }
        int iG = this.f45650k.G();
        this.f45640a = iG;
        if (iG != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.e("unsupported bit stream revision");
        }
        this.f45641b = this.f45650k.G();
        this.f45642c = this.f45650k.t();
        this.f45643d = this.f45650k.v();
        this.f45644e = this.f45650k.v();
        this.f45645f = this.f45650k.v();
        int iG2 = this.f45650k.G();
        this.f45646g = iG2;
        this.f45647h = iG2 + 27;
        this.f45650k.O(iG2);
        if (!n.b(lVar, this.f45650k.d(), 0, this.f45646g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f45646g; i10++) {
            this.f45649j[i10] = this.f45650k.G();
            this.f45648i += this.f45649j[i10];
        }
        return true;
    }

    public void b() {
        this.f45640a = 0;
        this.f45641b = 0;
        this.f45642c = 0L;
        this.f45643d = 0L;
        this.f45644e = 0L;
        this.f45645f = 0L;
        this.f45646g = 0;
        this.f45647h = 0;
        this.f45648i = 0;
    }

    public boolean c(l lVar) throws IOException {
        return d(lVar, -1L);
    }

    public boolean d(l lVar, long j10) throws IOException {
        com.google.android.exoplayer2.util.a.a(lVar.getPosition() == lVar.q());
        this.f45650k.O(4);
        while (true) {
            if ((j10 != -1 && lVar.getPosition() + 4 >= j10) || !n.b(lVar, this.f45650k.d(), 0, 4, true)) {
                break;
            }
            this.f45650k.S(0);
            if (this.f45650k.I() == 1332176723) {
                lVar.o();
                return true;
            }
            lVar.t(1);
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.c(1) != -1);
        return false;
    }
}
