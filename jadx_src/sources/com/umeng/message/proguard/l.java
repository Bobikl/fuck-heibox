package com.umeng.message.proguard;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f105819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f105820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f105821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f105822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f105823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f105824f;

    public l(Object obj, Object obj2) {
        String strValueOf;
        PackageManager packageManager = (PackageManager) obj;
        PackageInfo packageInfo = (PackageInfo) obj2;
        this.f105819a = packageInfo.packageName;
        this.f105821c = packageInfo.versionName;
        this.f105822d = packageInfo.firstInstallTime;
        this.f105823e = packageInfo.lastUpdateTime;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        int i10 = 0;
        if (applicationInfo == null) {
            i10 = -1;
        } else {
            int i11 = applicationInfo.flags;
            if ((i11 & 1) == 0 && (i11 & 128) == 0) {
                i10 = 1;
            }
        }
        this.f105824f = i10;
        try {
            strValueOf = String.valueOf(packageManager.getApplicationLabel(applicationInfo));
        } catch (Throwable unused) {
            strValueOf = "";
        }
        this.f105820b = strValueOf;
    }
}
