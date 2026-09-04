package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutVpWithTitleMaterialBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f110937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f110938c;

    private gc0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f110936a = linearLayout;
        this.f110937b = tabLayout;
        this.f110938c = viewPager2;
    }

    @androidx.annotation.n0
    public static gc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21337, new Class[]{View.class}, gc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab;
        TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
        if (tabLayout != null) {
            i10 = R.id.vp;
            ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp);
            if (viewPager2 != null) {
                return new gc0((LinearLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21335, new Class[]{LayoutInflater.class}, gc0.class);
        return patchProxyResultProxy.isSupported ? (gc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21336, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_vp_with_title_material, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110936a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21338, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
