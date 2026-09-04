package com.lzy.okgo.request.base;

import bb.c;
import com.lzy.okgo.request.base.NoBodyRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.a0;
import okhttp3.b0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NoBodyRequest<T, R extends NoBodyRequest> extends Request<T, R> {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1200621102761691196L;

    public NoBodyRequest(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    public b0 F() {
        return null;
    }

    public a0.a p0(b0 b0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, c.b.f30608ea, new Class[]{b0.class}, a0.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0.a) patchProxyResultProxy.result;
        }
        this.f64817b = la.b.c(this.f64818c, this.f64825j.f64765b);
        return la.b.a(new a0.a(), this.f64826k);
    }
}
