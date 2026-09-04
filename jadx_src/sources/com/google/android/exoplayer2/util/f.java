package com.google.android.exoplayer2.util;

import android.util.Pair;
import com.meituan.robust.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CodecSpecificDataUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f51391a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f51392b = {"", androidx.exifinterface.media.a.W4, "B", "C"};

    private f() {
    }

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f51392b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(z10 ? 'H' : Constants.OBJECT_TYPE);
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(u0.H("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f51391a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    private static int e(byte[] bArr, int i10) {
        int length = bArr.length - f51391a.length;
        while (i10 <= length) {
            if (f(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static boolean f(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f51391a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f51391a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static Pair<Integer, Integer> g(byte[] bArr) {
        e0 e0Var = new e0(bArr);
        e0Var.S(9);
        int iG = e0Var.G();
        e0Var.S(20);
        return Pair.create(Integer.valueOf(e0Var.K()), Integer.valueOf(iG));
    }

    public static boolean h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @androidx.annotation.p0
    public static byte[][] i(byte[] bArr) {
        if (!f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        do {
            arrayList.add(Integer.valueOf(iE));
            iE = e(bArr, iE + f51391a.length);
        } while (iE != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int iIntValue2 = (i10 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i10 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i10] = bArr3;
            i10++;
        }
        return bArr2;
    }
}
