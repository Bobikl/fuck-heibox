package ia;

import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: AbsCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T> implements c<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // ia.c
    public void a(Progress progress) {
    }

    @Override // ia.c
    public void b(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 404, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        la.d.i(bVar.d());
    }

    @Override // ia.c
    public void d(Progress progress) {
    }

    @Override // ia.c
    public void e(com.lzy.okgo.model.b<T> bVar) {
    }

    @Override // ia.c
    public void f(Request<T, ? extends Request> request) {
    }

    @Override // ia.c
    public void onFinish() {
    }
}
