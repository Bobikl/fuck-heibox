package kotlin.text;

import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class t extends s {
    @dl.d
    public static final Void V0(@dl.d String input) {
        f0.p(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @u0(version = "1.1")
    @dl.e
    public static final Byte W0(@dl.d String str) {
        f0.p(str, "<this>");
        return X0(str, 10);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Byte X0(@dl.d String str, int i10) {
        int iIntValue;
        f0.p(str, "<this>");
        Integer numZ0 = Z0(str, i10);
        if (numZ0 == null || (iIntValue = numZ0.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Integer Y0(@dl.d String str) {
        f0.p(str, "<this>");
        return Z0(str, 10);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Integer Z0(@dl.d String str, int i10) {
        boolean z10;
        int i11;
        f0.p(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (f0.t(cCharAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z10 = false;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int iB = b.b(str.charAt(i14), i10);
            if (iB < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + iB) {
                return null;
            }
            i12 = i11 - iB;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Long a1(@dl.d String str) {
        f0.p(str, "<this>");
        return b1(str, 10);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Long b1(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int iT = f0.t(cCharAt, 48);
        long j10 = com.google.android.exoplayer2.j.f46377b;
        boolean z10 = true;
        if (iT >= 0) {
            z10 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j10 = Long.MIN_VALUE;
                i11 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z10 = false;
                i11 = 1;
            }
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int iB = b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i10);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i10);
            long j15 = iB;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Short c1(@dl.d String str) {
        f0.p(str, "<this>");
        return d1(str, 10);
    }

    @u0(version = "1.1")
    @dl.e
    public static final Short d1(@dl.d String str, int i10) {
        int iIntValue;
        f0.p(str, "<this>");
        Integer numZ0 = Z0(str, i10);
        if (numZ0 == null || (iIntValue = numZ0.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
