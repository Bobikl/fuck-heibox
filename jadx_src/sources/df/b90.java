package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: LayoutPreloadRefreshRvBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f108878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final UniversalRecyclerView f108879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f108880c;

    private b90(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 UniversalRecyclerView universalRecyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2) {
        this.f108878a = smartRefreshLayout;
        this.f108879b = universalRecyclerView;
        this.f108880c = smartRefreshLayout2;
    }

    @androidx.annotation.n0
    public static b90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21010, new Class[]{View.class}, b90.class);
        if (patchProxyResultProxy.isSupported) {
            return (b90) patchProxyResultProxy.result;
        }
        UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) l3.d.a(view, R.id.rv);
        if (universalRecyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rv)));
        }
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
        return new b90(smartRefreshLayout, universalRecyclerView, smartRefreshLayout);
    }

    @androidx.annotation.n0
    public static b90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21008, new Class[]{LayoutInflater.class}, b90.class);
        return patchProxyResultProxy.isSupported ? (b90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21009, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b90.class);
        if (patchProxyResultProxy.isSupported) {
            return (b90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_preload_refresh_rv, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f108878a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21011, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
