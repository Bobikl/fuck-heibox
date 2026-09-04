package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.LinkToolCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemLinkToolCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinkToolCardView f115286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinkToolCardView f115287b;

    private rp(@androidx.annotation.n0 LinkToolCardView linkToolCardView, @androidx.annotation.n0 LinkToolCardView linkToolCardView2) {
        this.f115286a = linkToolCardView;
        this.f115287b = linkToolCardView2;
    }

    @androidx.annotation.n0
    public static rp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19008, new Class[]{View.class}, rp.class);
        if (patchProxyResultProxy.isSupported) {
            return (rp) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinkToolCardView linkToolCardView = (LinkToolCardView) view;
        return new rp(linkToolCardView, linkToolCardView);
    }

    @androidx.annotation.n0
    public static rp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19006, new Class[]{LayoutInflater.class}, rp.class);
        return patchProxyResultProxy.isSupported ? (rp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19007, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rp.class);
        if (patchProxyResultProxy.isSupported) {
            return (rp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_link_tool_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinkToolCardView b() {
        return this.f115286a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19009, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
