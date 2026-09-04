package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

/* JADX INFO: loaded from: classes6.dex */
public class BarBuffer extends AbstractBuffer<IBarDataSet> {
    protected float mBarWidth;
    protected boolean mContainsStacks;
    protected int mDataSetCount;
    protected int mDataSetIndex;
    protected boolean mInverted;

    public BarBuffer(int i10, int i11, boolean z10) {
        super(i10);
        this.mDataSetIndex = 0;
        this.mInverted = false;
        this.mBarWidth = 1.0f;
        this.mDataSetCount = i11;
        this.mContainsStacks = z10;
    }

    protected void addBar(float f10, float f11, float f12, float f13) {
        float[] fArr = this.buffer;
        int i10 = this.index;
        int i11 = i10 + 1;
        fArr[i10] = f10;
        int i12 = i11 + 1;
        fArr[i11] = f11;
        int i13 = i12 + 1;
        fArr[i12] = f12;
        this.index = i13 + 1;
        fArr[i13] = f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.AbstractBuffer
    public void feed(IBarDataSet iBarDataSet) {
        float f10;
        float fAbs;
        float fAbs2;
        float f11;
        float entryCount = iBarDataSet.getEntryCount() * this.phaseX;
        float f12 = this.mBarWidth / 2.0f;
        for (int i10 = 0; i10 < entryCount; i10++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i10);
            if (barEntry != null) {
                float x10 = barEntry.getX();
                float y10 = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                if (!this.mContainsStacks || yVals == null) {
                    float f13 = x10 - f12;
                    float f14 = x10 + f12;
                    if (this.mInverted) {
                        f10 = y10 >= 0.0f ? y10 : 0.0f;
                        if (y10 > 0.0f) {
                            y10 = 0.0f;
                        }
                    } else {
                        float f15 = y10 >= 0.0f ? y10 : 0.0f;
                        if (y10 > 0.0f) {
                            y10 = 0.0f;
                        }
                        float f16 = y10;
                        y10 = f15;
                        f10 = f16;
                    }
                    if (y10 > 0.0f) {
                        y10 *= this.phaseY;
                    } else {
                        f10 *= this.phaseY;
                    }
                    addBar(f13, y10, f14, f10);
                } else {
                    float f17 = -barEntry.getNegativeSum();
                    float f18 = 0.0f;
                    int i11 = 0;
                    while (i11 < yVals.length) {
                        float f19 = yVals[i11];
                        if (f19 == 0.0f && (f18 == 0.0f || f17 == 0.0f)) {
                            fAbs = f19;
                            fAbs2 = f17;
                            f17 = fAbs;
                        } else if (f19 >= 0.0f) {
                            fAbs = f19 + f18;
                            fAbs2 = f17;
                            f17 = f18;
                            f18 = fAbs;
                        } else {
                            fAbs = Math.abs(f19) + f17;
                            fAbs2 = Math.abs(f19) + f17;
                        }
                        float f20 = x10 - f12;
                        float f21 = x10 + f12;
                        if (this.mInverted) {
                            f11 = f17 >= fAbs ? f17 : fAbs;
                            if (f17 > fAbs) {
                                f17 = fAbs;
                            }
                        } else {
                            float f22 = f17 >= fAbs ? f17 : fAbs;
                            if (f17 > fAbs) {
                                f17 = fAbs;
                            }
                            float f23 = f17;
                            f17 = f22;
                            f11 = f23;
                        }
                        float f24 = this.phaseY;
                        addBar(f20, f17 * f24, f21, f11 * f24);
                        i11++;
                        f17 = fAbs2;
                    }
                }
            }
        }
        reset();
    }

    public void setBarWidth(float f10) {
        this.mBarWidth = f10;
    }

    public void setDataSet(int i10) {
        this.mDataSetIndex = i10;
    }

    public void setInverted(boolean z10) {
        this.mInverted = z10;
    }
}
