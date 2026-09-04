package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106803a;

    w(Context context) {
        this.f106803a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.f106803a.getPackageManager().getPackageInfo(this.f106803a.getPackageName(), bb.c.f.f32368k3);
            v.c(this.f106803a);
            v.d(this.f106803a, packageInfo);
            v.c(this.f106803a, packageInfo);
        } catch (Throwable th2) {
            Log.e("ManifestChecker", "", th2);
        }
    }
}
