package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.CommonTabLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGameGlobalPricesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f110077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f110078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CommonTabLayout f110080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110089n;

    private e9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 CommonTabLayout commonTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f110076a = relativeLayout;
        this.f110077b = lineChart;
        this.f110078c = progressBar;
        this.f110079d = recyclerView;
        this.f110080e = commonTabLayout;
        this.f110081f = textView;
        this.f110082g = textView2;
        this.f110083h = textView3;
        this.f110084i = textView4;
        this.f110085j = textView5;
        this.f110086k = linearLayout;
        this.f110087l = view;
        this.f110088m = constraintLayout;
        this.f110089n = linearLayout2;
    }

    @androidx.annotation.n0
    public static e9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17296, new Class[]{View.class}, e9.class);
        if (patchProxyResultProxy.isSupported) {
            return (e9) patchProxyResultProxy.result;
        }
        int i10 = R.id.line_chart_trend;
        LineChart lineChart = (LineChart) l3.d.a(view, R.id.line_chart_trend);
        if (lineChart != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
            if (progressBar != null) {
                i10 = R.id.rv_game_global_prices;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_global_prices);
                if (recyclerView != null) {
                    i10 = R.id.tab_time;
                    CommonTabLayout commonTabLayout = (CommonTabLayout) l3.d.a(view, R.id.tab_time);
                    if (commonTabLayout != null) {
                        i10 = R.id.tv_discount_info;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_discount_info);
                        if (textView != null) {
                            i10 = R.id.tv_lowest_info;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_lowest_info);
                            if (textView2 != null) {
                                i10 = R.id.tv_no_discount;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_no_discount);
                                if (textView3 != null) {
                                    i10 = R.id.tv_region;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_region);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                        if (textView5 != null) {
                                            i10 = R.id.vg_chart;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_chart);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_close;
                                                View viewA = l3.d.a(view, R.id.vg_close);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_content;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                                    if (constraintLayout != null) {
                                                        i10 = R.id.vg_region;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_region);
                                                        if (linearLayout2 != null) {
                                                            return new e9((RelativeLayout) view, lineChart, progressBar, recyclerView, commonTabLayout, textView, textView2, textView3, textView4, textView5, linearLayout, viewA, constraintLayout, linearLayout2);
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
    public static e9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17294, new Class[]{LayoutInflater.class}, e9.class);
        return patchProxyResultProxy.isSupported ? (e9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17295, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e9.class);
        if (patchProxyResultProxy.isSupported) {
            return (e9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_global_prices, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110076a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17297, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
