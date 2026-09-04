package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.j1;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class XAxisRenderer extends AxisRenderer {
    protected RectF mGridClippingRect;
    protected RectF mLimitLineClippingRect;
    private Path mLimitLinePath;
    float[] mLimitLineSegmentsBuffer;
    protected float[] mRenderGridLinesBuffer;
    protected Path mRenderGridLinesPath;
    protected float[] mRenderLimitLinesBuffer;
    protected XAxis mXAxis;

    public XAxisRenderer(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, transformer, xAxis);
        this.mRenderGridLinesPath = new Path();
        this.mRenderGridLinesBuffer = new float[2];
        this.mGridClippingRect = new RectF();
        this.mRenderLimitLinesBuffer = new float[2];
        this.mLimitLineClippingRect = new RectF();
        this.mLimitLineSegmentsBuffer = new float[4];
        this.mLimitLinePath = new Path();
        this.mXAxis = xAxis;
        this.mAxisLabelPaint.setColor(j1.f21601t);
        this.mAxisLabelPaint.setTextAlign(Paint.Align.CENTER);
        this.mAxisLabelPaint.setTextSize(Utils.convertDpToPixel(10.0f));
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f10, float f11, boolean z10) {
        float f12;
        double d10;
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (z10) {
                f12 = (float) valuesByTouchPoint2.f43141x;
                d10 = valuesByTouchPoint.f43141x;
            } else {
                f12 = (float) valuesByTouchPoint.f43141x;
                d10 = valuesByTouchPoint2.f43141x;
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f10 = f12;
            f11 = (float) d10;
        }
        computeAxisValues(f10, f11);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    protected void computeAxisValues(float f10, float f11) {
        super.computeAxisValues(f10, f11);
        computeSize();
    }

    protected void computeSize() {
        String longestLabel = this.mXAxis.getLongestLabel();
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        FSize fSizeCalcTextSize = Utils.calcTextSize(this.mAxisLabelPaint, longestLabel);
        float f10 = fSizeCalcTextSize.width;
        float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, "Q");
        FSize sizeOfRotatedRectangleByDegrees = Utils.getSizeOfRotatedRectangleByDegrees(f10, fCalcTextHeight, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = Math.round(f10);
        this.mXAxis.mLabelHeight = Math.round(fCalcTextHeight);
        this.mXAxis.mLabelRotatedWidth = Math.round(sizeOfRotatedRectangleByDegrees.width);
        this.mXAxis.mLabelRotatedHeight = Math.round(sizeOfRotatedRectangleByDegrees.height);
        FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
        FSize.recycleInstance(fSizeCalcTextSize);
    }

    protected void drawGridLine(Canvas canvas, float f10, float f11, Path path) {
        path.moveTo(f10, this.mViewPortHandler.contentBottom());
        path.lineTo(f10, this.mViewPortHandler.contentTop());
        canvas.drawPath(path, this.mGridPaint);
        path.reset();
    }

    protected void drawLabel(Canvas canvas, String str, float f10, float f11, MPPointF mPPointF, float f12) {
        Utils.drawXAxisValue(canvas, str, f10, f11, this.mAxisLabelPaint, mPPointF, f12);
    }

    protected void drawLabels(Canvas canvas, float f10, MPPointF mPPointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i10 = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11 += 2) {
            if (zIsCenterAxisLabelsEnabled) {
                fArr[i11] = this.mXAxis.mCenteredEntries[i11 / 2];
            } else {
                fArr[i11] = this.mXAxis.mEntries[i11 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i12 = 0; i12 < i10; i12 += 2) {
            float fCalcTextWidth = fArr[i12];
            if (this.mViewPortHandler.isInBoundsX(fCalcTextWidth)) {
                IAxisValueFormatter valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis = this.mXAxis;
                String formattedValue = valueFormatter.getFormattedValue(xAxis.mEntries[i12 / 2], xAxis);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    int i13 = this.mXAxis.mEntryCount;
                    if (i12 == i13 - 1 && i13 > 1) {
                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mAxisLabelPaint, formattedValue);
                        if (fCalcTextWidth2 > this.mViewPortHandler.offsetRight() * 2.0f && fCalcTextWidth + fCalcTextWidth2 > this.mViewPortHandler.getChartWidth()) {
                            fCalcTextWidth -= fCalcTextWidth2 / 2.0f;
                        }
                    } else if (i12 == 0) {
                        fCalcTextWidth += Utils.calcTextWidth(this.mAxisLabelPaint, formattedValue) / 2.0f;
                    }
                }
                drawLabel(canvas, formattedValue, fCalcTextWidth, f10, mPPointF, labelRotationAngle);
            }
        }
    }

    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(-this.mAxis.getGridLineWidth(), 0.0f);
        return this.mGridClippingRect;
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float yOffset = this.mXAxis.getYOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                mPPointF.f43143x = 0.5f;
                mPPointF.f43144y = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.contentTop() - yOffset, mPPointF);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                mPPointF.f43143x = 0.5f;
                mPPointF.f43144y = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.contentTop() + yOffset + this.mXAxis.mLabelRotatedHeight, mPPointF);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                mPPointF.f43143x = 0.5f;
                mPPointF.f43144y = 0.0f;
                drawLabels(canvas, this.mViewPortHandler.contentBottom() + yOffset, mPPointF);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                mPPointF.f43143x = 0.5f;
                mPPointF.f43144y = 0.0f;
                drawLabels(canvas, (this.mViewPortHandler.contentBottom() - yOffset) - this.mXAxis.mLabelRotatedHeight, mPPointF);
            } else {
                mPPointF.f43143x = 0.5f;
                mPPointF.f43144y = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.contentTop() - yOffset, mPPointF);
                mPPointF.f43143x = 0.5f;
                mPPointF.f43144y = 0.0f;
                drawLabels(canvas, this.mViewPortHandler.contentBottom() + yOffset, mPPointF);
            }
            MPPointF.recycleInstance(mPPointF);
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mXAxis.getAxisLineDashPathEffect());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mAxisLinePaint);
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int iSave = canvas.save();
            canvas.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            for (int i10 = 0; i10 < fArr.length; i10 += 2) {
                float[] fArr2 = this.mXAxis.mEntries;
                int i11 = i10 / 2;
                fArr[i10] = fArr2[i11];
                fArr[i10 + 1] = fArr2[i11];
            }
            this.mTrans.pointValuesToPixel(fArr);
            setupGridPaint();
            Path path = this.mRenderGridLinesPath;
            path.reset();
            for (int i12 = 0; i12 < fArr.length; i12 += 2) {
                drawGridLine(canvas, fArr[i12], fArr[i12 + 1], path);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public void renderLimitLineLabel(Canvas canvas, LimitLine limitLine, float[] fArr, float f10) {
        String label = limitLine.getLabel();
        if (label == null || label.equals("")) {
            return;
        }
        this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
        this.mLimitLinePaint.setPathEffect(null);
        this.mLimitLinePaint.setColor(limitLine.getTextColor());
        this.mLimitLinePaint.setStrokeWidth(0.5f);
        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
        float lineWidth = limitLine.getLineWidth() + limitLine.getXOffset();
        LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
        if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
            float fCalcTextHeight = Utils.calcTextHeight(this.mLimitLinePaint, label);
            this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(label, fArr[0] + lineWidth, this.mViewPortHandler.contentTop() + f10 + fCalcTextHeight, this.mLimitLinePaint);
        } else if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
            this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(label, fArr[0] + lineWidth, this.mViewPortHandler.contentBottom() - f10, this.mLimitLinePaint);
        } else if (labelPosition != LimitLine.LimitLabelPosition.LEFT_TOP) {
            this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(label, fArr[0] - lineWidth, this.mViewPortHandler.contentBottom() - f10, this.mLimitLinePaint);
        } else {
            this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(label, fArr[0] - lineWidth, this.mViewPortHandler.contentTop() + f10 + Utils.calcTextHeight(this.mLimitLinePaint, label), this.mLimitLinePaint);
        }
    }

    public void renderLimitLineLine(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float[] fArr2 = this.mLimitLineSegmentsBuffer;
        fArr2[0] = fArr[0];
        fArr2[1] = this.mViewPortHandler.contentTop();
        float[] fArr3 = this.mLimitLineSegmentsBuffer;
        fArr3[2] = fArr[0];
        fArr3[3] = this.mViewPortHandler.contentBottom();
        this.mLimitLinePath.reset();
        Path path = this.mLimitLinePath;
        float[] fArr4 = this.mLimitLineSegmentsBuffer;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.mLimitLinePath;
        float[] fArr5 = this.mLimitLineSegmentsBuffer;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
        this.mLimitLinePaint.setColor(limitLine.getLineColor());
        this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
        this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
        canvas.drawPath(this.mLimitLinePath, this.mLimitLinePaint);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (int i10 = 0; i10 < limitLines.size(); i10++) {
            LimitLine limitLine = limitLines.get(i10);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(-limitLine.getLineWidth(), 0.0f);
                canvas.clipRect(this.mLimitLineClippingRect);
                fArr[0] = limitLine.getLimit();
                fArr[1] = 0.0f;
                this.mTrans.pointValuesToPixel(fArr);
                renderLimitLineLine(canvas, limitLine, fArr);
                renderLimitLineLabel(canvas, limitLine, fArr, limitLine.getYOffset() + 2.0f);
                canvas.restoreToCount(iSave);
            }
        }
    }

    protected void setupGridPaint() {
        this.mGridPaint.setColor(this.mXAxis.getGridColor());
        this.mGridPaint.setStrokeWidth(this.mXAxis.getGridLineWidth());
        this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
    }
}
