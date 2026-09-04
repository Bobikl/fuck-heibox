package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public class StackedValueFormatter implements IValueFormatter {
    private String mAppendix;
    private boolean mDrawWholeStack;
    private DecimalFormat mFormat;

    public StackedValueFormatter(boolean z10, String str, int i10) {
        this.mDrawWholeStack = z10;
        this.mAppendix = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
        BarEntry barEntry;
        float[] yVals;
        if (this.mDrawWholeStack || !(entry instanceof BarEntry) || (yVals = (barEntry = (BarEntry) entry).getYVals()) == null) {
            return this.mFormat.format(f10) + this.mAppendix;
        }
        if (yVals[yVals.length - 1] != f10) {
            return "";
        }
        return this.mFormat.format(barEntry.getY()) + this.mAppendix;
    }
}
