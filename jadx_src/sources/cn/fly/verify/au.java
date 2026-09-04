package cn.fly.verify;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes6.dex */
public class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConnectivityManager f35778a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static au f35779c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Network f35780b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f35781d;

    private au(Context context) {
        try {
            f35778a = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable unused) {
        }
    }

    public static au a(Context context) {
        if (f35779c == null) {
            synchronized (au.class) {
                if (f35779c == null) {
                    f35779c = new au(context);
                }
            }
        }
        return f35779c;
    }

    public void a() {
        try {
            if (f35778a != null && this.f35781d != null) {
                this.f35780b = null;
                f35778a.unregisterNetworkCallback(this.f35781d);
            }
            aj.b();
            f.a().b("[FlyVerify] ==>%s", "release cell");
        } catch (Throwable unused) {
        }
    }
}
