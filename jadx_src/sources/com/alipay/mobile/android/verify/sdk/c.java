package com.alipay.mobile.android.verify.sdk;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.squareup.otto.Subscribe;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import z5.j;

/* JADX INFO: compiled from: SDKContainer.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends com.alipay.mobile.android.verify.bridge.a implements j4.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f39401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l4.a f39402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f39403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONObject f39404m;

    public c(Activity activity, String str, l4.a aVar) {
        super(activity, str);
        this.f39401j = "SDKContainer";
        this.f39402k = aVar;
        i(activity);
    }

    private void i(Activity activity) {
        d(new com.alipay.mobile.android.verify.sdk.b.c());
        d(new com.alipay.mobile.android.verify.sdk.b.a());
        d(new com.alipay.mobile.android.verify.sdk.b.d(activity));
        d(new com.alipay.mobile.android.verify.sdk.b.b(activity));
    }

    @Override // com.alipay.mobile.android.verify.bridge.a, j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        super.handle(aVar);
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("SDKContainer").d("null or empty event", new Object[0]);
            return;
        }
        if ("saveVerifyResult".equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("SDKContainer").a("handle save z result", new Object[0]);
            this.f39403l = new HashMap();
            JSONObject jSONObject = aVar.f124237b;
            if (jSONObject != null && jSONObject.size() > 0) {
                for (String str : aVar.f124237b.keySet()) {
                    String string = aVar.f124237b.getString(str);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f39403l.put(str, URLDecoder.decode(string, "UTF-8"));
                        } catch (UnsupportedEncodingException e10) {
                            com.alipay.mobile.android.verify.logger.f.k("SDKContainer").k(e10, "value decode error", new Object[0]);
                        }
                    }
                }
            }
            dismiss();
            return;
        }
        if (!j4.b.f124244f.equalsIgnoreCase(aVar.f124238c)) {
            if ("getRequestInfo".equalsIgnoreCase(aVar.f124238c)) {
                com.alipay.mobile.android.verify.logger.f.k("SDKContainer").a("handle get request info", new Object[0]);
                j4.a aVarA = j4.a.a(aVar);
                JSONObject jSONObjectB = j4.a.b();
                aVarA.f124237b = jSONObjectB;
                jSONObjectB.put("requestInfo", (Object) this.f39404m);
                com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
                return;
            }
            return;
        }
        com.alipay.mobile.android.verify.logger.f.k("SDKContainer").a("handle back pressed", new Object[0]);
        j4.a aVar2 = new j4.a();
        aVar2.f124238c = "saveVerifyResult";
        JSONObject jSONObjectB2 = j4.a.b();
        aVar2.f124237b = jSONObjectB2;
        jSONObjectB2.put(j.f141892a, (Object) "6001");
        JSONObject jSONObject2 = aVar2.f124237b;
        JSONObject jSONObject3 = this.f39404m;
        jSONObject2.put("result.certifyId", (Object) ((jSONObject3 == null || jSONObject3.getString("certifyId") == null) ? "" : this.f39404m.getString("certifyId")));
        com.alipay.mobile.android.verify.bridge.b.a().post(aVar2);
    }

    public void j(JSONObject jSONObject) {
        this.f39404m = jSONObject;
    }

    @Override // com.alipay.mobile.android.verify.bridge.a, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39402k != null) {
            Map<String, String> map = this.f39403l;
            if (map == null || map.size() == 0) {
                com.alipay.mobile.android.verify.logger.f.k("SDKContainer").a("nothing back to invoker", new Object[0]);
                HashMap map2 = new HashMap();
                this.f39403l = map2;
                map2.put("cancel", "true");
            }
            com.alipay.mobile.android.verify.logger.f.k("SDKContainer").a("execute callback", new Object[0]);
            k4.a.c("zmCallback");
            k4.a.b(null);
            this.f39402k.a(this.f39403l);
            this.f39402k = null;
        }
    }
}
