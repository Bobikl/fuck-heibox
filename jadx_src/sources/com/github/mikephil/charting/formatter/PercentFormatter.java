package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public class PercentFormatter implements IValueFormatter, IAxisValueFormatter {
    protected DecimalFormat mFormat;

    public PercentFormatter() {
        this.mFormat = new DecimalFormat("###,###,##0.0");
    }

    public PercentFormatter(DecimalFormat decimalFormat) {
        this.mFormat = decimalFormat;
    }

    public int getDecimalDigits() {
        return 1;
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public String getFormattedValue(float f10, AxisBase axisBase) {
        return this.mFormat.format(f10) + " %";
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
        return this.mFormat.format(f10) + " %";
    }
}
