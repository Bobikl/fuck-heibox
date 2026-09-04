package com.alipay.deviceid.module.x;

import java.security.MessageDigest;

/* JADX INFO: compiled from: DigestUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    public static String a(String str) {
        try {
            if (e.a(str)) {
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
