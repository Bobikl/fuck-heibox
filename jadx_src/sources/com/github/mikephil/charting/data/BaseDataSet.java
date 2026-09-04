package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import androidx.core.view.j1;
import bb.c;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseDataSet<T extends Entry> implements IDataSet<T> {
    protected YAxis.AxisDependency mAxisDependency;
    protected List<Integer> mColors;
    protected boolean mDrawIcons;
    protected boolean mDrawValues;
    private Legend.LegendForm mForm;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    protected boolean mHighlightEnabled;
    protected MPPointF mIconsOffset;
    private String mLabel;
    protected List<Integer> mValueColors;
    protected transient IValueFormatter mValueFormatter;
    protected float mValueTextSize;
    protected Typeface mValueTypeface;
    protected boolean mVisible;

    public BaseDataSet() {
        this.mColors = null;
        this.mValueColors = null;
        this.mLabel = "DataSet";
        this.mAxisDependency = YAxis.AxisDependency.LEFT;
        this.mHighlightEnabled = true;
        this.mForm = Legend.LegendForm.DEFAULT;
        this.mFormSize = Float.NaN;
        this.mFormLineWidth = Float.NaN;
        this.mFormLineDashEffect = null;
        this.mDrawValues = true;
        this.mDrawIcons = true;
        this.mIconsOffset = new MPPointF();
        this.mValueTextSize = 17.0f;
        this.mVisible = true;
        this.mColors = new ArrayList();
        this.mValueColors = new ArrayList();
        this.mColors.add(Integer.valueOf(Color.rgb(140, c.b.A1, 255)));
        this.mValueColors.add(Integer.valueOf(j1.f21601t));
    }

    public BaseDataSet(String str) {
        this();
        this.mLabel = str;
    }

    public void addColor(int i10) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.add(Integer.valueOf(i10));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean contains(T t10) {
        for (int i10 = 0; i10 < getEntryCount(); i10++) {
            if (getEntryForIndex(i10).equals(t10)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public YAxis.AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor() {
        return this.mColors.get(0).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor(int i10) {
        List<Integer> list = this.mColors;
        return list.get(i10 % list.size()).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<Integer> getColors() {
        return this.mColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public Legend.LegendForm getForm() {
        return this.mForm;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getFormSize() {
        return this.mFormSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public MPPointF getIconsOffset() {
        return this.mIconsOffset;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getIndexInEntries(int i10) {
        for (int i11 = 0; i11 < getEntryCount(); i11++) {
            if (i10 == getEntryForIndex(i11).getX()) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public String getLabel() {
        return this.mLabel;
    }

    public List<Integer> getValueColors() {
        return this.mValueColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public IValueFormatter getValueFormatter() {
        return needsFormatter() ? Utils.getDefaultValueFormatter() : this.mValueFormatter;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getValueTextColor() {
        return this.mValueColors.get(0).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getValueTextColor(int i10) {
        List<Integer> list = this.mValueColors;
        return list.get(i10 % list.size()).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getValueTextSize() {
        return this.mValueTextSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public Typeface getValueTypeface() {
        return this.mValueTypeface;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isDrawIconsEnabled() {
        return this.mDrawIcons;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isDrawValuesEnabled() {
        return this.mDrawValues;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isHighlightEnabled() {
        return this.mHighlightEnabled;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isVisible() {
        return this.mVisible;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean needsFormatter() {
        return this.mValueFormatter == null;
    }

    public void notifyDataSetChanged() {
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntry(int i10) {
        return removeEntry(getEntryForIndex(i10));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntryByXValue(float f10) {
        return removeEntry(getEntryForXValue(f10, Float.NaN));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeFirst() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(0));
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeLast() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(getEntryCount() - 1));
        }
        return false;
    }

    public void resetColors() {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setAxisDependency(YAxis.AxisDependency axisDependency) {
        this.mAxisDependency = axisDependency;
    }

    public void setColor(int i10) {
        resetColors();
        this.mColors.add(Integer.valueOf(i10));
    }

    public void setColor(int i10, int i11) {
        setColor(Color.argb(i11, Color.red(i10), Color.green(i10), Color.blue(i10)));
    }

    public void setColors(List<Integer> list) {
        this.mColors = list;
    }

    public void setColors(int... iArr) {
        this.mColors = ColorTemplate.createColors(iArr);
    }

    public void setColors(int[] iArr, int i10) {
        resetColors();
        for (int i11 : iArr) {
            addColor(Color.argb(i10, Color.red(i11), Color.green(i11), Color.blue(i11)));
        }
    }

    public void setColors(int[] iArr, Context context) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
        for (int i10 : iArr) {
            this.mColors.add(Integer.valueOf(context.getResources().getColor(i10)));
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setDrawIcons(boolean z10) {
        this.mDrawIcons = z10;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setDrawValues(boolean z10) {
        this.mDrawValues = z10;
    }

    public void setForm(Legend.LegendForm legendForm) {
        this.mForm = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f10) {
        this.mFormLineWidth = f10;
    }

    public void setFormSize(float f10) {
        this.mFormSize = f10;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setHighlightEnabled(boolean z10) {
        this.mHighlightEnabled = z10;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setIconsOffset(MPPointF mPPointF) {
        MPPointF mPPointF2 = this.mIconsOffset;
        mPPointF2.f43143x = mPPointF.f43143x;
        mPPointF2.f43144y = mPPointF.f43144y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setLabel(String str) {
        this.mLabel = str;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueFormatter(IValueFormatter iValueFormatter) {
        if (iValueFormatter == null) {
            return;
        }
        this.mValueFormatter = iValueFormatter;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextColor(int i10) {
        this.mValueColors.clear();
        this.mValueColors.add(Integer.valueOf(i10));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextColors(List<Integer> list) {
        this.mValueColors = list;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextSize(float f10) {
        this.mValueTextSize = Utils.convertDpToPixel(f10);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTypeface(Typeface typeface) {
        this.mValueTypeface = typeface;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setVisible(boolean z10) {
        this.mVisible = z10;
    }
}
