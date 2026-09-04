package com.zhpan.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.exoplayer2.text.ttml.d;
import com.tekartik.sqflite.b;
import com.umeng.analytics.pro.ak;
import com.zhpan.indicator.base.BaseIndicatorView;
import com.zhpan.indicator.drawer.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: IndicatorView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0014J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\bR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/zhpan/indicator/IndicatorView;", "Lcom/zhpan/indicator/base/BaseIndicatorView;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/b2;", "n", "", "changed", "", d.f49793l0, "top", d.f49796n0, "bottom", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "Lch/b;", b.f98586e, "setIndicatorOptions", ak.av, "orientation", "setOrientation", "Lcom/zhpan/indicator/drawer/e;", "f", "Lcom/zhpan/indicator/drawer/e;", "mDrawerProxy", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class IndicatorView extends BaseIndicatorView {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private e mDrawerProxy;

    @i
    public IndicatorView(@dl.d Context context) {
        this(context, null, 0, 6, null);
    }

    @i
    public IndicatorView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public IndicatorView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.q(context, "context");
        ch.a.a(context, attributeSet, getF108068b());
        this.mDrawerProxy = new e(getF108068b());
    }

    public /* synthetic */ IndicatorView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void n(Canvas canvas) {
        if (getF108068b().getF35648a() == 1) {
            canvas.rotate(90.0f, getWidth() / 2.0f, getWidth() / 2.0f);
        } else if (getF108068b().getF35648a() == 3) {
            canvas.rotate(180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
    }

    @Override // com.zhpan.indicator.base.BaseIndicatorView, com.zhpan.indicator.base.a
    public void a() {
        this.mDrawerProxy = new e(getF108068b());
        super.a();
    }

    @Override // android.view.View
    protected void onDraw(@dl.d Canvas canvas) {
        f0.q(canvas, "canvas");
        super.onDraw(canvas);
        n(canvas);
        this.mDrawerProxy.c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.mDrawerProxy.a(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        com.zhpan.indicator.drawer.a.b bVarB = this.mDrawerProxy.b(i10, i11);
        setMeasuredDimension(bVarB.getMeasureWidth(), bVarB.getMeasureHeight());
    }

    @Override // com.zhpan.indicator.base.BaseIndicatorView, com.zhpan.indicator.base.a
    public void setIndicatorOptions(@dl.d ch.b options) {
        f0.q(options, "options");
        super.setIndicatorOptions(options);
        this.mDrawerProxy.e(options);
    }

    public final void setOrientation(int i10) {
        getF108068b().u(i10);
    }
}
