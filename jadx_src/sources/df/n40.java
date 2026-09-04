package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigBottomView2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f113669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionSmallView f113670c;

    private n40(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 BBSUserSectionSmallView bBSUserSectionSmallView) {
        this.f113668a = relativeLayout;
        this.f113669b = bBSLinkListBottomBar;
        this.f113670c = bBSUserSectionSmallView;
    }

    @androidx.annotation.n0
    public static n40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20540, new Class[]{View.class}, n40.class);
        if (patchProxyResultProxy.isSupported) {
            return (n40) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_bottom_bar;
        BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) l3.d.a(view, R.id.vg_bottom_bar);
        if (bBSLinkListBottomBar != null) {
            i10 = R.id.vg_user;
            BBSUserSectionSmallView bBSUserSectionSmallView = (BBSUserSectionSmallView) l3.d.a(view, R.id.vg_user);
            if (bBSUserSectionSmallView != null) {
                return new n40((RelativeLayout) view, bBSLinkListBottomBar, bBSUserSectionSmallView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20538, new Class[]{LayoutInflater.class}, n40.class);
        return patchProxyResultProxy.isSupported ? (n40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20539, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n40.class);
        if (patchProxyResultProxy.isSupported) {
            return (n40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_bottom_view_2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113668a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20541, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
