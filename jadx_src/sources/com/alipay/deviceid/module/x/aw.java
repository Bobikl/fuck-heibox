package com.alipay.deviceid.module.x;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alipay.deviceid.module.rpc.mrpc.core.HttpException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HttpManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class aw implements bk {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static aw f38252g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ThreadFactory f38253i = new ThreadFactory() { // from class: com.alipay.deviceid.module.x.aw.2

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f38263a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f38263a.getAndIncrement());
            thread.setPriority(4);
            return thread;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f38254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ar f38255b = ar.a("android");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f38256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f38257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f38258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f38259f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ThreadPoolExecutor f38260h;

    private aw(Context context) {
        this.f38254a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f38253i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f38260h = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f38254a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final aw a(Context context) {
        aw awVar = f38252g;
        return awVar != null ? awVar : b(context);
    }

    private static final synchronized aw b(Context context) {
        aw awVar = f38252g;
        if (awVar != null) {
            return awVar;
        }
        aw awVar2 = new aw(context);
        f38252g = awVar2;
        return awVar2;
    }

    @Override // com.alipay.deviceid.module.x.bk
    public final Future<bd> a(bc bcVar) {
        if (bb.a(this.f38254a)) {
            String str = com.alipay.zoloz.android.phone.mrpc.core.i.f39702h + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f38260h.getActiveCount());
            objArr[1] = Long.valueOf(this.f38260h.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f38260h.getTaskCount());
            long j10 = this.f38258e;
            objArr[3] = Long.valueOf(j10 == 0 ? 0L : ((this.f38256c * 1000) / j10) >> 10);
            int i10 = this.f38259f;
            objArr[4] = Long.valueOf(i10 != 0 ? this.f38257d / ((long) i10) : 0L);
            objArr[5] = Long.valueOf(this.f38256c);
            objArr[6] = Long.valueOf(this.f38257d);
            objArr[7] = Long.valueOf(this.f38258e);
            objArr[8] = Integer.valueOf(this.f38259f);
            String.format(str, objArr);
        }
        final az azVar = new az(this, (ax) bcVar);
        FutureTask<bd> futureTask = new FutureTask<bd>(azVar) { // from class: com.alipay.deviceid.module.x.aw.1
            @Override // java.util.concurrent.FutureTask
            protected final void done() {
                ax axVarA = azVar.a();
                if (axVarA.a() == null) {
                    super.done();
                    return;
                }
                try {
                    get();
                    if (isCancelled() || axVarA.f38299f) {
                        axVarA.f38299f = true;
                        if (isCancelled() && isDone()) {
                            return;
                        }
                        cancel(false);
                    }
                } catch (InterruptedException e10) {
                    e10.toString();
                } catch (CancellationException unused) {
                    axVarA.f38299f = true;
                } catch (ExecutionException e11) {
                    if (e11.getCause() == null || !(e11.getCause() instanceof HttpException)) {
                        e11.toString();
                        return;
                    }
                    HttpException httpException = (HttpException) e11.getCause();
                    httpException.getCode();
                    httpException.getMsg();
                } catch (Throwable th2) {
                    throw new RuntimeException("An error occured while executing http request", th2);
                }
            }
        };
        this.f38260h.execute(futureTask);
        return futureTask;
    }
}
