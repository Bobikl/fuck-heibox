package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static b a(String str) {
        try {
            if (!e6.a.c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
            }
        } catch (Exception e10) {
            com.alipay.apmobilesecuritysdk.c.a.a(e10);
        }
        return null;
    }

    public static synchronized void a() {
    }

    public static synchronized void a(Context context) {
        com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
        com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
    }

    public static synchronized void a(Context context, b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apdid", bVar.f38172a);
            jSONObject.put("deviceInfoHash", bVar.f38173b);
            jSONObject.put("timestamp", bVar.f38174c);
            String string = jSONObject.toString();
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", string);
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", string);
        } catch (Exception e10) {
            com.alipay.apmobilesecuritysdk.c.a.a(e10);
        }
    }

    public static synchronized b b() {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
        if (e6.a.c(strA)) {
            return null;
        }
        return a(strA);
    }

    public static synchronized b b(Context context) {
        String strA;
        strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
        if (e6.a.c(strA)) {
            strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
        }
        return a(strA);
    }

    public static synchronized b c(Context context) {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
        if (e6.a.c(strA)) {
            return null;
        }
        return a(strA);
    }
}
