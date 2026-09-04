package com.max.xiaoheihe.base.mvvm;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BaseDisplayState.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum BaseDisplayState {
    CONTENT,
    ERROR,
    LOADING,
    EMPTY,
    NO_NETWORK;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static BaseDisplayState valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.LH, new Class[]{String.class}, BaseDisplayState.class);
        return (BaseDisplayState) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(BaseDisplayState.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static BaseDisplayState[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.KH, new Class[0], BaseDisplayState[].class);
        return (BaseDisplayState[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }
}
