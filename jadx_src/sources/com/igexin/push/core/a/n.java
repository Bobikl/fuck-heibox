package com.igexin.push.core.a;

import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n extends com.igexin.push.f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f63495a;

    n(m mVar) {
        this.f63495a = mVar;
    }

    @Override // com.igexin.push.f.b
    protected void a() {
        try {
            com.igexin.push.core.b.d dVar = new com.igexin.push.core.b.d(com.igexin.push.core.d.f63671e);
            JSONObject jSONObjectC = dVar.c();
            if (jSONObjectC == null) {
                return;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject = jSONObjectC.getJSONObject(next);
                com.igexin.a.a.c.b.a("LoginResultAction|send unFeedback taskid = " + next, new Object[0]);
                jSONObject.put("appid", com.igexin.push.core.d.f63655a);
                e.a().a(jSONObject, jSONObject.getString("multaid"));
                itKeys.remove();
            }
            dVar.d();
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("LoginResultAction|feedbackMultiBrandPushMessage exception :" + th2.toString(), new Object[0]);
        }
    }
}
