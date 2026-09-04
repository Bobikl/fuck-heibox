package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GameDurationStatisticsMarkerView.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameDurationStatisticsMarkerView extends MarkerView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f84455c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private TextView f84456b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDurationStatisticsMarkerView(@dl.d Context context) {
        super(context, R.layout.view_game_duration_marker);
        kotlin.jvm.internal.f0.p(context, "context");
        View viewFindViewById = findViewById(R.id.tv_number_percent);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(R.id.tv_number_percent)");
        this.f84456b = (TextView) viewFindViewById;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    @dl.d
    public MPPointF getOffset() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33083, new Class[0], MPPointF.class);
        return patchProxyResultProxy.isSupported ? (MPPointF) patchProxyResultProxy.result : new MPPointF(-(getWidth() / 2), (-getHeight()) - 10.0f);
    }

    @dl.d
    public final TextView getTv_number_percent() {
        return this.f84456b;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(@dl.d Entry e10, @dl.e Highlight highlight) {
        if (PatchProxy.proxy(new Object[]{e10, highlight}, this, changeQuickRedirect, false, 33082, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(e10, "e");
        TextView textView = this.f84456b;
        StringBuilder sb2 = new StringBuilder();
        Object data = e10.getData();
        kotlin.jvm.internal.f0.n(data, "null cannot be cast to non-null type com.max.hbcommon.bean.KeyDescObj");
        sb2.append(((KeyDescObj) data).getValue());
        sb2.append('%');
        textView.setText(sb2.toString());
        super.refreshContent(e10, highlight);
    }

    public final void setTv_number_percent(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 33081, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f84456b = textView;
    }
}
