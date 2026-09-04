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

/* JADX INFO: compiled from: FragmentDestiny2ModeDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f108412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f108416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f108421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentTabLayout f108422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108426o;

    private a8(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 SegmentTabLayout segmentTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 CardView cardView3) {
        this.f108412a = smartRefreshLayout;
        this.f108413b = cardView;
        this.f108414c = cardView2;
        this.f108415d = imageView;
        this.f108416e = lineChart;
        this.f108417f = linearLayout;
        this.f108418g = recyclerView;
        this.f108419h = recyclerView2;
        this.f108420i = recyclerView3;
        this.f108421j = smartRefreshLayout2;
        this.f108422k = segmentTabLayout;
        this.f108423l = textView;
        this.f108424m = textView2;
        this.f108425n = textView3;
        this.f108426o = cardView3;
    }

    @androidx.annotation.n0
    public static a8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17176, new Class[]{View.class}, a8.class);
        if (patchProxyResultProxy.isSupported) {
            return (a8) patchProxyResultProxy.result;
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
                                                            return new a8(smartRefreshLayout, cardView, cardView2, imageView, lineChart, linearLayout, recyclerView, recyclerView2, recyclerView3, smartRefreshLayout, segmentTabLayout, textView, textView2, textView3, cardView3);
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
    public static a8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17174, new Class[]{LayoutInflater.class}, a8.class);
        return patchProxyResultProxy.isSupported ? (a8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17175, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a8.class);
        if (patchProxyResultProxy.isSupported) {
            return (a8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_destiny2_mode_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f108412a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17177, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
