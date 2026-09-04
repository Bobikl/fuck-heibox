package com.igexin.push.core.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63478a = com.igexin.push.config.k.f63422a + "_BindAliasResultAction";

    @Override // com.igexin.push.core.a.b
    public boolean a(Object obj, JSONObject jSONObject) {
        com.igexin.a.a.c.b.a(f63478a + "|bind alias result resp data = " + jSONObject, new Object[0]);
        if (jSONObject == null) {
            return true;
        }
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("response_bind")) {
                return true;
            }
            com.igexin.push.core.r.a().b(jSONObject.getString("sn"), jSONObject.getString("result"));
            return true;
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(f63478a + "|" + e10.toString(), new Object[0]);
            return true;
        }
    }
}
