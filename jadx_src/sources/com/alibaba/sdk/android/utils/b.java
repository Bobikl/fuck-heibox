package com.alibaba.sdk.android.utils;

import android.util.Log;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f38041b = false;

    public static void a(String str, String str2) {
        if (f38041b) {
            Log.d(str, str2);
        }
    }

    public static void setLogEnabled(boolean z10) {
        f38041b = z10;
    }
}
