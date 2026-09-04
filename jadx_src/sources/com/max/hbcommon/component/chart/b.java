package com.max.hbcommon.component.chart;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: HeyBoxLineChartRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends LineChartRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f67448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<IDataSet, C0542b> f67449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f67450c;

    /* JADX INFO: renamed from: com.max.hbcommon.component.chart.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HeyBoxLineChartRenderer.java */
    public class C0542b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Path f67451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap[] f67452b;

        private C0542b() {
            this.f67451a = new Path();
        }

        public void a(ILineDataSet iLineDataSet, boolean z10, boolean z11) {
            Object[] objArr = {iLineDataSet, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Tm, new Class[]{ILineDataSet.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i10 = 0; i10 < circleColorCount; i10++) {
                int i11 = (int) (((double) circleRadius) * 2.4d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.f67452b[i10] = bitmapCreateBitmap;
                ((DataRenderer) b.this).mRenderPaint.setColor(iLineDataSet.getCircleColor(i10));
                if (z11) {
                    this.f67451a.reset();
                    this.f67451a.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.f67451a.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.f67451a, ((DataRenderer) b.this).mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, ((DataRenderer) b.this).mRenderPaint);
                    if (z10) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, ((LineChartRenderer) b.this).mCirclePaintInner);
                    }
                }
            }
        }

        public Bitmap b(int i10) {
            Bitmap[] bitmapArr = this.f67452b;
            return bitmapArr[i10 % bitmapArr.length];
        }

        public boolean c(ILineDataSet iLineDataSet) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iLineDataSet}, this, changeQuickRedirect, false, bb.c.d.Sm, new Class[]{ILineDataSet.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int circleColorCount = iLineDataSet.getCircleColorCount();
            Bitmap[] bitmapArr = this.f67452b;
            if (bitmapArr == null) {
                this.f67452b = new Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.f67452b = new Bitmap[circleColorCount];
            return true;
        }
    }

    public b(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        this.f67449b = new HashMap<>();
        this.f67450c = new float[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCircles(Canvas canvas) {
        C0542b c0542b;
        Bitmap bitmapB;
        char c10 = 0;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Rm, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.f67450c;
        float f10 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List<T> dataSets = this.mChart.getLineData().getDataSets();
        int i10 = 0;
        while (i10 < dataSets.size()) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i10);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                boolean z10 = (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius >= circleRadius || circleHoleRadius <= f10) ? c10 : 1;
                boolean z11 = (z10 == 0 || iLineDataSet.getCircleHoleColor() != 1122867) ? c10 : 1;
                if (this.f67449b.containsKey(iLineDataSet)) {
                    c0542b = this.f67449b.get(iLineDataSet);
                } else {
                    C0542b c0542b2 = new C0542b();
                    this.f67449b.put(iLineDataSet, c0542b2);
                    c0542b = c0542b2;
                }
                if (c0542b.c(iLineDataSet)) {
                    c0542b.a(iLineDataSet, z10, z11);
                }
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                int i11 = xBounds.range;
                int i12 = xBounds.min;
                int i13 = i11 + i12;
                while (i12 <= i13) {
                    ?? entryForIndex = iLineDataSet.getEntryForIndex(i12);
                    if (entryForIndex == 0) {
                        break;
                    }
                    this.f67450c[c10] = entryForIndex.getX();
                    this.f67450c[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.f67450c);
                    if (!this.mViewPortHandler.isInBoundsRight(this.f67450c[c10])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.f67450c[c10]) && this.mViewPortHandler.isInBoundsY(this.f67450c[1]) && (bitmapB = c0542b.b(i12)) != null) {
                        float[] fArr2 = this.f67450c;
                        canvas.drawBitmap(bitmapB, fArr2[c10] - circleRadius, fArr2[1] - circleRadius, (Paint) null);
                    }
                    i12++;
                    c10 = 0;
                }
            }
            i10++;
            f10 = 0.0f;
            c10 = 0;
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Pm, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != chartWidth || bitmapCreateBitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig);
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (T t10 : this.mChart.getLineData().getDataSets()) {
            if (t10.isVisible()) {
                drawDataSet(canvas, t10);
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.mRenderPaint);
    }

    public boolean e() {
        return this.f67448a;
    }

    public void f(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Om, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67448a = z10;
        if (z10) {
            this.mRenderPaint.setShadowLayer(Utils.convertDpToPixel(1.0f), 0.0f, Utils.convertDpToPixel(1.0f), 855638016);
        } else {
            this.mRenderPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void releaseBitmap() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Qm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
