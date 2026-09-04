package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.ChildCoordinatorLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentChannelsLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ChildCoordinatorLayout f112453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f112454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f112455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f112459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f112462j;

    private k7(@androidx.annotation.n0 ChildCoordinatorLayout childCoordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ViewPager viewPager) {
        this.f112453a = childCoordinatorLayout;
        this.f112454b = appBarLayout;
        this.f112455c = filterButtonView;
        this.f112456d = view;
        this.f112457e = linearLayout;
        this.f112458f = oVar;
        this.f112459g = tabLayout;
        this.f112460h = linearLayout2;
        this.f112461i = relativeLayout;
        this.f112462j = viewPager;
    }

    @androidx.annotation.n0
    public static k7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17112, new Class[]{View.class}, k7.class);
        if (patchProxyResultProxy.isSupported) {
            return (k7) patchProxyResultProxy.result;
        }
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.fbv_sort;
            FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_sort);
            if (filterButtonView != null) {
                i10 = R.id.iv_filter_mask;
                View viewA = l3.d.a(view, R.id.iv_filter_mask);
                if (viewA != null) {
                    i10 = R.id.ll_header;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_header);
                    if (linearLayout != null) {
                        i10 = R.id.tab_bottom_divider;
                        View viewA2 = l3.d.a(view, R.id.tab_bottom_divider);
                        if (viewA2 != null) {
                            mb.o oVarA = mb.o.a(viewA2);
                            i10 = R.id.tl;
                            TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tl);
                            if (tabLayout != null) {
                                i10 = R.id.vg_filter;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_filter);
                                if (linearLayout2 != null) {
                                    i10 = R.id.vg_tab_bar;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_tab_bar);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vp;
                                        ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                                        if (viewPager != null) {
                                            return new k7((ChildCoordinatorLayout) view, appBarLayout, filterButtonView, viewA, linearLayout, oVarA, tabLayout, linearLayout2, relativeLayout, viewPager);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static k7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17110, new Class[]{LayoutInflater.class}, k7.class);
        return patchProxyResultProxy.isSupported ? (k7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17111, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k7.class);
        if (patchProxyResultProxy.isSupported) {
            return (k7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_channels_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ChildCoordinatorLayout b() {
        return this.f112453a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17113, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
