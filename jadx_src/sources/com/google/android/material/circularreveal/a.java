package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.n0;

/* JADX INFO: compiled from: CircularRevealCompat.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealCompat.java */
    public class C0420a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f53619b;

        C0420a(c cVar) {
            this.f53619b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f53619b.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f53619b.d();
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n0
    public static Animator a(@n0 c cVar, float f10, float f11, float f12) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0422c.f53637a, (TypeEvaluator) c.b.f53635b, (Object[]) new c.e[]{new c.e(f10, f11, f12)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f10, (int) f11, revealInfo.f53642c, f12);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n0
    public static Animator b(c cVar, float f10, float f11, float f12, float f13) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0422c.f53637a, (TypeEvaluator) c.b.f53635b, (Object[]) new c.e[]{new c.e(f10, f11, f12), new c.e(f10, f11, f13)});
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f10, (int) f11, f12, f13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    @n0
    public static Animator.AnimatorListener c(@n0 c cVar) {
        return new C0420a(cVar);
    }
}
