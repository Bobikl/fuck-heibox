package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.CollapsibleView;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.SlideViewPager;
import com.max.hbcustomview.video.VideoViewX;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityVideoPostPageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f109988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f109989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CoordinatorLayout f109990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f109991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsibleView f109992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f109994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f109995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomEditorBar f109997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final VideoViewX f110001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlideViewPager f110002o;

    private e3(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 CollapsibleView collapsibleView, @androidx.annotation.n0 View view, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 View view2, @androidx.annotation.n0 BottomEditorBar bottomEditorBar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 VideoViewX videoViewX, @androidx.annotation.n0 SlideViewPager slideViewPager) {
        this.f109988a = frameLayout;
        this.f109989b = appBarLayout;
        this.f109990c = coordinatorLayout;
        this.f109991d = collapsingToolbarLayout;
        this.f109992e = collapsibleView;
        this.f109993f = view;
        this.f109994g = tabLayout;
        this.f109995h = titleBar;
        this.f109996i = view2;
        this.f109997j = bottomEditorBar;
        this.f109998k = relativeLayout;
        this.f109999l = relativeLayout2;
        this.f110000m = frameLayout2;
        this.f110001n = videoViewX;
        this.f110002o = slideViewPager;
    }

    @androidx.annotation.n0
    public static e3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16672, new Class[]{View.class}, e3.class);
        if (patchProxyResultProxy.isSupported) {
            return (e3) patchProxyResultProxy.result;
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
                        i10 = R.id.status_bar;
                        View viewA = l3.d.a(view, R.id.status_bar);
                        if (viewA != null) {
                            i10 = R.id.tl;
                            TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tl);
                            if (tabLayout != null) {
                                i10 = R.id.toolbar;
                                TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                                if (titleBar != null) {
                                    i10 = R.id.v_blank;
                                    View viewA2 = l3.d.a(view, R.id.v_blank);
                                    if (viewA2 != null) {
                                        i10 = R.id.vg_bottom_bar_root;
                                        BottomEditorBar bottomEditorBar = (BottomEditorBar) l3.d.a(view, R.id.vg_bottom_bar_root);
                                        if (bottomEditorBar != null) {
                                            i10 = R.id.vg_header_container;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_header_container);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_video;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_video);
                                                if (relativeLayout2 != null) {
                                                    i10 = R.id.vg_web_fullscreen;
                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_web_fullscreen);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.video_view;
                                                        VideoViewX videoViewX = (VideoViewX) l3.d.a(view, R.id.video_view);
                                                        if (videoViewX != null) {
                                                            i10 = R.id.vp;
                                                            SlideViewPager slideViewPager = (SlideViewPager) l3.d.a(view, R.id.vp);
                                                            if (slideViewPager != null) {
                                                                return new e3((FrameLayout) view, appBarLayout, coordinatorLayout, collapsingToolbarLayout, collapsibleView, viewA, tabLayout, titleBar, viewA2, bottomEditorBar, relativeLayout, relativeLayout2, frameLayout, videoViewX, slideViewPager);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16670, new Class[]{LayoutInflater.class}, e3.class);
        return patchProxyResultProxy.isSupported ? (e3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16671, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e3.class);
        if (patchProxyResultProxy.isSupported) {
            return (e3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_video_post_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f109988a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16673, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
