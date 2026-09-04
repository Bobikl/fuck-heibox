package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivitySwitchGameSearchBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f114046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f114047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114050e;

    private o2(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2) {
        this.f114046a = smartRefreshLayout;
        this.f114047b = appBarLayout;
        this.f114048c = recyclerView;
        this.f114049d = recyclerView2;
        this.f114050e = smartRefreshLayout2;
    }

    @androidx.annotation.n0
    public static o2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16608, new Class[]{View.class}, o2.class);
        if (patchProxyResultProxy.isSupported) {
            return (o2) patchProxyResultProxy.result;
        }
        int i10 = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.app_bar);
        if (appBarLayout != null) {
            i10 = R.id.rv_hot;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_hot);
            if (recyclerView != null) {
                i10 = R.id.rv_search;
                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_search);
                if (recyclerView2 != null) {
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                    return new o2(smartRefreshLayout, appBarLayout, recyclerView, recyclerView2, smartRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16606, new Class[]{LayoutInflater.class}, o2.class);
        return patchProxyResultProxy.isSupported ? (o2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16607, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o2.class);
        if (patchProxyResultProxy.isSupported) {
            return (o2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_switch_game_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f114046a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16609, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
