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

/* JADX INFO: compiled from: RectDrawer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/zhpan/indicator/drawer/g;", "Lcom/zhpan/indicator/drawer/a;", "Landroid/graphics/Canvas;", "canvas", "", "i", "Lkotlin/b2;", "v", "pageSize", "x", "t", "q", "r", "y", RXScreenCaptureService.KEY_WIDTH, ak.aF, "", "rx", "ry", ak.aG, ak.aB, "Landroid/graphics/RectF;", "j", "Landroid/graphics/RectF;", ak.aD, "()Landroid/graphics/RectF;", androidx.exifinterface.media.a.W4, "(Landroid/graphics/RectF;)V", "mRectF", "Lch/b;", "indicatorOptions", "<init>", "(Lch/b;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public class g extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private RectF mRectF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d ch.b indicatorOptions) {
        super(indicatorOptions);
        f0.q(indicatorOptions, "indicatorOptions");
        this.mRectF = new RectF();
    }

    private final void q(Canvas canvas) {
        getMPaint().setColor(getF108081f().getF35653f());
        int f35650c = getF108081f().getF35650c();
        if (f35650c == 2) {
            w(canvas);
        } else if (f35650c == 3) {
            y(canvas);
        } else {
            if (f35650c != 5) {
                return;
            }
            r(canvas);
        }
    }

    private final void r(Canvas canvas) {
        int f35658k = getF108081f().getF35658k();
        float f35659l = getF108081f().getF35659l();
        float f10 = f35658k;
        float minWidth = (getMinWidth() * f10) + (f10 * getF108081f().getF35654g());
        if (f35659l < 0.99d) {
            ArgbEvaluator argbEvaluator = getArgbEvaluator();
            Object objEvaluate = argbEvaluator != null ? argbEvaluator.evaluate(f35659l, Integer.valueOf(getF108081f().getF35653f()), Integer.valueOf(getF108081f().getF35652e())) : null;
            Paint mPaint = getMPaint();
            if (objEvaluate == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            mPaint.setColor(((Integer) objEvaluate).intValue());
            this.mRectF.set(minWidth, 0.0f, getMinWidth() + minWidth, getF108081f().m());
            u(canvas, getF108081f().m(), getF108081f().m());
        }
        float f35654g = minWidth + getF108081f().getF35654g() + getF108081f().getF35656i();
        if (f35658k == getF108081f().getF35651d() - 1) {
            f35654g = 0.0f;
        }
        ArgbEvaluator argbEvaluator2 = getArgbEvaluator();
        Object objEvaluate2 = argbEvaluator2 != null ? argbEvaluator2.evaluate(1 - f35659l, Integer.valueOf(getF108081f().getF35653f()), Integer.valueOf(getF108081f().getF35652e())) : null;
        Paint mPaint2 = getMPaint();
        if (objEvaluate2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        mPaint2.setColor(((Integer) objEvaluate2).intValue());
        this.mRectF.set(f35654g, 0.0f, getMinWidth() + f35654g, getF108081f().m());
        u(canvas, getF108081f().m(), getF108081f().m());
    }

    private final void t(Canvas canvas, int i10) {
        int i11 = 0;
        float f35654g = 0.0f;
        while (i11 < i10) {
            float maxWidth = i11 == getF108081f().getF35658k() ? getMaxWidth() : getMinWidth();
            getMPaint().setColor(i11 == getF108081f().getF35658k() ? getF108081f().getF35653f() : getF108081f().getF35652e());
            this.mRectF.set(f35654g, 0.0f, f35654g + maxWidth, getF108081f().m());
            u(canvas, getF108081f().m(), getF108081f().m());
            f35654g += maxWidth + getF108081f().getF35654g();
            i11++;
        }
    }

    private final void v(Canvas canvas, int i10) {
        float f35659l;
        int f35653f = getF108081f().getF35653f();
        float f35654g = getF108081f().getF35654g();
        float fM = getF108081f().m();
        int f35658k = getF108081f().getF35658k();
        float f35656i = getF108081f().getF35656i();
        float f35657j = getF108081f().getF35657j();
        if (i10 < f35658k) {
            getMPaint().setColor(getF108081f().getF35652e());
            if (f35658k == getF108081f().getF35651d() - 1) {
                float f10 = i10;
                f35659l = (f10 * f35656i) + (f10 * f35654g) + ((f35657j - f35656i) * getF108081f().getF35659l());
            } else {
                float f11 = i10;
                f35659l = (f11 * f35656i) + (f11 * f35654g);
            }
            this.mRectF.set(f35659l, 0.0f, f35656i + f35659l, fM);
            u(canvas, fM, fM);
            return;
        }
        if (i10 != f35658k) {
            if (f35658k + 1 != i10 || getF108081f().getF35659l() == 0.0f) {
                getMPaint().setColor(getF108081f().getF35652e());
                float f12 = i10;
                float minWidth = (getMinWidth() * f12) + (f12 * f35654g) + (f35657j - getMinWidth());
                this.mRectF.set(minWidth, 0.0f, getMinWidth() + minWidth, fM);
                u(canvas, fM, fM);
                return;
            }
            return;
        }
        getMPaint().setColor(f35653f);
        float f35659l2 = getF108081f().getF35659l();
        if (f35658k == getF108081f().getF35651d() - 1) {
            ArgbEvaluator argbEvaluator = getArgbEvaluator();
            Object objEvaluate = argbEvaluator != null ? argbEvaluator.evaluate(f35659l2, Integer.valueOf(f35653f), Integer.valueOf(getF108081f().getF35652e())) : null;
            Paint mPaint = getMPaint();
            if (objEvaluate == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            mPaint.setColor(((Integer) objEvaluate).intValue());
            float f35651d = ((getF108081f().getF35651d() - 1) * (getF108081f().getF35654g() + f35656i)) + f35657j;
            this.mRectF.set((f35651d - f35657j) + ((f35657j - f35656i) * f35659l2), 0.0f, f35651d, fM);
            u(canvas, fM, fM);
        } else {
            float f13 = 1;
            if (f35659l2 < f13) {
                ArgbEvaluator argbEvaluator2 = getArgbEvaluator();
                Object objEvaluate2 = argbEvaluator2 != null ? argbEvaluator2.evaluate(f35659l2, Integer.valueOf(f35653f), Integer.valueOf(getF108081f().getF35652e())) : null;
                Paint mPaint2 = getMPaint();
                if (objEvaluate2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                mPaint2.setColor(((Integer) objEvaluate2).intValue());
                float f14 = i10;
                float f15 = (f14 * f35656i) + (f14 * f35654g);
                this.mRectF.set(f15, 0.0f, f15 + f35656i + ((f35657j - f35656i) * (f13 - f35659l2)), fM);
                u(canvas, fM, fM);
            }
        }
        if (f35658k == getF108081f().getF35651d() - 1) {
            if (f35659l2 > 0) {
                ArgbEvaluator argbEvaluator3 = getArgbEvaluator();
                Object objEvaluate3 = argbEvaluator3 != null ? argbEvaluator3.evaluate(1 - f35659l2, Integer.valueOf(f35653f), Integer.valueOf(getF108081f().getF35652e())) : null;
                Paint mPaint3 = getMPaint();
                if (objEvaluate3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                mPaint3.setColor(((Integer) objEvaluate3).intValue());
                this.mRectF.set(0.0f, 0.0f, f35656i + 0.0f + ((f35657j - f35656i) * f35659l2), fM);
                u(canvas, fM, fM);
                return;
            }
            return;
        }
        if (f35659l2 > 0) {
            ArgbEvaluator argbEvaluator4 = getArgbEvaluator();
            Object objEvaluate4 = argbEvaluator4 != null ? argbEvaluator4.evaluate(1 - f35659l2, Integer.valueOf(f35653f), Integer.valueOf(getF108081f().getF35652e())) : null;
            Paint mPaint4 = getMPaint();
            if (objEvaluate4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            mPaint4.setColor(((Integer) objEvaluate4).intValue());
            float f16 = i10;
            float f17 = (f16 * f35656i) + (f16 * f35654g) + f35656i + f35654g + f35657j;
            this.mRectF.set((f17 - f35656i) - ((f35657j - f35656i) * f35659l2), 0.0f, f17, fM);
            u(canvas, fM, fM);
        }
    }

    private final void w(Canvas canvas) {
        int f35658k = getF108081f().getF35658k();
        float f35654g = getF108081f().getF35654g();
        float fM = getF108081f().m();
        float f10 = f35658k;
        float maxWidth = (getMaxWidth() * f10) + (f10 * f35654g) + ((getMaxWidth() + f35654g) * getF108081f().getF35659l());
        this.mRectF.set(maxWidth, 0.0f, getMaxWidth() + maxWidth, fM);
        u(canvas, fM, fM);
    }

    private final void x(Canvas canvas, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            getMPaint().setColor(getF108081f().getF35652e());
            float f10 = i11;
            float maxWidth = (getMaxWidth() * f10) + (f10 * getF108081f().getF35654g()) + (getMaxWidth() - getMinWidth());
            this.mRectF.set(maxWidth, 0.0f, getMinWidth() + maxWidth, getF108081f().m());
            u(canvas, getF108081f().m(), getF108081f().m());
        }
    }

    private final void y(Canvas canvas) {
        float fM = getF108081f().m();
        float f35659l = getF108081f().getF35659l();
        int f35658k = getF108081f().getF35658k();
        float f35654g = getF108081f().getF35654g() + getF108081f().getF35656i();
        float fB = dh.a.f118516a.b(getF108081f(), getMaxWidth(), f35658k);
        float f10 = 2;
        this.mRectF.set((u.t(((f35659l - 0.5f) * f35654g) * 2.0f, 0.0f) + fB) - (getF108081f().getF35656i() / f10), 0.0f, fB + u.A(f35659l * f35654g * 2.0f, f35654g) + (getF108081f().getF35656i() / f10), fM);
        u(canvas, fM, fM);
    }

    public final void A(@dl.d RectF rectF) {
        f0.q(rectF, "<set-?>");
        this.mRectF = rectF;
    }

    @Override // com.zhpan.indicator.drawer.f
    public void c(@dl.d Canvas canvas) {
        f0.q(canvas, "canvas");
        int f35651d = getF108081f().getF35651d();
        if (f35651d > 1 || (getF108081f().getF35660m() && f35651d == 1)) {
            if (i() && getF108081f().getF35650c() != 0) {
                x(canvas, f35651d);
                q(canvas);
            } else {
                if (getF108081f().getF35650c() != 4) {
                    t(canvas, f35651d);
                    return;
                }
                for (int i10 = 0; i10 < f35651d; i10++) {
                    v(canvas, i10);
                }
            }
        }
    }

    protected void s(@dl.d Canvas canvas) {
        f0.q(canvas, "canvas");
    }

    protected void u(@dl.d Canvas canvas, float f10, float f11) {
        f0.q(canvas, "canvas");
        s(canvas);
    }

    @dl.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public final RectF getMRectF() {
        return this.mRectF;
    }
}
