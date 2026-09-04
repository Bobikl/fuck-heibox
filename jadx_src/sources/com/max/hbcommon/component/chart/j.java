package com.max.hbcommon.component.chart;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SuddleBarChartRenderer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j extends BarChartRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f67489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f67491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final RectF f67492d;

    public j(@dl.e BarDataProvider barDataProvider, @dl.e ChartAnimator chartAnimator, @dl.e ViewPortHandler viewPortHandler, float f10, int i10, int i11) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.f67489a = f10;
        this.f67490b = i10;
        this.f67491c = i11;
        this.f67492d = new RectF();
    }

    @dl.d
    private final Path d(@dl.d RectF rectF, float f10, float f11) {
        Object[] objArr = {rectF, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.On, new Class[]{RectF.class, cls, cls}, Path.class);
        if (patchProxyResultProxy.isSupported) {
            return (Path) patchProxyResultProxy.result;
        }
        float f12 = rectF.top;
        float f13 = rectF.left;
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        Path path = new Path();
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f16 = f14 - f13;
        float f17 = f15 - f12;
        float f18 = 2;
        float f19 = f16 / f18;
        if (f10 > f19) {
            f10 = f19;
        }
        float f20 = f17 / f18;
        if (f11 > f20) {
            f11 = f20;
        }
        float f21 = f16 - (f18 * f10);
        float f22 = f17 - (f18 * f11);
        path.moveTo(f14, f12 + f11);
        float f23 = -f11;
        float f24 = -f10;
        path.rQuadTo(0.0f, f23, f24, f23);
        path.rLineTo(-f21, 0.0f);
        path.rQuadTo(f24, 0.0f, f24, f11);
        path.rLineTo(0.0f, f22);
        path.rLineTo(0.0f, f11);
        path.rLineTo(f10, 0.0f);
        path.rLineTo(f21, 0.0f);
        path.rLineTo(f10, 0.0f);
        path.rLineTo(0.0f, f23);
        path.rLineTo(0.0f, -f22);
        path.close();
        return path;
    }

    public final int a() {
        return this.f67491c;
    }

    public final float b() {
        return this.f67489a;
    }

    public final int c() {
        return this.f67490b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(@dl.d Canvas c10, @dl.d IBarDataSet dataSet, int i10) {
        if (PatchProxy.proxy(new Object[]{c10, dataSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Nn, new Class[]{Canvas.class, IBarDataSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(c10, "c");
        f0.p(dataSet, "dataSet");
        Transformer transformer = this.mChart.getTransformer(dataSet.getAxisDependency());
        f0.o(transformer, "getTransformer(...)");
        this.mBarBorderPaint.setColor(dataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(dataSet.getBarBorderWidth()));
        this.mShadowPaint.setColor(dataSet.getBarShadowColor());
        boolean z10 = dataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(dataSet.getBarShadowColor());
            BarData barData = this.mChart.getBarData();
            f0.o(barData, "getBarData(...)");
            float barWidth = barData.getBarWidth() / 2.0f;
            int iMin = Math.min((int) Math.ceil((int) (dataSet.getEntryCount() * phaseX)), dataSet.getEntryCount());
            for (int i11 = 0; i11 < iMin; i11++) {
                T entryForIndex = dataSet.getEntryForIndex(i11);
                f0.o(entryForIndex, "getEntryForIndex(...)");
                float x10 = ((BarEntry) entryForIndex).getX();
                RectF rectF = this.f67492d;
                rectF.left = x10 - barWidth;
                rectF.right = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.f67492d.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.f67492d.left)) {
                        break;
                    }
                    this.f67492d.top = this.mViewPortHandler.contentTop();
                    this.f67492d.bottom = this.mViewPortHandler.contentBottom();
                    RectF rectF2 = this.mBarRect;
                    float f10 = this.f67489a;
                    c10.drawRoundRect(rectF2, f10, f10, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i10];
        f0.o(barBuffer, "get(...)");
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i10);
        barBuffer.setInverted(this.mChart.isInverted(dataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(dataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        for (int i12 = 0; i12 < barBuffer.size(); i12 += 4) {
            int i13 = i12 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i13])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i12])) {
                    return;
                }
                Paint paint = this.mRenderPaint;
                float[] fArr = barBuffer.buffer;
                int i14 = i12 + 3;
                int i15 = i12 + 1;
                paint.setShader(new LinearGradient(fArr[i12], fArr[i14], fArr[i13], fArr[i15], this.f67490b, this.f67491c, Shader.TileMode.CLAMP));
                float[] fArr2 = barBuffer.buffer;
                RectF rectF3 = new RectF(fArr2[i12], fArr2[i15], fArr2[i13], fArr2[i14]);
                float f11 = this.f67489a;
                c10.drawPath(d(rectF3, f11, f11), this.mRenderPaint);
                if (z10) {
                    float[] fArr3 = barBuffer.buffer;
                    RectF rectF4 = new RectF(fArr3[i12], fArr3[i15], fArr3[i13], fArr3[i14]);
                    float f12 = this.f67489a;
                    c10.drawPath(d(rectF4, f12, f12), this.mBarBorderPaint);
                }
            }
        }
    }

    public final void e(int i10) {
        this.f67491c = i10;
    }

    public final void f(float f10) {
        this.f67489a = f10;
    }

    public final void g(int i10) {
        this.f67490b = i10;
    }
}
