package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.ChartSelectorView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemChartSelectorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ChartSelectorView f108935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ChartSelectorView f108936b;

    private bf(@androidx.annotation.n0 ChartSelectorView chartSelectorView, @androidx.annotation.n0 ChartSelectorView chartSelectorView2) {
        this.f108935a = chartSelectorView;
        this.f108936b = chartSelectorView2;
    }

    @androidx.annotation.n0
    public static bf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17908, new Class[]{View.class}, bf.class);
        if (patchProxyResultProxy.isSupported) {
            return (bf) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ChartSelectorView chartSelectorView = (ChartSelectorView) view;
        return new bf(chartSelectorView, chartSelectorView);
    }

    @androidx.annotation.n0
    public static bf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17906, new Class[]{LayoutInflater.class}, bf.class);
        return patchProxyResultProxy.isSupported ? (bf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17907, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bf.class);
        if (patchProxyResultProxy.isSupported) {
            return (bf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_chart_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ChartSelectorView b() {
        return this.f108935a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17909, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
