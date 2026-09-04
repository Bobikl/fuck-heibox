package com.max.xiaoheihe.module.mall.adapter;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f89992a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private final KeyDescObj b(MallProductObj mallProductObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallProductObj}, this, changeQuickRedirect, false, 41159, new Class[]{MallProductObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (mallProductObj == null || mallProductObj.getPrice() == null || mallProductObj.getPrice().getCoupon_info() == null) {
            return null;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(mallProductObj.getPrice().getCoupon_info().getCoupon_desc());
        return keyDescObj;
    }

    private final KeyDescObj c(MallProductObj mallProductObj) {
        MallPriceObj price;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallProductObj}, this, changeQuickRedirect, false, 41158, new Class[]{MallProductObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        String rebate_desc = (mallProductObj == null || (price = mallProductObj.getPrice()) == null) ? null : price.getRebate_desc();
        if (rebate_desc == null) {
            return null;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(rebate_desc);
        return keyDescObj;
    }

    public final void a(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41157, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        r1.y1(mallProductView.getContext(), mallProductView.getLlHTag(), b(mallProductObj), c(mallProductObj));
    }
}
