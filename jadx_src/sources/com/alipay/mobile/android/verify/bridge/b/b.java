package com.alipay.mobile.android.verify.bridge.b;

import android.text.TextUtils;
import android.webkit.WebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.android.verify.logger.h;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: JSCallbackPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f39343b;

    public b(WebView webView) {
        this.f39343b = webView;
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("JSCallbackPlugin").d("null or empty action", new Object[0]);
            return;
        }
        if (j4.b.f124242d.equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("JSCallbackPlugin").a("handle event: %s", aVar.f124236a);
            try {
                h hVarK = com.alipay.mobile.android.verify.logger.f.k("JSCallbackPlugin");
                JSONObject jSONObject = aVar.f124237b;
                hVarK.f(jSONObject != null ? jSONObject.toJSONString() : "");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(x9.b.f141146k, (Object) aVar.f124236a);
                jSONObject2.put("data", (Object) aVar.f124237b);
                String str = String.format("javascript:(function(){if(typeof APVJSBridge==='object'){%s}}());", String.format("APVJSBridge.callback(%s)", JSON.toJSONString(jSONObject2)));
                com.alipay.mobile.android.verify.logger.f.k("JSCallbackPlugin").a("js callback execute: %s", str);
                this.f39343b.loadUrl(str);
            } catch (Exception e10) {
                com.alipay.mobile.android.verify.logger.f.k("JSCallbackPlugin").k(e10, "handle js callback error", new Object[0]);
            }
        }
    }
}
