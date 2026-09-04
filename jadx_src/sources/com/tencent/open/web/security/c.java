package com.tencent.open.web.security;

import android.webkit.WebView;
import com.tencent.open.c.d;
import com.tencent.open.log.SLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class c extends com.tencent.open.b.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f101207d;

    public c(WebView webView, long j10, String str, String str2) {
        super(webView, j10, str);
        this.f101207d = str2;
    }

    private void b(String str) {
        WebView webView = this.f101030a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:");
            stringBuffer.append("if(!!");
            stringBuffer.append(this.f101207d);
            stringBuffer.append("){");
            stringBuffer.append(this.f101207d);
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")}");
            String string = stringBuffer.toString();
            SLog.v("openSDK_LOG.SecureJsListener", "-->callback, callback: " + string);
            webView.loadUrl(string);
        }
    }

    @Override // com.tencent.open.b.a
    public void a() {
        SLog.d("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // com.tencent.open.b.a
    public void a(Object obj) {
        SLog.v("openSDK_LOG.SecureJsListener", "-->onComplete, result: " + obj);
    }

    @Override // com.tencent.open.b.a
    public void a(String str) {
        SLog.v("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", !d.f101075a ? -4 : 0);
            jSONObject.put("sn", this.f101031b);
            jSONObject.put("data", str);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        b(jSONObject.toString());
    }
}
