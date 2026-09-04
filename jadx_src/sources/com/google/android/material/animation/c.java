package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.util.List;

/* JADX INFO: compiled from: AnimatorSetCompat.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c {
    public static void a(@n0 AnimatorSet animatorSet, @n0 List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = list.get(i10);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
