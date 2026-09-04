package com.huawei.hms.scankit.p;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f62238a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f62239b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BigInteger[] f62240c;

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62241a;

        static {
            int[] iArr = new int[b.values().length];
            f62241a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62241a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62241a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62241a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62241a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62241a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f62240c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f62240c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(bigIntegerValueOf);
            i10++;
        }
    }

    private static int a(int i10, int[] iArr, Charset charset, int i11, StringBuilder sb2) throws com.huawei.hms.scankit.p.a {
        int iA;
        int i12;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 0;
        long j10 = 0;
        boolean z10 = false;
        if (i10 == 901) {
            int[] iArr2 = new int[6];
            int i14 = i11 + 1;
            int i15 = iArr[i11];
            while (true) {
                i12 = iArr[0];
                if (i14 < i12 && !z10) {
                    int i16 = i13 + 1;
                    iArr2[i13] = i15;
                    j10 = (j10 * 900) + ((long) i15);
                    int i17 = i14 + 1;
                    i15 = iArr[i14];
                    if (i15 != 928) {
                        switch (i15) {
                            case 900:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i15) {
                                    case bb.c.b.Me /* 922 */:
                                    case bb.c.b.Ne /* 923 */:
                                    case bb.c.b.Oe /* 924 */:
                                        break;
                                    default:
                                        if (i16 % 5 != 0 || i16 <= 0) {
                                            i14 = i17;
                                            i13 = i16;
                                        } else {
                                            for (int i18 = 0; i18 < 6; i18++) {
                                                byteArrayOutputStream.write((byte) (j10 >> ((5 - i18) * 8)));
                                            }
                                            j10 = 0;
                                            i14 = i17;
                                            i13 = 0;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    i14 = i17 - 1;
                    z10 = true;
                    i13 = i16;
                }
            }
            if (i14 == i12 && i15 < 900) {
                iArr2[i13] = i15;
                i13++;
            }
            for (int i19 = 0; i19 < i13; i19++) {
                byteArrayOutputStream.write((byte) iArr2[i19]);
            }
            iA = i14;
        } else {
            iA = i10 == 924 ? a(i11, iArr, false, 0, 0L, byteArrayOutputStream) : i11;
        }
        sb2.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return iA;
    }

    private static int a(int i10, int[] iArr, boolean z10, int i11, long j10, ByteArrayOutputStream byteArrayOutputStream) throws com.huawei.hms.scankit.p.a {
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i13 < 900) {
                i11++;
                j10 = (j10 * 900) + ((long) i13);
            } else {
                if (i13 != 928) {
                    switch (i13) {
                        default:
                            switch (i13) {
                                case bb.c.b.Me /* 922 */:
                                case bb.c.b.Ne /* 923 */:
                                case bb.c.b.Oe /* 924 */:
                                    break;
                                default:
                                    throw com.huawei.hms.scankit.p.a.a();
                            }
                        case 900:
                        case 901:
                        case 902:
                            i12--;
                            z10 = true;
                            break;
                    }
                }
                i12--;
                z10 = true;
            }
            i10 = i12;
            if (i11 % 5 == 0 && i11 > 0) {
                for (int i14 = 0; i14 < 6; i14++) {
                    byteArrayOutputStream.write((byte) (j10 >> ((5 - i14) * 8)));
                }
                j10 = 0;
                i11 = 0;
            }
        }
        return i10;
    }

    private static int a(StringBuilder sb2, int i10, int[] iArr, int i11, Charset charset, s5 s5Var) throws com.huawei.hms.scankit.p.a {
        if (i10 == 913) {
            int i12 = i11 + 1;
            sb2.append((char) iArr[i11]);
            return i12;
        }
        if (i10 == 928) {
            return a(iArr, i11, s5Var);
        }
        switch (i10) {
            case 900:
                return b(iArr, i11, sb2);
            case 901:
                break;
            case 902:
                return a(iArr, i11, sb2);
            default:
                switch (i10) {
                    case bb.c.b.Me /* 922 */:
                    case bb.c.b.Ne /* 923 */:
                        throw com.huawei.hms.scankit.p.a.a();
                    case bb.c.b.Oe /* 924 */:
                        break;
                    case bb.c.b.Pe /* 925 */:
                        return i11 + 1;
                    case bb.c.b.Qe /* 926 */:
                        return i11 + 2;
                    default:
                        return b(iArr, i11 - 1, sb2);
                }
                break;
        }
        return a(i10, iArr, charset, i11, sb2);
    }

    static int a(int[] iArr, int i10, s5 s5Var) throws com.huawei.hms.scankit.p.a {
        int i11 = 0;
        if (i10 + 2 > iArr[0]) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        int[] iArr2 = new int[2];
        while (i11 < 2) {
            iArr2[i11] = iArr[i10];
            i11++;
            i10++;
        }
        try {
            s5Var.c(Integer.parseInt(a(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int iB = b(iArr, i10, sb2);
            s5Var.b(sb2.toString());
            int i12 = iArr[iB] == 923 ? iB + 1 : -1;
            a(iB, iArr, s5Var);
            if (i12 != -1) {
                int i13 = iB - i12;
                if (s5Var.a()) {
                    i13--;
                }
                s5Var.a(Arrays.copyOfRange(iArr, i12, i13 + i12));
            }
            return iB;
        } catch (Exception unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static int a(int[] iArr, int i10, StringBuilder sb2) throws com.huawei.hms.scankit.p.a {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int i12 = iArr[0];
            if (i10 < i12 && !z10) {
                int i13 = i10 + 1;
                int i14 = iArr[i10];
                if (i13 == i12) {
                    z10 = true;
                }
                if (i14 < 900) {
                    iArr2[i11] = i14;
                    i11++;
                } else {
                    if (i14 != 900 && i14 != 901 && i14 != 928) {
                        switch (i14) {
                            case bb.c.b.Me /* 922 */:
                            case bb.c.b.Ne /* 923 */:
                            case bb.c.b.Oe /* 924 */:
                                break;
                            default:
                                throw com.huawei.hms.scankit.p.a.a();
                        }
                    }
                    i13--;
                    z10 = true;
                }
                if ((i11 % 15 == 0 || i14 == 902 || z10) && i11 > 0) {
                    sb2.append(a(iArr2, i11));
                    i11 = 0;
                }
                i10 = i13;
            }
        }
        return i10;
    }

    static w1 a(int[] iArr, String str, Map<l1, ?> map) throws com.huawei.hms.scankit.p.a {
        int i10;
        int iA;
        StringBuilder sb2 = new StringBuilder(iArr.length * 2);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i11 = iArr[1];
        s5 s5Var = new s5();
        Charset charsetForName = charset;
        int i12 = 2;
        int i13 = i11;
        while (true) {
            int i14 = iArr[0];
            if (i12 > i14 || (i12 == i14 && sb2.length() > 0)) {
                break;
            }
            if (i13 == 927) {
                iA = i12 + 1;
                charsetForName = Charset.forName(o0.a(iArr[i12]).name());
            } else {
                iA = a(sb2, i13, iArr, i12, charsetForName, s5Var);
            }
            if (iA >= iArr.length) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            i12 = iA + 1;
            i13 = iArr[iA];
        }
        if (sb2.length() == 0) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        if (charsetForName != StandardCharsets.ISO_8859_1) {
            w1 w1Var = new w1(null, sb2.toString(), null, str);
            w1Var.a(s5Var);
            return w1Var;
        }
        int length = sb2.length();
        byte[] bArr = new byte[length];
        for (i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) sb2.charAt(i10);
        }
        try {
            w1 w1Var2 = new w1(null, new String(bArr, c7.a(bArr, map)), null, str);
            w1Var2.a(s5Var);
            return w1Var2;
        } catch (UnsupportedEncodingException unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static String a(int[] iArr, int i10) throws com.huawei.hms.scankit.p.a {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigIntegerAdd = bigIntegerAdd.add(f62240c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static void a(int i10, int[] iArr, s5 s5Var) throws com.huawei.hms.scankit.p.a {
        while (i10 < iArr[0]) {
            int i11 = iArr[i10];
            if (i11 == 923) {
                int i12 = i10 + 1;
                int i13 = iArr[i12];
                if (i13 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    i10 = b(iArr, i12 + 1, sb2);
                    s5Var.c(sb2.toString());
                } else if (i13 == 3) {
                    StringBuilder sb3 = new StringBuilder();
                    i10 = b(iArr, i12 + 1, sb3);
                    s5Var.d(sb3.toString());
                } else if (i13 == 4) {
                    StringBuilder sb4 = new StringBuilder();
                    i10 = b(iArr, i12 + 1, sb4);
                    s5Var.a(sb4.toString());
                } else if (i13 == 1) {
                    StringBuilder sb5 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb5);
                    s5Var.b(Integer.parseInt(sb5.toString()));
                } else if (i13 == 2) {
                    StringBuilder sb6 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb6);
                    s5Var.b(Long.parseLong(sb6.toString()));
                } else if (i13 == 6) {
                    StringBuilder sb7 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb7);
                    s5Var.a(Integer.parseInt(sb7.toString()));
                } else {
                    if (i13 != 5) {
                        throw com.huawei.hms.scankit.p.a.a();
                    }
                    StringBuilder sb8 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb8);
                    s5Var.a(Long.parseLong(sb8.toString()));
                }
            } else {
                if (i11 != 922) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                i10++;
                s5Var.a(true);
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i10, StringBuilder sb2) throws com.huawei.hms.scankit.p.a {
        b bVar = b.ALPHA;
        b bVar2 = bVar;
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr3 = {i11, iArr[i11], 0};
            b[] bVarArrA = {bVar, bVar2};
            switch (a.f62241a[bVar.ordinal()]) {
                case 1:
                    bVarArrA = a(sb2, iArr2, bVar, bVar2, iArr3);
                    break;
                case 2:
                    bVarArrA = c(sb2, iArr2, bVar, bVar2, iArr3);
                    break;
                case 3:
                    bVarArrA = d(sb2, iArr2, bVar, bVar2, iArr3);
                    break;
                case 4:
                    bVarArrA = e(sb2, iArr2, bVar, bVar2, iArr3);
                    break;
                case 5:
                    bVarArrA = b(sb2, iArr2, bVar, bVar2, iArr3);
                    break;
                case 6:
                    bVarArrA = f(sb2, iArr2, bVar, bVar2, iArr3);
                    break;
            }
            bVar = bVarArrA[0];
            bVar2 = bVarArrA[1];
            int i12 = iArr3[0];
            char c10 = (char) iArr3[2];
            if (c10 != 0) {
                sb2.append(c10);
            }
            i11 = 1 + i12;
        }
    }

    private static boolean a(int i10) {
        return i10 == 901 || i10 == 924 || i10 == 902 || i10 == 928 || i10 == 923 || i10 == 922;
    }

    private static b[] a(StringBuilder sb2, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        int i10 = iArr2[1];
        if (i10 < 26) {
            iArr2[2] = (char) (i10 + 65);
        } else if (i10 == 900) {
            bVar = b.ALPHA;
        } else if (i10 != 913) {
            switch (i10) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    bVar = b.LOWER;
                    break;
                case 28:
                    bVar = b.MIXED;
                    break;
                case 29:
                    bVar2 = bVar;
                    bVar = b.PUNCT_SHIFT;
                    break;
                default:
                    throw com.huawei.hms.scankit.p.a.a();
            }
        } else {
            sb2.append((char) iArr[iArr2[0]]);
        }
        return new b[]{bVar, bVar2};
    }

    private static int b(int[] iArr, int i10, StringBuilder sb2) throws com.huawei.hms.scankit.p.a {
        int i11 = iArr[0];
        int[] iArr2 = new int[(i11 - i10) * 2];
        int[] iArr3 = new int[(i11 - i10) * 2];
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 == 900) {
                iArr2[i12] = 900;
                i12++;
            } else if (i14 == 913) {
                iArr2[i12] = 913;
                i10 = i13 + 1;
                iArr3[i12] = iArr[i13];
                i12++;
            } else {
                if (!a(i14)) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                i10 = i13 - 1;
                z10 = true;
            }
            i10 = i13;
        }
        a(iArr2, iArr3, i12, sb2);
        return i10;
    }

    private static b[] b(StringBuilder sb2, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        b bVar3;
        int i10 = iArr2[1];
        if (i10 >= 26) {
            if (i10 == 26) {
                iArr2[2] = 32;
            } else {
                if (i10 != 900) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                bVar3 = b.ALPHA;
            }
            return new b[]{bVar3, bVar2};
        }
        iArr2[2] = (char) (i10 + 65);
        bVar3 = bVar2;
        return new b[]{bVar3, bVar2};
    }

    private static b[] c(StringBuilder sb2, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        b bVar3;
        int i10 = iArr2[1];
        if (i10 < 26) {
            iArr2[2] = (char) (i10 + 97);
        } else if (i10 == 900) {
            bVar = b.ALPHA;
        } else if (i10 != 913) {
            switch (i10) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    bVar3 = b.ALPHA_SHIFT;
                    bVar2 = bVar;
                    bVar = bVar3;
                    break;
                case 28:
                    bVar = b.MIXED;
                    break;
                case 29:
                    bVar3 = b.PUNCT_SHIFT;
                    bVar2 = bVar;
                    bVar = bVar3;
                    break;
                default:
                    throw com.huawei.hms.scankit.p.a.a();
            }
        } else {
            sb2.append((char) iArr[iArr2[0]]);
        }
        return new b[]{bVar, bVar2};
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    private static b[] d(StringBuilder sb2, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        int i10 = iArr2[1];
        if (i10 < 25) {
            iArr2[2] = f62239b[i10];
        } else if (i10 == 900) {
            bVar = b.ALPHA;
        } else if (i10 != 913) {
            switch (i10) {
                case 25:
                    bVar = b.PUNCT;
                    break;
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    bVar = b.LOWER;
                    break;
                case 28:
                    bVar = b.ALPHA;
                    break;
                case 29:
                    bVar2 = bVar;
                    bVar = b.PUNCT_SHIFT;
                    break;
                default:
                    throw com.huawei.hms.scankit.p.a.a();
            }
        } else {
            sb2.append((char) iArr[iArr2[0]]);
        }
        return new b[]{bVar, bVar2};
    }

    private static b[] e(StringBuilder sb2, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        int i10 = iArr2[1];
        if (i10 < 29) {
            iArr2[2] = f62238a[i10];
        } else if (i10 == 29 || i10 == 900) {
            bVar = b.ALPHA;
        } else {
            if (i10 != 913) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            sb2.append((char) iArr[iArr2[0]]);
        }
        return new b[]{bVar, bVar2};
    }

    private static b[] f(StringBuilder sb2, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        b bVar3;
        int i10 = iArr2[1];
        if (i10 >= 29) {
            if (i10 == 29 || i10 == 900) {
                bVar3 = b.ALPHA;
            } else {
                if (i10 != 913) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                sb2.append((char) iArr[iArr2[0]]);
            }
            return new b[]{bVar3, bVar2};
        }
        iArr2[2] = f62238a[i10];
        bVar3 = bVar2;
        return new b[]{bVar3, bVar2};
    }
}
