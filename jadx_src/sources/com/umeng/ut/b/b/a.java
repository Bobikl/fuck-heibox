package com.umeng.ut.b.b;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.ut.a.b.g;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f106441a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f106442c = 3000;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private String f76c = "";

    private a() {
    }

    public static a a() {
        return f106441a;
    }

    public static long b() {
        return f106442c;
    }

    private void d() {
        com.umeng.ut.a.c.e.c();
        if (TextUtils.isEmpty(this.f76c)) {
            return;
        }
        try {
            Context contextM53a = com.umeng.ut.a.a.a().m53a();
            if (com.umeng.ut.a.c.a.a(contextM53a)) {
                new Thread(new g(contextM53a)).start();
            }
        } catch (Throwable th2) {
            com.umeng.ut.a.c.e.m56a("", th2);
        }
    }

    synchronized String getUtdid(Context context) {
        if (!TextUtils.isEmpty(this.f76c)) {
            return this.f76c;
        }
        try {
            String value = d.a(context).getValue();
            if (TextUtils.isEmpty(value)) {
                return "ffffffffffffffffffffffff";
            }
            this.f76c = value;
            d();
            return this.f76c;
        } catch (Throwable th2) {
            com.umeng.ut.a.c.e.a("AppUtdid", th2, new Object[0]);
            return "ffffffffffffffffffffffff";
        }
    }

    public synchronized String i() {
        return this.f76c;
    }
}
