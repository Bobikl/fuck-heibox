package com.huawei.hms.feature.dynamic.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f60719a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f60720b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr) {
        return a(bArr, false);
    }

    public static char[] a(byte[] bArr, boolean z10) {
        return a(bArr, z10 ? f60720b : f60719a);
    }

    public static char[] a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }

    public static String b(byte[] bArr, boolean z10) {
        return new String(a(bArr, z10));
    }
}
