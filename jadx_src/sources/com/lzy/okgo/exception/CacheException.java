package com.lzy.okgo.exception;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes6.dex */
public class CacheException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 845628123701073013L;

    public CacheException(String str) {
        super(str);
    }

    public static CacheException a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.H7, new Class[]{String.class}, CacheException.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheException) patchProxyResultProxy.result;
        }
        return new CacheException("the http response code is 304, but the cache with cacheKey = " + str + " is null or expired!");
    }

    public static CacheException b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.G7, new Class[]{String.class}, CacheException.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheException) patchProxyResultProxy.result;
        }
        return new CacheException("cacheKey = " + str + " ,can't find cache by cacheKey, or cache has expired!");
    }
}
