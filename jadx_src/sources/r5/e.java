package r5;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.y;
import org.apache.tools.ant.taskdefs.optional.ejb.g;
import org.json.JSONException;
import org.json.JSONObject;
import z5.k;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f138803c = "msp-gzip";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f138804d = "Msp-Param";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f138805e = "Operation-Type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f138806f = "content-type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f138807g = "Version";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f138808h = "AppId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f138809i = "des-mode";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f138810j = "namespace";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f138811k = "api_name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f138812l = "api_version";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f138813m = "data";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f138814n = "params";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f138815o = "public_key";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f138816p = "device";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f138817q = "action";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f138818r = "type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f138819s = "method";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f138820a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f138821b = true;

    public static String a(p5.a.b bVar, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (bVar == null || str == null || (map = bVar.f138164a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
    }

    public static JSONObject g(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has("params")) {
                return false;
            }
            String strOptString = jSONObject.getJSONObject("params").optString(f138815o, null);
            if (TextUtils.isEmpty(strOptString)) {
                return false;
            }
            l5.b.e(strOptString);
            return true;
        } catch (JSONException e10) {
            z5.e.d(e10);
            return false;
        }
    }

    public static boolean m(p5.a.b bVar) {
        return Boolean.valueOf(a(bVar, f138803c)).booleanValue();
    }

    public String b(x5.a aVar) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("device", Build.MODEL);
        map.put("namespace", "com.alipay.mobilecashier");
        map.put("api_name", "com.alipay.mcpay");
        map.put(f138812l, n());
        return d(aVar, map, new HashMap<>());
    }

    public String c(x5.a aVar, String str, JSONObject jSONObject) {
        x5.b bVarE = x5.b.e();
        y5.a aVarA = y5.a.a(bVarE.c());
        JSONObject jSONObjectA = z5.d.a(new JSONObject(), jSONObject);
        try {
            jSONObjectA.put(j5.b.f124279d, str);
            jSONObjectA.put("tid", aVarA.i());
            jSONObjectA.put(j5.b.f124277b, bVarE.a().d(aVar, aVarA, o()));
            jSONObjectA.put(j5.b.f124280e, l.y(aVar, bVarE.c(), f5.a.f118751d, false));
            jSONObjectA.put(j5.b.f124281f, l.e0(bVarE.c()));
            jSONObjectA.put(j5.b.f124283h, j5.a.f124255f);
            jSONObjectA.put("utdid", bVarE.d());
            jSONObjectA.put(j5.b.f124285j, aVarA.h());
            jSONObjectA.put(j5.b.f124286k, l5.b.f(bVarE.c()));
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, "BodyErr", th2);
            z5.e.d(th2);
        }
        return jSONObjectA.toString();
    }

    public String d(x5.a aVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public Map<String, String> e(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put(f138803c, String.valueOf(z10));
        map.put(f138805e, "alipay.msp.cashier.dispatch.bytes");
        map.put("content-type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        map.put(f138807g, g.a.f134950d);
        map.put(f138808h, "TAOBAO");
        map.put(f138804d, a.a(str));
        map.put(f138809i, "CBC");
        return map;
    }

    public abstract JSONObject f() throws JSONException;

    public b h(x5.a aVar, Context context) throws Throwable {
        return i(aVar, context, "");
    }

    public b i(x5.a aVar, Context context, String str) throws Throwable {
        return j(aVar, context, str, k.b(context));
    }

    public b j(x5.a aVar, Context context, String str, String str2) throws Throwable {
        return k(aVar, context, str, str2, true);
    }

    public b k(x5.a aVar, Context context, String str, String str2, boolean z10) throws Throwable {
        z5.e.g(j5.a.f124275z, "Packet: " + str2);
        c cVar = new c(this.f138821b);
        b bVar = new b(b(aVar), c(aVar, str, f()));
        Map<String, String> mapE = e(false, str);
        d dVarD = cVar.d(bVar, this.f138820a, mapE.get("iSr"));
        p5.a.b bVarB = p5.a.b(context, new p5.a.C1252a(str2, e(dVarD.b(), str), dVarD.a()));
        if (bVarB == null) {
            throw new RuntimeException("Response is null.");
        }
        b bVarC = cVar.c(new d(m(bVarB), bVarB.f138166c), mapE.get("iSr"));
        return (bVarC != null && l(bVarC.b()) && z10) ? k(aVar, context, str, str2, false) : bVarC;
    }

    public String n() {
        return y.VERSION;
    }

    public abstract boolean o();
}
