package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.k0;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.s0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.u;
import kotlin.u0;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f128635a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f128636b = 4611686018426999999L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f128637c = 4611686018427387903L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f128638d = 4611686018426L;

    public static final long A(int i10) {
        return m0(i10, DurationUnit.MICROSECONDS);
    }

    public static final long B(long j10) {
        return n0(j10, DurationUnit.MICROSECONDS);
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void C(double d10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void D(int i10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void E(long j10) {
    }

    public static final long F(double d10) {
        return l0(d10, DurationUnit.MILLISECONDS);
    }

    public static final long G(int i10) {
        return m0(i10, DurationUnit.MILLISECONDS);
    }

    public static final long H(long j10) {
        return n0(j10, DurationUnit.MILLISECONDS);
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void I(double d10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void J(int i10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void K(long j10) {
    }

    public static final long L(double d10) {
        return l0(d10, DurationUnit.MINUTES);
    }

    public static final long M(int i10) {
        return m0(i10, DurationUnit.MINUTES);
    }

    public static final long N(long j10) {
        return n0(j10, DurationUnit.MINUTES);
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void O(double d10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void P(int i10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void Q(long j10) {
    }

    public static final long R(double d10) {
        return l0(d10, DurationUnit.NANOSECONDS);
    }

    public static final long S(int i10) {
        return m0(i10, DurationUnit.NANOSECONDS);
    }

    public static final long T(long j10) {
        return n0(j10, DurationUnit.NANOSECONDS);
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void U(double d10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void V(int i10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void W(long j10) {
    }

    public static final long X(double d10) {
        return l0(d10, DurationUnit.SECONDS);
    }

    public static final long Y(int i10) {
        return m0(i10, DurationUnit.SECONDS);
    }

    public static final long Z(long j10) {
        return n0(j10, DurationUnit.SECONDS);
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void a0(double d10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void b0(int i10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void c0(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d0(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e0(long j10) {
        return j10 / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:170:0x00a6 A[EDGE_INSN: B:170:0x00a6->B:49:0x00a6 BREAK  A[LOOP:1: B:36:0x006c->B:47:0x0098], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0098 A[LOOP:1: B:36:0x006c->B:47:0x0098, LOOP_END] */
    public static final long f0(String str, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        e.a aVar = e.f128628c;
        long jW = aVar.W();
        char cCharAt = str.charAt(0);
        boolean z12 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z13 = length2 > 0;
        boolean z14 = z13 && StringsKt__StringsKt.e5(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = '9';
        char c11 = '0';
        String str2 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z15 = false;
            DurationUnit durationUnit = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt2 = str.charAt(i13);
                        if (!new fi.c(c11, c10).s(cCharAt2)) {
                            i11 = length;
                            if (!StringsKt__StringsKt.V2("+-.", cCharAt2, false, 2, null)) {
                                z11 = false;
                            }
                            if (z11) {
                                break;
                            }
                            i13++;
                            length = i11;
                            c11 = '0';
                            c10 = '9';
                        } else {
                            i11 = length;
                        }
                        z11 = true;
                        if (z11) {
                            break;
                            break;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = '9';
                    }
                    f0.n(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 > StringsKt__StringsKt.j3(str)) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt3 = str.charAt(length3);
                    i12 = length3 + 1;
                    DurationUnit durationUnitF = j.f(cCharAt3, z15);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitF) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iR3 = StringsKt__StringsKt.r3(strSubstring, lg.a.f131414g, 0, false, 6, null);
                    if (durationUnitF != DurationUnit.SECONDS || iR3 <= 0) {
                        jW = e.m0(jW, n0(g0(strSubstring), durationUnitF));
                    } else {
                        f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iR3);
                        f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        long jM0 = e.m0(jW, n0(g0(strSubstring2), durationUnitF));
                        f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iR3);
                        f0.o(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        jW = e.m0(jM0, l0(Double.parseDouble(strSubstring3), durationUnitF));
                    }
                    z15 = z15;
                    durationUnit = durationUnitF;
                    length = i11;
                    c11 = '0';
                    c10 = '9';
                    z12 = true;
                } else {
                    if (z15 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z15 = z12;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            String str3 = "Unexpected order of duration components";
            DurationUnit durationUnit2 = null;
            if (u.e2(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jW = aVar.q();
            } else {
                boolean z16 = !z13;
                if (z13 && str.charAt(length2) == '(' && StringsKt___StringsKt.u7(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z16 = true;
                } else {
                    i10 = length;
                }
                boolean z17 = false;
                while (length2 < i10) {
                    if (z17 && z16) {
                        while (length2 < str.length()) {
                            if (!(str.charAt(length2) == ' ')) {
                                break;
                            }
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length()) {
                        char cCharAt4 = str.charAt(i15);
                        if (!(new fi.c('0', '9').s(cCharAt4) || cCharAt4 == '.')) {
                            break;
                        }
                        i15++;
                    }
                    f0.n(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    f0.o(strSubstring4, str2);
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length()) {
                        if (!new fi.c('a', 'z').s(str.charAt(i16))) {
                            break;
                        }
                        i16++;
                    }
                    f0.n(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    f0.o(strSubstring5, str2);
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitG = j.g(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitG) <= 0) {
                        throw new IllegalArgumentException(str3);
                    }
                    String str4 = str3;
                    int iR4 = StringsKt__StringsKt.r3(strSubstring4, lg.a.f131414g, 0, false, 6, null);
                    if (iR4 > 0) {
                        f0.n(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iR4);
                        f0.o(strSubstring6, str2);
                        long jM1 = e.m0(jW, n0(Long.parseLong(strSubstring6), durationUnitG));
                        f0.n(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iR4);
                        f0.o(strSubstring7, "this as java.lang.String).substring(startIndex)");
                        jW = e.m0(jM1, l0(Double.parseDouble(strSubstring7), durationUnitG));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jW = e.m0(jW, n0(Long.parseLong(strSubstring4), durationUnitG));
                    }
                    str3 = str4;
                    durationUnit2 = durationUnitG;
                    str2 = str2;
                    z17 = true;
                }
            }
        }
        return z14 ? e.C0(jW) : jW;
    }

    private static final long g0(String str) {
        boolean z10;
        int length = str.length();
        int i10 = (length <= 0 || !StringsKt__StringsKt.V2("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable lVar = new fi.l(i10, StringsKt__StringsKt.j3(str));
            if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                Iterator it = lVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    if (!new fi.c('0', '9').s(str.charAt(((k0) it).nextInt()))) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (u.v2(str, "+", false, 2, null)) {
            str = StringsKt___StringsKt.B6(str, 1);
        }
        return Long.parseLong(str);
    }

    private static final int h0(String str, int i10, yh.l<? super Character, Boolean> lVar) {
        while (i10 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
            i10++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return e.i((j10 << 1) + ((long) i10));
    }

    private static final String i0(String str, int i10, yh.l<? super Character, Boolean> lVar) {
        int i11 = i10;
        while (i11 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        f0.n(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return e.i((j10 << 1) + 1);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {k.class})
    @sh.f
    private static final long j0(double d10, long j10) {
        return e.n0(j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return new fi.o(-4611686018426L, f128638d).s(j10) ? l(d0(j10)) : j(fi.u.K(j10, -4611686018427387903L, f128637c));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {k.class})
    @sh.f
    private static final long k0(int i10, long j10) {
        return e.o0(j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return e.i(j10 << 1);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {k.class})
    public static final long l0(double d10, @dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        double dA = i.a(d10, unit, DurationUnit.NANOSECONDS);
        if (!(!Double.isNaN(dA))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jM0 = di.d.M0(dA);
        return new fi.o(-4611686018426999999L, f128636b).s(jM0) ? l(jM0) : k(di.d.M0(i.a(d10, unit, DurationUnit.MILLISECONDS)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return new fi.o(-4611686018426999999L, f128636b).s(j10) ? l(j10) : j(e0(j10));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {k.class})
    public static final long m0(int i10, @dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? l(i.c(i10, unit, DurationUnit.NANOSECONDS)) : n0(i10, unit);
    }

    public static final long n(double d10) {
        return l0(d10, DurationUnit.DAYS);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {k.class})
    public static final long n0(long j10, @dl.d DurationUnit unit) {
        f0.p(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jC = i.c(f128636b, durationUnit, unit);
        return new fi.o(-jC, jC).s(j10) ? l(i.c(j10, unit, durationUnit)) : j(fi.u.K(i.b(j10, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, f128637c));
    }

    public static final long o(int i10) {
        return m0(i10, DurationUnit.DAYS);
    }

    public static final long p(long j10) {
        return n0(j10, DurationUnit.DAYS);
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void q(double d10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void r(int i10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void s(long j10) {
    }

    public static final long t(double d10) {
        return l0(d10, DurationUnit.HOURS);
    }

    public static final long u(int i10) {
        return m0(i10, DurationUnit.HOURS);
    }

    public static final long v(long j10) {
        return n0(j10, DurationUnit.HOURS);
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void w(double d10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void x(int i10) {
    }

    @u0(version = "1.3")
    @kotlin.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @s0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136934y, warningSince = org.apache.tools.ant.util.s0.f136928s)
    @k
    public static /* synthetic */ void y(long j10) {
    }

    public static final long z(double d10) {
        return l0(d10, DurationUnit.MICROSECONDS);
    }
}
