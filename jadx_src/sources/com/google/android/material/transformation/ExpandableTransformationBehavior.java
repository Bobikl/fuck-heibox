package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.i;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private AnimatorSet f55854j;

    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f55854j = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean N(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f55854j;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetP = P(view, view2, z10, z12);
        this.f55854j = animatorSetP;
        animatorSetP.addListener(new a());
        this.f55854j.start();
        if (!z11) {
            this.f55854j.end();
        }
        return true;
    }

    @n0
    protected abstract AnimatorSet P(View view, View view2, boolean z10, boolean z11);
}
