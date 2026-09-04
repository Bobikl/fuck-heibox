package com.max.hbpay;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: ServiceGenerator.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z f71601a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f71602b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static a a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.i.f33363o3, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f71602b == null) {
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            f71602b = (a) bVarG.n(bVarG.l(), bVarG.j(f71601a, true, new u[0])).g(a.class);
        }
        return f71602b;
    }
}
