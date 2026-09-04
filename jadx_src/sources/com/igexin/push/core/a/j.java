package com.igexin.push.core.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63491a = com.igexin.push.config.k.f63422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, b> f63492b;

    public j() {
        HashMap map = new HashMap();
        f63492b = map;
        map.put("redirect_server", new r());
        f63492b.put("response_deviceid", new u());
        f63492b.put("pushmessage", new p());
        f63492b.put("received", new q());
        f63492b.put("sendmessage_feedback", new v());
        f63492b.put("block_client", new d());
        f63492b.put("settag_result", new w());
        f63492b.put("response_bind", new c());
        f63492b.put("response_unbind", new x());
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(com.igexin.a.a.d.e eVar) {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(Object obj) {
        b bVar;
        if (!(obj instanceof com.igexin.push.d.c.m)) {
            return false;
        }
        com.igexin.push.d.c.m mVar = (com.igexin.push.d.c.m) obj;
        if (!mVar.b() || mVar.f63879e == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) mVar.f63879e);
            String strOptString = jSONObject.optString("action");
            if (!strOptString.equals("received") && !strOptString.equals("redirect_server") && jSONObject.has("id")) {
                e.a().a(jSONObject.getString("id"));
            }
            if (TextUtils.isEmpty(strOptString) || (bVar = f63492b.get(strOptString)) == null) {
                return false;
            }
            return bVar.a(obj, jSONObject);
        } catch (Exception unused) {
            return false;
        }
    }
}
