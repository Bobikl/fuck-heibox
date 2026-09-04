package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.AxisBase;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public class IndexAxisValueFormatter implements IAxisValueFormatter {
    private int mValueCount;
    private String[] mValues;

    public IndexAxisValueFormatter() {
        this.mValues = new String[0];
        this.mValueCount = 0;
    }

    public IndexAxisValueFormatter(Collection<String> collection) {
        this.mValues = new String[0];
        this.mValueCount = 0;
        if (collection != null) {
            setValues((String[]) collection.toArray(new String[collection.size()]));
        }
    }

    public IndexAxisValueFormatter(String[] strArr) {
        this.mValues = new String[0];
        this.mValueCount = 0;
        if (strArr != null) {
            setValues(strArr);
        }
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public String getFormattedValue(float f10, AxisBase axisBase) {
        int iRound = Math.round(f10);
        return (iRound < 0 || iRound >= this.mValueCount || iRound != ((int) f10)) ? "" : this.mValues[iRound];
    }

    public String[] getValues() {
        return this.mValues;
    }

    public void setValues(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.mValues = strArr;
        this.mValueCount = strArr.length;
    }
}
