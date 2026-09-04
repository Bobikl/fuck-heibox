package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@v8.a
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @v8.a
    @Deprecated
    public static final int f52418a = 12451000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    @v8.a
    @Deprecated
    public static final String f52419b = "com.google.android.gms";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    @v8.a
    public static final String f52420c = "com.google.android.play.games";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    @v8.a
    public static final String f52421d = "com.android.vending";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v8.a
    static final int f52422e = 39789;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v8.a
    static final int f52423f = 10436;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f52425h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @z8.d0
    static boolean f52426i = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @v8.a
    @z8.d0
    static final AtomicBoolean f52424g = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f52427j = new AtomicBoolean();

    @v8.a
    f() {
    }

    @v8.a
    @Deprecated
    public static void a(@androidx.annotation.n0 Context context) {
        if (f52424g.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public static void b() {
        f52427j.set(true);
    }

    @v8.a
    @Deprecated
    public static void c(@androidx.annotation.n0 Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int iK = e.i().k(context, i10);
        if (iK != 0) {
            Intent intentE = e.i().e(context, iK, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iK);
            if (intentE != null) {
                throw new GooglePlayServicesRepairableException(iK, "Google Play Services not available", intentE);
            }
            throw new GooglePlayServicesNotAvailableException(iK);
        }
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @Deprecated
    public static int d(@androidx.annotation.n0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @Deprecated
    public static int e(@androidx.annotation.n0 Context context) {
        com.google.android.gms.common.internal.p.r(true);
        return z8.e.a(context, context.getPackageName());
    }

    @v8.a
    @p0
    @Deprecated
    public static PendingIntent f(int i10, @androidx.annotation.n0 Context context, int i11) {
        return e.i().f(context, i10, i11);
    }

    @androidx.annotation.n0
    @v8.a
    @Deprecated
    @z8.d0
    public static String g(int i10) {
        return ConnectionResult.k(i10);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @Deprecated
    @p0
    public static Intent h(int i10) {
        return e.i().e(null, i10, null);
    }

    @v8.a
    @p0
    public static Context i(@androidx.annotation.n0 Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @v8.a
    @p0
    public static Resources j(@androidx.annotation.n0 Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public static boolean k(@androidx.annotation.n0 Context context) {
        try {
            if (!f52426i) {
                PackageInfo packageInfoF = com.google.android.gms.common.wrappers.e.a(context).f("com.google.android.gms", 64);
                g.a(context);
                if (packageInfoF == null || g.f(packageInfoF, false) || !g.f(packageInfoF, true)) {
                    f52425h = false;
                } else {
                    f52425h = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f52426i = true;
        }
        return f52425h || !z8.l.j();
    }

    @com.google.android.gms.common.internal.h
    @v8.a
    @Deprecated
    public static int l(@androidx.annotation.n0 Context context) {
        return m(context, f52418a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00de, please report this as an issue */
    @v8.a
    @Deprecated
    public static int m(@androidx.annotation.n0 Context context, int i10) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f52427j.get()) {
            int iA = com.google.android.gms.common.internal.d0.a(context);
            if (iA == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (iA != f52418a) {
                throw new GooglePlayServicesIncorrectManifestValueException(iA);
            }
        }
        boolean z10 = (z8.l.l(context) || z8.l.n(context)) ? false : true;
        com.google.android.gms.common.internal.p.a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", bb.c.k.T6);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            g.a(context);
            if (!g.f(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z10) {
                    if (z10) {
                    }
                    if (z8.f0.a(packageInfo2.versionCode) < z8.f0.a(i10)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                com.google.android.gms.common.internal.p.l(packageInfo);
                if (!g.f(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (z8.f0.a(packageInfo2.versionCode) < z8.f0.a(i10)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e10) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @v8.a
    @Deprecated
    public static boolean n(@androidx.annotation.n0 Context context, int i10) {
        return z8.c0.a(context, i10);
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @Deprecated
    public static boolean o(@androidx.annotation.n0 Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return u(context, "com.google.android.gms");
        }
        return false;
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @Deprecated
    public static boolean p(@androidx.annotation.n0 Context context, int i10) {
        if (i10 == 9) {
            return u(context, "com.android.vending");
        }
        return false;
    }

    @v8.a
    @TargetApi(18)
    public static boolean q(@androidx.annotation.n0 Context context) {
        if (!z8.v.g()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.p.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    @Deprecated
    @z8.d0
    public static boolean r(@androidx.annotation.n0 Context context) {
        return z8.l.f(context);
    }

    @v8.a
    @Deprecated
    public static boolean s(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @v8.a
    @TargetApi(19)
    @Deprecated
    public static boolean t(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 String str) {
        return z8.c0.b(context, i10, str);
    }

    @TargetApi(21)
    static boolean u(Context context, String str) {
        boolean zEquals = str.equals("com.google.android.gms");
        if (z8.v.j()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !q(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
