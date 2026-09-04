package kotlin.text;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.KotlinNothingValueException;
import kotlin.d2;
import kotlin.e2;
import kotlin.f1;
import kotlin.i1;
import kotlin.j1;
import kotlin.jvm.internal.f0;
import kotlin.n1;
import kotlin.r1;
import kotlin.u0;
import kotlin.x1;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "UStringsKt")
public final class z {
    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final String a(long j10, int i10) {
        return d2.l(j10, b.a(i10));
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final String b(byte b10, int i10) {
        String string = Integer.toString(b10 & 255, b.a(i10));
        f0.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final String c(int i10, int i11) {
        String string = Long.toString(((long) i10) & KeyboardMap.kValueMask, b.a(i11));
        f0.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final String d(short s10, int i10) {
        String string = Integer.toString(s10 & x1.f128661e, b.a(i10));
        f0.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final byte e(@dl.d String str) {
        f0.p(str, "<this>");
        j1 j1VarG = g(str);
        if (j1VarG != null) {
            return j1VarG.o0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final byte f(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        j1 j1VarH = h(str, i10);
        if (j1VarH != null) {
            return j1VarH.o0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final j1 g(@dl.d String str) {
        f0.p(str, "<this>");
        return h(str, 10);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final j1 h(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        n1 n1VarL = l(str, i10);
        if (n1VarL == null) {
            return null;
        }
        int iQ0 = n1VarL.q0();
        if (Integer.compare(iQ0 ^ Integer.MIN_VALUE, n1.h(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return j1.b(j1.h((byte) iQ0));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final int i(@dl.d String str) {
        f0.p(str, "<this>");
        n1 n1VarK = k(str);
        if (n1VarK != null) {
            return n1VarK.q0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final int j(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        n1 n1VarL = l(str, i10);
        if (n1VarL != null) {
            return n1VarL.q0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final n1 k(@dl.d String str) {
        f0.p(str, "<this>");
        return l(str, 10);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final n1 l(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = 1;
        if (f0.t(cCharAt, 48) >= 0) {
            i12 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iH = n1.h(i10);
        int iA = 119304647;
        while (i12 < length) {
            int iB = b.b(str.charAt(i12), i10);
            if (iB < 0) {
                return null;
            }
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = f1.a(-1, iH);
                    if (Integer.compare(i11 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iH2 = n1.h(i11 * iH);
            int iH3 = n1.h(n1.h(iB) + iH2);
            if (Integer.compare(iH3 ^ Integer.MIN_VALUE, iH2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            i11 = iH3;
        }
        return n1.b(i11);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final long m(@dl.d String str) {
        f0.p(str, "<this>");
        r1 r1VarO = o(str);
        if (r1VarO != null) {
            return r1VarO.q0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final long n(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        r1 r1VarP = p(str, i10);
        if (r1VarP != null) {
            return r1VarP.q0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final r1 o(@dl.d String str) {
        f0.p(str, "<this>");
        return p(str, 10);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final r1 p(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j10 = -1;
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (f0.t(cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long jH = r1.h(i10);
        long j11 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iB = b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = i1.a(j10, jH);
                    if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jH2 = r1.h(j11 * jH);
            long jH3 = r1.h(r1.h(((long) n1.h(iB)) & KeyboardMap.kValueMask) + jH2);
            if (Long.compare(jH3 ^ Long.MIN_VALUE, jH2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j11 = jH3;
            j10 = -1;
        }
        return r1.b(j11);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final short q(@dl.d String str) {
        f0.p(str, "<this>");
        x1 x1VarS = s(str);
        if (x1VarS != null) {
            return x1VarS.o0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final short r(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        x1 x1VarT = t(str, i10);
        if (x1VarT != null) {
            return x1VarT.o0();
        }
        t.V0(str);
        throw new KotlinNothingValueException();
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final x1 s(@dl.d String str) {
        f0.p(str, "<this>");
        return t(str, 10);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.s.class})
    public static final x1 t(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        n1 n1VarL = l(str, i10);
        if (n1VarL == null) {
            return null;
        }
        int iQ0 = n1VarL.q0();
        if (Integer.compare(iQ0 ^ Integer.MIN_VALUE, n1.h(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return x1.b(x1.h((short) iQ0));
    }
}
