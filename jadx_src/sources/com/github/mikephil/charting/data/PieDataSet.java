package com.github.mikephil.charting.data;

import androidx.core.view.j1;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PieDataSet extends DataSet<PieEntry> implements IPieDataSet {
    private boolean mAutomaticallyDisableSliceSpacing;
    private float mShift;
    private float mSliceSpace;
    private int mValueLineColor;
    private float mValueLinePart1Length;
    private float mValueLinePart1OffsetPercentage;
    private float mValueLinePart2Length;
    private boolean mValueLineVariableLength;
    private float mValueLineWidth;
    private ValuePosition mXValuePosition;
    private ValuePosition mYValuePosition;

    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(List<PieEntry> list, String str) {
        super(list, str);
        this.mSliceSpace = 0.0f;
        this.mShift = 18.0f;
        ValuePosition valuePosition = ValuePosition.INSIDE_SLICE;
        this.mXValuePosition = valuePosition;
        this.mYValuePosition = valuePosition;
        this.mValueLineColor = j1.f21601t;
        this.mValueLineWidth = 1.0f;
        this.mValueLinePart1OffsetPercentage = 75.0f;
        this.mValueLinePart1Length = 0.3f;
        this.mValueLinePart2Length = 0.4f;
        this.mValueLineVariableLength = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        calcMinMaxY(pieEntry);
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<PieEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.mValues.size(); i10++) {
            arrayList.add(((PieEntry) this.mValues.get(i10)).copy());
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, getLabel());
        pieDataSet.mColors = this.mColors;
        pieDataSet.mSliceSpace = this.mSliceSpace;
        pieDataSet.mShift = this.mShift;
        return pieDataSet;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getSelectionShift() {
        return this.mShift;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getSliceSpace() {
        return this.mSliceSpace;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public int getValueLineColor() {
        return this.mValueLineColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart1Length() {
        return this.mValueLinePart1Length;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart1OffsetPercentage() {
        return this.mValueLinePart1OffsetPercentage;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLinePart2Length() {
        return this.mValueLinePart2Length;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public float getValueLineWidth() {
        return this.mValueLineWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public ValuePosition getXValuePosition() {
        return this.mXValuePosition;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public ValuePosition getYValuePosition() {
        return this.mYValuePosition;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public boolean isAutomaticallyDisableSliceSpacingEnabled() {
        return this.mAutomaticallyDisableSliceSpacing;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public boolean isValueLineVariableLength() {
        return this.mValueLineVariableLength;
    }

    public void setAutomaticallyDisableSliceSpacing(boolean z10) {
        this.mAutomaticallyDisableSliceSpacing = z10;
    }

    public void setSelectionShift(float f10) {
        this.mShift = Utils.convertDpToPixel(f10);
    }

    public void setSliceSpace(float f10) {
        if (f10 > 20.0f) {
            f10 = 20.0f;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.mSliceSpace = Utils.convertDpToPixel(f10);
    }

    public void setValueLineColor(int i10) {
        this.mValueLineColor = i10;
    }

    public void setValueLinePart1Length(float f10) {
        this.mValueLinePart1Length = f10;
    }

    public void setValueLinePart1OffsetPercentage(float f10) {
        this.mValueLinePart1OffsetPercentage = f10;
    }

    public void setValueLinePart2Length(float f10) {
        this.mValueLinePart2Length = f10;
    }

    public void setValueLineVariableLength(boolean z10) {
        this.mValueLineVariableLength = z10;
    }

    public void setValueLineWidth(float f10) {
        this.mValueLineWidth = f10;
    }

    public void setXValuePosition(ValuePosition valuePosition) {
        this.mXValuePosition = valuePosition;
    }

    public void setYValuePosition(ValuePosition valuePosition) {
        this.mYValuePosition = valuePosition;
    }
}
