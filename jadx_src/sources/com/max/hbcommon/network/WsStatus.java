package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public enum WsStatus {
    CONNECT_SUCCESS,
    CONNECT_FAIL,
    CONNECTING;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static WsStatus valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.e.Yc, new Class[]{String.class}, WsStatus.class);
        return patchProxyResultProxy.isSupported ? (WsStatus) patchProxyResultProxy.result : (WsStatus) Enum.valueOf(WsStatus.class, str);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static WsStatus[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.Xc, new Class[0], WsStatus[].class);
        return patchProxyResultProxy.isSupported ? (WsStatus[]) patchProxyResultProxy.result : (WsStatus[]) values().clone();
    }
}
