package ia;

import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;

/* JADX INFO: compiled from: Callback.java */
/* JADX INFO: loaded from: classes6.dex */
public interface c<T> extends com.lzy.okgo.convert.b<T> {
    void a(Progress progress);

    void b(com.lzy.okgo.model.b<T> bVar);

    void c(com.lzy.okgo.model.b<T> bVar);

    void d(Progress progress);

    void e(com.lzy.okgo.model.b<T> bVar);

    void f(Request<T, ? extends Request> request);

    void onFinish();
}
