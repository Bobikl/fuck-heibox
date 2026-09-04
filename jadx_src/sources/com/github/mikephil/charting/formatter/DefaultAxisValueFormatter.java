package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.AxisBase;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultAxisValueFormatter implements IAxisValueFormatter {
    protected int digits;
    protected DecimalFormat mFormat;

    public DefaultAxisValueFormatter(int i10) {
        this.digits = i10;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public int getDecimalDigits() {
        return this.digits;
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public String getFormattedValue(float f10, AxisBase axisBase) {
        return this.mFormat.format(f10);
    }
}
