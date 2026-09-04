package com.igexin.push.core.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class w extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63501a = com.igexin.push.config.k.f63422a + "_SetTagResultAction";

    @Override // com.igexin.push.core.a.b
    public boolean a(Object obj, JSONObject jSONObject) {
        com.igexin.a.a.c.b.a(f63501a + "|set tag result resp data = " + jSONObject, new Object[0]);
        if (jSONObject == null) {
            return true;
        }
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("settag_result")) {
                return true;
            }
            com.igexin.push.core.r.a().a(jSONObject.getString("sn"), jSONObject.getString("error_code"));
            return true;
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(f63501a + "|" + e10.toString(), new Object[0]);
            return true;
        }
    }
}
