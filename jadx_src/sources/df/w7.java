package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.SegmentTabLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentCsgoModeDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f117061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f117065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f117070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentTabLayout f117071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117075o;

    private w7(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 SegmentTabLayout segmentTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 CardView cardView3) {
        this.f117061a = smartRefreshLayout;
        this.f117062b = cardView;
        this.f117063c = cardView2;
        this.f117064d = imageView;
        this.f117065e = lineChart;
        this.f117066f = linearLayout;
        this.f117067g = recyclerView;
        this.f117068h = recyclerView2;
        this.f117069i = recyclerView3;
        this.f117070j = smartRefreshLayout2;
        this.f117071k = segmentTabLayout;
        this.f117072l = textView;
        this.f117073m = textView2;
        this.f117074n = textView3;
        this.f117075o = cardView3;
    }

    @androidx.annotation.n0
    public static w7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17160, new Class[]{View.class}, w7.class);
        if (patchProxyResultProxy.isSupported) {
            return (w7) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_game_comments;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_game_comments);
        if (cardView != null) {
            i10 = R.id.cv_matches;
            CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_matches);
            if (cardView2 != null) {
                i10 = R.id.iv_arrow;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
                if (imageView != null) {
                    i10 = R.id.line_chart_trend;
                    LineChart lineChart = (LineChart) l3.d.a(view, R.id.line_chart_trend);
                    if (lineChart != null) {
                        i10 = R.id.ll_mode;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_mode);
                        if (linearLayout != null) {
                            i10 = R.id.rv_matches;
                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_matches);
                            if (recyclerView != null) {
                                i10 = R.id.rv_overview;
                                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_overview);
                                if (recyclerView2 != null) {
                                    i10 = R.id.rv_stats;
                                    RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_stats);
                                    if (recyclerView3 != null) {
                                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                                        i10 = R.id.tl_trend;
                                        SegmentTabLayout segmentTabLayout = (SegmentTabLayout) l3.d.a(view, R.id.tl_trend);
                                        if (segmentTabLayout != null) {
                                            i10 = R.id.tv_match_count;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_match_count);
                                            if (textView != null) {
                                                i10 = R.id.tv_mode;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_mode);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_trend_desc;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_trend_desc);
                                                    if (textView3 != null) {
                                                        i10 = R.id.vg_trend;
                                                        CardView cardView3 = (CardView) l3.d.a(view, R.id.vg_trend);
                                                        if (cardView3 != null) {
                                                            return new w7(smartRefreshLayout, cardView, cardView2, imageView, lineChart, linearLayout, recyclerView, recyclerView2, recyclerView3, smartRefreshLayout, segmentTabLayout, textView, textView2, textView3, cardView3);
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
    public static w7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17158, new Class[]{LayoutInflater.class}, w7.class);
        return patchProxyResultProxy.isSupported ? (w7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17159, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w7.class);
        if (patchProxyResultProxy.isSupported) {
            return (w7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_csgo_mode_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f117061a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17161, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
