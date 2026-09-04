package com.lzy.okserver.download;

import com.lzy.okserver.task.PriorityBlockingQueue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DownloadThreadPool.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f64873c = 5;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f64874d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TimeUnit f64875e = TimeUnit.HOURS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64876a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.lzy.okserver.task.c f64877b;

    public void a(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.b.Dd, new Class[]{Runnable.class}, Void.TYPE).isSupported || runnable == null) {
            return;
        }
        b().execute(runnable);
    }

    public com.lzy.okserver.task.c b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Cd, new Class[0], com.lzy.okserver.task.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.task.c) patchProxyResultProxy.result;
        }
        if (this.f64877b == null) {
            synchronized (c.class) {
                if (this.f64877b == null) {
                    this.f64877b = new com.lzy.okserver.task.c(this.f64876a, 5, 1L, f64875e, new PriorityBlockingQueue(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
                }
            }
        }
        return this.f64877b;
    }

    public void c(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.b.Ed, new Class[]{Runnable.class}, Void.TYPE).isSupported || runnable == null) {
            return;
        }
        b().remove(runnable);
    }

    public void d(int i10) {
        if (i10 <= 0) {
            i10 = 1;
        }
        if (i10 > 5) {
            i10 = 5;
        }
        this.f64876a = i10;
    }
}
