package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.n0;
import androidx.annotation.x;
import com.google.android.material.color.m;

/* JADX INFO: compiled from: LinearDrawingDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j extends g<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f54810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f54811f;

    public j(@n0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f54808c = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.g
    public void a(@n0 Canvas canvas, @n0 Rect rect, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f54808c = rect.width();
        float f11 = ((LinearProgressIndicatorSpec) this.f54801a).f54740a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f54801a).f54740a) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f54801a).f54738i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f54802b.n() && ((LinearProgressIndicatorSpec) this.f54801a).f54744e == 1) || (this.f54802b.m() && ((LinearProgressIndicatorSpec) this.f54801a).f54745f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f54802b.n() || this.f54802b.m()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f54801a).f54740a * (f10 - 1.0f)) / 2.0f);
        }
        float f12 = this.f54808c;
        canvas.clipRect((-f12) / 2.0f, (-f11) / 2.0f, f12 / 2.0f, f11 / 2.0f);
        S s10 = this.f54801a;
        this.f54809d = ((LinearProgressIndicatorSpec) s10).f54740a * f10;
        this.f54810e = ((LinearProgressIndicatorSpec) s10).f54741b * f10;
    }

    @Override // com.google.android.material.progressindicator.g
    public void b(@n0 Canvas canvas, @n0 Paint paint, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, @androidx.annotation.l int i10) {
        if (f10 == f11) {
            return;
        }
        float f12 = this.f54808c;
        float f13 = (-f12) / 2.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        canvas.save();
        canvas.clipPath(this.f54811f);
        float f14 = this.f54809d;
        RectF rectF = new RectF(((f10 * f12) + f13) - (this.f54810e * 2.0f), (-f14) / 2.0f, f13 + (f11 * f12), f14 / 2.0f);
        float f15 = this.f54810e;
        canvas.drawRoundRect(rectF, f15, f15, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.g
    void c(@n0 Canvas canvas, @n0 Paint paint) {
        int iA = m.a(((LinearProgressIndicatorSpec) this.f54801a).f54743d, this.f54802b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iA);
        Path path = new Path();
        this.f54811f = path;
        float f10 = this.f54808c;
        float f11 = this.f54809d;
        RectF rectF = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
        float f12 = this.f54810e;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CCW);
        canvas.drawPath(this.f54811f, paint);
    }

    @Override // com.google.android.material.progressindicator.g
    public int d() {
        return ((LinearProgressIndicatorSpec) this.f54801a).f54740a;
    }

    @Override // com.google.android.material.progressindicator.g
    public int e() {
        return -1;
    }
}
