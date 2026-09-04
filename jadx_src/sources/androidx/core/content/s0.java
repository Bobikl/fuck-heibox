package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PackageManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f20614a = "PackageManagerCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20615b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* JADX INFO: compiled from: PackageManagerCompat.java */
    @androidx.annotation.w0(30)
    public static class a {
        private a() {
        }

        static boolean a(@androidx.annotation.n0 Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* JADX INFO: compiled from: PackageManagerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    private s0() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean a(@androidx.annotation.n0 PackageManager packageManager) {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 30;
        boolean z11 = i10 < 30;
        boolean z12 = b(packageManager) != null;
        if (z10) {
            return true;
        }
        return z11 && z12;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @androidx.annotation.p0
    public static String b(@androidx.annotation.n0 PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f20615b).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @androidx.annotation.n0
    public static com.google.common.util.concurrent.p0<Integer> c(@androidx.annotation.n0 Context context) {
        androidx.concurrent.futures.b<Integer> bVarU = androidx.concurrent.futures.b.u();
        if (!androidx.core.os.n0.a(context)) {
            bVarU.p(0);
            Log.e(f20614a, "User is in locked direct boot mode");
            return bVarU;
        }
        if (!a(context.getPackageManager())) {
            bVarU.p(1);
            return bVarU;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 < 30) {
            bVarU.p(0);
            Log.e(f20614a, "Target SDK version below API 30");
            return bVarU;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            if (a.a(context)) {
                bVarU.p(Integer.valueOf(i10 >= 31 ? 5 : 4));
            } else {
                bVarU.p(2);
            }
            return bVarU;
        }
        if (i11 == 30) {
            bVarU.p(Integer.valueOf(a.a(context) ? 4 : 2));
            return bVarU;
        }
        final x0 x0Var = new x0(context);
        bVarU.V(new Runnable() { // from class: androidx.core.content.q0
            @Override // java.lang.Runnable
            public final void run() {
                x0Var.b();
            }
        }, Executors.newSingleThreadExecutor());
        x0Var.a(bVarU);
        return bVarU;
    }
}
