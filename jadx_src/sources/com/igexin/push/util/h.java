package com.igexin.push.util;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f64048a = true;

    private h() {
    }

    public static byte[] a(String str, int i10) {
        return a(str.getBytes(), i10);
    }

    public static byte[] a(byte[] bArr, int i10) {
        return a(bArr, 0, bArr.length, i10);
    }

    public static byte[] a(byte[] bArr, int i10, int i11, int i12) {
        j jVar = new j(i12, new byte[(i11 * 3) / 4]);
        if (!jVar.a(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = jVar.f64050b;
        byte[] bArr2 = jVar.f64049a;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    public static String b(byte[] bArr, int i10) {
        try {
            return new String(c(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static byte[] b(byte[] bArr, int i10, int i11, int i12) {
        k kVar = new k(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!kVar.f64060d) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (kVar.f64061e && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (kVar.f64062f ? 2 : 1);
        }
        kVar.f64049a = new byte[i13];
        kVar.a(bArr, i10, i11, true);
        if (f64048a || kVar.f64050b == i13) {
            return kVar.f64049a;
        }
        throw new AssertionError();
    }

    public static byte[] c(byte[] bArr, int i10) {
        return b(bArr, 0, bArr.length, i10);
    }
}
