package com.tencent.qimei.y;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: JsInteraction.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f101528b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f101529c = new c();

    public b(String str) {
        this.f101527a = str;
    }

    public d a() {
        return this.f101528b;
    }

    public void a(String str) {
        this.f101527a = str;
    }

    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        this.f101528b = new d(str, this.f101527a, str2, str3);
        com.tencent.qimei.n.a.c("HidBuilder", "%s,%d,%d, hid: %s, UA: %s", str, Integer.valueOf(str2.length()), Integer.valueOf(str3.length()), str2, str3);
    }

    public void b() {
        this.f101529c.b();
    }

    @JavascriptInterface
    public void callback(String str, String str2, String str3) {
        a(str, str2, str3);
        this.f101529c.a();
    }
}
