package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.n0;
import androidx.core.util.k;
import z8.v;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    protected final Context f52654a;

    public d(@n0 Context context) {
        this.f52654a = context;
    }

    @v8.a
    public int a(@n0 String str) {
        return this.f52654a.checkCallingOrSelfPermission(str);
    }

    @v8.a
    public int b(@n0 String str, @n0 String str2) {
        return this.f52654a.getPackageManager().checkPermission(str, str2);
    }

    @n0
    @v8.a
    public ApplicationInfo c(@n0 String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f52654a.getPackageManager().getApplicationInfo(str, i10);
    }

    @n0
    @v8.a
    public CharSequence d(@n0 String str) throws PackageManager.NameNotFoundException {
        return this.f52654a.getPackageManager().getApplicationLabel(this.f52654a.getPackageManager().getApplicationInfo(str, 0));
    }

    @n0
    @v8.a
    public k<CharSequence, Drawable> e(@n0 String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f52654a.getPackageManager().getApplicationInfo(str, 0);
        return k.a(this.f52654a.getPackageManager().getApplicationLabel(applicationInfo), this.f52654a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @n0
    @v8.a
    public PackageInfo f(@n0 String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f52654a.getPackageManager().getPackageInfo(str, i10);
    }

    @v8.a
    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f52654a);
        }
        if (!v.n() || (nameForUid = this.f52654a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f52654a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean h(int i10, @n0 String str) {
        if (v.h()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f52654a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i10, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f52654a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
