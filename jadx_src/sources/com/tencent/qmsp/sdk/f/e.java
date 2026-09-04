package com.tencent.qmsp.sdk.f;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f101939a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char[] cArr = new char[bArr.length * 2];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                try {
                    byte b10 = bArr[i10];
                    int i11 = i10 * 2;
                    char[] cArr2 = f101939a;
                    cArr[i11 + 1] = cArr2[b10 & 15];
                    cArr[i11 + 0] = cArr2[((byte) (b10 >>> 4)) & 15];
                } catch (Exception e10) {
                    g.a("Qp.b2h", 1, " === bytes2HexStr error === " + e10.toString());
                }
            }
            return new String(cArr);
        }
        return null;
    }
}
