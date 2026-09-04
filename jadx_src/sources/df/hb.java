package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.CollapsibleView;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.max.xiaoheihe.module.game.heybox.gamematerial.ui.view.ScreenshotViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentScreenshotPostPageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f111371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f111372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CoordinatorLayout f111373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f111374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsibleView f111375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScreenshotViewPager f111377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f111379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomEditorBar f111380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f111382l;

    private hb(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 CollapsibleView collapsibleView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ScreenshotViewPager screenshotViewPager, @androidx.annotation.n0 View view, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 BottomEditorBar bottomEditorBar, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f111371a = frameLayout;
        this.f111372b = appBarLayout;
        this.f111373c = coordinatorLayout;
        this.f111374d = collapsingToolbarLayout;
        this.f111375e = collapsibleView;
        this.f111376f = imageView;
        this.f111377g = screenshotViewPager;
        this.f111378h = view;
        this.f111379i = tabLayout;
        this.f111380j = bottomEditorBar;
        this.f111381k = frameLayout2;
        this.f111382l = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static hb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17516, new Class[]{View.class}, hb.class);
        if (patchProxyResultProxy.isSupported) {
            return (hb) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.f76244cl;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) l3.d.a(view, R.id.f76244cl);
            if (coordinatorLayout != null) {
                i10 = R.id.ctl;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl);
                if (collapsingToolbarLayout != null) {
                    i10 = R.id.cv_container_float;
                    CollapsibleView collapsibleView = (CollapsibleView) l3.d.a(view, R.id.cv_container_float);
                    if (collapsibleView != null) {
                        i10 = R.id.iv_solo;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_solo);
                        if (imageView != null) {
                            i10 = R.id.screenshot_viewpager;
                            ScreenshotViewPager screenshotViewPager = (ScreenshotViewPager) l3.d.a(view, R.id.screenshot_viewpager);
                            if (screenshotViewPager != null) {
                                i10 = R.id.status_bar;
                                View viewA = l3.d.a(view, R.id.status_bar);
                                if (viewA != null) {
                                    i10 = R.id.tl;
                                    TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tl);
                                    if (tabLayout != null) {
                                        i10 = R.id.vg_bottom_bar_root;
                                        BottomEditorBar bottomEditorBar = (BottomEditorBar) l3.d.a(view, R.id.vg_bottom_bar_root);
                                        if (bottomEditorBar != null) {
                                            i10 = R.id.vg_web_fullscreen;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_web_fullscreen);
                                            if (frameLayout != null) {
                                                i10 = R.id.vp;
                                                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
                                                if (viewPagerFixed != null) {
                                                    return new hb((FrameLayout) view, appBarLayout, coordinatorLayout, collapsingToolbarLayout, collapsibleView, imageView, screenshotViewPager, viewA, tabLayout, bottomEditorBar, frameLayout, viewPagerFixed);
                                                }
                                            }
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
    public static hb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17514, new Class[]{LayoutInflater.class}, hb.class);
        return patchProxyResultProxy.isSupported ? (hb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17515, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hb.class);
        if (patchProxyResultProxy.isSupported) {
            return (hb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_screenshot_post_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f111371a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17517, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
