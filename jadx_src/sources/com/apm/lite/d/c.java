package com.apm.lite.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.apm.lite.e;
import com.apm.lite.k.q;
import com.apm.lite.k.t;
import com.apm.lite.runtime.p;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f39885c = {"version_code", "manifest_version_code", CommonNetImpl.AID, "update_version_code"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f39886d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f39887e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f39888f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f39890b = new JSONObject();

    public c(Context context) {
        this.f39889a = context;
    }

    public static c a(Context context) {
        c cVar = new c(context);
        cVar.t(cVar.s());
        return cVar;
    }

    public static c b(Context context, long j10) {
        c cVarA;
        p pVarB = p.b();
        if (j10 == 0) {
            j10 = System.currentTimeMillis();
        }
        JSONObject jSONObjectD = pVarB.d(j10);
        if (jSONObjectD == null || jSONObjectD.length() == 0) {
            cVarA = a(e.m());
            cVarA.m();
            try {
                cVarA.s().put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            cVarA = new c(e.m());
        }
        h(cVarA);
        cVarA.l(jSONObjectD);
        return cVarA;
    }

    public static c c(c cVar) {
        e(cVar.s());
        return cVar;
    }

    public static void e(JSONObject jSONObject) {
        y(jSONObject);
        z(jSONObject);
    }

    public static boolean f() {
        if (f39887e == -1) {
            f39887e = u().contains("64") ? 1 : 0;
        }
        return f39887e == 1;
    }

    public static c g(Context context) {
        c cVarA = a(context);
        c(cVarA);
        h(cVarA);
        cVarA.m();
        cVarA.o();
        cVarA.q();
        return cVarA;
    }

    public static void h(c cVar) {
        if (cVar == null) {
            return;
        }
        i(cVar.s());
    }

    public static void i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        x(jSONObject);
        v(jSONObject);
        w(jSONObject);
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", e.h().a());
            jSONObject.put("os_version", k());
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str = Build.MODEL;
            String str2 = Build.BRAND;
            if (str == null) {
                str = str2;
            } else if (str2 != null && !str.contains(str2)) {
                str = str2 + ' ' + str;
            }
            jSONObject.put("device_model", str);
            jSONObject.put(ak.F, str2);
            jSONObject.put(ak.H, Build.MANUFACTURER);
            jSONObject.put("cpu_abi", u());
            Context contextM = e.m();
            String packageName = contextM.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i10 = applicationInfo.labelRes;
                jSONObject.put("display_name", i10 > 0 ? contextM.getString(i10) : contextM.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static boolean j() {
        if (f39888f == -1) {
            f39888f = u().contains("86") ? 1 : 0;
        }
        return f39888f == 1;
    }

    public static String k() {
        String str = Build.VERSION.RELEASE;
        if (str.contains(".")) {
            return str;
        }
        return str + ".0";
    }

    public static boolean n(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static boolean p(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0 || (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean r(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString(CommonNetImpl.AID);
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return Integer.parseInt(strOptString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    private void t(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 153);
            jSONObject.put("sdk_version_name", "0.0.1-rc.3");
        } catch (Exception unused) {
        }
    }

    private static String u() {
        if (f39886d == null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i10 >= strArr.length) {
                            break;
                        }
                        sb2.append(strArr[i10]);
                        if (i10 != strArr.length - 1) {
                            sb2.append(", ");
                        }
                        i10++;
                    }
                } else {
                    sb2 = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb2.toString())) {
                    f39886d = "unknown";
                }
                f39886d = sb2.toString();
            } catch (Exception e10) {
                q.g(e10);
                f39886d = "unknown";
            }
        }
        return f39886d;
    }

    private static void v(JSONObject jSONObject) {
        String str;
        try {
            DisplayMetrics displayMetrics = e.m().getResources().getDisplayMetrics();
            int i10 = displayMetrics.densityDpi;
            if (i10 == 120) {
                str = "ldpi";
            } else if (i10 != 240) {
                str = i10 != 320 ? "mdpi" : "xhdpi";
            } else {
                str = "hdpi";
            }
            jSONObject.put("density_dpi", i10);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused) {
        }
    }

    private static void w(JSONObject jSONObject) {
        try {
            String language = e.m().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(ak.N, language);
            }
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put("region", country);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put(ak.M, rawOffset);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0005, B:6:0x000d, B:16:0x0035, B:18:0x0040, B:19:0x0049, B:7:0x0011, B:10:0x001a, B:12:0x0024, B:13:0x0029, B:15:0x002f), top: B:22:0x0005 }] */
    private static void x(JSONObject jSONObject) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        try {
            if (com.apm.lite.k.d.f()) {
                str = "MIUI-";
            } else {
                if (!com.apm.lite.k.d.h()) {
                    String strA = com.apm.lite.k.d.a();
                    if (com.apm.lite.k.d.b(strA)) {
                        sb2.append("EMUI-");
                    }
                    if (!TextUtils.isEmpty(strA)) {
                        sb2.append(strA);
                        str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                    }
                    sb2.append(Build.VERSION.INCREMENTAL);
                    if (sb2.length() > 0) {
                        jSONObject.put("rom", sb2.toString());
                    }
                    jSONObject.put("rom_version", t.a());
                }
                str = "FLYME-";
            }
            sb2.append(str);
            sb2.append(Build.VERSION.INCREMENTAL);
            if (sb2.length() > 0) {
                jSONObject.put("rom", sb2.toString());
            }
            jSONObject.put("rom_version", t.a());
        } catch (Throwable unused) {
        }
    }

    private static void y(JSONObject jSONObject) {
        try {
            jSONObject.put(ak.Q, com.apm.lite.k.p.a(e.m()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static void z(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) e.m().getSystemService(g0.a.f118921e);
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public JSONObject d(Map<String, Object> map) {
        try {
            if (map == null) {
                return this.f39890b;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f39890b.has(entry.getKey())) {
                    this.f39890b.put(entry.getKey(), entry.getValue());
                }
            }
            for (String str : f39885c) {
                if (map.containsKey(str)) {
                    try {
                        this.f39890b.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused) {
                        this.f39890b.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f39890b.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused2) {
                }
            }
            if (map.containsKey("iid")) {
                this.f39890b.put("udid", map.get("iid"));
                this.f39890b.remove("iid");
            }
            if (map.containsKey("version_name")) {
                this.f39890b.put("app_version", map.get("version_name"));
                this.f39890b.remove("version_name");
            }
        } catch (Throwable unused3) {
        }
        return this.f39890b;
    }

    public JSONObject l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f39890b;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f39890b.put(next, jSONObject.opt(next));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return this.f39890b;
    }

    public JSONObject m() {
        return d(e.a().b());
    }

    public JSONObject o() {
        try {
            this.f39890b.put("device_id", e.h().a());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this.f39890b;
    }

    public JSONObject q() {
        try {
            long jH = e.a().h();
            if (jH > 0) {
                this.f39890b.put("user_id", jH);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this.f39890b;
    }

    public JSONObject s() {
        return this.f39890b;
    }
}
