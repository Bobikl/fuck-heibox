package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcustomview.CanSetScrollViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHomePageMaterialBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final lz f110058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CanSetScrollViewPager f110059c;

    private e70(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 lz lzVar, @androidx.annotation.n0 CanSetScrollViewPager canSetScrollViewPager) {
        this.f110057a = relativeLayout;
        this.f110058b = lzVar;
        this.f110059c = canSetScrollViewPager;
    }

    @androidx.annotation.n0
    public static e70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20816, new Class[]{View.class}, e70.class);
        if (patchProxyResultProxy.isSupported) {
            return (e70) patchProxyResultProxy.result;
        }
        int i10 = R.id.tb_home;
        View viewA = l3.d.a(view, R.id.tb_home);
        if (viewA != null) {
            lz lzVarA = lz.a(viewA);
            CanSetScrollViewPager canSetScrollViewPager = (CanSetScrollViewPager) l3.d.a(view, R.id.vp);
            if (canSetScrollViewPager != null) {
                return new e70((RelativeLayout) view, lzVarA, canSetScrollViewPager);
            }
            i10 = R.id.vp;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20814, new Class[]{LayoutInflater.class}, e70.class);
        return patchProxyResultProxy.isSupported ? (e70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20815, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e70.class);
        if (patchProxyResultProxy.isSupported) {
            return (e70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_home_page_material, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110057a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20817, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
