package com.max.xiaoheihe.module.game.csgob5;

import android.content.Context;
import android.widget.TextView;
import bb.d;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.ezcalendarview.utils.c;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class CSGOB5TrendMarkerView extends MarkerView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f87245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f87246c;

    public CSGOB5TrendMarkerView(Context context) {
        super(context, R.layout.marker_view_dac_trend);
        setBackgroundDrawable(c.g(getContext(), -1, c.a(2.0f), c.a(2.0f), c.a(2.0f)));
        this.f87245b = (TextView) findViewById(R.id.tv_time);
        this.f87246c = (TextView) findViewById(R.id.tv_level_desc);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37418, new Class[0], MPPointF.class);
        return patchProxyResultProxy.isSupported ? (MPPointF) patchProxyResultProxy.result : new MPPointF(ViewUtils.f(getContext(), 10.0f), (-getHeight()) / 2);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        if (PatchProxy.proxy(new Object[]{entry, highlight}, this, changeQuickRedirect, false, 37417, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObj = (KeyDescObj) entry.getData();
        if (keyDescObj != null) {
            d.d(this.f87245b, 2);
            this.f87245b.setText(w.i(keyDescObj.getKey(), "yyyy-MM-dd"));
            this.f87246c.setText(String.format("%s: %s", keyDescObj.getDesc(), keyDescObj.getValue()));
        }
        super.refreshContent(entry, highlight);
    }
}
