package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.VerticalGameCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCouponPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final VerticalGameCard f115992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final VerticalGameCard f115993b;

    private tg(@androidx.annotation.n0 VerticalGameCard verticalGameCard, @androidx.annotation.n0 VerticalGameCard verticalGameCard2) {
        this.f115992a = verticalGameCard;
        this.f115993b = verticalGameCard2;
    }

    @androidx.annotation.n0
    public static tg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18083, new Class[]{View.class}, tg.class);
        if (patchProxyResultProxy.isSupported) {
            return (tg) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalGameCard verticalGameCard = (VerticalGameCard) view;
        return new tg(verticalGameCard, verticalGameCard);
    }

    @androidx.annotation.n0
    public static tg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18081, new Class[]{LayoutInflater.class}, tg.class);
        return patchProxyResultProxy.isSupported ? (tg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18082, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tg.class);
        if (patchProxyResultProxy.isSupported) {
            return (tg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_coupon_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public VerticalGameCard b() {
        return this.f115992a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18084, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
