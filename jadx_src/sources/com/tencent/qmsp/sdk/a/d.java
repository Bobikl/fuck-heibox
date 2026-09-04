package com.tencent.qmsp.sdk.a;

import android.os.Build;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(e.a(0), i10);
            jSONObject.put(e.a(1), com.tencent.qmsp.sdk.app.a.getAppID());
            jSONObject.put(e.a(2), com.tencent.qmsp.sdk.app.a.getDevId());
            jSONObject.put(e.a(3), com.tencent.qmsp.sdk.app.a.getUid());
            jSONObject.put(e.a(4), com.tencent.qmsp.sdk.app.a.getQImeiVer());
            jSONObject.put(e.a(5), Build.VERSION.SDK_INT);
            jSONObject.put(e.a(6), c.c());
            jSONObject.put(e.a(7), c.e());
            jSONObject.put(e.a(8), System.currentTimeMillis());
            jSONObject.put(e.a(9), 1);
            jSONObject.put(e.a(10), c.h() ? "1" : "0");
            jSONObject.put(e.a(11), com.tencent.qmsp.sdk.app.a.getmOAID());
            return jSONObject;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
