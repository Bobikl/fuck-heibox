package com.apm.lite.k;

import android.text.TextUtils;
import com.apm.lite.CrashType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s {
    public static void a(com.apm.lite.d.a aVar, com.apm.lite.d.c cVar, CrashType crashType) {
        if (aVar != null) {
            b(aVar.G(), cVar, crashType);
        }
    }

    public static void b(JSONObject jSONObject, com.apm.lite.d.c cVar, CrashType crashType) {
        if (jSONObject == null || crashType == null) {
            return;
        }
        long jOptLong = jSONObject.optLong("crash_time");
        String strA = com.apm.lite.e.h().a();
        if (jOptLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            String str = "android__" + strA + lg.a.f131412e + jOptLong + lg.a.f131412e + crashType;
            if (cVar == null || (jSONObject = cVar.s()) != null) {
                jSONObject.put("unique_key", str);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
