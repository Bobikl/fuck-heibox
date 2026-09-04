package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSearchTabFragmentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ma0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f113363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f113364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager f113365d;

    private ma0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 ViewPager viewPager) {
        this.f113362a = relativeLayout;
        this.f113363b = filterButtonView;
        this.f113364c = tabLayout;
        this.f113365d = viewPager;
    }

    @androidx.annotation.n0
    public static ma0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21158, new Class[]{View.class}, ma0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ma0) patchProxyResultProxy.result;
        }
        int i10 = R.id.filter_button;
        FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.filter_button);
        if (filterButtonView != null) {
            i10 = R.id.tl;
            TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tl);
            if (tabLayout != null) {
                i10 = R.id.vp;
                ViewPager viewPager = (ViewPager) l3.d.a(view, R.id.vp);
                if (viewPager != null) {
                    return new ma0((RelativeLayout) view, filterButtonView, tabLayout, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ma0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21156, new Class[]{LayoutInflater.class}, ma0.class);
        return patchProxyResultProxy.isSupported ? (ma0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ma0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21157, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ma0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ma0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_search_tab_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113362a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21159, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
