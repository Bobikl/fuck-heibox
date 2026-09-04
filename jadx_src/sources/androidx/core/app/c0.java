package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: NavUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19916a = "NavUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19917b = "android.support.PARENT_ACTIVITY";

    /* JADX INFO: compiled from: NavUtils.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @androidx.annotation.u
        static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @androidx.annotation.u
        static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    private c0() {
    }

    @androidx.annotation.p0
    public static Intent a(@androidx.annotation.n0 Activity activity) {
        Intent intentA = a.a(activity);
        if (intentA != null) {
            return intentA;
        }
        String strD = d(activity);
        if (strD == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strD);
        try {
            return e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f19916a, "getParentActivityIntent: bad parentActivityName '" + strD + "' in manifest");
            return null;
        }
    }

    @androidx.annotation.p0
    public static Intent b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strE = e(context, componentName);
        if (strE == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strE);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @androidx.annotation.p0
    public static Intent c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String strE = e(context, new ComponentName(context, cls));
        if (strE == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, strE);
        return e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @androidx.annotation.p0
    public static String d(@androidx.annotation.n0 Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @androidx.annotation.p0
    public static String e(@androidx.annotation.n0 Context context, @androidx.annotation.n0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = bb.c.b.f30883q9;
        if (i10 >= 29) {
            i11 = 269222528;
        } else if (i10 >= 24) {
            i11 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i11);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f19917b)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void f(@androidx.annotation.n0 Activity activity) {
        Intent intentA = a(activity);
        if (intentA != null) {
            g(activity, intentA);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static void g(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 Intent intent) {
        a.b(activity, intent);
    }

    public static boolean h(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 Intent intent) {
        return a.c(activity, intent);
    }
}
