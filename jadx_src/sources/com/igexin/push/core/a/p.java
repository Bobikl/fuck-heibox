package com.igexin.push.core.a;

import com.igexin.assist.action.MessageManger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p extends b {
    @Override // com.igexin.push.core.a.b
    public boolean a(Object obj, JSONObject jSONObject) {
        e eVarA;
        String str;
        try {
            com.igexin.push.d.c.m mVar = (com.igexin.push.d.c.m) obj;
            if (jSONObject.has("action") && jSONObject.getString("action").equals("pushmessage")) {
                Object obj2 = mVar.f63880f;
                byte[] bArr = obj2 instanceof byte[] ? (byte[]) obj2 : null;
                String string = jSONObject.getString("taskid");
                com.igexin.a.a.c.b.a("getui receive message : %s", jSONObject);
                if (bArr == null || !com.igexin.assist.sdk.a.i(com.igexin.push.core.d.f63671e)) {
                    com.igexin.push.core.w.a().a(jSONObject, bArr, true);
                } else {
                    com.igexin.push.core.b.d dVar = new com.igexin.push.core.b.d(com.igexin.push.core.d.f63671e);
                    if (dVar.a(string)) {
                        eVarA = e.a();
                        str = "1" + MessageManger.getInstance().getBrandCode(com.igexin.push.core.d.f63671e);
                    } else {
                        dVar.b(string);
                        com.igexin.push.core.w.a().a(jSONObject, bArr, true);
                        eVarA = e.a();
                        str = "10";
                    }
                    eVarA.a(jSONObject, str);
                }
            }
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("PushmessageAction|" + e10.toString(), new Object[0]);
        }
        return true;
    }
}
