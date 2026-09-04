package com.alipay.mobile.android.verify.sdk.b;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.face.api.ZIMFacade;
import com.alipay.face.api.ZIMFacadeBuilder;
import com.squareup.otto.Subscribe;
import java.util.HashMap;

/* JADX INFO: compiled from: ZolozPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f39396b;

    public d(Activity activity) {
        this.f39396b = activity;
        ZIMFacade.install(activity);
    }

    private HashMap<String, String> a(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                map.put(str, jSONObject.getString(str));
            }
        }
        return map;
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c) || TextUtils.isEmpty(aVar.f124236a)) {
            com.alipay.mobile.android.verify.logger.f.k("ZolozPlugin").a("null or empty action", new Object[0]);
            return;
        }
        if (!"startZVerify".equalsIgnoreCase(aVar.f124238c)) {
            if ("getMetaInfo".equalsIgnoreCase(aVar.f124238c)) {
                j4.a aVarA = j4.a.a(aVar);
                aVarA.f124237b = j4.a.b();
                String metaInfos = ZIMFacade.getMetaInfos(this.f39396b);
                if (TextUtils.isEmpty(metaInfos)) {
                    aVarA.f124237b.put("success", (Object) Boolean.FALSE);
                    com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
                    return;
                }
                try {
                    aVarA.f124237b.put("metaInfo", (Object) JSON.parseObject(metaInfos));
                    com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
                    return;
                } catch (Exception e10) {
                    com.alipay.mobile.android.verify.logger.f.k("ZolozPlugin").k(e10, "parse object error", new Object[0]);
                    aVarA.f124237b.put("success", (Object) Boolean.FALSE);
                    com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
                    return;
                }
            }
            return;
        }
        j4.a aVarA2 = j4.a.a(aVar);
        aVarA2.f124237b = j4.a.b();
        JSONObject jSONObject = aVar.f124237b;
        String string = jSONObject != null ? jSONObject.getString("ZIMId") : "";
        k4.a.b(string);
        com.alipay.mobile.android.verify.logger.f.k("ZolozPlugin").a("handle start z verify event", new Object[0]);
        JSONObject jSONObject2 = aVar.f124237b;
        HashMap<String, String> mapA = a(jSONObject2 != null ? jSONObject2.getJSONObject("params") : null);
        if (TextUtils.isEmpty(string)) {
            aVarA2.f124237b.put("success", (Object) Boolean.FALSE);
            aVarA2.f124237b.put("errorMessage", (Object) "缺少必要参数");
            com.alipay.mobile.android.verify.bridge.b.a().post(aVarA2);
            return;
        }
        try {
            ZIMFacade zIMFacadeCreate = ZIMFacadeBuilder.create(this.f39396b);
            k4.a.c("startZolozSDK");
            zIMFacadeCreate.verify(string, false, mapA, new e(this, aVarA2));
        } catch (Exception e11) {
            com.alipay.mobile.android.verify.logger.f.k("ZolozPlugin").k(e11, "start verify got error", new Object[0]);
            aVarA2.f124237b.put("success", (Object) Boolean.FALSE);
            aVarA2.f124237b.put("errorMessage", (Object) "未知的异常");
            com.alipay.mobile.android.verify.bridge.b.a().post(aVarA2);
        }
    }
}
