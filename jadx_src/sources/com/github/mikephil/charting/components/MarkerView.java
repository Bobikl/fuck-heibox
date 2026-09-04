package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class MarkerView extends RelativeLayout implements IMarker {
    private MPPointF mOffset;
    private MPPointF mOffset2;
    private WeakReference<Chart> mWeakChart;

    public MarkerView(Context context, int i10) {
        super(context);
        this.mOffset = new MPPointF();
        this.mOffset2 = new MPPointF();
        setupLayoutResource(i10);
    }

    private void setupLayoutResource(int i10) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i10, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f10, float f11) {
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f10, f11);
        int iSave = canvas.save();
        canvas.translate(f10 + offsetForDrawingAtPoint.f43143x, f11 + offsetForDrawingAtPoint.f43144y);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.mWeakChart;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return this.mOffset;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
        MPPointF offset = getOffset();
        MPPointF mPPointF = this.mOffset2;
        mPPointF.f43143x = offset.f43143x;
        mPPointF.f43144y = offset.f43144y;
        Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        MPPointF mPPointF2 = this.mOffset2;
        float f12 = mPPointF2.f43143x;
        if (f10 + f12 < 0.0f) {
            mPPointF2.f43143x = -f10;
        } else if (chartView != null && f10 + width + f12 > chartView.getWidth()) {
            this.mOffset2.f43143x = (chartView.getWidth() - f10) - width;
        }
        MPPointF mPPointF3 = this.mOffset2;
        float f13 = mPPointF3.f43144y;
        if (f11 + f13 < 0.0f) {
            mPPointF3.f43144y = -f11;
        } else if (chartView != null && f11 + height + f13 > chartView.getHeight()) {
            this.mOffset2.f43144y = (chartView.getHeight() - f11) - height;
        }
        return this.mOffset2;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setChartView(Chart chart) {
        this.mWeakChart = new WeakReference<>(chart);
    }

    public void setOffset(float f10, float f11) {
        MPPointF mPPointF = this.mOffset;
        mPPointF.f43143x = f10;
        mPPointF.f43144y = f11;
    }

    public void setOffset(MPPointF mPPointF) {
        this.mOffset = mPPointF;
        if (mPPointF == null) {
            this.mOffset = new MPPointF();
        }
    }
}
