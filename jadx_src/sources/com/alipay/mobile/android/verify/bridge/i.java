package com.alipay.mobile.android.verify.bridge;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: PopWebViewDialog.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f39361a;

    i(f fVar) {
        this.f39361a = fVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f39361a.f39356d.setText(webView.getTitle());
    }
}
