package com.igexin.push.core.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends b {
    @Override // com.igexin.push.core.a.b
    public boolean a(Object obj, JSONObject jSONObject) {
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("block_client") || !jSONObject.has("duration")) {
                return true;
            }
            long j10 = jSONObject.getLong("duration") * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j10 == 0) {
                return true;
            }
            com.igexin.push.config.l.f63425c = jCurrentTimeMillis + j10;
            com.igexin.push.config.a.a().e();
            com.igexin.push.a.a.c.c().d();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
