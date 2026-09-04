package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.max.accelworld.c;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.Overlaymatch;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;
import lb.b;

/* JADX INFO: compiled from: Dota2OverviewLayMarkerView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2OverviewLayMarkerView extends MarkerView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87192c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private WeakReference<View> f87193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2OverviewLayMarkerView(@d Context context) {
        super(context, R.layout.view_dota2_overview_lay_marker);
        f0.p(context, "context");
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(@e Canvas canvas, float f10, float f11) {
        View viewFindViewById;
        Object[] objArr = {canvas, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37326, new Class[]{Canvas.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        WeakReference<View> weakReference = this.f87193b;
        if (weakReference == null || (viewFindViewById = weakReference.get()) == null) {
            viewFindViewById = findViewById(R.id.v_highlight);
        }
        f0.o(viewFindViewById, "v_highlight?.get() ?: fi…iewById(R.id.v_highlight)");
        float fMax = Math.max(f10, getMeasuredWidth() / 2.0f);
        float fL = ViewUtils.L(getContext()) - (getMeasuredWidth() / 2);
        Context context = getContext();
        f0.o(context, "context");
        float fMin = Math.min(fMax, fL - c.a(24.0f, context));
        viewFindViewById.setTranslationX(((getMeasuredWidth() - viewFindViewById.getMeasuredWidth()) / 2) - (fMin - f10));
        Log.d("drawMarker", "posX: " + f10 + "   x: " + fMin);
        super.draw(canvas, fMin, 0.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    @e
    public MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37325, new Class[]{cls, cls}, MPPointF.class);
        if (patchProxyResultProxy.isSupported) {
            return (MPPointF) patchProxyResultProxy.result;
        }
        return new MPPointF((-getMeasuredWidth()) / 2.0f, getChartView() != null ? (ViewUtils.V(getChartView()) - getMeasuredHeight()) / 2.0f : 0.0f);
    }

    @e
    public final WeakReference<View> getV_highlight() {
        return this.f87193b;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(@d Entry e10, @e Highlight highlight) {
        if (PatchProxy.proxy(new Object[]{e10, highlight}, this, changeQuickRedirect, false, 37324, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e10, "e");
        View viewFindViewById = findViewById(R.id.vg_content);
        f0.o(viewFindViewById, "findViewById(R.id.vg_content)");
        View viewFindViewById2 = findViewById(R.id.tv_time);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_time)");
        View viewFindViewById3 = findViewById(R.id.tv_value);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_value)");
        View viewFindViewById4 = findViewById(R.id.tv_delta);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_delta)");
        TextView textView = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_up_down);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_up_down)");
        TextView textView2 = (TextView) viewFindViewById5;
        this.f87193b = new WeakReference<>(findViewById(R.id.v_highlight));
        Object data = e10.getData();
        f0.n(data, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.gameoverview.Overlaymatch");
        Overlaymatch overlaymatch = (Overlaymatch) data;
        ((ViewGroup) viewFindViewById).setBackground(ViewUtils.G(ViewUtils.f(getContext(), 4.0f), com.max.xiaoheihe.utils.d.E(R.color.black_alpha90)));
        int delta = overlaymatch.getDelta();
        ((TextView) viewFindViewById3).setText(String.valueOf(overlaymatch.getRank()));
        ((TextView) viewFindViewById2).setText(w.f(getContext(), overlaymatch.getStart_time()));
        if (delta >= 0) {
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
            textView2.setText(b.f131095k);
        } else {
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_yemo));
            textView2.setText(b.f131094j);
        }
        textView2.setTypeface(bb.d.a().b(0));
        if (delta >= 0) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
        } else {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_yemo));
        }
        textView.setText(String.valueOf(Math.abs(delta)));
        super.refreshContent(e10, highlight);
    }

    public final void setV_highlight(@e WeakReference<View> weakReference) {
        this.f87193b = weakReference;
    }
}
