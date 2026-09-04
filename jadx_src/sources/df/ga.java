package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentMyGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ga implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f110895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f110897c;

    private ga(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2) {
        this.f110895a = smartRefreshLayout;
        this.f110896b = recyclerView;
        this.f110897c = smartRefreshLayout2;
    }

    @androidx.annotation.n0
    public static ga a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17408, new Class[]{View.class}, ga.class);
        if (patchProxyResultProxy.isSupported) {
            return (ga) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_list);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rv_game_list)));
        }
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
        return new ga(smartRefreshLayout, recyclerView, smartRefreshLayout);
    }

    @androidx.annotation.n0
    public static ga c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17406, new Class[]{LayoutInflater.class}, ga.class);
        return patchProxyResultProxy.isSupported ? (ga) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ga d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17407, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ga.class);
        if (patchProxyResultProxy.isSupported) {
            return (ga) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f110895a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17409, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
