package com.lzy.okserver.upload;

import com.lzy.okgo.db.i;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: UploadTask.java */
/* JADX INFO: loaded from: classes6.dex */
public class b<T> implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Progress f64905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Object, com.lzy.okserver.upload.a<T>> f64906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ThreadPoolExecutor f64907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.lzy.okserver.task.b f64908e;

    /* JADX INFO: compiled from: UploadTask.java */
    public class a implements com.lzy.okgo.request.base.b.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ okhttp3.e f64909a;

        a(okhttp3.e eVar) {
            this.f64909a = eVar;
        }

        @Override // com.lzy.okgo.request.base.b.c
        public void a(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.Ke, new Class[]{Progress.class}, Void.TYPE).isSupported || this.f64909a.getCanceled()) {
                return;
            }
            Progress progress2 = b.this.f64905b;
            if (progress2.f64785k != 2) {
                this.f64909a.cancel();
                return;
            }
            progress2.f(progress);
            b bVar = b.this;
            b.a(bVar, bVar.f64905b);
        }
    }

    /* JADX INFO: renamed from: com.lzy.okserver.upload.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UploadTask.java */
    public class RunnableC0529b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64911b;

        RunnableC0529b(Progress progress) {
            this.f64911b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Le, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.upload.a<T>> it = b.this.f64906c.values().iterator();
            while (it.hasNext()) {
                it.next().e(this.f64911b);
            }
        }
    }

    /* JADX INFO: compiled from: UploadTask.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64913b;

        c(Progress progress) {
            this.f64913b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Me, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.upload.a<T>> it = b.this.f64906c.values().iterator();
            while (it.hasNext()) {
                it.next().a(this.f64913b);
            }
        }
    }

    /* JADX INFO: compiled from: UploadTask.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64915b;

        d(Progress progress) {
            this.f64915b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ne, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.upload.a<T>> it = b.this.f64906c.values().iterator();
            while (it.hasNext()) {
                it.next().a(this.f64915b);
            }
        }
    }

    /* JADX INFO: compiled from: UploadTask.java */
    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64917b;

        e(Progress progress) {
            this.f64917b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Oe, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.upload.a<T>> it = b.this.f64906c.values().iterator();
            while (it.hasNext()) {
                it.next().a(this.f64917b);
            }
        }
    }

    /* JADX INFO: compiled from: UploadTask.java */
    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64919b;

        f(Progress progress) {
            this.f64919b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Pe, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            for (com.lzy.okserver.upload.a<T> aVar : b.this.f64906c.values()) {
                aVar.a(this.f64919b);
                aVar.c(this.f64919b);
            }
        }
    }

    /* JADX INFO: compiled from: UploadTask.java */
    public class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f64922c;

        g(Progress progress, Object obj) {
            this.f64921b = progress;
            this.f64922c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qe, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            for (com.lzy.okserver.upload.a<T> aVar : b.this.f64906c.values()) {
                aVar.a(this.f64921b);
                aVar.b(this.f64922c, this.f64921b);
            }
        }
    }

    /* JADX INFO: compiled from: UploadTask.java */
    public class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64924b;

        h(Progress progress) {
            this.f64924b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Re, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.upload.a<T>> it = b.this.f64906c.values().iterator();
            while (it.hasNext()) {
                it.next().d(this.f64924b);
            }
            b.this.f64906c.clear();
        }
    }

    public b(Progress progress) {
        la.b.b(progress, "progress == null");
        this.f64905b = progress;
        this.f64907d = com.lzy.okserver.c.b().e().b();
        this.f64906c = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, Request<T, ? extends Request> request) {
        la.b.b(str, "tag == null");
        Progress progress = new Progress();
        this.f64905b = progress;
        progress.f64776b = str;
        progress.f64777c = request.G();
        Progress progress2 = this.f64905b;
        progress2.f64785k = 0;
        progress2.f64782h = -1L;
        progress2.f64788n = request;
        this.f64907d = com.lzy.okserver.c.b().e().b();
        this.f64906c = new HashMap();
    }

    static /* synthetic */ void a(b bVar, Progress progress) {
        if (PatchProxy.proxy(new Object[]{bVar, progress}, null, changeQuickRedirect, true, bb.c.b.Je, new Class[]{b.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.f(progress);
    }

    private void f(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.Ee, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        u(progress);
        la.b.j(new e(progress));
    }

    private void g(Progress progress, Throwable th2) {
        if (PatchProxy.proxy(new Object[]{progress, th2}, this, changeQuickRedirect, false, bb.c.b.Fe, new Class[]{Progress.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 4;
        progress.f64792r = th2;
        u(progress);
        la.b.j(new f(progress));
    }

    private void h(Progress progress, T t10) {
        if (PatchProxy.proxy(new Object[]{progress, t10}, this, changeQuickRedirect, false, bb.c.b.Ge, new Class[]{Progress.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64781g = 1.0f;
        progress.f64785k = 5;
        u(progress);
        la.b.j(new g(progress, t10));
    }

    private void i(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.He, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        u(progress);
        la.b.j(new h(progress));
    }

    private void j(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 911, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 0;
        u(progress);
        la.b.j(new RunnableC0529b(progress));
    }

    private void k(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 913, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 3;
        u(progress);
        la.b.j(new d(progress));
    }

    private void l(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 912, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 1;
        u(progress);
        la.b.j(new c(progress));
    }

    private void u(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.Ie, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        i.P().S(Progress.c(progress), progress.f64776b);
    }

    public b<T> b(Serializable serializable) {
        this.f64905b.f64789o = serializable;
        return this;
    }

    public b<T> c(Serializable serializable) {
        this.f64905b.f64790p = serializable;
        return this;
    }

    public b<T> d(Serializable serializable) {
        this.f64905b.f64791q = serializable;
        return this;
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 908, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64907d.remove(this.f64908e);
        Progress progress = this.f64905b;
        int i10 = progress.f64785k;
        if (i10 == 1) {
            k(progress);
            return;
        }
        if (i10 == 2) {
            progress.f64784j = 0L;
            progress.f64785k = 3;
        } else {
            la.d.l("only the task with status WAITING(1) or LOADING(2) can pause, current status is " + this.f64905b.f64785k);
        }
    }

    public b<T> m(int i10) {
        this.f64905b.f64786l = i10;
        return this;
    }

    public b<T> n(com.lzy.okserver.upload.a<T> aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 903, new Class[]{com.lzy.okserver.upload.a.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (aVar != null) {
            this.f64906c.put(aVar.f64904a, aVar);
        }
        return this;
    }

    public b<T> o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 909, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        e();
        i.P().K(this.f64905b.f64776b);
        b<T> bVar = (b<T>) com.lzy.okserver.c.b().j(this.f64905b.f64776b);
        i(this.f64905b);
        return bVar;
    }

    public void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 907, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e();
        Progress progress = this.f64905b;
        progress.f64785k = 0;
        progress.f64783i = 0L;
        progress.f64781g = 0.0f;
        progress.f64784j = 0L;
        i.P().B(this.f64905b);
        r();
    }

    public b<T> q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 902, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        i.P().B(this.f64905b);
        return this;
    }

    public b<T> r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 906, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (com.lzy.okserver.c.b().c(this.f64905b.f64776b) == null || i.P().L(this.f64905b.f64776b) == null) {
            throw new IllegalStateException("you must call UploadTask#save() before UploadTask#start()！");
        }
        Progress progress = this.f64905b;
        int i10 = progress.f64785k;
        if (i10 == 1 || i10 == 2) {
            la.d.l("the task with tag " + this.f64905b.f64776b + " is already in the upload queue, current task status is " + this.f64905b.f64785k);
        } else {
            j(progress);
            l(this.f64905b);
            com.lzy.okserver.task.b bVar = new com.lzy.okserver.task.b(this.f64905b.f64786l, this);
            this.f64908e = bVar;
            this.f64907d.execute(bVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 910, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Progress progress = this.f64905b;
        progress.f64785k = 2;
        f(progress);
        try {
            Request<?, ? extends Request> request = this.f64905b.f64788n;
            request.o0(new a(request.Q()));
            com.lzy.okgo.model.b<?> bVarExecute = request.r().execute();
            if (bVarExecute.i()) {
                h(this.f64905b, bVarExecute.a());
            } else {
                g(this.f64905b, bVarExecute.d());
            }
        } catch (Exception e10) {
            g(this.f64905b, e10);
        }
    }

    public void s(com.lzy.okserver.upload.a<T> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 904, new Class[]{com.lzy.okserver.upload.a.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.b(aVar, "listener == null");
        this.f64906c.remove(aVar.f64904a);
    }

    public void t(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 905, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.b(str, "tag == null");
        this.f64906c.remove(str);
    }
}
