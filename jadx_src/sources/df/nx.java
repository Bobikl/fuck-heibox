package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.SearchGameCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nx implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SearchGameCardView f113965b;

    private nx(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 SearchGameCardView searchGameCardView) {
        this.f113964a = frameLayout;
        this.f113965b = searchGameCardView;
    }

    @androidx.annotation.n0
    public static nx a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19820, new Class[]{View.class}, nx.class);
        if (patchProxyResultProxy.isSupported) {
            return (nx) patchProxyResultProxy.result;
        }
        SearchGameCardView searchGameCardView = (SearchGameCardView) l3.d.a(view, R.id.v_search_game_card);
        if (searchGameCardView != null) {
            return new nx((FrameLayout) view, searchGameCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.v_search_game_card)));
    }

    @androidx.annotation.n0
    public static nx c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19818, new Class[]{LayoutInflater.class}, nx.class);
        return patchProxyResultProxy.isSupported ? (nx) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nx d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19819, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nx.class);
        if (patchProxyResultProxy.isSupported) {
            return (nx) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113964a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19821, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
