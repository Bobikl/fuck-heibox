package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.ChartSelectorView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2ChartSelectorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ue0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ChartSelectorView f116398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ChartSelectorView f116399d;

    private ue0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 ChartSelectorView chartSelectorView, @androidx.annotation.n0 ChartSelectorView chartSelectorView2) {
        this.f116396a = relativeLayout;
        this.f116397b = recyclerView;
        this.f116398c = chartSelectorView;
        this.f116399d = chartSelectorView2;
    }

    @androidx.annotation.n0
    public static ue0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21598, new Class[]{View.class}, ue0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ue0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.v_select_tianhui;
            ChartSelectorView chartSelectorView = (ChartSelectorView) l3.d.a(view, R.id.v_select_tianhui);
            if (chartSelectorView != null) {
                i10 = R.id.v_select_yeyan;
                ChartSelectorView chartSelectorView2 = (ChartSelectorView) l3.d.a(view, R.id.v_select_yeyan);
                if (chartSelectorView2 != null) {
                    return new ue0((RelativeLayout) view, recyclerView, chartSelectorView, chartSelectorView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ue0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21596, new Class[]{LayoutInflater.class}, ue0.class);
        return patchProxyResultProxy.isSupported ? (ue0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ue0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21597, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ue0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ue0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_chart_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116396a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21599, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
