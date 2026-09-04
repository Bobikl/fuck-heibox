package com.alipay.mobile.android.verify.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.face.api.ZIMFacade;
import java.net.URLEncoder;
import java.util.HashMap;
import z5.j;

/* JADX INFO: compiled from: ServiceImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements l4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39405a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f39406b;

    d() {
    }

    @Override // l4.b
    public String a(Context context) {
        return new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startApp")).resolveActivity(context.getPackageManager()) != null ? "FACE_ALIPAY_SDK" : "FACE_SDK";
    }

    @Override // l4.b
    public void b(Activity activity, JSONObject jSONObject, l4.a aVar) {
        String string;
        String string2 = "";
        if (this.f39405a || jSONObject == null) {
            return;
        }
        try {
            string = jSONObject.getString("url");
            try {
                string2 = jSONObject.getString("bizCode");
            } catch (Exception e10) {
                e = e10;
                com.alipay.mobile.android.verify.logger.f.k("ServiceImpl").k(e, "start container got error", new Object[0]);
                k4.a.c("json exception");
                aVar.a(new HashMap());
            }
        } catch (Exception e11) {
            e = e11;
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        new b().a();
        if (!"FACE_ALIPAY_SDK".equals(string2)) {
            try {
                k4.a.c("startZMSDK");
                this.f39405a = true;
                g.a(new f(this, activity, jSONObject, aVar));
                return;
            } catch (Exception e12) {
                com.alipay.mobile.android.verify.logger.f.k("ServiceImpl").k(e12, "start container got error", new Object[0]);
                k4.a.c("exception");
                aVar.a(new HashMap());
                return;
            }
        }
        try {
            k4.a.c("startAlipayVerify");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("alipays://platformapi/startapp?appId=20000067&pikshemo=YES&url=" + URLEncoder.encode(string)));
            activity.startActivity(intent);
            HashMap map = new HashMap();
            map.put(j.f141892a, "9001");
            map.put("isInWaitingState", "true");
            aVar.a(map);
        } catch (Exception e13) {
            com.alipay.mobile.android.verify.logger.f.k("ServiceImpl").k(e13, "start alipay error", new Object[0]);
            k4.a.c("startAlipayError");
            aVar.a(new HashMap());
        }
    }

    @Override // l4.b
    public synchronized void c(Activity activity, String str, l4.a aVar) {
        if (this.f39405a) {
            return;
        }
        new b().a();
        k4.a.c("startZMSDK");
        this.f39405a = true;
        g.a(new e(this, activity, str, aVar));
    }

    @Override // l4.b
    public String d(Context context) {
        return ZIMFacade.getMetaInfos(context);
    }
}
