package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public class LargeValueFormatter implements IValueFormatter, IAxisValueFormatter {
    private static final int MAX_LENGTH = 5;
    private static String[] SUFFIX = {"", "k", "m", "b", "t"};
    private DecimalFormat mFormat;
    private String mText;

    public LargeValueFormatter() {
        this.mText = "";
        this.mFormat = new DecimalFormat("###E00");
    }

    public LargeValueFormatter(String str) {
        this();
        this.mText = str;
    }

    private String makePretty(double d10) {
        String str = this.mFormat.format(d10);
        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
        String strReplaceAll = str.replaceAll("E[0-9][0-9]", SUFFIX[Integer.valueOf(Character.getNumericValue(str.charAt(str.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (strReplaceAll.length() <= 5 && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                return strReplaceAll;
            }
            strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 2) + strReplaceAll.substring(strReplaceAll.length() - 1);
        }
    }

    public int getDecimalDigits() {
        return 0;
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public String getFormattedValue(float f10, AxisBase axisBase) {
        return makePretty(f10) + this.mText;
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
        return makePretty(f10) + this.mText;
    }

    public void setAppendix(String str) {
        this.mText = str;
    }

    public void setSuffix(String[] strArr) {
        SUFFIX = strArr;
    }
}
