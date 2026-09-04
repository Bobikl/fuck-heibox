package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: MotionTiming.java */
/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f52912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f52913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private TimeInterpolator f52914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52916e;

    public j(long j10, long j11) {
        this.f52914c = null;
        this.f52915d = 0;
        this.f52916e = 1;
        this.f52912a = j10;
        this.f52913b = j11;
    }

    public j(long j10, long j11, @n0 TimeInterpolator timeInterpolator) {
        this.f52915d = 0;
        this.f52916e = 1;
        this.f52912a = j10;
        this.f52913b = j11;
        this.f52914c = timeInterpolator;
    }

    @n0
    static j b(@n0 ValueAnimator valueAnimator) {
        j jVar = new j(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        jVar.f52915d = valueAnimator.getRepeatCount();
        jVar.f52916e = valueAnimator.getRepeatMode();
        return jVar;
    }

    private static TimeInterpolator f(@n0 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return b.f52897b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return b.f52898c;
        }
        return interpolator instanceof DecelerateInterpolator ? b.f52899d : interpolator;
    }

    public void a(@n0 Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f52912a;
    }

    public long d() {
        return this.f52913b;
    }

    @p0
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f52914c;
        return timeInterpolator != null ? timeInterpolator : b.f52897b;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (c() == jVar.c() && d() == jVar.d() && g() == jVar.g() && h() == jVar.h()) {
            return e().getClass().equals(jVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f52915d;
    }

    public int h() {
        return this.f52916e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @n0
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
