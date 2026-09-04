package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.R;
import com.max.hbcustomview.ViewPagerFixed;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgFriendRankContainerBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class y0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f131833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f131834c;

    private y0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f131832a = linearLayout;
        this.f131833b = tabLayout;
        this.f131834c = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static y0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31922n9, new Class[]{View.class}, y0.class);
        if (patchProxyResultProxy.isSupported) {
            return (y0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tb_pubg;
        TabLayout tabLayout = (TabLayout) l3.d.a(view, i10);
        if (tabLayout != null) {
            i10 = R.id.vp;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, i10);
            if (viewPagerFixed != null) {
                return new y0((LinearLayout) view, tabLayout, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static y0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31888l9, new Class[]{LayoutInflater.class}, y0.class);
        return patchProxyResultProxy.isSupported ? (y0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31905m9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y0.class);
        if (patchProxyResultProxy.isSupported) {
            return (y0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_friend_rank_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131832a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31939o9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
