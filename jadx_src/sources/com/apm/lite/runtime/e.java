package com.apm.lite.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HashMap<String, e> f40179e = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f40180a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f40181b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40182c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f40183d;

    public e(JSONObject jSONObject, String str) {
        this.f40183d = str;
        c(jSONObject);
        f40179e.put(this.f40183d, this);
        com.apm.lite.k.q.a("after update aid " + str);
    }

    public static void b(String str, JSONObject jSONObject) {
        e eVar = f40179e.get(str);
        if (eVar != null) {
            eVar.c(jSONObject);
        } else {
            new e(jSONObject, str);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f40180a = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f40182c = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static boolean d(String str) {
        return f40179e.get(str) != null;
    }

    public static JSONObject e(String str) {
        e eVar = f40179e.get(str);
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static long g(String str) {
        e eVar = f40179e.get(str);
        if (eVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.lite.k.l.i(eVar.a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean j(String str) {
        e eVar = f40179e.get(str);
        return eVar != null && eVar.f() && eVar.k();
    }

    public static boolean l(String str) {
        e eVar = f40179e.get(str);
        return eVar != null && eVar.h() && eVar.k();
    }

    public static boolean m(String str) {
        e eVar = f40179e.get(str);
        return eVar != null && eVar.i() && eVar.k();
    }

    public static boolean n(String str) {
        e eVar = f40179e.get(str);
        return eVar == null || eVar.k();
    }

    public JSONObject a() {
        return this.f40180a;
    }

    public boolean f() {
        JSONObject jSONObject = this.f40180a;
        return jSONObject != null && 1 == com.apm.lite.k.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean h() {
        JSONObject jSONObject = this.f40180a;
        return jSONObject != null && 1 == com.apm.lite.k.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean i() {
        JSONObject jSONObject = this.f40180a;
        return jSONObject != null && 1 == com.apm.lite.k.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean k() {
        try {
            JSONObject jSONObject = this.f40180a;
            return jSONObject == null || jSONObject.optInt("status") == 0;
        } catch (Throwable unused) {
            return true;
        }
    }
}
