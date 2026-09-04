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

/* JADX INFO: compiled from: LayoutTransparentTabLayoutBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f131563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlidingTabLayout f131564b;

    private h1(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 SlidingTabLayout slidingTabLayout) {
        this.f131563a = frameLayout;
        this.f131564b = slidingTabLayout;
    }

    @androidx.annotation.n0
    public static h1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.X9, new Class[]{View.class}, h1.class);
        if (patchProxyResultProxy.isSupported) {
            return (h1) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab_title;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) l3.d.a(view, i10);
        if (slidingTabLayout != null) {
            return new h1((FrameLayout) view, slidingTabLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.V9, new Class[]{LayoutInflater.class}, h1.class);
        return patchProxyResultProxy.isSupported ? (h1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.W9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h1.class);
        if (patchProxyResultProxy.isSupported) {
            return (h1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_transparent_tab_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f131563a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Y9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
