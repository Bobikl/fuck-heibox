package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.google.android.material.internal.c0;

/* JADX INFO: compiled from: ViewUtilsLollipop.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f53062a = {R.attr.stateListAnimator};

    j() {
    }

    static void a(@n0 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(@n0 View view, float f10) {
        int integer = view.getResources().getInteger(com.google.android.material.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.google.android.material.R.attr.state_liftable, -com.google.android.material.R.attr.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(@n0 View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray typedArrayK = c0.k(context, attributeSet, f53062a, i10, i11, new int[0]);
        try {
            if (typedArrayK.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayK.getResourceId(0, 0)));
            }
        } finally {
            typedArrayK.recycle();
        }
    }
}
