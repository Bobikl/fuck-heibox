package com.alipay.mobile.android.verify.bridge;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: PopWebViewDialog.java */
/* JADX INFO: loaded from: classes6.dex */
public class h extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f39360a;

    h(f fVar) {
        this.f39360a = fVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        this.f39360a.f39356d.setText(str);
    }
}
