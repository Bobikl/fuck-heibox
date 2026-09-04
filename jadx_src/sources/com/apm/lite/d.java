package com.apm.lite;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.lite.j.j;
import com.apm.lite.k.l;
import com.apm.lite.k.v;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static volatile MonitorCrash f39878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static volatile ConcurrentHashMap<String, MonitorCrash> f39879c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MonitorCrash f39880a;

    private d(MonitorCrash monitorCrash) {
        this.f39880a = monitorCrash;
        com.apm.lite.d.b.g(this);
        com.apm.lite.i.b.e();
        j.h();
    }

    static MonitorCrash a(String str) {
        return f39879c.get(str);
    }

    public static Object b() {
        return f39878b;
    }

    private JSONObject h(boolean z10) {
        MonitorCrash monitorCrash;
        b bVar;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f39880a.mConfig.f39813f == null) {
                Context contextM = e.m();
                PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(contextM.getPackageName(), 128);
                if (packageInfo != null) {
                    MonitorCrash.Config config = this.f39880a.mConfig;
                    if (config.f39811d == -1) {
                        config.f39811d = packageInfo.versionCode;
                    }
                    if (config.f39812e == null) {
                        config.f39812e = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if ((TextUtils.isEmpty(this.f39880a.mConfig.getDeviceId()) || "0".equals(this.f39880a.mConfig.getDeviceId())) && (bVar = (monitorCrash = this.f39880a).mAppLog) != null) {
            monitorCrash.mConfig.setDeviceId(bVar.b(), false);
        }
        try {
            jSONObject.put(CommonNetImpl.AID, String.valueOf(this.f39880a.mConfig.f39808a));
            if (z10 && !TextUtils.isEmpty(this.f39880a.mConfig.f39809b)) {
                jSONObject.put("x-auth-token", this.f39880a.mConfig.f39809b);
            }
            jSONObject.put("update_version_code", this.f39880a.mConfig.f39811d);
            jSONObject.put("version_code", this.f39880a.mConfig.f39811d);
            jSONObject.put("app_version", this.f39880a.mConfig.f39812e);
            jSONObject.put("channel", this.f39880a.mConfig.f39810c);
            jSONObject.put("package", l.d(this.f39880a.mConfig.f39813f));
            jSONObject.put("device_id", this.f39880a.mConfig.getDeviceId());
            jSONObject.put("user_id", this.f39880a.mConfig.getUID());
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", l.d(this.f39880a.mConfig.f39814g));
            jSONObject.put("single_upload", p() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    static void i(MonitorCrash monitorCrash) {
        new d(monitorCrash);
        if (monitorCrash == null || monitorCrash.mConfig == null) {
            return;
        }
        f39879c.put(monitorCrash.mConfig.f39808a, monitorCrash);
    }

    public static String l(String str) {
        MonitorCrash monitorCrash;
        if (f39878b != null && TextUtils.equals(str, f39878b.mConfig.f39808a)) {
            monitorCrash = f39878b;
        } else if (f39879c == null || (monitorCrash = f39879c.get(str)) == null) {
            return null;
        }
        return monitorCrash.mConfig.f39809b;
    }

    private JSONObject m(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        AttachUserData attachUserData = this.f39880a.mCustomData;
        if (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    private JSONObject o(CrashType crashType) {
        return new JSONObject(this.f39880a.mTagMap);
    }

    public static String q() {
        if (f39878b == null) {
            return null;
        }
        return f39878b.mConfig.f39808a;
    }

    public JSONArray c(StackTraceElement[] stackTraceElementArr, Throwable th2) {
        String[] strArr = this.f39880a.mConfig.f39813f;
        if (strArr == null) {
            return new JSONArray().put(new v.a(0, stackTraceElementArr.length).a());
        }
        if (th2 == null || stackTraceElementArr == null) {
            return null;
        }
        return v.g(stackTraceElementArr, strArr);
    }

    public JSONArray d(String[] strArr) {
        if (this.f39880a.config().f39813f == null) {
            return new JSONArray().put(new v.a(0, strArr.length).a());
        }
        JSONArray jSONArrayH = v.h(strArr, this.f39880a.mConfig.f39813f);
        try {
            if (l.f(jSONArrayH) && this.f39880a.mConfig.f39818k) {
                String strK = com.apm.lite.runtime.a.b.y().K();
                if (!TextUtils.isEmpty(strK)) {
                    for (String str : this.f39880a.mConfig.f39813f) {
                        if (strK.contains(str)) {
                            return new JSONArray().put(new v.a(0, strArr.length).a());
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArrayH;
    }

    public JSONObject e(CrashType crashType) {
        return f(crashType, null);
    }

    public JSONObject f(CrashType crashType, JSONArray jSONArray) {
        return g(crashType, jSONArray, false);
    }

    public JSONObject g(CrashType crashType, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", h(z10));
            if (crashType != null) {
                jSONObject.put("custom", m(crashType));
                jSONObject.put("filters", o(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public boolean j(Object obj) {
        return this.f39880a == obj;
    }

    public String k() {
        return this.f39880a.mConfig.f39808a;
    }

    public JSONObject n() {
        return h(true);
    }

    public boolean p() {
        return false;
    }
}
