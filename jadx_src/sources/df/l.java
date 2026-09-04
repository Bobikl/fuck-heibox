package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityChannelsDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f112770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f112771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f112772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxTabLayout f112775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f112776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FloatingPostButton f112780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f112784o;

    private l(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 View view, @androidx.annotation.n0 HeyBoxTabLayout heyBoxTabLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FloatingPostButton floatingPostButton, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 FrameLayout frameLayout4, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f112770a = coordinatorLayout;
        this.f112771b = appBarLayout;
        this.f112772c = collapsingToolbarLayout;
        this.f112773d = recyclerView;
        this.f112774e = view;
        this.f112775f = heyBoxTabLayout;
        this.f112776g = titleBar;
        this.f112777h = view2;
        this.f112778i = frameLayout;
        this.f112779j = relativeLayout;
        this.f112780k = floatingPostButton;
        this.f112781l = frameLayout2;
        this.f112782m = frameLayout3;
        this.f112783n = frameLayout4;
        this.f112784o = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static l a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16284, new Class[]{View.class}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.ctl;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl);
            if (collapsingToolbarLayout != null) {
                i10 = R.id.rv_mini_program;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_mini_program);
                if (recyclerView != null) {
                    i10 = R.id.status_bar;
                    View viewA = l3.d.a(view, R.id.status_bar);
                    if (viewA != null) {
                        i10 = R.id.tl;
                        HeyBoxTabLayout heyBoxTabLayout = (HeyBoxTabLayout) l3.d.a(view, R.id.tl);
                        if (heyBoxTabLayout != null) {
                            i10 = R.id.toolbar;
                            TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                            if (titleBar != null) {
                                i10 = R.id.v_top_header_bg;
                                View viewA2 = l3.d.a(view, R.id.v_top_header_bg);
                                if (viewA2 != null) {
                                    i10 = R.id.vg_fullscreen_video_container;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_fullscreen_video_container);
                                    if (frameLayout != null) {
                                        i10 = R.id.vg_header;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_header);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_post;
                                            FloatingPostButton floatingPostButton = (FloatingPostButton) l3.d.a(view, R.id.vg_post);
                                            if (floatingPostButton != null) {
                                                i10 = R.id.vg_tab;
                                                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_tab);
                                                if (frameLayout2 != null) {
                                                    i10 = R.id.vg_tab_container;
                                                    FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_tab_container);
                                                    if (frameLayout3 != null) {
                                                        i10 = R.id.vg_title;
                                                        FrameLayout frameLayout4 = (FrameLayout) l3.d.a(view, R.id.vg_title);
                                                        if (frameLayout4 != null) {
                                                            i10 = R.id.vp;
                                                            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
                                                            if (viewPagerFixed != null) {
                                                                return new l((CoordinatorLayout) view, appBarLayout, collapsingToolbarLayout, recyclerView, viewA, heyBoxTabLayout, titleBar, viewA2, frameLayout, relativeLayout, floatingPostButton, frameLayout2, frameLayout3, frameLayout4, viewPagerFixed);
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
    public static l c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16282, new Class[]{LayoutInflater.class}, l.class);
        return patchProxyResultProxy.isSupported ? (l) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16283, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_channels_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f112770a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16285, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
