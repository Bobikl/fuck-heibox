package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class s extends r {
    @u0(version = "1.2")
    @sh.f
    private static final BigInteger A0(String str, int i10) {
        f0.p(str, "<this>");
        return new BigInteger(str, b.a(i10));
    }

    @u0(version = "1.2")
    @dl.e
    public static final BigInteger B0(@dl.d String str) {
        f0.p(str, "<this>");
        return C0(str, 10);
    }

    @u0(version = "1.2")
    @dl.e
    public static final BigInteger C0(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i11 = str.charAt(0) == '-' ? 1 : 0; i11 < length; i11++) {
                if (b.b(str.charAt(i11), i10) < 0) {
                    return null;
                }
            }
        } else if (b.b(str.charAt(0), i10) < 0) {
            return null;
        }
        return new BigInteger(str, b.a(i10));
    }

    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ boolean D0(String str) {
        f0.p(str, "<this>");
        return Boolean.parseBoolean(str);
    }

    @u0(version = "1.4")
    @xh.h(name = "toBooleanNullable")
    @sh.f
    private static final boolean E0(String str) {
        return Boolean.parseBoolean(str);
    }

    @sh.f
    private static final byte F0(String str) {
        f0.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @u0(version = "1.1")
    @sh.f
    private static final byte G0(String str, int i10) {
        f0.p(str, "<this>");
        return Byte.parseByte(str, b.a(i10));
    }

    @sh.f
    private static final double H0(String str) {
        f0.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Double I0(@dl.d String str) {
        f0.p(str, "<this>");
        try {
            if (l.f128589b.k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @sh.f
    private static final float J0(String str) {
        f0.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Float K0(@dl.d String str) {
        f0.p(str, "<this>");
        try {
            if (l.f128589b.k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @sh.f
    private static final int L0(String str) {
        f0.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @u0(version = "1.1")
    @sh.f
    private static final int M0(String str, int i10) {
        f0.p(str, "<this>");
        return Integer.parseInt(str, b.a(i10));
    }

    @sh.f
    private static final long N0(String str) {
        f0.p(str, "<this>");
        return Long.parseLong(str);
    }

    @u0(version = "1.1")
    @sh.f
    private static final long O0(String str, int i10) {
        f0.p(str, "<this>");
        return Long.parseLong(str, b.a(i10));
    }

    @sh.f
    private static final short P0(String str) {
        f0.p(str, "<this>");
        return Short.parseShort(str);
    }

    @u0(version = "1.1")
    @sh.f
    private static final short Q0(String str, int i10) {
        f0.p(str, "<this>");
        return Short.parseShort(str, b.a(i10));
    }

    @u0(version = "1.1")
    @sh.f
    private static final String R0(byte b10, int i10) {
        String string = Integer.toString(b10, b.a(b.a(i10)));
        f0.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @u0(version = "1.1")
    @sh.f
    private static final String S0(int i10, int i11) {
        String string = Integer.toString(i10, b.a(i11));
        f0.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @u0(version = "1.1")
    @sh.f
    private static final String T0(long j10, int i10) {
        String string = Long.toString(j10, b.a(i10));
        f0.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @u0(version = "1.1")
    @sh.f
    private static final String U0(short s10, int i10) {
        String string = Integer.toString(s10, b.a(b.a(i10)));
        f0.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    private static final <T> T u0(String str, yh.l<? super String, ? extends T> lVar) {
        try {
            if (l.f128589b.k(str)) {
                return lVar.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigDecimal v0(String str) {
        f0.p(str, "<this>");
        return new BigDecimal(str);
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigDecimal w0(String str, MathContext mathContext) {
        f0.p(str, "<this>");
        f0.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @u0(version = "1.2")
    @dl.e
    public static final BigDecimal x0(@dl.d String str) {
        f0.p(str, "<this>");
        try {
            if (l.f128589b.k(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @u0(version = "1.2")
    @dl.e
    public static final BigDecimal y0(@dl.d String str, @dl.d MathContext mathContext) {
        f0.p(str, "<this>");
        f0.p(mathContext, "mathContext");
        try {
            if (l.f128589b.k(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @u0(version = "1.2")
    @sh.f
    private static final BigInteger z0(String str) {
        f0.p(str, "<this>");
        return new BigInteger(str);
    }
}
