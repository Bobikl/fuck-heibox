package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.annotation.z0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: ConnectivityManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20935a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20936b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20937c = 3;

    /* JADX INFO: renamed from: androidx.core.net.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConnectivityManagerCompat.java */
    @w0(16)
    public static class C0134a {
        private C0134a() {
        }

        @u
        @z0("android.permission.ACCESS_NETWORK_STATE")
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* JADX INFO: compiled from: ConnectivityManagerCompat.java */
    @w0(24)
    public static class b {
        private b() {
        }

        @u
        static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    /* JADX INFO: compiled from: ConnectivityManagerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    private a() {
    }

    @z0("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    @p0
    public static NetworkInfo a(@n0 ConnectivityManager connectivityManager, @n0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@n0 ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(connectivityManager);
        }
        return 3;
    }

    @z0("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@n0 ConnectivityManager connectivityManager) {
        return C0134a.a(connectivityManager);
    }
}
