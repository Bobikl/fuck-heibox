package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchBannerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fx implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f110727b;

    private fx(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 BannerViewPager bannerViewPager) {
        this.f110726a = frameLayout;
        this.f110727b = bannerViewPager;
    }

    @androidx.annotation.n0
    public static fx a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19788, new Class[]{View.class}, fx.class);
        if (patchProxyResultProxy.isSupported) {
            return (fx) patchProxyResultProxy.result;
        }
        BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.rv_banner);
        if (bannerViewPager != null) {
            return new fx((FrameLayout) view, bannerViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rv_banner)));
    }

    @androidx.annotation.n0
    public static fx c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19786, new Class[]{LayoutInflater.class}, fx.class);
        return patchProxyResultProxy.isSupported ? (fx) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fx d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19787, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fx.class);
        if (patchProxyResultProxy.isSupported) {
            return (fx) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110726a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19789, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
