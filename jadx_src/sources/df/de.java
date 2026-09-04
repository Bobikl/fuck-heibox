package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBigGameCardScrollV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class de implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f109769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109770c;

    private de(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BannerViewPager bannerViewPager, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f109768a = linearLayout;
        this.f109769b = bannerViewPager;
        this.f109770c = recyclerView;
    }

    @androidx.annotation.n0
    public static de a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17812, new Class[]{View.class}, de.class);
        if (patchProxyResultProxy.isSupported) {
            return (de) patchProxyResultProxy.result;
        }
        int i10 = R.id.banner;
        BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.banner);
        if (bannerViewPager != null) {
            i10 = R.id.rv_tab;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_tab);
            if (recyclerView != null) {
                return new de((LinearLayout) view, bannerViewPager, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static de c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17810, new Class[]{LayoutInflater.class}, de.class);
        return patchProxyResultProxy.isSupported ? (de) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static de d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17811, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, de.class);
        if (patchProxyResultProxy.isSupported) {
            return (de) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_big_game_card_scroll_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109768a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17813, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
