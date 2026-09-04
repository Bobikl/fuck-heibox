package cn.fly.verify;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public class ao {
    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder("");
            int length = bArrDigest.length;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = bArrDigest[i10];
                if (i11 < 0) {
                    i11 += 256;
                }
                if (i11 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
