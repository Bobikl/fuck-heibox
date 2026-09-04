package com.max.hbcommon.component.chart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: CustomBarChart.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CustomBarChart extends BarChart {
    public static ChangeQuickRedirect changeQuickRedirect;

    public CustomBarChart(@dl.e Context context) {
        super(context);
    }

    public CustomBarChart(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomBarChart(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3264, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.init();
        this.mRenderer = new j(this, this.mAnimator, this.mViewPortHandler, ViewUtils.f(getContext(), 2.0f), androidx.core.content.res.i.e(getContext().getResources(), R.color.orange_start, null), androidx.core.content.res.i.e(getContext().getResources(), R.color.orange_end, null));
    }
}
