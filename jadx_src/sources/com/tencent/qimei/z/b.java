package com.tencent.qimei.z;

import android.content.Context;
import com.tencent.qimei.l.d;

/* JADX INFO: compiled from: X5WebView.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101552a = "com.tencent.smtt.sdk.ValueCallback";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f101553b;

    public b(Context context) {
        this.f101553b = d.a("com.tencent.smtt.sdk.WebView", new Class[]{Context.class}, new Object[]{context});
    }

    public void a() {
        c("clearHistory");
    }

    public void a(Object obj, String str) {
        Object obj2 = this.f101553b;
        if (obj2 == null) {
            return;
        }
        d.a("com.tencent.smtt.sdk.WebView", "addJavascriptInterface", obj2, new Class[]{Object.class, String.class}, new Object[]{obj, str});
    }

    public void a(String str) {
        a("loadUrl", str);
    }

    public void a(String str, Object obj) {
        if (this.f101553b == null) {
            return;
        }
        Class<?> cls = null;
        try {
            cls = Class.forName("com.tencent.smtt.sdk.ValueCallback");
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
        }
        if (cls == null) {
            return;
        }
        d.a("com.tencent.smtt.sdk.WebView", "evaluateJavascript", this.f101553b, new Class[]{String.class, cls}, new Object[]{str, obj});
    }

    public final void a(String str, String str2) {
        Object obj = this.f101553b;
        if (obj == null) {
            return;
        }
        d.a("com.tencent.smtt.sdk.WebView", str, obj, new Class[]{String.class}, new Object[]{str2});
    }

    public void b() {
        this.f101553b = null;
    }

    public void b(String str) {
        a("removeJavascriptInterface", str);
    }

    public void c() {
        c("destroy");
    }

    public final void c(String str) {
        Object obj = this.f101553b;
        if (obj == null) {
            return;
        }
        d.a("com.tencent.smtt.sdk.WebView", str, obj, new Class[0], new Object[0]);
    }

    public a d() {
        if (this.f101553b == null) {
            return null;
        }
        return new a(d("getSettings"));
    }

    public final Object d(String str) {
        Object obj = this.f101553b;
        if (obj == null) {
            return null;
        }
        return d.a("com.tencent.smtt.sdk.WebView", str, obj, new Class[0], new Object[0]);
    }

    public Object e() {
        return this.f101553b;
    }

    public Object f() {
        if (this.f101553b == null) {
            return null;
        }
        return d("getX5WebViewExtension");
    }
}
