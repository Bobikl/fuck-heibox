package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.n;
import com.google.android.exoplayer2.util.u0;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45595m = 72000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45596n = 100000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45597o = 30000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45598p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45599q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f45600r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f45601s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f45602t = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f45603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f45605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f45606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f45608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f45610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f45611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f45612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f45614l;

    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class b implements b0 {
        private b() {
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public b0.a d(long j10) {
            return new b0.a(new c0(j10, u0.t((a.this.f45604b + ((a.this.f45606d.c(j10) * (a.this.f45605c - a.this.f45604b)) / a.this.f45608f)) - 30000, a.this.f45604b, a.this.f45605c - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public boolean e() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public long i() {
            return a.this.f45606d.b(a.this.f45608f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        com.google.android.exoplayer2.util.a.a(j10 >= 0 && j11 > j10);
        this.f45606d = iVar;
        this.f45604b = j10;
        this.f45605c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f45608f = j13;
            this.f45607e = 4;
        } else {
            this.f45607e = 0;
        }
        this.f45603a = new f();
    }

    private long i(l lVar) throws IOException {
        if (this.f45611i == this.f45612j) {
            return -1L;
        }
        long position = lVar.getPosition();
        if (!this.f45603a.d(lVar, this.f45612j)) {
            long j10 = this.f45611i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f45603a.a(lVar, false);
        lVar.o();
        long j11 = this.f45610h;
        f fVar = this.f45603a;
        long j12 = fVar.f45642c;
        long j13 = j11 - j12;
        int i10 = fVar.f45647h + fVar.f45648i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f45612j = position;
            this.f45614l = j12;
        } else {
            this.f45611i = lVar.getPosition() + ((long) i10);
            this.f45613k = this.f45603a.f45642c;
        }
        long j14 = this.f45612j;
        long j15 = this.f45611i;
        if (j14 - j15 < 100000) {
            this.f45612j = j15;
            return j15;
        }
        long position2 = lVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f45612j;
        long j17 = this.f45611i;
        return u0.t(position2 + ((j13 * (j16 - j17)) / (this.f45614l - this.f45613k)), j17, j16 - 1);
    }

    private void k(l lVar) throws IOException {
        while (true) {
            this.f45603a.c(lVar);
            this.f45603a.a(lVar, false);
            f fVar = this.f45603a;
            if (fVar.f45642c > this.f45610h) {
                lVar.o();
                return;
            } else {
                lVar.t(fVar.f45647h + fVar.f45648i);
                this.f45611i = lVar.getPosition();
                this.f45613k = this.f45603a.f45642c;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public long a(l lVar) throws IOException {
        int i10 = this.f45607e;
        if (i10 == 0) {
            long position = lVar.getPosition();
            this.f45609g = position;
            this.f45607e = 1;
            long j10 = this.f45605c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(lVar);
                if (jI != -1) {
                    return jI;
                }
                this.f45607e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(lVar);
            this.f45607e = 4;
            return -(this.f45613k + 2);
        }
        this.f45608f = j(lVar);
        this.f45607e = 4;
        return this.f45609g;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    public void c(long j10) {
        this.f45610h = u0.t(j10, 0L, this.f45608f - 1);
        this.f45607e = 2;
        this.f45611i = this.f45604b;
        this.f45612j = this.f45605c;
        this.f45613k = 0L;
        this.f45614l = this.f45608f;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.g
    @p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f45608f != 0) {
            return new b();
        }
        return null;
    }

    @j1
    long j(l lVar) throws IOException {
        this.f45603a.b();
        if (!this.f45603a.c(lVar)) {
            throw new EOFException();
        }
        this.f45603a.a(lVar, false);
        f fVar = this.f45603a;
        lVar.t(fVar.f45647h + fVar.f45648i);
        long j10 = this.f45603a.f45642c;
        while (true) {
            f fVar2 = this.f45603a;
            if ((fVar2.f45641b & 4) == 4 || !fVar2.c(lVar) || lVar.getPosition() >= this.f45605c || !this.f45603a.a(lVar, true)) {
                break;
            }
            f fVar3 = this.f45603a;
            if (!n.e(lVar, fVar3.f45647h + fVar3.f45648i)) {
                break;
            }
            j10 = this.f45603a.f45642c;
        }
        return j10;
    }
}
