package com.tencent.qimei.z;

import com.tencent.qimei.l.d;

/* JADX INFO: compiled from: X5WebSettings.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101550a = "com.tencent.smtt.sdk.WebSettings";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f101551b;

    public a(Object obj) {
        this.f101551b = obj;
    }

    public void a(int i10) {
        a("setCacheMode", i10);
    }

    public final void a(String str, int i10) {
        Object obj = this.f101551b;
        if (obj == null) {
            return;
        }
        d.a("com.tencent.smtt.sdk.WebSettings", str, obj, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i10)});
    }

    public final void a(String str, boolean z10) {
        Object obj = this.f101551b;
        if (obj == null) {
            return;
        }
        d.a("com.tencent.smtt.sdk.WebSettings", str, obj, new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z10)});
    }

    public void a(boolean z10) {
        a("setAllowFileAccess", z10);
    }

    public void b(boolean z10) {
        a("setAllowFileAccessFromFileURLs", z10);
    }

    public void c(boolean z10) {
        a("setAllowUniversalAccessFromFileURLs", z10);
    }

    public void d(boolean z10) {
        a("setJavaScriptEnabled", z10);
    }

    public void e(boolean z10) {
        a("setSavePassword", z10);
    }
}
