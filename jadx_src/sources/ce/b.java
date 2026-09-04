package ce;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: ServiceGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z f35646a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f35647b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static a a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.l.H5, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f35647b == null) {
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            f35647b = (a) bVarG.n(bVarG.l(), bVarG.j(f35646a, true, new u[0])).g(a.class);
        }
        return f35647b;
    }
}
