package com.transitionseverywhere.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.annotation.TargetApi;
import androidx.annotation.p0;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes4.dex */
@TargetApi(14)
public class c {
    @p0
    public static Animator a(@p0 Animator animator, @p0 Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
