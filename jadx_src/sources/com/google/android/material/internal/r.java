package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.util.Collection;

/* JADX INFO: compiled from: MultiViewUpdateListener.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class r implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f54530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View[] f54531c;

    /* JADX INFO: compiled from: MultiViewUpdateListener.java */
    public interface a {
        void a(@n0 ValueAnimator valueAnimator, @n0 View view);
    }

    @SuppressLint({"LambdaLast"})
    public r(@n0 a aVar, @n0 Collection<View> collection) {
        this.f54530b = aVar;
        this.f54531c = (View[]) collection.toArray(new View[0]);
    }

    @SuppressLint({"LambdaLast"})
    public r(@n0 a aVar, @n0 View... viewArr) {
        this.f54530b = aVar;
        this.f54531c = viewArr;
    }

    @n0
    public static r e(@n0 Collection<View> collection) {
        return new r(new q(), collection);
    }

    @n0
    public static r f(@n0 View... viewArr) {
        return new r(new q(), viewArr);
    }

    @n0
    public static r g(@n0 Collection<View> collection) {
        return new r(new o(), collection);
    }

    @n0
    public static r h(@n0 View... viewArr) {
        return new r(new o(), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(@n0 ValueAnimator valueAnimator, @n0 View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(@n0 ValueAnimator valueAnimator, @n0 View view) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f10.floatValue());
        view.setScaleY(f10.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(@n0 ValueAnimator valueAnimator, @n0 View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(@n0 ValueAnimator valueAnimator, @n0 View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @n0
    public static r m(@n0 Collection<View> collection) {
        return new r(new n(), collection);
    }

    @n0
    public static r n(@n0 View... viewArr) {
        return new r(new n(), viewArr);
    }

    @n0
    public static r o(@n0 Collection<View> collection) {
        return new r(new p(), collection);
    }

    @n0
    public static r p(@n0 View... viewArr) {
        return new r(new p(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
        for (View view : this.f54531c) {
            this.f54530b.a(valueAnimator, view);
        }
    }
}
