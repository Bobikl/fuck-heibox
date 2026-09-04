package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ExpandCollapseAnimationHelper.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f54495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f54496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<AnimatorListenerAdapter> f54497c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<View> f54498d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private ValueAnimator.AnimatorUpdateListener f54499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54502h;

    /* JADX INFO: compiled from: ExpandCollapseAnimationHelper.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.f54496b.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: ExpandCollapseAnimationHelper.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.f54496b.setVisibility(8);
        }
    }

    public g(@n0 View view, @n0 View view2) {
        this.f54495a = view;
        this.f54496b = view2;
    }

    private void f(Animator animator, List<AnimatorListenerAdapter> list) {
        Iterator<AnimatorListenerAdapter> it = list.iterator();
        while (it.hasNext()) {
            animator.addListener(it.next());
        }
    }

    private AnimatorSet g(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(k(z10), l(z10), i(z10));
        return animatorSet;
    }

    private Animator i(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f54496b.getLeft() - this.f54495a.getLeft()) + (this.f54495a.getRight() - this.f54496b.getRight()), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(r.m(this.f54498d));
        valueAnimatorOfFloat.setDuration(this.f54500f);
        valueAnimatorOfFloat.setInterpolator(w.a(z10, com.google.android.material.animation.b.f52897b));
        return valueAnimatorOfFloat;
    }

    private Animator k(boolean z10) {
        Rect rectC = j0.c(this.f54495a, this.f54501g);
        Rect rectC2 = j0.c(this.f54496b, this.f54502h);
        final Rect rect = new Rect(rectC);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new v(rect), rectC, rectC2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f54492b.m(rect, valueAnimator);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f54499e;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.f54500f);
        valueAnimatorOfObject.setInterpolator(w.a(z10, com.google.android.material.animation.b.f52897b));
        return valueAnimatorOfObject;
    }

    private Animator l(boolean z10) {
        List<View> listI = j0.i(this.f54496b);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(r.e(listI));
        valueAnimatorOfFloat.setDuration(this.f54500f);
        valueAnimatorOfFloat.setInterpolator(w.a(z10, com.google.android.material.animation.b.f52896a));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Rect rect, ValueAnimator valueAnimator) {
        j0.w(this.f54496b, rect);
    }

    @s9.a
    @n0
    public g c(@n0 Collection<View> collection) {
        this.f54498d.addAll(collection);
        return this;
    }

    @s9.a
    @n0
    public g d(@n0 View... viewArr) {
        Collections.addAll(this.f54498d, viewArr);
        return this;
    }

    @s9.a
    @n0
    public g e(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.f54497c.add(animatorListenerAdapter);
        return this;
    }

    @n0
    public Animator h() {
        AnimatorSet animatorSetG = g(false);
        animatorSetG.addListener(new b());
        f(animatorSetG, this.f54497c);
        return animatorSetG;
    }

    @n0
    public Animator j() {
        AnimatorSet animatorSetG = g(true);
        animatorSetG.addListener(new a());
        f(animatorSetG, this.f54497c);
        return animatorSetG;
    }

    @s9.a
    @n0
    public g n(@p0 ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f54499e = animatorUpdateListener;
        return this;
    }

    @s9.a
    @n0
    public g o(int i10) {
        this.f54501g = i10;
        return this;
    }

    @s9.a
    @n0
    public g p(long j10) {
        this.f54500f = j10;
        return this;
    }

    @s9.a
    @n0
    public g q(int i10) {
        this.f54502h = i10;
        return this;
    }
}
