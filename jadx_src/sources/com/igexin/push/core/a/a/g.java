package com.igexin.push.core.a.a;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.framework.common.ContainerUtils;
import com.igexin.push.config.k;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63475a = k.f63422a;

    /* JADX WARN: Code duplicated, block: B:12:0x002d A[PHI: r5 r13
  0x002d: PHI (r5v7 java.lang.String) = (r5v5 java.lang.String), (r5v8 java.lang.String) binds: [B:16:0x0063, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r13v7 java.lang.String) = (r13v6 java.lang.String), (r13v8 java.lang.String) binds: [B:16:0x0063, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(com.igexin.push.core.bean.k kVar, String str) {
        int iIndexOf;
        String strSubstring;
        String strA = kVar.a();
        if (strA == null || (iIndexOf = strA.indexOf(str)) == -1) {
            return;
        }
        String strSubstring2 = null;
        int iIndexOf2 = strA.indexOf("&");
        String strSubstring3 = "";
        if (iIndexOf2 == -1) {
            strSubstring3 = strA.substring(0, iIndexOf - 1);
            strSubstring = strA.substring(iIndexOf);
            if (strSubstring.contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
                strSubstring2 = strSubstring.substring(strSubstring.indexOf(ContainerUtils.KEY_VALUE_DELIMITER) + 1);
            }
        } else {
            int i10 = iIndexOf - 1;
            if (strA.charAt(i10) == '?') {
                strSubstring3 = strA.substring(0, iIndexOf) + strA.substring(iIndexOf2 + 1);
                strSubstring = strA.substring(iIndexOf, iIndexOf2);
                if (strSubstring.contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
                    strSubstring2 = strSubstring.substring(strSubstring.indexOf(ContainerUtils.KEY_VALUE_DELIMITER) + 1);
                }
            } else if (strA.charAt(i10) == '&') {
                String strSubstring4 = strA.substring(0, i10);
                String strSubstring5 = strA.substring(iIndexOf);
                int iIndexOf3 = strSubstring5.indexOf("&");
                if (iIndexOf3 != -1) {
                    strSubstring3 = strSubstring5.substring(iIndexOf3);
                    strSubstring5 = strSubstring5.substring(0, iIndexOf3);
                }
                strSubstring3 = strSubstring4 + strSubstring3;
                strSubstring2 = strSubstring5.substring(strSubstring5.indexOf(ContainerUtils.KEY_VALUE_DELIMITER) + 1);
            }
        }
        kVar.a(strSubstring3);
        kVar.b(strSubstring2);
    }

    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return com.igexin.push.core.a.success;
    }

    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("url") || !jSONObject.has("do") || !jSONObject.has("actionid")) {
                return null;
            }
            String string = jSONObject.getString("url");
            if (string.equals("")) {
                return null;
            }
            com.igexin.push.core.bean.k kVar = new com.igexin.push.core.bean.k();
            kVar.setType("startweb");
            kVar.setActionId(jSONObject.getString("actionid"));
            kVar.setDoActionId(jSONObject.getString("do"));
            kVar.a(string);
            if (jSONObject.has("is_withcid") && jSONObject.getString("is_withcid").equals("true")) {
                kVar.a(true);
            }
            if (jSONObject.has("is_withnettype") && jSONObject.getString("is_withnettype").equals("true")) {
                kVar.b(true);
            }
            return kVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        com.igexin.push.core.bean.k kVar = (com.igexin.push.core.bean.k) baseAction;
        a(kVar, "targetpkgname");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setPackage(kVar.b());
        intent.setData(Uri.parse(kVar.c()));
        try {
            com.igexin.push.core.d.f63671e.startActivity(intent);
        } catch (Exception unused) {
        }
        if (baseAction.getDoActionId().equals("")) {
            return true;
        }
        com.igexin.push.core.a.e.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
        return true;
    }
}
