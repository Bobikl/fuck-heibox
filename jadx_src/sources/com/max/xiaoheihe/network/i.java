package com.max.xiaoheihe.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: ServiceGenerator.java */
/* JADX INFO: loaded from: classes12.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f94850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f94851b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static e a() {
        if (f94850a == null) {
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            f94850a = (e) bVarG.n(bVarG.l(), bVarG.j(com.max.hbcommon.network.e.f68061a, true, new u[0])).g(e.class);
        }
        return f94850a;
    }

    public static e b(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 47669, new Class[]{Boolean.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        if (z10) {
            if (f94850a == null) {
                com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
                f94850a = (e) bVarG.n(bVarG.l(), bVarG.j(com.max.hbcommon.network.e.f68061a, true, new u[0])).g(e.class);
            }
            return f94850a;
        }
        if (f94851b == null) {
            com.max.hbcommon.network.b bVarG2 = com.max.hbcommon.network.b.g();
            f94851b = (e) bVarG2.m(bVarG2.l(), bVarG2.j(com.max.hbcommon.network.e.f68061a, false, new u[0])).g(e.class);
        }
        return f94851b;
    }

    public static z c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47670, new Class[0], z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : com.max.hbcommon.network.b.g().j(com.max.hbcommon.network.e.f68061a, true, new u[0]);
    }
}
