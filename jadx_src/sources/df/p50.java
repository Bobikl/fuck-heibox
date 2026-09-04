package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFullScreenCustomDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final HBUiKitView f114446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f114447b;

    private p50(@androidx.annotation.n0 HBUiKitView hBUiKitView, @androidx.annotation.n0 HBUiKitView hBUiKitView2) {
        this.f114446a = hBUiKitView;
        this.f114447b = hBUiKitView2;
    }

    @androidx.annotation.n0
    public static p50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20652, new Class[]{View.class}, p50.class);
        if (patchProxyResultProxy.isSupported) {
            return (p50) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HBUiKitView hBUiKitView = (HBUiKitView) view;
        return new p50(hBUiKitView, hBUiKitView);
    }

    @androidx.annotation.n0
    public static p50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20650, new Class[]{LayoutInflater.class}, p50.class);
        return patchProxyResultProxy.isSupported ? (p50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20651, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p50.class);
        if (patchProxyResultProxy.isSupported) {
            return (p50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_full_screen_custom_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public HBUiKitView b() {
        return this.f114446a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20653, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
