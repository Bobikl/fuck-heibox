package d6;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static String a(String str) {
        try {
            if (e6.a.c(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
