package com.lzy.okgo.request;

import bb.c;
import com.lzy.okgo.model.HttpMethod;
import com.lzy.okgo.request.base.BodyRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.a0;
import okhttp3.b0;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteRequest<T> extends BodyRequest<T, DeleteRequest<T>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DeleteRequest(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    public a0 E(b0 b0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, c.b.f30949t9, new Class[]{b0.class}, a0.class);
        return patchProxyResultProxy.isSupported ? (a0) patchProxyResultProxy.result : r0(b0Var).e(b0Var).B(this.f64817b).A(this.f64820e).b();
    }

    @Override // com.lzy.okgo.request.base.Request
    public HttpMethod O() {
        return HttpMethod.DELETE;
    }
}
