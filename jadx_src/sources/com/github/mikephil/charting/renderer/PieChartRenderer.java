package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.view.j1;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PieChartRenderer extends DataRenderer {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds;
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    protected PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mDrawCenterTextPathBuffer;
    protected RectF mDrawHighlightedRectF;
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath;
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer;
    private Path mPathBuffer;
    private RectF[] mRectBuffer;
    protected Paint mTransparentCirclePaint;
    protected Paint mValueLinePaint;

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mCenterTextLastBounds = new RectF();
        this.mRectBuffer = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.mPathBuffer = new Path();
        this.mInnerRectBuffer = new RectF();
        this.mHoleCirclePath = new Path();
        this.mDrawCenterTextPathBuffer = new Path();
        this.mDrawHighlightedRectF = new RectF();
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        this.mHolePaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.mTransparentCirclePaint = paint2;
        paint2.setColor(-1);
        this.mTransparentCirclePaint.setStyle(Paint.Style.FILL);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(j1.f21601t);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.mEntryLabelsPaint = paint3;
        paint3.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(Paint.Align.CENTER);
        this.mEntryLabelsPaint.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint4 = new Paint(1);
        this.mValueLinePaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    protected float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f10, float f11, float f12, float f13, float f14, float f15) {
        double d10 = (f14 + f15) * 0.017453292f;
        float fCos = mPPointF.f43143x + (((float) Math.cos(d10)) * f10);
        float fSin = mPPointF.f43144y + (((float) Math.sin(d10)) * f10);
        double d11 = (f14 + (f15 / 2.0f)) * 0.017453292f;
        return (float) (((double) (f10 - ((float) ((Math.sqrt(Math.pow(fCos - f12, 2.0d) + Math.pow(fSin - f13, 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f11)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((mPPointF.f43143x + (((float) Math.cos(d11)) * f10)) - ((fCos + f12) / 2.0f), 2.0d) + Math.pow((mPPointF.f43144y + (((float) Math.sin(d11)) * f10)) - ((fSin + f13) / 2.0f), 2.0d)));
    }

    protected void drawCenterText(Canvas canvas) {
        CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
        float f10 = centerCircleBox.f43143x + centerTextOffset.f43143x;
        float f11 = centerCircleBox.f43144y + centerTextOffset.f43144y;
        float radius = (!this.mChart.isDrawHoleEnabled() || this.mChart.isDrawSlicesUnderHoleEnabled()) ? this.mChart.getRadius() : this.mChart.getRadius() * (this.mChart.getHoleRadius() / 100.0f);
        RectF[] rectFArr = this.mRectBuffer;
        RectF rectF = rectFArr[0];
        rectF.left = f10 - radius;
        rectF.top = f11 - radius;
        rectF.right = f10 + radius;
        rectF.bottom = f11 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (!centerText.equals(this.mCenterTextLastValue) || !rectF2.equals(this.mCenterTextLastBounds)) {
            this.mCenterTextLastBounds.set(rectF2);
            this.mCenterTextLastValue = centerText;
            this.mCenterTextLayout = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil(this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.mCenterTextLayout.getHeight();
        canvas.save();
        Path path = this.mDrawCenterTextPathBuffer;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
        MPPointF.recycleInstance(centerCircleBox);
        MPPointF.recycleInstance(centerTextOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null || weakReference.get().getWidth() != chartWidth || this.mDrawBitmap.get().getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            this.mDrawBitmap = new WeakReference<>(Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444));
            this.mBitmapCanvas = new Canvas(this.mDrawBitmap.get());
        }
        this.mDrawBitmap.get().eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    protected void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        int i10;
        boolean z10;
        int i11;
        float f10;
        float f11;
        PieChartRenderer pieChartRenderer = this;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = pieChartRenderer.mChart.getRotationAngle();
        float phaseX = pieChartRenderer.mAnimator.getPhaseX();
        float phaseY = pieChartRenderer.mAnimator.getPhaseY();
        RectF circleBox = pieChartRenderer.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = pieChartRenderer.mChart.getDrawAngles();
        MPPointF centerCircleBox = pieChartRenderer.mChart.getCenterCircleBox();
        float radius = pieChartRenderer.mChart.getRadius();
        boolean z11 = true;
        boolean z12 = pieChartRenderer.mChart.isDrawHoleEnabled() && !pieChartRenderer.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z12 ? (pieChartRenderer.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < entryCount; i13++) {
            if (Math.abs(iPieDataSet2.getEntryForIndex(i13).getY()) > Utils.FLOAT_EPSILON) {
                i12++;
            }
        }
        float sliceSpace = i12 <= 1 ? 0.0f : pieChartRenderer.getSliceSpace(iPieDataSet2);
        int i14 = 0;
        float f12 = 0.0f;
        while (i14 < entryCount) {
            float f13 = drawAngles[i14];
            float fAbs = Math.abs(iPieDataSet2.getEntryForIndex(i14).getY());
            float f14 = Utils.FLOAT_EPSILON;
            if (fAbs <= f14 || pieChartRenderer.mChart.needsHighlight(i14)) {
                i10 = i14;
                z10 = z11;
                radius = radius;
                rotationAngle = rotationAngle;
                phaseX = phaseX;
                circleBox = circleBox;
                i11 = i12;
                holeRadius = holeRadius;
                centerCircleBox = centerCircleBox;
            } else {
                boolean z13 = (sliceSpace <= 0.0f || f13 > 180.0f) ? false : z11;
                pieChartRenderer.mRenderPaint.setColor(iPieDataSet2.getColor(i14));
                float f15 = i12 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f16 = rotationAngle + ((f12 + (f15 / 2.0f)) * phaseY);
                float f17 = (f13 - f15) * phaseY;
                if (f17 < 0.0f) {
                    f17 = 0.0f;
                }
                pieChartRenderer.mPathBuffer.reset();
                int i15 = i14;
                double d10 = f16 * 0.017453292f;
                float fCos = centerCircleBox.f43143x + (((float) Math.cos(d10)) * radius);
                float fSin = centerCircleBox.f43144y + (((float) Math.sin(d10)) * radius);
                if (f17 < 360.0f || f17 % 360.0f > f14) {
                    pieChartRenderer.mPathBuffer.moveTo(fCos, fSin);
                    pieChartRenderer.mPathBuffer.arcTo(circleBox, f16, f17);
                } else {
                    pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.f43143x, centerCircleBox.f43144y, radius, Path.Direction.CW);
                }
                RectF rectF = pieChartRenderer.mInnerRectBuffer;
                float f18 = centerCircleBox.f43143x;
                float f19 = centerCircleBox.f43144y;
                float f20 = f17;
                rectF.set(f18 - holeRadius, f19 - holeRadius, f18 + holeRadius, f19 + holeRadius);
                if (z12) {
                    if (holeRadius > 0.0f || z13) {
                        if (z13) {
                            f11 = f20;
                            i10 = i15;
                            holeRadius = holeRadius;
                            z10 = true;
                            float fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f13 * phaseY, fCos, fSin, f16, f11);
                            if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                                fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                            }
                            holeRadius = Math.max(holeRadius, fCalculateMinimumRadiusForSpacedSlice);
                        } else {
                            holeRadius = holeRadius;
                            f11 = f20;
                            z10 = true;
                            i10 = i15;
                        }
                        float f21 = (i11 == z10 || holeRadius == 0.0f) ? 0.0f : sliceSpace / (holeRadius * 0.017453292f);
                        float f22 = ((f12 + (f21 / 2.0f)) * phaseY) + rotationAngle;
                        float f23 = (f13 - f21) * phaseY;
                        if (f23 < 0.0f) {
                            f23 = 0.0f;
                        }
                        float f24 = f22 + f23;
                        if (f17 < 360.0f || f11 % 360.0f > f14) {
                            pieChartRenderer = this;
                            double d11 = f24 * 0.017453292f;
                            pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.f43143x + (((float) Math.cos(d11)) * holeRadius), centerCircleBox.f43144y + (holeRadius * ((float) Math.sin(d11))));
                            pieChartRenderer.mPathBuffer.arcTo(pieChartRenderer.mInnerRectBuffer, f24, -f23);
                        } else {
                            pieChartRenderer = this;
                            pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.f43143x, centerCircleBox.f43144y, holeRadius, Path.Direction.CCW);
                        }
                        centerCircleBox = centerCircleBox;
                    } else {
                        f10 = 360.0f;
                        z10 = true;
                        i10 = i15;
                    }
                    pieChartRenderer.mPathBuffer.close();
                    pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
                } else {
                    z10 = true;
                    i10 = i15;
                    f10 = 360.0f;
                }
                if (f20 % f10 > f14) {
                    if (z13) {
                        float fCalculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f13 * phaseY, fCos, fSin, f16, f20);
                        double d12 = (f16 + (f20 / 2.0f)) * 0.017453292f;
                        pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.f43143x + (((float) Math.cos(d12)) * fCalculateMinimumRadiusForSpacedSlice2), centerCircleBox.f43144y + (fCalculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d12))));
                    } else {
                        pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.f43143x, centerCircleBox.f43144y);
                    }
                }
                pieChartRenderer.mPathBuffer.close();
                pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
            }
            f12 += f13 * phaseX;
            i14 = i10 + 1;
            iPieDataSet2 = iPieDataSet;
            centerCircleBox = centerCircleBox;
            i12 = i11;
            holeRadius = holeRadius;
            circleBox = circleBox;
            entryCount = entryCount;
            drawAngles = drawAngles;
            z11 = z10;
            phaseX = phaseX;
            radius = radius;
            rotationAngle = rotationAngle;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    protected void drawEntryLabel(Canvas canvas, String str, float f10, float f11) {
        canvas.drawText(str, f10, f11, this.mEntryLabelsPaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        RectF rectF;
        float f10;
        float f11;
        IPieDataSet dataSetByIndex;
        float f12;
        int i10;
        int i11;
        float fCalculateMinimumRadiusForSpacedSlice;
        float fMax;
        float f13;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z10 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float f14 = 0.0f;
        float holeRadius = z10 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF2 = this.mDrawHighlightedRectF;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i12 = 0;
        while (i12 < highlightArr.length) {
            int x10 = (int) highlightArr[i12].getX();
            if (x10 < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr[i12].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i13 = 0;
                for (int i14 = 0; i14 < entryCount; i14++) {
                    if (Math.abs(dataSetByIndex.getEntryForIndex(i14).getY()) > Utils.FLOAT_EPSILON) {
                        i13++;
                    }
                }
                if (x10 == 0) {
                    i10 = 1;
                    f12 = 0.0f;
                } else {
                    f12 = absoluteAngles[x10 - 1] * phaseX;
                    i10 = 1;
                }
                float sliceSpace = i13 <= i10 ? 0.0f : dataSetByIndex.getSliceSpace();
                float f15 = drawAngles[x10];
                float selectionShift = dataSetByIndex.getSelectionShift();
                float f16 = radius + selectionShift;
                rectF2.set(this.mChart.getCircleBox());
                float f17 = -selectionShift;
                rectF2.inset(f17, f17);
                boolean z11 = sliceSpace > 0.0f && f15 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x10));
                float f18 = i13 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f19 = i13 == 1 ? 0.0f : sliceSpace / (f16 * 0.017453292f);
                float f20 = rotationAngle + ((f12 + (f18 / 2.0f)) * phaseY);
                float f21 = (f15 - f18) * phaseY;
                float f22 = f21 < 0.0f ? 0.0f : f21;
                float f23 = ((f12 + (f19 / 2.0f)) * phaseY) + rotationAngle;
                float f24 = (f15 - f19) * phaseY;
                if (f24 < 0.0f) {
                    f24 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (f22 < 360.0f || f22 % 360.0f > Utils.FLOAT_EPSILON) {
                    double d10 = f23 * 0.017453292f;
                    this.mPathBuffer.moveTo(centerCircleBox.f43143x + (((float) Math.cos(d10)) * f16), centerCircleBox.f43144y + (f16 * ((float) Math.sin(d10))));
                    this.mPathBuffer.arcTo(rectF2, f23, f24);
                } else {
                    this.mPathBuffer.addCircle(centerCircleBox.f43143x, centerCircleBox.f43144y, f16, Path.Direction.CW);
                }
                if (z11) {
                    double d11 = f20 * 0.017453292f;
                    f11 = 0.0f;
                    rectF = rectF2;
                    i11 = 1;
                    fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f15 * phaseY, (((float) Math.cos(d11)) * radius) + centerCircleBox.f43143x, centerCircleBox.f43144y + (((float) Math.sin(d11)) * radius), f20, f22);
                } else {
                    rectF = rectF2;
                    f11 = 0.0f;
                    i11 = 1;
                    fCalculateMinimumRadiusForSpacedSlice = 0.0f;
                }
                RectF rectF3 = this.mInnerRectBuffer;
                float f25 = centerCircleBox.f43143x;
                float f26 = centerCircleBox.f43144y;
                rectF3.set(f25 - holeRadius, f26 - holeRadius, f25 + holeRadius, f26 + holeRadius);
                if (!z10 || (holeRadius <= f11 && !z11)) {
                    f10 = holeRadius;
                    if (f22 % 360.0f > Utils.FLOAT_EPSILON) {
                        if (z11) {
                            double d12 = (f20 + (f22 / 2.0f)) * 0.017453292f;
                            this.mPathBuffer.lineTo(centerCircleBox.f43143x + (((float) Math.cos(d12)) * fCalculateMinimumRadiusForSpacedSlice), centerCircleBox.f43144y + (fCalculateMinimumRadiusForSpacedSlice * ((float) Math.sin(d12))));
                        } else {
                            this.mPathBuffer.lineTo(centerCircleBox.f43143x, centerCircleBox.f43144y);
                        }
                    }
                } else {
                    if (z11) {
                        if (fCalculateMinimumRadiusForSpacedSlice < f11) {
                            fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                        }
                        fMax = Math.max(holeRadius, fCalculateMinimumRadiusForSpacedSlice);
                    }
                    if (i13 != i11) {
                        fMax = holeRadius;
                        if (fMax == f11) {
                            fMax = holeRadius;
                            f13 = f11;
                        } else {
                            f13 = sliceSpace / (fMax * 0.017453292f);
                        }
                    } else {
                        fMax = holeRadius;
                        f13 = f11;
                    }
                    float f27 = rotationAngle + ((f12 + (f13 / 2.0f)) * phaseY);
                    float f28 = (f15 - f13) * phaseY;
                    if (f28 < f11) {
                        f28 = f11;
                    }
                    float f29 = f27 + f28;
                    if (f22 < 360.0f || f22 % 360.0f > Utils.FLOAT_EPSILON) {
                        double d13 = f29 * 0.017453292f;
                        f10 = holeRadius;
                        this.mPathBuffer.lineTo(centerCircleBox.f43143x + (((float) Math.cos(d13)) * fMax), centerCircleBox.f43144y + (fMax * ((float) Math.sin(d13))));
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f29, -f28);
                    } else {
                        this.mPathBuffer.addCircle(centerCircleBox.f43143x, centerCircleBox.f43144y, fMax, Path.Direction.CCW);
                        f10 = holeRadius;
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                rectF = rectF2;
                f10 = holeRadius;
                f11 = f14;
                phaseX = phaseX;
                drawAngles = drawAngles;
                absoluteAngles = absoluteAngles;
            }
            i12++;
            rectF2 = rectF;
            holeRadius = f10;
            f14 = f11;
            phaseX = phaseX;
            drawAngles = drawAngles;
            absoluteAngles = absoluteAngles;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    protected void drawHole(Canvas canvas) {
        if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
            return;
        }
        float radius = this.mChart.getRadius();
        float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        if (Color.alpha(this.mHolePaint.getColor()) > 0) {
            this.mBitmapCanvas.drawCircle(centerCircleBox.f43143x, centerCircleBox.f43144y, holeRadius, this.mHolePaint);
        }
        if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = radius * (this.mChart.getTransparentCircleRadius() / 100.0f);
            this.mTransparentCirclePaint.setAlpha((int) (alpha * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
            this.mHoleCirclePath.reset();
            this.mHoleCirclePath.addCircle(centerCircleBox.f43143x, centerCircleBox.f43144y, transparentCircleRadius, Path.Direction.CW);
            this.mHoleCirclePath.addCircle(centerCircleBox.f43143x, centerCircleBox.f43144y, holeRadius, Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawRoundedSlices(Canvas canvas) {
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i10 = 0;
                while (i10 < dataSet.getEntryCount()) {
                    float f10 = drawAngles[i10];
                    if (Math.abs(dataSet.getEntryForIndex(i10).getY()) > Utils.FLOAT_EPSILON) {
                        double d10 = radius - holeRadius;
                        double d11 = (rotationAngle + f10) * phaseY;
                        float fCos = (float) (((double) centerCircleBox.f43143x) + (Math.cos(Math.toRadians(d11)) * d10));
                        float fSin = (float) ((d10 * Math.sin(Math.toRadians(d11))) + ((double) centerCircleBox.f43144y));
                        this.mRenderPaint.setColor(dataSet.getColor(i10));
                        this.mBitmapCanvas.drawCircle(fCos, fSin, holeRadius, this.mRenderPaint);
                    }
                    rotationAngle += f10 * phaseX;
                    i10++;
                    phaseY = phaseY;
                    drawAngles = drawAngles;
                }
                MPPointF.recycleInstance(centerCircleBox);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        int i10;
        List<IPieDataSet> list;
        float f10;
        float f11;
        float[] fArr;
        float[] fArr2;
        PieDataSet.ValuePosition valuePosition;
        float f12;
        float f13;
        float f14;
        int i11;
        IPieDataSet iPieDataSet;
        List<IPieDataSet> list2;
        float f15;
        IPieDataSet iPieDataSet2;
        float f16;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = this.mChart.getHoleRadius() / 100.0f;
        float f17 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f17 = (radius - (radius * holeRadius)) / 2.0f;
        }
        float f18 = radius - f17;
        PieData pieData = (PieData) this.mChart.getData();
        List<IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean zIsDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i12 = 0;
        int i13 = 0;
        while (i13 < dataSets.size()) {
            IPieDataSet iPieDataSet3 = dataSets.get(i13);
            boolean zIsDrawValuesEnabled = iPieDataSet3.isDrawValuesEnabled();
            if (zIsDrawValuesEnabled || zIsDrawEntryLabelsEnabled) {
                PieDataSet.ValuePosition xValuePosition = iPieDataSet3.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iPieDataSet3.getYValuePosition();
                applyValueTextStyle(iPieDataSet3);
                float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "Q") + Utils.convertDpToPixel(4.0f);
                IValueFormatter valueFormatter = iPieDataSet3.getValueFormatter();
                int entryCount = iPieDataSet3.getEntryCount();
                this.mValueLinePaint.setColor(iPieDataSet3.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(Utils.convertDpToPixel(iPieDataSet3.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet3);
                MPPointF mPPointF = MPPointF.getInstance(iPieDataSet3.getIconsOffset());
                mPPointF.f43143x = Utils.convertDpToPixel(mPPointF.f43143x);
                mPPointF.f43144y = Utils.convertDpToPixel(mPPointF.f43144y);
                int i14 = i12;
                int i15 = 0;
                while (i15 < entryCount) {
                    PieEntry entryForIndex = iPieDataSet3.getEntryForIndex(i15);
                    float f19 = (((i14 == 0 ? 0.0f : absoluteAngles[i14 - 1] * phaseX) + ((drawAngles[i14] - ((sliceSpace / (f18 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY) + rotationAngle;
                    int i16 = i15;
                    float y10 = this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY();
                    MPPointF mPPointF2 = mPPointF;
                    double d10 = f19 * 0.017453292f;
                    int i17 = i13;
                    List<IPieDataSet> list3 = dataSets;
                    float fCos = (float) Math.cos(d10);
                    float f20 = rotationAngle;
                    float[] fArr3 = drawAngles;
                    float fSin = (float) Math.sin(d10);
                    boolean z10 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z11 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    int i18 = entryCount;
                    boolean z12 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    boolean z13 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z10 || z11) {
                        float valueLinePart1Length = iPieDataSet3.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet3.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet3.getValueLinePart1OffsetPercentage() / 100.0f;
                        valuePosition = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f21 = radius * holeRadius;
                            f12 = ((radius - f21) * valueLinePart1OffsetPercentage) + f21;
                        } else {
                            f12 = radius * valueLinePart1OffsetPercentage;
                        }
                        float fAbs = iPieDataSet3.isValueLineVariableLength() ? valueLinePart2Length * f18 * ((float) Math.abs(Math.sin(d10))) : valueLinePart2Length * f18;
                        float f22 = centerCircleBox.f43143x;
                        float f23 = (f12 * fCos) + f22;
                        float f24 = centerCircleBox.f43144y;
                        float f25 = (f12 * fSin) + f24;
                        float f26 = (valueLinePart1Length + 1.0f) * f18;
                        float f27 = (f26 * fCos) + f22;
                        float f28 = (f26 * fSin) + f24;
                        double d11 = ((double) f19) % 360.0d;
                        if (d11 < 90.0d || d11 > 270.0d) {
                            f13 = f27 + fAbs;
                            this.mValuePaint.setTextAlign(Paint.Align.LEFT);
                            if (z10) {
                                this.mEntryLabelsPaint.setTextAlign(Paint.Align.LEFT);
                            }
                            f14 = f13 + fConvertDpToPixel;
                        } else {
                            float f29 = f27 - fAbs;
                            this.mValuePaint.setTextAlign(Paint.Align.RIGHT);
                            if (z10) {
                                this.mEntryLabelsPaint.setTextAlign(Paint.Align.RIGHT);
                            }
                            f13 = f29;
                            f14 = f29 - fConvertDpToPixel;
                        }
                        if (iPieDataSet3.getValueLineColor() != 1122867) {
                            i11 = i16;
                            canvas.drawLine(f23, f25, f27, f28, this.mValueLinePaint);
                            canvas.drawLine(f27, f28, f13, f28, this.mValueLinePaint);
                        } else {
                            i11 = i16;
                        }
                        if (z10 && z11) {
                            iPieDataSet = iPieDataSet3;
                            list2 = list3;
                            f15 = fCos;
                            drawValue(canvas, valueFormatter, y10, entryForIndex, 0, f14, f28, iPieDataSet3.getValueTextColor(i11));
                            if (i11 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                drawEntryLabel(canvas, entryForIndex.getLabel(), f14, f28 + fCalcTextHeight);
                            }
                        } else {
                            iPieDataSet = iPieDataSet3;
                            list2 = list3;
                            float f30 = f14;
                            f15 = fCos;
                            if (z10) {
                                if (i11 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                    drawEntryLabel(canvas, entryForIndex.getLabel(), f30, f28 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z11) {
                                iPieDataSet2 = iPieDataSet;
                                drawValue(canvas, valueFormatter, y10, entryForIndex, 0, f30, f28 + (fCalcTextHeight / 2.0f), iPieDataSet2.getValueTextColor(i11));
                            }
                        }
                        iPieDataSet2 = iPieDataSet;
                    } else {
                        valuePosition = yValuePosition;
                        xValuePosition = xValuePosition;
                        iPieDataSet2 = iPieDataSet3;
                        i18 = i18;
                        list2 = list3;
                        f15 = fCos;
                        radius = radius;
                        mPPointF2 = mPPointF2;
                        absoluteAngles = absoluteAngles;
                        i11 = i16;
                    }
                    if (z12 || z13) {
                        float f31 = (f18 * f15) + centerCircleBox.f43143x;
                        float f32 = (f18 * fSin) + centerCircleBox.f43144y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (z12 && z13) {
                            f16 = fSin;
                            drawValue(canvas, valueFormatter, y10, entryForIndex, 0, f31, f32, iPieDataSet2.getValueTextColor(i11));
                            if (i11 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                drawEntryLabel(canvas, entryForIndex.getLabel(), f31, f32 + fCalcTextHeight);
                            }
                        } else {
                            f16 = fSin;
                            if (z12) {
                                if (i11 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                    drawEntryLabel(canvas, entryForIndex.getLabel(), f31, f32 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z13) {
                                drawValue(canvas, valueFormatter, y10, entryForIndex, 0, f31, f32 + (fCalcTextHeight / 2.0f), iPieDataSet2.getValueTextColor(i11));
                            }
                        }
                    } else {
                        f16 = fSin;
                    }
                    if (entryForIndex.getIcon() != null && iPieDataSet2.isDrawIconsEnabled()) {
                        Drawable icon = entryForIndex.getIcon();
                        float f33 = mPPointF2.f43144y;
                        Utils.drawImage(canvas, icon, (int) (((f18 + f33) * f15) + centerCircleBox.f43143x), (int) (((f18 + f33) * f16) + centerCircleBox.f43144y + mPPointF2.f43143x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i14++;
                    i15 = i11 + 1;
                    mPPointF = mPPointF2;
                    iPieDataSet3 = iPieDataSet2;
                    radius = radius;
                    absoluteAngles = absoluteAngles;
                    i13 = i17;
                    rotationAngle = f20;
                    drawAngles = fArr3;
                    dataSets = list2;
                    entryCount = i18;
                    yValuePosition = valuePosition;
                    xValuePosition = xValuePosition;
                }
                i10 = i13;
                list = dataSets;
                f10 = radius;
                f11 = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                MPPointF.recycleInstance(mPPointF);
                i12 = i14;
            } else {
                i10 = i13;
                list = dataSets;
                f10 = radius;
                f11 = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
            }
            i13 = i10 + 1;
            radius = f10;
            absoluteAngles = fArr2;
            rotationAngle = f11;
            drawAngles = fArr;
            dataSets = list;
        }
        MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected float getSliceSpace(IPieDataSet iPieDataSet) {
        if (iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled() && iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
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
}
