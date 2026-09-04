package ia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.c0;

/* JADX INFO: compiled from: StringCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends a<String> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.lzy.okgo.convert.d f119332a = new com.lzy.okgo.convert.d();

    @Override // com.lzy.okgo.convert.b
    public /* bridge */ /* synthetic */ Object g(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, bb.c.b.U4, new Class[]{c0.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : h(c0Var);
    }

    public String h(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 409, new Class[]{c0.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strH = this.f119332a.h(c0Var);
        c0Var.close();
        return strH;
    }
}
