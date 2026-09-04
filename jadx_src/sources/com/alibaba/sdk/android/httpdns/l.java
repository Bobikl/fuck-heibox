package com.alibaba.sdk.android.httpdns;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Pattern f37967a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    static String a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArrDigest) {
            String hexString = Integer.toHexString(b10 & 255);
            while (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    static boolean b(String str) {
        if (str != null) {
            try {
                char[] charArray = str.toCharArray();
                if (charArray.length > 0 && charArray.length <= 255) {
                    for (char c10 : charArray) {
                        if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-'))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    static boolean c(String str) {
        return str != null && str.length() >= 7 && str.length() <= 15 && !str.equals("") && f37967a.matcher(str).matches();
    }
}
