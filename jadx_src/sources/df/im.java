package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewOverlayChartBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class im implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f111832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f111833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111835i;

    private im(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f111827a = linearLayout;
        this.f111828b = imageView;
        this.f111829c = textView;
        this.f111830d = textView2;
        this.f111831e = textView3;
        this.f111832f = lineChart;
        this.f111833g = segmentFilterView;
        this.f111834h = linearLayout2;
        this.f111835i = linearLayout3;
    }

    @androidx.annotation.n0
    public static im a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18660, new Class[]{View.class}, im.class);
        if (patchProxyResultProxy.isSupported) {
            return (im) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_help;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_help);
        if (imageView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_overlay_score;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_overlay_score);
                if (textView2 != null) {
                    i10 = R.id.tv_title;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView3 != null) {
                        i10 = R.id.v_chart;
                        LineChart lineChart = (LineChart) l3.d.a(view, R.id.v_chart);
                        if (lineChart != null) {
                            i10 = R.id.v_filter;
                            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.v_filter);
                            if (segmentFilterView != null) {
                                i10 = R.id.vg_chart;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_chart);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_help;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_help);
                                    if (linearLayout2 != null) {
                                        return new im((LinearLayout) view, imageView, textView, textView2, textView3, lineChart, segmentFilterView, linearLayout, linearLayout2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static im c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18658, new Class[]{LayoutInflater.class}, im.class);
        return patchProxyResultProxy.isSupported ? (im) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static im d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18659, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, im.class);
        if (patchProxyResultProxy.isSupported) {
            return (im) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_overlay_chart, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111827a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18661, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
