package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.PricePointObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class PriceTrendMarkerView extends MarkerView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f85375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f85376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f85377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IAxisValueFormatter f85378e;

    public PriceTrendMarkerView(Context context, IAxisValueFormatter iAxisValueFormatter) {
        super(context, R.layout.marker_view_price_trend);
        this.f85378e = iAxisValueFormatter;
        setBackgroundDrawable(com.max.hbcommon.component.ezcalendarview.utils.c.g(getContext(), -1, com.max.hbcommon.component.ezcalendarview.utils.c.a(2.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(2.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(2.0f)));
        this.f85375b = (TextView) findViewById(R.id.tv_date);
        this.f85376c = (TextView) findViewById(R.id.tv_price);
        this.f85377d = (TextView) findViewById(R.id.tv_desc);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f10, float f11) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35100, new Class[]{Canvas.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.draw(canvas, f10, 0.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35099, new Class[]{cls, cls}, MPPointF.class);
        if (patchProxyResultProxy.isSupported) {
            return (MPPointF) patchProxyResultProxy.result;
        }
        return ((float) (getWidth() / 2)) + f10 > ((float) ViewUtils.L(getContext())) ? new MPPointF((ViewUtils.L(getContext()) - getWidth()) - f10, 0.0f) : new MPPointF((-getWidth()) / 2, 0.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        if (PatchProxy.proxy(new Object[]{entry, highlight}, this, changeQuickRedirect, false, 35098, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        PricePointObj pricePointObj = (PricePointObj) entry.getData();
        this.f85376c.setText("￥" + pricePointObj.getPrice());
        if (com.max.hbcommon.utils.c.u(pricePointObj.getDesc())) {
            this.f85377d.setVisibility(8);
        } else {
            this.f85377d.setText(pricePointObj.getDesc());
            this.f85377d.setVisibility(0);
        }
        this.f85375b.setText(com.max.hbutils.utils.w.f(getContext(), pricePointObj.getDate().replaceAll("hide_label", "")));
        super.refreshContent(entry, highlight);
    }
}
