package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g0 f60921c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f60922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f60923b = new Object();

    private g0() {
    }

    public static g0 a() {
        if (f60921c == null) {
            b();
        }
        return f60921c;
    }

    private JSONObject a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                v.b("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    private static synchronized void b() {
        if (f60921c == null) {
            f60921c = new g0();
        }
    }

    public void a(Context context) {
        synchronized (this.f60923b) {
            if (this.f60922a != null) {
                return;
            }
            this.f60922a = context;
            e.a().a(context);
        }
    }

    public void a(String str, int i10) {
        e.a().a(str, i10);
    }

    public void a(String str, int i10, String str2, LinkedHashMap<String, String> linkedHashMap) {
        e.a().a(str, i10, str2, a(linkedHashMap));
    }

    public void a(String str, Context context, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            e.a().a(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            v.f("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }

    public void b(String str, int i10, String str2, LinkedHashMap<String, String> linkedHashMap) {
        e.a().a(str, i10, str2, a(linkedHashMap), System.currentTimeMillis());
    }
}
