package fi;

import java.util.NoSuchElementException;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.random.Random;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public class u extends t {
    public static final float A(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final Integer A0(@dl.d j jVar) {
        f0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.h());
    }

    @dl.d
    public static final a A1(@dl.d a aVar, int i10) {
        f0.p(aVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        a.C1073a c1073a = a.f118849e;
        char cH = aVar.h();
        char cI = aVar.i();
        if (aVar.j() <= 0) {
            i10 = -i10;
        }
        return c1073a.a(cH, cI, i10);
    }

    public static final int B(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final Long B0(@dl.d m mVar) {
        f0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.h());
    }

    @dl.d
    public static final j B1(@dl.d j jVar, int i10) {
        f0.p(jVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        j.a aVar = j.f118869e;
        int iH = jVar.h();
        int i11 = jVar.i();
        if (jVar.j() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iH, i11, i10);
    }

    public static final long C(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean C0(g gVar, byte b10) {
        f0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(b10));
    }

    @dl.d
    public static final m C1(@dl.d m mVar, long j10) {
        f0.p(mVar, "<this>");
        t.a(j10 > 0, Long.valueOf(j10));
        m.a aVar = m.f118879e;
        long jH = mVar.h();
        long jI = mVar.i();
        if (mVar.j() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jH, jI, j10);
    }

    @dl.d
    public static final <T extends Comparable<? super T>> T D(@dl.d T t10, @dl.d T maximumValue) {
        f0.p(t10, "<this>");
        f0.p(maximumValue, "maximumValue");
        return t10.compareTo(maximumValue) > 0 ? maximumValue : t10;
    }

    @xh.h(name = "floatRangeContains")
    public static final boolean D0(@dl.d g<Float> gVar, double d10) {
        f0.p(gVar, "<this>");
        return gVar.a(Float.valueOf((float) d10));
    }

    @dl.e
    public static final Byte D1(double d10) {
        boolean z10 = false;
        if (-128.0d <= d10 && d10 <= 127.0d) {
            z10 = true;
        }
        if (z10) {
            return Byte.valueOf((byte) d10);
        }
        return null;
    }

    public static final short E(short s10, short s11) {
        return s10 > s11 ? s11 : s10;
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean E0(g gVar, int i10) {
        f0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(i10));
    }

    @dl.e
    public static final Byte E1(float f10) {
        boolean z10 = false;
        if (-128.0f <= f10 && f10 <= 127.0f) {
            z10 = true;
        }
        if (z10) {
            return Byte.valueOf((byte) f10);
        }
        return null;
    }

    public static final byte F(byte b10, byte b11, byte b12) {
        if (b11 <= b12) {
            if (b10 < b11) {
                return b11;
            }
            return b10 > b12 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b12) + " is less than minimum " + ((int) b11) + lg.a.f131414g);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean F0(g gVar, long j10) {
        f0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(j10));
    }

    @dl.e
    public static final Byte F1(int i10) {
        if (new l(n5.a.f132012g, 127).s(i10)) {
            return Byte.valueOf((byte) i10);
        }
        return null;
    }

    public static final double G(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + lg.a.f131414g);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean G0(g gVar, short s10) {
        f0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(s10));
    }

    @dl.e
    public static final Byte G1(long j10) {
        if (new o(-128L, 127L).s(j10)) {
            return Byte.valueOf((byte) j10);
        }
        return null;
    }

    public static final float H(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + lg.a.f131414g);
    }

    @xh.h(name = "intRangeContains")
    public static final boolean H0(@dl.d g<Integer> gVar, byte b10) {
        f0.p(gVar, "<this>");
        return gVar.a(Integer.valueOf(b10));
    }

    @dl.e
    public static final Byte H1(short s10) {
        if (L0(new l(n5.a.f132012g, 127), s10)) {
            return Byte.valueOf((byte) s10);
        }
        return null;
    }

    public static final int I(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + lg.a.f131414g);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "intRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean I0(g gVar, double d10) {
        f0.p(gVar, "<this>");
        Integer numI1 = I1(d10);
        if (numI1 != null) {
            return gVar.a(numI1);
        }
        return false;
    }

    @dl.e
    public static final Integer I1(double d10) {
        boolean z10 = false;
        if (-2.147483648E9d <= d10 && d10 <= 2.147483647E9d) {
            z10 = true;
        }
        if (z10) {
            return Integer.valueOf((int) d10);
        }
        return null;
    }

    public static final int J(int i10, @dl.d g<Integer> range) {
        f0.p(range, "range");
        if (range instanceof f) {
            return ((Number) M(Integer.valueOf(i10), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i10 < ((Number) range.D()).intValue()) {
                return ((Number) range.D()).intValue();
            }
            return i10 > ((Number) range.e()).intValue() ? ((Number) range.e()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + lg.a.f131414g);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "intRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean J0(g gVar, float f10) {
        f0.p(gVar, "<this>");
        Integer numJ1 = J1(f10);
        if (numJ1 != null) {
            return gVar.a(numJ1);
        }
        return false;
    }

    @dl.e
    public static final Integer J1(float f10) {
        boolean z10 = false;
        if (-2.14748365E9f <= f10 && f10 <= 2.14748365E9f) {
            z10 = true;
        }
        if (z10) {
            return Integer.valueOf((int) f10);
        }
        return null;
    }

    public static final long K(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + lg.a.f131414g);
    }

    @xh.h(name = "intRangeContains")
    public static final boolean K0(@dl.d g<Integer> gVar, long j10) {
        f0.p(gVar, "<this>");
        Integer numK1 = K1(j10);
        if (numK1 != null) {
            return gVar.a(numK1);
        }
        return false;
    }

    @dl.e
    public static final Integer K1(long j10) {
        if (new o(-2147483648L, 2147483647L).s(j10)) {
            return Integer.valueOf((int) j10);
        }
        return null;
    }

    public static final long L(long j10, @dl.d g<Long> range) {
        f0.p(range, "range");
        if (range instanceof f) {
            return ((Number) M(Long.valueOf(j10), (f) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j10 < ((Number) range.D()).longValue()) {
                return ((Number) range.D()).longValue();
            }
            return j10 > ((Number) range.e()).longValue() ? ((Number) range.e()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + lg.a.f131414g);
    }

    @xh.h(name = "intRangeContains")
    public static final boolean L0(@dl.d g<Integer> gVar, short s10) {
        f0.p(gVar, "<this>");
        return gVar.a(Integer.valueOf(s10));
    }

    @dl.e
    public static final Long L1(double d10) {
        boolean z10 = false;
        if (-9.223372036854776E18d <= d10 && d10 <= 9.223372036854776E18d) {
            z10 = true;
        }
        if (z10) {
            return Long.valueOf((long) d10);
        }
        return null;
    }

    @u0(version = "1.1")
    @dl.d
    public static final <T extends Comparable<? super T>> T M(@dl.d T t10, @dl.d f<T> range) {
        f0.p(t10, "<this>");
        f0.p(range, "range");
        if (!range.isEmpty()) {
            if (!range.b(t10, range.D()) || range.b(range.D(), t10)) {
                return (!range.b(range.e(), t10) || range.b(t10, range.e())) ? t10 : range.e();
            }
            return range.D();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + lg.a.f131414g);
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "intRangeContains")
    @kotlin.q
    public static final boolean M0(@dl.d r<Integer> rVar, byte b10) {
        f0.p(rVar, "<this>");
        return rVar.a(Integer.valueOf(b10));
    }

    @dl.e
    public static final Long M1(float f10) {
        boolean z10 = false;
        if (-9.223372E18f <= f10 && f10 <= 9.223372E18f) {
            z10 = true;
        }
        if (z10) {
            return Long.valueOf((long) f10);
        }
        return null;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> T N(@dl.d T t10, @dl.d g<T> range) {
        f0.p(t10, "<this>");
        f0.p(range, "range");
        if (range instanceof f) {
            return (T) M(t10, (f) range);
        }
        if (!range.isEmpty()) {
            if (t10.compareTo(range.D()) < 0) {
                return (T) range.D();
            }
            return t10.compareTo(range.e()) > 0 ? (T) range.e() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + lg.a.f131414g);
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "intRangeContains")
    @kotlin.q
    public static final boolean N0(@dl.d r<Integer> rVar, long j10) {
        f0.p(rVar, "<this>");
        Integer numK1 = K1(j10);
        if (numK1 != null) {
            return rVar.a(numK1);
        }
        return false;
    }

    @dl.e
    public static final Short N1(double d10) {
        boolean z10 = false;
        if (-32768.0d <= d10 && d10 <= 32767.0d) {
            z10 = true;
        }
        if (z10) {
            return Short.valueOf((short) d10);
        }
        return null;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> T O(@dl.d T t10, @dl.e T t11, @dl.e T t12) {
        f0.p(t10, "<this>");
        if (t11 == null || t12 == null) {
            if (t11 != null && t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t12 != null && t10.compareTo(t12) > 0) {
                return t12;
            }
        } else {
            if (t11.compareTo(t12) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + lg.a.f131414g);
            }
            if (t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
        return t10;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "intRangeContains")
    @kotlin.q
    public static final boolean O0(@dl.d r<Integer> rVar, short s10) {
        f0.p(rVar, "<this>");
        return rVar.a(Integer.valueOf(s10));
    }

    @dl.e
    public static final Short O1(float f10) {
        boolean z10 = false;
        if (-32768.0f <= f10 && f10 <= 32767.0f) {
            z10 = true;
        }
        if (z10) {
            return Short.valueOf((short) f10);
        }
        return null;
    }

    public static final short P(short s10, short s11, short s12) {
        if (s11 <= s12) {
            if (s10 < s11) {
                return s11;
            }
            return s10 > s12 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s12) + " is less than minimum " + ((int) s11) + lg.a.f131414g);
    }

    @u0(version = s0.f136932w)
    public static final char P0(@dl.d a aVar) {
        f0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.i();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @dl.e
    public static final Short P1(int i10) {
        if (new l(-32768, 32767).s(i10)) {
            return Short.valueOf((short) i10);
        }
        return null;
    }

    @u0(version = "1.3")
    @sh.f
    private static final boolean Q(c cVar, Character ch2) {
        f0.p(cVar, "<this>");
        return ch2 != null && cVar.s(ch2.charValue());
    }

    @u0(version = s0.f136932w)
    public static final int Q0(@dl.d j jVar) {
        f0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.i();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @dl.e
    public static final Short Q1(long j10) {
        if (new o(-32768L, 32767L).s(j10)) {
            return Short.valueOf((short) j10);
        }
        return null;
    }

    @sh.f
    private static final boolean R(l lVar, byte b10) {
        f0.p(lVar, "<this>");
        return H0(lVar, b10);
    }

    @u0(version = s0.f136932w)
    public static final long R0(@dl.d m mVar) {
        f0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.i();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @dl.d
    public static final c R1(char c10, char c11) {
        return f0.t(c11, 0) <= 0 ? c.f118859f.a() : new c(c10, (char) (c11 - 1));
    }

    @sh.f
    private static final boolean S(l lVar, long j10) {
        f0.p(lVar, "<this>");
        return K0(lVar, j10);
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final Character S0(@dl.d a aVar) {
        f0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.i());
    }

    @dl.d
    public static final l S1(byte b10, byte b11) {
        return new l(b10, b11 - 1);
    }

    @u0(version = "1.3")
    @sh.f
    private static final boolean T(l lVar, Integer num) {
        f0.p(lVar, "<this>");
        return num != null && lVar.s(num.intValue());
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final Integer T0(@dl.d j jVar) {
        f0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.i());
    }

    @dl.d
    public static final l T1(byte b10, int i10) {
        return i10 <= Integer.MIN_VALUE ? l.f118877f.a() : new l(b10, i10 - 1);
    }

    @sh.f
    private static final boolean U(l lVar, short s10) {
        f0.p(lVar, "<this>");
        return L0(lVar, s10);
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final Long U0(@dl.d m mVar) {
        f0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.i());
    }

    @dl.d
    public static final l U1(byte b10, short s10) {
        return new l(b10, s10 - 1);
    }

    @sh.f
    private static final boolean V(o oVar, byte b10) {
        f0.p(oVar, "<this>");
        return V0(oVar, b10);
    }

    @xh.h(name = "longRangeContains")
    public static final boolean V0(@dl.d g<Long> gVar, byte b10) {
        f0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(b10));
    }

    @dl.d
    public static final l V1(int i10, byte b10) {
        return new l(i10, b10 - 1);
    }

    @sh.f
    private static final boolean W(o oVar, int i10) {
        f0.p(oVar, "<this>");
        return Y0(oVar, i10);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "longRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean W0(g gVar, double d10) {
        f0.p(gVar, "<this>");
        Long lL1 = L1(d10);
        if (lL1 != null) {
            return gVar.a(lL1);
        }
        return false;
    }

    @dl.d
    public static final l W1(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? l.f118877f.a() : new l(i10, i11 - 1);
    }

    @u0(version = "1.3")
    @sh.f
    private static final boolean X(o oVar, Long l10) {
        f0.p(oVar, "<this>");
        return l10 != null && oVar.s(l10.longValue());
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "longRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean X0(g gVar, float f10) {
        f0.p(gVar, "<this>");
        Long lM1 = M1(f10);
        if (lM1 != null) {
            return gVar.a(lM1);
        }
        return false;
    }

    @dl.d
    public static final l X1(int i10, short s10) {
        return new l(i10, s10 - 1);
    }

    @sh.f
    private static final boolean Y(o oVar, short s10) {
        f0.p(oVar, "<this>");
        return Z0(oVar, s10);
    }

    @xh.h(name = "longRangeContains")
    public static final boolean Y0(@dl.d g<Long> gVar, int i10) {
        f0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(i10));
    }

    @dl.d
    public static final l Y1(short s10, byte b10) {
        return new l(s10, b10 - 1);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean Z(g gVar, byte b10) {
        f0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(b10));
    }

    @xh.h(name = "longRangeContains")
    public static final boolean Z0(@dl.d g<Long> gVar, short s10) {
        f0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(s10));
    }

    @dl.d
    public static final l Z1(short s10, int i10) {
        return i10 <= Integer.MIN_VALUE ? l.f118877f.a() : new l(s10, i10 - 1);
    }

    @xh.h(name = "doubleRangeContains")
    public static final boolean a0(@dl.d g<Double> gVar, float f10) {
        f0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(f10));
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "longRangeContains")
    @kotlin.q
    public static final boolean a1(@dl.d r<Long> rVar, byte b10) {
        f0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(b10));
    }

    @dl.d
    public static final l a2(short s10, short s11) {
        return new l(s10, s11 - 1);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean b0(g gVar, int i10) {
        f0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(i10));
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "longRangeContains")
    @kotlin.q
    public static final boolean b1(@dl.d r<Long> rVar, int i10) {
        f0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(i10));
    }

    @dl.d
    public static final o b2(byte b10, long j10) {
        return j10 <= Long.MIN_VALUE ? o.f118887f.a() : new o(b10, j10 - 1);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean c0(g gVar, long j10) {
        f0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(j10));
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "longRangeContains")
    @kotlin.q
    public static final boolean c1(@dl.d r<Long> rVar, short s10) {
        f0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(s10));
    }

    @dl.d
    public static final o c2(int i10, long j10) {
        return j10 <= Long.MIN_VALUE ? o.f118887f.a() : new o(i10, j10 - 1);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean d0(g gVar, short s10) {
        f0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(s10));
    }

    @u0(version = "1.3")
    @sh.f
    private static final char d1(c cVar) {
        f0.p(cVar, "<this>");
        return e1(cVar, Random.f125033b);
    }

    @dl.d
    public static final o d2(long j10, byte b10) {
        return new o(j10, ((long) b10) - 1);
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "doubleRangeContains")
    @kotlin.q
    public static final boolean e0(@dl.d r<Double> rVar, float f10) {
        f0.p(rVar, "<this>");
        return rVar.a(Double.valueOf(f10));
    }

    @u0(version = "1.3")
    public static final char e1(@dl.d c cVar, @dl.d Random random) {
        f0.p(cVar, "<this>");
        f0.p(random, "random");
        try {
            return (char) random.n(cVar.h(), cVar.i() + 1);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @dl.d
    public static final o e2(long j10, int i10) {
        return new o(j10, ((long) i10) - 1);
    }

    @dl.d
    public static final a f0(char c10, char c11) {
        return a.f118849e.a(c10, c11, -1);
    }

    @u0(version = "1.3")
    @sh.f
    private static final int f1(l lVar) {
        f0.p(lVar, "<this>");
        return g1(lVar, Random.f125033b);
    }

    @dl.d
    public static final o f2(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? o.f118887f.a() : new o(j10, j11 - 1);
    }

    @dl.d
    public static final j g0(byte b10, byte b11) {
        return j.f118869e.a(b10, b11, -1);
    }

    @u0(version = "1.3")
    public static final int g1(@dl.d l lVar, @dl.d Random random) {
        f0.p(lVar, "<this>");
        f0.p(random, "random");
        try {
            return kotlin.random.d.h(random, lVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @dl.d
    public static final o g2(long j10, short s10) {
        return new o(j10, ((long) s10) - 1);
    }

    @dl.d
    public static final j h0(byte b10, int i10) {
        return j.f118869e.a(b10, i10, -1);
    }

    @u0(version = "1.3")
    @sh.f
    private static final long h1(o oVar) {
        f0.p(oVar, "<this>");
        return i1(oVar, Random.f125033b);
    }

    @dl.d
    public static final o h2(short s10, long j10) {
        return j10 <= Long.MIN_VALUE ? o.f118887f.a() : new o(s10, j10 - 1);
    }

    @dl.d
    public static final j i0(byte b10, short s10) {
        return j.f118869e.a(b10, s10, -1);
    }

    @u0(version = "1.3")
    public static final long i1(@dl.d o oVar, @dl.d Random random) {
        f0.p(oVar, "<this>");
        f0.p(random, "random");
        try {
            return kotlin.random.d.i(random, oVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "byteRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean j(g gVar, double d10) {
        f0.p(gVar, "<this>");
        Byte bD1 = D1(d10);
        if (bD1 != null) {
            return gVar.a(bD1);
        }
        return false;
    }

    @dl.d
    public static final j j0(int i10, byte b10) {
        return j.f118869e.a(i10, b10, -1);
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Character j1(c cVar) {
        f0.p(cVar, "<this>");
        return k1(cVar, Random.f125033b);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "byteRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean k(g gVar, float f10) {
        f0.p(gVar, "<this>");
        Byte bE1 = E1(f10);
        if (bE1 != null) {
            return gVar.a(bE1);
        }
        return false;
    }

    @dl.d
    public static final j k0(int i10, int i11) {
        return j.f118869e.a(i10, i11, -1);
    }

    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Character k1(@dl.d c cVar, @dl.d Random random) {
        f0.p(cVar, "<this>");
        f0.p(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.n(cVar.h(), cVar.i() + 1));
    }

    @xh.h(name = "byteRangeContains")
    public static final boolean l(@dl.d g<Byte> gVar, int i10) {
        f0.p(gVar, "<this>");
        Byte bF1 = F1(i10);
        if (bF1 != null) {
            return gVar.a(bF1);
        }
        return false;
    }

    @dl.d
    public static final j l0(int i10, short s10) {
        return j.f118869e.a(i10, s10, -1);
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Integer l1(l lVar) {
        f0.p(lVar, "<this>");
        return m1(lVar, Random.f125033b);
    }

    @xh.h(name = "byteRangeContains")
    public static final boolean m(@dl.d g<Byte> gVar, long j10) {
        f0.p(gVar, "<this>");
        Byte bG1 = G1(j10);
        if (bG1 != null) {
            return gVar.a(bG1);
        }
        return false;
    }

    @dl.d
    public static final j m0(short s10, byte b10) {
        return j.f118869e.a(s10, b10, -1);
    }

    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Integer m1(@dl.d l lVar, @dl.d Random random) {
        f0.p(lVar, "<this>");
        f0.p(random, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.d.h(random, lVar));
    }

    @xh.h(name = "byteRangeContains")
    public static final boolean n(@dl.d g<Byte> gVar, short s10) {
        f0.p(gVar, "<this>");
        Byte bH1 = H1(s10);
        if (bH1 != null) {
            return gVar.a(bH1);
        }
        return false;
    }

    @dl.d
    public static final j n0(short s10, int i10) {
        return j.f118869e.a(s10, i10, -1);
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Long n1(o oVar) {
        f0.p(oVar, "<this>");
        return o1(oVar, Random.f125033b);
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "byteRangeContains")
    @kotlin.q
    public static final boolean o(@dl.d r<Byte> rVar, int i10) {
        f0.p(rVar, "<this>");
        Byte bF1 = F1(i10);
        if (bF1 != null) {
            return rVar.a(bF1);
        }
        return false;
    }

    @dl.d
    public static final j o0(short s10, short s11) {
        return j.f118869e.a(s10, s11, -1);
    }

    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Long o1(@dl.d o oVar, @dl.d Random random) {
        f0.p(oVar, "<this>");
        f0.p(random, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.d.i(random, oVar));
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "byteRangeContains")
    @kotlin.q
    public static final boolean p(@dl.d r<Byte> rVar, long j10) {
        f0.p(rVar, "<this>");
        Byte bG1 = G1(j10);
        if (bG1 != null) {
            return rVar.a(bG1);
        }
        return false;
    }

    @dl.d
    public static final m p0(byte b10, long j10) {
        return m.f118879e.a(b10, j10, -1L);
    }

    @dl.d
    public static final a p1(@dl.d a aVar) {
        f0.p(aVar, "<this>");
        return a.f118849e.a(aVar.i(), aVar.h(), -aVar.j());
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "byteRangeContains")
    @kotlin.q
    public static final boolean q(@dl.d r<Byte> rVar, short s10) {
        f0.p(rVar, "<this>");
        Byte bH1 = H1(s10);
        if (bH1 != null) {
            return rVar.a(bH1);
        }
        return false;
    }

    @dl.d
    public static final m q0(int i10, long j10) {
        return m.f118879e.a(i10, j10, -1L);
    }

    @dl.d
    public static final j q1(@dl.d j jVar) {
        f0.p(jVar, "<this>");
        return j.f118869e.a(jVar.i(), jVar.h(), -jVar.j());
    }

    public static final byte r(byte b10, byte b11) {
        return b10 < b11 ? b11 : b10;
    }

    @dl.d
    public static final m r0(long j10, byte b10) {
        return m.f118879e.a(j10, b10, -1L);
    }

    @dl.d
    public static final m r1(@dl.d m mVar) {
        f0.p(mVar, "<this>");
        return m.f118879e.a(mVar.i(), mVar.h(), -mVar.j());
    }

    public static final double s(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    @dl.d
    public static final m s0(long j10, int i10) {
        return m.f118879e.a(j10, i10, -1L);
    }

    @xh.h(name = "shortRangeContains")
    public static final boolean s1(@dl.d g<Short> gVar, byte b10) {
        f0.p(gVar, "<this>");
        return gVar.a(Short.valueOf(b10));
    }

    public static final float t(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    @dl.d
    public static final m t0(long j10, long j11) {
        return m.f118879e.a(j10, j11, -1L);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "shortRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean t1(g gVar, double d10) {
        f0.p(gVar, "<this>");
        Short shN1 = N1(d10);
        if (shN1 != null) {
            return gVar.a(shN1);
        }
        return false;
    }

    public static final int u(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    @dl.d
    public static final m u0(long j10, short s10) {
        return m.f118879e.a(j10, s10, -1L);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @xh.h(name = "shortRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = s0.f136928s, warningSince = "1.3")
    public static final /* synthetic */ boolean u1(g gVar, float f10) {
        f0.p(gVar, "<this>");
        Short shO1 = O1(f10);
        if (shO1 != null) {
            return gVar.a(shO1);
        }
        return false;
    }

    public static final long v(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    @dl.d
    public static final m v0(short s10, long j10) {
        return m.f118879e.a(s10, j10, -1L);
    }

    @xh.h(name = "shortRangeContains")
    public static final boolean v1(@dl.d g<Short> gVar, int i10) {
        f0.p(gVar, "<this>");
        Short shP1 = P1(i10);
        if (shP1 != null) {
            return gVar.a(shP1);
        }
        return false;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> T w(@dl.d T t10, @dl.d T minimumValue) {
        f0.p(t10, "<this>");
        f0.p(minimumValue, "minimumValue");
        return t10.compareTo(minimumValue) < 0 ? minimumValue : t10;
    }

    @u0(version = s0.f136932w)
    public static final char w0(@dl.d a aVar) {
        f0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.h();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @xh.h(name = "shortRangeContains")
    public static final boolean w1(@dl.d g<Short> gVar, long j10) {
        f0.p(gVar, "<this>");
        Short shQ1 = Q1(j10);
        if (shQ1 != null) {
            return gVar.a(shQ1);
        }
        return false;
    }

    public static final short x(short s10, short s11) {
        return s10 < s11 ? s11 : s10;
    }

    @u0(version = s0.f136932w)
    public static final int x0(@dl.d j jVar) {
        f0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.h();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "shortRangeContains")
    @kotlin.q
    public static final boolean x1(@dl.d r<Short> rVar, byte b10) {
        f0.p(rVar, "<this>");
        return rVar.a(Short.valueOf(b10));
    }

    public static final byte y(byte b10, byte b11) {
        return b10 > b11 ? b11 : b10;
    }

    @u0(version = s0.f136932w)
    public static final long y0(@dl.d m mVar) {
        f0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.h();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "shortRangeContains")
    @kotlin.q
    public static final boolean y1(@dl.d r<Short> rVar, int i10) {
        f0.p(rVar, "<this>");
        Short shP1 = P1(i10);
        if (shP1 != null) {
            return rVar.a(shP1);
        }
        return false;
    }

    public static final double z(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final Character z0(@dl.d a aVar) {
        f0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.h());
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "shortRangeContains")
    @kotlin.q
    public static final boolean z1(@dl.d r<Short> rVar, long j10) {
        f0.p(rVar, "<this>");
        Short shQ1 = Q1(j10);
        if (shQ1 != null) {
            return rVar.a(shQ1);
        }
        return false;
    }
}
