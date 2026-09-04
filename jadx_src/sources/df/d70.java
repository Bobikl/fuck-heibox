package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcustomview.viewpager.SwipeableViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHomePageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.i0 f109681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwipeableViewPager f109682c;

    private d70(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.i0 i0Var, @androidx.annotation.n0 SwipeableViewPager swipeableViewPager) {
        this.f109680a = relativeLayout;
        this.f109681b = i0Var;
        this.f109682c = swipeableViewPager;
    }

    @androidx.annotation.n0
    public static d70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20812, new Class[]{View.class}, d70.class);
        if (patchProxyResultProxy.isSupported) {
            return (d70) patchProxyResultProxy.result;
        }
        int i10 = R.id.tb_home;
        View viewA = l3.d.a(view, R.id.tb_home);
        if (viewA != null) {
            mb.i0 i0VarA = mb.i0.a(viewA);
            SwipeableViewPager swipeableViewPager = (SwipeableViewPager) l3.d.a(view, R.id.vp);
            if (swipeableViewPager != null) {
                return new d70((RelativeLayout) view, i0VarA, swipeableViewPager);
            }
            i10 = R.id.vp;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static d70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20810, new Class[]{LayoutInflater.class}, d70.class);
        return patchProxyResultProxy.isSupported ? (d70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20811, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d70.class);
        if (patchProxyResultProxy.isSupported) {
            return (d70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_home_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109680a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20813, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
