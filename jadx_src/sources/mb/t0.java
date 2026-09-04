package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.R;
import com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHbSeconderyMenuWindowBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class t0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final HBSecondaryMenuWindowTabLayout f131764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBSecondaryMenuWindowTabLayout f131765b;

    private t0(@androidx.annotation.n0 HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout, @androidx.annotation.n0 HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout2) {
        this.f131764a = hBSecondaryMenuWindowTabLayout;
        this.f131765b = hBSecondaryMenuWindowTabLayout2;
    }

    @androidx.annotation.n0
    public static t0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.T8, new Class[]{View.class}, t0.class);
        if (patchProxyResultProxy.isSupported) {
            return (t0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout = (HBSecondaryMenuWindowTabLayout) view;
        return new t0(hBSecondaryMenuWindowTabLayout, hBSecondaryMenuWindowTabLayout);
    }

    @androidx.annotation.n0
    public static t0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.R8, new Class[]{LayoutInflater.class}, t0.class);
        return patchProxyResultProxy.isSupported ? (t0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.S8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t0.class);
        if (patchProxyResultProxy.isSupported) {
            return (t0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_hb_secondery_menu_window, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public HBSecondaryMenuWindowTabLayout b() {
        return this.f131764a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.U8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
