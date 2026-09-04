package com.alipay.mobile.android.verify.sdk.b;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: BehaviorLogPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements j4.c {
    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c) || TextUtils.isEmpty(aVar.f124236a)) {
            com.alipay.mobile.android.verify.logger.f.k("BehaviorLogPlugin").a("null or empty action", new Object[0]);
            return;
        }
        j4.a aVarA = j4.a.a(aVar);
        aVarA.f124237b = j4.a.b();
        if ("behaviorLog".equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("BehaviorLogPlugin").a("handle behavior log event", new Object[0]);
            JSONObject jSONObject = aVar.f124237b;
            if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("seed"))) {
                k4.a.a(aVar.f124237b);
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
            } else {
                aVarA.f124237b.put("success", (Object) Boolean.FALSE);
                aVarA.f124237b.put("errorMessage", (Object) "缺少必要参数");
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
            }
        }
    }
}
