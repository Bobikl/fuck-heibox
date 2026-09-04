package com.tencent.liteav.base.system;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t<PackageInfo> f99666a = new t<>(b.a());

    public static String a() {
        PackageInfo packageInfoA = f99666a.a();
        return packageInfoA == null ? "" : packageInfoA.packageName;
    }

    public static String b() {
        PackageInfo packageInfoA;
        Context applicationContext = ContextUtils.getApplicationContext();
        return (applicationContext == null || (packageInfoA = f99666a.a()) == null) ? "" : applicationContext.getPackageManager().getApplicationLabel(packageInfoA.applicationInfo).toString();
    }

    public static String c() {
        PackageInfo packageInfoA = f99666a.a();
        return packageInfoA == null ? "" : packageInfoA.versionName;
    }

    static /* synthetic */ PackageInfo d() throws Exception {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
    }
}
