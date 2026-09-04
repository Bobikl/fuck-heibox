package com.umeng.socialize.shareboard.widgets;

import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes4.dex */
public class VelocityTrackerCompat {
    private static final VelocityTrackerVersionImpl IMPL = new HoneycombVelocityTrackerVersionImpl();

    public static class BaseVelocityTrackerVersionImpl implements VelocityTrackerVersionImpl {
        private BaseVelocityTrackerVersionImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl
        public float getXVelocity(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getXVelocity();
        }
    }

    public static class HoneycombVelocityTrackerVersionImpl implements VelocityTrackerVersionImpl {
        private HoneycombVelocityTrackerVersionImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl
        public float getXVelocity(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getXVelocity(i10);
        }
    }

    public interface VelocityTrackerVersionImpl {
        float getXVelocity(VelocityTracker velocityTracker, int i10);
    }

    VelocityTrackerCompat() {
    }

    static float getXVelocity(VelocityTracker velocityTracker, int i10) {
        return IMPL.getXVelocity(velocityTracker, i10);
    }
}
