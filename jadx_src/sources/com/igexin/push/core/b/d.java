package com.igexin.push.core.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f63514b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f63515c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f63516a;

    public d(Context context) {
        if (context != null) {
            this.f63516a = context.getSharedPreferences("gx_msg_sp", 0);
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            if (jSONObject.length() < 150) {
                return;
            }
            boolean z10 = false;
            long j10 = Long.MAX_VALUE;
            String str = null;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                long j11 = jSONObject.getLong(next);
                if (j10 > j11) {
                    str = next;
                    j10 = j11;
                }
                if (j11 < System.currentTimeMillis() - com.max.heybox.hblog.f.f74520m) {
                    itKeys.remove();
                    z10 = true;
                }
            }
            if (z10 || str == null) {
                return;
            }
            jSONObject.remove(str);
        } catch (Throwable unused) {
        }
    }

    private void b(JSONObject jSONObject) {
        try {
            if (jSONObject.length() < 20) {
                return;
            }
            boolean z10 = false;
            long j10 = Long.MAX_VALUE;
            String str = null;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                long j11 = Long.parseLong(jSONObject.getJSONObject(next).getString("timestamp"));
                if (j10 > j11) {
                    str = next;
                    j10 = j11;
                }
                if (j11 < System.currentTimeMillis() - com.max.heybox.hblog.f.f74520m) {
                    itKeys.remove();
                    z10 = true;
                }
            }
            if (z10 || str == null) {
                return;
            }
            jSONObject.remove(str);
        } catch (Throwable unused) {
        }
    }

    public JSONObject a() {
        try {
            String string = this.f63516a.getString("taskIdList", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new JSONObject(string);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (this.f63516a == null || jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f63514b) {
            try {
                JSONObject jSONObjectB = b();
                if (jSONObjectB == null) {
                    jSONObjectB = new JSONObject();
                }
                if (jSONObjectB.length() > 0) {
                    b(jSONObjectB);
                }
                jSONObjectB.put(str, jSONObject);
                SharedPreferences.Editor editorEdit = this.f63516a.edit();
                editorEdit.putString("usfdl", jSONObjectB.toString());
                editorEdit.apply();
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a(String str) {
        if (this.f63516a != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObjectA = a();
                if (jSONObjectA != null && jSONObjectA.has(str)) {
                    com.igexin.a.a.c.b.a("sp task " + str + " already exists", new Object[0]);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public JSONObject b() {
        try {
            String string = this.f63516a.getString("usfdl", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new JSONObject(string);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b(String str) {
        if (this.f63516a == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f63515c) {
            try {
                JSONObject jSONObjectA = a();
                if (jSONObjectA == null) {
                    jSONObjectA = new JSONObject();
                }
                if (jSONObjectA.length() > 0) {
                    a(jSONObjectA);
                }
                jSONObjectA.put(str, System.currentTimeMillis());
                SharedPreferences.Editor editorEdit = this.f63516a.edit();
                editorEdit.putString("taskIdList", jSONObjectA.toString());
                editorEdit.apply();
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject c() {
        synchronized (f63514b) {
            try {
                String string = this.f63516a.getString("usfdl", "");
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
                    if (!jSONObject2.has("timestamp") || Long.parseLong(jSONObject2.getString("timestamp")) < System.currentTimeMillis() - com.max.heybox.hblog.f.f74520m) {
                        itKeys.remove();
                    }
                }
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public void c(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.f63516a.edit();
            editorEdit.putString("gx_vendor_token", str);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public void d() {
        synchronized (f63514b) {
            try {
                SharedPreferences sharedPreferences = this.f63516a;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("usfdl", "");
                    editorEdit.apply();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String e() {
        try {
            return this.f63516a.getString("gx_vendor_token", null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
