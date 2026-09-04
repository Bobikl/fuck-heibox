package z5;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f141852a = 3000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f141853b = -1;

    public static synchronized boolean a() {
        boolean z10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f141853b >= 3000) {
            f141853b = jElapsedRealtime;
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }
}
