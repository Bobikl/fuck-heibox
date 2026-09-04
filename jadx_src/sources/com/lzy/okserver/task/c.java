package com.lzy.okserver.task;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: XExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends ThreadPoolExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f64896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<d> f64897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<InterfaceC0528c> f64898d;

    /* JADX INFO: compiled from: XExecutor.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f64899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f64900c;

        a(d dVar, Runnable runnable) {
            this.f64899b = dVar;
            this.f64900c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 900, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f64899b.a(this.f64900c);
        }
    }

    /* JADX INFO: compiled from: XExecutor.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0528c f64902b;

        b(InterfaceC0528c interfaceC0528c) {
            this.f64902b = interfaceC0528c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 901, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f64902b.a();
        }
    }

    /* JADX INFO: renamed from: com.lzy.okserver.task.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: XExecutor.java */
    public interface InterfaceC0528c {
        void a();
    }

    /* JADX INFO: compiled from: XExecutor.java */
    public interface d {
        void a(Runnable runnable);
    }

    public c(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i10, i11, j10, timeUnit, blockingQueue);
        this.f64896b = new Handler(Looper.getMainLooper());
    }

    public c(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, rejectedExecutionHandler);
        this.f64896b = new Handler(Looper.getMainLooper());
    }

    public c(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory);
        this.f64896b = new Handler(Looper.getMainLooper());
    }

    public c(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f64896b = new Handler(Looper.getMainLooper());
    }

    public void a(InterfaceC0528c interfaceC0528c) {
        if (PatchProxy.proxy(new Object[]{interfaceC0528c}, this, changeQuickRedirect, false, bb.c.b.f30842oe, new Class[]{InterfaceC0528c.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f64898d == null) {
            this.f64898d = new ArrayList();
        }
        this.f64898d.add(interfaceC0528c);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        List<InterfaceC0528c> list;
        if (PatchProxy.proxy(new Object[]{runnable, th2}, this, changeQuickRedirect, false, bb.c.b.f30773le, new Class[]{Runnable.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        super.afterExecute(runnable, th2);
        List<d> list2 = this.f64897c;
        if (list2 != null && list2.size() > 0) {
            Iterator<d> it = this.f64897c.iterator();
            while (it.hasNext()) {
                this.f64896b.post(new a(it.next(), runnable));
            }
        }
        if (getActiveCount() != 1 || getQueue().size() != 0 || (list = this.f64898d) == null || list.size() <= 0) {
            return;
        }
        Iterator<InterfaceC0528c> it2 = this.f64898d.iterator();
        while (it2.hasNext()) {
            this.f64896b.post(new b(it2.next()));
        }
    }

    public void b(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.b.f30796me, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f64897c == null) {
            this.f64897c = new ArrayList();
        }
        this.f64897c.add(dVar);
    }

    public void c(InterfaceC0528c interfaceC0528c) {
        if (PatchProxy.proxy(new Object[]{interfaceC0528c}, this, changeQuickRedirect, false, bb.c.b.f30865pe, new Class[]{InterfaceC0528c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64898d.remove(interfaceC0528c);
    }

    public void d(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.b.f30819ne, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64897c.remove(dVar);
    }
}
