package com.igexin.push.core.a.a;

import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {
    private boolean a(String str) {
        try {
            return com.igexin.push.core.d.f63671e.getPackageManager().getLaunchIntentForPackage(str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return com.igexin.push.core.a.success;
    }

    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("type") || !jSONObject.has("actionid")) {
                return null;
            }
            com.igexin.push.core.bean.b bVar = new com.igexin.push.core.bean.b();
            bVar.setType("checkapp");
            bVar.setActionId(jSONObject.getString("actionid"));
            if (!jSONObject.has("appstartupid")) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("appstartupid");
            if (!jSONObject2.has("android")) {
                return null;
            }
            bVar.a(jSONObject2.getString("android"));
            if (!jSONObject.has("do_installed") && !jSONObject.has("do_uninstalled")) {
                return null;
            }
            if (jSONObject.has("do_installed")) {
                bVar.b(jSONObject.getString("do_installed"));
            }
            if (jSONObject.has("do_uninstalled")) {
                bVar.c(jSONObject.getString("do_uninstalled"));
            }
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        com.igexin.push.core.a.e eVarA;
        String strC;
        com.igexin.push.core.bean.b bVar = (com.igexin.push.core.bean.b) baseAction;
        String taskId = pushTaskBean.getTaskId();
        String messageId = pushTaskBean.getMessageId();
        if (a(bVar.a())) {
            if (bVar.b() == null || bVar.b().equals("")) {
                return true;
            }
            eVarA = com.igexin.push.core.a.e.a();
            strC = bVar.b();
        } else {
            if (bVar.c() == null || bVar.c().equals("")) {
                return true;
            }
            eVarA = com.igexin.push.core.a.e.a();
            strC = bVar.c();
        }
        eVarA.a(taskId, messageId, strC);
        return true;
    }
}
