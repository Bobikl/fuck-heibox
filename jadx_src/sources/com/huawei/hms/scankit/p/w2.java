package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Encoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f62476a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: compiled from: Encoder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62477a;

        static {
            int[] iArr = new int[u4.values().length];
            f62477a = iArr;
            try {
                iArr[u4.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62477a[u4.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62477a[u4.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62477a[u4.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static int a(int i10) {
        int[] iArr = f62476a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    private static int a(c0 c0Var) {
        return r4.a(c0Var) + r4.b(c0Var) + r4.c(c0Var) + r4.d(c0Var);
    }

    private static int a(r rVar, b3 b3Var, b8 b8Var, c0 c0Var) throws Exception {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            t4.a(rVar, b3Var, b8Var, i12, c0Var);
            int iA = a(c0Var);
            if (iA < i10) {
                i11 = i12;
                i10 = iA;
            }
        }
        return i11;
    }

    private static int a(u4 u4Var, r rVar, r rVar2, b8 b8Var) {
        return rVar.e() + u4Var.a(b8Var) + rVar2.e();
    }

    private static b8 a(int i10, b3 b3Var) throws Exception {
        for (int i11 = 1; i11 <= 40; i11++) {
            b8 b8VarC = b8.c(i11);
            if (a(i10, b8VarC, b3Var)) {
                return b8VarC;
            }
        }
        throw new WriterException("Data too big");
    }

    private static b8 a(b3 b3Var, u4 u4Var, r rVar, r rVar2) throws WriterException {
        return a(a(u4Var, rVar, rVar2, a(a(u4Var, rVar, rVar2, b8.c(1)), b3Var)), b3Var);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    public static h6 a(String str, b3 b3Var, Map<u2, ?> map) throws Exception {
        b8 b8VarA;
        o0 o0VarA;
        boolean z10 = map != null && map.containsKey(u2.CHARACTER_SET);
        String string = z10 ? map.get(u2.CHARACTER_SET).toString() : "ISO-8859-1";
        u4 u4VarA = a(str, string);
        r rVar = new r();
        u4 u4Var = u4.BYTE;
        if (u4VarA == u4Var && z10 && (o0VarA = o0.a(string)) != null) {
            a(o0VarA, rVar);
        }
        if ((map != null && map.containsKey(u2.GS1_FORMAT)) && Boolean.valueOf(map.get(u2.GS1_FORMAT).toString()).booleanValue()) {
            a(u4.FNC1_FIRST_POSITION, rVar);
        }
        a(u4VarA, rVar);
        r rVar2 = new r();
        a(str, u4VarA, rVar2, string);
        if (map != null) {
            u2 u2Var = u2.QR_VERSION;
            if (map.containsKey(u2Var)) {
                try {
                    b8VarA = b8.c(Integer.parseInt(map.get(u2Var).toString()));
                    if (!a(a(u4VarA, rVar, rVar2, b8VarA), b8VarA, b3Var)) {
                        throw new WriterException("Data too big for requested version");
                    }
                } catch (Exception e10) {
                    throw e10;
                }
            } else {
                b8VarA = a(b3Var, u4VarA, rVar, rVar2);
            }
        } else {
            b8VarA = a(b3Var, u4VarA, rVar, rVar2);
        }
        r rVar3 = new r();
        rVar3.a(rVar);
        a(u4VarA == u4Var ? rVar2.f() : str.length(), b8VarA, u4VarA, rVar3);
        rVar3.a(rVar2);
        b8.b bVarA = b8VarA.a(b3Var);
        int iE = b8VarA.e() - bVarA.d();
        a(iE, rVar3);
        r rVarA = a(rVar3, b8VarA.e(), iE, bVarA.c());
        h6 h6Var = new h6();
        h6Var.a(b3Var);
        h6Var.a(u4VarA);
        h6Var.a(b8VarA);
        int iD = b8VarA.d();
        c0 c0Var = new c0(iD, iD);
        int iA = a(rVarA, b3Var, b8VarA, c0Var);
        h6Var.b(iA);
        t4.a(rVarA, b3Var, b8VarA, iA, c0Var);
        h6Var.a(c0Var);
        return h6Var;
    }

    static r a(r rVar, int i10, int i11, int i12) throws Exception {
        if (rVar.f() != i11) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            a(i10, i11, i12, i14, iArr, iArr2);
            int i15 = iArr[0];
            byte[] bArr = new byte[i15];
            rVar.a(i13 * 8, bArr, 0, i15);
            byte[] bArrA = a(bArr, iArr2[0]);
            arrayList.add(new y(bArr, bArrA));
            iMax2 = Math.max(iMax2, i15);
            iMax = Math.max(iMax, bArrA.length);
            i13 += iArr[0];
        }
        if (i11 != i13) {
            throw new WriterException("Data bytes does not match offset");
        }
        r rVar2 = new r();
        for (int i16 = 0; i16 < iMax2; i16++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA2 = ((y) it.next()).a();
                if (i16 < bArrA2.length) {
                    rVar2.a(bArrA2[i16], 8);
                }
            }
        }
        for (int i17 = 0; i17 < iMax; i17++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((y) it2.next()).b();
                if (i17 < bArrB.length) {
                    rVar2.a(bArrB[i17], 8);
                }
            }
        }
        if (i10 == rVar2.f()) {
            return rVar2;
        }
        throw new WriterException("Interleaving error: " + i10 + " and " + rVar2.f() + " differ.");
    }

    private static u4 a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && a(str)) {
            return u4.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (a(cCharAt) == -1) {
                    return u4.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return u4.ALPHANUMERIC;
        }
        return z11 ? u4.NUMERIC : u4.BYTE;
    }

    static void a(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws WriterException {
        if (i13 >= i12) {
            throw new WriterException("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    static void a(int i10, b8 b8Var, u4 u4Var, r rVar) throws Exception {
        int iA = u4Var.a(b8Var);
        int i11 = 1 << iA;
        if (i10 < i11) {
            rVar.a(i10, iA);
            return;
        }
        throw new WriterException(i10 + " is bigger than " + (i11 - 1));
    }

    static void a(int i10, r rVar) throws Exception {
        int i11 = i10 * 8;
        if (rVar.e() > i11) {
            throw new WriterException("data bits cannot fit in the QR Code" + rVar.e() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && rVar.e() < i11; i12++) {
            rVar.a(false);
        }
        int iE = rVar.e() & 7;
        if (iE > 0) {
            while (iE < 8) {
                rVar.a(false);
                iE++;
            }
        }
        int iF = i10 - rVar.f();
        for (int i13 = 0; i13 < iF; i13++) {
            rVar.a((i13 & 1) == 0 ? bb.c.b.C1 : 17, 8);
        }
        if (rVar.e() != i11) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    private static void a(o0 o0Var, r rVar) throws Exception {
        rVar.a(u4.ECI.a(), 4);
        rVar.a(o0Var.a(), 8);
    }

    static void a(u4 u4Var, r rVar) throws Exception {
        rVar.a(u4Var.a(), 4);
    }

    static void a(CharSequence charSequence, r rVar) throws Exception {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iA = a(charSequence.charAt(i10));
            if (iA == -1) {
                throw new WriterException();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int iA2 = a(charSequence.charAt(i11));
                if (iA2 == -1) {
                    throw new WriterException();
                }
                rVar.a((iA * 45) + iA2, 11);
                i10 += 2;
            } else {
                rVar.a(iA, 6);
                i10 = i11;
            }
        }
    }

    static void a(String str, r rVar) throws Exception {
        int i10;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = ((bytes[i11] & 255) << 8) | (bytes[i11 + 1] & 255);
                int i13 = 33088;
                if (i12 >= 33088 && i12 <= 40956) {
                    i10 = i12 - i13;
                } else if (i12 < 57408 || i12 > 60351) {
                    i10 = -1;
                } else {
                    i13 = 49472;
                    i10 = i12 - i13;
                }
                if (i10 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                rVar.a(((i10 >> 8) * 192) + (i10 & 255), 13);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    static void a(String str, r rVar, String str2) throws Exception {
        try {
            for (byte b10 : str.getBytes(str2)) {
                rVar.a(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    static void a(String str, u4 u4Var, r rVar, String str2) throws Exception {
        int i10 = a.f62477a[u4Var.ordinal()];
        if (i10 == 1) {
            b(str, rVar);
            return;
        }
        if (i10 == 2) {
            a((CharSequence) str, rVar);
            return;
        }
        if (i10 == 3) {
            a(str, rVar, str2);
        } else {
            if (i10 == 4) {
                a(str, rVar);
                return;
            }
            throw new WriterException("Invalid mode: " + u4Var);
        }
    }

    private static boolean a(int i10, b8 b8Var, b3 b3Var) {
        return b8Var.e() - b8Var.a(b3Var).d() >= (i10 + 7) / 8;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & 255;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    static byte[] a(byte[] bArr, int i10) throws Exception {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new q6(o3.f62194l).a(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static void b(CharSequence charSequence, r rVar) throws Exception {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                rVar.a((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    rVar.a((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    rVar.a(iCharAt, 4);
                }
            }
        }
    }
}
