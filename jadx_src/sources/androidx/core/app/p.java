package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: compiled from: AppOpsManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20351a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20352b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20353c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20354d = 3;

    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            return appOpsManager.noteOp(str, i10, str2);
        }

        @androidx.annotation.u
        static int b(AppOpsManager appOpsManager, String str, int i10, String str2) {
            return appOpsManager.noteOpNoThrow(str, i10, str2);
        }
    }

    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.w0(23)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @androidx.annotation.u
        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @androidx.annotation.u
        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @androidx.annotation.u
        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    @androidx.annotation.w0(29)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static int a(@androidx.annotation.p0 AppOpsManager appOpsManager, @androidx.annotation.n0 String str, int i10, @androidx.annotation.n0 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        @androidx.annotation.n0
        @androidx.annotation.u
        static String b(@androidx.annotation.n0 Context context) {
            return context.getOpPackageName();
        }

        @androidx.annotation.u
        @androidx.annotation.p0
        static AppOpsManager c(@androidx.annotation.n0 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private p() {
    }

    public static int a(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return e(context, str, str2);
        }
        AppOpsManager appOpsManagerC = c.c(context);
        int iA = c.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : c.a(appOpsManagerC, str, i10, c.b(context));
    }

    public static int b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, int i10, @androidx.annotation.n0 String str2) {
        return a.a((AppOpsManager) context.getSystemService("appops"), str, i10, str2);
    }

    public static int c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, int i10, @androidx.annotation.n0 String str2) {
        return a.b((AppOpsManager) context.getSystemService("appops"), str, i10, str2);
    }

    public static int d(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        return b.b((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    public static int e(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        return b.c((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    @androidx.annotation.p0
    public static String f(@androidx.annotation.n0 String str) {
        return b.d(str);
    }
}
