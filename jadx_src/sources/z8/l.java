package z8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private static Boolean f141925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static Boolean f141926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private static Boolean f141927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private static Boolean f141928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private static Boolean f141929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private static Boolean f141930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private static Boolean f141931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private static Boolean f141932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private static Boolean f141933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private static Boolean f141934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private static Boolean f141935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private static Boolean f141936l;

    private l() {
    }

    @v8.a
    public static boolean a(@n0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f141933i == null) {
            boolean z10 = false;
            if (v.n() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f141933i = Boolean.valueOf(z10);
        }
        return f141933i.booleanValue();
    }

    @v8.a
    public static boolean b(@n0 Context context) {
        if (f141936l == null) {
            boolean z10 = false;
            if (v.q() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f141936l = Boolean.valueOf(z10);
        }
        return f141936l.booleanValue();
    }

    @v8.a
    public static boolean c(@n0 Context context) {
        if (f141930f == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f141930f = Boolean.valueOf(z10);
        }
        return f141930f.booleanValue();
    }

    @v8.a
    public static boolean d(@n0 Context context) {
        if (f141925a == null) {
            boolean z10 = false;
            if (!g(context) && !k(context) && !n(context)) {
                if (f141932h == null) {
                    f141932h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if (!f141932h.booleanValue() && !a(context) && !i(context)) {
                    if (f141935k == null) {
                        f141935k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if (!f141935k.booleanValue() && !b(context)) {
                        z10 = true;
                    }
                }
            }
            f141925a = Boolean.valueOf(z10);
        }
        return f141925a.booleanValue();
    }

    @v8.a
    public static boolean e(@n0 Context context) {
        return o(context.getResources());
    }

    @v8.a
    @TargetApi(21)
    public static boolean f(@n0 Context context) {
        return m(context);
    }

    @v8.a
    public static boolean g(@n0 Context context) {
        return h(context.getResources());
    }

    @v8.a
    public static boolean h(@n0 Resources resources) {
        if (resources == null) {
            return false;
        }
        if (f141926b == null) {
            f141926b = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || o(resources));
        }
        return f141926b.booleanValue();
    }

    @v8.a
    public static boolean i(@n0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f141934j == null) {
            boolean z10 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z10 = false;
            }
            f141934j = Boolean.valueOf(z10);
        }
        return f141934j.booleanValue();
    }

    @v8.a
    public static boolean j() {
        int i10 = com.google.android.gms.common.f.f52418a;
        return "user".equals(Build.TYPE);
    }

    @v8.a
    @TargetApi(20)
    public static boolean k(@n0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f141928d == null) {
            boolean z10 = false;
            if (v.i() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f141928d = Boolean.valueOf(z10);
        }
        return f141928d.booleanValue();
    }

    @v8.a
    @TargetApi(26)
    public static boolean l(@n0 Context context) {
        if (k(context) && !v.m()) {
            return true;
        }
        if (m(context)) {
            return !v.n() || v.q();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean m(@n0 Context context) {
        if (f141929e == null) {
            boolean z10 = false;
            if (v.j() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f141929e = Boolean.valueOf(z10);
        }
        return f141929e.booleanValue();
    }

    public static boolean n(@n0 Context context) {
        if (f141931g == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f141931g = Boolean.valueOf(z10);
        }
        return f141931g.booleanValue();
    }

    public static boolean o(@n0 Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (f141927c == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            f141927c = Boolean.valueOf(z10);
        }
        return f141927c.booleanValue();
    }
}
