package com.huawei.hms.scankit.p;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f62273a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62274a;

        static {
            int[] iArr = new int[u4.values().length];
            f62274a = iArr;
            try {
                iArr[u4.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62274a[u4.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62274a[u4.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62274a[u4.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62274a[u4.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62274a[u4.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62274a[u4.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62274a[u4.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62274a[u4.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62274a[u4.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static char a(int i10) throws com.huawei.hms.scankit.p.a {
        char[] cArr = f62273a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static int a(w wVar) throws Exception {
        int iA = wVar.a(8);
        if ((iA & 128) == 0) {
            return iA & 127;
        }
        if ((iA & 192) == 128) {
            return wVar.a(8) | ((iA & 63) << 8);
        }
        if ((iA & 224) == 192) {
            return wVar.a(16) | ((iA & 31) << 16);
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    static w1 a(byte[] bArr, b8 b8Var, b3 b3Var, Map<l1, ?> map) throws Exception {
        int i10;
        int i11;
        w wVar = new w(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            try {
                u4 u4VarA = wVar.a() < 4 ? u4.TERMINATOR : u4.a(wVar.a(4));
                int[] iArr = {i14, i12, i13};
                a(u4VarA, wVar, sb2, b8Var, iArr, null, arrayList, map);
                i14 = iArr[0] == 1 ? 1 : 0;
                i10 = iArr[1];
                i11 = iArr[2];
                if (u4VarA == u4.TERMINATOR) {
                    break;
                }
                i12 = i10;
                i13 = i11;
            } catch (IllegalArgumentException unused) {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        return new w1(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, b3Var == null ? null : b3Var.toString(), i10, i11);
    }

    private static void a(u4 u4Var, w wVar, StringBuilder sb2, b8 b8Var, int[] iArr, o0 o0Var, List<byte[]> list, Map<l1, ?> map) throws Exception {
        int[] iArr2 = a.f62274a;
        switch (iArr2[u4Var.ordinal()]) {
            case 5:
                return;
            case 6:
            case 7:
                iArr[0] = 1;
                return;
            case 8:
                if (wVar.a() < 16) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                iArr[1] = wVar.a(8);
                iArr[2] = wVar.a(8);
                return;
            case 9:
                if (o0.a(a(wVar)) == null) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                return;
            case 10:
                int iA = wVar.a(4);
                int iA2 = wVar.a(u4Var.a(b8Var));
                if (iA == 1) {
                    a(wVar, sb2, iA2);
                    return;
                }
                return;
            default:
                int iA3 = wVar.a(u4Var.a(b8Var));
                int i10 = iArr2[u4Var.ordinal()];
                if (i10 == 1) {
                    c(wVar, sb2, iA3);
                    return;
                }
                if (i10 == 2) {
                    a(wVar, sb2, iA3, iArr[0] == 1);
                    return;
                } else if (i10 == 3) {
                    a(wVar, sb2, iA3, o0Var, list, map);
                    return;
                } else {
                    if (i10 != 4) {
                        throw com.huawei.hms.scankit.p.a.a();
                    }
                    b(wVar, sb2, iA3);
                    return;
                }
        }
    }

    private static void a(w wVar, StringBuilder sb2, int i10) throws Exception {
        if (i10 * 13 > wVar.a()) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (true) {
            if (i10 <= 0) {
                try {
                    sb2.append(new String(bArr, "GB2312"));
                    return;
                } catch (UnsupportedEncodingException unused) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
            }
            int iA = wVar.a(13);
            int i12 = (iA % 96) | ((iA / 96) << 8);
            int i13 = i12 + (i12 < 959 ? 41377 : 42657);
            try {
                if (!w7.a(bArr, i11)) {
                    break;
                }
                int i14 = i11 + 1;
                if (!w7.a(bArr, i14)) {
                    break;
                }
                bArr[i11] = (byte) ((i13 >> 8) & 255);
                bArr[i14] = (byte) (i13 & 255);
                i11 += 2;
                i10--;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private static void a(w wVar, StringBuilder sb2, int i10, o0 o0Var, Collection<byte[]> collection, Map<l1, ?> map) throws com.huawei.hms.scankit.p.a {
        if (i10 * 8 > wVar.a()) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) wVar.a(8);
        }
        try {
            sb2.append(new String(bArr, o0Var == null ? c7.a(bArr, map) : o0Var.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void a(w wVar, StringBuilder sb2, int i10, boolean z10) throws Exception {
        while (i10 > 1) {
            if (wVar.a() < 11) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            int iA = wVar.a(11);
            sb2.append(a(iA / 45));
            sb2.append(a(iA % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (wVar.a() < 6) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            sb2.append(a(wVar.a(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    private static void b(w wVar, StringBuilder sb2, int i10) throws Exception {
        if (i10 * 13 > wVar.a()) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (true) {
            if (i10 <= 0) {
                try {
                    sb2.append(new String(bArr, "SJIS"));
                    return;
                } catch (UnsupportedEncodingException unused) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
            }
            int iA = wVar.a(13);
            int i12 = (iA % 192) | ((iA / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            try {
                if (!w7.a(bArr, i11)) {
                    break;
                }
                int i14 = i11 + 1;
                if (!w7.a(bArr, i14)) {
                    break;
                }
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i14] = (byte) i13;
                i11 += 2;
                i10--;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private static void c(w wVar, StringBuilder sb2, int i10) throws Exception {
        while (i10 >= 3) {
            if (wVar.a() < 10) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            int iA = wVar.a(10);
            if (iA >= 1000) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            sb2.append(a(iA / 100));
            sb2.append(a((iA / 10) % 10));
            sb2.append(a(iA % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (wVar.a() < 7) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            int iA2 = wVar.a(7);
            if (iA2 >= 100) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            sb2.append(a(iA2 / 10));
            sb2.append(a(iA2 % 10));
            return;
        }
        if (i10 == 1) {
            if (wVar.a() < 4) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            int iA3 = wVar.a(4);
            if (iA3 >= 10) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            sb2.append(a(iA3));
        }
    }
}
