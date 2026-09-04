package com.umeng.message.proguard;

import android.app.Application;
import android.os.Build;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            Application applicationA = x.a();
            jSONObject.put("appkey", PushAgent.getInstance(applicationA).getMessageAppkey());
            jSONObject.put("channel", PushAgent.getInstance(applicationA).getMessageChannel());
            jSONObject.put("umid", d.k(applicationA));
            jSONObject.put("din", d.c(applicationA));
            jSONObject.put("device_id", d.d(applicationA));
            jSONObject.put(com.umeng.analytics.pro.ak.f104462v, d.f(applicationA));
            jSONObject.put(com.umeng.analytics.pro.ak.A, d.c());
            if (d.e(applicationA) != null) {
                jSONObject.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, d.e(applicationA));
            }
            if (d.b() != null) {
                jSONObject.put("serial_number", d.b());
            }
            String strP = d.p(applicationA);
            if ("false".equals(strP)) {
                UMLog.aq(ab.f105668b, 0, "\\|");
            }
            jSONObject.put("push_switch", strP);
            jSONObject.put("sdk_type", "Android");
            jSONObject.put("sdk_version", MsgConstant.SDK_VERSION);
            String[] strArrG = d.g(applicationA);
            jSONObject.put(com.umeng.analytics.pro.ak.Q, strArrG[0]);
            jSONObject.put(com.umeng.analytics.pro.ak.R, strArrG[1]);
            jSONObject.put("carrier", d.m(applicationA));
            jSONObject.put("device_model", d.d());
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("app_version", d.b(applicationA));
            jSONObject.put("version_code", d.a(applicationA));
            jSONObject.put("package_name", applicationA.getPackageName());
            jSONObject.put("resolution", d.l(applicationA));
            jSONObject.put(com.umeng.analytics.pro.ak.f104463w, d.a());
            jSONObject.put(com.umeng.analytics.pro.ak.M, d.i(applicationA));
            String[] strArrJ = d.j(applicationA);
            jSONObject.put(com.umeng.analytics.pro.ak.O, strArrJ[0]);
            jSONObject.put(com.umeng.analytics.pro.ak.N, strArrJ[1]);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject;
    }
}
