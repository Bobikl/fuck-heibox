package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigBottomView4Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final HBUiKitView f114439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f114440b;

    private p40(@androidx.annotation.n0 HBUiKitView hBUiKitView, @androidx.annotation.n0 HBUiKitView hBUiKitView2) {
        this.f114439a = hBUiKitView;
        this.f114440b = hBUiKitView2;
    }

    @androidx.annotation.n0
    public static p40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20548, new Class[]{View.class}, p40.class);
        if (patchProxyResultProxy.isSupported) {
            return (p40) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HBUiKitView hBUiKitView = (HBUiKitView) view;
        return new p40(hBUiKitView, hBUiKitView);
    }

    @androidx.annotation.n0
    public static p40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20546, new Class[]{LayoutInflater.class}, p40.class);
        return patchProxyResultProxy.isSupported ? (p40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20547, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p40.class);
        if (patchProxyResultProxy.isSupported) {
            return (p40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_bottom_view_4, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public HBUiKitView b() {
        return this.f114439a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20549, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
