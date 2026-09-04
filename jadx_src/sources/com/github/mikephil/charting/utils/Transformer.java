package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Transformer {
    protected ViewPortHandler mViewPortHandler;
    protected Matrix mMatrixValueToPx = new Matrix();
    protected Matrix mMatrixOffset = new Matrix();
    protected float[] valuePointsForGenerateTransformedValuesScatter = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesBubble = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesLine = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesCandle = new float[1];
    protected Matrix mPixelToValueMatrixBuffer = new Matrix();
    float[] ptsBuffer = new float[2];
    private Matrix mMBuffer1 = new Matrix();
    private Matrix mMBuffer2 = new Matrix();

    public Transformer(ViewPortHandler viewPortHandler) {
        this.mViewPortHandler = viewPortHandler;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesBubble(IBubbleDataSet iBubbleDataSet, float f10, int i10, int i11) {
        int i12 = ((i11 - i10) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesBubble.length != i12) {
            this.valuePointsForGenerateTransformedValuesBubble = new float[i12];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesBubble;
        for (int i13 = 0; i13 < i12; i13 += 2) {
            ?? entryForIndex = iBubbleDataSet.getEntryForIndex((i13 / 2) + i10);
            if (entryForIndex != 0) {
                fArr[i13] = entryForIndex.getX();
                fArr[i13 + 1] = entryForIndex.getY() * f10;
            } else {
                fArr[i13] = 0.0f;
                fArr[i13 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float[] generateTransformedValuesCandle(ICandleDataSet iCandleDataSet, float f10, float f11, int i10, int i11) {
        int i12 = ((int) (((i11 - i10) * f10) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesCandle.length != i12) {
            this.valuePointsForGenerateTransformedValuesCandle = new float[i12];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesCandle;
        for (int i13 = 0; i13 < i12; i13 += 2) {
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex((i13 / 2) + i10);
            if (candleEntry != null) {
                fArr[i13] = candleEntry.getX();
                fArr[i13 + 1] = candleEntry.getHigh() * f11;
            } else {
                fArr[i13] = 0.0f;
                fArr[i13 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesLine(ILineDataSet iLineDataSet, float f10, float f11, int i10, int i11) {
        int i12 = (((int) ((i11 - i10) * f10)) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesLine.length != i12) {
            this.valuePointsForGenerateTransformedValuesLine = new float[i12];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesLine;
        for (int i13 = 0; i13 < i12; i13 += 2) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex((i13 / 2) + i10);
            if (entryForIndex != 0) {
                fArr[i13] = entryForIndex.getX();
                fArr[i13 + 1] = entryForIndex.getY() * f11;
            } else {
                fArr[i13] = 0.0f;
                fArr[i13 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesScatter(IScatterDataSet iScatterDataSet, float f10, float f11, int i10, int i11) {
        int i12 = ((int) (((i11 - i10) * f10) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesScatter.length != i12) {
            this.valuePointsForGenerateTransformedValuesScatter = new float[i12];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesScatter;
        for (int i13 = 0; i13 < i12; i13 += 2) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex((i13 / 2) + i10);
            if (entryForIndex != 0) {
                fArr[i13] = entryForIndex.getX();
                fArr[i13 + 1] = entryForIndex.getY() * f11;
            } else {
                fArr[i13] = 0.0f;
                fArr[i13 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public Matrix getOffsetMatrix() {
        return this.mMatrixOffset;
    }

    public MPPointD getPixelForValues(float f10, float f11) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f10;
        fArr[1] = f11;
        pointValuesToPixel(fArr);
        float[] fArr2 = this.ptsBuffer;
        return MPPointD.getInstance(fArr2[0], fArr2[1]);
    }

    public Matrix getPixelToValueMatrix() {
        getValueToPixelMatrix().invert(this.mMBuffer2);
        return this.mMBuffer2;
    }

    public Matrix getValueMatrix() {
        return this.mMatrixValueToPx;
    }

    public Matrix getValueToPixelMatrix() {
        this.mMBuffer1.set(this.mMatrixValueToPx);
        this.mMBuffer1.postConcat(this.mViewPortHandler.mMatrixTouch);
        this.mMBuffer1.postConcat(this.mMatrixOffset);
        return this.mMBuffer1;
    }

    public MPPointD getValuesByTouchPoint(float f10, float f11) {
        MPPointD mPPointD = MPPointD.getInstance(0.0d, 0.0d);
        getValuesByTouchPoint(f10, f11, mPPointD);
        return mPPointD;
    }

    public void getValuesByTouchPoint(float f10, float f11, MPPointD mPPointD) {
        float[] fArr = this.ptsBuffer;
        fArr[0] = f10;
        fArr[1] = f11;
        pixelsToValue(fArr);
        float[] fArr2 = this.ptsBuffer;
        mPPointD.f43141x = fArr2[0];
        mPPointD.f43142y = fArr2[1];
    }

    public void pathValueToPixel(Path path) {
        path.transform(this.mMatrixValueToPx);
        path.transform(this.mViewPortHandler.getMatrixTouch());
        path.transform(this.mMatrixOffset);
    }

    public void pathValuesToPixel(List<Path> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            pathValueToPixel(list.get(i10));
        }
    }

    public void pixelsToValue(float[] fArr) {
        Matrix matrix = this.mPixelToValueMatrixBuffer;
        matrix.reset();
        this.mMatrixOffset.invert(matrix);
        matrix.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().invert(matrix);
        matrix.mapPoints(fArr);
        this.mMatrixValueToPx.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void pointValuesToPixel(float[] fArr) {
        this.mMatrixValueToPx.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
        this.mMatrixOffset.mapPoints(fArr);
    }

    public void prepareMatrixOffset(boolean z10) {
        this.mMatrixOffset.reset();
        if (!z10) {
            this.mMatrixOffset.postTranslate(this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
        } else {
            this.mMatrixOffset.setTranslate(this.mViewPortHandler.offsetLeft(), -this.mViewPortHandler.offsetTop());
            this.mMatrixOffset.postScale(1.0f, -1.0f);
        }
    }

    public void prepareMatrixValuePx(float f10, float f11, float f12, float f13) {
        float fContentWidth = this.mViewPortHandler.contentWidth() / f11;
        float fContentHeight = this.mViewPortHandler.contentHeight() / f12;
        if (Float.isInfinite(fContentWidth)) {
            fContentWidth = 0.0f;
        }
        if (Float.isInfinite(fContentHeight)) {
            fContentHeight = 0.0f;
        }
        this.mMatrixValueToPx.reset();
        this.mMatrixValueToPx.postTranslate(-f10, -f13);
        this.mMatrixValueToPx.postScale(fContentWidth, -fContentHeight);
    }

    public void rectToPixelPhase(RectF rectF, float f10) {
        rectF.top *= f10;
        rectF.bottom *= f10;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectToPixelPhaseHorizontal(RectF rectF, float f10) {
        rectF.left *= f10;
        rectF.right *= f10;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixel(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(RectF rectF, float f10) {
        rectF.left *= f10;
        rectF.right *= f10;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValuesToPixel(List<RectF> list) {
        Matrix valueToPixelMatrix = getValueToPixelMatrix();
        for (int i10 = 0; i10 < list.size(); i10++) {
            valueToPixelMatrix.mapRect(list.get(i10));
        }
    }
}
