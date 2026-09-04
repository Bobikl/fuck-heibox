package kotlin.time;

import com.igexin.assist.sdk.AssistPushConsts;
import com.umeng.analytics.pro.ak;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.r0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136930u)
@e2(markerClass = {k.class})
@xh.f
public final class e implements Comparable<e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f128628c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f128629d = i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f128630e = g.j(g.f128637c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f128631f = g.j(-4611686018427387903L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f128632b;

    /* JADX INFO: compiled from: Duration.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @sh.f
        public static /* synthetic */ void A(double d10) {
        }

        @sh.f
        public static /* synthetic */ void B(int i10) {
        }

        @sh.f
        public static /* synthetic */ void C(long j10) {
        }

        private final long D(double d10) {
            return g.l0(d10, DurationUnit.MINUTES);
        }

        private final long E(int i10) {
            return g.m0(i10, DurationUnit.MINUTES);
        }

        private final long F(long j10) {
            return g.n0(j10, DurationUnit.MINUTES);
        }

        @sh.f
        public static /* synthetic */ void G(double d10) {
        }

        @sh.f
        public static /* synthetic */ void H(int i10) {
        }

        @sh.f
        public static /* synthetic */ void I(long j10) {
        }

        private final long K(double d10) {
            return g.l0(d10, DurationUnit.NANOSECONDS);
        }

        private final long L(int i10) {
            return g.m0(i10, DurationUnit.NANOSECONDS);
        }

        private final long M(long j10) {
            return g.n0(j10, DurationUnit.NANOSECONDS);
        }

        @sh.f
        public static /* synthetic */ void N(double d10) {
        }

        @sh.f
        public static /* synthetic */ void O(int i10) {
        }

        @sh.f
        public static /* synthetic */ void P(long j10) {
        }

        private final long Q(double d10) {
            return g.l0(d10, DurationUnit.SECONDS);
        }

        private final long R(int i10) {
            return g.m0(i10, DurationUnit.SECONDS);
        }

        private final long S(long j10) {
            return g.n0(j10, DurationUnit.SECONDS);
        }

        @sh.f
        public static /* synthetic */ void T(double d10) {
        }

        @sh.f
        public static /* synthetic */ void U(int i10) {
        }

        @sh.f
        public static /* synthetic */ void V(long j10) {
        }

        private final long e(double d10) {
            return g.l0(d10, DurationUnit.DAYS);
        }

        private final long f(int i10) {
            return g.m0(i10, DurationUnit.DAYS);
        }

        private final long g(long j10) {
            return g.n0(j10, DurationUnit.DAYS);
        }

        @sh.f
        public static /* synthetic */ void h(double d10) {
        }

        @sh.f
        public static /* synthetic */ void i(int i10) {
        }

        @sh.f
        public static /* synthetic */ void j(long j10) {
        }

        private final long k(double d10) {
            return g.l0(d10, DurationUnit.HOURS);
        }

        private final long l(int i10) {
            return g.m0(i10, DurationUnit.HOURS);
        }

        private final long m(long j10) {
            return g.n0(j10, DurationUnit.HOURS);
        }

        @sh.f
        public static /* synthetic */ void n(double d10) {
        }

        @sh.f
        public static /* synthetic */ void o(int i10) {
        }

        @sh.f
        public static /* synthetic */ void p(long j10) {
        }

        private final long r(double d10) {
            return g.l0(d10, DurationUnit.MICROSECONDS);
        }

        private final long s(int i10) {
            return g.m0(i10, DurationUnit.MICROSECONDS);
        }

        private final long t(long j10) {
            return g.n0(j10, DurationUnit.MICROSECONDS);
        }

        @sh.f
        public static /* synthetic */ void u(double d10) {
        }

        @sh.f
        public static /* synthetic */ void v(int i10) {
        }

        @sh.f
        public static /* synthetic */ void w(long j10) {
        }

        private final long x(double d10) {
            return g.l0(d10, DurationUnit.MILLISECONDS);
        }

        private final long y(int i10) {
            return g.m0(i10, DurationUnit.MILLISECONDS);
        }

        private final long z(long j10) {
            return g.n0(j10, DurationUnit.MILLISECONDS);
        }

        public final long J() {
            return e.f128631f;
        }

        public final long W() {
            return e.f128629d;
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long X(double d10) {
            return g.l0(d10, DurationUnit.HOURS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long Y(int i10) {
            return g.m0(i10, DurationUnit.HOURS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long Z(long j10) {
            return g.n0(j10, DurationUnit.HOURS);
        }

        @k
        public final double a(double d10, @dl.d DurationUnit sourceUnit, @dl.d DurationUnit targetUnit) {
            f0.p(sourceUnit, "sourceUnit");
            f0.p(targetUnit, "targetUnit");
            return i.a(d10, sourceUnit, targetUnit);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long a0(double d10) {
            return g.l0(d10, DurationUnit.MICROSECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long b(double d10) {
            return g.l0(d10, DurationUnit.DAYS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long b0(int i10) {
            return g.m0(i10, DurationUnit.MICROSECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long c(int i10) {
            return g.m0(i10, DurationUnit.DAYS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long c0(long j10) {
            return g.n0(j10, DurationUnit.MICROSECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long d(long j10) {
            return g.n0(j10, DurationUnit.DAYS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long d0(double d10) {
            return g.l0(d10, DurationUnit.MILLISECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long e0(int i10) {
            return g.m0(i10, DurationUnit.MILLISECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long f0(long j10) {
            return g.n0(j10, DurationUnit.MILLISECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long g0(double d10) {
            return g.l0(d10, DurationUnit.MINUTES);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long h0(int i10) {
            return g.m0(i10, DurationUnit.MINUTES);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long i0(long j10) {
            return g.n0(j10, DurationUnit.MINUTES);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long j0(double d10) {
            return g.l0(d10, DurationUnit.NANOSECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long k0(int i10) {
            return g.m0(i10, DurationUnit.NANOSECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long l0(long j10) {
            return g.n0(j10, DurationUnit.NANOSECONDS);
        }

        public final long m0(@dl.d String value) {
            f0.p(value, "value");
            try {
                return g.f0(value, false);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e10);
            }
        }

        public final long n0(@dl.d String value) {
            f0.p(value, "value");
            try {
                return g.f0(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        @dl.e
        public final e o0(@dl.d String value) {
            f0.p(value, "value");
            try {
                return e.f(g.f0(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @dl.e
        public final e p0(@dl.d String value) {
            f0.p(value, "value");
            try {
                return e.f(g.f0(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return e.f128630e;
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long q0(double d10) {
            return g.l0(d10, DurationUnit.SECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long r0(int i10) {
            return g.m0(i10, DurationUnit.SECONDS);
        }

        @u0(version = s0.f136928s)
        @kotlin.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.s0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136930u)
        @k
        public final long s0(long j10) {
            return g.n0(j10, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ e(long j10) {
        this.f128632b = j10;
    }

    public static final double A(long j10) {
        return t0(j10, DurationUnit.MILLISECONDS);
    }

    @dl.d
    public static final String A0(long j10, @dl.d DurationUnit unit, int i10) {
        f0.p(unit, "unit");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i10).toString());
        }
        double dT0 = t0(j10, unit);
        if (Double.isInfinite(dT0)) {
            return String.valueOf(dT0);
        }
        return f.b(dT0, fi.u.B(i10, 12)) + j.h(unit);
    }

    public static /* synthetic */ String B0(long j10, DurationUnit durationUnit, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return A0(j10, durationUnit, i10);
    }

    @kotlin.k(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @kotlin.s0(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static /* synthetic */ void C() {
    }

    public static final long C0(long j10) {
        return g.i(-d0(j10), ((int) j10) & 1);
    }

    public static final double I(long j10) {
        return t0(j10, DurationUnit.MINUTES);
    }

    @kotlin.k(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @kotlin.s0(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static /* synthetic */ void J() {
    }

    public static final double K(long j10) {
        return t0(j10, DurationUnit.NANOSECONDS);
    }

    @kotlin.k(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @kotlin.s0(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static /* synthetic */ void L() {
    }

    public static final double M(long j10) {
        return t0(j10, DurationUnit.SECONDS);
    }

    public static final long N(long j10) {
        return w0(j10, DurationUnit.DAYS);
    }

    public static final long O(long j10) {
        return w0(j10, DurationUnit.HOURS);
    }

    public static final long P(long j10) {
        return w0(j10, DurationUnit.MICROSECONDS);
    }

    public static final long Q(long j10) {
        return (g0(j10) && f0(j10)) ? d0(j10) : w0(j10, DurationUnit.MILLISECONDS);
    }

    public static final long R(long j10) {
        return w0(j10, DurationUnit.MINUTES);
    }

    public static final long S(long j10) {
        long jD0 = d0(j10);
        if (h0(j10)) {
            return jD0;
        }
        if (jD0 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jD0 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return g.d0(jD0);
    }

    public static final long U(long j10) {
        return w0(j10, DurationUnit.SECONDS);
    }

    @r0
    public static /* synthetic */ void V() {
    }

    public static final int W(long j10) {
        if (i0(j10)) {
            return 0;
        }
        return (int) (R(j10) % ((long) 60));
    }

    @r0
    public static /* synthetic */ void X() {
    }

    public static final int Y(long j10) {
        if (i0(j10)) {
            return 0;
        }
        return (int) (g0(j10) ? g.d0(d0(j10) % ((long) 1000)) : d0(j10) % ((long) 1000000000));
    }

    @r0
    public static /* synthetic */ void Z() {
    }

    public static final int a0(long j10) {
        if (i0(j10)) {
            return 0;
        }
        return (int) (U(j10) % ((long) 60));
    }

    private static final DurationUnit b0(long j10) {
        return h0(j10) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    private static final int c0(long j10) {
        return ((int) j10) & 1;
    }

    private static final long d(long j10, long j11, long j12) {
        long jE0 = g.e0(j12);
        long j13 = j11 + jE0;
        if (!new fi.o(-4611686018426L, 4611686018426L).s(j13)) {
            return g.j(fi.u.K(j13, -4611686018427387903L, g.f128637c));
        }
        return g.l(g.d0(j13) + (j12 - g.d0(jE0)));
    }

    private static final long d0(long j10) {
        return j10 >> 1;
    }

    private static final void e(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append(lg.a.f131414g);
            String strU3 = StringsKt__StringsKt.U3(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strU3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strU3.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strU3, 0, ((i15 + 2) / 3) * 3);
                f0.o(sb2, "this.append(value, startIndex, endIndex)");
            } else {
                sb2.append((CharSequence) strU3, 0, i15);
                f0.o(sb2, "this.append(value, startIndex, endIndex)");
            }
        }
        sb2.append(str);
    }

    public static int e0(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static final /* synthetic */ e f(long j10) {
        return new e(j10);
    }

    public static final boolean f0(long j10) {
        return !i0(j10);
    }

    private static final boolean g0(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static int h(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return f0.u(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return j0(j10) ? -i10 : i10;
    }

    private static final boolean h0(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static long i(long j10) {
        if (f.d()) {
            if (h0(j10)) {
                if (!new fi.o(-4611686018426999999L, g.f128636b).s(d0(j10))) {
                    throw new AssertionError(d0(j10) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new fi.o(-4611686018427387903L, g.f128637c).s(d0(j10))) {
                    throw new AssertionError(d0(j10) + " ms is out of milliseconds range");
                }
                if (new fi.o(-4611686018426L, 4611686018426L).s(d0(j10))) {
                    throw new AssertionError(d0(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static final boolean i0(long j10) {
        return j10 == f128630e || j10 == f128631f;
    }

    public static final double j(long j10, long j11) {
        DurationUnit durationUnit = (DurationUnit) kotlin.comparisons.h.X(b0(j10), b0(j11));
        return t0(j10, durationUnit) / t0(j11, durationUnit);
    }

    public static final boolean j0(long j10) {
        return j10 < 0;
    }

    public static final long k(long j10, double d10) {
        int iK0 = di.d.K0(d10);
        if ((((double) iK0) == d10) && iK0 != 0) {
            return l(j10, iK0);
        }
        DurationUnit durationUnitB0 = b0(j10);
        return g.l0(t0(j10, durationUnitB0) / d10, durationUnitB0);
    }

    public static final boolean k0(long j10) {
        return j10 > 0;
    }

    public static final long l(long j10, int i10) {
        if (i10 == 0) {
            if (k0(j10)) {
                return f128630e;
            }
            if (j0(j10)) {
                return f128631f;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (h0(j10)) {
            return g.l(d0(j10) / ((long) i10));
        }
        if (i0(j10)) {
            return o0(j10, di.d.U(i10));
        }
        long j11 = i10;
        long jD0 = d0(j10) / j11;
        if (!new fi.o(-4611686018426L, 4611686018426L).s(jD0)) {
            return g.j(jD0);
        }
        return g.l(g.d0(jD0) + (g.d0(d0(j10) - (jD0 * j11)) / j11));
    }

    public static final long l0(long j10, long j11) {
        return m0(j10, C0(j11));
    }

    public static boolean m(long j10, Object obj) {
        return (obj instanceof e) && j10 == ((e) obj).D0();
    }

    public static final long m0(long j10, long j11) {
        if (i0(j10)) {
            if (f0(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (i0(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return g0(j10) ? d(j10, d0(j10), d0(j11)) : d(j10, d0(j11), d0(j10));
        }
        long jD0 = d0(j10) + d0(j11);
        return h0(j10) ? g.m(jD0) : g.k(jD0);
    }

    public static final boolean n(long j10, long j11) {
        return j10 == j11;
    }

    public static final long n0(long j10, double d10) {
        int iK0 = di.d.K0(d10);
        if (((double) iK0) == d10) {
            return o0(j10, iK0);
        }
        DurationUnit durationUnitB0 = b0(j10);
        return g.l0(t0(j10, durationUnitB0) * d10, durationUnitB0);
    }

    public static final long o(long j10) {
        return j0(j10) ? C0(j10) : j10;
    }

    public static final long o0(long j10, int i10) {
        if (i0(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : C0(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f128629d;
        }
        long jD0 = d0(j10);
        long j11 = i10;
        long j12 = jD0 * j11;
        if (!h0(j10)) {
            if (j12 / j11 == jD0) {
                return g.j(fi.u.L(j12, new fi.o(-4611686018427387903L, g.f128637c)));
            }
            return di.d.V(jD0) * di.d.U(i10) > 0 ? f128630e : f128631f;
        }
        if (new fi.o(-2147483647L, 2147483647L).s(jD0)) {
            return g.l(j12);
        }
        if (j12 / j11 == jD0) {
            return g.m(j12);
        }
        long jE0 = g.e0(jD0);
        long j13 = jE0 * j11;
        long jE1 = g.e0((jD0 - g.d0(jE0)) * j11) + j13;
        if (j13 / j11 != jE0 || (jE1 ^ j13) < 0) {
            return di.d.V(jD0) * di.d.U(i10) > 0 ? f128630e : f128631f;
        }
        return g.j(fi.u.L(jE1, new fi.o(-4611686018427387903L, g.f128637c)));
    }

    @r0
    public static /* synthetic */ void p() {
    }

    public static final <T> T p0(long j10, @dl.d yh.p<? super Long, ? super Integer, ? extends T> action) {
        f0.p(action, "action");
        return action.invoke(Long.valueOf(U(j10)), Integer.valueOf(Y(j10)));
    }

    public static final int q(long j10) {
        if (i0(j10)) {
            return 0;
        }
        return (int) (O(j10) % ((long) 24));
    }

    public static final <T> T q0(long j10, @dl.d yh.q<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        f0.p(action, "action");
        return action.invoke(Long.valueOf(R(j10)), Integer.valueOf(a0(j10)), Integer.valueOf(Y(j10)));
    }

    @kotlin.k(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @kotlin.s0(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static /* synthetic */ void r() {
    }

    public static final <T> T r0(long j10, @dl.d yh.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        f0.p(action, "action");
        return action.U0(Long.valueOf(O(j10)), Integer.valueOf(W(j10)), Integer.valueOf(a0(j10)), Integer.valueOf(Y(j10)));
    }

    public static final double s(long j10) {
        return t0(j10, DurationUnit.DAYS);
    }

    public static final <T> T s0(long j10, @dl.d yh.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        f0.p(action, "action");
        return action.N0(Long.valueOf(N(j10)), Integer.valueOf(q(j10)), Integer.valueOf(W(j10)), Integer.valueOf(a0(j10)), Integer.valueOf(Y(j10)));
    }

    @kotlin.k(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @kotlin.s0(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static /* synthetic */ void t() {
    }

    public static final double t0(long j10, @dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        if (j10 == f128630e) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f128631f) {
            return Double.NEGATIVE_INFINITY;
        }
        return i.a(d0(j10), b0(j10), unit);
    }

    public static final int u0(long j10, @dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        return (int) fi.u.K(w0(j10, unit), -2147483648L, 2147483647L);
    }

    @dl.d
    public static final String v0(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (j0(j10)) {
            sb2.append('-');
        }
        sb2.append(AssistPushConsts.MSG_VALUE_PAYLOAD);
        long jO = o(j10);
        long jO2 = O(jO);
        int iW = W(jO);
        int iA0 = a0(jO);
        int iY = Y(jO);
        if (i0(j10)) {
            jO2 = 9999999999999L;
        }
        boolean z10 = true;
        boolean z11 = jO2 != 0;
        boolean z12 = (iA0 == 0 && iY == 0) ? false : true;
        if (iW == 0 && (!z12 || !z11)) {
            z10 = false;
        }
        if (z11) {
            sb2.append(jO2);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iW);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            e(j10, sb2, iA0, iY, 9, androidx.exifinterface.media.a.R4, true);
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final double w(long j10) {
        return t0(j10, DurationUnit.HOURS);
    }

    public static final long w0(long j10, @dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        if (j10 == f128630e) {
            return Long.MAX_VALUE;
        }
        if (j10 == f128631f) {
            return Long.MIN_VALUE;
        }
        return i.b(d0(j10), b0(j10), unit);
    }

    @kotlin.k(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @kotlin.s0(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static /* synthetic */ void x() {
    }

    @kotlin.k(message = "Use inWholeMilliseconds property instead.", replaceWith = @kotlin.s0(expression = "this.inWholeMilliseconds", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static final long x0(long j10) {
        return Q(j10);
    }

    public static final double y(long j10) {
        return t0(j10, DurationUnit.MICROSECONDS);
    }

    @kotlin.k(message = "Use inWholeNanoseconds property instead.", replaceWith = @kotlin.s0(expression = "this.inWholeNanoseconds", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static final long y0(long j10) {
        return S(j10);
    }

    @kotlin.k(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @kotlin.s0(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @k
    @kotlin.l(errorSince = s0.f136934y, warningSince = s0.f136928s)
    public static /* synthetic */ void z() {
    }

    @dl.d
    public static String z0(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f128630e) {
            return "Infinity";
        }
        if (j10 == f128631f) {
            return "-Infinity";
        }
        boolean zJ0 = j0(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zJ0) {
            sb2.append('-');
        }
        long jO = o(j10);
        long jN = N(jO);
        int iQ = q(jO);
        int iW = W(jO);
        int iA0 = a0(jO);
        int iY = Y(jO);
        int i10 = 0;
        boolean z10 = jN != 0;
        boolean z11 = iQ != 0;
        boolean z12 = iW != 0;
        boolean z13 = (iA0 == 0 && iY == 0) ? false : true;
        if (z10) {
            sb2.append(jN);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iQ);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iW);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iA0 != 0 || z10 || z11 || z12) {
                e(j10, sb2, iA0, iY, 9, ak.aB, false);
            } else if (iY >= 1000000) {
                e(j10, sb2, iY / 1000000, iY % 1000000, 6, "ms", false);
            } else if (iY >= 1000) {
                e(j10, sb2, iY / 1000, iY % 1000, 3, "us", false);
            } else {
                sb2.append(iY);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zJ0 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final /* synthetic */ long D0() {
        return this.f128632b;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(e eVar) {
        return g(eVar.D0());
    }

    public boolean equals(Object obj) {
        return m(this.f128632b, obj);
    }

    public int g(long j10) {
        return h(this.f128632b, j10);
    }

    public int hashCode() {
        return e0(this.f128632b);
    }

    @dl.d
    public String toString() {
        return z0(this.f128632b);
    }
}
