package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f106774a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f140a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f141a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    String f142a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Map<String, a> f143a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private Context f144a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f106776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f106777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f106778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f106779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f106780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f106781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f106782h;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f146a = true;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        public boolean f147b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106775a = 1;

        public a(Context context) {
            this.f144a = context;
        }

        public static a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(context);
                aVar.f145a = jSONObject.getString("appId");
                aVar.f106776b = jSONObject.getString("appToken");
                aVar.f106777c = jSONObject.getString("regId");
                aVar.f106778d = jSONObject.getString("regSec");
                aVar.f106780f = jSONObject.getString("devId");
                aVar.f106779e = jSONObject.getString("vName");
                aVar.f146a = jSONObject.getBoolean("valid");
                aVar.f147b = jSONObject.getBoolean("paused");
                aVar.f106775a = jSONObject.getInt("envType");
                aVar.f106781g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.a(th2);
                return null;
            }
        }

        private String a() {
            Context context = this.f144a;
            return com.xiaomi.push.g.m393a(context, context.getPackageName());
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f145a);
                jSONObject.put("appToken", aVar.f106776b);
                jSONObject.put("regId", aVar.f106777c);
                jSONObject.put("regSec", aVar.f106778d);
                jSONObject.put("devId", aVar.f106780f);
                jSONObject.put("vName", aVar.f106779e);
                jSONObject.put("valid", aVar.f146a);
                jSONObject.put("paused", aVar.f147b);
                jSONObject.put("envType", aVar.f106775a);
                jSONObject.put("regResource", aVar.f106781g);
                return jSONObject.toString();
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.a(th2);
                return null;
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public void m124a() {
            b.a(this.f144a).edit().clear().commit();
            this.f145a = null;
            this.f106776b = null;
            this.f106777c = null;
            this.f106778d = null;
            this.f106780f = null;
            this.f106779e = null;
            this.f146a = false;
            this.f147b = false;
            this.f106782h = null;
            this.f106775a = 1;
        }

        public void a(int i10) {
            this.f106775a = i10;
        }

        public void a(String str, String str2) {
            this.f106777c = str;
            this.f106778d = str2;
            this.f106780f = com.xiaomi.push.i.h(this.f144a);
            this.f106779e = a();
            this.f146a = true;
        }

        public void a(String str, String str2, String str3) {
            this.f145a = str;
            this.f106776b = str2;
            this.f106781g = str3;
            SharedPreferences.Editor editorEdit = b.a(this.f144a).edit();
            editorEdit.putString("appId", this.f145a);
            editorEdit.putString("appToken", str2);
            editorEdit.putString("regResource", str3);
            editorEdit.commit();
        }

        public void a(boolean z10) {
            this.f147b = z10;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m125a() {
            return m126a(this.f145a, this.f106776b);
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m126a(String str, String str2) {
            boolean zEquals = TextUtils.equals(this.f145a, str);
            boolean zEquals2 = TextUtils.equals(this.f106776b, str2);
            boolean z10 = !TextUtils.isEmpty(this.f106777c);
            boolean z11 = !TextUtils.isEmpty(this.f106778d);
            boolean z12 = TextUtils.isEmpty(com.xiaomi.push.i.b(this.f144a)) || TextUtils.equals(this.f106780f, com.xiaomi.push.i.h(this.f144a)) || TextUtils.equals(this.f106780f, com.xiaomi.push.i.g(this.f144a));
            boolean z13 = zEquals && zEquals2 && z10 && z11 && z12;
            if (!z13) {
                com.xiaomi.channel.commonutils.logger.b.e(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(zEquals), Boolean.valueOf(zEquals2), Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)));
            }
            return z13;
        }

        public void b() {
            this.f146a = false;
            b.a(this.f144a).edit().putBoolean("valid", this.f146a).commit();
        }

        public void b(String str, String str2, String str3) {
            this.f106777c = str;
            this.f106778d = str2;
            this.f106780f = com.xiaomi.push.i.h(this.f144a);
            this.f106779e = a();
            this.f146a = true;
            this.f106782h = str3;
            SharedPreferences.Editor editorEdit = b.a(this.f144a).edit();
            editorEdit.putString("regId", str);
            editorEdit.putString("regSec", str2);
            editorEdit.putString("devId", this.f106780f);
            editorEdit.putString("vName", a());
            editorEdit.putBoolean("valid", true);
            editorEdit.putString("appRegion", str3);
            editorEdit.commit();
        }

        public void c(String str, String str2, String str3) {
            this.f145a = str;
            this.f106776b = str2;
            this.f106781g = str3;
        }
    }

    private b(Context context) {
        this.f140a = context;
        c();
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static b m111a(Context context) {
        if (f106774a == null) {
            synchronized (b.class) {
                if (f106774a == null) {
                    f106774a = new b(context);
                }
            }
        }
        return f106774a;
    }

    private void c() {
        this.f141a = new a(this.f140a);
        this.f143a = new HashMap();
        SharedPreferences sharedPreferencesA = a(this.f140a);
        this.f141a.f145a = sharedPreferencesA.getString("appId", null);
        this.f141a.f106776b = sharedPreferencesA.getString("appToken", null);
        this.f141a.f106777c = sharedPreferencesA.getString("regId", null);
        this.f141a.f106778d = sharedPreferencesA.getString("regSec", null);
        this.f141a.f106780f = sharedPreferencesA.getString("devId", null);
        if (!TextUtils.isEmpty(this.f141a.f106780f) && com.xiaomi.push.i.a(this.f141a.f106780f)) {
            this.f141a.f106780f = com.xiaomi.push.i.h(this.f140a);
            sharedPreferencesA.edit().putString("devId", this.f141a.f106780f).commit();
        }
        this.f141a.f106779e = sharedPreferencesA.getString("vName", null);
        this.f141a.f146a = sharedPreferencesA.getBoolean("valid", true);
        this.f141a.f147b = sharedPreferencesA.getBoolean("paused", false);
        this.f141a.f106775a = sharedPreferencesA.getInt("envType", 1);
        this.f141a.f106781g = sharedPreferencesA.getString("regResource", null);
        this.f141a.f106782h = sharedPreferencesA.getString("appRegion", null);
    }

    public int a() {
        return this.f141a.f106775a;
    }

    public a a(String str) {
        if (this.f143a.containsKey(str)) {
            return this.f143a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences sharedPreferencesA = a(this.f140a);
        if (!sharedPreferencesA.contains(str2)) {
            return null;
        }
        a aVarA = a.a(this.f140a, sharedPreferencesA.getString(str2, ""));
        this.f143a.put(str2, aVarA);
        return aVarA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m112a() {
        return this.f141a.f145a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m113a() {
        this.f141a.m124a();
    }

    public void a(int i10) {
        this.f141a.a(i10);
        a(this.f140a).edit().putInt("envType", i10).commit();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m114a(String str) {
        SharedPreferences.Editor editorEdit = a(this.f140a).edit();
        editorEdit.putString("vName", str);
        editorEdit.commit();
        this.f141a.f106779e = str;
    }

    public void a(String str, a aVar) {
        this.f143a.put(str, aVar);
        a(this.f140a).edit().putString("hybrid_app_info_" + str, a.a(aVar)).commit();
    }

    public void a(String str, String str2, String str3) {
        this.f141a.a(str, str2, str3);
    }

    public void a(boolean z10) {
        this.f141a.a(z10);
        a(this.f140a).edit().putBoolean("paused", z10).commit();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m115a() {
        Context context = this.f140a;
        return !TextUtils.equals(com.xiaomi.push.g.m393a(context, context.getPackageName()), this.f141a.f106779e);
    }

    public boolean a(String str, String str2) {
        return this.f141a.m126a(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m116a(String str, String str2, String str3) {
        a aVarA = a(str3);
        return aVarA != null && TextUtils.equals(str, aVarA.f145a) && TextUtils.equals(str2, aVarA.f106776b);
    }

    public String b() {
        return this.f141a.f106776b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m117b() {
        this.f141a.b();
    }

    public void b(String str) {
        this.f143a.remove(str);
        a(this.f140a).edit().remove("hybrid_app_info_" + str).commit();
    }

    public void b(String str, String str2, String str3) {
        this.f141a.b(str, str2, str3);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m118b() {
        if (this.f141a.m125a()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("Don't send message before initialization succeeded!");
        return false;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public String m119c() {
        return this.f141a.f106777c;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m120c() {
        return this.f141a.m125a();
    }

    public String d() {
        return this.f141a.f106778d;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m121d() {
        return (TextUtils.isEmpty(this.f141a.f145a) || TextUtils.isEmpty(this.f141a.f106776b) || TextUtils.isEmpty(this.f141a.f106777c) || TextUtils.isEmpty(this.f141a.f106778d)) ? false : true;
    }

    public String e() {
        return this.f141a.f106781g;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m122e() {
        return this.f141a.f147b;
    }

    public String f() {
        return this.f141a.f106782h;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public boolean m123f() {
        return !this.f141a.f146a;
    }
}
