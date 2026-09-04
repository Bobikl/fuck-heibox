package com.apm.lite.runtime;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static JSONObject f40191a = new JSONObject();

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String strC = a.c(jSONObject);
            File file = new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/configCrash/configNative");
            if (strC != null) {
                JSONObject jSONObject2 = new JSONObject(strC);
                f40191a = jSONObject2;
                com.apm.lite.k.i.m(file, g(jSONObject2), false);
            } else {
                f40191a = new JSONObject();
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
    }

    public static boolean b(String str, f fVar) {
        if (f40191a == null) {
            return false;
        }
        if (fVar == null) {
            fVar = new f();
        }
        JSONObject jSONObjectOptJSONObject = f40191a.optJSONObject(str);
        if (jSONObjectOptJSONObject == null || c(jSONObjectOptJSONObject.optJSONArray("disable"), fVar)) {
            return false;
        }
        return c(jSONObjectOptJSONObject.optJSONArray("enable"), fVar);
    }

    private static boolean c(JSONArray jSONArray, f fVar) {
        if (com.apm.lite.k.l.f(jSONArray)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (d(jSONObjectOptJSONObject, fVar)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(JSONObject jSONObject, f fVar) {
        StringBuilder sb2;
        Iterator<String> itKeys = jSONObject.keys();
        boolean z10 = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                z10 = true;
                if (next.startsWith("header_")) {
                    if (!e(jSONObject.optJSONObject(next), fVar.b(next.substring(7)))) {
                        sb2 = new StringBuilder();
                        sb2.append("not match ");
                        sb2.append(next);
                        com.apm.lite.k.q.a(sb2.toString());
                        return false;
                    }
                } else if (!next.startsWith("java_")) {
                    com.apm.lite.k.q.a("no rules match " + next);
                } else if (!e(jSONObject.optJSONObject(next), fVar.a(next.substring(5)))) {
                    sb2 = new StringBuilder();
                    sb2.append("not match ");
                    sb2.append(next);
                    com.apm.lite.k.q.a(sb2.toString());
                    return false;
                }
            }
        }
        return z10;
    }

    private static boolean e(JSONObject jSONObject, Object obj) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray.length() == 0) {
            return false;
        }
        String strOptString = jSONObject.optString("op");
        String strValueOf = String.valueOf(obj);
        if (strOptString.equals(ContainerUtils.KEY_VALUE_DELIMITER)) {
            return strValueOf.equals(String.valueOf(jSONArrayOptJSONArray.opt(0)));
        }
        if (strOptString.equals("in")) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                if (String.valueOf(jSONArrayOptJSONArray.opt(i10)).equals(strValueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static JSONArray f(JSONArray jSONArray, f fVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (com.apm.lite.k.l.f(jSONArray)) {
            return jSONArray2;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (d(jSONObjectOptJSONObject, fVar)) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    public static JSONObject g(JSONObject jSONObject) {
        StringBuilder sb2;
        String str;
        Iterator<String> itKeys = jSONObject.keys();
        f fVar = new f();
        JSONObject jSONObject2 = new JSONObject();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!"configType".equals(next)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject == null) {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", new IllegalArgumentException("err config with key: " + next));
                } else {
                    if (c(jSONObjectOptJSONObject.optJSONArray("disable"), fVar)) {
                        sb2 = new StringBuilder();
                        str = "match diable ";
                    } else {
                        JSONArray jSONArrayF = f(jSONObjectOptJSONObject.optJSONArray("enable"), fVar);
                        if (com.apm.lite.k.l.f(jSONArrayF)) {
                            sb2 = new StringBuilder();
                            str = "not match ";
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", jSONArrayF));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb2.append(str);
                    sb2.append(next);
                    com.apm.lite.k.q.a(sb2.toString());
                }
            }
        }
        return jSONObject2;
    }
}
