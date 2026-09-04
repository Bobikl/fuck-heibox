package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.chart.HeyBoxRadarChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewRadarChartViewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxRadarChart f113070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113072d;

    private lh0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxRadarChart heyBoxRadarChart, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f113069a = relativeLayout;
        this.f113070b = heyBoxRadarChart;
        this.f113071c = relativeLayout2;
        this.f113072d = relativeLayout3;
    }

    @androidx.annotation.n0
    public static lh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21870, new Class[]{View.class}, lh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.hbrc_view_radar_chart_view;
        HeyBoxRadarChart heyBoxRadarChart = (HeyBoxRadarChart) l3.d.a(view, R.id.hbrc_view_radar_chart_view);
        if (heyBoxRadarChart != null) {
            i10 = R.id.vg_view_radar_chart_view_rank;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_view_radar_chart_view_rank);
            if (relativeLayout != null) {
                i10 = R.id.vg_view_radar_chart_view_score;
                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_view_radar_chart_view_score);
                if (relativeLayout2 != null) {
                    return new lh0((RelativeLayout) view, heyBoxRadarChart, relativeLayout, relativeLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static lh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21868, new Class[]{LayoutInflater.class}, lh0.class);
        return patchProxyResultProxy.isSupported ? (lh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21869, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_radar_chart_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113069a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21871, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
