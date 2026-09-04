package com.alipay.deviceid.module.x;

import android.content.Context;

/* JADX INFO: compiled from: AppInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f38344a = new j();

    private j() {
    }

    public static j a() {
        return f38344a;
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }
}
