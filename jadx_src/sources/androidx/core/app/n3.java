package androidx.core.app;

import android.app.Service;
import android.os.Build;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: ServiceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20071a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20072b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20073c = 2;

    /* JADX INFO: compiled from: ServiceCompat.java */
    @androidx.annotation.w0(24)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Service service, int i10) {
            service.stopForeground(i10);
        }
    }

    /* JADX INFO: compiled from: ServiceCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    private n3() {
    }

    public static void a(@androidx.annotation.n0 Service service, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(service, i10);
        } else {
            service.stopForeground((i10 & 1) != 0);
        }
    }
}
