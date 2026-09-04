package com.umeng.ut.b.b;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f106443d = -1;

    b() {
    }

    static b a(String str) {
        JSONObject jSONObject;
        b bVar = new b();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("code")) {
                bVar.f106443d = jSONObject2.getInt("code");
            }
            if (jSONObject2.has("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && jSONObject.has("id") && jSONObject.has("d_ts")) {
                d.a(com.umeng.ut.a.a.a().m53a()).a(jSONObject.getString("id"), jSONObject.getLong("d_ts"));
            }
            com.umeng.ut.a.c.e.m56a("BizResponse", "content", str);
        } catch (Throwable th2) {
            com.umeng.ut.a.c.e.m56a("", th2.toString());
        }
        return bVar;
    }

    static boolean a(int i10) {
        return i10 >= 0 && i10 != 10012;
    }
}
