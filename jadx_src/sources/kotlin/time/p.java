package kotlin.time;

import kotlin.u0;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@k
public final class p extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f128643c;

    public p() {
        super(DurationUnit.NANOSECONDS);
    }

    private final void d(long j10) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f128643c + j.h(b()) + " is advanced by " + ((Object) e.z0(j10)) + lg.a.f131414g);
    }

    @Override // kotlin.time.b
    protected long c() {
        return this.f128643c;
    }

    public final void e(long j10) {
        long j11;
        long jW0 = e.w0(j10, b());
        if (jW0 == Long.MIN_VALUE || jW0 == Long.MAX_VALUE) {
            double dT0 = this.f128643c + e.t0(j10, b());
            if (dT0 > 9.223372036854776E18d || dT0 < -9.223372036854776E18d) {
                d(j10);
            }
            j11 = (long) dT0;
        } else {
            long j12 = this.f128643c;
            j11 = j12 + jW0;
            if ((jW0 ^ j12) >= 0 && (j12 ^ j11) < 0) {
                d(j10);
            }
        }
        this.f128643c = j11;
    }
}
