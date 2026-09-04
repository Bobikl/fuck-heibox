package r8;

import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.source.rtsp.k;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: RtpAc3Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f138834h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f138835i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f138836j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f138837k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f138838l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f138839a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f138841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f138842d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f138844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f138845g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f138840b = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f138843e = j.f46377b;

    public c(k kVar) {
        this.f138839a = kVar;
    }

    private void e() {
        if (this.f138842d > 0) {
            f();
        }
    }

    private void f() {
        ((e0) u0.k(this.f138841c)).e(this.f138844f, 1, this.f138842d, 0, null);
        this.f138842d = 0;
    }

    private void g(com.google.android.exoplayer2.util.e0 e0Var, boolean z10, int i10, long j10) {
        int iA = e0Var.a();
        ((e0) com.google.android.exoplayer2.util.a.g(this.f138841c)).c(e0Var, iA);
        this.f138842d += iA;
        this.f138844f = j10;
        if (z10 && i10 == 3) {
            f();
        }
    }

    private void h(com.google.android.exoplayer2.util.e0 e0Var, int i10, long j10) {
        this.f138840b.o(e0Var.d());
        this.f138840b.t(2);
        for (int i11 = 0; i11 < i10; i11++) {
            com.google.android.exoplayer2.audio.b.C0371b c0371bE = com.google.android.exoplayer2.audio.b.e(this.f138840b);
            ((e0) com.google.android.exoplayer2.util.a.g(this.f138841c)).c(e0Var, c0371bE.f44100e);
            ((e0) u0.k(this.f138841c)).e(j10, 1, c0371bE.f44100e, 0, null);
            j10 += ((long) (c0371bE.f44101f / c0371bE.f44098c)) * 1000000;
            this.f138840b.t(c0371bE.f44100e);
        }
    }

    private void i(com.google.android.exoplayer2.util.e0 e0Var, long j10) {
        int iA = e0Var.a();
        ((e0) com.google.android.exoplayer2.util.a.g(this.f138841c)).c(e0Var, iA);
        ((e0) u0.k(this.f138841c)).e(j10, 1, iA, 0, null);
    }

    private static long j(long j10, long j11, long j12, int i10) {
        return j10 + u0.j1(j11 - j12, 1000000L, i10);
    }

    @Override // r8.e
    public void a(long j10, long j11) {
        this.f138843e = j10;
        this.f138845g = j11;
    }

    @Override // r8.e
    public void b(m mVar, int i10) {
        e0 e0VarB = mVar.b(i10, 1);
        this.f138841c = e0VarB;
        e0VarB.d(this.f138839a.f48796c);
    }

    @Override // r8.e
    public void c(long j10, int i10) {
        com.google.android.exoplayer2.util.a.i(this.f138843e == j.f46377b);
        this.f138843e = j10;
    }

    @Override // r8.e
    public void d(com.google.android.exoplayer2.util.e0 e0Var, long j10, int i10, boolean z10) {
        int iG = e0Var.G() & 3;
        int iG2 = e0Var.G() & 255;
        long j11 = j(this.f138845g, j10, this.f138843e, this.f138839a.f48795b);
        if (iG == 0) {
            e();
            if (iG2 == 1) {
                i(e0Var, j11);
                return;
            } else {
                h(e0Var, iG2, j11);
                return;
            }
        }
        if (iG == 1 || iG == 2) {
            e();
        } else if (iG != 3) {
            throw new IllegalArgumentException(String.valueOf(iG));
        }
        g(e0Var, z10, iG, j11);
    }
}
