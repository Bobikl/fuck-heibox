package com.tencent.open.web;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.open.log.SLog;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    private static void a(WebSettings webSettings) {
        try {
            webSettings.setSavePassword(false);
            webSettings.setAllowFileAccess(false);
            webSettings.setAllowFileAccessFromFileURLs(false);
            webSettings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Exception e10) {
            SLog.e("WebViewUtils", "Exception", e10);
        }
    }

    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        b(webView);
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            a(settings);
            b(settings);
        }
    }

    private static void b(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
    }

    private static void b(WebView webView) {
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
    }
}
