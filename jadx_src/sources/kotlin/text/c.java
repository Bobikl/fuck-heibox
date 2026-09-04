package kotlin.text;

import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c extends b {
    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    public static final char D(int i10) {
        if (new fi.l(0, 9).s(i10)) {
            return (char) (i10 + 48);
        }
        throw new IllegalArgumentException("Int " + i10 + " is not a decimal digit");
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    public static final char E(int i10, int i11) {
        if (!new fi.l(2, 36).s(i11)) {
            throw new IllegalArgumentException("Invalid radix: " + i11 + ". Valid radix values are in range 2..36");
        }
        if (i10 >= 0 && i10 < i11) {
            return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i10 + " does not represent a valid digit in radix " + i11);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    public static final int F(char c10) {
        int iB = b.b(c10, 10);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    public static final int G(char c10, int i10) {
        Integer numI = I(c10, i10);
        if (numI != null) {
            return numI.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Integer H(char c10) {
        Integer numValueOf = Integer.valueOf(b.b(c10, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Integer I(char c10, int i10) {
        b.a(i10);
        Integer numValueOf = Integer.valueOf(b.b(c10, i10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean J(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean K(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J(c10, c11, z10);
    }

    public static final boolean L(char c10) {
        return new fi.c((char) 55296, (char) 57343).s(c10);
    }

    @sh.f
    private static final String M(char c10, String other) {
        f0.p(other, "other");
        return c10 + other;
    }

    @u0(version = s0.f136928s)
    @dl.d
    public static final String N(char c10) {
        return a0.a(c10);
    }
}
