package com.huawei.hms.scankit.p;

import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f62172a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f62173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f62174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f62175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f62176e;

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62177a;

        static {
            int[] iArr = new int[b.values().length];
            f62177a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62177a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62177a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62177a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62177a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        UPPER_ENCODE
    }

    static {
        char[] cArr = {'!', kotlin.text.y.f128593b, '#', kotlin.text.y.f128594c, '%', kotlin.text.y.f128595d, '\'', '(', ')', '*', '+', ',', '-', lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX, ':', ';', kotlin.text.y.f128596e, n5.a.f132013h, kotlin.text.y.f128597f, '?', '@', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '^', '_'};
        f62173b = cArr;
        f62174c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f62175d = cArr;
        f62176e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', com.google.common.base.a.N};
    }

    private static int a(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }

    private static b a(int i10, StringBuilder sb2, StringBuilder sb3, w wVar) throws com.huawei.hms.scankit.p.a {
        switch (i10) {
            case bb.c.b.f31007w1 /* 230 */:
                return b.C40_ENCODE;
            case bb.c.b.f31029x1 /* 231 */:
                return b.BASE256_ENCODE;
            case bb.c.b.f31051y1 /* 232 */:
                sb2.append((char) 29);
                return null;
            case bb.c.b.f31073z1 /* 233 */:
            case bb.c.b.A1 /* 234 */:
            case bb.c.b.H1 /* 241 */:
                return null;
            case bb.c.b.B1 /* 235 */:
                return b.UPPER_ENCODE;
            case bb.c.b.C1 /* 236 */:
                sb2.append("[)>\u001e05\u001d");
                sb3.insert(0, "\u001e\u0004");
                return null;
            case bb.c.b.D1 /* 237 */:
                sb2.append("[)>\u001e06\u001d");
                sb3.insert(0, "\u001e\u0004");
                return null;
            case bb.c.b.E1 /* 238 */:
                return b.ANSIX12_ENCODE;
            case bb.c.b.F1 /* 239 */:
                return b.TEXT_ENCODE;
            case 240:
                return b.EDIFACT_ENCODE;
            default:
                if (i10 == 254 && wVar.a() == 0) {
                    return null;
                }
                throw com.huawei.hms.scankit.p.a.a("AIScanException");
        }
    }

    private static b a(w wVar, StringBuilder sb2, StringBuilder sb3) throws Exception {
        boolean z10 = false;
        do {
            int iA = wVar.a(8);
            if (iA == 0) {
                throw com.huawei.hms.scankit.p.a.a("AIScanException");
            }
            if (iA <= 128) {
                if (z10) {
                    iA += 128;
                }
                sb2.append((char) (iA - 1));
                return b.ASCII_ENCODE;
            }
            if (iA == 129) {
                return b.PAD_ENCODE;
            }
            if (iA <= 229) {
                int i10 = iA - 130;
                if (i10 < 10) {
                    sb2.append('0');
                }
                sb2.append(i10);
            } else {
                b bVarA = a(iA, sb2, sb3, wVar);
                if (bVarA != null) {
                    if (bVarA != b.UPPER_ENCODE) {
                        return bVarA;
                    }
                    z10 = true;
                }
            }
        } while (wVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    static w1 a(byte[] bArr, Map<l1, ?> map) throws Exception {
        w wVar = new w(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVarA = b.ASCII_ENCODE;
        do {
            b bVar = b.ASCII_ENCODE;
            if (bVarA == bVar) {
                bVarA = a(wVar, sb2, sb3);
            } else {
                int i10 = a.f62177a[bVarA.ordinal()];
                if (i10 == 1) {
                    b(wVar, sb2);
                } else if (i10 == 2) {
                    d(wVar, sb2);
                } else if (i10 == 3) {
                    a(wVar, sb2);
                } else if (i10 == 4) {
                    c(wVar, sb2);
                } else {
                    if (i10 != 5) {
                        throw com.huawei.hms.scankit.p.a.a("AIScanException");
                    }
                    a(wVar, sb2, arrayList);
                }
                bVarA = bVar;
            }
            if (bVarA == b.PAD_ENCODE) {
                break;
            }
        } while (wVar.a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        int length = sb2.length();
        byte[] bArr2 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr2[i11] = (byte) sb2.charAt(i11);
        }
        try {
            String str = new String(bArr2, c7.a(bArr2, map));
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new w1(bArr, str, arrayList, null);
        } catch (UnsupportedEncodingException unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static void a(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    private static void a(w wVar, StringBuilder sb2) throws com.huawei.hms.scankit.p.a {
        int iA;
        int[] iArr = new int[3];
        while (wVar.a() != 8 && (iA = wVar.a(8)) != 254) {
            a(iA, wVar.a(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    sb2.append('\r');
                } else if (i11 == 1) {
                    sb2.append('*');
                } else if (i11 == 2) {
                    sb2.append(kotlin.text.y.f128597f);
                } else if (i11 == 3) {
                    sb2.append(' ');
                } else if (i11 < 14) {
                    sb2.append((char) (i11 + 44));
                } else {
                    if (i11 >= 40) {
                        throw com.huawei.hms.scankit.p.a.a("AIScanException");
                    }
                    sb2.append((char) (i11 + 51));
                }
            }
            if (wVar.a() <= 0) {
                return;
            }
        }
    }

    private static void a(w wVar, StringBuilder sb2, Collection<byte[]> collection) throws com.huawei.hms.scankit.p.a {
        int iC = wVar.c() + 1;
        int i10 = iC + 1;
        int iA = a(wVar.a(8), iC);
        if (iA == 0) {
            iA = wVar.a() / 8;
        } else if (iA >= 250) {
            iA = ((iA - 249) * 250) + a(wVar.a(8), i10);
            i10++;
        }
        if (iA < 0) {
            throw com.huawei.hms.scankit.p.a.a("AIScanException");
        }
        byte[] bArr = new byte[iA];
        int i11 = 0;
        while (i11 < iA) {
            if (wVar.a() < 8) {
                throw com.huawei.hms.scankit.p.a.a("AIScanException");
            }
            bArr[i11] = (byte) a(wVar.a(8), i10);
            i11++;
            i10++;
        }
        collection.add(bArr);
        try {
            sb2.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException("Platform does not support required encoding: " + e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    private static int[] a(StringBuilder sb2, int i10, int i11, boolean z10) throws com.huawei.hms.scankit.p.a {
        ?? r10;
        boolean z11;
        if (i10 != 0) {
            if (i10 == 1) {
                if (z10) {
                    i11 = (char) (i11 + 128);
                }
                sb2.append(i11);
            } else if (i10 == 2) {
                char[] cArr = f62175d;
                if (i11 < cArr.length) {
                    char c10 = cArr[i11];
                    if (z10) {
                        c10 = (char) (c10 + 128);
                    }
                    sb2.append(c10);
                    z11 = false;
                } else if (i11 == 27) {
                    sb2.append((char) 29);
                    z11 = z10;
                } else {
                    if (i11 != 30) {
                        throw com.huawei.hms.scankit.p.a.a("AIScanException");
                    }
                    z11 = true;
                }
                i10 = 0;
                r10 = z11;
            } else {
                if (i10 != 3) {
                    throw com.huawei.hms.scankit.p.a.a("AIScanException");
                }
                char[] cArr2 = f62176e;
                if (i11 >= cArr2.length) {
                    throw com.huawei.hms.scankit.p.a.a("AIScanException");
                }
                char c11 = cArr2[i11];
                if (z10) {
                    c11 = (char) (c11 + 128);
                }
                sb2.append(c11);
            }
            i10 = 0;
            r10 = 0;
        } else if (i11 < 3) {
            i10 = i11 + 1;
            r10 = z10;
        } else {
            char[] cArr3 = f62174c;
            if (i11 >= cArr3.length) {
                throw com.huawei.hms.scankit.p.a.a("AIScanException");
            }
            char c12 = cArr3[i11];
            if (z10) {
                c12 = (char) (c12 + 128);
            }
            sb2.append(c12);
            r10 = 0;
        }
        return new int[]{i10, r10};
    }

    private static void b(w wVar, StringBuilder sb2) throws com.huawei.hms.scankit.p.a {
        int iA;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (wVar.a() != 8 && (iA = wVar.a(8)) != 254) {
            a(iA, wVar.a(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int[] iArrB = b(sb2, i10, iArr[i11], z10);
                i10 = iArrB[0];
                z10 = iArrB[1] == 1;
            }
            if (wVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    private static int[] b(StringBuilder sb2, int i10, int i11, boolean z10) throws com.huawei.hms.scankit.p.a {
        ?? r10;
        boolean z11;
        if (i10 != 0) {
            if (i10 == 1) {
                if (z10) {
                    i11 += 128;
                }
                sb2.append((char) i11);
            } else if (i10 == 2) {
                char[] cArr = f62173b;
                if (i11 < cArr.length) {
                    char c10 = cArr[i11];
                    if (z10) {
                        c10 = (char) (c10 + 128);
                    }
                    sb2.append(c10);
                    z11 = false;
                } else if (i11 == 27) {
                    sb2.append((char) 29);
                    z11 = z10;
                } else {
                    if (i11 != 30) {
                        throw com.huawei.hms.scankit.p.a.a("AIScanException");
                    }
                    z11 = true;
                }
                i10 = 0;
                r10 = z11;
            } else {
                if (i10 != 3) {
                    throw com.huawei.hms.scankit.p.a.a("AIScanException");
                }
                sb2.append((char) (z10 ? i11 + 224 : i11 + 96));
            }
            i10 = 0;
            r10 = 0;
        } else if (i11 < 3) {
            i10 = i11 + 1;
            r10 = z10;
        } else {
            char[] cArr2 = f62172a;
            if (i11 >= cArr2.length) {
                throw com.huawei.hms.scankit.p.a.a("AIScanException");
            }
            char c11 = cArr2[i11];
            if (z10) {
                c11 = (char) (c11 + 128);
            }
            sb2.append(c11);
            r10 = 0;
        }
        return new int[]{i10, r10};
    }

    private static void c(w wVar, StringBuilder sb2) throws Exception {
        while (wVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int iA = wVar.a(6);
                if (iA == 31) {
                    int iB = 8 - wVar.b();
                    if (iB != 8) {
                        wVar.a(iB);
                        return;
                    }
                    return;
                }
                if ((iA & 32) == 0) {
                    iA |= 64;
                }
                sb2.append((char) iA);
            }
            if (wVar.a() <= 0) {
                return;
            }
        }
    }

    private static void d(w wVar, StringBuilder sb2) throws com.huawei.hms.scankit.p.a {
        int iA;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (wVar.a() != 8 && (iA = wVar.a(8)) != 254) {
            a(iA, wVar.a(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int[] iArrA = a(sb2, i10, iArr[i11], z10);
                i10 = iArrA[0];
                z10 = iArrA[1] == 1;
            }
            if (wVar.a() <= 0) {
                return;
            }
        }
    }
}
