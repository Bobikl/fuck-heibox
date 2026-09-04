package com.lzy.okgo.request;

import bb.c;
import com.lzy.okgo.model.HttpMethod;
import com.lzy.okgo.request.base.NoBodyRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.a0;
import okhttp3.b0;

/* JADX INFO: loaded from: classes6.dex */
public class TraceRequest<T> extends NoBodyRequest<T, TraceRequest<T>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TraceRequest(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    public a0 E(b0 b0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, c.b.A9, new Class[]{b0.class}, a0.class);
        return patchProxyResultProxy.isSupported ? (a0) patchProxyResultProxy.result : p0(b0Var).p("TRACE", b0Var).B(this.f64817b).A(this.f64820e).b();
    }

    @Override // com.lzy.okgo.request.base.Request
    public HttpMethod O() {
        return HttpMethod.TRACE;
    }
}
