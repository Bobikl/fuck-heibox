package r8;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.source.rtsp.k;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.z;
import com.google.common.primitives.SignedBytes;
import mk.m;

/* JADX INFO: compiled from: RtpH264Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f138846j = "RtpH264Reader";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f138847k = 90000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f138848l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f138849m = 24;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f138850n = 28;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f138851o = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f138854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f138855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f138856e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f138859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f138860i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f138853b = new com.google.android.exoplayer2.util.e0(z.f51618b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f138852a = new com.google.android.exoplayer2.util.e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f138857f = j.f46377b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f138858g = -1;

    public d(k kVar) {
        this.f138854c = kVar;
    }

    private static int e(int i10) {
        return i10 == 5 ? 1 : 0;
    }

    @m({"trackOutput"})
    private void f(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        byte b10 = e0Var.d()[0];
        byte b11 = e0Var.d()[1];
        int i11 = (b10 & 224) | (b11 & 31);
        boolean z10 = (b11 & 128) > 0;
        boolean z11 = (b11 & SignedBytes.f59068a) > 0;
        if (z10) {
            this.f138859h += j();
            e0Var.d()[1] = (byte) i11;
            this.f138852a.P(e0Var.d());
            this.f138852a.S(1);
        } else {
            int i12 = (this.f138858g + 1) % 65535;
            if (i10 != i12) {
                u.m(f138846j, u0.H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i12), Integer.valueOf(i10)));
                return;
            } else {
                this.f138852a.P(e0Var.d());
                this.f138852a.S(2);
            }
        }
        int iA = this.f138852a.a();
        this.f138855d.c(this.f138852a, iA);
        this.f138859h += iA;
        if (z11) {
            this.f138856e = e(i11 & 31);
        }
    }

    @m({"trackOutput"})
    private void g(com.google.android.exoplayer2.util.e0 e0Var) {
        int iA = e0Var.a();
        this.f138859h += j();
        this.f138855d.c(e0Var, iA);
        this.f138859h += iA;
        this.f138856e = e(e0Var.d()[0] & 31);
    }

    @m({"trackOutput"})
    private void h(com.google.android.exoplayer2.util.e0 e0Var) {
        e0Var.G();
        while (e0Var.a() > 4) {
            int iM = e0Var.M();
            this.f138859h += j();
            this.f138855d.c(e0Var, iM);
            this.f138859h += iM;
        }
        this.f138856e = 0;
    }

    private static long i(long j10, long j11, long j12) {
        return j10 + u0.j1(j11 - j12, 1000000L, f138847k);
    }

    private int j() {
        this.f138853b.S(0);
        int iA = this.f138853b.a();
        ((e0) com.google.android.exoplayer2.util.a.g(this.f138855d)).c(this.f138853b, iA);
        return iA;
    }

    @Override // r8.e
    public void a(long j10, long j11) {
        this.f138857f = j10;
        this.f138859h = 0;
        this.f138860i = j11;
    }

    @Override // r8.e
    public void b(com.google.android.exoplayer2.extractor.m mVar, int i10) {
        e0 e0VarB = mVar.b(i10, 2);
        this.f138855d = e0VarB;
        ((e0) u0.k(e0VarB)).d(this.f138854c.f48796c);
    }

    @Override // r8.e
    public void c(long j10, int i10) {
    }

    @Override // r8.e
    public void d(com.google.android.exoplayer2.util.e0 e0Var, long j10, int i10, boolean z10) throws ParserException {
        try {
            int i11 = e0Var.d()[0] & 31;
            com.google.android.exoplayer2.util.a.k(this.f138855d);
            if (i11 > 0 && i11 < 24) {
                g(e0Var);
            } else if (i11 == 24) {
                h(e0Var);
            } else {
                if (i11 != 28) {
                    throw ParserException.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                }
                f(e0Var, i10);
            }
            if (z10) {
                if (this.f138857f == j.f46377b) {
                    this.f138857f = j10;
                }
                this.f138855d.e(i(this.f138860i, j10, this.f138857f), this.f138856e, this.f138859h, 0, null);
                this.f138859h = 0;
            }
            this.f138858g = i10;
        } catch (IndexOutOfBoundsException e10) {
            throw ParserException.c(null, e10);
        }
    }
}
