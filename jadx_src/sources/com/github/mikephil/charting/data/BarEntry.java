package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.highlight.Range;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ParcelCreator"})
public class BarEntry extends Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private Range[] mRanges;
    private float[] mYVals;

    public BarEntry(float f10, float f11) {
        super(f10, f11);
    }

    public BarEntry(float f10, float f11, Drawable drawable) {
        super(f10, f11, drawable);
    }

    public BarEntry(float f10, float f11, Drawable drawable, Object obj) {
        super(f10, f11, drawable, obj);
    }

    public BarEntry(float f10, float f11, Object obj) {
        super(f10, f11, obj);
    }

    public BarEntry(float f10, float[] fArr) {
        super(f10, calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f10, float[] fArr, Drawable drawable) {
        super(f10, calcSum(fArr), drawable);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f10, float[] fArr, Drawable drawable, Object obj) {
        super(f10, calcSum(fArr), drawable, obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f10, float[] fArr, Object obj) {
        super(f10, calcSum(fArr), obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    private void calcPosNegSum() {
        float[] fArr = this.mYVals;
        if (fArr == null) {
            this.mNegativeSum = 0.0f;
            this.mPositiveSum = 0.0f;
            return;
        }
        float fAbs = 0.0f;
        float f10 = 0.0f;
        for (float f11 : fArr) {
            if (f11 <= 0.0f) {
                fAbs += Math.abs(f11);
            } else {
                f10 += f11;
            }
        }
        this.mNegativeSum = fAbs;
        this.mPositiveSum = f10;
    }

    private static float calcSum(float[] fArr) {
        float f10 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    protected void calcRanges() {
        float[] yVals = getYVals();
        if (yVals == null || yVals.length == 0) {
            return;
        }
        this.mRanges = new Range[yVals.length];
        float f10 = -getNegativeSum();
        int i10 = 0;
        float f11 = 0.0f;
        while (true) {
            Range[] rangeArr = this.mRanges;
            if (i10 >= rangeArr.length) {
                return;
            }
            float f12 = yVals[i10];
            if (f12 < 0.0f) {
                float f13 = f10 - f12;
                rangeArr[i10] = new Range(f10, f13);
                f10 = f13;
            } else {
                float f14 = f12 + f11;
                rangeArr[i10] = new Range(f11, f14);
                f11 = f14;
            }
            i10++;
        }
    }

    @Override // com.github.mikephil.charting.data.Entry
    public BarEntry copy() {
        BarEntry barEntry = new BarEntry(getX(), getY(), getData());
        barEntry.setVals(this.mYVals);
        return barEntry;
    }

    @Deprecated
    public float getBelowSum(int i10) {
        return getSumBelow(i10);
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    public Range[] getRanges() {
        return this.mRanges;
    }

    public float getSumBelow(int i10) {
        float[] fArr = this.mYVals;
        float f10 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i10 && length >= 0; length--) {
            f10 += this.mYVals[length];
        }
        return f10;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public float[] getYVals() {
        return this.mYVals;
    }

    public boolean isStacked() {
        return this.mYVals != null;
    }

    public void setVals(float[] fArr) {
        setY(calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }
}
