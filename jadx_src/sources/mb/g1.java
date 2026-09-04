package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutTitleTabLayoutBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f131556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f131557b;

    private g1(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout) {
        this.f131556a = frameLayout;
        this.f131557b = slidingTabLayout;
    }

    @androidx.annotation.n0
    public static g1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.T9, new Class[]{View.class}, g1.class);
        if (patchProxyResultProxy.isSupported) {
            return (g1) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab_title;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, i10);
        if (slidingTabLayout != null) {
            return new g1((FrameLayout) view, slidingTabLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.R9, new Class[]{LayoutInflater.class}, g1.class);
        return patchProxyResultProxy.isSupported ? (g1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.S9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g1.class);
        if (patchProxyResultProxy.isSupported) {
            return (g1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_title_tab_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f131556a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.U9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
