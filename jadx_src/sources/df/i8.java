package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentDota2MatchDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f111670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f111671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxTabLayout f111672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CoordinatorLayout f111674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final c40 f111677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f111678i;

    private i8(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 HeyBoxTabLayout heyBoxTabLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 c40 c40Var, @androidx.annotation.n0 ViewPager viewPager) {
        this.f111670a = frameLayout;
        this.f111671b = appBarLayout;
        this.f111672c = heyBoxTabLayout;
        this.f111673d = view;
        this.f111674e = coordinatorLayout;
        this.f111675f = linearLayout;
        this.f111676g = frameLayout2;
        this.f111677h = c40Var;
        this.f111678i = viewPager;
    }

    @androidx.annotation.n0
    public static i8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17208, new Class[]{View.class}, i8.class);
        if (patchProxyResultProxy.isSupported) {
            return (i8) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.tab;
            HeyBoxTabLayout heyBoxTabLayout = (HeyBoxTabLayout) l3.d.a(view, R.id.tab);
            if (heyBoxTabLayout != null) {
                i10 = R.id.v_div_tab;
                View viewA = l3.d.a(view, R.id.v_div_tab);
                if (viewA != null) {
                    i10 = R.id.v_scroll;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) l3.d.a(view, R.id.v_scroll);
                    if (coordinatorLayout != null) {
                        i10 = R.id.vg_float_button;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_float_button);
                        if (linearLayout != null) {
                            FrameLayout frameLayout = (FrameLayout) view;
                            i10 = R.id.vg_top;
                            View viewA2 = l3.d.a(view, R.id.vg_top);
                            if (viewA2 != null) {
                                c40 c40VarA = c40.a(viewA2);
                                i10 = R.id.vp;
                                ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                                if (viewPager != null) {
                                    return new i8(frameLayout, appBarLayout, heyBoxTabLayout, viewA, coordinatorLayout, linearLayout, frameLayout, c40VarA, viewPager);
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
    public static i8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17206, new Class[]{LayoutInflater.class}, i8.class);
        return patchProxyResultProxy.isSupported ? (i8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17207, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i8.class);
        if (patchProxyResultProxy.isSupported) {
            return (i8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dota2_match_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f111670a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17209, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
