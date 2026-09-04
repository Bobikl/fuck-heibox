package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ScaleProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f56163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f56164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f56165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f56166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f56167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f56168f;

    /* JADX INFO: compiled from: ScaleProvider.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f56171d;

        a(View view, float f10, float f11) {
            this.f56169b = view;
            this.f56170c = f10;
            this.f56171d = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f56169b.setScaleX(this.f56170c);
            this.f56169b.setScaleY(this.f56171d);
        }
    }

    public r() {
        this(true);
    }

    public r(boolean z10) {
        this.f56163a = 1.0f;
        this.f56164b = 1.1f;
        this.f56165c = 0.8f;
        this.f56166d = 1.0f;
        this.f56168f = true;
        this.f56167e = z10;
    }

    private static Animator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator a(@n0 ViewGroup viewGroup, @n0 View view) {
        if (this.f56168f) {
            return this.f56167e ? c(view, this.f56163a, this.f56164b) : c(view, this.f56166d, this.f56165c);
        }
        return null;
    }

    @Override // com.google.android.material.transition.w
    @p0
    public Animator b(@n0 ViewGroup viewGroup, @n0 View view) {
        return this.f56167e ? c(view, this.f56165c, this.f56166d) : c(view, this.f56164b, this.f56163a);
    }

    public float d() {
        return this.f56166d;
    }

    public float e() {
        return this.f56165c;
    }

    public float f() {
        return this.f56164b;
    }

    public float g() {
        return this.f56163a;
    }

    public boolean h() {
        return this.f56167e;
    }

    public boolean i() {
        return this.f56168f;
    }

    public void j(boolean z10) {
        this.f56167e = z10;
    }

    public void k(float f10) {
        this.f56166d = f10;
    }

    public void l(float f10) {
        this.f56165c = f10;
    }

    public void m(float f10) {
        this.f56164b = f10;
    }

    public void n(float f10) {
        this.f56163a = f10;
    }

    public void o(boolean z10) {
        this.f56168f = z10;
    }
}
