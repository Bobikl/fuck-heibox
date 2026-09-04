package com.alipay.mobile.android.verify.bridge;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.fastjson.JSONObject;

/* JADX INFO: compiled from: BridgeWebViewClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends WebViewClient {
    e() {
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        j4.a aVar = new j4.a();
        aVar.f124238c = j4.b.f124239a;
        b.a().post(aVar);
        j4.a aVar2 = new j4.a();
        aVar2.f124238c = j4.b.f124241c;
        JSONObject jSONObject = new JSONObject();
        aVar2.f124237b = jSONObject;
        jSONObject.put("title", (Object) webView.getTitle());
        b.a().post(aVar2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) webView.getUrl());
        j4.a aVar = new j4.a();
        aVar.f124238c = j4.b.f124240b;
        aVar.f124237b = jSONObject;
        b.a().post(aVar);
    }
}
