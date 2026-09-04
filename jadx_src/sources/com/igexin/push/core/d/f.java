package com.igexin.push.core.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f63703a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f63704b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f63705c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final CountDownLatch f63706d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f63708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f63709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f63710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f63711i;

    public f(String str, String str2, String str3, String str4) {
        this.f63707e = str;
        this.f63708f = str2;
        this.f63709g = str3;
        this.f63710h = str4;
    }

    long a(PackageInfo packageInfo) {
        try {
            Method declaredMethod = PackageInfo.class.getDeclaredMethod("getLongVersionCode", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Long) declaredMethod.invoke(packageInfo, new Object[0])).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    protected String a() {
        return null;
    }

    @Override // com.igexin.push.core.d.c
    public boolean a(Context context) {
        if (f63705c) {
            return f63704b;
        }
        boolean z10 = false;
        if (context != null && !TextUtils.isEmpty(this.f63707e)) {
            try {
                PackageInfo packageInfoA = com.igexin.push.util.l.a(this.f63707e, 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    return packageInfoA != null && a(packageInfoA) >= 1;
                }
                if (packageInfoA != null && packageInfoA.versionCode >= 1) {
                    z10 = true;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        f63704b = z10;
        f63705c = true;
        return f63704b;
    }

    protected int b() {
        return 1;
    }

    @Override // com.igexin.push.core.d.c
    public String b(Context context) {
        i iVar;
        i iVar2;
        if (!TextUtils.isEmpty(f63703a) || (iVar = this.f63711i) == null || iVar.a() == null) {
            return f63703a;
        }
        try {
            String strA = this.f63711i.a().a(d(context), e(context), a(), b());
            f63703a = strA;
            if (!TextUtils.isEmpty(strA) && (iVar2 = this.f63711i) != null) {
                context.unbindService(iVar2);
            }
        } catch (Throwable unused) {
        }
        return f63703a;
    }

    @Override // com.igexin.push.core.d.c
    public boolean c(Context context) {
        if (context == null || TextUtils.isEmpty(this.f63707e)) {
            return false;
        }
        if (this.f63711i == null) {
            this.f63711i = new i(this.f63710h, f63706d);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(this.f63708f)) {
            intent.setPackage(this.f63707e);
        } else {
            intent.setComponent(new ComponentName(this.f63707e, this.f63708f));
        }
        if (!TextUtils.isEmpty(this.f63709g)) {
            intent.setAction(this.f63709g);
        }
        return this.f63711i.a(context, intent);
    }

    protected String d(Context context) {
        return null;
    }

    protected String e(Context context) {
        return null;
    }
}
