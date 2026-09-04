package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: MotionInterpolator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Interpolator {
    public abstract float a();

    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float f10);
}
