package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: compiled from: SharedPreferenceManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f59967d = "shared_msg_sdk";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f59968e = "hasDefaultChannelCreated";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f59969f = "lastUpLoadInfoSDKVersionName";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f59970g = "lastUploadInfoUniqueID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f59971h = "decryptTag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f59972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f59973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f59974c;

    /* JADX INFO: compiled from: SharedPreferenceManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static f f59975a = new f();

        private b() {
        }
    }

    private f() {
        this.f59974c = new Object();
        Context contextN = com.heytap.mcssdk.d.P().N();
        if (contextN != null) {
            this.f59972a = j(contextN);
        }
        Context context = this.f59972a;
        if (context != null) {
            this.f59973b = context.getSharedPreferences(f59967d, 0);
        }
    }

    public static f b() {
        return b.f59975a;
    }

    private SharedPreferences i() {
        Context context;
        SharedPreferences sharedPreferences = this.f59973b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.f59974c) {
            SharedPreferences sharedPreferences2 = this.f59973b;
            if (sharedPreferences2 != null || (context = this.f59972a) == null) {
                return sharedPreferences2;
            }
            SharedPreferences sharedPreferences3 = context.getSharedPreferences(f59967d, 0);
            this.f59973b = sharedPreferences3;
            return sharedPreferences3;
        }
    }

    private Context j(Context context) {
        boolean zB = com.heytap.mcssdk.utils.a.b();
        e.a("fbeVersion is " + zB);
        return (!zB || Build.VERSION.SDK_INT < 24) ? context.getApplicationContext() : context.createDeviceProtectedStorageContext();
    }

    public String a() {
        SharedPreferences sharedPreferencesI = i();
        return sharedPreferencesI != null ? sharedPreferencesI.getString(f59971h, "DES") : "DES";
    }

    public int c(String str) {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            return sharedPreferencesI.getInt(str, 0);
        }
        return 0;
    }

    public int d(String str, int i10) {
        SharedPreferences sharedPreferencesI = i();
        return sharedPreferencesI != null ? sharedPreferencesI.getInt(str, i10) : i10;
    }

    public String e() {
        SharedPreferences sharedPreferencesI = i();
        return sharedPreferencesI != null ? sharedPreferencesI.getString(f59970g, "") : "";
    }

    public String f() {
        SharedPreferences sharedPreferencesI = i();
        return sharedPreferencesI != null ? sharedPreferencesI.getString(f59969f, "") : "";
    }

    public long g(String str) {
        SharedPreferences sharedPreferencesI = i();
        return sharedPreferencesI != null ? sharedPreferencesI.getLong(str, x9.a.f141100b.longValue()) : x9.a.f141100b.longValue();
    }

    public long h(String str, long j10) {
        SharedPreferences sharedPreferencesI = i();
        return sharedPreferencesI != null ? sharedPreferencesI.getLong(str, j10) : j10;
    }

    public boolean k() {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            return sharedPreferencesI.getBoolean(f59968e, false);
        }
        return false;
    }

    public void l(String str) {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            sharedPreferencesI.edit().putString(f59971h, str).commit();
        }
    }

    public void m(String str) {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            sharedPreferencesI.edit().putString(f59970g, str).commit();
        }
    }

    public void n() {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            sharedPreferencesI.edit().putString(f59969f, gg.a.f119052f).commit();
        }
    }

    public void o(boolean z10) {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            sharedPreferencesI.edit().putBoolean(f59968e, z10).commit();
        }
    }

    public void p(String str, int i10) {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesI.edit();
            editorEdit.putInt(str, i10);
            editorEdit.apply();
        }
    }

    public void q(String str, long j10) {
        SharedPreferences sharedPreferencesI = i();
        if (sharedPreferencesI != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesI.edit();
            editorEdit.putLong(str, j10);
            editorEdit.apply();
        }
    }
}
