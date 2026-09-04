package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: FadeProvider.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f56004a = 1.0f;

    /* JADX INFO: compiled from: FadeProvider.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f56007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f56008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f56009f;

        a(View view, float f10, float f11, float f12, float f13) {
            this.f56005b = view;
            this.f56006c = f10;
            this.f56007d = f11;
            this.f56008e = f12;
            this.f56009f = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f56005b.setAlpha(w.n(this.f56006c, this.f56007d, this.f56008e, this.f56009f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: compiled from: FadeProvider.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56011c;

        b(View view, float f10) {
            this.f56010b = view;
            this.f56011c = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f56010b.setAlpha(this.f56011c);
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
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@n0 ViewGroup viewGroup, @n0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f56004a, alpha);
    }

    public float d() {
        return this.f56004a;
    }

    public void e(float f10) {
        this.f56004a = f10;
    }
}
