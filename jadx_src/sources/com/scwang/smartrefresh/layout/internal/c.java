package com.scwang.smartrefresh.layout.internal;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ProgressDrawable.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends b implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ValueAnimator f96790f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f96787c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f96788d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f96789e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Path f96791g = new Path();

    public c() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f96790f = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        this.f96790f.setInterpolator(null);
        this.f96790f.setRepeatCount(-1);
        this.f96790f.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f10 = iWidth;
        float fMax = Math.max(1.0f, f10 / 22.0f);
        if (this.f96787c != iWidth || this.f96788d != iHeight) {
            this.f96791g.reset();
            float f11 = f10 - fMax;
            float f12 = iHeight / 2.0f;
            this.f96791g.addCircle(f11, f12, fMax, Path.Direction.CW);
            float f13 = f10 - (5.0f * fMax);
            this.f96791g.addRect(f13, f12 - fMax, f11, f12 + fMax, Path.Direction.CW);
            this.f96791g.addCircle(f13, f12, fMax, Path.Direction.CW);
            this.f96787c = iWidth;
            this.f96788d = iHeight;
        }
        canvas.save();
        float f14 = f10 / 2.0f;
        float f15 = iHeight / 2.0f;
        canvas.rotate(this.f96789e, f14, f15);
        for (int i10 = 0; i10 < 12; i10++) {
            this.f96786b.setAlpha((i10 + 5) * 17);
            canvas.rotate(30.0f, f14, f15);
            canvas.drawPath(this.f96791g, this.f96786b);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f96790f.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f96789e = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f96790f.isRunning()) {
            return;
        }
        this.f96790f.addUpdateListener(this);
        this.f96790f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f96790f.isRunning()) {
            this.f96790f.removeAllListeners();
            this.f96790f.removeAllUpdateListeners();
            this.f96790f.cancel();
        }
    }
}
