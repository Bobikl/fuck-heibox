package kotlin.time;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.u0;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@kotlin.k(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@k
public abstract class a implements r.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final DurationUnit f128618b;

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TimeSources.kt */
    public static final class C1187a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f128619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final a f128620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f128621d;

        private C1187a(double d10, a aVar, long j10) {
            this.f128619b = d10;
            this.f128620c = aVar;
            this.f128621d = j10;
        }

        public /* synthetic */ C1187a(double d10, a aVar, long j10, u uVar) {
            this(d10, aVar, j10);
        }

        @Override // kotlin.time.d
        public long B(@dl.d d other) {
            f0.p(other, "other");
            if (other instanceof C1187a) {
                C1187a c1187a = (C1187a) other;
                if (f0.g(this.f128620c, c1187a.f128620c)) {
                    if (e.n(this.f128621d, c1187a.f128621d) && e.i0(this.f128621d)) {
                        return e.f128628c.W();
                    }
                    long jL0 = e.l0(this.f128621d, c1187a.f128621d);
                    long jL1 = g.l0(this.f128619b - c1187a.f128619b, this.f128620c.b());
                    return e.n(jL1, e.C0(jL0)) ? e.f128628c.W() : e.m0(jL1, jL0);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.q
        public long a() {
            return e.l0(g.l0(this.f128620c.c() - this.f128619b, this.f128620c.b()), this.f128621d);
        }

        @Override // kotlin.time.q
        public boolean b() {
            return d.a.b(this);
        }

        @Override // kotlin.time.q
        public boolean c() {
            return d.a.c(this);
        }

        @Override // kotlin.time.d
        public boolean equals(@dl.e Object obj) {
            return (obj instanceof C1187a) && f0.g(this.f128620c, ((C1187a) obj).f128620c) && e.n(B((d) obj), e.f128628c.W());
        }

        @Override // kotlin.time.d
        public int hashCode() {
            return e.e0(e.m0(g.l0(this.f128619b, this.f128620c.b()), this.f128621d));
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k1 */
        public int compareTo(@dl.d d dVar) {
            return d.a.a(this, dVar);
        }

        @dl.d
        public String toString() {
            return "DoubleTimeMark(" + this.f128619b + j.h(this.f128620c.b()) + " + " + ((Object) e.z0(this.f128621d)) + ", " + this.f128620c + ')';
        }

        @Override // kotlin.time.q
        @dl.d
        public d u(long j10) {
            return new C1187a(this.f128619b, this.f128620c, e.m0(this.f128621d, j10), null);
        }

        @Override // kotlin.time.q
        @dl.d
        public d v(long j10) {
            return d.a.d(this, j10);
        }
    }

    public a(@dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        this.f128618b = unit;
    }

    @Override // kotlin.time.r
    @dl.d
    public d a() {
        return new C1187a(c(), this, e.f128628c.W(), null);
    }

    @dl.d
    protected final DurationUnit b() {
        return this.f128618b;
    }

    protected abstract double c();
}
