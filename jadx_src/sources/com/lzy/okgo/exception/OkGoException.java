package com.lzy.okgo.exception;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes6.dex */
public class OkGoException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8641198158155821498L;

    public OkGoException(String str) {
        super(str);
    }

    public static OkGoException a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.N7, new Class[0], OkGoException.class);
        return patchProxyResultProxy.isSupported ? (OkGoException) patchProxyResultProxy.result : new OkGoException("breakpoint file has expired!");
    }

    public static OkGoException b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.M7, new Class[0], OkGoException.class);
        return patchProxyResultProxy.isSupported ? (OkGoException) patchProxyResultProxy.result : new OkGoException("breakpoint file does not exist!");
    }

    public static OkGoException c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.L7, new Class[0], OkGoException.class);
        return patchProxyResultProxy.isSupported ? (OkGoException) patchProxyResultProxy.result : new OkGoException("unknown exception!");
    }
}
