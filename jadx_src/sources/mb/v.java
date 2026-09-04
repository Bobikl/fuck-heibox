package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.R;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBannerBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class v implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BannerViewPager f131795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f131796b;

    private v(@androidx.annotation.n0 BannerViewPager bannerViewPager, @androidx.annotation.n0 BannerViewPager bannerViewPager2) {
        this.f131795a = bannerViewPager;
        this.f131796b = bannerViewPager2;
    }

    @androidx.annotation.n0
    public static v a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31717b7, new Class[]{View.class}, v.class);
        if (patchProxyResultProxy.isSupported) {
            return (v) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BannerViewPager bannerViewPager = (BannerViewPager) view;
        return new v(bannerViewPager, bannerViewPager);
    }

    @androidx.annotation.n0
    public static v c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Z6, new Class[]{LayoutInflater.class}, v.class);
        return patchProxyResultProxy.isSupported ? (v) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31700a7, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v.class);
        if (patchProxyResultProxy.isSupported) {
            return (v) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BannerViewPager b() {
        return this.f131795a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31734c7, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
