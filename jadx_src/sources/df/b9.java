package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGameCompilationDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f108870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f108871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsingToolbarLayout f108872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f108874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f108875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f108877h;

    private b9(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f108870a = coordinatorLayout;
        this.f108871b = appBarLayout;
        this.f108872c = collapsingToolbarLayout;
        this.f108873d = imageView;
        this.f108874e = slidingTabLayout;
        this.f108875f = titleBar;
        this.f108876g = linearLayout;
        this.f108877h = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static b9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17284, new Class[]{View.class}, b9.class);
        if (patchProxyResultProxy.isSupported) {
            return (b9) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.ctl;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) l3.d.a(view, R.id.ctl);
            if (collapsingToolbarLayout != null) {
                i10 = R.id.iv_bg_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg_img);
                if (imageView != null) {
                    i10 = R.id.tl_sort;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, R.id.tl_sort);
                    if (slidingTabLayout != null) {
                        i10 = R.id.toolbar;
                        TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.toolbar);
                        if (titleBar != null) {
                            i10 = R.id.vg_sort;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_sort);
                            if (linearLayout != null) {
                                i10 = R.id.vp;
                                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
                                if (viewPagerFixed != null) {
                                    return new b9((CoordinatorLayout) view, appBarLayout, collapsingToolbarLayout, imageView, slidingTabLayout, titleBar, linearLayout, viewPagerFixed);
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
    public static b9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17282, new Class[]{LayoutInflater.class}, b9.class);
        return patchProxyResultProxy.isSupported ? (b9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17283, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b9.class);
        if (patchProxyResultProxy.isSupported) {
            return (b9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_compilation_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f108870a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17285, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
