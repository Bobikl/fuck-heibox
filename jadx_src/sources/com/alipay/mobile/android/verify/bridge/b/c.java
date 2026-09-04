package com.alipay.mobile.android.verify.bridge.b;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.android.verify.logger.h;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: PopWebViewPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f39344b;

    public c(Activity activity) {
        this.f39344b = activity;
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("PopWebViewPlugin").d("null or empty action", new Object[0]);
            return;
        }
        if ("pushWindow".equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("PopWebViewPlugin").a("handle event: %s", aVar.f124236a);
            try {
                h hVarK = com.alipay.mobile.android.verify.logger.f.k("PopWebViewPlugin");
                JSONObject jSONObject = aVar.f124237b;
                hVarK.f(jSONObject != null ? jSONObject.toJSONString() : "");
                j4.a aVarA = j4.a.a(aVar);
                aVarA.f124237b = j4.a.b();
                JSONObject jSONObject2 = aVar.f124237b;
                String string = jSONObject2 != null ? jSONObject2.getString("url") : "";
                if (!TextUtils.isEmpty(string)) {
                    new com.alipay.mobile.android.verify.bridge.f(this.f39344b, string).show();
                    return;
                }
                aVarA.f124237b.put("success", (Object) "false");
                aVarA.f124237b.put("errorMessage", (Object) "缺少必要的参数");
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
            } catch (Exception e10) {
                com.alipay.mobile.android.verify.logger.f.k("PopWebViewPlugin").k(e10, "handle push window error", new Object[0]);
            }
        }
    }
}
