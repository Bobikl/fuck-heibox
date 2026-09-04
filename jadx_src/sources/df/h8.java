package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentDota2HeroListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f111319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f111321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroTitleView f111322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final wl f111323e;

    private h8(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 Dota2HeroTitleView dota2HeroTitleView, @androidx.annotation.n0 wl wlVar) {
        this.f111319a = smartRefreshLayout;
        this.f111320b = recyclerView;
        this.f111321c = smartRefreshLayout2;
        this.f111322d = dota2HeroTitleView;
        this.f111323e = wlVar;
    }

    @androidx.annotation.n0
    public static h8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17204, new Class[]{View.class}, h8.class);
        if (patchProxyResultProxy.isSupported) {
            return (h8) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
            i10 = R.id.v_title;
            Dota2HeroTitleView dota2HeroTitleView = (Dota2HeroTitleView) l3.d.a(view, R.id.v_title);
            if (dota2HeroTitleView != null) {
                i10 = R.id.vg_header;
                View viewA = l3.d.a(view, R.id.vg_header);
                if (viewA != null) {
                    return new h8(smartRefreshLayout, recyclerView, smartRefreshLayout, dota2HeroTitleView, wl.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17202, new Class[]{LayoutInflater.class}, h8.class);
        return patchProxyResultProxy.isSupported ? (h8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17203, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h8.class);
        if (patchProxyResultProxy.isSupported) {
            return (h8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dota2_hero_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f111319a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17205, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
