package com.max.mediaselector.lib.thread;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.f0;
import androidx.annotation.i;
import androidx.annotation.n0;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class PictureThreadUtils {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f75477f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f75478g = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f75479h = -4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f75480i = -8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Executor f75481j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f75472a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, Map<Integer, ExecutorService>> f75473b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<f, ExecutorService> f75474c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f75475d = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Timer f75476e = new Timer();

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile g f75482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f75483c;

        LinkedBlockingQueue4Util() {
            this.f75483c = Integer.MAX_VALUE;
        }

        LinkedBlockingQueue4Util(int i10) {
            this.f75483c = i10;
        }

        LinkedBlockingQueue4Util(boolean z10) {
            this.f75483c = Integer.MAX_VALUE;
            if (z10) {
                this.f75483c = 0;
            }
        }

        public boolean b(@n0 Runnable runnable) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.m.Q6, new Class[]{Runnable.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this.f75483c > size() || this.f75482b == null || this.f75482b.getPoolSize() >= this.f75482b.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public /* bridge */ /* synthetic */ boolean offer(@n0 Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.R6, new Class[]{Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b((Runnable) obj);
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final AtomicInteger f75484e = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f75485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f75486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f75487d;

        public class a extends Thread {
            public static ChangeQuickRedirect changeQuickRedirect;

            a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35017s7, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th2);
                }
            }
        }

        public class b implements Thread.UncaughtExceptionHandler {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                if (PatchProxy.proxy(new Object[]{thread, th2}, this, changeQuickRedirect, false, bb.c.m.f35039t7, new Class[]{Thread.class, Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                System.out.println(th2);
            }
        }

        UtilsThreadFactory(String str, int i10) {
            this(str, i10, false);
        }

        UtilsThreadFactory(String str, int i10, boolean z10) {
            this.f75485b = str + "-pool-" + f75484e.getAndIncrement() + "-thread-";
            this.f75486c = i10;
            this.f75487d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@n0 Runnable runnable) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.m.f34995r7, new Class[]{Runnable.class}, Thread.class);
            if (patchProxyResultProxy.isSupported) {
                return (Thread) patchProxyResultProxy.result;
            }
            a aVar = new a(runnable, this.f75485b + getAndIncrement());
            aVar.setDaemon(this.f75487d);
            aVar.setUncaughtExceptionHandler(new b());
            aVar.setPriority(this.f75486c);
            return aVar;
        }
    }

    public class a extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f75490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f75491c;

        a(ExecutorService executorService, f fVar) {
            this.f75490b = executorService;
            this.f75491c = fVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.N6, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f75490b.execute(this.f75491c);
        }
    }

    public class b extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f75492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f75493c;

        b(ExecutorService executorService, f fVar) {
            this.f75492b = executorService;
            this.f75493c = fVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.O6, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f75492b.execute(this.f75493c);
        }
    }

    public class c implements Executor {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.m.P6, new Class[]{Runnable.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.s0(runnable);
        }
    }

    public static abstract class d<T> extends f<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public void j() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.S6, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Log.e("ThreadUtils", "onCancel: " + Thread.currentThread());
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public void l(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.T6, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            Log.e("ThreadUtils", "onFail: ", th2);
        }
    }

    public static class e<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CountDownLatch f75494a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AtomicBoolean f75495b = new AtomicBoolean();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f75496c;

        public T a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.V6, new Class[0], Object.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (!this.f75495b.get()) {
                try {
                    this.f75494a.await();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
            return this.f75496c;
        }

        public T b(long j10, TimeUnit timeUnit, T t10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), timeUnit, t10}, this, changeQuickRedirect, false, bb.c.m.W6, new Class[]{Long.TYPE, TimeUnit.class, Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            if (!this.f75495b.get()) {
                try {
                    this.f75494a.await(j10, timeUnit);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    return t10;
                }
            }
            return this.f75496c;
        }

        public void c(T t10) {
            if (!PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.m.U6, new Class[]{Object.class}, Void.TYPE).isSupported && this.f75495b.compareAndSet(false, true)) {
                this.f75496c = t10;
                this.f75494a.countDown();
            }
        }
    }

    public static abstract class f<T> implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f75497i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f75498j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f75499k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f75500l = 3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f75501m = 4;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f75502n = 5;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f75503o = 6;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f75504b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f75505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Thread f75506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Timer f75507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f75508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private InterfaceC0608f f75509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Executor f75510h;

        public class a extends TimerTask {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34766h7, new Class[0], Void.TYPE).isSupported || f.this.i() || f.this.f75509g == null) {
                    return;
                }
                f.c(f.this);
                f.this.f75509g.onTimeout();
                f.this.k();
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f75512b;

            b(Object obj) {
                this.f75512b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34789i7, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f.this.m(this.f75512b);
            }
        }

        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f75514b;

            c(Object obj) {
                this.f75514b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34812j7, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f.this.m(this.f75514b);
                f.this.k();
            }
        }

        public class d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Throwable f75516b;

            d(Throwable th2) {
                this.f75516b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34835k7, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f.this.l(this.f75516b);
                f.this.k();
            }
        }

        public class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34858l7, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f.this.j();
                f.this.k();
            }
        }

        /* JADX INFO: renamed from: com.max.mediaselector.lib.thread.PictureThreadUtils$f$f, reason: collision with other inner class name */
        public interface InterfaceC0608f {
            void onTimeout();
        }

        static /* synthetic */ void a(f fVar, boolean z10) {
            if (PatchProxy.proxy(new Object[]{fVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.f34720f7, new Class[]{f.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            fVar.o(z10);
        }

        static /* synthetic */ void c(f fVar) {
            if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.m.f34743g7, new Class[]{f.class}, Void.TYPE).isSupported) {
                return;
            }
            fVar.q();
        }

        private Executor g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34674d7, new Class[0], Executor.class);
            if (patchProxyResultProxy.isSupported) {
                return (Executor) patchProxyResultProxy.result;
            }
            Executor executor = this.f75510h;
            return executor == null ? PictureThreadUtils.b() : executor;
        }

        private void o(boolean z10) {
            this.f75505c = z10;
        }

        private void q() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34604a7, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            synchronized (this.f75504b) {
                if (this.f75504b.get() > 1) {
                    return;
                }
                this.f75504b.set(6);
                if (this.f75506d != null) {
                    this.f75506d.interrupt();
                }
            }
        }

        public void d() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Y6, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            e(true);
        }

        public void e(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Z6, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            synchronized (this.f75504b) {
                if (this.f75504b.get() > 1) {
                    return;
                }
                this.f75504b.set(4);
                if (z10 && this.f75506d != null) {
                    this.f75506d.interrupt();
                }
                g().execute(new e());
            }
        }

        public abstract T f() throws Throwable;

        public boolean h() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34627b7, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return this.f75504b.get() >= 4;
        }

        public boolean i() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34650c7, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return this.f75504b.get() > 1;
        }

        public abstract void j();

        @i
        public void k() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34697e7, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.f75474c.remove(this);
            Timer timer = this.f75507e;
            if (timer != null) {
                timer.cancel();
                this.f75507e = null;
                this.f75509g = null;
            }
        }

        public abstract void l(Throwable th2);

        public abstract void m(T t10);

        public f<T> n(Executor executor) {
            this.f75510h = executor;
            return this;
        }

        public f<T> p(long j10, InterfaceC0608f interfaceC0608f) {
            this.f75508f = j10;
            this.f75509g = interfaceC0608f;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.X6, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (this.f75505c) {
                if (this.f75506d == null) {
                    if (!this.f75504b.compareAndSet(0, 1)) {
                        return;
                    }
                    this.f75506d = Thread.currentThread();
                    if (this.f75509g != null) {
                        Log.w("ThreadUtils", "Scheduled task doesn't support timeout.");
                    }
                } else if (this.f75504b.get() != 1) {
                    return;
                }
            } else {
                if (!this.f75504b.compareAndSet(0, 1)) {
                    return;
                }
                this.f75506d = Thread.currentThread();
                if (this.f75509g != null) {
                    Timer timer = new Timer();
                    this.f75507e = timer;
                    timer.schedule(new a(), this.f75508f);
                }
            }
            try {
                T tF = f();
                if (this.f75505c) {
                    if (this.f75504b.get() != 1) {
                        return;
                    }
                    g().execute(new b(tF));
                } else if (this.f75504b.compareAndSet(1, 3)) {
                    g().execute(new c(tF));
                }
            } catch (InterruptedException unused) {
                this.f75504b.compareAndSet(4, 5);
            } catch (Throwable th2) {
                if (this.f75504b.compareAndSet(1, 2)) {
                    g().execute(new d(th2));
                }
            }
        }
    }

    public static final class g extends ThreadPoolExecutor {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f75519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinkedBlockingQueue4Util f75520c;

        g(int i10, int i11, long j10, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i10, i11, j10, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f75519b = new AtomicInteger();
            linkedBlockingQueue4Util.f75482b = this;
            this.f75520c = linkedBlockingQueue4Util;
        }

        static /* synthetic */ ExecutorService a(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34973q7, new Class[]{cls, cls}, ExecutorService.class);
            return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : b(i10, i11);
        }

        private static ExecutorService b(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34881m7, new Class[]{cls, cls}, ExecutorService.class);
            if (patchProxyResultProxy.isSupported) {
                return (ExecutorService) patchProxyResultProxy.result;
            }
            if (i10 == -8) {
                return new g(PictureThreadUtils.f75475d + 1, (PictureThreadUtils.f75475d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory(ak.f104463w, i11));
            }
            if (i10 == -4) {
                return new g((PictureThreadUtils.f75475d * 2) + 1, (PictureThreadUtils.f75475d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i11));
            }
            if (i10 == -2) {
                return new g(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i11));
            }
            if (i10 == -1) {
                return new g(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory(FilterGroup.TYPE_SINGLE, i11));
            }
            return new g(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i10 + ")", i11));
        }

        private int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34904n7, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f75519b.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{runnable, th2}, this, changeQuickRedirect, false, bb.c.m.f34927o7, new Class[]{Runnable.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f75519b.decrementAndGet();
            super.afterExecute(runnable, th2);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.m.f34950p7, new Class[]{Runnable.class}, Void.TYPE).isSupported || isShutdown()) {
                return;
            }
            this.f75519b.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f75520c.b(runnable);
            } catch (Throwable unused2) {
                this.f75519b.decrementAndGet();
            }
        }
    }

    public static <T> void A(ExecutorService executorService, f<T> fVar) {
        if (PatchProxy.proxy(new Object[]{executorService, fVar}, null, changeQuickRedirect, true, bb.c.m.f35126x6, new Class[]{ExecutorService.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        h(executorService, fVar);
    }

    public static <T> void B(ExecutorService executorService, f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {executorService, fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.A6, new Class[]{ExecutorService.class, f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(executorService, fVar, j10, j11, timeUnit);
    }

    public static <T> void C(ExecutorService executorService, f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{executorService, fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f35170z6, new Class[]{ExecutorService.class, f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(executorService, fVar, 0L, j10, timeUnit);
    }

    public static <T> void D(ExecutorService executorService, f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{executorService, fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f35148y6, new Class[]{ExecutorService.class, f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        c0(executorService, fVar, j10, timeUnit);
    }

    public static <T> void E(@f0(from = 1) int i10, f<T> fVar) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), fVar}, null, changeQuickRedirect, true, bb.c.m.J5, new Class[]{Integer.TYPE, f.class}, Void.TYPE).isSupported) {
            return;
        }
        h(n0(i10), fVar);
    }

    public static <T> void F(@f0(from = 1) int i10, f<T> fVar, @f0(from = 1, to = 10) int i11) {
        Object[] objArr = {new Integer(i10), fVar, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.K5, new Class[]{cls, f.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        h(o0(i10, i11), fVar);
    }

    public static <T> void G(@f0(from = 1) int i10, f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {new Integer(i10), fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.P5, new Class[]{Integer.TYPE, f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(i10), fVar, j10, j11, timeUnit);
    }

    public static <T> void H(@f0(from = 1) int i10, f<T> fVar, long j10, long j11, TimeUnit timeUnit, @f0(from = 1, to = 10) int i11) {
        Object[] objArr = {new Integer(i10), fVar, new Long(j10), new Long(j11), timeUnit, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Q5, new Class[]{cls, f.class, cls2, cls2, TimeUnit.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(i10, i11), fVar, j10, j11, timeUnit);
    }

    public static <T> void I(@f0(from = 1) int i10, f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.N5, new Class[]{Integer.TYPE, f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(i10), fVar, 0L, j10, timeUnit);
    }

    public static <T> void J(@f0(from = 1) int i10, f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i11) {
        Object[] objArr = {new Integer(i10), fVar, new Long(j10), timeUnit, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.O5, new Class[]{cls, f.class, Long.TYPE, TimeUnit.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(i10, i11), fVar, 0L, j10, timeUnit);
    }

    public static <T> void K(@f0(from = 1) int i10, f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.L5, new Class[]{Integer.TYPE, f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        c0(n0(i10), fVar, j10, timeUnit);
    }

    public static <T> void L(@f0(from = 1) int i10, f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i11) {
        Object[] objArr = {new Integer(i10), fVar, new Long(j10), timeUnit, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.M5, new Class[]{cls, f.class, Long.TYPE, TimeUnit.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        c0(o0(i10, i11), fVar, j10, timeUnit);
    }

    public static <T> void M(f<T> fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.m.f34765h6, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        h(n0(-4), fVar);
    }

    public static <T> void N(f<T> fVar, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34788i6, new Class[]{f.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h(o0(-4, i10), fVar);
    }

    public static <T> void O(f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34903n6, new Class[]{f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-4), fVar, j10, j11, timeUnit);
    }

    public static <T> void P(f<T> fVar, long j10, long j11, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34926o6, new Class[]{f.class, cls, cls, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-4, i10), fVar, j10, j11, timeUnit);
    }

    public static <T> void Q(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f34857l6, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-4), fVar, 0L, j10, timeUnit);
    }

    public static <T> void R(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34880m6, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-4, i10), fVar, 0L, j10, timeUnit);
    }

    public static <T> void S(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f34811j6, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        c0(n0(-4), fVar, j10, timeUnit);
    }

    public static <T> void T(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34834k6, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c0(o0(-4, i10), fVar, j10, timeUnit);
    }

    public static <T> void U(f<T> fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.m.R5, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        h(n0(-1), fVar);
    }

    public static <T> void V(f<T> fVar, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.S5, new Class[]{f.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h(o0(-1, i10), fVar);
    }

    public static <T> void W(f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.X5, new Class[]{f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-1), fVar, j10, j11, timeUnit);
    }

    public static <T> void X(f<T> fVar, long j10, long j11, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Y5, new Class[]{f.class, cls, cls, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-1, i10), fVar, j10, j11, timeUnit);
    }

    public static <T> void Y(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.V5, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-1), fVar, 0L, j10, timeUnit);
    }

    public static <T> void Z(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.W5, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-1, i10), fVar, 0L, j10, timeUnit);
    }

    public static <T> void a0(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.T5, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        c0(n0(-1), fVar, j10, timeUnit);
    }

    static /* synthetic */ Executor b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.M6, new Class[0], Executor.class);
        return patchProxyResultProxy.isSupported ? (Executor) patchProxyResultProxy.result : j0();
    }

    public static <T> void b0(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.U5, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c0(o0(-1, i10), fVar, j10, timeUnit);
    }

    private static <T> void c0(ExecutorService executorService, f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{executorService, fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.G6, new Class[]{ExecutorService.class, f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        i(executorService, fVar, j10, 0L, timeUnit);
    }

    public static void d(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.m.B6, new Class[]{f.class}, Void.TYPE).isSupported || fVar == null) {
            return;
        }
        fVar.d();
    }

    public static ExecutorService d0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.D5, new Class[0], ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : n0(-2);
    }

    public static void e(List<f> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.m.D6, new Class[]{List.class}, Void.TYPE).isSupported || list == null || list.size() == 0) {
            return;
        }
        for (f fVar : list) {
            if (fVar != null) {
                fVar.d();
            }
        }
    }

    public static ExecutorService e0(@f0(from = 1, to = 10) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.E5, new Class[]{Integer.TYPE}, ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : o0(-2, i10);
    }

    public static void f(ExecutorService executorService) {
        if (PatchProxy.proxy(new Object[]{executorService}, null, changeQuickRedirect, true, bb.c.m.E6, new Class[]{ExecutorService.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(executorService instanceof g)) {
            Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
            return;
        }
        for (Map.Entry<f, ExecutorService> entry : f75474c.entrySet()) {
            if (entry.getValue() == executorService) {
                d(entry.getKey());
            }
        }
    }

    public static ExecutorService f0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.H5, new Class[0], ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : n0(-8);
    }

    public static void g(f... fVarArr) {
        if (PatchProxy.proxy(new Object[]{fVarArr}, null, changeQuickRedirect, true, bb.c.m.C6, new Class[]{f[].class}, Void.TYPE).isSupported || fVarArr == null || fVarArr.length == 0) {
            return;
        }
        for (f fVar : fVarArr) {
            if (fVar != null) {
                fVar.d();
            }
        }
    }

    public static ExecutorService g0(@f0(from = 1, to = 10) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.I5, new Class[]{Integer.TYPE}, ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : o0(-8, i10);
    }

    private static <T> void h(ExecutorService executorService, f<T> fVar) {
        if (PatchProxy.proxy(new Object[]{executorService, fVar}, null, changeQuickRedirect, true, bb.c.m.F6, new Class[]{ExecutorService.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        i(executorService, fVar, 0L, 0L, null);
    }

    public static ExecutorService h0(@f0(from = 1) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f35169z5, new Class[]{Integer.TYPE}, ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : n0(i10);
    }

    private static <T> void i(ExecutorService executorService, f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {executorService, fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.I6, new Class[]{ExecutorService.class, f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        Map<f, ExecutorService> map = f75474c;
        synchronized (map) {
            if (map.get(fVar) != null) {
                Log.e("ThreadUtils", "Task can only be executed once.");
                return;
            }
            map.put(fVar, executorService);
            if (j11 != 0) {
                f.a(fVar, true);
                f75476e.scheduleAtFixedRate(new b(executorService, fVar), timeUnit.toMillis(j10), timeUnit.toMillis(j11));
            } else if (j10 == 0) {
                executorService.execute(fVar);
            } else {
                f75476e.schedule(new a(executorService, fVar), timeUnit.toMillis(j10));
            }
        }
    }

    public static ExecutorService i0(@f0(from = 1) int i10, @f0(from = 1, to = 10) int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.A5, new Class[]{cls, cls}, ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : o0(i10, i11);
    }

    private static <T> void j(ExecutorService executorService, f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {executorService, fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.H6, new Class[]{ExecutorService.class, f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        i(executorService, fVar, j10, j11, timeUnit);
    }

    private static Executor j0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.L6, new Class[0], Executor.class);
        if (patchProxyResultProxy.isSupported) {
            return (Executor) patchProxyResultProxy.result;
        }
        if (f75481j == null) {
            f75481j = new c();
        }
        return f75481j;
    }

    public static <T> void k(f<T> fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.m.Z5, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        h(n0(-2), fVar);
    }

    public static ExecutorService k0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.F5, new Class[0], ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : n0(-4);
    }

    public static <T> void l(f<T> fVar, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34603a6, new Class[]{f.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h(o0(-2, i10), fVar);
    }

    public static ExecutorService l0(@f0(from = 1, to = 10) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.G5, new Class[]{Integer.TYPE}, ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : o0(-4, i10);
    }

    public static <T> void m(f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34719f6, new Class[]{f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-2), fVar, j10, j11, timeUnit);
    }

    public static Handler m0() {
        return f75472a;
    }

    public static <T> void n(f<T> fVar, long j10, long j11, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34742g6, new Class[]{f.class, cls, cls, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-2, i10), fVar, j10, j11, timeUnit);
    }

    private static ExecutorService n0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.J6, new Class[]{Integer.TYPE}, ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : o0(i10, 5);
    }

    public static <T> void o(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f34673d6, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-2), fVar, 0L, j10, timeUnit);
    }

    private static ExecutorService o0(int i10, int i11) {
        ExecutorService executorServiceA;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.K6, new Class[]{cls, cls}, ExecutorService.class);
        if (patchProxyResultProxy.isSupported) {
            return (ExecutorService) patchProxyResultProxy.result;
        }
        Map<Integer, Map<Integer, ExecutorService>> map = f75473b;
        synchronized (map) {
            Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i10));
            if (map2 == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorServiceA = g.a(i10, i11);
                concurrentHashMap.put(Integer.valueOf(i11), executorServiceA);
                map.put(Integer.valueOf(i10), concurrentHashMap);
            } else {
                executorServiceA = map2.get(Integer.valueOf(i11));
                if (executorServiceA == null) {
                    executorServiceA = g.a(i10, i11);
                    map2.put(Integer.valueOf(i11), executorServiceA);
                }
            }
        }
        return executorServiceA;
    }

    public static <T> void p(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34696e6, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-2, i10), fVar, 0L, j10, timeUnit);
    }

    public static ExecutorService p0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.B5, new Class[0], ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : n0(-1);
    }

    public static <T> void q(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f34626b6, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        c0(n0(-2), fVar, j10, timeUnit);
    }

    public static ExecutorService q0(@f0(from = 1, to = 10) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.C5, new Class[]{Integer.TYPE}, ExecutorService.class);
        return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : o0(-1, i10);
    }

    public static <T> void r(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34649c6, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c0(o0(-2, i10), fVar, j10, timeUnit);
    }

    public static boolean r0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35103w5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static <T> void s(f<T> fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.m.f34949p6, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        h(n0(-8), fVar);
    }

    public static void s0(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, null, changeQuickRedirect, true, bb.c.m.f35125x5, new Class[]{Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f75472a.post(runnable);
        }
    }

    public static <T> void t(f<T> fVar, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34972q6, new Class[]{f.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h(o0(-8, i10), fVar);
    }

    public static void t0(Runnable runnable, long j10) {
        if (PatchProxy.proxy(new Object[]{runnable, new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f35147y5, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f75472a.postDelayed(runnable, j10);
    }

    public static <T> void u(f<T> fVar, long j10, long j11, TimeUnit timeUnit) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f35082v6, new Class[]{f.class, cls, cls, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-8), fVar, j10, j11, timeUnit);
    }

    public static void u0(Executor executor) {
        f75481j = executor;
    }

    public static <T> void v(f<T> fVar, long j10, long j11, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        Object[] objArr = {fVar, new Long(j10), new Long(j11), timeUnit, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f35104w6, new Class[]{f.class, cls, cls, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-8, i10), fVar, j10, j11, timeUnit);
    }

    public static <T> void w(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f35038t6, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        j(n0(-8), fVar, 0L, j10, timeUnit);
    }

    public static <T> void x(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f35060u6, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j(o0(-8, i10), fVar, 0L, j10, timeUnit);
    }

    public static <T> void y(f<T> fVar, long j10, TimeUnit timeUnit) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit}, null, changeQuickRedirect, true, bb.c.m.f34994r6, new Class[]{f.class, Long.TYPE, TimeUnit.class}, Void.TYPE).isSupported) {
            return;
        }
        c0(n0(-8), fVar, j10, timeUnit);
    }

    public static <T> void z(f<T> fVar, long j10, TimeUnit timeUnit, @f0(from = 1, to = 10) int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Long(j10), timeUnit, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f35016s6, new Class[]{f.class, Long.TYPE, TimeUnit.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c0(o0(-8, i10), fVar, j10, timeUnit);
    }
}
