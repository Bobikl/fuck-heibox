package com.max.xiaoheihe.module.mall.cart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MallCartUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum CartListItemType {
    GROUP,
    PRODUCT;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static CartListItemType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 41354, new Class[]{String.class}, CartListItemType.class);
        return (CartListItemType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(CartListItemType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CartListItemType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41353, new Class[0], CartListItemType[].class);
        return (CartListItemType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
