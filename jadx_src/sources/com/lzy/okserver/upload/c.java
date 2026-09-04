package com.lzy.okserver.upload;

import com.lzy.okserver.task.PriorityBlockingQueue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: UploadThreadPool.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f64926c = 5;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f64927d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TimeUnit f64928e = TimeUnit.HOURS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64929a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.lzy.okserver.task.c f64930b;

    public void a(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.b.Te, new Class[]{Runnable.class}, Void.TYPE).isSupported || runnable == null) {
            return;
        }
        b().execute(runnable);
    }

    public com.lzy.okserver.task.c b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Se, new Class[0], com.lzy.okserver.task.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.task.c) patchProxyResultProxy.result;
        }
        if (this.f64930b == null) {
            synchronized (c.class) {
                if (this.f64930b == null) {
                    this.f64930b = new com.lzy.okserver.task.c(this.f64929a, 5, 1L, f64928e, new PriorityBlockingQueue(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
                }
            }
        }
        return this.f64930b;
    }

    public void c(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.b.Ue, new Class[]{Runnable.class}, Void.TYPE).isSupported || runnable == null) {
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
        this.f64929a = i10;
    }
}
