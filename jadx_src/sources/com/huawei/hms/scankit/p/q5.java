package com.huawei.hms.scankit.p;

import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.primitives.SignedBytes;
import com.huawei.hms.hmsscankit.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: compiled from: PDF417HighLevelEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f62256c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f62254a = {org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f62255b = {59, 60, 62, SignedBytes.f59068a, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, Utf8.REPLACEMENT_BYTE, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f62257d = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f62258e = StandardCharsets.ISO_8859_1;

    /* JADX INFO: compiled from: PDF417HighLevelEncoder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62259a;

        static {
            int[] iArr = new int[y0.values().length];
            f62259a = iArr;
            try {
                iArr[y0.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62259a[y0.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62259a[y0.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f62256c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f62254a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f62256c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f62257d, (byte) -1);
        while (true) {
            byte[] bArr3 = f62255b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f62257d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    private static int a(CharSequence charSequence, int i10) {
        return d4.a(charSequence, i10);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 BREAK  A[LOOP:0: B:3:0x0011->B:93:0x0011], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0011 A[SYNTHETIC] */
    private static int a(CharSequence charSequence, int i10, int i11, StringBuilder sb2, int i12) {
        StringBuilder sb3 = new StringBuilder(i11);
        int i13 = i12;
        int i14 = 0;
        while (true) {
            int i15 = i10 + i14;
            char cCharAt = charSequence.charAt(i15);
            if (i13 == 0) {
                if (b(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append(JSONLexer.EOI);
                    } else {
                        sb3.append((char) (cCharAt - 'A'));
                    }
                } else if (a(cCharAt)) {
                    sb3.append((char) 27);
                    i13 = 1;
                } else if (d(cCharAt)) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) f62257d[cCharAt]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                    break;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (e(cCharAt)) {
                            sb3.append((char) f62257d[cCharAt]);
                        } else {
                            sb3.append((char) 29);
                            i13 = 0;
                        }
                    } else if (d(cCharAt)) {
                        sb3.append((char) f62256c[cCharAt]);
                    } else if (b(cCharAt)) {
                        sb3.append((char) 28);
                        i13 = 0;
                    } else if (a(cCharAt)) {
                        sb3.append((char) 27);
                        i13 = 1;
                    } else {
                        int i16 = i15 + 1;
                        if (i16 >= i11 || !e(charSequence.charAt(i16))) {
                            sb3.append((char) 29);
                            sb3.append((char) f62257d[cCharAt]);
                        } else {
                            i13 = 3;
                            sb3.append((char) 25);
                        }
                    }
                } else if (a(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append(JSONLexer.EOI);
                    } else {
                        sb3.append((char) (cCharAt - 'a'));
                    }
                } else if (b(cCharAt)) {
                    sb3.append((char) 27);
                    sb3.append((char) (cCharAt - 'A'));
                } else if (d(cCharAt)) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) f62257d[cCharAt]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                }
            }
        }
        int length = sb3.length();
        char cCharAt2 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb3.charAt(i17));
                sb2.append(cCharAt2);
            } else {
                cCharAt2 = sb3.charAt(i17);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((cCharAt2 * 30) + 29));
        }
        return i13;
    }

    private static int a(String str, int i10, Charset charset) throws WriterException {
        int i11;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i12 = i10;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            int i13 = 0;
            while (i13 < 13 && c(cCharAt) && (i11 = i12 + (i13 = i13 + 1)) < length) {
                cCharAt = str.charAt(i11);
            }
            if (i13 >= 13) {
                return i12 - i10;
            }
            char cCharAt2 = str.charAt(i12);
            if (!charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                throw new WriterException("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
            i12++;
        }
        return i12 - i10;
    }

    static String a(String str, y0 y0Var, Charset charset) throws WriterException {
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f62258e;
        } else if (f62258e.equals(charset)) {
            o4.a("PDF417", "else");
        } else {
            o0 o0VarA = o0.a(charset.name());
            if (o0VarA != null) {
                a(o0VarA.a(), sb2);
            }
        }
        int length = str.length();
        int i10 = a.f62259a[y0Var.ordinal()];
        if (i10 == 1) {
            a(str, 0, length, sb2, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            a(bytes, 0, bytes.length, 1, sb2);
        } else if (i10 != 3) {
            int i11 = 0;
            int i12 = 0;
            int iA = 0;
            while (i11 < length) {
                int iA2 = a(str, i11);
                if (iA2 >= 13) {
                    sb2.append((char) 902);
                    a(str, i11, iA2, sb2);
                    i11 += iA2;
                    iA = 0;
                    i12 = 2;
                } else {
                    int iB = b(str, i11);
                    if (iB >= 5 || iA2 == length) {
                        if (i12 != 0) {
                            sb2.append((char) 900);
                            i12 = 0;
                            iA = 0;
                        }
                        iA = a(str, i11, iB, sb2, iA);
                        i11 += iB;
                    } else {
                        int iA3 = a(str, i11, charset);
                        if (iA3 == 0) {
                            iA3 = 1;
                        }
                        int i13 = iA3 + i11;
                        byte[] bytes2 = str.substring(i11, i13).getBytes(charset);
                        if (bytes2.length == 1 && i12 == 0) {
                            a(bytes2, 0, 1, 0, sb2);
                        } else {
                            a(bytes2, 0, bytes2.length, i12, sb2);
                            i12 = 1;
                            iA = 0;
                        }
                        i11 = i13;
                    }
                }
            }
        } else {
            sb2.append((char) 902);
            a(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    private static void a(int i10, StringBuilder sb2) throws WriterException {
        if (i10 >= 0 && i10 < 900) {
            sb2.append((char) 927);
            sb2.append((char) i10);
            return;
        }
        if (i10 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i10 / 900) - 1));
            sb2.append((char) (i10 % 900));
        } else if (i10 < 811800) {
            sb2.append((char) 925);
            sb2.append((char) (810900 - i10));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was " + i10);
        }
    }

    private static void a(String str, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int iMin = Math.min(44, i11 - i12);
            if (str.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append('1');
                int i13 = i10 + i12;
                sb4.append(str.substring(i13, i13 + iMin));
                BigInteger bigInteger = new BigInteger(sb4.toString());
                do {
                    sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                    bigInteger = bigInteger.divide(bigIntegerValueOf);
                } while (!bigInteger.equals(bigIntegerValueOf2));
            }
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += iMin;
        }
    }

    private static void a(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        if (i11 == 1 && i12 == 0) {
            sb2.append((char) 913);
        } else if (i11 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + ((long) (bArr[i13 + i14] & 255));
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    private static boolean a(char c10) {
        return c10 == ' ' || (c10 >= 'a' && c10 <= 'z');
    }

    private static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            int i12 = 0;
            while (i12 < 13 && c(cCharAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    cCharAt = charSequence.charAt(i11);
                }
            }
            if (i12 >= 13) {
                return (i11 - i10) - i12;
            }
            if (i12 <= 0) {
                if (!f(charSequence.charAt(i11))) {
                    break;
                }
                i11++;
            }
        }
        return i11 - i10;
    }

    private static boolean b(char c10) {
        return c10 == ' ' || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean c(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    private static boolean d(char c10) {
        try {
            byte[] bArr = f62256c;
            if (w7.a(bArr, (int) c10)) {
                return bArr[c10] != -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    private static boolean e(char c10) {
        try {
            if (w7.a(f62256c, (int) c10)) {
                return f62257d[c10] != -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    private static boolean f(char c10) {
        return c10 == '\t' || c10 == '\n' || c10 == '\r' || (c10 >= ' ' && c10 <= '~');
    }
}
