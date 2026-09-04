package ia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import okhttp3.c0;

/* JADX INFO: compiled from: FileCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d extends a<File> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.lzy.okgo.convert.c f119331a;

    public d() {
        this(null);
    }

    public d(String str) {
        this(null, str);
    }

    public d(String str, String str2) {
        com.lzy.okgo.convert.c cVar = new com.lzy.okgo.convert.c(str, str2);
        this.f119331a = cVar;
        cVar.l(this);
    }

    @Override // com.lzy.okgo.convert.b
    public /* bridge */ /* synthetic */ Object g(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, bb.c.b.S4, new Class[]{c0.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : h(c0Var);
    }

    public File h(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 407, new Class[]{c0.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File fileJ = this.f119331a.j(c0Var);
        c0Var.close();
        return fileJ;
    }
}
