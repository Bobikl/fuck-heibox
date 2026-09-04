package com.alipay.mobile.android.verify.sdk.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: BrowserPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f39395b;

    public b(Activity activity) {
        this.f39395b = activity;
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("BrowserPlugin").d("null or empty action", new Object[0]);
            return;
        }
        if ("openInBrowser".equalsIgnoreCase(aVar.f124238c)) {
            j4.a aVarA = j4.a.a(aVar);
            aVarA.f124237b = j4.a.b();
            JSONObject jSONObject = aVar.f124237b;
            String string = jSONObject != null ? jSONObject.getString("url") : "";
            if (TextUtils.isEmpty(string)) {
                aVarA.f124237b.put("success", (Object) "false");
                aVarA.f124237b.put("errorMessage", (Object) "缺少必要的参数");
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
                return;
            }
            if (!string.startsWith("http://") && !string.startsWith("https://")) {
                aVarA.f124237b.put("success", (Object) "false");
                aVarA.f124237b.put("errorMessage", (Object) "非法的地址");
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            try {
                intent.setData(Uri.parse(string));
                this.f39395b.startActivity(intent);
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
            } catch (Exception e10) {
                com.alipay.mobile.android.verify.logger.f.k("BrowserPlugin").k(e10, "handle browser event error", new Object[0]);
                aVarA.f124237b.put("success", (Object) "false");
                aVarA.f124237b.put("errorMessage", (Object) "执行异常");
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
            }
        }
    }
}
