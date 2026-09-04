package com.umeng.ut.b.a.a;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    static String get(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e10) {
            com.umeng.ut.a.c.e.b("", e10, new Object[0]);
            return str2;
        }
    }
}
