package com.max.xiaoheihe.module.mall.cart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MallCartUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum CartItemCheckState {
    DISABLE,
    CHECKED,
    UNCHECKED;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static CartItemCheckState valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 41352, new Class[]{String.class}, CartItemCheckState.class);
        return (CartItemCheckState) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(CartItemCheckState.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CartItemCheckState[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41351, new Class[0], CartItemCheckState[].class);
        return (CartItemCheckState[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
