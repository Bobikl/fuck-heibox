package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: Hold.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class i extends Visibility {
    @Override // android.transition.Visibility
    @n0
    public Animator onAppear(@n0 ViewGroup viewGroup, @n0 View view, @p0 TransitionValues transitionValues, @p0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @n0
    public Animator onDisappear(@n0 ViewGroup viewGroup, @n0 View view, @p0 TransitionValues transitionValues, @p0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
