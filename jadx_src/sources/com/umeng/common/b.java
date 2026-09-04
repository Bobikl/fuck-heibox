package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* JADX INFO: compiled from: SPHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f105039a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f105040b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f105041c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f105042d = "mobclick_agent_user_";

    /* JADX INFO: compiled from: SPHelper.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f105043a = new b();

        private a() {
        }
    }

    public static synchronized b a(Context context) {
        if (f105040b == null && context != null) {
            f105040b = context.getApplicationContext();
        }
        if (f105040b != null) {
            f105041c = context.getPackageName();
        }
        return a.f105043a;
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) ? "" : sharedPreferences.getString(str2, "");
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
        editorEdit.remove("debugkey");
        editorEdit.remove("period");
        editorEdit.remove(AnalyticsConfig.RTD_START_TIME);
        editorEdit.clear();
        editorEdit.commit();
    }

    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    private SharedPreferences e() {
        Context context = f105040b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f105042d + f105041c, 0);
    }

    public void a(int i10) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105040b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i10).commit();
        }
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105040b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = e().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    public String[] a() {
        SharedPreferences sharedPreferencesE = e();
        if (sharedPreferencesE == null) {
            return null;
        }
        String string = sharedPreferencesE.getString("au_p", null);
        String string2 = sharedPreferencesE.getString("au_u", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new String[]{string, string2};
    }

    public void b() {
        SharedPreferences sharedPreferencesE = e();
        if (sharedPreferencesE != null) {
            sharedPreferencesE.edit().remove("au_p").remove("au_u").commit();
        }
    }

    public String c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105040b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    public int d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105040b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }
}
