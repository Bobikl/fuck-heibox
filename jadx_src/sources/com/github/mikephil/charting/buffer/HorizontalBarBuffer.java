package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

/* JADX INFO: loaded from: classes6.dex */
public class HorizontalBarBuffer extends BarBuffer {
    public HorizontalBarBuffer(int i10, int i11, boolean z10) {
        super(i10, i11, z10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.BarBuffer, com.github.mikephil.charting.buffer.AbstractBuffer
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
                    addBar(f10, f14, y10, f13);
                } else {
                    float f17 = -barEntry.getNegativeSum();
                    float f18 = 0.0f;
                    int i11 = 0;
                    while (i11 < yVals.length) {
                        float f19 = yVals[i11];
                        if (f19 >= 0.0f) {
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
                        addBar(f11 * f24, f21, f17 * f24, f20);
                        i11++;
                        f17 = fAbs2;
                    }
                }
            }
        }
        reset();
    }
}
