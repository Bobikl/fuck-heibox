package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63056a = "aegis";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f63057b;

    public static int a(String str, int i10, Context context) {
        return b(context).getInt(str, i10);
    }

    public static long a(String str, long j10, Context context) {
        return b(context).getLong(str, j10);
    }

    public static String a(String str, String str2, Context context) {
        return b(context).getString(str, str2);
    }

    public static void a(Context context) {
        b(context).edit().clear().apply();
    }

    public static void a(String str, Context context) {
        b(context).edit().remove(str).apply();
    }

    public static synchronized SharedPreferences b(Context context) {
        if (f63057b == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                f63057b = context.createDeviceProtectedStorageContext().getSharedPreferences(f63056a, 0);
            } else {
                f63057b = context.getApplicationContext().getSharedPreferences(f63056a, 0);
            }
        }
        return f63057b;
    }

    public static void b(String str, int i10, Context context) {
        b(context).edit().putInt(str, i10).apply();
    }

    public static void b(String str, long j10, Context context) {
        b(context).edit().putLong(str, j10).apply();
    }

    public static void b(String str, String str2, Context context) {
        b(context).edit().putString(str, str2).apply();
    }
}
