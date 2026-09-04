package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGTrendMarkerView extends MarkerView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f88131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f88132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f88133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f88134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f88135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f88136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f88137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MPPointF f88138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IAxisValueFormatter f88139j;

    public PUBGTrendMarkerView(Context context, IAxisValueFormatter iAxisValueFormatter) {
        super(context, R.layout.marker_view_pubg_trend);
        this.f88138i = new MPPointF();
        this.f88139j = iAxisValueFormatter;
        setBackgroundDrawable(com.max.hbcommon.component.ezcalendarview.utils.c.g(getContext(), -1, com.max.hbcommon.component.ezcalendarview.utils.c.a(2.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(2.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(2.0f)));
        this.f88131b = (TextView) findViewById(R.id.tv_time);
        this.f88132c = findViewById(R.id.vg_solo);
        this.f88133d = findViewById(R.id.vg_duo);
        this.f88134e = findViewById(R.id.vg_squad);
        this.f88135f = (TextView) findViewById(R.id.tv_solo);
        this.f88136g = (TextView) findViewById(R.id.tv_duo);
        this.f88137h = (TextView) findViewById(R.id.tv_squad);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38317, new Class[0], MPPointF.class);
        return patchProxyResultProxy.isSupported ? (MPPointF) patchProxyResultProxy.result : new MPPointF(ViewUtils.f(getContext(), 10.0f), (-getHeight()) / 2);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (PatchProxy.proxy(new Object[]{entry, highlight}, this, changeQuickRedirect, false, 38316, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<ILineDataSet> arrayList = (ArrayList) entry.getData();
        int i10 = -1;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int entryIndex = ((ILineDataSet) it.next()).getEntryIndex(entry);
                if (entryIndex >= 0) {
                    i10 = entryIndex;
                }
            }
        }
        if (arrayList == null || i10 < 0) {
            z10 = false;
            z11 = false;
            z12 = false;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            for (ILineDataSet iLineDataSet : arrayList) {
                if ("solo".equalsIgnoreCase(iLineDataSet.getLabel())) {
                    this.f88135f.setText(n.g(iLineDataSet.getEntryForIndex(i10).getY()));
                    z10 = true;
                } else if ("duo".equalsIgnoreCase(iLineDataSet.getLabel())) {
                    this.f88136g.setText(n.g(iLineDataSet.getEntryForIndex(i10).getY()));
                    z11 = true;
                } else if ("squad".equalsIgnoreCase(iLineDataSet.getLabel())) {
                    this.f88137h.setText(n.g(iLineDataSet.getEntryForIndex(i10).getY()));
                    z12 = true;
                }
            }
        }
        if (z10) {
            this.f88132c.setVisibility(0);
        } else {
            this.f88132c.setVisibility(8);
        }
        if (z11) {
            this.f88133d.setVisibility(0);
        } else {
            this.f88133d.setVisibility(8);
        }
        if (z12) {
            this.f88134e.setVisibility(0);
        } else {
            this.f88134e.setVisibility(8);
        }
        IAxisValueFormatter iAxisValueFormatter = this.f88139j;
        if (iAxisValueFormatter != null) {
            this.f88131b.setText(iAxisValueFormatter.getFormattedValue(entry.getX(), null));
        } else {
            this.f88131b.setText(String.valueOf(entry.getX()));
        }
        super.refreshContent(entry, highlight);
    }
}
