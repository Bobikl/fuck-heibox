package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.audio.q0;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x extends com.google.android.exoplayer2.extractor.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f46175f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f46176g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f46177h = 20000;

    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    public static final class b implements com.google.android.exoplayer2.extractor.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n0 f46178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.e0 f46179b;

        private b(n0 n0Var) {
            this.f46178a = n0Var;
            this.f46179b = new com.google.android.exoplayer2.util.e0();
        }

        private com.google.android.exoplayer2.extractor.a.e c(com.google.android.exoplayer2.util.e0 e0Var, long j10, long j11) {
            int iE = -1;
            int iE2 = -1;
            long j12 = -9223372036854775807L;
            while (e0Var.a() >= 4) {
                if (x.k(e0Var.d(), e0Var.e()) != 442) {
                    e0Var.T(1);
                } else {
                    e0Var.T(4);
                    long jL = y.l(e0Var);
                    if (jL != com.google.android.exoplayer2.j.f46377b) {
                        long jB = this.f46178a.b(jL);
                        if (jB > j10) {
                            return j12 == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.extractor.a.e.d(jB, j11) : com.google.android.exoplayer2.extractor.a.e.e(j11 + ((long) iE2));
                        }
                        if (x.f46175f + jB > j10) {
                            return com.google.android.exoplayer2.extractor.a.e.e(j11 + ((long) e0Var.e()));
                        }
                        iE2 = e0Var.e();
                        j12 = jB;
                    }
                    d(e0Var);
                    iE = e0Var.e();
                }
            }
            return j12 != com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.extractor.a.e.f(j12, j11 + ((long) iE)) : com.google.android.exoplayer2.extractor.a.e.f44820h;
        }

        private static void d(com.google.android.exoplayer2.util.e0 e0Var) {
            int iK;
            int iF = e0Var.f();
            if (e0Var.a() < 10) {
                e0Var.S(iF);
                return;
            }
            e0Var.T(9);
            int iG = e0Var.G() & 7;
            if (e0Var.a() < iG) {
                e0Var.S(iF);
                return;
            }
            e0Var.T(iG);
            if (e0Var.a() < 4) {
                e0Var.S(iF);
                return;
            }
            if (x.k(e0Var.d(), e0Var.e()) == 443) {
                e0Var.T(4);
                int iM = e0Var.M();
                if (e0Var.a() < iM) {
                    e0Var.S(iF);
                    return;
                }
                e0Var.T(iM);
            }
            while (e0Var.a() >= 4 && (iK = x.k(e0Var.d(), e0Var.e())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                e0Var.T(4);
                if (e0Var.a() < 2) {
                    e0Var.S(iF);
                    return;
                }
                e0Var.S(Math.min(e0Var.f(), e0Var.e() + e0Var.M()));
            }
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public com.google.android.exoplayer2.extractor.a.e a(com.google.android.exoplayer2.extractor.l lVar, long j10) throws IOException {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(q0.f44202v, lVar.getLength() - position);
            this.f46179b.O(iMin);
            lVar.l(this.f46179b.d(), 0, iMin);
            return c(this.f46179b, j10, position);
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public void b() {
            this.f46179b.P(u0.f51541f);
        }
    }

    public x(n0 n0Var, long j10, long j11) {
        super(new com.google.android.exoplayer2.extractor.a.b(), new b(n0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
