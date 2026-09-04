package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: PermissionChecker.java */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20616a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20617b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20618c = -2;

    /* JADX INFO: compiled from: PermissionChecker.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    private t0() {
    }

    public static int a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.p0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, int i10, int i11, @androidx.annotation.p0 String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strF = androidx.core.app.p.f(str);
        if (strF == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i11 && androidx.core.util.j.a(context.getPackageName(), str2) ? androidx.core.app.p.a(context, i11, strF, str2) : androidx.core.app.p.e(context, strF, str2)) == 0 ? 0 : -2;
    }

    public static int d(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
