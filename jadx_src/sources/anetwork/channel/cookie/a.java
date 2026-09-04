package anetwork.channel.cookie;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.webkit.CookieManager;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anetwork.channel.http.NetworkSdkSetting;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30164a = "anet.CookieManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f30165b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CookieManager f30166c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f30167d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C0254a f30168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SharedPreferences f30169f;

    /* JADX INFO: renamed from: anetwork.channel.cookie.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public static class C0254a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f30171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f30173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f30174e;

        C0254a(String str) {
            this.f30170a = str;
            String string = a.f30169f.getString("networksdk_cookie_monitor", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (!TextUtils.isEmpty(this.f30170a) && this.f30170a.equals(jSONObject.getString("cookieName"))) {
                    this.f30174e = jSONObject.getLong("time");
                    if (System.currentTimeMillis() - this.f30174e < 86400000) {
                        this.f30171b = jSONObject.getString("cookieText");
                        this.f30172c = jSONObject.getString("setCookie");
                        this.f30173d = jSONObject.getString("domain");
                    } else {
                        this.f30174e = 0L;
                        a.f30169f.edit().remove("networksdk_cookie_monitor").apply();
                    }
                }
            } catch (JSONException e10) {
                ALog.e(a.f30164a, "cookie json parse error.", null, e10, new Object[0]);
            }
        }

        void a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cookieName", this.f30170a);
                jSONObject.put("cookieText", this.f30171b);
                jSONObject.put("setCookie", this.f30172c);
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f30174e = jCurrentTimeMillis;
                jSONObject.put("time", jCurrentTimeMillis);
                jSONObject.put("domain", this.f30173d);
                a.f30169f.edit().putString("networksdk_cookie_monitor", jSONObject.toString()).apply();
            } catch (Exception e10) {
                ALog.e(a.f30164a, "cookie json save error.", null, e10, new Object[0]);
            }
        }
    }

    private static void c(String str) {
        ThreadPoolExecutorFactory.submitCookieMonitor(new c(str));
    }

    private static void d(String str, String str2) {
        ThreadPoolExecutorFactory.submitCookieMonitor(new d(str, str2));
    }

    private static boolean g() {
        if (!f30165b && NetworkSdkSetting.a() != null) {
            n(NetworkSdkSetting.a());
        }
        return f30165b;
    }

    private static void h() {
        ThreadPoolExecutorFactory.submitCookieMonitor(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i() {
        SharedPreferences sharedPreferences = f30169f;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("networksdk_target_cookie_name", null);
    }

    public static synchronized String j(String str) {
        String cookie = null;
        if (!t3.b.l()) {
            return null;
        }
        if (!g() || !f30167d) {
            return null;
        }
        try {
            cookie = f30166c.getCookie(str);
        } catch (Throwable th2) {
            ALog.e(f30164a, "get cookie failed. url=" + str, null, th2, new Object[0]);
        }
        d(str, cookie);
        return cookie;
    }

    public static synchronized void k(String str, String str2) {
        if (t3.b.l()) {
            if (g() && f30167d) {
                try {
                    f30166c.setCookie(str, str2);
                    f30166c.flush();
                } catch (Throwable th2) {
                    ALog.e(f30164a, "set cookie failed.", null, th2, "url", str, "cookies", str2);
                }
            }
        }
    }

    public static void l(String str, Map<String, List<String>> map) {
        if (!t3.b.l() || str == null || map == null) {
            return;
        }
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && (key.equalsIgnoreCase("Set-Cookie") || key.equalsIgnoreCase("Set-Cookie2"))) {
                    for (String str2 : entry.getValue()) {
                        k(str, str2);
                        c(str2);
                    }
                }
            }
        } catch (Exception e10) {
            ALog.e(f30164a, "set cookie failed", null, e10, "url", str, "\nheaders", map);
        }
    }

    public static void m(String str) {
        SharedPreferences sharedPreferences;
        if (str == null || (sharedPreferences = f30169f) == null) {
            return;
        }
        sharedPreferences.edit().putString("networksdk_target_cookie_name", str).apply();
    }

    public static synchronized void n(Context context) {
        if (t3.b.l()) {
            if (f30165b) {
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CookieManager cookieManager = CookieManager.getInstance();
                f30166c = cookieManager;
                cookieManager.setAcceptCookie(true);
                f30169f = PreferenceManager.getDefaultSharedPreferences(context);
                h();
                ALog.e(f30164a, "CookieManager setup.", null, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th2) {
                f30167d = false;
                ALog.e(f30164a, "Cookie Manager setup failed!!!", null, th2, new Object[0]);
            }
            f30165b = true;
        }
    }
}
