package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallProductV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final MallProductViewV2 f109865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MallProductViewV2 f109866b;

    private dq(@androidx.annotation.n0 MallProductViewV2 mallProductViewV2, @androidx.annotation.n0 MallProductViewV2 mallProductViewV3) {
        this.f109865a = mallProductViewV2;
        this.f109866b = mallProductViewV3;
    }

    @androidx.annotation.n0
    public static dq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19056, new Class[]{View.class}, dq.class);
        if (patchProxyResultProxy.isSupported) {
            return (dq) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MallProductViewV2 mallProductViewV2 = (MallProductViewV2) view;
        return new dq(mallProductViewV2, mallProductViewV2);
    }

    @androidx.annotation.n0
    public static dq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19054, new Class[]{LayoutInflater.class}, dq.class);
        return patchProxyResultProxy.isSupported ? (dq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19055, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dq.class);
        if (patchProxyResultProxy.isSupported) {
            return (dq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_product_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public MallProductViewV2 b() {
        return this.f109865a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19057, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
