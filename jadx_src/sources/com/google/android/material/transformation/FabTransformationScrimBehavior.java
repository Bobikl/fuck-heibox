package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.n0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.c;
import com.google.android.material.animation.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f55875m = 75;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f55876n = 150;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f55877o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f55878p = 150;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f55879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j f55880l;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f55881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f55882c;

        a(boolean z10, View view) {
            this.f55881b = z10;
            this.f55882c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f55881b) {
                return;
            }
            this.f55882c.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f55881b) {
                this.f55882c.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f55879k = new j(75L, 150L);
        this.f55880l = new j(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55879k = new j(75L, 150L);
        this.f55880l = new j(0L, 150L);
    }

    private void Q(@n0 View view, boolean z10, boolean z11, @n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        j jVar = z10 ? this.f55879k : this.f55880l;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        jVar.a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean H(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 MotionEvent motionEvent) {
        return super.H(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @n0
    protected AnimatorSet P(@n0 View view, @n0 View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        Q(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
