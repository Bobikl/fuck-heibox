package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class LineChartRenderer extends LineRadarRenderer {
    protected Path cubicFillPath;
    protected Path cubicPath;
    protected Canvas mBitmapCanvas;
    protected Bitmap.Config mBitmapConfig;
    protected LineDataProvider mChart;
    protected Paint mCirclePaintInner;
    private float[] mCirclesBuffer;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mGenerateFilledPathBuffer;
    private HashMap<IDataSet, DataSetImageCache> mImageCaches;
    private float[] mLineBuffer;

    /* JADX INFO: renamed from: com.github.mikephil.charting.renderer.LineChartRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode;

        static {
            int[] iArr = new int[LineDataSet.Mode.values().length];
            $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode = iArr;
            try {
                iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class DataSetImageCache {
        private Bitmap[] circleBitmaps;
        private Path mCirclePathBuffer;

        private DataSetImageCache() {
            this.mCirclePathBuffer = new Path();
        }

        /* synthetic */ DataSetImageCache(LineChartRenderer lineChartRenderer, AnonymousClass1 anonymousClass1) {
            this();
        }

        protected void fill(ILineDataSet iLineDataSet, boolean z10, boolean z11) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i10 = 0; i10 < circleColorCount; i10++) {
                int i11 = (int) (((double) circleRadius) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.circleBitmaps[i10] = bitmapCreateBitmap;
                LineChartRenderer.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i10));
                if (z11) {
                    this.mCirclePathBuffer.reset();
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.mCirclePathBuffer, LineChartRenderer.this.mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, LineChartRenderer.this.mRenderPaint);
                    if (z10) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, LineChartRenderer.this.mCirclePaintInner);
                    }
                }
            }
        }

        protected Bitmap getBitmap(int i10) {
            Bitmap[] bitmapArr = this.circleBitmaps;
            return bitmapArr[i10 % bitmapArr.length];
        }

        protected boolean init(ILineDataSet iLineDataSet) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            Bitmap[] bitmapArr = this.circleBitmaps;
            if (bitmapArr == null) {
                this.circleBitmaps = new Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.circleBitmaps = new Bitmap[circleColorCount];
            return true;
        }
    }

    public LineChartRenderer(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBitmapConfig = Bitmap.Config.ARGB_8888;
        this.cubicPath = new Path();
        this.cubicFillPath = new Path();
        this.mLineBuffer = new float[4];
        this.mGenerateFilledPathBuffer = new Path();
        this.mImageCaches = new HashMap<>();
        this.mCirclesBuffer = new float[2];
        this.mChart = lineDataProvider;
        Paint paint = new Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.charting.data.BaseEntry] */
    private void generateFilledPath(ILineDataSet iLineDataSet, int i10, int i11, Path path) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        float phaseY = this.mAnimator.getPhaseY();
        boolean z10 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i10);
        path.moveTo(entryForIndex.getX(), fillLinePosition);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        int i12 = i10 + 1;
        ?? r10 = 0;
        while (true) {
            ?? r11 = r10;
            if (i12 > i11) {
                break;
            }
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i12);
            if (z10 && r11 != 0) {
                path.lineTo(entryForIndex2.getX(), r11.getY() * phaseY);
            }
            path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
            i12++;
            r10 = entryForIndex2;
        }
        if (r10 != 0) {
            path.lineTo(r10.getX(), fillLinePosition);
        }
        path.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawCircles(Canvas canvas) {
        DataSetImageCache dataSetImageCache;
        Bitmap bitmap;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.mCirclesBuffer;
        char c10 = 0;
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
                AnonymousClass1 anonymousClass1 = null;
                if (this.mImageCaches.containsKey(iLineDataSet)) {
                    dataSetImageCache = this.mImageCaches.get(iLineDataSet);
                } else {
                    DataSetImageCache dataSetImageCache2 = new DataSetImageCache(this, anonymousClass1);
                    this.mImageCaches.put(iLineDataSet, dataSetImageCache2);
                    dataSetImageCache = dataSetImageCache2;
                }
                if (dataSetImageCache.init(iLineDataSet)) {
                    dataSetImageCache.fill(iLineDataSet, z10, z11);
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
                    this.mCirclesBuffer[c10] = entryForIndex.getX();
                    this.mCirclesBuffer[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.mCirclesBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mCirclesBuffer[c10])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.mCirclesBuffer[c10]) && this.mViewPortHandler.isInBoundsY(this.mCirclesBuffer[1]) && (bitmap = dataSetImageCache.getBitmap(i12)) != null) {
                        float[] fArr2 = this.mCirclesBuffer;
                        canvas.drawBitmap(bitmap, fArr2[c10] - circleRadius, fArr2[1] - circleRadius, (Paint) null);
                    }
                    i12++;
                    c10 = 0;
                }
            }
            i10++;
            c10 = 0;
            f10 = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v4 */
    protected void drawCubicBezier(ILineDataSet iLineDataSet) {
        Math.max(0.0f, Math.min(1.0f, this.mAnimator.getPhaseX()));
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        this.cubicPath.reset();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        if (xBounds.range >= 1) {
            int i10 = xBounds.min + 1;
            Object entryForIndex = iLineDataSet.getEntryForIndex(Math.max(i10 - 2, 0));
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(Math.max(i10 - 1, 0));
            int i11 = -1;
            if (entryForIndex2 != 0) {
                this.cubicPath.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                int i12 = this.mXBounds.min + 1;
                ?? r10 = entryForIndex2;
                ?? r11 = entryForIndex2;
                ?? r12 = entryForIndex;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    ?? entryForIndex3 = r11;
                    if (i12 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    if (i11 != i12) {
                        entryForIndex3 = iLineDataSet.getEntryForIndex(i12);
                    }
                    int i13 = i12 + 1;
                    if (i13 < iLineDataSet.getEntryCount()) {
                        i12 = i13;
                    }
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i12);
                    this.cubicPath.cubicTo(r10.getX() + ((entryForIndex3.getX() - r12.getX()) * cubicIntensity), (r10.getY() + ((entryForIndex3.getY() - r12.getY()) * cubicIntensity)) * phaseY, entryForIndex3.getX() - ((entryForIndex4.getX() - r10.getX()) * cubicIntensity), (entryForIndex3.getY() - ((entryForIndex4.getY() - r10.getY()) * cubicIntensity)) * phaseY, entryForIndex3.getX(), entryForIndex3.getY() * phaseY);
                    r12 = r10;
                    r10 = entryForIndex3;
                    r11 = entryForIndex4;
                    int i14 = i12;
                    i12 = i13;
                    i11 = i14;
                }
            } else {
                return;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCubicFill(Canvas canvas, ILineDataSet iLineDataSet, Path path, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min + xBounds.range).getX(), fillLinePosition);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min).getX(), fillLinePosition);
        path.close();
        transformer.pathValueToPixel(path);
        Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null || weakReference.get().getWidth() != chartWidth || this.mDrawBitmap.get().getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            this.mDrawBitmap = new WeakReference<>(Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig));
            this.mBitmapCanvas = new Canvas(this.mDrawBitmap.get());
        }
        this.mDrawBitmap.get().eraseColor(0);
        for (T t10 : this.mChart.getLineData().getDataSets()) {
            if (t10.isVisible()) {
                drawDataSet(canvas, t10);
            }
        }
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, this.mRenderPaint);
    }

    protected void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        if (iLineDataSet.getEntryCount() < 1) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
        this.mRenderPaint.setPathEffect(iLineDataSet.getDashPathEffect());
        int i10 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[iLineDataSet.getMode().ordinal()];
        if (i10 == 3) {
            drawCubicBezier(iLineDataSet);
        } else if (i10 != 4) {
            drawLinear(canvas, iLineDataSet);
        } else {
            drawHorizontalBezier(iLineDataSet);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawCircles(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        LineData lineData = this.mChart.getLineData();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.f43141x, (float) pixelForValues.f43142y);
                    drawHighlightLines(canvas, (float) pixelForValues.f43141x, (float) pixelForValues.f43142y, iLineDataSet);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawHorizontalBezier(ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        this.cubicPath.reset();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        if (xBounds.range >= 1) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(xBounds.min);
            this.cubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i10 = this.mXBounds.min + 1;
            ?? r10 = entryForIndex;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                if (i10 > xBounds2.range + xBounds2.min) {
                    break;
                }
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i10);
                float x10 = r10.getX() + ((entryForIndex2.getX() - r10.getX()) / 2.0f);
                this.cubicPath.cubicTo(x10, r10.getY() * phaseY, x10, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i10++;
                r10 = entryForIndex2;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v22, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        int i10 = zIsDrawSteppedEnabled ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i11 = i10 * 2;
            if (this.mLineBuffer.length <= i11) {
                this.mLineBuffer = new float[i10 * 4];
            }
            int i12 = this.mXBounds.min;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                if (i12 > xBounds.range + xBounds.min) {
                    break;
                }
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i12);
                if (entryForIndex != 0) {
                    this.mLineBuffer[0] = entryForIndex.getX();
                    this.mLineBuffer[1] = entryForIndex.getY() * phaseY;
                    if (i12 < this.mXBounds.max) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i12 + 1);
                        if (entryForIndex2 == 0) {
                            break;
                        }
                        if (zIsDrawSteppedEnabled) {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            float[] fArr = this.mLineBuffer;
                            float f10 = fArr[1];
                            fArr[3] = f10;
                            fArr[4] = fArr[2];
                            fArr[5] = f10;
                            fArr[6] = entryForIndex2.getX();
                            this.mLineBuffer[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            this.mLineBuffer[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.mLineBuffer;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mLineBuffer[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.mLineBuffer[2]) && (this.mViewPortHandler.isInBoundsTop(this.mLineBuffer[1]) || this.mViewPortHandler.isInBoundsBottom(this.mLineBuffer[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i12));
                        canvas2.drawLines(this.mLineBuffer, 0, i11, this.mRenderPaint);
                    }
                }
                i12++;
            }
        } else {
            int i13 = entryCount * i10;
            if (this.mLineBuffer.length < Math.max(i13, i10) * 2) {
                this.mLineBuffer = new float[Math.max(i13, i10) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                int i14 = this.mXBounds.min;
                int i15 = 0;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    if (i14 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i14 == 0 ? 0 : i14 - 1);
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i14);
                    if (entryForIndex3 != 0 && entryForIndex4 != 0) {
                        int i16 = i15 + 1;
                        this.mLineBuffer[i15] = entryForIndex3.getX();
                        int i17 = i16 + 1;
                        this.mLineBuffer[i16] = entryForIndex3.getY() * phaseY;
                        if (zIsDrawSteppedEnabled) {
                            int i18 = i17 + 1;
                            this.mLineBuffer[i17] = entryForIndex4.getX();
                            int i19 = i18 + 1;
                            this.mLineBuffer[i18] = entryForIndex3.getY() * phaseY;
                            int i20 = i19 + 1;
                            this.mLineBuffer[i19] = entryForIndex4.getX();
                            i17 = i20 + 1;
                            this.mLineBuffer[i20] = entryForIndex3.getY() * phaseY;
                        }
                        int i21 = i17 + 1;
                        this.mLineBuffer[i17] = entryForIndex4.getX();
                        this.mLineBuffer[i21] = entryForIndex4.getY() * phaseY;
                        i15 = i21 + 1;
                    }
                    i14++;
                }
                if (i15 > 0) {
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    int iMax = Math.max((this.mXBounds.range + 1) * i10, i10) * 2;
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    canvas2.drawLines(this.mLineBuffer, 0, iMax, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    protected void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i10;
        int i11;
        Path path = this.mGenerateFilledPathBuffer;
        int i12 = xBounds.min;
        int i13 = xBounds.range + i12;
        int i14 = 0;
        do {
            i10 = (i14 * 128) + i12;
            i11 = i10 + 128;
            if (i11 > i13) {
                i11 = i13;
            }
            if (i10 <= i11) {
                generateFilledPath(iLineDataSet, i10, i11, path);
                transformer.pathValueToPixel(path);
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i14++;
        } while (i10 <= i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = this.mChart.getLineData().getDataSets();
            for (int i10 = 0; i10 < dataSets.size(); i10++) {
                ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i10);
                if (shouldDrawValues(iLineDataSet)) {
                    applyValueTextStyle(iLineDataSet);
                    Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
                    if (!iLineDataSet.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int i11 = circleRadius;
                    this.mXBounds.set(this.mChart, iLineDataSet);
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    MPPointF mPPointF = MPPointF.getInstance(iLineDataSet.getIconsOffset());
                    mPPointF.f43143x = Utils.convertDpToPixel(mPPointF.f43143x);
                    mPPointF.f43144y = Utils.convertDpToPixel(mPPointF.f43144y);
                    int i12 = 0;
                    while (i12 < fArrGenerateTransformedValuesLine.length) {
                        float f10 = fArrGenerateTransformedValuesLine[i12];
                        float f11 = fArrGenerateTransformedValuesLine[i12 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f10)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f10) && this.mViewPortHandler.isInBoundsY(f11)) {
                            int i13 = i12 / 2;
                            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min + i13);
                            if (iLineDataSet.isDrawValuesEnabled()) {
                                drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i10, f10, f11 - i11, iLineDataSet.getValueTextColor(i13));
                            }
                            if (entryForIndex.getIcon() != null && iLineDataSet.isDrawIconsEnabled()) {
                                Drawable icon = entryForIndex.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f10 + mPPointF.f43143x), (int) (f11 + mPPointF.f43144y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i12 = i12;
                            mPPointF = mPPointF;
                        }
                        i12 += 2;
                        mPPointF = mPPointF;
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            weakReference.get().recycle();
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }
}
