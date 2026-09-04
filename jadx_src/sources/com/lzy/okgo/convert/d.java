package com.lzy.okgo.convert;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: StringConvert.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements b<String> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.lang.String] */
    @Override // com.lzy.okgo.convert.b
    public /* bridge */ /* synthetic */ String g(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 422, new Class[]{c0.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : h(c0Var);
    }

    public String h(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 421, new Class[]{c0.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        d0 d0VarQ = c0Var.q();
        if (d0VarQ == null) {
            return null;
        }
        return d0VarQ.string();
    }
}
