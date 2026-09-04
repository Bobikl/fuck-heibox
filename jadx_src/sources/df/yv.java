package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.MoreButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendGameListTabBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f118066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f118067c;

    private yv(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 MoreButton moreButton, @androidx.annotation.n0 TabLayout tabLayout) {
        this.f118065a = relativeLayout;
        this.f118066b = moreButton;
        this.f118067c = tabLayout;
    }

    @androidx.annotation.n0
    public static yv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19656, new Class[]{View.class}, yv.class);
        if (patchProxyResultProxy.isSupported) {
            return (yv) patchProxyResultProxy.result;
        }
        int i10 = R.id.f76247mb;
        MoreButton moreButton = (MoreButton) l3.d.a(view, R.id.f76247mb);
        if (moreButton != null) {
            i10 = R.id.tab;
            TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
            if (tabLayout != null) {
                return new yv((RelativeLayout) view, moreButton, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static yv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19654, new Class[]{LayoutInflater.class}, yv.class);
        return patchProxyResultProxy.isSupported ? (yv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19655, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yv.class);
        if (patchProxyResultProxy.isSupported) {
            return (yv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_game_list_tab, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118065a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19657, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
