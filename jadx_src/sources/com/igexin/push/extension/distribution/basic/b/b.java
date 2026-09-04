package com.igexin.push.extension.distribution.basic.b;

import android.text.TextUtils;
import com.igexin.push.core.bean.BaseAction;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends BaseAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f63943a;

    public static b a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("actionid")) {
            bVar.setActionId(jSONObject.getString("actionid"));
        }
        if (jSONObject.has("type")) {
            bVar.setType(jSONObject.getString("type"));
        }
        if (jSONObject.has("do")) {
            bVar.setDoActionId(jSONObject.getString("do"));
        }
        if (jSONObject.has("delay")) {
            double d10 = jSONObject.getDouble("delay");
            if (d10 > 0.0d) {
                bVar.a((long) (d10 * 1000.0d));
                return bVar;
            }
        }
        bVar.a(200L);
        return bVar;
    }

    public long a() {
        return this.f63943a;
    }

    public void a(long j10) {
        this.f63943a = j10;
    }
}
