package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultValueFormatter implements IValueFormatter {
    protected int mDecimalDigits;
    protected DecimalFormat mFormat;

    public DefaultValueFormatter(int i10) {
        setup(i10);
    }

    public int getDecimalDigits() {
        return this.mDecimalDigits;
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
        return this.mFormat.format(f10);
    }

    public void setup(int i10) {
        this.mDecimalDigits = i10;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
