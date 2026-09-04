package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.z0;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@v8.a
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    @v8.a
    public static final String f52412b = "com.google.android.gms";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    @v8.a
    public static final String f52413c = "com.android.vending";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v8.a
    static final String f52414d = "d";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v8.a
    static final String f52415e = "n";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @v8.a
    public static final int f52411a = f.f52418a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f52416f = new e();

    @v8.a
    e() {
    }

    @androidx.annotation.n0
    @v8.a
    public static e i() {
        return f52416f;
    }

    @v8.a
    public void a(@androidx.annotation.n0 Context context) {
        f.a(context);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public int b(@androidx.annotation.n0 Context context) {
        return f.d(context);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public int c(@androidx.annotation.n0 Context context) {
        return f.e(context);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @Deprecated
    @p0
    public Intent d(int i10) {
        return e(null, i10, null);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @p0
    public Intent e(@p0 Context context, int i10, @p0 String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return z0.c("com.google.android.gms");
        }
        if (context != null && z8.l.l(context)) {
            return z0.a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f52411a);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            try {
                sb2.append(com.google.android.gms.common.wrappers.e.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z0.b("com.google.android.gms", sb2.toString());
    }

    @v8.a
    @p0
    public PendingIntent f(@androidx.annotation.n0 Context context, int i10, int i11) {
        return g(context, i10, i11, null);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @p0
    public PendingIntent g(@androidx.annotation.n0 Context context, int i10, int i11, @p0 String str) {
        Intent intentE = e(context, i10, str);
        if (intentE == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, intentE, com.google.android.gms.internal.common.k.f52725a | 134217728);
    }

    @androidx.annotation.n0
    @v8.a
    public String h(int i10) {
        return f.g(i10);
    }

    @com.google.android.gms.common.internal.h
    @v8.a
    public int j(@androidx.annotation.n0 Context context) {
        return k(context, f52411a);
    }

    @v8.a
    public int k(@androidx.annotation.n0 Context context, int i10) {
        int iM = f.m(context, i10);
        if (f.o(context, iM)) {
            return 18;
        }
        return iM;
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public boolean l(@androidx.annotation.n0 Context context, int i10) {
        return f.o(context, i10);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public boolean m(@androidx.annotation.n0 Context context, int i10) {
        return f.p(context, i10);
    }

    @v8.a
    public boolean n(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        return f.u(context, str);
    }

    @v8.a
    public boolean o(int i10) {
        return f.s(i10);
    }

    @v8.a
    public void p(@androidx.annotation.n0 Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        f.c(context, i10);
    }
}
