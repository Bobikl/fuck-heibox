package com.tencent.qmsp.sdk.a;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f101679a = "Qp.RPT";

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f101680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f101681b;

        a(int i10, JSONObject jSONObject) {
            this.f101680a = i10;
            this.f101681b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.b(this.f101680a, this.f101681b);
        }
    }

    public static final class b implements com.tencent.qmsp.sdk.b.e {
        b() {
        }

        @Override // com.tencent.qmsp.sdk.b.e
        public void a(int i10, JSONObject jSONObject) {
            if (i10 == 161) {
                com.tencent.qmsp.sdk.f.g.a(f.f101679a, 1, String.format("ret: %d", 161));
            }
        }
    }

    public static void a(String str, int i10) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectA = d.a(3);
            if (a(jSONObjectA)) {
                try {
                    jSONObject2.put(e.a(15), jSONObjectA);
                    jSONObject2.put(e.a(16), new JSONObject().put("log", str));
                    jSONArray.put(jSONObject2);
                    jSONObject.put("arr", jSONArray);
                    com.tencent.qmsp.sdk.f.g.a(f101679a, 1, jSONObject2.toString());
                    com.tencent.qmsp.sdk.app.b.e().a(new a(i10, jSONObject));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    protected static boolean a(JSONObject jSONObject) {
        try {
            jSONObject.put(e.a(12), c.b());
            jSONObject.put(e.a(13), c.f());
            jSONObject.put(e.a(14), c.a());
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.tencent.qmsp.sdk.f.g.a(f101679a, 0, "Rpt: " + jSONObject);
        com.tencent.qmsp.sdk.b.g.b().a(3, com.tencent.qmsp.sdk.app.a.getAppID(), i10, jSONObject, new b());
    }
}
