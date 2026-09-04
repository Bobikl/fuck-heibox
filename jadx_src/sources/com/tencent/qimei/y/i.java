package com.tencent.qimei.y;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.o0;

/* JADX INFO: compiled from: SysBrowser.java */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f101541a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f101542b = new b(o0.P0);

    public void a() {
        new Handler(Looper.getMainLooper()).post(new h(this));
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public final void a(Context context) {
        if (this.f101541a != null) {
            b();
        }
        WebView webView = new WebView(context);
        this.f101541a = webView;
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        this.f101541a.removeJavascriptInterface("accessibility");
        this.f101541a.removeJavascriptInterface("accessibilityTraversal");
        WebSettings settings = this.f101541a.getSettings();
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        this.f101541a.addJavascriptInterface(this.f101542b, "JSInterface");
        this.f101541a.setWebViewClient(new f(this));
        this.f101541a.loadUrl(a.b());
    }

    public final void a(WebView webView) {
        webView.evaluateJavascript(a.a(), new e(this));
    }

    public final void b() {
        WebView webView = this.f101541a;
        if (webView != null) {
            webView.removeAllViews();
            this.f101541a.setTag(null);
            this.f101541a.clearHistory();
            this.f101541a.destroy();
            this.f101541a = null;
        }
    }

    public void b(Context context) {
        new Handler(Looper.getMainLooper()).post(new g(this, context));
        this.f101542b.b();
    }

    public d c() {
        return this.f101542b.a();
    }
}
