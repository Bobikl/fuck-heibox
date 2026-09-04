package com.max.xiaoheihe.module.mall;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BottomBarManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum NotificationType {
    GAME_ALL_RECOMMEND,
    GAME_GET_GAME_LIST_V3,
    MALL_HEADER;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static NotificationType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40872, new Class[]{String.class}, NotificationType.class);
        return (NotificationType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(NotificationType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static NotificationType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40871, new Class[0], NotificationType[].class);
        return (NotificationType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
