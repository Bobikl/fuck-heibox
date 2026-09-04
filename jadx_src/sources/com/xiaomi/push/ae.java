package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char[] f106810a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(i11 * 2);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i10 + i12] & 255;
            char[] cArr = f106810a;
            sb2.append(cArr[i13 >> 4]);
            sb2.append(cArr[i13 & 15]);
        }
        return sb2.toString();
    }

    public static boolean a(Context context) {
        return ad.f106809a;
    }
}
