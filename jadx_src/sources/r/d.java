package r;

import android.text.TextUtils;

/* JADX INFO: compiled from: DataConverter.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f138702a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f138702a;
            cArr[i11 + 1] = cArr2[b10 & 15];
            cArr[i11] = cArr2[((byte) (b10 >>> 4)) & 15];
        }
        return new String(cArr);
    }

    public static byte[] b(String str) {
        int i10 = 0;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= length) {
                return bArr;
            }
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i11), 16));
            i10 += 2;
        }
    }
}
