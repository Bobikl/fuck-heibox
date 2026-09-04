package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigBottomView3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BBSLinkListBottomBar f114093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f114094b;

    private o40(@androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar2) {
        this.f114093a = bBSLinkListBottomBar;
        this.f114094b = bBSLinkListBottomBar2;
    }

    @androidx.annotation.n0
    public static o40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20544, new Class[]{View.class}, o40.class);
        if (patchProxyResultProxy.isSupported) {
            return (o40) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) view;
        return new o40(bBSLinkListBottomBar, bBSLinkListBottomBar);
    }

    @androidx.annotation.n0
    public static o40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20542, new Class[]{LayoutInflater.class}, o40.class);
        return patchProxyResultProxy.isSupported ? (o40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20543, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o40.class);
        if (patchProxyResultProxy.isSupported) {
            return (o40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_bottom_view_3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BBSLinkListBottomBar b() {
        return this.f114093a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20545, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
