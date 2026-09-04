package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecLinkInFeedFooterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ov implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f114315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114316b;

    private ov(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f114315a = frameLayout;
        this.f114316b = frameLayout2;
    }

    @androidx.annotation.n0
    public static ov a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19616, new Class[]{View.class}, ov.class);
        if (patchProxyResultProxy.isSupported) {
            return (ov) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_icon);
        if (frameLayout != null) {
            return new ov((FrameLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.vg_icon)));
    }

    @androidx.annotation.n0
    public static ov c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19614, new Class[]{LayoutInflater.class}, ov.class);
        return patchProxyResultProxy.isSupported ? (ov) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ov d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19615, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ov.class);
        if (patchProxyResultProxy.isSupported) {
            return (ov) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_rec_link_in_feed_footer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f114315a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19617, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
