package androidx.core.view;

import android.view.VelocityTracker;

/* JADX INFO: compiled from: VelocityTrackerCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class h1 {
    private h1() {
    }

    @Deprecated
    public static float a(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getXVelocity(i10);
    }

    @Deprecated
    public static float b(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getYVelocity(i10);
    }
}
