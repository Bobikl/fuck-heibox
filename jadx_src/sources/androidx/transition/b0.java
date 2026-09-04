package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: TranslationAnimationCreator.java */
/* JADX INFO: loaded from: classes6.dex */
public class b0 {

    /* JADX INFO: compiled from: TranslationAnimationCreator.java */
    public static class a extends AnimatorListenerAdapter implements Transition.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f27830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f27831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f27832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f27833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int[] f27834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f27835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f27836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f27837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float f27838j;

        a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f27831c = view;
            this.f27830b = view2;
            this.f27832d = i10 - Math.round(view.getTranslationX());
            this.f27833e = i11 - Math.round(view.getTranslationY());
            this.f27837i = f10;
            this.f27838j = f11;
            int i12 = R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i12);
            this.f27834f = iArr;
            if (iArr != null) {
                view2.setTag(i12, null);
            }
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            this.f27831c.setTranslationX(this.f27837i);
            this.f27831c.setTranslationY(this.f27838j);
            transition.n0(this);
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.n0 Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f27834f == null) {
                this.f27834f = new int[2];
            }
            this.f27834f[0] = Math.round(this.f27832d + this.f27831c.getTranslationX());
            this.f27834f[1] = Math.round(this.f27833e + this.f27831c.getTranslationY());
            this.f27830b.setTag(R.id.transition_position, this.f27834f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f27835g = this.f27831c.getTranslationX();
            this.f27836h = this.f27831c.getTranslationY();
            this.f27831c.setTranslationX(this.f27837i);
            this.f27831c.setTranslationY(this.f27838j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f27831c.setTranslationX(this.f27835g);
            this.f27831c.setTranslationY(this.f27836h);
        }
    }

    private b0() {
    }

    @androidx.annotation.p0
    static Animator a(@androidx.annotation.n0 View view, @androidx.annotation.n0 z zVar, int i10, int i11, float f10, float f11, float f12, float f13, @androidx.annotation.p0 TimeInterpolator timeInterpolator, @androidx.annotation.n0 Transition transition) {
        float f14;
        float f15;
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
        androidx.transition.a.a(objectAnimatorOfPropertyValuesHolder, aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
