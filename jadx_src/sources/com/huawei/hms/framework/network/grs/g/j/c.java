package com.huawei.hms.framework.network.grs.g.j;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f60851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f60852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f60853c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f60851a = grsBaseInfo;
        this.f60852b = context;
    }

    private String e() {
        Set<String> setB = com.huawei.hms.framework.network.grs.f.b.a(this.f60852b.getPackageName()).b();
        if (setB.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = setB.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.d("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f60853c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.f60852b;
    }

    public void a(String str) {
        this.f60853c.add(str);
    }

    public GrsBaseInfo b() {
        return this.f60851a;
    }

    public String c() {
        return this.f60853c.size() == 0 ? e() : f();
    }

    public Set<String> d() {
        return this.f60853c;
    }
}
