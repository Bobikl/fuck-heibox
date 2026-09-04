package com.lzy.okgo.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DefaultCallAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class e<T> implements d<T, c<T>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.lzy.okgo.adapter.d
    public /* bridge */ /* synthetic */ Object a(c cVar, a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, aVar}, this, changeQuickRedirect, false, bb.c.b.J3, new Class[]{c.class, a.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b(cVar, aVar);
    }

    public c<T> b(c<T> cVar, a aVar) {
        return cVar;
    }
}
