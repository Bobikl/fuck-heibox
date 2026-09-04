package com.apm.lite.runtime;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<Object> f40125a = new ConcurrentLinkedQueue<>();

    public static int a(int i10, String... strArr) {
        return com.apm.lite.k.l.a(d(), i10, strArr);
    }

    public static int b(String... strArr) {
        return com.apm.lite.k.l.a(d(), -1, strArr);
    }

    public static String c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("npth");
    }

    public static JSONObject d() {
        return e.e(com.apm.lite.e.a().g());
    }

    public static JSONObject e(JSONArray jSONArray, String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10).optJSONObject(str);
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
            }
        }
        return null;
    }

    public static void f(JSONArray jSONArray, boolean z10) {
        if (jSONArray == null) {
            return;
        }
        com.apm.lite.k.q.c("apmconfig", "fromnet " + z10 + " : " + jSONArray);
        if (z10) {
            com.apm.lite.j.j.i();
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                String next = jSONObjectOptJSONObject.keys().next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                com.apm.lite.k.q.a("update config " + next + " : " + jSONObjectOptJSONObject2);
                e.b(next, jSONObjectOptJSONObject2);
                if (z10) {
                    com.apm.lite.j.j.a(next);
                }
            } catch (Throwable unused) {
            }
        }
        k.a(e(jSONArray, String.valueOf(com.apm.lite.e.a().g())));
        if (z10) {
            com.apm.lite.j.j.b(false, jSONArray);
        }
    }

    public static boolean g(String str) {
        if (!e.d(str)) {
            com.apm.lite.j.a.b();
        }
        return e.j(str);
    }

    public static boolean h() {
        return l.r();
    }

    public static boolean i(String str) {
        if (!e.d(str)) {
            com.apm.lite.j.a.b();
        }
        return e.m(str);
    }

    public static JSONArray j() {
        return com.apm.lite.k.l.c(d(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    public static boolean k(String str) {
        if (!e.d(str)) {
            com.apm.lite.j.a.b();
        }
        return e.l(str);
    }

    public static boolean l() {
        return b("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    public static boolean m() {
        return b("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1;
    }

    public static boolean n() {
        return b("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    public static boolean o() {
        return b("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    public static boolean p() {
        return b("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1;
    }

    public static boolean q() {
        return b("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }
}
