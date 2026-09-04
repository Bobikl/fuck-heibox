package com.zhpan.indicator.drawer;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import fi.u;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CircleDrawer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/zhpan/indicator/drawer/b;", "Lcom/zhpan/indicator/drawer/a;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/b2;", "t", "v", ak.aB, ak.aG, "r", RXScreenCaptureService.KEY_WIDTH, "", "coordinateX", "coordinateY", "radius", "q", "", "j", ak.aF, "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "Lch/b;", "indicatorOptions", "<init>", "(Lch/b;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class b extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final RectF rectF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d ch.b indicatorOptions) {
        super(indicatorOptions);
        f0.q(indicatorOptions, "indicatorOptions");
        this.rectF = new RectF();
    }

    private final void q(Canvas canvas, float f10, float f11, float f12) {
        float f13 = 3;
        canvas.drawCircle(f10 + f13, f11 + f13, f12, getMPaint());
    }

    private final void r(Canvas canvas) {
        int f35658k = getF108081f().getF35658k();
        dh.a aVar = dh.a.f118516a;
        float fB = aVar.b(getF108081f(), getMaxWidth(), f35658k);
        q(canvas, fB + ((aVar.b(getF108081f(), getMaxWidth(), (f35658k + 1) % getF108081f().getF35651d()) - fB) * getF108081f().getF35659l()), aVar.c(getMaxWidth()), getF108081f().getF35657j() / 2);
    }

    private final void s(Canvas canvas) {
        int f35658k = getF108081f().getF35658k();
        float f35659l = getF108081f().getF35659l();
        dh.a aVar = dh.a.f118516a;
        float fB = aVar.b(getF108081f(), getMaxWidth(), f35658k);
        float fC = aVar.c(getMaxWidth());
        ArgbEvaluator argbEvaluator = getArgbEvaluator();
        Object objEvaluate = argbEvaluator != null ? argbEvaluator.evaluate(f35659l, Integer.valueOf(getF108081f().getF35653f()), Integer.valueOf(getF108081f().getF35652e())) : null;
        Paint mPaint = getMPaint();
        if (objEvaluate == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        mPaint.setColor(((Integer) objEvaluate).intValue());
        float f10 = 2;
        q(canvas, fB, fC, getF108081f().getF35656i() / f10);
        ArgbEvaluator argbEvaluator2 = getArgbEvaluator();
        Object objEvaluate2 = argbEvaluator2 != null ? argbEvaluator2.evaluate(1 - f35659l, Integer.valueOf(getF108081f().getF35653f()), Integer.valueOf(getF108081f().getF35652e())) : null;
        Paint mPaint2 = getMPaint();
        if (objEvaluate2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        mPaint2.setColor(((Integer) objEvaluate2).intValue());
        q(canvas, f35658k == getF108081f().getF35651d() - 1 ? aVar.b(getF108081f(), getMaxWidth(), 0) : getF108081f().getF35656i() + fB + getF108081f().getF35654g(), fC, getF108081f().getF35657j() / f10);
    }

    private final void t(Canvas canvas) {
        float f35656i = getF108081f().getF35656i();
        getMPaint().setColor(getF108081f().getF35652e());
        int f35651d = getF108081f().getF35651d();
        for (int i10 = 0; i10 < f35651d; i10++) {
            dh.a aVar = dh.a.f118516a;
            q(canvas, aVar.b(getF108081f(), getMaxWidth(), i10), aVar.c(getMaxWidth()), f35656i / 2);
        }
    }

    private final void u(Canvas canvas) {
        Object objEvaluate;
        int f35658k = getF108081f().getF35658k();
        float f35659l = getF108081f().getF35659l();
        dh.a aVar = dh.a.f118516a;
        float fB = aVar.b(getF108081f(), getMaxWidth(), f35658k);
        float fC = aVar.c(getMaxWidth());
        if (f35659l < 1) {
            ArgbEvaluator argbEvaluator = getArgbEvaluator();
            Object objEvaluate2 = argbEvaluator != null ? argbEvaluator.evaluate(f35659l, Integer.valueOf(getF108081f().getF35653f()), Integer.valueOf(getF108081f().getF35652e())) : null;
            Paint mPaint = getMPaint();
            if (objEvaluate2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            mPaint.setColor(((Integer) objEvaluate2).intValue());
            float f10 = 2;
            q(canvas, fB, fC, (getF108081f().getF35657j() / f10) - (((getF108081f().getF35657j() / f10) - (getF108081f().getF35656i() / f10)) * f35659l));
        }
        if (f35658k == getF108081f().getF35651d() - 1) {
            ArgbEvaluator argbEvaluator2 = getArgbEvaluator();
            objEvaluate = argbEvaluator2 != null ? argbEvaluator2.evaluate(f35659l, Integer.valueOf(getF108081f().getF35652e()), Integer.valueOf(getF108081f().getF35653f())) : null;
            Paint mPaint2 = getMPaint();
            if (objEvaluate == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            mPaint2.setColor(((Integer) objEvaluate).intValue());
            float f11 = 2;
            q(canvas, getMaxWidth() / f11, fC, (getMinWidth() / f11) + (((getMaxWidth() / f11) - (getMinWidth() / f11)) * f35659l));
            return;
        }
        if (f35659l > 0) {
            ArgbEvaluator argbEvaluator3 = getArgbEvaluator();
            objEvaluate = argbEvaluator3 != null ? argbEvaluator3.evaluate(f35659l, Integer.valueOf(getF108081f().getF35652e()), Integer.valueOf(getF108081f().getF35653f())) : null;
            Paint mPaint3 = getMPaint();
            if (objEvaluate == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            mPaint3.setColor(((Integer) objEvaluate).intValue());
            float f12 = 2;
            q(canvas, fB + getF108081f().getF35654g() + getF108081f().getF35656i(), fC, (getF108081f().getF35656i() / f12) + (((getF108081f().getF35657j() / f12) - (getF108081f().getF35656i() / f12)) * f35659l));
        }
    }

    private final void v(Canvas canvas) {
        getMPaint().setColor(getF108081f().getF35653f());
        int f35650c = getF108081f().getF35650c();
        if (f35650c == 0 || f35650c == 2) {
            r(canvas);
            return;
        }
        if (f35650c == 3) {
            w(canvas);
        } else if (f35650c == 4) {
            u(canvas);
        } else {
            if (f35650c != 5) {
                return;
            }
            s(canvas);
        }
    }

    private final void w(Canvas canvas) {
        float f35656i = getF108081f().getF35656i();
        float f35659l = getF108081f().getF35659l();
        int f35658k = getF108081f().getF35658k();
        float f35654g = getF108081f().getF35654g() + getF108081f().getF35656i();
        float fB = dh.a.f118516a.b(getF108081f(), getMaxWidth(), f35658k);
        float f10 = 2;
        float fT = (u.t(((f35659l - 0.5f) * f35654g) * 2.0f, 0.0f) + fB) - (getF108081f().getF35656i() / f10);
        float f11 = 3;
        this.rectF.set(fT + f11, f11, fB + u.A(f35659l * f35654g * 2.0f, f35654g) + (getF108081f().getF35656i() / f10) + f11, f35656i + f11);
        canvas.drawRoundRect(this.rectF, f35656i, f35656i, getMPaint());
    }

    @Override // com.zhpan.indicator.drawer.f
    public void c(@dl.d Canvas canvas) {
        f0.q(canvas, "canvas");
        int f35651d = getF108081f().getF35651d();
        if (f35651d > 1 || (getF108081f().getF35660m() && f35651d == 1)) {
            t(canvas);
            v(canvas);
        }
    }

    @Override // com.zhpan.indicator.drawer.a
    protected int j() {
        return ((int) getMaxWidth()) + 6;
    }
}
