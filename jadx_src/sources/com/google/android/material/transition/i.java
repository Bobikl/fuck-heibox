package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Visibility;
import androidx.transition.z;

/* JADX INFO: compiled from: Hold.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends Visibility {
    @Override // androidx.transition.Visibility
    @n0
    public Animator M0(@n0 ViewGroup viewGroup, @n0 View view, @p0 z zVar, @p0 z zVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.Visibility
    @n0
    public Animator O0(@n0 ViewGroup viewGroup, @n0 View view, @p0 z zVar, @p0 z zVar2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
