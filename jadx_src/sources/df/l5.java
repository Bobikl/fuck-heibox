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
import com.github.mikephil.charting.charts.LineChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentSwitchSecondHandCassettePriceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f112863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f112864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f112870i;

    private l5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f112862a = relativeLayout;
        this.f112863b = lineChart;
        this.f112864c = progressBar;
        this.f112865d = recyclerView;
        this.f112866e = textView;
        this.f112867f = textView2;
        this.f112868g = linearLayout;
        this.f112869h = view;
        this.f112870i = constraintLayout;
    }

    @androidx.annotation.n0
    public static l5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16908, new Class[]{View.class}, l5.class);
        if (patchProxyResultProxy.isSupported) {
            return (l5) patchProxyResultProxy.result;
        }
        int i10 = R.id.line_chart_trend;
        LineChart lineChart = (LineChart) l3.d.a(view, R.id.line_chart_trend);
        if (lineChart != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
            if (progressBar != null) {
                i10 = R.id.rv_game_data;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_data);
                if (recyclerView != null) {
                    i10 = R.id.tv_no_discount;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_no_discount);
                    if (textView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView2 != null) {
                            i10 = R.id.vg_chart;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_chart);
                            if (linearLayout != null) {
                                i10 = R.id.vg_close;
                                View viewA = l3.d.a(view, R.id.vg_close);
                                if (viewA != null) {
                                    i10 = R.id.vg_content;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                    if (constraintLayout != null) {
                                        return new l5((RelativeLayout) view, lineChart, progressBar, recyclerView, textView, textView2, linearLayout, viewA, constraintLayout);
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
    public static l5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16906, new Class[]{LayoutInflater.class}, l5.class);
        return patchProxyResultProxy.isSupported ? (l5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16907, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l5.class);
        if (patchProxyResultProxy.isSupported) {
            return (l5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_switch_second_hand_cassette_price, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112862a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16909, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
