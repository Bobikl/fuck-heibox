package com.umeng.socialize.a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: UMAppInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f106086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f106087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f106088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f106089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f106090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f106091f;

    public f(Object obj, Object obj2) {
        String strValueOf;
        PackageManager packageManager = (PackageManager) obj;
        PackageInfo packageInfo = (PackageInfo) obj2;
        this.f106086a = packageInfo.packageName;
        this.f106088c = packageInfo.versionName;
        this.f106089d = packageInfo.firstInstallTime;
        this.f106090e = packageInfo.lastUpdateTime;
        this.f106091f = a(packageInfo);
        try {
            strValueOf = String.valueOf(packageManager.getApplicationLabel(packageInfo.applicationInfo));
        } catch (Throwable unused) {
            strValueOf = "";
        }
        this.f106087b = strValueOf;
    }

    private int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            return -1;
        }
        int i10 = applicationInfo.flags;
        return ((i10 & 1) == 0 && (i10 & 128) == 0) ? 1 : 0;
    }
}
