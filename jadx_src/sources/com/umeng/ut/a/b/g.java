package com.umeng.ut.a.b;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f106424a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f72a;

    public g(Context context) {
        this.f72a = context;
    }

    private void a() {
        com.umeng.ut.a.c.e.c();
        if (com.umeng.ut.a.c.c.b(this.f72a) && !f106424a) {
            f106424a = true;
            if (com.umeng.ut.b.b.d.a(this.f72a).b()) {
                try {
                    m55b();
                } catch (Throwable unused) {
                }
                f106424a = false;
            }
        }
    }

    private boolean a(String str) throws Throwable {
        a aVarA = b.a("https://audid.umeng.com/v3/a/audid/req", str, true);
        if (aVarA == null) {
            return false;
        }
        return com.umeng.ut.b.b.e.a(aVarA);
    }

    private String b() {
        String strI = com.umeng.ut.b.b.a.a().i();
        if (TextUtils.isEmpty(strI)) {
            return null;
        }
        String strA = com.umeng.ut.a.a.a.a(strI);
        if (com.umeng.ut.a.c.e.m57a()) {
            com.umeng.ut.a.c.e.b("", strA);
        }
        return com.umeng.ut.a.a.b.b(strA);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private void m55b() {
        com.umeng.ut.a.c.e.c();
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            com.umeng.ut.a.c.e.m56a("postData is empty", new Object[0]);
        } else if (a(strB)) {
            com.umeng.ut.a.c.e.m56a("", "upload success");
        } else {
            com.umeng.ut.a.c.e.m56a("", "upload fail");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                Thread.sleep(com.umeng.ut.b.b.a.b());
            } catch (Exception unused) {
            }
            a();
        } catch (Throwable th2) {
            com.umeng.ut.a.c.e.a("", th2, new Object[0]);
        }
    }
}
