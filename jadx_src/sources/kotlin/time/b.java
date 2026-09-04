package kotlin.time;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.u0;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@k
public abstract class b implements r.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final DurationUnit f128622b;

    /* JADX INFO: compiled from: TimeSources.kt */
    public static final class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f128623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final b f128624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f128625d;

        private a(long j10, b bVar, long j11) {
            this.f128623b = j10;
            this.f128624c = bVar;
            this.f128625d = j11;
        }

        public /* synthetic */ a(long j10, b bVar, long j11, u uVar) {
            this(j10, bVar, j11);
        }

        @Override // kotlin.time.d
        public long B(@dl.d d other) {
            f0.p(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (f0.g(this.f128624c, aVar.f128624c)) {
                    if (e.n(this.f128625d, aVar.f128625d) && e.i0(this.f128625d)) {
                        return e.f128628c.W();
                    }
                    long jL0 = e.l0(this.f128625d, aVar.f128625d);
                    long jN0 = g.n0(this.f128623b - aVar.f128623b, this.f128624c.b());
                    return e.n(jN0, e.C0(jL0)) ? e.f128628c.W() : e.m0(jN0, jL0);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.q
        public long a() {
            return e.i0(this.f128625d) ? e.C0(this.f128625d) : e.l0(g.n0(this.f128624c.c() - this.f128623b, this.f128624c.b()), this.f128625d);
        }

        @Override // kotlin.time.q
        public boolean b() {
            return d.a.b(this);
        }

        @Override // kotlin.time.q
        public boolean c() {
            return d.a.c(this);
        }

        public final long d() {
            if (e.i0(this.f128625d)) {
                return this.f128625d;
            }
            DurationUnit durationUnitB = this.f128624c.b();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            if (durationUnitB.compareTo(durationUnit) >= 0) {
                return e.m0(g.n0(this.f128623b, durationUnitB), this.f128625d);
            }
            long jB = i.b(1L, durationUnit, durationUnitB);
            long j10 = this.f128623b;
            long j11 = j10 / jB;
            long j12 = j10 % jB;
            long j13 = this.f128625d;
            long jU = e.U(j13);
            int iY = e.Y(j13);
            int i10 = iY / 1000000;
            long jN0 = g.n0(j12, durationUnitB);
            e.a aVar = e.f128628c;
            return e.m0(e.m0(e.m0(jN0, g.m0(iY % 1000000, DurationUnit.NANOSECONDS)), g.n0(j11 + ((long) i10), durationUnit)), g.n0(jU, DurationUnit.SECONDS));
        }

        @Override // kotlin.time.d
        public boolean equals(@dl.e Object obj) {
            return (obj instanceof a) && f0.g(this.f128624c, ((a) obj).f128624c) && e.n(B((d) obj), e.f128628c.W());
        }

        @Override // kotlin.time.d
        public int hashCode() {
            return e.e0(d());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k1 */
        public int compareTo(@dl.d d dVar) {
            return d.a.a(this, dVar);
        }

        @dl.d
        public String toString() {
            return "LongTimeMark(" + this.f128623b + j.h(this.f128624c.b()) + " + " + ((Object) e.z0(this.f128625d)) + " (=" + ((Object) e.z0(d())) + "), " + this.f128624c + ')';
        }

        @Override // kotlin.time.q
        @dl.d
        public d u(long j10) {
            return new a(this.f128623b, this.f128624c, e.m0(this.f128625d, j10), null);
        }

        @Override // kotlin.time.q
        @dl.d
        public d v(long j10) {
            return d.a.d(this, j10);
        }
    }

    public b(@dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        this.f128622b = unit;
    }

    @Override // kotlin.time.r
    @dl.d
    public d a() {
        return new a(c(), this, e.f128628c.W(), null);
    }

    @dl.d
    protected final DurationUnit b() {
        return this.f128622b;
    }

    protected abstract long c();
}
