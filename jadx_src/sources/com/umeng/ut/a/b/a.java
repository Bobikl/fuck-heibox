package com.umeng.ut.a.b;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106416a = -1;
    public long timestamp = 0;
    public String signature = "";
    public byte[] data = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f106417b = 0;

    public static boolean a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                com.umeng.ut.a.c.e.b("", "result", str, "signature", str2);
                if (str2.equals(com.umeng.ut.b.a.a.a.a(com.umeng.ut.a.c.b.c(str).getBytes(), 2))) {
                    com.umeng.ut.a.c.e.m56a("", "signature is ok");
                    return true;
                }
                com.umeng.ut.a.c.e.m56a("", "signature is error");
            }
        } catch (Exception e10) {
            com.umeng.ut.a.c.e.m56a("", e10);
        }
        return false;
    }
}
