package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityUserPreferencesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CoordinatorLayout f108751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppBarLayout f108752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f108754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final p3 f108756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f108757g;

    private b3(@androidx.annotation.n0 CoordinatorLayout coordinatorLayout, @androidx.annotation.n0 AppBarLayout appBarLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 p3 p3Var, @androidx.annotation.n0 ViewPager viewPager) {
        this.f108751a = coordinatorLayout;
        this.f108752b = appBarLayout;
        this.f108753c = recyclerView;
        this.f108754d = slidingTabLayout;
        this.f108755e = relativeLayout;
        this.f108756f = p3Var;
        this.f108757g = viewPager;
    }

    @androidx.annotation.n0
    public static b3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16660, new Class[]{View.class}, b3.class);
        if (patchProxyResultProxy.isSupported) {
            return (b3) patchProxyResultProxy.result;
        }
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) l3.d.a(view, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.rv_selected;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_selected);
            if (recyclerView != null) {
                i10 = R.id.tab;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, R.id.tab);
                if (slidingTabLayout != null) {
                    i10 = R.id.vg_selected;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_selected);
                    if (relativeLayout != null) {
                        i10 = R.id.vg_title;
                        View viewA = l3.d.a(view, R.id.vg_title);
                        if (viewA != null) {
                            p3 p3VarA = p3.a(viewA);
                            i10 = R.id.vp;
                            ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                            if (viewPager != null) {
                                return new b3((CoordinatorLayout) view, appBarLayout, recyclerView, slidingTabLayout, relativeLayout, p3VarA, viewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static b3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16658, new Class[]{LayoutInflater.class}, b3.class);
        return patchProxyResultProxy.isSupported ? (b3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16659, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b3.class);
        if (patchProxyResultProxy.isSupported) {
            return (b3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_user_preferences, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CoordinatorLayout b() {
        return this.f108751a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16661, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
