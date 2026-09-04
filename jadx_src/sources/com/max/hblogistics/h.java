package com.max.hblogistics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: ServiceGenerator.java */
/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z f71044a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f71045b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static c a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.Ih, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (f71045b == null) {
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            f71045b = (c) bVarG.n(bVarG.l(), bVarG.j(f71044a, true, new u[0])).g(c.class);
        }
        return f71045b;
    }
}
