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
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class PriceTrendMarkerV2View extends MarkerView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f85370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f85371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f85372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f85373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IAxisValueFormatter f85374f;

    public PriceTrendMarkerV2View(Context context, IAxisValueFormatter iAxisValueFormatter) {
        super(context, R.layout.marker_view_price_trend_v2);
        this.f85374f = iAxisValueFormatter;
        this.f85370b = (TextView) findViewById(R.id.tv_date);
        this.f85371c = (TextView) findViewById(R.id.tv_price);
        this.f85373e = (TextView) findViewById(R.id.tv_current_other_price);
        TextView textView = (TextView) findViewById(R.id.tv_discount);
        this.f85372d = textView;
        textView.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color, 2.0f));
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f10, float f11) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35097, new Class[]{Canvas.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.draw(canvas, f10, 0.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35096, new Class[]{cls, cls}, MPPointF.class);
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
    public void refreshContent(Entry entry, Highlight highlight) {
        if (PatchProxy.proxy(new Object[]{entry, highlight}, this, changeQuickRedirect, false, 35095, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        PricePointObj pricePointObj = (PricePointObj) entry.getData();
        this.f85371c.setText(pricePointObj.getRmb_price());
        this.f85370b.setText(com.max.hbutils.utils.w.f(getContext(), pricePointObj.getDate().replaceAll("hide_label", "")));
        this.f85373e.setText(pricePointObj.getCurrency() + " " + pricePointObj.getPrice());
        if (com.max.hbutils.utils.n.p(pricePointObj.getDiscount()) > 0.0f) {
            this.f85372d.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER + pricePointObj.getDiscount() + "%");
            this.f85372d.setVisibility(0);
        } else {
            this.f85372d.setVisibility(8);
        }
        super.refreshContent(entry, highlight);
    }
}
