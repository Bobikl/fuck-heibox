package com.igexin.push.core.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class u extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63500a = com.igexin.push.config.k.f63422a;

    @Override // com.igexin.push.core.a.b
    public boolean a(Object obj, JSONObject jSONObject) {
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("response_deviceid")) {
                return true;
            }
            String string = jSONObject.getString("deviceid");
            com.igexin.a.a.c.b.a(f63500a + " get devid resp, devid : " + string + ", save 2db and file", new Object[0]);
            com.igexin.push.core.b.i.a().b(string);
            if (com.igexin.push.core.d.f63691y != null) {
                com.igexin.push.core.c.a().j().e();
            }
            com.igexin.a.a.c.b.a("deviceidRsp|" + com.igexin.push.core.d.f63691y, new Object[0]);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
