package com.max.xiaoheihe.module.mall.cart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MallCartUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum OrderEvent {
    REGISTER,
    SUCCESS,
    CANCEL;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static OrderEvent valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 41429, new Class[]{String.class}, OrderEvent.class);
        return (OrderEvent) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(OrderEvent.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static OrderEvent[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41428, new Class[0], OrderEvent[].class);
        return (OrderEvent[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
