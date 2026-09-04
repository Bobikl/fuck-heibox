package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbview.AutoOffsettingBackgroundLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGameMaterialLibraryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f110868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f110869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f110870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f110871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f110872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f110874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBSecondaryMenuWindowTabLayout f110877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f110878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final AutoOffsettingBackgroundLayout f110882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final FloatingPostButton f110884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f110885r;

    private g9(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 FilterButtonView filterButtonView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FloatingPostButton floatingPostButton, @androidx.annotation.n0 ViewPager viewPager) {
        this.f110868a = coordinatorLayout;
        this.f110869b = appBarLayout;
        this.f110870c = collapsingToolbarLayout;
        this.f110871d = filterButtonView;
        this.f110872e = filterButtonView2;
        this.f110873f = view;
        this.f110874g = qMUIRadiusImageView;
        this.f110875h = imageView;
        this.f110876i = constraintLayout;
        this.f110877j = hBSecondaryMenuWindowTabLayout;
        this.f110878k = titleBar;
        this.f110879l = textView;
        this.f110880m = textView2;
        this.f110881n = textView3;
        this.f110882o = autoOffsettingBackgroundLayout;
        this.f110883p = view2;
        this.f110884q = floatingPostButton;
        this.f110885r = viewPager;
    }

    @androidx.annotation.n0
    public static g9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17304, new Class[]{View.class}, g9.class);
        if (patchProxyResultProxy.isSupported) {
            return (g9) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.ctl;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl);
            if (collapsingToolbarLayout != null) {
                i10 = R.id.fbv_filter;
                FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_filter);
                if (filterButtonView != null) {
                    i10 = R.id.fbv_sort;
                    FilterButtonView filterButtonView2 = (FilterButtonView) l3.d.a(view, R.id.fbv_sort);
                    if (filterButtonView2 != null) {
                        i10 = R.id.filter_divider;
                        View viewA = l3.d.a(view, R.id.filter_divider);
                        if (viewA != null) {
                            i10 = R.id.iv_avatar;
                            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
                            if (qMUIRadiusImageView != null) {
                                i10 = R.id.iv_mask;
                                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_mask);
                                if (imageView != null) {
                                    i10 = R.id.normal_header;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.normal_header);
                                    if (constraintLayout != null) {
                                        i10 = R.id.tab;
                                        HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout = (HBSecondaryMenuWindowTabLayout) l3.d.a(view, R.id.tab);
                                        if (hBSecondaryMenuWindowTabLayout != null) {
                                            i10 = R.id.tb_title_trans;
                                            TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.tb_title_trans);
                                            if (titleBar != null) {
                                                i10 = R.id.tv_name;
                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                                                if (textView != null) {
                                                    i10 = R.id.tv_today_links;
                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_today_links);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_total_links;
                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_total_links);
                                                        if (textView3 != null) {
                                                            i10 = R.id.v_auto_offsetting_bg;
                                                            AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout = (AutoOffsettingBackgroundLayout) l3.d.a(view, R.id.v_auto_offsetting_bg);
                                                            if (autoOffsettingBackgroundLayout != null) {
                                                                i10 = R.id.v_title_bg;
                                                                View viewA2 = l3.d.a(view, R.id.v_title_bg);
                                                                if (viewA2 != null) {
                                                                    i10 = R.id.vg_post;
                                                                    FloatingPostButton floatingPostButton = (FloatingPostButton) l3.d.a(view, R.id.vg_post);
                                                                    if (floatingPostButton != null) {
                                                                        i10 = R.id.vp_content;
                                                                        ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp_content);
                                                                        if (viewPager != null) {
                                                                            return new g9((CoordinatorLayout) view, appBarLayout, collapsingToolbarLayout, filterButtonView, filterButtonView2, viewA, qMUIRadiusImageView, imageView, constraintLayout, hBSecondaryMenuWindowTabLayout, titleBar, textView, textView2, textView3, autoOffsettingBackgroundLayout, viewA2, floatingPostButton, viewPager);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17302, new Class[]{LayoutInflater.class}, g9.class);
        return patchProxyResultProxy.isSupported ? (g9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17303, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g9.class);
        if (patchProxyResultProxy.isSupported) {
            return (g9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_material_library, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f110868a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17305, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
