package com.umeng.ut.b.a.a;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static byte[] getBytes(int i10) {
        byte[] bArr = {(byte) ((i >> 8) % 256), (byte) (i % 256), (byte) (i % 256), (byte) (i10 % 256)};
        int i11 = i10 >> 8;
        int i12 = i11 >> 8;
        return bArr;
    }
}
