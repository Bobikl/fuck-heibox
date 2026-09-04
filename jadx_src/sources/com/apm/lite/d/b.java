package com.apm.lite.d;

import android.text.TextUtils;
import com.apm.lite.CrashType;
import com.apm.lite.k.i;
import com.apm.lite.k.l;
import com.apm.lite.k.q;
import com.apm.lite.k.v;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<com.apm.lite.d> f39883a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<Integer, com.apm.lite.d> f39884b = new ConcurrentHashMap<>();

    public interface a {
        void a(JSONObject jSONObject);
    }

    public static File a(File file) {
        return new File(file, "all_data.json");
    }

    public static String b(Object obj) {
        for (com.apm.lite.d dVar : f39883a) {
            if (dVar != null && dVar.j(obj)) {
                return dVar.k();
            }
        }
        return null;
    }

    public static JSONArray c() {
        com.apm.lite.d next;
        JSONArray jSONArray = new JSONArray();
        Iterator<com.apm.lite.d> it = f39883a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.n());
        }
        return jSONArray;
    }

    public static JSONArray d(String str) {
        com.apm.lite.d next;
        JSONArray jSONArray = new JSONArray();
        String[] strArrSplit = str.split("\n");
        Iterator<com.apm.lite.d> it = f39883a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (com.apm.lite.runtime.a.i(next.k())) {
                JSONArray jSONArrayD = next.d(strArrSplit);
                if (!l.f(jSONArrayD)) {
                    jSONArray.put(next.f(CrashType.ANR, jSONArrayD));
                }
            }
        }
        return jSONArray;
    }

    public static JSONArray e(String str, String str2, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("header")) != null) {
                String strValueOf = String.valueOf(jSONObjectOptJSONObject.opt(CommonNetImpl.AID));
                if (com.apm.lite.runtime.a.k(strValueOf)) {
                    try {
                        String strL = com.apm.lite.d.l(strValueOf);
                        if (!TextUtils.isEmpty(strL)) {
                            jSONObjectOptJSONObject.put("x-auth-token", strL);
                        }
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("package"))) {
                        jSONArray2.put(jSONObjectOptJSONObject2);
                        break;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("so_list");
                    if (!l.f(jSONArrayOptJSONArray)) {
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                            if (str.contains(jSONArrayOptJSONArray.optString(i11))) {
                                jSONArray2.put(jSONObjectOptJSONObject2);
                                break;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return jSONArray2;
    }

    public static JSONArray f(Throwable th2, Thread thread, File file) {
        com.apm.lite.d next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTraceElementArrT = v.t(th2);
        Iterator<com.apm.lite.d> it = f39883a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (com.apm.lite.runtime.a.g(next.k())) {
                JSONArray jSONArrayC = next.c(stackTraceElementArrT, th2);
                if (!l.f(jSONArrayC)) {
                    jSONArray.put(next.f(CrashType.JAVA, jSONArrayC));
                }
            } else {
                q.a("not enable javaCrash aid: " + next.k());
            }
        }
        if (l.f(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                i.l(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    public static void g(com.apm.lite.d dVar) {
        f39883a.add(dVar);
        if (dVar.p()) {
            f39884b.put(Integer.valueOf(bb.c.f.Y), dVar);
        }
    }

    public static void h(File file, CrashType crashType) {
        com.apm.lite.d next;
        if (file == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<com.apm.lite.d> it = f39883a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (com.apm.lite.runtime.a.k(next.k())) {
                jSONArray.put(next.e(crashType));
            } else {
                q.a("not enable NativeCrash aid: " + next.k());
            }
        }
        if (l.f(jSONArray)) {
            return;
        }
        try {
            i.l(new File(file, "all_data.json"), jSONArray, false);
        } catch (Exception unused) {
        }
    }

    public static void i(JSONObject jSONObject, JSONArray jSONArray, a aVar) {
        JSONObject jSONObjectOptJSONObject;
        q.a("uploadFromFile with allData " + jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length() && (jSONObjectOptJSONObject = jSONArray.optJSONObject(i10)) != null; i10++) {
            if (l.a(jSONObjectOptJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                com.apm.lite.d.a.u(jSONObject2, jSONObject);
                com.apm.lite.d.a.u(jSONObject2, jSONObjectOptJSONObject);
                aVar.a(jSONObject2);
            } else {
                try {
                    String strL = com.apm.lite.d.l(l.i(jSONObjectOptJSONObject, "header", CommonNetImpl.AID));
                    if (!TextUtils.isEmpty(strL)) {
                        JSONObject jSONObject3 = (JSONObject) jSONObjectOptJSONObject.remove("header");
                        jSONObject3.put("x-auth-token", strL);
                        jSONObjectOptJSONObject.put("header", jSONObject3);
                    }
                } catch (Throwable unused) {
                }
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        com.apm.lite.d.a.u(jSONObject4, jSONObject);
        try {
            jSONObject4.put("all_data", jSONArray2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        aVar.a(jSONObject4);
    }

    public static JSONArray j() {
        com.apm.lite.d next;
        JSONArray jSONArray = new JSONArray();
        Iterator<com.apm.lite.d> it = f39883a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.e(null));
        }
        return jSONArray;
    }

    public static int k() {
        return f39883a.size();
    }

    public static List<String> l() {
        com.apm.lite.d next;
        ArrayList arrayList = new ArrayList();
        Iterator<com.apm.lite.d> it = f39883a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next.k());
        }
        return arrayList;
    }
}
