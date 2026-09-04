package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.LineChart;
import com.max.hbcommon.component.chart.HeyBoxRadarChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentPubgDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qa implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f114807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f114814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxRadarChart f114816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114824r;

    private qa(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 CardView cardView3, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 HeyBoxRadarChart heyBoxRadarChart, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f114807a = smartRefreshLayout;
        this.f114808b = cardView;
        this.f114809c = cardView2;
        this.f114810d = cardView3;
        this.f114811e = imageView;
        this.f114812f = imageView2;
        this.f114813g = imageView3;
        this.f114814h = lineChart;
        this.f114815i = linearLayout;
        this.f114816j = heyBoxRadarChart;
        this.f114817k = recyclerView;
        this.f114818l = recyclerView2;
        this.f114819m = recyclerView3;
        this.f114820n = smartRefreshLayout2;
        this.f114821o = textView;
        this.f114822p = textView2;
        this.f114823q = textView3;
        this.f114824r = textView4;
    }

    @androidx.annotation.n0
    public static qa a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17448, new Class[]{View.class}, qa.class);
        if (patchProxyResultProxy.isSupported) {
            return (qa) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_game_comments;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_game_comments);
        if (cardView != null) {
            i10 = R.id.cv_line_chart;
            CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_line_chart);
            if (cardView2 != null) {
                i10 = R.id.cv_matches;
                CardView cardView3 = (CardView) l3.d.a(view, R.id.cv_matches);
                if (cardView3 != null) {
                    i10 = R.id.iv_arrow;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
                    if (imageView != null) {
                        i10 = R.id.iv_mode;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mode);
                        if (imageView2 != null) {
                            i10 = R.id.iv_rating_img;
                            ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_rating_img);
                            if (imageView3 != null) {
                                i10 = R.id.line;
                                LineChart lineChart = (LineChart) l3.d.a(view, R.id.line);
                                if (lineChart != null) {
                                    i10 = R.id.ll_mode;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_mode);
                                    if (linearLayout != null) {
                                        i10 = R.id.radar;
                                        HeyBoxRadarChart heyBoxRadarChart = (HeyBoxRadarChart) l3.d.a(view, R.id.radar);
                                        if (heyBoxRadarChart != null) {
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
                                                        i10 = R.id.tv_match_count;
                                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_match_count);
                                                        if (textView != null) {
                                                            i10 = R.id.tv_mode;
                                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_mode);
                                                            if (textView2 != null) {
                                                                i10 = R.id.tv_radar;
                                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_radar);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.tv_rating_trend;
                                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rating_trend);
                                                                    if (textView4 != null) {
                                                                        return new qa(smartRefreshLayout, cardView, cardView2, cardView3, imageView, imageView2, imageView3, lineChart, linearLayout, heyBoxRadarChart, recyclerView, recyclerView2, recyclerView3, smartRefreshLayout, textView, textView2, textView3, textView4);
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
    public static qa c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17446, new Class[]{LayoutInflater.class}, qa.class);
        return patchProxyResultProxy.isSupported ? (qa) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qa d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17447, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qa.class);
        if (patchProxyResultProxy.isSupported) {
            return (qa) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pubg_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f114807a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17449, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
