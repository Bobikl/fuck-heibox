package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: PermissionInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: compiled from: PermissionInfoCompat.java */
    @w0(28)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @androidx.annotation.u
        static int b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    /* JADX INFO: compiled from: PermissionInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    /* JADX INFO: compiled from: PermissionInfoCompat.java */
    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    private f() {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(@n0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@n0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(permissionInfo) : permissionInfo.protectionLevel & (-16);
    }
}
