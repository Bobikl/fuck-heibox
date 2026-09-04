package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class fe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f107127a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ fd f421a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f107128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f107129c;

    fe(fd fdVar, String str, Context context, String str2, String str3) {
        this.f421a = fdVar;
        this.f422a = str;
        this.f107127a = context;
        this.f107128b = str2;
        this.f107129c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.f422a)) {
            ez.a(this.f107127a, "null", 1008, "A receive a incorrect message with empty info");
            return;
        }
        try {
            ez.a(this.f107127a, this.f422a, 1001, "get message");
            JSONObject jSONObject = new JSONObject(this.f422a);
            String strOptString = jSONObject.optString("action");
            String strOptString2 = jSONObject.optString("awakened_app_packagename");
            String strOptString3 = jSONObject.optString("awake_app_packagename");
            String strOptString4 = jSONObject.optString("awake_app");
            String strOptString5 = jSONObject.optString("awake_type");
            int iOptInt = jSONObject.optInt("awake_foreground", 0);
            if (this.f107128b.equals(strOptString3) && this.f107129c.equals(strOptString4)) {
                if (TextUtils.isEmpty(strOptString5) || TextUtils.isEmpty(strOptString3) || TextUtils.isEmpty(strOptString4) || TextUtils.isEmpty(strOptString2)) {
                    ez.a(this.f107127a, this.f422a, 1008, "A receive a incorrect message with empty type");
                    return;
                }
                this.f421a.b(strOptString3);
                this.f421a.a(strOptString4);
                fc fcVar = new fc();
                fcVar.b(strOptString);
                fcVar.a(strOptString2);
                fcVar.a(iOptInt);
                fcVar.d(this.f422a);
                if ("service".equals(strOptString5)) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.f421a.a(ff.SERVICE_ACTION, this.f107127a, fcVar);
                        return;
                    } else {
                        fcVar.c("com.xiaomi.mipush.sdk.PushMessageHandler");
                        this.f421a.a(ff.SERVICE_COMPONENT, this.f107127a, fcVar);
                        return;
                    }
                }
                ff ffVar = ff.ACTIVITY;
                if (ffVar.f424a.equals(strOptString5)) {
                    this.f421a.a(ffVar, this.f107127a, fcVar);
                    return;
                }
                ff ffVar2 = ff.PROVIDER;
                if (ffVar2.f424a.equals(strOptString5)) {
                    this.f421a.a(ffVar2, this.f107127a, fcVar);
                    return;
                }
                ez.a(this.f107127a, this.f422a, 1008, "A receive a incorrect message with unknown type " + strOptString5);
                return;
            }
            ez.a(this.f107127a, this.f422a, 1008, "A receive a incorrect message with incorrect package info" + strOptString3);
        } catch (JSONException e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            ez.a(this.f107127a, this.f422a, 1008, "A meet a exception when receive the message");
        }
    }
}
