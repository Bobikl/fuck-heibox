package com.igexin.push.extension.distribution.basic.a;

import android.content.Intent;
import android.text.TextUtils;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class h implements com.igexin.push.core.a.a.a {
    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        com.igexin.push.extension.distribution.basic.b.d dVar = (com.igexin.push.extension.distribution.basic.b.d) baseAction;
        try {
            Intent intentA = com.igexin.push.util.b.a(dVar.a(), 0);
            intentA.setPackage(com.igexin.push.core.d.f63671e.getPackageName());
            intentA.addFlags(268435456);
            if (com.igexin.push.extension.distribution.basic.g.b.a(intentA, com.igexin.push.core.d.f63671e)) {
                return com.igexin.push.core.a.success;
            }
            com.igexin.a.a.c.b.a("EXT-StartMyActivity|execute failed, activity not exist", new Object[0]);
            com.igexin.push.core.a.e.a().a(pushTaskBean.getId(), pushTaskBean.getMessageId(), dVar.b());
            return com.igexin.push.core.a.stop;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("EXT-StartMyActivity|execute exception = " + th2.toString(), new Object[0]);
            com.igexin.push.core.a.e.a().a(pushTaskBean.getId(), pushTaskBean.getMessageId(), dVar.b());
            return com.igexin.push.core.a.stop;
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("do") || !jSONObject.has("actionid") || !jSONObject.has("type") || !jSONObject.has("uri") || !jSONObject.has("do_failed")) {
                return null;
            }
            String string = jSONObject.getString("uri");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            com.igexin.push.extension.distribution.basic.b.d dVar = new com.igexin.push.extension.distribution.basic.b.d();
            dVar.setType("startmyactivity");
            dVar.setActionId(jSONObject.getString("actionid"));
            dVar.setDoActionId(jSONObject.getString("do"));
            dVar.a(string);
            dVar.b(jSONObject.getString("do_failed"));
            return dVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        com.igexin.push.core.a.e eVarA;
        String id2;
        String messageId;
        String strB;
        com.igexin.push.extension.distribution.basic.b.d dVar = (com.igexin.push.extension.distribution.basic.b.d) baseAction;
        try {
            Intent intentA = com.igexin.push.util.b.a(dVar.a(), 0);
            intentA.setPackage(com.igexin.push.core.d.f63671e.getPackageName());
            intentA.addFlags(268435456);
            if (com.igexin.push.extension.distribution.basic.g.b.a(intentA, com.igexin.push.core.d.f63671e)) {
                com.igexin.push.core.d.f63671e.startActivity(intentA);
                eVarA = com.igexin.push.core.a.e.a();
                id2 = pushTaskBean.getTaskId();
                messageId = pushTaskBean.getMessageId();
                strB = dVar.getDoActionId();
            } else {
                com.igexin.a.a.c.b.a("EXT-StartMyActivity|execute failed, activity not exist", new Object[0]);
                eVarA = com.igexin.push.core.a.e.a();
                id2 = pushTaskBean.getId();
                messageId = pushTaskBean.getMessageId();
                strB = dVar.b();
            }
            eVarA.a(id2, messageId, strB);
            return true;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("EXT-StartMyActivity|execute exception = " + th2.getMessage(), new Object[0]);
            com.igexin.push.core.a.e.a().a(pushTaskBean.getId(), pushTaskBean.getMessageId(), dVar.b());
            return true;
        }
    }
}
