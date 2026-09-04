package q8;

import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f138635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f138636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f138637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f138638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f138639h;

    public e(c cVar, int i10, long j10, long j11) {
        this.f138635d = cVar;
        this.f138636e = i10;
        this.f138637f = j10;
        long j12 = (j11 - j10) / ((long) cVar.f138628e);
        this.f138638g = j12;
        this.f138639h = a(j12);
    }

    private long a(long j10) {
        return u0.j1(j10 * ((long) this.f138636e), 1000000L, this.f138635d.f138626c);
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        long jT = u0.t((((long) this.f138635d.f138626c) * j10) / (((long) this.f138636e) * 1000000), 0L, this.f138638g - 1);
        long j11 = this.f138637f + (((long) this.f138635d.f138628e) * jT);
        long jA = a(jT);
        c0 c0Var = new c0(jA, j11);
        if (jA >= j10 || jT == this.f138638g - 1) {
            return new b0.a(c0Var);
        }
        long j12 = jT + 1;
        return new b0.a(c0Var, new c0(a(j12), this.f138637f + (((long) this.f138635d.f138628e) * j12)));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f138639h;
    }
}
