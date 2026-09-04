package com.max.hbcustomview.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import androidx.transition.z;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TranslationAnimationCreator.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TranslationAnimationCreator.java */
    public static class a extends AnimatorListenerAdapter implements Transition.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f69681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f69682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f69683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f69684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int[] f69685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f69686g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f69687h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f69688i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float f69689j;

        a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f69682c = view;
            this.f69681b = view2;
            this.f69683d = i10 - Math.round(view.getTranslationX());
            this.f69684e = i11 - Math.round(view.getTranslationY());
            this.f69688i = f10;
            this.f69689j = f11;
            int i12 = R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i12);
            this.f69685f = iArr;
            if (iArr != null) {
                view2.setTag(i12, null);
            }
        }

        @Override // androidx.transition.Transition.h
        public void a(@n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void d(@n0 Transition transition) {
            if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, bb.c.f.Sv, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69682c.setTranslationX(this.f69688i);
            this.f69682c.setTranslationY(this.f69689j);
            transition.n0(this);
        }

        @Override // androidx.transition.Transition.h
        public void e(@n0 Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Pv, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f69685f == null) {
                this.f69685f = new int[2];
            }
            this.f69685f[0] = Math.round(this.f69683d + this.f69682c.getTranslationX());
            this.f69685f[1] = Math.round(this.f69684e + this.f69682c.getTranslationY());
            this.f69681b.setTag(R.id.transition_position, this.f69685f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Qv, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69686g = this.f69682c.getTranslationX();
            this.f69687h = this.f69682c.getTranslationY();
            this.f69682c.setTranslationX(this.f69688i);
            this.f69682c.setTranslationY(this.f69689j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Rv, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69682c.setTranslationX(this.f69686g);
            this.f69682c.setTranslationY(this.f69687h);
        }
    }

    private c() {
    }

    @p0
    static Animator a(@n0 View view, @n0 z zVar, int i10, int i11, float f10, float f11, float f12, float f13, @p0 TimeInterpolator timeInterpolator, @n0 Transition transition) {
        float f14;
        float f15;
        Object[] objArr = {view, zVar, new Integer(i10), new Integer(i11), new Float(f10), new Float(f11), new Float(f12), new Float(f13), timeInterpolator, transition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Ov, new Class[]{View.class, z.class, cls, cls, cls2, cls2, cls2, cls2, TimeInterpolator.class, Transition.class}, Animator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animator) patchProxyResultProxy.result;
        }
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) zVar.f27974b.getTag(R.id.transition_position);
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iRound = i10 + Math.round(f14 - translationX);
        int iRound2 = i11 + Math.round(f15 - translationY);
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        a aVar = new a(view, zVar.f27974b, iRound, iRound2, translationX, translationY);
        transition.a(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
