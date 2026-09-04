package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsFeedsUiKitBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final HBUiKitView f112252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f112253b;

    private jr(@androidx.annotation.n0 HBUiKitView hBUiKitView, @androidx.annotation.n0 HBUiKitView hBUiKitView2) {
        this.f112252a = hBUiKitView;
        this.f112253b = hBUiKitView2;
    }

    @androidx.annotation.n0
    public static jr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19184, new Class[]{View.class}, jr.class);
        if (patchProxyResultProxy.isSupported) {
            return (jr) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HBUiKitView hBUiKitView = (HBUiKitView) view;
        return new jr(hBUiKitView, hBUiKitView);
    }

    @androidx.annotation.n0
    public static jr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19182, new Class[]{LayoutInflater.class}, jr.class);
        return patchProxyResultProxy.isSupported ? (jr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19183, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jr.class);
        if (patchProxyResultProxy.isSupported) {
            return (jr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_feeds_ui_kit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public HBUiKitView b() {
        return this.f112252a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19185, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
