package com.max.xiaoheihe.module.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HotNewsFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum TYPE {
    RANK,
    TITLE,
    NEWS;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static TYPE valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 26843, new Class[]{String.class}, TYPE.class);
        return (TYPE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TYPE.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static TYPE[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26842, new Class[0], TYPE[].class);
        return (TYPE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
