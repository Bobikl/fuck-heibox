package com.apm.lite.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final d<f, Runnable> f40222f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final d<Message, Runnable> f40223g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f40224a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f40227d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<f> f40225b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f40226c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f40228e = new Object();

    public static final class a implements d<f, Runnable> {
        a() {
        }

        @Override // com.apm.lite.runtime.r.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(f fVar, Runnable runnable) {
            Message message;
            Message message2;
            if (runnable == null) {
                return fVar == null || (message2 = fVar.f40233a) == null || message2.getCallback() == null;
            }
            return (fVar == null || (message = fVar.f40233a) == null || !runnable.equals(message.getCallback())) ? false : true;
        }
    }

    public static final class b implements d<Message, Runnable> {
        b() {
        }

        @Override // com.apm.lite.runtime.r.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(Message message, Runnable runnable) {
            if (runnable == null) {
                return message == null || message.getCallback() == null;
            }
            return message != null && runnable.equals(message.getCallback());
        }
    }

    public class c implements Runnable {
        c() {
        }

        void a() {
            while (!r.this.f40225b.isEmpty()) {
                f fVar = (f) r.this.f40225b.poll();
                if (r.this.f40227d != null) {
                    try {
                        r.this.f40227d.sendMessageAtTime(fVar.f40233a, fVar.f40234b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        void b() {
            while (!r.this.f40226c.isEmpty()) {
                if (r.this.f40227d != null) {
                    try {
                        r.this.f40227d.sendMessageAtFrontOfQueue((Message) r.this.f40226c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            a();
        }
    }

    public interface d<A, B> {
        boolean a(A a10, B b10);
    }

    public class e extends HandlerThread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f40230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f40231c;

        e(String str) {
            super(str);
            this.f40230b = 0;
            this.f40231c = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (r.this.f40228e) {
                try {
                    r.this.f40227d = new Handler();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            r.this.f40227d.post(r.this.new c());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th3) {
                    try {
                        com.apm.lite.b.d.e();
                        if (this.f40230b < 5) {
                            com.apm.lite.c.a();
                            com.apm.lite.c.b("NPTH_CATCH", th3);
                        } else if (!this.f40231c) {
                            this.f40231c = true;
                            com.apm.lite.c.a();
                            com.apm.lite.c.b("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.f40230b++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Message f40233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f40234b;

        f(Message message, long j10) {
            this.f40233a = message;
            this.f40234b = j10;
        }
    }

    public r(String str) {
        this.f40224a = new e(str);
    }

    public static <L, O> boolean g(Collection<L> collection, O o10, d<? super L, O> dVar) {
        boolean z10 = false;
        if (collection != null && !collection.isEmpty() && dVar != null) {
            try {
                Iterator<L> it = collection.iterator();
                while (it.hasNext()) {
                    if (dVar.a(it.next(), o10)) {
                        it.remove();
                        z10 = true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z10;
    }

    private Message m(Runnable runnable) {
        return Message.obtain(this.f40227d, runnable);
    }

    public Handler a() {
        return this.f40227d;
    }

    public final boolean d(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return k(message, SystemClock.uptimeMillis() + j10);
    }

    public final boolean e(Runnable runnable) {
        return d(m(runnable), 0L);
    }

    public final boolean f(Runnable runnable, long j10) {
        return d(m(runnable), j10);
    }

    public void i() {
        this.f40224a.start();
    }

    public final void j(Runnable runnable) {
        if (!this.f40225b.isEmpty() || !this.f40226c.isEmpty()) {
            g(this.f40225b, runnable, f40222f);
            g(this.f40226c, runnable, f40223g);
        }
        if (this.f40227d != null) {
            this.f40227d.removeCallbacks(runnable);
        }
    }

    public final boolean k(Message message, long j10) {
        if (this.f40227d == null) {
            synchronized (this.f40228e) {
                if (this.f40227d == null) {
                    this.f40225b.add(new f(message, j10));
                    return true;
                }
            }
        }
        try {
            return this.f40227d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public HandlerThread l() {
        return this.f40224a;
    }
}
