package com.alipay.mobile.android.verify.bridge;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;

/* JADX INFO: compiled from: BridgeChromeClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends WebChromeClient {
    c() {
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        JSONObject jSONObjectA;
        if (consoleMessage == null) {
            return false;
        }
        String strMessage = consoleMessage.message();
        if (TextUtils.isEmpty(strMessage)) {
            return false;
        }
        String strReplaceFirst = strMessage.startsWith("bridge.log.message: ") ? strMessage.replaceFirst("bridge.log.message: ", "") : null;
        if (TextUtils.isEmpty(strReplaceFirst) || (jSONObjectA = j.a(strReplaceFirst)) == null || jSONObjectA.isEmpty()) {
            return false;
        }
        String string = jSONObjectA.getString(x9.b.f141146k);
        String string2 = jSONObjectA.getString("action");
        JSONObject jSONObject = jSONObjectA.getJSONObject("data");
        com.alipay.mobile.android.verify.logger.f.k("BridgeChromeClient").a("received bridge event %s action %s", string, string2);
        com.alipay.mobile.android.verify.logger.f.k("BridgeChromeClient").f(jSONObject != null ? jSONObject.toJSONString() : "");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        j4.a aVar = new j4.a();
        aVar.f124236a = string;
        aVar.f124238c = string2;
        aVar.f124237b = jSONObject;
        b.a().post(aVar);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        b.a().post(jsResult);
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        b.a().post(jsResult);
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        b.a().post(jsPromptResult);
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) webView.getUrl());
        jSONObject.put("title", (Object) str);
        j4.a aVar = new j4.a();
        aVar.f124238c = j4.b.f124241c;
        aVar.f124237b = jSONObject;
        b.a().post(aVar);
    }
}
