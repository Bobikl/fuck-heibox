package androidx.core.app;

import android.app.ActivityManager;

/* JADX INFO: compiled from: ActivityManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private h() {
    }

    public static boolean a(@androidx.annotation.n0 ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
