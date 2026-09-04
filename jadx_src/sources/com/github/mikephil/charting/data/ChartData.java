package com.github.mikephil.charting.data;

import android.graphics.Typeface;
import android.util.Log;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ChartData<T extends IDataSet<? extends Entry>> {
    protected List<T> mDataSets;
    protected float mLeftAxisMax;
    protected float mLeftAxisMin;
    protected float mRightAxisMax;
    protected float mRightAxisMin;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public ChartData() {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = new ArrayList();
    }

    public ChartData(List<T> list) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = list;
        notifyDataChanged();
    }

    public ChartData(T... tArr) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = arrayToList(tArr);
        notifyDataChanged();
    }

    private List<T> arrayToList(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    public void addDataSet(T t10) {
        if (t10 == null) {
            return;
        }
        calcMinMax(t10);
        this.mDataSets.add(t10);
    }

    public void addEntry(Entry entry, int i10) {
        if (this.mDataSets.size() <= i10 || i10 < 0) {
            Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
            return;
        }
        T t10 = this.mDataSets.get(i10);
        if (t10.addEntry(entry)) {
            calcMinMax(entry, t10.getAxisDependency());
        }
    }

    protected void calcMinMax() {
        List<T> list = this.mDataSets;
        if (list == null) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            calcMinMax(it.next());
        }
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        IDataSet firstLeft = getFirstLeft(this.mDataSets);
        if (firstLeft != null) {
            this.mLeftAxisMax = firstLeft.getYMax();
            this.mLeftAxisMin = firstLeft.getYMin();
            for (T t10 : this.mDataSets) {
                if (t10.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    if (t10.getYMin() < this.mLeftAxisMin) {
                        this.mLeftAxisMin = t10.getYMin();
                    }
                    if (t10.getYMax() > this.mLeftAxisMax) {
                        this.mLeftAxisMax = t10.getYMax();
                    }
                }
            }
        }
        IDataSet firstRight = getFirstRight(this.mDataSets);
        if (firstRight != null) {
            this.mRightAxisMax = firstRight.getYMax();
            this.mRightAxisMin = firstRight.getYMin();
            for (T t11 : this.mDataSets) {
                if (t11.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                    if (t11.getYMin() < this.mRightAxisMin) {
                        this.mRightAxisMin = t11.getYMin();
                    }
                    if (t11.getYMax() > this.mRightAxisMax) {
                        this.mRightAxisMax = t11.getYMax();
                    }
                }
            }
        }
    }

    protected void calcMinMax(Entry entry, YAxis.AxisDependency axisDependency) {
        if (this.mYMax < entry.getY()) {
            this.mYMax = entry.getY();
        }
        if (this.mYMin > entry.getY()) {
            this.mYMin = entry.getY();
        }
        if (this.mXMax < entry.getX()) {
            this.mXMax = entry.getX();
        }
        if (this.mXMin > entry.getX()) {
            this.mXMin = entry.getX();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < entry.getY()) {
                this.mLeftAxisMax = entry.getY();
            }
            if (this.mLeftAxisMin > entry.getY()) {
                this.mLeftAxisMin = entry.getY();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < entry.getY()) {
            this.mRightAxisMax = entry.getY();
        }
        if (this.mRightAxisMin > entry.getY()) {
            this.mRightAxisMin = entry.getY();
        }
    }

    protected void calcMinMax(T t10) {
        if (this.mYMax < t10.getYMax()) {
            this.mYMax = t10.getYMax();
        }
        if (this.mYMin > t10.getYMin()) {
            this.mYMin = t10.getYMin();
        }
        if (this.mXMax < t10.getXMax()) {
            this.mXMax = t10.getXMax();
        }
        if (this.mXMin > t10.getXMin()) {
            this.mXMin = t10.getXMin();
        }
        if (t10.getAxisDependency() == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < t10.getYMax()) {
                this.mLeftAxisMax = t10.getYMax();
            }
            if (this.mLeftAxisMin > t10.getYMin()) {
                this.mLeftAxisMin = t10.getYMin();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < t10.getYMax()) {
            this.mRightAxisMax = t10.getYMax();
        }
        if (this.mRightAxisMin > t10.getYMin()) {
            this.mRightAxisMin = t10.getYMin();
        }
    }

    public void calcMinMaxY(float f10, float f11) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().calcMinMaxY(f10, f11);
        }
        calcMinMax();
    }

    public void clearValues() {
        List<T> list = this.mDataSets;
        if (list != null) {
            list.clear();
        }
        notifyDataChanged();
    }

    public boolean contains(T t10) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (it.next().equals(t10)) {
                return true;
            }
        }
        return false;
    }

    public int[] getColors() {
        if (this.mDataSets == null) {
            return null;
        }
        int size = 0;
        for (int i10 = 0; i10 < this.mDataSets.size(); i10++) {
            size += this.mDataSets.get(i10).getColors().size();
        }
        int[] iArr = new int[size];
        int i11 = 0;
        for (int i12 = 0; i12 < this.mDataSets.size(); i12++) {
            Iterator<Integer> it = this.mDataSets.get(i12).getColors().iterator();
            while (it.hasNext()) {
                iArr[i11] = it.next().intValue();
                i11++;
            }
        }
        return iArr;
    }

    public T getDataSetByIndex(int i10) {
        List<T> list = this.mDataSets;
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return this.mDataSets.get(i10);
    }

    public T getDataSetByLabel(String str, boolean z10) {
        int dataSetIndexByLabel = getDataSetIndexByLabel(this.mDataSets, str, z10);
        if (dataSetIndexByLabel < 0 || dataSetIndexByLabel >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(dataSetIndexByLabel);
    }

    public int getDataSetCount() {
        List<T> list = this.mDataSets;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T getDataSetForEntry(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i10 = 0; i10 < this.mDataSets.size(); i10++) {
            T t10 = this.mDataSets.get(i10);
            for (int i11 = 0; i11 < t10.getEntryCount(); i11++) {
                if (entry.equalTo(t10.getEntryForXValue(entry.getX(), entry.getY()))) {
                    return t10;
                }
            }
        }
        return null;
    }

    protected int getDataSetIndexByLabel(List<T> list, String str, boolean z10) {
        int i10 = 0;
        if (z10) {
            while (i10 < list.size()) {
                if (str.equalsIgnoreCase(list.get(i10).getLabel())) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < list.size()) {
            if (str.equals(list.get(i10).getLabel())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String[] getDataSetLabels() {
        String[] strArr = new String[this.mDataSets.size()];
        for (int i10 = 0; i10 < this.mDataSets.size(); i10++) {
            strArr[i10] = this.mDataSets.get(i10).getLabel();
        }
        return strArr;
    }

    public List<T> getDataSets() {
        return this.mDataSets;
    }

    public int getEntryCount() {
        Iterator<T> it = this.mDataSets.iterator();
        int entryCount = 0;
        while (it.hasNext()) {
            entryCount += it.next().getEntryCount();
        }
        return entryCount;
    }

    public Entry getEntryForHighlight(Highlight highlight) {
        if (highlight.getDataSetIndex() >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(highlight.getDataSetIndex()).getEntryForXValue(highlight.getX(), highlight.getY());
    }

    protected T getFirstLeft(List<T> list) {
        for (T t10 : list) {
            if (t10.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                return t10;
            }
        }
        return null;
    }

    public T getFirstRight(List<T> list) {
        for (T t10 : list) {
            if (t10.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                return t10;
            }
        }
        return null;
    }

    public int getIndexOfDataSet(T t10) {
        return this.mDataSets.indexOf(t10);
    }

    public T getMaxEntryCountSet() {
        List<T> list = this.mDataSets;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t10 = this.mDataSets.get(0);
        for (T t11 : this.mDataSets) {
            if (t11.getEntryCount() > t10.getEntryCount()) {
                t10 = t11;
            }
        }
        return t10;
    }

    public float getXMax() {
        return this.mXMax;
    }

    public float getXMin() {
        return this.mXMin;
    }

    public float getYMax() {
        return this.mYMax;
    }

    public float getYMax(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f10 = this.mLeftAxisMax;
            return f10 == -3.4028235E38f ? this.mRightAxisMax : f10;
        }
        float f11 = this.mRightAxisMax;
        return f11 == -3.4028235E38f ? this.mLeftAxisMax : f11;
    }

    public float getYMin() {
        return this.mYMin;
    }

    public float getYMin(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f10 = this.mLeftAxisMin;
            return f10 == Float.MAX_VALUE ? this.mRightAxisMin : f10;
        }
        float f11 = this.mRightAxisMin;
        return f11 == Float.MAX_VALUE ? this.mLeftAxisMin : f11;
    }

    public boolean isHighlightEnabled() {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (!it.next().isHighlightEnabled()) {
                return false;
            }
        }
        return true;
    }

    public void notifyDataChanged() {
        calcMinMax();
    }

    public boolean removeDataSet(int i10) {
        if (i10 >= this.mDataSets.size() || i10 < 0) {
            return false;
        }
        return removeDataSet(this.mDataSets.get(i10));
    }

    public boolean removeDataSet(T t10) {
        if (t10 == null) {
            return false;
        }
        boolean zRemove = this.mDataSets.remove(t10);
        if (zRemove) {
            calcMinMax();
        }
        return zRemove;
    }

    public boolean removeEntry(float f10, int i10) {
        Entry entryForXValue;
        if (i10 < this.mDataSets.size() && (entryForXValue = this.mDataSets.get(i10).getEntryForXValue(f10, Float.NaN)) != null) {
            return removeEntry(entryForXValue, i10);
        }
        return false;
    }

    public boolean removeEntry(Entry entry, int i10) {
        T t10;
        if (entry == null || i10 >= this.mDataSets.size() || (t10 = this.mDataSets.get(i10)) == null) {
            return false;
        }
        boolean zRemoveEntry = t10.removeEntry(entry);
        if (zRemoveEntry) {
            calcMinMax();
        }
        return zRemoveEntry;
    }

    public void setDrawValues(boolean z10) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setDrawValues(z10);
        }
    }

    public void setHighlightEnabled(boolean z10) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setHighlightEnabled(z10);
        }
    }

    public void setValueFormatter(IValueFormatter iValueFormatter) {
        if (iValueFormatter == null) {
            return;
        }
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueFormatter(iValueFormatter);
        }
    }

    public void setValueTextColor(int i10) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColor(i10);
        }
    }

    public void setValueTextColors(List<Integer> list) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColors(list);
        }
    }

    public void setValueTextSize(float f10) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextSize(f10);
        }
    }

    public void setValueTypeface(Typeface typeface) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTypeface(typeface);
        }
    }
}
