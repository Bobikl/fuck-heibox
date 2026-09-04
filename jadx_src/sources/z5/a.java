package z5;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f141849a = "ap_req";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f141850b = "ap_args";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f141851c = "ap_resp";

    public static HashMap<String, String> a(x5.a aVar) {
        HashMap<String, String> map = new HashMap<>();
        try {
            z4.a aVarC = c();
            JSONObject jSONObject = new JSONObject();
            Context contextA = aVar != null ? aVar.a() : null;
            if (contextA == null) {
                contextA = x5.b.e().c().getApplicationContext();
            }
            String strL = l.l(aVar, contextA);
            String strC = b6.b.c(aVar, contextA);
            jSONObject.put("ap_q", aVarC != null ? aVarC.a() : "");
            jSONObject.put(x5.a.f141081z, aVar != null ? aVar.f141085d : "");
            jSONObject.put("u_pd", String.valueOf(l.Z()));
            jSONObject.put("u_lk", String.valueOf(l.S(l.D())));
            jSONObject.put("u_pi", String.valueOf(aVar != null ? aVar.f141088g : lg.a.f131412e));
            jSONObject.put("u_fu", strL);
            jSONObject.put("u_oi", strC);
            map.put(f141849a, jSONObject.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVarC != null ? aVarC.a() : "");
            sb2.append("|");
            sb2.append(strL);
            h5.a.d(aVar, h5.b.f119113l, "ap_q", sb2.toString());
        } catch (Exception e10) {
            h5.a.e(aVar, h5.b.f119113l, "APMEx1", e10);
        }
        return map;
    }

    public static JSONObject b(x5.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(f141851c);
        try {
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            return new JSONObject(strOptString);
        } catch (JSONException e10) {
            h5.a.e(aVar, h5.b.f119113l, "APMEx2", e10);
            return null;
        }
    }

    public static z4.a c() {
        try {
            try {
                return b5.a.c("NP", System.currentTimeMillis(), new b5.c(x5.b.e().d()), (short) h5.a.c.a(x5.b.e().c()), new b5.f());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return b5.a.d();
        }
    }

    public static void d(x5.a aVar, HashMap<String, String> map) {
        JSONObject jSONObjectF = l5.a.d().f();
        if (map == null || jSONObjectF == null) {
            return;
        }
        h5.a.d(aVar, h5.b.f119113l, "ap_r", jSONObjectF.optString("ap_r"));
        map.putAll(l.p(jSONObjectF));
    }

    public static void e(x5.a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt(f141850b, jSONObject2);
        } catch (JSONException e10) {
            h5.a.e(aVar, h5.b.f119113l, "APMEx2", e10);
        }
    }
}
