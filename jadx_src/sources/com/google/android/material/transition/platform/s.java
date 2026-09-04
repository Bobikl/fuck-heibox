package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ScaleProvider.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f56133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f56134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f56135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f56136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f56137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f56138f;

    /* JADX INFO: compiled from: ScaleProvider.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f56141d;

        a(View view, float f10, float f11) {
            this.f56139b = view;
            this.f56140c = f10;
            this.f56141d = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f56139b.setScaleX(this.f56140c);
            this.f56139b.setScaleY(this.f56141d);
        }
    }

    public s() {
        this(true);
    }

    public s(boolean z10) {
        this.f56133a = 1.0f;
        this.f56134b = 1.1f;
        this.f56135c = 0.8f;
        this.f56136d = 1.0f;
        this.f56138f = true;
        this.f56137e = z10;
    }

    private static Animator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator a(@n0 ViewGroup viewGroup, @n0 View view) {
        if (this.f56138f) {
            return this.f56137e ? c(view, this.f56133a, this.f56134b) : c(view, this.f56136d, this.f56135c);
        }
        return null;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@n0 ViewGroup viewGroup, @n0 View view) {
        return this.f56137e ? c(view, this.f56135c, this.f56136d) : c(view, this.f56134b, this.f56133a);
    }

    public float d() {
        return this.f56136d;
    }

    public float e() {
        return this.f56135c;
    }

    public float f() {
        return this.f56134b;
    }

    public float g() {
        return this.f56133a;
    }

    public boolean h() {
        return this.f56137e;
    }

    public boolean i() {
        return this.f56138f;
    }

    public void j(boolean z10) {
        this.f56137e = z10;
    }

    public void k(float f10) {
        this.f56136d = f10;
    }

    public void l(float f10) {
        this.f56135c = f10;
    }

    public void m(float f10) {
        this.f56134b = f10;
    }

    public void n(float f10) {
        this.f56133a = f10;
    }

    public void o(boolean z10) {
        this.f56138f = z10;
    }
}
