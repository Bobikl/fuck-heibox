package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class q {
    public static String a(String str, String str2) {
        try {
            return (String) C1339r.a(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("SystemProperties.get: " + e10);
            return str2;
        }
    }
}
