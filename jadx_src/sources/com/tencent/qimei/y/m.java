package com.tencent.qimei.y;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: X5Browser.java */
/* JADX INFO: loaded from: classes4.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101547a = 3000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.tencent.qimei.z.b f101548b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f101549c = new b("x5");

    public static boolean e() {
        try {
            Class.forName("com.tencent.smtt.sdk.WebView");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a() {
        this.f101548b.a(a.a(), (Object) null);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(Context context) {
        com.tencent.qimei.z.b bVar = new com.tencent.qimei.z.b(context);
        this.f101548b = bVar;
        if (bVar.e() == null) {
            return;
        }
        if (this.f101548b.f() == null) {
            this.f101549c.a("x5_sys");
        }
        this.f101548b.b("searchBoxJavaBridge_");
        this.f101548b.b("accessibility");
        this.f101548b.b("accessibilityTraversal");
        com.tencent.qimei.z.a aVarD = this.f101548b.d();
        aVarD.e(false);
        aVarD.a(false);
        aVarD.b(false);
        aVarD.c(false);
        aVarD.d(true);
        aVarD.a(-1);
        this.f101548b.a(this.f101549c, "JSInterface");
        this.f101548b.a(a.b());
        com.tencent.qimei.c.a.a().a(3000L, this);
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new l(this));
    }

    public void b(Context context) {
        new Handler(Looper.getMainLooper()).post(new k(this, context));
        this.f101549c.b();
    }

    public final void c() {
        com.tencent.qimei.z.b bVar = this.f101548b;
        if (bVar != null) {
            bVar.a();
            this.f101548b.c();
            this.f101548b.b();
            this.f101548b = null;
        }
    }

    public d d() {
        return this.f101549c.a();
    }

    @Override // java.lang.Runnable
    public void run() {
        new Handler(Looper.getMainLooper()).post(new j(this));
    }
}
