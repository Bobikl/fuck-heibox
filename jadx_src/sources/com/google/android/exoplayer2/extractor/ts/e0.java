package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends com.google.android.exoplayer2.extractor.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f45764f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f45765g = 940;

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class a implements com.google.android.exoplayer2.extractor.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n0 f45766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.e0 f45767b = new com.google.android.exoplayer2.util.e0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f45769d;

        public a(int i10, n0 n0Var, int i11) {
            this.f45768c = i10;
            this.f45766a = n0Var;
            this.f45769d = i11;
        }

        private com.google.android.exoplayer2.extractor.a.e c(com.google.android.exoplayer2.util.e0 e0Var, long j10, long j11) {
            int iA;
            int iA2;
            int iF = e0Var.f();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (e0Var.a() >= 188 && (iA2 = (iA = j0.a(e0Var.d(), e0Var.e(), iF)) + 188) <= iF) {
                long jC = j0.c(e0Var, iA, this.f45768c);
                if (jC != com.google.android.exoplayer2.j.f46377b) {
                    long jB = this.f45766a.b(jC);
                    if (jB > j10) {
                        return j14 == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.extractor.a.e.d(jB, j11) : com.google.android.exoplayer2.extractor.a.e.e(j11 + j13);
                    }
                    if (e0.f45764f + jB > j10) {
                        return com.google.android.exoplayer2.extractor.a.e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                e0Var.S(iA2);
                j12 = iA2;
            }
            return j14 != com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.extractor.a.e.f(j14, j11 + j12) : com.google.android.exoplayer2.extractor.a.e.f44820h;
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public com.google.android.exoplayer2.extractor.a.e a(com.google.android.exoplayer2.extractor.l lVar, long j10) throws IOException {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(this.f45769d, lVar.getLength() - position);
            this.f45767b.O(iMin);
            lVar.l(this.f45767b.d(), 0, iMin);
            return c(this.f45767b, j10, position);
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public void b() {
            this.f45767b.P(u0.f51541f);
        }
    }

    public e0(n0 n0Var, long j10, long j11, int i10, int i11) {
        super(new com.google.android.exoplayer2.extractor.a.b(), new a(i10, n0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
