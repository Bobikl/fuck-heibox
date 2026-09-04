package com.igexin.push.core.a.a;

import android.content.Intent;
import android.text.TextUtils;
import com.igexin.push.config.k;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.bean.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63474a = k.f63422a;

    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        j jVar = (j) baseAction;
        try {
            Intent intentA = com.igexin.push.util.b.a(jVar.a(), 0);
            intentA.setPackage(com.igexin.push.core.d.f63671e.getPackageName());
            intentA.addFlags(268435456);
            if (com.igexin.push.util.a.b(intentA, com.igexin.push.core.d.f63671e)) {
                return com.igexin.push.core.a.success;
            }
            com.igexin.a.a.c.b.a(f63474a + "|execute failed, activity not exist", new Object[0]);
            com.igexin.push.core.a.e.a().a(pushTaskBean.getId(), pushTaskBean.getMessageId(), jVar.b());
            return com.igexin.push.core.a.stop;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63474a + "|execute exception = " + th2.toString(), new Object[0]);
            com.igexin.push.core.a.e.a().a(pushTaskBean.getId(), pushTaskBean.getMessageId(), jVar.b());
            return com.igexin.push.core.a.stop;
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("do") || !jSONObject.has("actionid") || !jSONObject.has("type") || !jSONObject.has("uri") || !jSONObject.has("do_failed")) {
                return null;
            }
            String strOptString = jSONObject.optString("uri");
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            j jVar = new j();
            jVar.setType("startmyactivity");
            jVar.setActionId(jSONObject.getString("actionid"));
            jVar.setDoActionId(jSONObject.getString("do"));
            jVar.a(strOptString);
            jVar.b(jSONObject.optString("do_failed"));
            return jVar;
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
        j jVar = (j) baseAction;
        try {
            Intent intentA = com.igexin.push.util.b.a(jVar.a(), 0);
            intentA.setPackage(com.igexin.push.core.d.f63671e.getPackageName());
            intentA.addFlags(268435456);
            if (com.igexin.push.util.a.b(intentA, com.igexin.push.core.d.f63671e)) {
                com.igexin.push.core.d.f63671e.startActivity(intentA);
                eVarA = com.igexin.push.core.a.e.a();
                id2 = pushTaskBean.getTaskId();
                messageId = pushTaskBean.getMessageId();
                strB = jVar.getDoActionId();
            } else {
                com.igexin.a.a.c.b.a(f63474a + "|execute failed, activity not exist", new Object[0]);
                eVarA = com.igexin.push.core.a.e.a();
                id2 = pushTaskBean.getId();
                messageId = pushTaskBean.getMessageId();
                strB = jVar.b();
            }
            eVarA.a(id2, messageId, strB);
            return true;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63474a + "|execute exception = " + th2.getMessage(), new Object[0]);
            com.igexin.push.core.a.e.a().a(pushTaskBean.getId(), pushTaskBean.getMessageId(), jVar.b());
            return true;
        }
    }
}
