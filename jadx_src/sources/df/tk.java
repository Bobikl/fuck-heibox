package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flyco.tablayout.CommonTabLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameGlobalPriceExpandV3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f116025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CommonTabLayout f116026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116032i;

    private tk(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 CommonTabLayout commonTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f116024a = linearLayout;
        this.f116025b = lineChart;
        this.f116026c = commonTabLayout;
        this.f116027d = textView;
        this.f116028e = textView2;
        this.f116029f = textView3;
        this.f116030g = textView4;
        this.f116031h = textView5;
        this.f116032i = linearLayout2;
    }

    @androidx.annotation.n0
    public static tk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18497, new Class[]{View.class}, tk.class);
        if (patchProxyResultProxy.isSupported) {
            return (tk) patchProxyResultProxy.result;
        }
        int i10 = R.id.line_chart_trend;
        LineChart lineChart = (LineChart) l3.d.a(view, R.id.line_chart_trend);
        if (lineChart != null) {
            i10 = R.id.tab_time;
            CommonTabLayout commonTabLayout = (CommonTabLayout) l3.d.a(view, R.id.tab_time);
            if (commonTabLayout != null) {
                i10 = R.id.tv_lowest_count;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_lowest_count);
                if (textView != null) {
                    i10 = R.id.tv_lowest_price;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_lowest_price);
                    if (textView2 != null) {
                        i10 = R.id.tv_lowest_price_symbol;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_lowest_price_symbol);
                        if (textView3 != null) {
                            i10 = R.id.tv_no_discount;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_no_discount);
                            if (textView4 != null) {
                                i10 = R.id.tv_title;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                if (textView5 != null) {
                                    i10 = R.id.vg_lowest;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_lowest);
                                    if (linearLayout != null) {
                                        return new tk((LinearLayout) view, lineChart, commonTabLayout, textView, textView2, textView3, textView4, textView5, linearLayout);
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
    public static tk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18495, new Class[]{LayoutInflater.class}, tk.class);
        return patchProxyResultProxy.isSupported ? (tk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18496, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tk.class);
        if (patchProxyResultProxy.isSupported) {
            return (tk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_global_price_expand_v3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116024a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18498, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
