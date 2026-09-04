package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.n0;
import androidx.annotation.x;
import com.google.android.material.color.m;

/* JADX INFO: compiled from: CircularDrawingDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends g<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f54748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f54749f;

    public c(@n0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f54746c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.save();
        canvas.rotate(f12);
        float f13 = this.f54749f;
        float f14 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f13 - f14, f11, f13 + f14, -f11), f11, f11, paint);
        canvas.restore();
    }

    private int i() {
        S s10 = this.f54801a;
        return ((CircularProgressIndicatorSpec) s10).f54732g + (((CircularProgressIndicatorSpec) s10).f54733h * 2);
    }

    @Override // com.google.android.material.progressindicator.g
    public void a(@n0 Canvas canvas, @n0 Rect rect, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        float fWidth = rect.width() / e();
        float fHeight = rect.height() / d();
        S s10 = this.f54801a;
        float f11 = (((CircularProgressIndicatorSpec) s10).f54732g / 2.0f) + ((CircularProgressIndicatorSpec) s10).f54733h;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s11 = this.f54801a;
        this.f54746c = ((CircularProgressIndicatorSpec) s11).f54734i == 0 ? 1 : -1;
        this.f54747d = ((CircularProgressIndicatorSpec) s11).f54740a * f10;
        this.f54748e = ((CircularProgressIndicatorSpec) s11).f54741b * f10;
        this.f54749f = (((CircularProgressIndicatorSpec) s11).f54732g - ((CircularProgressIndicatorSpec) s11).f54740a) / 2.0f;
        if ((this.f54802b.n() && ((CircularProgressIndicatorSpec) this.f54801a).f54744e == 2) || (this.f54802b.m() && ((CircularProgressIndicatorSpec) this.f54801a).f54745f == 1)) {
            this.f54749f += ((1.0f - f10) * ((CircularProgressIndicatorSpec) this.f54801a).f54740a) / 2.0f;
        } else if ((this.f54802b.n() && ((CircularProgressIndicatorSpec) this.f54801a).f54744e == 1) || (this.f54802b.m() && ((CircularProgressIndicatorSpec) this.f54801a).f54745f == 2)) {
            this.f54749f -= ((1.0f - f10) * ((CircularProgressIndicatorSpec) this.f54801a).f54740a) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.g
    void b(@n0 Canvas canvas, @n0 Paint paint, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, @androidx.annotation.l int i10) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f54747d);
        int i11 = this.f54746c;
        float f12 = f10 * 360.0f * i11;
        float f13 = (f11 >= f10 ? f11 - f10 : (1.0f + f11) - f10) * 360.0f * i11;
        float f14 = this.f54749f;
        canvas.drawArc(new RectF(-f14, -f14, f14, f14), f12, f13, false, paint);
        if (this.f54748e <= 0.0f || Math.abs(f13) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.f54747d, this.f54748e, f12);
        h(canvas, paint, this.f54747d, this.f54748e, f12 + f13);
    }

    @Override // com.google.android.material.progressindicator.g
    void c(@n0 Canvas canvas, @n0 Paint paint) {
        int iA = m.a(((CircularProgressIndicatorSpec) this.f54801a).f54743d, this.f54802b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iA);
        paint.setStrokeWidth(this.f54747d);
        float f10 = this.f54749f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.g
    public int d() {
        return i();
    }

    @Override // com.google.android.material.progressindicator.g
    public int e() {
        return i();
    }
}
