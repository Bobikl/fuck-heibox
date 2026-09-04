package com.lzy.okgo.cache;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes6.dex */
public enum CacheMode {
    DEFAULT,
    NO_CACHE,
    REQUEST_FAILED_READ_CACHE,
    IF_NONE_CACHE_REQUEST,
    FIRST_CACHE_THEN_REQUEST;

    public static ChangeQuickRedirect changeQuickRedirect;

    public static CacheMode valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.P3, new Class[]{String.class}, CacheMode.class);
        return patchProxyResultProxy.isSupported ? (CacheMode) patchProxyResultProxy.result : (CacheMode) Enum.valueOf(CacheMode.class, str);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CacheMode[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.O3, new Class[0], CacheMode[].class);
        return patchProxyResultProxy.isSupported ? (CacheMode[]) patchProxyResultProxy.result : (CacheMode[]) values().clone();
    }
}
