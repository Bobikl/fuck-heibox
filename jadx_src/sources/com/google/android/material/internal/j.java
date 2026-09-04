package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: FadeThroughUpdateListener.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final View f54510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final View f54511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f54512d = new float[2];

    public j(@p0 View view, @p0 View view2) {
        this.f54510b = view;
        this.f54511c = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
        k.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f54512d);
        View view = this.f54510b;
        if (view != null) {
            view.setAlpha(this.f54512d[0]);
        }
        View view2 = this.f54511c;
        if (view2 != null) {
            view2.setAlpha(this.f54512d[1]);
        }
    }
}
