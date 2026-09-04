package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: compiled from: FadeThroughProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float f55900b = 0.35f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f55901a = f55900b;

    /* JADX INFO: compiled from: FadeThroughProvider.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f55902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f55903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f55904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f55905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f55906f;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f55902b = view;
            this.f55903c = f10;
            this.f55904d = f11;
            this.f55905e = f12;
            this.f55906f = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f55902b.setAlpha(v.n(this.f55903c, this.f55904d, this.f55905e, this.f55906f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: compiled from: FadeThroughProvider.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f55907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f55908c;

        b(View view, float f10) {
            this.f55907b = view;
            this.f55908c = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55907b.setAlpha(this.f55908c);
        }
    }

    private static Animator c(View view, float f10, float f11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f12, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f13, float f14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(view, f10, f11, f12, f13));
        valueAnimatorOfFloat.addListener(new b(view, f14));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator a(@n0 ViewGroup viewGroup, @n0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f55901a, alpha);
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator b(@n0 ViewGroup viewGroup, @n0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f55901a, 1.0f, alpha);
    }

    public float d() {
        return this.f55901a;
    }

    public void e(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f55901a = f10;
    }
}
