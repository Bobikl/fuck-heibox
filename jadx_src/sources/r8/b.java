package r8;

import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.source.rtsp.k;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: RtpAacReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f138822j = "AAC-lbr";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f138823k = "AAC-hbr";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f138824l = "RtpAacReader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f138825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f138826b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f138827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f138828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f138829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f138830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f138831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e0 f138832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f138833i;

    public b(k kVar) {
        this.f138825a = kVar;
        this.f138827c = kVar.f48795b;
        String str = (String) com.google.android.exoplayer2.util.a.g(kVar.f48797d.get("mode"));
        if (com.google.common.base.a.a(str, f138823k)) {
            this.f138828d = 13;
            this.f138829e = 3;
        } else {
            if (!com.google.common.base.a.a(str, f138822j)) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f138828d = 6;
            this.f138829e = 2;
        }
        this.f138830f = this.f138829e + this.f138828d;
    }

    private static void e(e0 e0Var, long j10, int i10) {
        e0Var.e(j10, 1, i10, 0, null);
    }

    private static long f(long j10, long j11, long j12, int i10) {
        return j10 + u0.j1(j11 - j12, 1000000L, i10);
    }

    @Override // r8.e
    public void a(long j10, long j11) {
        this.f138831g = j10;
        this.f138833i = j11;
    }

    @Override // r8.e
    public void b(m mVar, int i10) {
        e0 e0VarB = mVar.b(i10, 1);
        this.f138832h = e0VarB;
        e0VarB.d(this.f138825a.f48796c);
    }

    @Override // r8.e
    public void c(long j10, int i10) {
        this.f138831g = j10;
    }

    @Override // r8.e
    public void d(com.google.android.exoplayer2.util.e0 e0Var, long j10, int i10, boolean z10) {
        com.google.android.exoplayer2.util.a.g(this.f138832h);
        short sC = e0Var.C();
        int i11 = sC / this.f138830f;
        long jF = f(this.f138833i, j10, this.f138831g, this.f138827c);
        this.f138826b.n(e0Var);
        if (i11 == 1) {
            int iH = this.f138826b.h(this.f138828d);
            this.f138826b.s(this.f138829e);
            this.f138832h.c(e0Var, e0Var.a());
            if (z10) {
                e(this.f138832h, jF, iH);
                return;
            }
            return;
        }
        e0Var.T((sC + 7) / 8);
        for (int i12 = 0; i12 < i11; i12++) {
            int iH2 = this.f138826b.h(this.f138828d);
            this.f138826b.s(this.f138829e);
            this.f138832h.c(e0Var, iH2);
            e(this.f138832h, jF, iH2);
            jF += u0.j1(i11, 1000000L, this.f138827c);
        }
    }
}
