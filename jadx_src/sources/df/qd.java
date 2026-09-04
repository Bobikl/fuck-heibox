package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.triplebanner.TripleBannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBannerLargeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TripleBannerViewPager f114859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f114860c;

    private qd(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TripleBannerViewPager tripleBannerViewPager, @androidx.annotation.n0 mb.p pVar) {
        this.f114858a = relativeLayout;
        this.f114859b = tripleBannerViewPager;
        this.f114860c = pVar;
    }

    @androidx.annotation.n0
    public static qd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17760, new Class[]{View.class}, qd.class);
        if (patchProxyResultProxy.isSupported) {
            return (qd) patchProxyResultProxy.result;
        }
        int i10 = R.id.banner;
        TripleBannerViewPager tripleBannerViewPager = (TripleBannerViewPager) l3.d.a(view, R.id.banner);
        if (tripleBannerViewPager != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                return new qd((RelativeLayout) view, tripleBannerViewPager, mb.p.a(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17758, new Class[]{LayoutInflater.class}, qd.class);
        return patchProxyResultProxy.isSupported ? (qd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17759, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qd.class);
        if (patchProxyResultProxy.isSupported) {
            return (qd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_banner_large, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114858a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17761, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
