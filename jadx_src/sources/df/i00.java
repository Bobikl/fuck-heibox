package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.component.triplebanner.TripleBannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTripleBannerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final TripleBannerViewPager f111582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TripleBannerViewPager f111583b;

    private i00(@androidx.annotation.n0 TripleBannerViewPager tripleBannerViewPager, @androidx.annotation.n0 TripleBannerViewPager tripleBannerViewPager2) {
        this.f111582a = tripleBannerViewPager;
        this.f111583b = tripleBannerViewPager2;
    }

    @androidx.annotation.n0
    public static i00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20108, new Class[]{View.class}, i00.class);
        if (patchProxyResultProxy.isSupported) {
            return (i00) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TripleBannerViewPager tripleBannerViewPager = (TripleBannerViewPager) view;
        return new i00(tripleBannerViewPager, tripleBannerViewPager);
    }

    @androidx.annotation.n0
    public static i00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20106, new Class[]{LayoutInflater.class}, i00.class);
        return patchProxyResultProxy.isSupported ? (i00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20107, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i00.class);
        if (patchProxyResultProxy.isSupported) {
            return (i00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_triple_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public TripleBannerViewPager b() {
        return this.f111582a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20109, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
