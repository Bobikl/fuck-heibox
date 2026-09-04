package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGamesLibraryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f113742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f113743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CoordinatorLayout f113745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f113747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f113751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SecondaryWindowSegmentFilterView f113752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBSecondaryMenuWindowTabLayout f113753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f113760s;

    private n9(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CoordinatorLayout coordinatorLayout2, @androidx.annotation.n0 View view, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView, @androidx.annotation.n0 HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f113742a = coordinatorLayout;
        this.f113743b = appBarLayout;
        this.f113744c = cardView;
        this.f113745d = coordinatorLayout2;
        this.f113746e = view;
        this.f113747f = filterButtonView;
        this.f113748g = view2;
        this.f113749h = imageView;
        this.f113750i = imageView2;
        this.f113751j = segmentFilterView;
        this.f113752k = secondaryWindowSegmentFilterView;
        this.f113753l = hBSecondaryMenuWindowTabLayout;
        this.f113754m = textView;
        this.f113755n = view3;
        this.f113756o = linearLayout;
        this.f113757p = linearLayout2;
        this.f113758q = relativeLayout;
        this.f113759r = relativeLayout2;
        this.f113760s = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static n9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17332, new Class[]{View.class}, n9.class);
        if (patchProxyResultProxy.isSupported) {
            return (n9) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.card_header;
            CardView cardView = (CardView) l3.d.a(view, R.id.card_header);
            if (cardView != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                i10 = R.id.divider_region;
                View viewA = l3.d.a(view, R.id.divider_region);
                if (viewA != null) {
                    i10 = R.id.fbv_filter;
                    FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_filter);
                    if (filterButtonView != null) {
                        i10 = R.id.filter_shadow;
                        View viewA2 = l3.d.a(view, R.id.filter_shadow);
                        if (viewA2 != null) {
                            i10 = R.id.iv_platform_setting;
                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_platform_setting);
                            if (imageView != null) {
                                i10 = R.id.iv_region_arrow;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_region_arrow);
                                if (imageView2 != null) {
                                    i10 = R.id.ll_head_filter;
                                    SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.ll_head_filter);
                                    if (segmentFilterView != null) {
                                        i10 = R.id.secondary_filter;
                                        SecondaryWindowSegmentFilterView secondaryWindowSegmentFilterView = (SecondaryWindowSegmentFilterView) l3.d.a(view, R.id.secondary_filter);
                                        if (secondaryWindowSegmentFilterView != null) {
                                            i10 = R.id.tab;
                                            HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout = (HBSecondaryMenuWindowTabLayout) l3.d.a(view, R.id.tab);
                                            if (hBSecondaryMenuWindowTabLayout != null) {
                                                i10 = R.id.tv_filter_region;
                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_filter_region);
                                                if (textView != null) {
                                                    i10 = R.id.v_filter_divider;
                                                    View viewA3 = l3.d.a(view, R.id.v_filter_divider);
                                                    if (viewA3 != null) {
                                                        i10 = R.id.vg_filter;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_filter);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.vg_filter_region;
                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_filter_region);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.vg_sort_filter;
                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_sort_filter);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.vg_tab;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_tab);
                                                                    if (relativeLayout2 != null) {
                                                                        i10 = R.id.vp;
                                                                        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
                                                                        if (viewPagerFixed != null) {
                                                                            return new n9(coordinatorLayout, appBarLayout, cardView, coordinatorLayout, viewA, filterButtonView, viewA2, imageView, imageView2, segmentFilterView, secondaryWindowSegmentFilterView, hBSecondaryMenuWindowTabLayout, textView, viewA3, linearLayout, linearLayout2, relativeLayout, relativeLayout2, viewPagerFixed);
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
    public static n9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17330, new Class[]{LayoutInflater.class}, n9.class);
        return patchProxyResultProxy.isSupported ? (n9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17331, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n9.class);
        if (patchProxyResultProxy.isSupported) {
            return (n9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_games_library, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f113742a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17333, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
