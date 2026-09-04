package com.github.mikephil.charting.interfaces.datasets;

import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.MPPointF;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface IDataSet<T extends Entry> {
    boolean addEntry(T t10);

    void addEntryOrdered(T t10);

    void calcMinMax();

    void calcMinMaxY(float f10, float f11);

    void clear();

    boolean contains(T t10);

    YAxis.AxisDependency getAxisDependency();

    int getColor();

    int getColor(int i10);

    List<Integer> getColors();

    List<T> getEntriesForXValue(float f10);

    int getEntryCount();

    T getEntryForIndex(int i10);

    T getEntryForXValue(float f10, float f11);

    T getEntryForXValue(float f10, float f11, DataSet.Rounding rounding);

    int getEntryIndex(float f10, float f11, DataSet.Rounding rounding);

    int getEntryIndex(T t10);

    Legend.LegendForm getForm();

    DashPathEffect getFormLineDashEffect();

    float getFormLineWidth();

    float getFormSize();

    MPPointF getIconsOffset();

    int getIndexInEntries(int i10);

    String getLabel();

    IValueFormatter getValueFormatter();

    int getValueTextColor();

    int getValueTextColor(int i10);

    float getValueTextSize();

    Typeface getValueTypeface();

    float getXMax();

    float getXMin();

    float getYMax();

    float getYMin();

    boolean isDrawIconsEnabled();

    boolean isDrawValuesEnabled();

    boolean isHighlightEnabled();

    boolean isVisible();

    boolean needsFormatter();

    boolean removeEntry(int i10);

    boolean removeEntry(T t10);

    boolean removeEntryByXValue(float f10);

    boolean removeFirst();

    boolean removeLast();

    void setAxisDependency(YAxis.AxisDependency axisDependency);

    void setDrawIcons(boolean z10);

    void setDrawValues(boolean z10);

    void setHighlightEnabled(boolean z10);

    void setIconsOffset(MPPointF mPPointF);

    void setLabel(String str);

    void setValueFormatter(IValueFormatter iValueFormatter);

    void setValueTextColor(int i10);

    void setValueTextColors(List<Integer> list);

    void setValueTextSize(float f10);

    void setValueTypeface(Typeface typeface);

    void setVisible(boolean z10);
}
