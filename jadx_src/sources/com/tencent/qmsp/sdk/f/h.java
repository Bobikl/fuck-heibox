package com.tencent.qmsp.sdk.f;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte[] f101942a;

    static {
        new HashMap();
        f101942a = new byte[]{6, org.apache.tools.tar.c.Q, -74, 67, 37, 123, 99, -11, 32, org.apache.tools.tar.c.F, -93, 65, 60, 58, 122, -8, org.apache.tools.tar.c.G, 117, -95, org.apache.tools.tar.c.P, 111};
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = {69, 16, -45, 32, 78, 91, com.google.common.base.a.A, -99, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % 8]);
        }
        return new String(bArr3);
    }
}
