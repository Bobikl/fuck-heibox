package com.max.xiaoheihe.module.game.component.dota2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2MmrMarkerView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
@SuppressLint({"ViewConstructor"})
public final class Dota2MmrMarkerView extends MarkerView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87190c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final List<Dota2ChartObj> f87191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2MmrMarkerView(@d Context context, @d List<Dota2ChartObj> dataList) {
        super(context, R.layout.view_dota2_mmr_marker);
        f0.p(context, "context");
        f0.p(dataList, "dataList");
        this.f87191b = dataList;
        setBackground(ViewUtils.G(ViewUtils.f(context, 4.0f), com.max.xiaoheihe.utils.d.E(R.color.black_alpha90)));
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(@e Canvas canvas, float f10, float f11) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37323, new Class[]{Canvas.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.draw(canvas, f10, 0.0f);
    }

    @d
    public final List<Dota2ChartObj> getDataList() {
        return this.f87191b;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    @e
    public MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37322, new Class[]{cls, cls}, MPPointF.class);
        if (patchProxyResultProxy.isSupported) {
            return (MPPointF) patchProxyResultProxy.result;
        }
        float f12 = ViewUtils.f(getContext(), 8.0f);
        if (f10 >= ViewUtils.L(getContext()) / 2) {
            f12 = -(f12 + getMeasuredWidth());
        }
        return new MPPointF(f12, getChartView() != null ? (ViewUtils.V(getChartView()) - getMeasuredHeight()) / 2.0f : 0.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(@d Entry e10, @e Highlight highlight) {
        if (PatchProxy.proxy(new Object[]{e10, highlight}, this, changeQuickRedirect, false, 37321, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e10, "e");
        View viewFindViewById = findViewById(R.id.tv_time);
        f0.o(viewFindViewById, "findViewById(R.id.tv_time)");
        View viewFindViewById2 = findViewById(R.id.tv_value);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_value)");
        Object data = e10.getData();
        f0.n(data, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj");
        Dota2ChartObj dota2ChartObj = (Dota2ChartObj) data;
        ((TextView) viewFindViewById2).setText(dota2ChartObj.getValue());
        ((TextView) viewFindViewById).setText(Dota2CalendarView.f87038h.a(dota2ChartObj.getTime()));
        super.refreshContent(e10, highlight);
    }
}
