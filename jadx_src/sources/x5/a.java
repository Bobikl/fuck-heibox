package x5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import z5.e;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final String A = "act_info";
    public static final String B = "UTF-8";
    public static final String C = "new_external_info==";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f141068m = "\"&";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f141069n = "&";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f141070o = "bizcontext=\"";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f141071p = "bizcontext=";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f141072q = "\"";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f141073r = "appkey";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f141074s = "ty";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f141075t = "sv";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f141076u = "an";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f141077v = "setting";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f141078w = "av";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f141079x = "sdk_start_time";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f141080y = "extInfo";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f141081z = "ap_link_token";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f141082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f141083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f141084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f141086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f141087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f141088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f141089h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f141090i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f141091j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ActivityInfo f141092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h5.b f141093l;

    /* JADX INFO: renamed from: x5.a$a, reason: collision with other inner class name */
    public static final class C1277a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<UUID, a> f141094a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final HashMap<String, a> f141095b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f141096c = "i_uuid_b_c";

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(f141096c);
            if (serializableExtra instanceof UUID) {
                return f141094a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f141095b.remove(str);
        }

        public static void c(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            f141094a.put(uuidRandomUUID, aVar);
            intent.putExtra(f141096c, uuidRandomUUID);
        }

        public static void d(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            f141095b.put(str, aVar);
        }
    }

    public a(Context context, String str, String str2) {
        String str3;
        this.f141082a = "";
        this.f141083b = "";
        this.f141084c = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.f141093l = new h5.b(context, zIsEmpty);
        String strJ = j(str, this.f141083b);
        this.f141085d = strJ;
        this.f141086e = SystemClock.elapsedRealtime();
        this.f141087f = l.Z();
        ActivityInfo activityInfoD = l.d(context);
        this.f141092k = activityInfoD;
        this.f141088g = str2;
        if (!zIsEmpty) {
            h5.a.d(this, h5.b.f119113l, "eptyp", str2 + "|" + strJ);
            if (activityInfoD != null) {
                str3 = activityInfoD.name + "|" + activityInfoD.launchMode;
            } else {
                str3 = "null";
            }
            h5.a.d(this, h5.b.f119113l, "actInfo", str3);
            h5.a.d(this, h5.b.f119113l, o0.P0, l.k(this));
            h5.a.d(this, h5.b.f119113l, SocializeProtocolConstants.PROTOCOL_KEY_VERSION, "5c4d8f1-clean");
        }
        try {
            this.f141084c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f141082a = packageInfo.versionName;
            this.f141083b = packageInfo.packageName;
        } catch (Exception e10) {
            e.d(e10);
        }
        if (!zIsEmpty) {
            h5.a.c(this, h5.b.f119113l, ak.aG + l.Z());
            h5.a.d(this, h5.b.f119113l, h5.b.Q, "" + SystemClock.elapsedRealtime());
            h5.a.b(context, this, str, this.f141085d);
        }
        if (zIsEmpty || !l5.a.d().G()) {
            return;
        }
        l5.a.d().l(this, this.f141084c, true, 2);
    }

    private String c(String str, String str2) {
        return str + e(new JSONObject()) + str2;
    }

    private String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (!TextUtils.isEmpty(strArrSplit[i10]) && strArrSplit[i10].startsWith(str3)) {
                return strArrSplit[i10];
            }
        }
        return null;
    }

    public static HashMap<String, String> f(a aVar) {
        HashMap<String, String> map = new HashMap<>();
        if (aVar != null) {
            map.put("sdk_ver", "15.8.11");
            map.put("app_name", aVar.f141083b);
            map.put("token", aVar.f141085d);
            map.put("call_type", aVar.f141088g);
            map.put("ts_api_invoke", String.valueOf(aVar.f141086e));
            z5.a.d(aVar, map);
        }
        return map;
    }

    private String i(String str) throws JSONException {
        return e(new JSONObject(str));
    }

    public static String j(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", l.b0(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    private String k(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z10 = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            jSONObject = new JSONObject(strSubstring2.substring(1, strSubstring2.length() - 1));
            z10 = true;
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strE = e(jSONObject);
        if (z10) {
            strE = "\"" + strE + "\"";
        }
        return str2 + strE + str3;
    }

    private String n(String str) {
        try {
            String strD = d(str, "&", f141071p);
            if (TextUtils.isEmpty(strD)) {
                str = str + "&" + c(f141071p, "");
            } else {
                int iIndexOf = str.indexOf(strD);
                str = str.substring(0, iIndexOf) + k(strD, f141071p, "") + str.substring(iIndexOf + strD.length());
            }
        } catch (Throwable th2) {
            h5.a.f(this, h5.b.f119113l, "fmt1", th2, str);
        }
        return str;
    }

    private String p(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", i(jSONObject.optString("bizcontext")));
            return C + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    private String r(String str) {
        try {
            String strD = d(str, f141068m, f141070o);
            if (TextUtils.isEmpty(strD)) {
                return str + "&" + c(f141070o, "\"");
            }
            if (!strD.endsWith("\"")) {
                strD = strD + "\"";
            }
            int iIndexOf = str.indexOf(strD);
            return str.substring(0, iIndexOf) + k(strD, f141070o, "\"") + str.substring(iIndexOf + strD.length());
        } catch (Throwable th2) {
            h5.a.f(this, h5.b.f119113l, "fmt2", th2, str);
            return str;
        }
    }

    private boolean u(String str) {
        return !str.contains(f141068m);
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f141081z, this.f141085d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static a w() {
        return null;
    }

    public Context a() {
        return this.f141084c;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(C)) {
            return p(str);
        }
        return u(str) ? n(str) : r(str);
    }

    public String e(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", j5.a.f124255f);
            }
            if (!jSONObject.has(f141074s)) {
                jSONObject.put(f141074s, "and_lite");
            }
            if (!jSONObject.has(f141075t)) {
                jSONObject.put(f141075t, "h.a.3.8.11");
            }
            if (!jSONObject.has(f141076u)) {
                jSONObject.put(f141076u, this.f141083b);
            }
            if (!jSONObject.has(f141078w)) {
                jSONObject.put(f141078w, this.f141082a);
            }
            if (!jSONObject.has(f141079x)) {
                jSONObject.put(f141079x, System.currentTimeMillis());
            }
            if (!jSONObject.has(f141080y)) {
                jSONObject.put(f141080y, v());
            }
            if (!jSONObject.has(A)) {
                if (this.f141092k != null) {
                    str = this.f141092k.name + "|" + this.f141092k.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put(A, str);
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            h5.a.f(this, h5.b.f119113l, "fmt3", th2, String.valueOf(jSONObject));
            e.d(th2);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public void g(boolean z10) {
        this.f141090i = z10;
    }

    public String h() {
        return this.f141083b;
    }

    public void l(boolean z10) {
        this.f141089h = z10;
    }

    public String m() {
        return this.f141082a;
    }

    public void o(boolean z10) {
        this.f141091j = z10;
    }

    public boolean q() {
        return this.f141090i;
    }

    public boolean s() {
        return this.f141089h;
    }

    public boolean t() {
        return this.f141091j;
    }
}
