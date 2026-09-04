package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.highlight.CombinedHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;

/* JADX INFO: loaded from: classes6.dex */
public class CombinedChart extends BarLineChartBase<CombinedData> implements CombinedDataProvider {
    private boolean mDrawBarShadow;
    protected DrawOrder[] mDrawOrder;
    private boolean mDrawValueAboveBar;
    protected boolean mHighlightFullBarEnabled;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.mDrawValueAboveBar = true;
        this.mHighlightFullBarEnabled = false;
        this.mDrawBarShadow = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawValueAboveBar = true;
        this.mHighlightFullBarEnabled = false;
        this.mDrawBarShadow = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mDrawValueAboveBar = true;
        this.mHighlightFullBarEnabled = false;
        this.mDrawBarShadow = false;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public BarData getBarData() {
        T t10 = this.mData;
        if (t10 == 0) {
            return null;
        }
        return ((CombinedData) t10).getBarData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider
    public BubbleData getBubbleData() {
        T t10 = this.mData;
        if (t10 == 0) {
            return null;
        }
        return ((CombinedData) t10).getBubbleData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider
    public CandleData getCandleData() {
        T t10 = this.mData;
        if (t10 == 0) {
            return null;
        }
        return ((CombinedData) t10).getCandleData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider
    public CombinedData getCombinedData() {
        return (CombinedData) this.mData;
    }

    public DrawOrder[] getDrawOrder() {
        return this.mDrawOrder;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Highlight getHighlightByTouchPoint(float f10, float f11) {
        if (this.mData == 0) {
            Log.e(Chart.LOG_TAG, "Can't select by touch. No data set.");
            return null;
        }
        Highlight highlight = getHighlighter().getHighlight(f10, f11);
        return (highlight == null || !isHighlightFullBarEnabled()) ? highlight : new Highlight(highlight.getX(), highlight.getY(), highlight.getXPx(), highlight.getYPx(), highlight.getDataSetIndex(), -1, highlight.getAxis());
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        T t10 = this.mData;
        if (t10 == 0) {
            return null;
        }
        return ((CombinedData) t10).getLineData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider
    public ScatterData getScatterData() {
        T t10 = this.mData;
        if (t10 == 0) {
            return null;
        }
        return ((CombinedData) t10).getScatterData();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mDrawOrder = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new CombinedHighlighter(this, this));
        setHighlightFullBarEnabled(true);
        this.mRenderer = new CombinedChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isDrawBarShadowEnabled() {
        return this.mDrawBarShadow;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isDrawValueAboveBarEnabled() {
        return this.mDrawValueAboveBar;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(CombinedData combinedData) {
        super.setData(combinedData);
        setHighlighter(new CombinedHighlighter(this, this));
        ((CombinedChartRenderer) this.mRenderer).createRenderers();
        this.mRenderer.initBuffers();
    }

    public void setDrawBarShadow(boolean z10) {
        this.mDrawBarShadow = z10;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length <= 0) {
            return;
        }
        this.mDrawOrder = drawOrderArr;
    }

    public void setDrawValueAboveBar(boolean z10) {
        this.mDrawValueAboveBar = z10;
    }

    public void setHighlightFullBarEnabled(boolean z10) {
        this.mHighlightFullBarEnabled = z10;
    }
}
