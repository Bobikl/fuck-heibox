package oc;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: ServiceGenerator.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z f132266a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f132267b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static a a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.g.f32786d3, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f132267b == null) {
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            f132267b = (a) bVarG.n(bVarG.l(), bVarG.j(f132266a, true, new u[0])).g(a.class);
        }
        return f132267b;
    }
}
