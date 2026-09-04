package oa;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: ServiceGenerator.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z f132238a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f132239b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static a a(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.b.f30521ag, new Class[]{Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f132239b == null) {
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            f132239b = (a) bVarG.n(bVarG.l(), bVarG.j(f132238a, z10, new u[0])).g(a.class);
        }
        return f132239b;
    }
}
