package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSRankHotView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCommunityHotLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BBSRankHotView f113033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSRankHotView f113034b;

    private lf(@androidx.annotation.n0 BBSRankHotView bBSRankHotView, @androidx.annotation.n0 BBSRankHotView bBSRankHotView2) {
        this.f113033a = bBSRankHotView;
        this.f113034b = bBSRankHotView2;
    }

    @androidx.annotation.n0
    public static lf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17948, new Class[]{View.class}, lf.class);
        if (patchProxyResultProxy.isSupported) {
            return (lf) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BBSRankHotView bBSRankHotView = (BBSRankHotView) view;
        return new lf(bBSRankHotView, bBSRankHotView);
    }

    @androidx.annotation.n0
    public static lf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17946, new Class[]{LayoutInflater.class}, lf.class);
        return patchProxyResultProxy.isSupported ? (lf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17947, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lf.class);
        if (patchProxyResultProxy.isSupported) {
            return (lf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_community_hot_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BBSRankHotView b() {
        return this.f113033a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17949, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
