package com.heytap.mcssdk.utils;

/* JADX INFO: compiled from: ApkInfoUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f59952a = "file";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f59953b = "ro.crypto.type";

    private static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b() {
        return "file".equals(a(f59953b));
    }
}
