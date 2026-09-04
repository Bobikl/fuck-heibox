package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DefconProcesser.java */
/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f104945a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f104946b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f104947c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f104948d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f104949e;

    /* JADX INFO: compiled from: DefconProcesser.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f104950a = new r();

        private a() {
        }
    }

    private r() {
        this.f104949e = 60000L;
    }

    public static r a() {
        return a.f104950a;
    }

    private void a(JSONObject jSONObject, boolean z10) {
        if (!z10 && jSONObject.has(d.f104707n)) {
            jSONObject.remove(d.f104707n);
        }
        if (jSONObject.has(d.L)) {
            jSONObject.remove(d.L);
        }
        if (jSONObject.has("error")) {
            jSONObject.remove("error");
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has(d.T)) {
            jSONObject.remove(d.T);
        }
        if (jSONObject.has(d.L)) {
            jSONObject.remove(d.L);
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    private JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", y.a().a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(d.f104709p, jCurrentTimeMillis);
            jSONObject.put(d.f104710q, jCurrentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", y.a().d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(d.f104709p, jCurrentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    public int a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    public void a(JSONObject jSONObject, Context context) {
        int iA = a(context);
        if (iA == 1) {
            a(jSONObject, true);
            i.a(context).b(false, true);
        } else {
            if (iA == 2) {
                jSONObject.remove(d.f104707n);
                try {
                    jSONObject.put(d.f104707n, b());
                } catch (Exception unused) {
                }
                a(jSONObject, true);
                i.a(context).b(false, true);
                return;
            }
            if (iA == 3) {
                a(jSONObject, false);
                i.a(context).b(false, true);
            }
        }
    }

    public void b(JSONObject jSONObject, Context context) {
        int iA = a(context);
        if (iA == 1) {
            if (jSONObject.has(d.L)) {
                jSONObject.remove(d.L);
            }
            if (jSONObject.has(d.f104707n)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(d.f104707n);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        if (jSONObject2.has(d.au)) {
                            jSONObject2.remove(d.au);
                        }
                        if (jSONObject2.has(d.av)) {
                            jSONObject2.remove(d.av);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            i.a(context).a(false, true);
            return;
        }
        if (iA == 2) {
            if (jSONObject.has(d.L)) {
                jSONObject.remove(d.L);
            }
            if (jSONObject.has(d.f104707n)) {
                jSONObject.remove(d.f104707n);
            }
            try {
                jSONObject.put(d.f104707n, c());
            } catch (Exception unused2) {
            }
            i.a(context).a(false, true);
            return;
        }
        if (iA == 3) {
            if (jSONObject.has(d.L)) {
                jSONObject.remove(d.L);
            }
            jSONObject.remove(d.f104707n);
            i.a(context).a(false, true);
        }
    }
}
