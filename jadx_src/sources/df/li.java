package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDota2PlayerSelectorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class li implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f113074b;

    private li(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView) {
        this.f113073a = frameLayout;
        this.f113074b = qMUIRadiusImageView;
    }

    @androidx.annotation.n0
    public static li a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18259, new Class[]{View.class}, li.class);
        if (patchProxyResultProxy.isSupported) {
            return (li) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
        if (qMUIRadiusImageView != null) {
            return new li((FrameLayout) view, qMUIRadiusImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_icon)));
    }

    @androidx.annotation.n0
    public static li c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18257, new Class[]{LayoutInflater.class}, li.class);
        return patchProxyResultProxy.isSupported ? (li) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static li d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18258, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, li.class);
        if (patchProxyResultProxy.isSupported) {
            return (li) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dota2_player_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113073a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18260, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
