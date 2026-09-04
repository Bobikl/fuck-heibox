package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: FadeThroughProvider.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class e implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float f56012b = 0.35f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f56013a = f56012b;

    /* JADX INFO: compiled from: FadeThroughProvider.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f56016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f56017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f56018f;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f56014b = view;
            this.f56015c = f10;
            this.f56016d = f11;
            this.f56017e = f12;
            this.f56018f = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f56014b.setAlpha(w.n(this.f56015c, this.f56016d, this.f56017e, this.f56018f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: compiled from: FadeThroughProvider.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56020c;

        b(View view, float f10) {
            this.f56019b = view;
            this.f56020c = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f56019b.setAlpha(this.f56020c);
        }
    }

    private static Animator c(View view, float f10, float f11, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f12, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f13, float f14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(view, f10, f11, f12, f13));
        valueAnimatorOfFloat.addListener(new b(view, f14));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator a(@n0 ViewGroup viewGroup, @n0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f56013a, alpha);
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@n0 ViewGroup viewGroup, @n0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f56013a, 1.0f, alpha);
    }

    public float d() {
        return this.f56013a;
    }

    public void e(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f56013a = f10;
    }
}
