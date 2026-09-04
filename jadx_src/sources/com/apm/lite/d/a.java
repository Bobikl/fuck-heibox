package com.apm.lite.d;

import android.support.v4.media.session.PlaybackStateCompat;
import com.apm.lite.e;
import com.apm.lite.k.l;
import com.apm.lite.k.o;
import com.apm.lite.k.q;
import com.apm.lite.k.v;
import com.apm.lite.nativecrash.NativeImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JSONObject f39881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c f39882b;

    public a() {
        this.f39881a = new JSONObject();
    }

    public a(JSONObject jSONObject) {
        this.f39881a = jSONObject;
    }

    public static boolean B(String str) {
        return com.apm.lite.nativecrash.d.c(str) > 350;
    }

    public static void k(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            try {
                jSONObjectOptJSONObject = new JSONObject();
                jSONObject.put(str, jSONObjectOptJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObjectOptJSONObject.put(str2, str3);
    }

    public static void l(JSONObject jSONObject, Throwable th2) {
        String str = "npth_err_info";
        if (jSONObject.opt("npth_err_info") != null) {
            for (int i10 = 0; i10 < 5; i10++) {
                if (jSONObject.opt("npth_err_info" + i10) == null) {
                    try {
                        str = "npth_err_info" + i10;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
            return;
        }
        jSONObject.put(str, v.b(th2));
    }

    public static void m(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void n(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        try {
            jSONObject.put("storage", jSONObject2);
        } catch (Throwable unused) {
        }
        long jOptLong = jSONObject2.optLong("inner_free");
        long jOptLong2 = jSONObject2.optLong("sdcard_free");
        long jOptLong3 = jSONObject2.optLong("inner_free_real");
        String str3 = "1M - 64M";
        if (jOptLong <= 1024) {
            str = "0 - 1K";
        } else if (jOptLong <= 65536) {
            str = "1K - 64K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str = "64K - 512K";
        } else if (jOptLong <= 1048576) {
            str = "512K - 1M";
        } else {
            str = jOptLong <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong3 <= 1024) {
            str2 = "0 - 1K";
        } else if (jOptLong3 <= 65536) {
            str2 = "1K - 64K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str2 = "64K - 512K";
        } else if (jOptLong3 <= 1048576) {
            str2 = "512K - 1M";
        } else {
            str2 = jOptLong3 <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong2 <= 1024) {
            str3 = "0 - 1K";
        } else if (jOptLong2 <= 65536) {
            str3 = "1K - 64K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str3 = "64K - 512K";
        } else if (jOptLong2 <= 1048576) {
            str3 = "512K - 1M";
        } else if (jOptLong2 > 67108864) {
            str3 = "64M - ";
        }
        k(jSONObject, "filters", "inner_free", str);
        k(jSONObject, "filters", "inner_free_real", str2);
        k(jSONObject, "filters", "sdcard_free", str3);
    }

    public static boolean p(String str) {
        return o.n(str).exists();
    }

    public static void u(JSONObject jSONObject, JSONObject jSONObject2) {
        Object objOpt;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt2 = jSONObject.opt(next);
                if (objOpt2 == null) {
                    objOpt = jSONObject2.opt(next);
                } else {
                    if (objOpt2 instanceof JSONObject) {
                        jSONObject3 = jSONObject.getJSONObject(next);
                        jSONObject4 = jSONObject2.getJSONObject(next);
                    } else if (objOpt2 instanceof JSONArray) {
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) objOpt2;
                            if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (jSONArrayOptJSONArray.opt(0) instanceof JSONObject)) {
                                jSONObject3 = jSONArray.getJSONObject(0);
                                jSONObject4 = jSONArrayOptJSONArray.getJSONObject(0);
                            } else {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    jSONArray.put(jSONArrayOptJSONArray.get(i10));
                                }
                            }
                        }
                    } else {
                        objOpt = jSONObject2.opt(next);
                    }
                    u(jSONObject3, jSONObject4);
                }
                jSONObject.put(next, objOpt);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean v(String str) {
        return ((long) com.apm.lite.nativecrash.d.d(str)) > com.apm.lite.nativecrash.c.u();
    }

    public static boolean z(String str) {
        return com.apm.lite.nativecrash.d.a(str) > 960;
    }

    public boolean A() {
        return z(e.l());
    }

    public JSONObject C(String str) {
        Object objOpt = G().opt("data");
        JSONObject jSONObjectOptJSONObject = objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : G();
        if (jSONObjectOptJSONObject == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject2 != null) {
            return jSONObjectOptJSONObject2;
        }
        JSONObject jSONObject = new JSONObject();
        j(str, jSONObject);
        return jSONObject;
    }

    public boolean D() {
        return B(e.l());
    }

    public boolean E() {
        return v(e.l());
    }

    public boolean F() {
        return p(e.l());
    }

    public JSONObject G() {
        return this.f39881a;
    }

    public c H() {
        if (this.f39882b == null) {
            c cVar = new c(e.m());
            this.f39882b = cVar;
            c(cVar);
        }
        return this.f39882b;
    }

    public a a(int i10, String str) {
        try {
            this.f39881a.put("miniapp_id", i10);
            this.f39881a.put("miniapp_version", str);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public a b(long j10) {
        try {
            j("app_start_time", Long.valueOf(j10));
            j("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j10)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public a c(c cVar) {
        j("header", cVar.s());
        this.f39882b = cVar;
        return this;
    }

    public a d(com.apm.lite.runtime.a.b bVar) {
        j("activity_trace", bVar.J());
        f("activity_track", bVar.N());
        return this;
    }

    public a e(String str, String str2) {
        Object objOpt = G().opt("data");
        k(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : G(), "filters", str, str2);
        return this;
    }

    public a f(String str, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject = G().optJSONObject("custom_long");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            j("custom_long", jSONObjectOptJSONObject);
        }
        try {
            jSONObjectOptJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    public a g(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            j("patch_info", jSONArray);
            return this;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        j("patch_info", jSONArray);
        return this;
    }

    public a h(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (map == null) {
                this.f39881a.put("plugin_info", jSONArray);
                return this;
            }
            for (String str : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", str);
                jSONObject.put("version_code", map.get(str));
                jSONArray.put(jSONObject);
            }
            this.f39881a.put("plugin_info", jSONArray);
            return this;
        } catch (Exception unused) {
        }
    }

    public a i(JSONObject jSONObject) {
        j("header", jSONObject);
        return this;
    }

    public void j(String str, Object obj) {
        try {
            this.f39881a.put(str, obj);
        } catch (Exception e10) {
            q.g(e10);
        }
    }

    public boolean o() {
        Object objOpt = G().opt("data");
        return objOpt instanceof JSONArray ? !l.h(((JSONArray) objOpt).optJSONObject(0), "logcat") : !l.h(this.f39881a, "logcat");
    }

    public a q(String str, String str2) {
        Object objOpt = G().opt("data");
        k(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : G(), "custom", str, str2);
        return this;
    }

    public a r(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException e10) {
                    q.g(e10);
                }
            }
            try {
                this.f39881a.put("sdk_info", jSONObject);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        return this;
    }

    public a s(JSONObject jSONObject) {
        n(this.f39881a, jSONObject);
        return this;
    }

    public void t() {
        e("has_logcat", String.valueOf(o()));
    }

    public a w(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject jSONObjectC = C("filters");
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                try {
                    jSONObjectC.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            j("filters", jSONObjectC);
        }
        return this;
    }

    public void x() {
        e("is_64_devices", String.valueOf(c.f()));
        e("is_64_runtime", String.valueOf(NativeImpl.is64BitRuntime()));
        e("is_x86_devices", String.valueOf(c.j()));
    }

    public void y(JSONObject jSONObject) {
        u(this.f39881a, jSONObject);
    }
}
