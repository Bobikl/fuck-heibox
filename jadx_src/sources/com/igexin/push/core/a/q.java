package com.igexin.push.core.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q extends b {
    @Override // com.igexin.push.core.a.b
    public boolean a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has("action") && jSONObject.getString("action").equals("received")) {
                String string = jSONObject.getString("id");
                com.igexin.a.a.c.b.a("ReceivedAction received, cmd id :" + string, new Object[0]);
                try {
                    com.igexin.push.core.b.e.a().a(Long.parseLong(string), true, false);
                    e.a().c();
                } catch (NumberFormatException e10) {
                    com.igexin.a.a.c.b.a("ReceivedAction|" + e10.toString(), new Object[0]);
                }
            }
        } catch (Exception e11) {
            com.igexin.a.a.c.b.a("ReceivedAction|" + e11.toString(), new Object[0]);
        }
        return true;
    }
}
