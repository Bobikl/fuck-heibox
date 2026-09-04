package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: BaseLottieAnimator.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends ValueAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f37824b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f37825c = new CopyOnWriteArraySet();

    void a() {
        Iterator<Animator.AnimatorListener> it = this.f37825c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f37825c.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37824b.add(animatorUpdateListener);
    }

    void b(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f37825c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void c() {
        Iterator<Animator.AnimatorListener> it = this.f37825c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void d(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f37825c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    void e() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f37824b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f37825c.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f37824b.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f37825c.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37824b.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
