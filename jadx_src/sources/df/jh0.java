package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.cardview.widget.CardView;
import com.github.mikephil.charting.charts.LineChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewR6TrendCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineChart f112200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f112201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112202d;

    private jh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LineChart lineChart, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f112199a = cardView;
        this.f112200b = lineChart;
        this.f112201c = radioGroup;
        this.f112202d = linearLayout;
    }

    @androidx.annotation.n0
    public static jh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21862, new Class[]{View.class}, jh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.line_chart_trend;
        LineChart lineChart = (LineChart) l3.d.a(view, R.id.line_chart_trend);
        if (lineChart != null) {
            i10 = R.id.rg_trend_filter;
            RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_trend_filter);
            if (radioGroup != null) {
                i10 = R.id.vg_trend;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_trend);
                if (linearLayout != null) {
                    return new jh0((CardView) view, lineChart, radioGroup, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21860, new Class[]{LayoutInflater.class}, jh0.class);
        return patchProxyResultProxy.isSupported ? (jh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21861, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_r6_trend_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112199a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21863, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
