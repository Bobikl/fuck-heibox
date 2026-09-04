package com.alipay.mobile.android.verify.bridge.b;

import android.text.TextUtils;
import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: InvokePlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f39342b;

    public a(WebView webView) {
        this.f39342b = webView;
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("InvokePlugin").d("null or empty action", new Object[0]);
            return;
        }
        if (j4.b.f124243e.equalsIgnoreCase(aVar.f124238c)) {
            try {
                JSONObject jSONObject = aVar.f124237b;
                String str = String.format("javascript:(function(){if(typeof APVJSBridge==='object'){%s}}());", String.format("APVJSBridge.invoke('%s')", jSONObject != null ? jSONObject.getString("jsAction") : ""));
                com.alipay.mobile.android.verify.logger.f.k("InvokePlugin").a("invoke %s", str);
                this.f39342b.loadUrl(str);
            } catch (Exception unused) {
                com.alipay.mobile.android.verify.logger.f.k("InvokePlugin").c("invoke got error", new Object[0]);
            }
        }
    }
}
