package com.alipay.zoloz.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
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
public class i implements y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39702h = "HttpManager";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static i f39703i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f39704j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f39705k = 11;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f39706l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f39707m = 20;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f39708n = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f39709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f39710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.alipay.zoloz.android.phone.mrpc.core.b f39711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f39714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39715g;

    /* JADX INFO: compiled from: HttpManager.java */
    public class a extends FutureTask<q> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f39716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Callable callable, l lVar) {
            super(callable);
            this.f39716b = lVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            j jVarQ = this.f39716b.q();
            z zVarB = jVarQ.b();
            if (zVarB == null) {
                super.done();
                return;
            }
            try {
                q qVar = get();
                if (!isCancelled() && !jVarQ.c()) {
                    if (qVar != null) {
                        zVarB.c(jVarQ, qVar);
                        return;
                    }
                    return;
                }
                jVarQ.a();
                if (!isCancelled() || !isDone()) {
                    cancel(false);
                }
                zVarB.d(jVarQ);
            } catch (InterruptedException e10) {
                zVarB.e(jVarQ, 7, e10 + "");
            } catch (CancellationException unused) {
                jVarQ.a();
                zVarB.d(jVarQ);
            } catch (ExecutionException e11) {
                if (e11.getCause() != null && (e11.getCause() instanceof HttpException)) {
                    HttpException httpException = (HttpException) e11.getCause();
                    zVarB.e(jVarQ, httpException.b(), httpException.c());
                } else {
                    zVarB.e(jVarQ, 6, e11 + "");
                }
            } catch (Throwable th2) {
                throw new RuntimeException("An error occured while executing http request", th2);
            }
        }
    }

    /* JADX INFO: compiled from: HttpManager.java */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f39718b = new AtomicInteger(1);

        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "com.alipay.zoloz.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f39718b.getAndIncrement());
            thread.setPriority(4);
            return thread;
        }
    }

    public i(Context context) {
        this.f39709a = context;
        l();
    }

    public static final i k(Context context) {
        i iVar = f39703i;
        return iVar != null ? iVar : n(context);
    }

    private void l() {
        this.f39711c = com.alipay.zoloz.android.phone.mrpc.core.b.n("android");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f39708n, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f39710b = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f39709a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    private FutureTask<q> m(l lVar) {
        return new a(lVar, lVar);
    }

    private static final synchronized i n(Context context) {
        i iVar = f39703i;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(context);
        f39703i = iVar2;
        return iVar2;
    }

    @Override // com.alipay.zoloz.android.phone.mrpc.core.y
    public Future<q> a(p pVar) {
        if (!(pVar instanceof j)) {
            throw new RuntimeException("request send error.");
        }
        if (n.a(this.f39709a)) {
            Log.i(f39702h, f());
        }
        FutureTask<q> futureTaskM = m(g((j) pVar));
        this.f39710b.execute(futureTaskM);
        return futureTaskM;
    }

    public void b(long j10) {
        this.f39713e += j10;
        this.f39715g++;
    }

    public void c(long j10) {
        this.f39712d += j10;
    }

    public void d(long j10) {
        this.f39714f += j10;
    }

    public void e() {
        ThreadPoolExecutor threadPoolExecutor = this.f39710b;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
            this.f39710b = null;
        }
        com.alipay.zoloz.android.phone.mrpc.core.b bVar = this.f39711c;
        if (bVar != null) {
            bVar.d();
        }
        this.f39711c = null;
    }

    public String f() {
        return String.format(f39702h + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.f39710b.getActiveCount()), Long.valueOf(this.f39710b.getCompletedTaskCount()), Long.valueOf(this.f39710b.getTaskCount()), Long.valueOf(i()), Long.valueOf(h()), Long.valueOf(this.f39712d), Long.valueOf(this.f39713e), Long.valueOf(this.f39714f), Integer.valueOf(this.f39715g));
    }

    protected l g(j jVar) {
        return new l(this, jVar);
    }

    public long h() {
        int i10 = this.f39715g;
        if (i10 == 0) {
            return 0L;
        }
        return this.f39713e / ((long) i10);
    }

    public long i() {
        long j10 = this.f39714f;
        if (j10 == 0) {
            return 0L;
        }
        return ((this.f39712d * 1000) / j10) >> 10;
    }

    public com.alipay.zoloz.android.phone.mrpc.core.b j() {
        return this.f39711c;
    }
}
