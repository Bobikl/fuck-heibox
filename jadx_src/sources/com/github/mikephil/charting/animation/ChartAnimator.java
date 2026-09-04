package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public ChartAnimator() {
    }

    public ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    public void animateX(int i10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i10);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateX(int i10, Easing.EasingOption easingOption) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.setDuration(i10);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateX(int i10, EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i10);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i10, int i11) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i11);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(i10);
        if (i10 > i11) {
            objectAnimatorOfFloat2.addUpdateListener(this.mListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(this.mListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i10, int i11, Easing.EasingOption easingOption, Easing.EasingOption easingOption2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption2));
        objectAnimatorOfFloat.setDuration(i11);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat2.setDuration(i10);
        if (i10 > i11) {
            objectAnimatorOfFloat2.addUpdateListener(this.mListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(this.mListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i10, int i11, EasingFunction easingFunction, EasingFunction easingFunction2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction2);
        objectAnimatorOfFloat.setDuration(i11);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(easingFunction);
        objectAnimatorOfFloat2.setDuration(i10);
        if (i10 > i11) {
            objectAnimatorOfFloat2.addUpdateListener(this.mListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(this.mListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i10);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i10, Easing.EasingOption easingOption) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.setDuration(i10);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i10, EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i10);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseX(float f10) {
        this.mPhaseX = f10;
    }

    public void setPhaseY(float f10) {
        this.mPhaseY = f10;
    }
}
