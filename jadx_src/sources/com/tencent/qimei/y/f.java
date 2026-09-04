package com.tencent.qimei.y;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: SysBrowser.java */
/* JADX INFO: loaded from: classes4.dex */
public class f extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f101537a;

    public f(i iVar) {
        this.f101537a = iVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        try {
            this.f101537a.a(webView);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
