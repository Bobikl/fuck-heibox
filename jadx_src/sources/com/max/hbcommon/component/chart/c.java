package com.max.hbcommon.component.chart;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.renderer.LineRadarRenderer;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HeyBoxRadarChartRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends LineRadarRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HeyBoxRadarChart f67454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Paint f67455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f67456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f67457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected RectF f67458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Path f67459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Path f67460g;

    public c(HeyBoxRadarChart heyBoxRadarChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f67459f = new Path();
        this.f67460g = new Path();
        this.f67454a = heyBoxRadarChart;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.f67455b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f67456c = new Paint(7);
        this.f67457d = new Paint(1);
        this.f67458e = new RectF();
    }

    private Bitmap a(Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.jn, new Class[]{Drawable.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.hn, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        RadarData radarData = (RadarData) this.f67454a.getData();
        int entryCount = radarData.getMaxEntryCountSet().getEntryCount();
        for (IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
            if (iRadarDataSet.isVisible()) {
                drawDataSet(canvas, iRadarDataSet, entryCount);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawDataSet(Canvas canvas, IRadarDataSet iRadarDataSet, int i10) {
        if (PatchProxy.proxy(new Object[]{canvas, iRadarDataSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.in, new Class[]{Canvas.class, IRadarDataSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.f67454a.getSliceAngle();
        float factor = this.f67454a.getFactor();
        MPPointF centerOffsets = this.f67454a.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        Path path = this.f67459f;
        path.reset();
        boolean z10 = false;
        for (int i11 = 0; i11 < iRadarDataSet.getEntryCount(); i11++) {
            this.mRenderPaint.setColor(iRadarDataSet.getColor(i11));
            Utils.getPosition(centerOffsets, (((RadarEntry) iRadarDataSet.getEntryForIndex(i11)).getY() - this.f67454a.getYChartMin()) * factor * phaseY, (i11 * sliceAngle * phaseX) + this.f67454a.getRotationAngle(), mPPointF);
            if (!Float.isNaN(mPPointF.f43143x)) {
                if (z10) {
                    path.lineTo(mPPointF.f43143x, mPPointF.f43144y);
                } else {
                    path.moveTo(mPPointF.f43143x, mPPointF.f43144y);
                    z10 = true;
                }
            }
        }
        if (iRadarDataSet.getEntryCount() > i10) {
            path.lineTo(centerOffsets.f43143x, centerOffsets.f43144y);
        }
        path.close();
        if (iRadarDataSet.isDrawFilledEnabled()) {
            Drawable fillDrawable = iRadarDataSet.getFillDrawable();
            try {
                if (fillDrawable != null) {
                    fillDrawable.setAlpha(iRadarDataSet.getFillAlpha());
                    Bitmap bitmapA = a(fillDrawable);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmapA, tileMode, tileMode);
                    float fMax = Math.max((((int) this.mViewPortHandler.contentWidth()) * 1.0f) / bitmapA.getWidth(), (((int) this.mViewPortHandler.contentHeight()) * 1.0f) / bitmapA.getHeight());
                    Matrix matrix = new Matrix();
                    matrix.setScale(fMax, fMax);
                    bitmapShader.setLocalMatrix(matrix);
                    this.f67456c.setShader(bitmapShader);
                    canvas.drawPath(path, this.f67456c);
                } else {
                    this.f67456c.setColor((iRadarDataSet.getFillAlpha() << 24) | (iRadarDataSet.getFillColor() & 16777215));
                    this.f67456c.setStyle(Paint.Style.FILL);
                    canvas.drawPath(path, this.f67456c);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.mRenderPaint.setAlpha(iRadarDataSet.getFillAlpha());
                canvas.drawPath(path, this.mRenderPaint);
            }
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.ln, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        drawWeb(canvas);
    }

    public void drawHighlightCircle(Canvas canvas, MPPointF mPPointF, float f10, float f11, int i10, int i11, float f12) {
        Object[] objArr = {canvas, mPPointF, new Float(f10), new Float(f11), new Integer(i10), new Integer(i11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.on, new Class[]{Canvas.class, MPPointF.class, cls, cls, cls2, cls2, cls}, Void.TYPE).isSupported) {
            return;
        }
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(f11);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(f10);
        if (i10 != 1122867) {
            Path path = this.f67460g;
            path.reset();
            path.addCircle(mPPointF.f43143x, mPPointF.f43144y, fConvertDpToPixel, Path.Direction.CW);
            if (fConvertDpToPixel2 > 0.0f) {
                path.addCircle(mPPointF.f43143x, mPPointF.f43144y, fConvertDpToPixel2, Path.Direction.CCW);
            }
            this.f67457d.setColor(i10);
            this.f67457d.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.f67457d);
        }
        if (i11 != 1122867) {
            this.f67457d.setColor(i11);
            this.f67457d.setStyle(Paint.Style.STROKE);
            this.f67457d.setStrokeWidth(Utils.convertDpToPixel(f12));
            canvas.drawCircle(mPPointF.f43143x, mPPointF.f43144y, fConvertDpToPixel, this.f67457d);
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        if (PatchProxy.proxy(new Object[]{canvas, highlightArr}, this, changeQuickRedirect, false, bb.c.d.nn, new Class[]{Canvas.class, Highlight[].class}, Void.TYPE).isSupported) {
            return;
        }
        float sliceAngle = this.f67454a.getSliceAngle();
        float factor = this.f67454a.getFactor();
        MPPointF centerOffsets = this.f67454a.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        RadarData radarData = (RadarData) this.f67454a.getData();
        int i10 = 0;
        for (int length = highlightArr.length; i10 < length; length = length) {
            Highlight highlight = highlightArr[i10];
            IRadarDataSet dataSetByIndex = radarData.getDataSetByIndex(highlight.getDataSetIndex());
            if (dataSetByIndex != null && dataSetByIndex.isHighlightEnabled()) {
                Entry entry = (RadarEntry) dataSetByIndex.getEntryForIndex((int) highlight.getX());
                if (isInBoundsX(entry, dataSetByIndex)) {
                    Utils.getPosition(centerOffsets, (entry.getY() - this.f67454a.getYChartMin()) * factor * this.mAnimator.getPhaseY(), (highlight.getX() * sliceAngle * this.mAnimator.getPhaseX()) + this.f67454a.getRotationAngle(), mPPointF);
                    highlight.setDraw(mPPointF.f43143x, mPPointF.f43144y);
                    drawHighlightLines(canvas, mPPointF.f43143x, mPPointF.f43144y, dataSetByIndex);
                    if (dataSetByIndex.isDrawHighlightCircleEnabled() && !Float.isNaN(mPPointF.f43143x) && !Float.isNaN(mPPointF.f43144y)) {
                        int highlightCircleStrokeColor = dataSetByIndex.getHighlightCircleStrokeColor();
                        if (highlightCircleStrokeColor == 1122867) {
                            highlightCircleStrokeColor = dataSetByIndex.getColor(0);
                        }
                        if (dataSetByIndex.getHighlightCircleStrokeAlpha() < 255) {
                            highlightCircleStrokeColor = ColorTemplate.colorWithAlpha(highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeAlpha());
                        }
                        drawHighlightCircle(canvas, mPPointF, dataSetByIndex.getHighlightCircleInnerRadius(), dataSetByIndex.getHighlightCircleOuterRadius(), dataSetByIndex.getHighlightCircleFillColor(), highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeWidth());
                    }
                }
            }
            i10++;
            radarData = radarData;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        int i10;
        MPPointF mPPointF;
        float f10;
        MPPointF mPPointF2;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.kn, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.f67454a.getSliceAngle();
        float factor = this.f67454a.getFactor();
        MPPointF centerOffsets = this.f67454a.getCenterOffsets();
        MPPointF mPPointF3 = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF mPPointF4 = MPPointF.getInstance(0.0f, 0.0f);
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i12 = 0;
        while (i12 < ((RadarData) this.f67454a.getData()).getDataSetCount()) {
            IRadarDataSet dataSetByIndex = ((RadarData) this.f67454a.getData()).getDataSetByIndex(i12);
            if (shouldDrawValues(dataSetByIndex)) {
                applyValueTextStyle(dataSetByIndex);
                MPPointF mPPointF5 = MPPointF.getInstance(dataSetByIndex.getIconsOffset());
                mPPointF5.f43143x = Utils.convertDpToPixel(mPPointF5.f43143x);
                mPPointF5.f43144y = Utils.convertDpToPixel(mPPointF5.f43144y);
                int i13 = i11;
                while (i13 < dataSetByIndex.getEntryCount()) {
                    RadarEntry radarEntry = (RadarEntry) dataSetByIndex.getEntryForIndex(i13);
                    float f11 = i13 * sliceAngle * phaseX;
                    Utils.getPosition(centerOffsets, (radarEntry.getY() - this.f67454a.getYChartMin()) * factor * phaseY, f11 + this.f67454a.getRotationAngle(), mPPointF3);
                    if (dataSetByIndex.isDrawValuesEnabled()) {
                        drawValue(canvas, dataSetByIndex.getValueFormatter(), radarEntry.getY(), radarEntry, i12, mPPointF3.f43143x, mPPointF3.f43144y - fConvertDpToPixel, dataSetByIndex.getValueTextColor(i13));
                    }
                    if (radarEntry.getIcon() != null && dataSetByIndex.isDrawIconsEnabled()) {
                        Drawable icon = radarEntry.getIcon();
                        Utils.getPosition(centerOffsets, (radarEntry.getY() * factor * phaseY) + mPPointF5.f43144y, f11 + this.f67454a.getRotationAngle(), mPPointF4);
                        float f12 = mPPointF4.f43144y + mPPointF5.f43143x;
                        mPPointF4.f43144y = f12;
                        Utils.drawImage(canvas, icon, (int) mPPointF4.f43143x, (int) f12, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i13++;
                    mPPointF5 = mPPointF5;
                    mPPointF4 = mPPointF4;
                    mPPointF3 = mPPointF3;
                    phaseX = phaseX;
                    dataSetByIndex = dataSetByIndex;
                    i12 = i12;
                }
                i10 = i12;
                mPPointF = mPPointF3;
                f10 = phaseX;
                mPPointF2 = mPPointF4;
                MPPointF.recycleInstance(mPPointF5);
            } else {
                i10 = i12;
                mPPointF = mPPointF3;
                f10 = phaseX;
                mPPointF2 = mPPointF4;
            }
            i12 = i10 + 1;
            mPPointF4 = mPPointF2;
            mPPointF3 = mPPointF;
            phaseX = f10;
            i11 = 0;
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF3);
        MPPointF.recycleInstance(mPPointF4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawWeb(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.mn, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        float sliceAngle = this.f67454a.getSliceAngle();
        float factor = this.f67454a.getFactor();
        float rotationAngle = this.f67454a.getRotationAngle();
        MPPointF centerOffsets = this.f67454a.getCenterOffsets();
        this.f67455b.setStrokeWidth(this.f67454a.getWebLineWidthInner());
        this.f67455b.setColor(this.f67454a.getWebColorInner());
        this.f67455b.setAlpha(this.f67454a.getWebAlpha());
        int skipWebLineCount = 1 + this.f67454a.getSkipWebLineCount();
        int entryCount = ((RadarData) this.f67454a.getData()).getMaxEntryCountSet().getEntryCount();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i10 = 0; i10 < entryCount; i10 += skipWebLineCount) {
            Utils.getPosition(centerOffsets, this.f67454a.getYRange() * factor, (i10 * sliceAngle) + rotationAngle, mPPointF);
            canvas.drawLine(centerOffsets.f43143x, centerOffsets.f43144y, mPPointF.f43143x, mPPointF.f43144y, this.f67455b);
        }
        MPPointF.recycleInstance(mPPointF);
        this.f67455b.setStrokeWidth(this.f67454a.getWebLineWidthInner());
        this.f67455b.setColor(this.f67454a.getWebColorInner());
        this.f67455b.setAlpha(this.f67454a.getWebAlpha());
        int i11 = this.f67454a.getYAxis().mEntryCount;
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        MPPointF mPPointF3 = MPPointF.getInstance(0.0f, 0.0f);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == i11 - 1) {
                this.f67455b.setStrokeWidth(this.f67454a.getWebLineWidth());
                this.f67455b.setColor(this.f67454a.getWebColor());
                this.f67455b.setAlpha(this.f67454a.getWebAlpha());
            }
            int i13 = 0;
            while (i13 < ((RadarData) this.f67454a.getData()).getEntryCount()) {
                float yChartMin = (this.f67454a.getYAxis().mEntries[i12] - this.f67454a.getYChartMin()) * factor;
                Utils.getPosition(centerOffsets, yChartMin, (i13 * sliceAngle) + rotationAngle, mPPointF2);
                int i14 = i13 + 1;
                Utils.getPosition(centerOffsets, yChartMin, (i14 * sliceAngle) + rotationAngle, mPPointF3);
                canvas.drawLine(mPPointF2.f43143x, mPPointF2.f43144y, mPPointF3.f43143x, mPPointF3.f43144y, this.f67455b);
                i13 = i14;
            }
        }
        MPPointF.recycleInstance(mPPointF2);
        MPPointF.recycleInstance(mPPointF3);
    }

    public Paint getWebPaint() {
        return this.f67455b;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
