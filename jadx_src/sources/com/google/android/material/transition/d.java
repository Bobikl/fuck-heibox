package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: compiled from: FadeProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f55892a = 1.0f;

    /* JADX INFO: compiled from: FadeProvider.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f55893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f55894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f55895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f55896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f55897f;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f55893b = view;
            this.f55894c = f10;
            this.f55895d = f11;
            this.f55896e = f12;
            this.f55897f = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f55893b.setAlpha(v.n(this.f55894c, this.f55895d, this.f55896e, this.f55897f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: compiled from: FadeProvider.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f55898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f55899c;

        b(View view, float f10) {
            this.f55898b = view;
            this.f55899c = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55898b.setAlpha(this.f55899c);
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
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator b(@n0 ViewGroup viewGroup, @n0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f55892a, alpha);
    }

    public float d() {
        return this.f55892a;
    }

    public void e(float f10) {
        this.f55892a = f10;
    }
}
