package com.huawei.hms.scankit.p;

import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f62312b = {"CTRL_PS", " ", androidx.exifinterface.media.a.W4, "B", "C", "D", androidx.exifinterface.media.a.S4, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.f23244d5, "U", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.T4, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f62313c = {"CTRL_PS", " ", ak.av, "b", ak.aF, "d", "e", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", ak.aB, "t", ak.aG, "v", RXScreenCaptureService.KEY_WIDTH, "x", "y", ak.aD, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f62314d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", lg.a.f131412e, "`", "|", Constants.WAVE_SEPARATOR, "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f62315e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", androidx.webkit.b.f28327e, "+", Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".", "/", ":", ";", "<", ContainerUtils.KEY_VALUE_DELIMITER, ">", "?", com.meituan.robust.Constants.ARRAY_TYPE, "]", "{", z5.g.f141884d, "CTRL_UL"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f62316f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", Constants.ACCEPT_TIME_SEPARATOR_SP, ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f62317a;

    /* JADX INFO: compiled from: Decoder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62318a;

        static {
            int[] iArr = new int[b.values().length];
            f62318a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62318a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62318a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62318a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62318a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: Decoder.java */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    private static byte a(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? a(zArr, i10, 8) : a(zArr, i10, length) << (8 - length));
    }

    private static int a(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }

    private static int a(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static b a(char c10) {
        if (c10 == 'B') {
            return b.BINARY;
        }
        if (c10 == 'D') {
            return b.DIGIT;
        }
        if (c10 == 'P') {
            return b.PUNCT;
        }
        if (c10 != 'L') {
            return c10 != 'M' ? b.UPPER : b.MIXED;
        }
        return b.LOWER;
    }

    private static String a(b bVar, int i10) {
        int i11 = a.f62318a[bVar.ordinal()];
        if (i11 == 1) {
            return f62312b[i10];
        }
        if (i11 == 2) {
            return f62313c[i10];
        }
        if (i11 == 3) {
            return f62314d[i10];
        }
        if (i11 == 4) {
            return f62315e[i10];
        }
        if (i11 == 5) {
            return f62316f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String a(boolean[] zArr, Map<l1, ?> map) throws com.huawei.hms.scankit.p.a {
        b bVar = b.UPPER;
        StringBuilder sbA = a(zArr, bVar, bVar);
        int length = sbA.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) sbA.charAt(i10);
        }
        try {
            return new String(bArr, c7.a(bArr, map));
        } catch (UnsupportedEncodingException unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static StringBuilder a(boolean[] zArr, b bVar, b bVar2) {
        int length = zArr.length;
        StringBuilder sb2 = new StringBuilder(20);
        int i10 = 0;
        while (i10 < length) {
            if (bVar2 != b.BINARY) {
                int i11 = bVar2 == b.DIGIT ? 4 : 5;
                if (length - i10 < i11) {
                    break;
                }
                int iA = a(zArr, i10, i11);
                i10 += i11;
                String strA = a(bVar2, iA);
                if (strA.startsWith("CTRL_")) {
                    bVar = a(strA.charAt(5));
                    if (strA.charAt(6) != 'L') {
                        b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb2.append(strA);
                }
                bVar2 = bVar;
            } else {
                if (length - i10 < 5) {
                    break;
                }
                int iA2 = a(zArr, i10, 5);
                i10 += 5;
                if (iA2 == 0) {
                    if (length - i10 < 11) {
                        break;
                    }
                    iA2 = a(zArr, i10, 11) + 31;
                    i10 += 11;
                }
                for (int i12 = 0; i12 < iA2; i12++) {
                    if (length - i10 < 8) {
                        i10 = length;
                        break;
                    }
                    sb2.append((char) a(zArr, i10, 8));
                    i10 += 8;
                }
                bVar2 = bVar;
            }
        }
        return sb2;
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = a(zArr, i10 * 8);
        }
        return bArr;
    }

    private boolean[] a(int i10, int i11, int[] iArr) throws com.huawei.hms.scankit.p.a {
        int i12 = (1 << i11) - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = iArr[i14];
            if (i15 == 0 || i15 == i12) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            if (i15 == 1 || i15 == i12 - 1) {
                i13++;
            }
        }
        boolean[] zArr = new boolean[(i10 * i11) - i13];
        int i16 = 0;
        for (int i17 = 0; i17 < i10; i17++) {
            int i18 = iArr[i17];
            if (i18 == 1 || i18 == i12 - 1) {
                Arrays.fill(zArr, i16, (i16 + i11) - 1, i18 > 1);
                i16 += i11 - 1;
            } else {
                int i19 = i11 - 1;
                while (i19 >= 0) {
                    int i20 = i16 + 1;
                    zArr[i16] = ((1 << i19) & i18) != 0;
                    i19--;
                    i16 = i20;
                }
            }
        }
        return zArr;
    }

    private boolean[] a(s sVar) {
        g gVar = this.f62317a;
        boolean z10 = gVar != null && gVar.g();
        g gVar2 = this.f62317a;
        int iF = gVar2 != null ? gVar2.f() : 0;
        int i10 = (z10 ? 11 : 14) + (iF * 4);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[a(iF, z10)];
        int i11 = 2;
        if (z10) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < iF) {
            int i19 = ((iF - i17) * 4) + (z10 ? 9 : 12);
            int i20 = i17 * 2;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 * 2;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = sVar.b(iArr[i25], iArr[i26]);
                    int i27 = i21 - i24;
                    zArr[(i19 * 2) + i18 + i23 + i24] = sVar.b(iArr[i26], iArr[i27]);
                    int i28 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = sVar.b(iArr[i27], iArr[i28]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = sVar.b(iArr[i28], iArr[i25]);
                    i24++;
                    z10 = z10;
                    i11 = 2;
                }
                i22++;
                i11 = 2;
            }
            i18 += i19 * 8;
            i17++;
            i11 = 2;
        }
        return zArr;
    }

    private boolean[] b(boolean[] zArr) throws Exception {
        o3 o3Var;
        g gVar = this.f62317a;
        if (gVar == null) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        int i10 = 8;
        if (gVar.f() <= 2) {
            i10 = 6;
            o3Var = o3.f62192j;
        } else if (this.f62317a.f() <= 8) {
            o3Var = o3.f62196n;
        } else if (this.f62317a.f() <= 22) {
            i10 = 10;
            o3Var = o3.f62191i;
        } else {
            i10 = 12;
            o3Var = o3.f62190h;
        }
        int iE = this.f62317a.e();
        int length = zArr.length / i10;
        if (length < iE) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = a(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            new p6(o3Var).a(iArr, length - iE);
            return a(iE, i10, iArr);
        } catch (com.huawei.hms.scankit.p.a e10) {
            throw com.huawei.hms.scankit.p.a.a(e10.getMessage());
        }
    }

    public w1 a(g gVar, Map<l1, ?> map) throws Exception {
        this.f62317a = gVar;
        boolean[] zArrB = b(a(gVar.a()));
        w1 w1Var = new w1(a(zArrB), a(zArrB, map), null, null);
        w1Var.a(zArrB.length);
        return w1Var;
    }
}
