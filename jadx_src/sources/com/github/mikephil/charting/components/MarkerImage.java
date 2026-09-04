package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class MarkerImage implements IMarker {
    private Context mContext;
    private Drawable mDrawable;
    private WeakReference<Chart> mWeakChart;
    private MPPointF mOffset = new MPPointF();
    private MPPointF mOffset2 = new MPPointF();
    private FSize mSize = new FSize();
    private Rect mDrawableBoundsCache = new Rect();

    public MarkerImage(Context context, int i10) {
        this.mContext = context;
        this.mDrawable = context.getResources().getDrawable(i10, null);
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f10, float f11) {
        Drawable drawable;
        Drawable drawable2;
        if (this.mDrawable == null) {
            return;
        }
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f10, f11);
        FSize fSize = this.mSize;
        float intrinsicWidth = fSize.width;
        float intrinsicHeight = fSize.height;
        if (intrinsicWidth == 0.0f && (drawable2 = this.mDrawable) != null) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.mDrawable) != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        this.mDrawable.copyBounds(this.mDrawableBoundsCache);
        Drawable drawable3 = this.mDrawable;
        Rect rect = this.mDrawableBoundsCache;
        int i10 = rect.left;
        int i11 = rect.top;
        drawable3.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) intrinsicHeight) + i11);
        int iSave = canvas.save();
        canvas.translate(f10 + offsetForDrawingAtPoint.f43143x, f11 + offsetForDrawingAtPoint.f43144y);
        this.mDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
        this.mDrawable.setBounds(this.mDrawableBoundsCache);
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
        Drawable drawable;
        Drawable drawable2;
        MPPointF offset = getOffset();
        MPPointF mPPointF = this.mOffset2;
        mPPointF.f43143x = offset.f43143x;
        mPPointF.f43144y = offset.f43144y;
        Chart chartView = getChartView();
        FSize fSize = this.mSize;
        float intrinsicWidth = fSize.width;
        float intrinsicHeight = fSize.height;
        if (intrinsicWidth == 0.0f && (drawable2 = this.mDrawable) != null) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.mDrawable) != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        MPPointF mPPointF2 = this.mOffset2;
        float f12 = mPPointF2.f43143x;
        if (f10 + f12 < 0.0f) {
            mPPointF2.f43143x = -f10;
        } else if (chartView != null && f10 + intrinsicWidth + f12 > chartView.getWidth()) {
            this.mOffset2.f43143x = (chartView.getWidth() - f10) - intrinsicWidth;
        }
        MPPointF mPPointF3 = this.mOffset2;
        float f13 = mPPointF3.f43144y;
        if (f11 + f13 < 0.0f) {
            mPPointF3.f43144y = -f11;
        } else if (chartView != null && f11 + intrinsicHeight + f13 > chartView.getHeight()) {
            this.mOffset2.f43144y = (chartView.getHeight() - f11) - intrinsicHeight;
        }
        return this.mOffset2;
    }

    public FSize getSize() {
        return this.mSize;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
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

    public void setSize(FSize fSize) {
        this.mSize = fSize;
        if (fSize == null) {
            this.mSize = new FSize();
        }
    }
}
