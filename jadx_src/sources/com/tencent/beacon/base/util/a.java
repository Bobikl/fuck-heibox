package com.tencent.beacon.base.util;

/* JADX INFO: compiled from: CloseUnitTestUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f98944a;

    public static String a() {
        String str = f98944a;
        if (str != null) {
            return str;
        }
        try {
            f98944a = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
            return "";
        } catch (Throwable th2) {
            c.a(th2);
            return "";
        }
    }
}
