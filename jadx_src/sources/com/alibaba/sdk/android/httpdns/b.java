package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f37897a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f17a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f37898b = true;

    static void a(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("httpdns_config_enable", 0);
            f37897a = sharedPreferences;
            if (sharedPreferences != null) {
                f17a = sharedPreferences.getBoolean("key_enable", true);
            }
        }
    }

    public static void a(boolean z10) {
        f17a = z10;
        SharedPreferences sharedPreferences = f37897a;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("key_enable", z10);
            editorEdit.apply();
        }
    }

    public static boolean a() {
        return f17a && f37898b;
    }

    public static void b(boolean z10) {
        f37898b = z10;
    }
}
