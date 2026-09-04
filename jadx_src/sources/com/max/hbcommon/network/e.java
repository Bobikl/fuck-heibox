package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: BaseServiceGenerator.java */
/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z f68061a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f68062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f68063c;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static c a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f32026tb, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (f68062b == null) {
            b bVarG = b.g();
            f68062b = (c) bVarG.n(bVarG.l(), bVarG.j(f68061a, true, new u[0])).g(c.class);
        }
        return f68062b;
    }

    public static c b(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f32043ub, new Class[]{Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (z10) {
            if (f68062b == null) {
                b bVarG = b.g();
                f68062b = (c) bVarG.n(bVarG.l(), bVarG.j(f68061a, true, new u[0])).g(c.class);
            }
            return f68062b;
        }
        if (f68063c == null) {
            b bVarG2 = b.g();
            f68063c = (c) bVarG2.m(bVarG2.l(), bVarG2.j(f68061a, false, new u[0])).g(c.class);
        }
        return f68063c;
    }

    public static z c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f32060vb, new Class[0], z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : b.g().j(f68061a, true, new u[0]);
    }
}
