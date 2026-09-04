package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.BarChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameTrendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BarChart f113497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113498c;

    private mn(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BarChart barChart, @androidx.annotation.n0 ImageView imageView) {
        this.f113496a = relativeLayout;
        this.f113497b = barChart;
        this.f113498c = imageView;
    }

    @androidx.annotation.n0
    public static mn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18780, new Class[]{View.class}, mn.class);
        if (patchProxyResultProxy.isSupported) {
            return (mn) patchProxyResultProxy.result;
        }
        int i10 = R.id.bc_trend;
        BarChart barChart = (BarChart) l3.d.a(view, R.id.bc_trend);
        if (barChart != null) {
            i10 = R.id.iv_chart_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_chart_bg);
            if (imageView != null) {
                return new mn((RelativeLayout) view, barChart, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18778, new Class[]{LayoutInflater.class}, mn.class);
        return patchProxyResultProxy.isSupported ? (mn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18779, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mn.class);
        if (patchProxyResultProxy.isSupported) {
            return (mn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_trend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113496a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18781, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
