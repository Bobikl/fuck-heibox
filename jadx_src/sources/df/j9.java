package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentGameRecommendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f112088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f112089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f112090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f112093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final pq f112095h;

    private j9(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 BannerViewPager bannerViewPager, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 pq pqVar) {
        this.f112088a = smartRefreshLayout;
        this.f112089b = consecutiveScrollerLayout;
        this.f112090c = bannerViewPager;
        this.f112091d = recyclerView;
        this.f112092e = recyclerView2;
        this.f112093f = smartRefreshLayout2;
        this.f112094g = linearLayout;
        this.f112095h = pqVar;
    }

    @androidx.annotation.n0
    public static j9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17316, new Class[]{View.class}, j9.class);
        if (patchProxyResultProxy.isSupported) {
            return (j9) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl_container;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl_container);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.rv_banner;
            BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.rv_banner);
            if (bannerViewPager != null) {
                i10 = R.id.rv_menu_container_v2;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_menu_container_v2);
                if (recyclerView != null) {
                    i10 = R.id.rv_recommend_list;
                    RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_recommend_list);
                    if (recyclerView2 != null) {
                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                        i10 = R.id.vg_content;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                        if (linearLayout != null) {
                            i10 = R.id.vg_menu;
                            View viewA = l3.d.a(view, R.id.vg_menu);
                            if (viewA != null) {
                                return new j9(smartRefreshLayout, consecutiveScrollerLayout, bannerViewPager, recyclerView, recyclerView2, smartRefreshLayout, linearLayout, pq.a(viewA));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static j9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17314, new Class[]{LayoutInflater.class}, j9.class);
        return patchProxyResultProxy.isSupported ? (j9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17315, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j9.class);
        if (patchProxyResultProxy.isSupported) {
            return (j9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_recommend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f112088a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17317, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
