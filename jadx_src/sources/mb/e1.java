package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.R;
import com.max.hbcustomview.ViewPagerFixed;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSampleVpWithTitleBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f131536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f131537c;

    private e1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f131535a = linearLayout;
        this.f131536b = slidingTabLayout;
        this.f131537c = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static e1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.L9, new Class[]{View.class}, e1.class);
        if (patchProxyResultProxy.isSupported) {
            return (e1) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, i10);
        if (slidingTabLayout != null) {
            i10 = R.id.vp;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, i10);
            if (viewPagerFixed != null) {
                return new e1((LinearLayout) view, slidingTabLayout, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.J9, new Class[]{LayoutInflater.class}, e1.class);
        return patchProxyResultProxy.isSupported ? (e1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.K9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e1.class);
        if (patchProxyResultProxy.isSupported) {
            return (e1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_sample_vp_with_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131535a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.M9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
