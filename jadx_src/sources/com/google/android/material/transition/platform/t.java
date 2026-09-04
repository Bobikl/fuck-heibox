package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.core.view.j1;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: SlideDistanceProvider.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class t implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f56142c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f56143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @t0
    private int f56144b = -1;

    /* JADX INFO: compiled from: SlideDistanceProvider.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56146c;

        a(View view, float f10) {
            this.f56145b = view;
            this.f56146c = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f56145b.setTranslationX(this.f56146c);
        }
    }

    /* JADX INFO: compiled from: SlideDistanceProvider.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56148c;

        b(View view, float f10) {
            this.f56147b = view;
            this.f56148c = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f56147b.setTranslationY(this.f56148c);
        }
    }

    /* JADX INFO: compiled from: SlideDistanceProvider.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    public t(int i10) {
        this.f56143a = i10;
    }

    private static Animator c(View view, View view2, int i10, @t0 int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return e(view2, i11 + translationX, translationX, translationX);
        }
        if (i10 == 5) {
            return e(view2, translationX - i11, translationX, translationX);
        }
        if (i10 == 48) {
            return f(view2, translationY - i11, translationY, translationY);
        }
        if (i10 == 80) {
            return f(view2, i11 + translationY, translationY, translationY);
        }
        if (i10 == 8388611) {
            return e(view2, j(view) ? i11 + translationX : translationX - i11, translationX, translationX);
        }
        if (i10 == 8388613) {
            return e(view2, j(view) ? translationX - i11 : i11 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i10);
    }

    private static Animator d(View view, View view2, int i10, @t0 int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return e(view2, translationX, translationX - i11, translationX);
        }
        if (i10 == 5) {
            return e(view2, translationX, i11 + translationX, translationX);
        }
        if (i10 == 48) {
            return f(view2, translationY, i11 + translationY, translationY);
        }
        if (i10 == 80) {
            return f(view2, translationY, translationY - i11, translationY);
        }
        if (i10 == 8388611) {
            return e(view2, translationX, j(view) ? translationX - i11 : i11 + translationX, translationX);
        }
        if (i10 == 8388613) {
            return e(view2, translationX, j(view) ? i11 + translationX : translationX - i11, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i10);
    }

    private static Animator e(View view, float f10, float f11, float f12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, f12));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator f(View view, float f10, float f11, float f12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new b(view, f12));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int h(Context context) {
        int i10 = this.f56144b;
        return i10 != -1 ? i10 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean j(View view) {
        return j1.Z(view) == 1;
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator a(@n0 ViewGroup viewGroup, @n0 View view) {
        return d(viewGroup, view, this.f56143a, h(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.x
    @p0
    public Animator b(@n0 ViewGroup viewGroup, @n0 View view) {
        return c(viewGroup, view, this.f56143a, h(view.getContext()));
    }

    @t0
    public int g() {
        return this.f56144b;
    }

    public int i() {
        return this.f56143a;
    }

    public void k(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f56144b = i10;
    }

    public void l(int i10) {
        this.f56143a = i10;
    }
}
