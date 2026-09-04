package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.chart.RadarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchDetailChart;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchTitleView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2PlayerSelectorView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentDota2MatchDetailContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConsecutiveScrollerLayout f112059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f112060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchDetailChart f112067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f112069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f112070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchTitleView f112071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchTitleView f112072n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2PlayerSelectorView f112073o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2PlayerSelectorView f112074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadarView f112075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.s0 f112076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112078t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112079u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112080v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112083y;

    private j8(@androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 RecyclerView recyclerView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 Dota2MatchDetailChart dota2MatchDetailChart, @androidx.annotation.n0 View view, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 SegmentFilterView segmentFilterView2, @androidx.annotation.n0 Dota2MatchTitleView dota2MatchTitleView, @androidx.annotation.n0 Dota2MatchTitleView dota2MatchTitleView2, @androidx.annotation.n0 Dota2PlayerSelectorView dota2PlayerSelectorView, @androidx.annotation.n0 Dota2PlayerSelectorView dota2PlayerSelectorView2, @androidx.annotation.n0 RadarView radarView, @androidx.annotation.n0 mb.s0 s0Var, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f112059a = consecutiveScrollerLayout;
        this.f112060b = lineChart;
        this.f112061c = recyclerView;
        this.f112062d = recyclerView2;
        this.f112063e = recyclerView3;
        this.f112064f = recyclerView4;
        this.f112065g = textView;
        this.f112066h = textView2;
        this.f112067i = dota2MatchDetailChart;
        this.f112068j = view;
        this.f112069k = segmentFilterView;
        this.f112070l = segmentFilterView2;
        this.f112071m = dota2MatchTitleView;
        this.f112072n = dota2MatchTitleView2;
        this.f112073o = dota2PlayerSelectorView;
        this.f112074p = dota2PlayerSelectorView2;
        this.f112075q = radarView;
        this.f112076r = s0Var;
        this.f112077s = linearLayout;
        this.f112078t = linearLayout2;
        this.f112079u = relativeLayout;
        this.f112080v = linearLayout3;
        this.f112081w = linearLayout4;
        this.f112082x = linearLayout5;
        this.f112083y = linearLayout6;
    }

    @androidx.annotation.n0
    public static j8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17212, new Class[]{View.class}, j8.class);
        if (patchProxyResultProxy.isSupported) {
            return (j8) patchProxyResultProxy.result;
        }
        int i10 = R.id.chart_gold;
        LineChart lineChart = (LineChart) l3.d.a(view, R.id.chart_gold);
        if (lineChart != null) {
            i10 = R.id.rv_data;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_data);
            if (recyclerView != null) {
                i10 = R.id.rv_player_selector;
                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_player_selector);
                if (recyclerView2 != null) {
                    i10 = R.id.rv_tianhui;
                    RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_tianhui);
                    if (recyclerView3 != null) {
                        i10 = R.id.rv_yeyan;
                        RecyclerView recyclerView4 = (RecyclerView) l3.d.a(view, R.id.rv_yeyan);
                        if (recyclerView4 != null) {
                            i10 = R.id.tv_chart_name;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_chart_name);
                            if (textView != null) {
                                i10 = R.id.tv_data_desc;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data_desc);
                                if (textView2 != null) {
                                    i10 = R.id.v_chart;
                                    Dota2MatchDetailChart dota2MatchDetailChart = (Dota2MatchDetailChart) l3.d.a(view, R.id.v_chart);
                                    if (dota2MatchDetailChart != null) {
                                        i10 = R.id.v_chart_space;
                                        View viewA = l3.d.a(view, R.id.v_chart_space);
                                        if (viewA != null) {
                                            i10 = R.id.v_filter_data;
                                            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.v_filter_data);
                                            if (segmentFilterView != null) {
                                                i10 = R.id.v_gold_exp_filter;
                                                SegmentFilterView segmentFilterView2 = (SegmentFilterView) l3.d.a(view, R.id.v_gold_exp_filter);
                                                if (segmentFilterView2 != null) {
                                                    i10 = R.id.v_match_title_tianhui;
                                                    Dota2MatchTitleView dota2MatchTitleView = (Dota2MatchTitleView) l3.d.a(view, R.id.v_match_title_tianhui);
                                                    if (dota2MatchTitleView != null) {
                                                        i10 = R.id.v_match_title_yeyan;
                                                        Dota2MatchTitleView dota2MatchTitleView2 = (Dota2MatchTitleView) l3.d.a(view, R.id.v_match_title_yeyan);
                                                        if (dota2MatchTitleView2 != null) {
                                                            i10 = R.id.v_player1;
                                                            Dota2PlayerSelectorView dota2PlayerSelectorView = (Dota2PlayerSelectorView) l3.d.a(view, R.id.v_player1);
                                                            if (dota2PlayerSelectorView != null) {
                                                                i10 = R.id.v_player2;
                                                                Dota2PlayerSelectorView dota2PlayerSelectorView2 = (Dota2PlayerSelectorView) l3.d.a(view, R.id.v_player2);
                                                                if (dota2PlayerSelectorView2 != null) {
                                                                    i10 = R.id.v_radar;
                                                                    RadarView radarView = (RadarView) l3.d.a(view, R.id.v_radar);
                                                                    if (radarView != null) {
                                                                        i10 = R.id.vg_ban_pick;
                                                                        View viewA2 = l3.d.a(view, R.id.vg_ban_pick);
                                                                        if (viewA2 != null) {
                                                                            mb.s0 s0VarA = mb.s0.a(viewA2);
                                                                            i10 = R.id.vg_chart;
                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_chart);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.vg_chart_gold;
                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_chart_gold);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.vg_chart_title;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_chart_title);
                                                                                    if (relativeLayout != null) {
                                                                                        i10 = R.id.vg_data;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_data);
                                                                                        if (linearLayout3 != null) {
                                                                                            i10 = R.id.vg_data_container;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_data_container);
                                                                                            if (linearLayout4 != null) {
                                                                                                i10 = R.id.vg_radar;
                                                                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_radar);
                                                                                                if (linearLayout5 != null) {
                                                                                                    i10 = R.id.vg_rv_data;
                                                                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_rv_data);
                                                                                                    if (linearLayout6 != null) {
                                                                                                        return new j8((ConsecutiveScrollerLayout) view, lineChart, recyclerView, recyclerView2, recyclerView3, recyclerView4, textView, textView2, dota2MatchDetailChart, viewA, segmentFilterView, segmentFilterView2, dota2MatchTitleView, dota2MatchTitleView2, dota2PlayerSelectorView, dota2PlayerSelectorView2, radarView, s0VarA, linearLayout, linearLayout2, relativeLayout, linearLayout3, linearLayout4, linearLayout5, linearLayout6);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static j8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17210, new Class[]{LayoutInflater.class}, j8.class);
        return patchProxyResultProxy.isSupported ? (j8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17211, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j8.class);
        if (patchProxyResultProxy.isSupported) {
            return (j8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dota2_match_detail_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConsecutiveScrollerLayout b() {
        return this.f112059a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17213, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
