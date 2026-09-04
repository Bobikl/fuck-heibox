package com.alipay.deviceid.module.x;

import android.content.Context;
import com.taobao.accs.common.Constants;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceInfoStorage.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bu {
    public static bv a(Context context) {
        if (context == null) {
            return null;
        }
        String strA = bz.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (e.a(strA)) {
            strA = bz.a("device_feature_file_name", "device_feature_file_key");
        }
        if (e.a(strA)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            bv bvVar = new bv();
            bvVar.f38327a = jSONObject.getString("imei");
            bvVar.f38328b = jSONObject.getString(Constants.KEY_IMSI);
            bvVar.f38329c = jSONObject.getString("mac");
            bvVar.f38330d = jSONObject.getString("bluetoothmac");
            bvVar.f38331e = jSONObject.getString("gsi");
            return bvVar;
        } catch (Exception e10) {
            x.a(e10);
            return null;
        }
    }

    public static void a(Context context, bv bvVar) {
        if (context == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imei", e.c(bvVar.f38327a));
            jSONObject.put(Constants.KEY_IMSI, e.c(bvVar.f38328b));
            jSONObject.put("mac", e.c(bvVar.f38329c));
            jSONObject.put("bluetoothmac", e.c(bvVar.f38330d));
            jSONObject.put("gsi", e.c(bvVar.f38331e));
            String string = jSONObject.toString();
            if (!e.a("device_feature_file_name") && !e.a("device_feature_file_key")) {
                try {
                    String strA = i.a(i.a(), string);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("device_feature_file_key", strA);
                    r.a("device_feature_file_name", jSONObject2.toString());
                } catch (Exception unused) {
                }
            }
            bz.a(context, "device_feature_prefs_name", "device_feature_prefs_key", string);
        } catch (Exception e10) {
            x.a(e10);
        }
    }
}
