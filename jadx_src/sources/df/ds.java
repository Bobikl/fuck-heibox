package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemOrderListHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ds implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f109871b;

    private ds(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BannerViewPager bannerViewPager) {
        this.f109870a = linearLayout;
        this.f109871b = bannerViewPager;
    }

    @androidx.annotation.n0
    public static ds a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19264, new Class[]{View.class}, ds.class);
        if (patchProxyResultProxy.isSupported) {
            return (ds) patchProxyResultProxy.result;
        }
        BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.banner);
        if (bannerViewPager != null) {
            return new ds((LinearLayout) view, bannerViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.banner)));
    }

    @androidx.annotation.n0
    public static ds c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19262, new Class[]{LayoutInflater.class}, ds.class);
        return patchProxyResultProxy.isSupported ? (ds) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ds d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19263, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ds.class);
        if (patchProxyResultProxy.isSupported) {
            return (ds) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_order_list_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109870a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19265, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
