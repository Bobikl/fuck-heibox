package com.huawei.hms.scankit.p;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f62220a = "0123456789abcdefghijklmnopqrstuvwxyz !-./:=?T".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f62221b = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62222a;

        static {
            int[] iArr = new int[v4.values().length];
            f62222a = iArr;
            try {
                iArr[v4.TERMINATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62222a[v4.FNC1_FIRST_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62222a[v4.FNC1_SECOND_POSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62222a[v4.STRUCTURED_APPEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62222a[v4.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62222a[v4.HANZI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62222a[v4.NUMERIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62222a[v4.ALPHANUMERIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62222a[v4.HEXADECIMAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62222a[v4.HEXABYTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f62222a[v4.BYTE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f62222a[v4.KANJI.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private static char a(int i10) throws com.huawei.hms.scankit.p.a {
        char[] cArr = f62220a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static o0 a(w wVar) throws com.huawei.hms.scankit.p.a {
        o0 o0VarA = o0.a(b(wVar));
        a(o0VarA);
        return o0VarA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[LOOP:0: B:35:0x001b->B:32:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[SYNTHETIC] */
    static w1 a(byte[] bArr, a8 a8Var, c3 c3Var, Map<l1, ?> map) throws Exception {
        int iA;
        int iA2;
        boolean z10;
        ArrayList arrayList;
        String string;
        w wVar = new w(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(1);
        int i10 = -1;
        o0 o0VarA = null;
        boolean z11 = false;
        int i11 = -1;
        while (true) {
            try {
                v4 v4VarA = wVar.a() < 4 ? v4.TERMINATOR : v4.a(wVar.a(4));
                switch (a.f62222a[v4VarA.ordinal()]) {
                    case 1:
                        int i12 = i11;
                        iA2 = i10;
                        z10 = z11;
                        iA = i12;
                        if (v4VarA == v4.TERMINATOR) {
                            String string2 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new w1(bArr, string2, arrayList, string, iA2, iA);
                        }
                        int i13 = iA;
                        z11 = z10;
                        i10 = iA2;
                        i11 = i13;
                        break;
                    case 2:
                    case 3:
                        iA = i11;
                        iA2 = i10;
                        z10 = true;
                        if (v4VarA == v4.TERMINATOR) {
                            String string3 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new w1(bArr, string3, arrayList, string, iA2, iA);
                        }
                        int i14 = iA;
                        z11 = z10;
                        i10 = iA2;
                        i11 = i14;
                        break;
                    case 4:
                        if (wVar.a() < 16) {
                            throw com.huawei.hms.scankit.p.a.a();
                        }
                        iA2 = wVar.a(8);
                        boolean z12 = z11;
                        iA = wVar.a(8);
                        z10 = z12;
                        if (v4VarA == v4.TERMINATOR) {
                            String string4 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new w1(bArr, string4, arrayList, string, iA2, iA);
                        }
                        int i15 = iA;
                        z11 = z10;
                        i10 = iA2;
                        i11 = i15;
                        break;
                        break;
                    case 5:
                        o0VarA = a(wVar);
                        int i16 = i11;
                        iA2 = i10;
                        z10 = z11;
                        iA = i16;
                        if (v4VarA == v4.TERMINATOR) {
                            String string5 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new w1(bArr, string5, arrayList, string, iA2, iA);
                        }
                        int i17 = iA;
                        z11 = z10;
                        i10 = iA2;
                        i11 = i17;
                        break;
                    case 6:
                        a(a8Var, wVar, sb2, v4VarA);
                        int i18 = i11;
                        iA2 = i10;
                        z10 = z11;
                        iA = i18;
                        if (v4VarA == v4.TERMINATOR) {
                            String string6 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new w1(bArr, string6, arrayList, string, iA2, iA);
                        }
                        int i19 = iA;
                        z11 = z10;
                        i10 = iA2;
                        i11 = i19;
                        break;
                    default:
                        a(a(a8Var, map, wVar, sb2), arrayList2, o0VarA, z11, v4VarA);
                        int i110 = i11;
                        iA2 = i10;
                        z10 = z11;
                        iA = i110;
                        if (v4VarA == v4.TERMINATOR) {
                            String string7 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new w1(bArr, string7, arrayList, string, iA2, iA);
                        }
                        int i111 = iA;
                        z11 = z10;
                        i10 = iA2;
                        i11 = i111;
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
    }

    private static z0 a(a8 a8Var, Map<l1, ?> map, w wVar, StringBuilder sb2) {
        return new z0(a8Var, map, wVar, sb2);
    }

    private static void a(a8 a8Var, w wVar, StringBuilder sb2, v4 v4Var) throws Exception {
        int iA = wVar.a(4);
        int iA2 = wVar.a(v4Var.a(a8Var));
        if (iA == 1) {
            a(wVar, sb2, iA2);
        }
    }

    private static void a(b0 b0Var, int i10, o0 o0Var, Collection<byte[]> collection, Map<l1, ?> map) throws com.huawei.hms.scankit.p.a {
        if (i10 * 8 > b0Var.f61549a.a()) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) b0Var.f61549a.a(8);
        }
        try {
            b0Var.f61550b.append(new String(bArr, o0Var == null ? c7.a(bArr, map) : o0Var.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static void a(h7 h7Var, o0 o0Var, boolean z10, v4 v4Var, int i10) throws Exception {
        switch (a.f62222a[v4Var.ordinal()]) {
            case 7:
                c(h7Var.f61895b, h7Var.f61896c, i10);
                return;
            case 8:
                a(h7Var.f61895b, h7Var.f61896c, i10, z10);
                return;
            case 9:
                c(h7Var.f61895b, h7Var.f61896c, i10, z10);
                return;
            case 10:
                b(h7Var.f61895b, h7Var.f61896c, i10, z10);
                return;
            case 11:
                a(new b0(h7Var.f61895b, h7Var.f61896c), i10, o0Var, h7Var.f61897d, h7Var.f61894a);
                return;
            case 12:
                b(h7Var.f61895b, h7Var.f61896c, i10);
                return;
            default:
                throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static void a(o0 o0Var) throws com.huawei.hms.scankit.p.a {
        if (o0Var == null) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static void a(w wVar, StringBuilder sb2, int i10) throws Exception {
        if (i10 * 13 > wVar.a()) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iA = wVar.a(13);
            int i12 = (iA % 96) | ((iA / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & 255);
            bArr[i11 + 1] = (byte) (i13 & 255);
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
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

    private static void a(z0 z0Var, List<byte[]> list, o0 o0Var, boolean z10, v4 v4Var) throws Exception {
        a(new h7(z0Var.f62604b, z0Var.f62605c, z0Var.f62606d, list), o0Var, z10, v4Var, z0Var.f62605c.a(v4Var.a(z0Var.f62603a)));
    }

    private static char b(int i10) throws com.huawei.hms.scankit.p.a {
        char[] cArr = f62221b;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static int b(w wVar) throws Exception {
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

    private static void b(w wVar, StringBuilder sb2, int i10) throws Exception {
        if (i10 * 13 > wVar.a()) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iA = wVar.a(13);
            int i12 = (iA % 192) | ((iA / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void b(w wVar, StringBuilder sb2, int i10, boolean z10) throws Exception {
        while (i10 > 1) {
            if (wVar.a() < 8) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            int iA = wVar.a(8);
            sb2.append(b(iA / 16));
            sb2.append(b(iA % 16));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (wVar.a() < 4) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            sb2.append(b(wVar.a(4)));
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

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void c(w wVar, StringBuilder sb2, int i10, boolean z10) throws Exception {
        while (i10 > 1) {
            if (wVar.a() < 8) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            int iA = wVar.a(8);
            sb2.append(b(iA / 16));
            sb2.append(b(iA % 16));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (wVar.a() < 4) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            sb2.append(b(wVar.a(4)));
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
}
