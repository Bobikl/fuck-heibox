package y5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Random;
import org.json.JSONObject;
import z5.e;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f141590g = "alipay_tid_storage";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f141591h = "tidinfo";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f141592i = "tid";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f141593j = "client_key";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f141594k = "timestamp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f141595l = "vimei";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f141596m = "vimsi";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Context f141597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static a f141598o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f141599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f141600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f141601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f141602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f141603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f141604f = false;

    /* JADX INFO: renamed from: y5.a$a, reason: collision with other inner class name */
    public static class C1280a {
        public static String a() {
            String packageName;
            try {
                packageName = a.f141597n.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                e.d(th2);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }

        public static String b(String str, String str2, boolean z10) {
            if (a.f141597n == null) {
                return null;
            }
            String string = a.f141597n.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z10) {
                string = n5.e.a(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    e.g(j5.a.f124275z, "tid_str: pref failed");
                }
            }
            e.g(j5.a.f124275z, "tid_str: from local");
            return string;
        }

        public static void c(String str, String str2, String str3) {
            d(str, str2, str3, true);
        }

        public static void d(String str, String str2, String str3, boolean z10) {
            if (a.f141597n == null) {
                return;
            }
            SharedPreferences sharedPreferences = a.f141597n.getSharedPreferences(str, 0);
            if (z10) {
                String strA = a();
                String strC = n5.e.c(strA, str3, str3);
                if (TextUtils.isEmpty(strC)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, strA);
                }
                str3 = strC;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static boolean e(String str, String str2) {
            if (a.f141597n == null) {
                return false;
            }
            return a.f141597n.getSharedPreferences(str, 0).contains(str2);
        }

        public static void f(String str, String str2) {
            if (a.f141597n == null) {
                return;
            }
            a.f141597n.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }

        public static boolean g(String str, String str2) {
            if (a.f141597n == null) {
                return false;
            }
            return a.f141597n.getSharedPreferences(str, 0).contains(str2);
        }

        public static String h(String str, String str2) {
            return b(str, str2, true);
        }
    }

    public static synchronized a a(Context context) {
        if (f141598o == null) {
            f141598o = new a();
        }
        if (f141597n == null) {
            f141598o.g(context);
        }
        return f141598o;
    }

    private void d(String str, String str2, String str3, String str4, Long l10) {
        if (e(str, str2, str3, str4)) {
            return;
        }
        this.f141599a = str;
        this.f141600b = str2;
        this.f141602d = str3;
        this.f141603e = str4;
        if (l10 == null) {
            this.f141601c = System.currentTimeMillis();
        } else {
            this.f141601c = l10.longValue();
        }
        s();
    }

    private boolean e(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    private void g(Context context) {
        if (context != null) {
            f141597n = context.getApplicationContext();
        }
        if (this.f141604f) {
            return;
        }
        this.f141604f = true;
        q();
    }

    private String p() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    private void q() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            String strB = C1280a.b(f141590g, f141591h, true);
            if (TextUtils.isEmpty(strB)) {
                str = null;
                strOptString2 = null;
                strOptString3 = null;
            } else {
                JSONObject jSONObject = new JSONObject(strB);
                strOptString = jSONObject.optString("tid", "");
                try {
                    strOptString2 = jSONObject.optString("client_key", "");
                    try {
                        lValueOf = Long.valueOf(jSONObject.optLong("timestamp", System.currentTimeMillis()));
                        strOptString3 = jSONObject.optString(f141595l, "");
                        try {
                            strOptString4 = jSONObject.optString(f141596m, "");
                        } catch (Exception e10) {
                            e = e10;
                            e.d(e);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        strOptString3 = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    strOptString2 = null;
                    strOptString3 = strOptString2;
                    e.d(e);
                    str = strOptString4;
                    strOptString4 = strOptString;
                    e.g(j5.a.f124275z, "tid_str: load");
                    if (e(strOptString4, strOptString2, strOptString3, str)) {
                        r();
                        return;
                    }
                    this.f141599a = strOptString4;
                    this.f141600b = strOptString2;
                    this.f141601c = lValueOf.longValue();
                    this.f141602d = strOptString3;
                    this.f141603e = str;
                }
                str = strOptString4;
                strOptString4 = strOptString;
            }
        } catch (Exception e13) {
            e = e13;
            strOptString = null;
            strOptString2 = null;
        }
        e.g(j5.a.f124275z, "tid_str: load");
        if (e(strOptString4, strOptString2, strOptString3, str)) {
            r();
            return;
        }
        this.f141599a = strOptString4;
        this.f141600b = strOptString2;
        this.f141601c = lValueOf.longValue();
        this.f141602d = strOptString3;
        this.f141603e = str;
    }

    private void r() {
        this.f141599a = "";
        this.f141600b = f();
        this.f141601c = System.currentTimeMillis();
        this.f141602d = p();
        this.f141603e = p();
        C1280a.f(f141590g, f141591h);
    }

    private void s() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f141599a);
            jSONObject.put("client_key", this.f141600b);
            jSONObject.put("timestamp", this.f141601c);
            jSONObject.put(f141595l, this.f141602d);
            jSONObject.put(f141596m, this.f141603e);
            C1280a.d(f141590g, f141591h, jSONObject.toString(), true);
        } catch (Exception e10) {
            e.d(e10);
        }
    }

    private void t() {
    }

    public void b() {
        e.g(j5.a.f124275z, "tid_str: del");
        r();
    }

    public void c(String str, String str2) {
        e.g(j5.a.f124275z, "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f141599a = str;
        this.f141600b = str2;
        this.f141601c = System.currentTimeMillis();
        s();
        t();
    }

    public String f() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public String h() {
        return this.f141600b;
    }

    public String i() {
        return this.f141599a;
    }

    public Long j() {
        return Long.valueOf(this.f141601c);
    }

    public String k() {
        return this.f141602d;
    }

    public String l() {
        return this.f141603e;
    }

    public boolean m() {
        return n();
    }

    public boolean n() {
        return TextUtils.isEmpty(this.f141599a) || TextUtils.isEmpty(this.f141600b) || TextUtils.isEmpty(this.f141602d) || TextUtils.isEmpty(this.f141603e);
    }
}
