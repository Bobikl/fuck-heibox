package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RestrictTo;
import androidx.annotation.b0;
import androidx.annotation.j1;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: SelfDestructiveThread.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f21071i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f21072j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("mLock")
    private HandlerThread f21074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("mLock")
    private Handler f21075c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21080h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21073a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler.Callback f21077e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("mLock")
    private int f21076d = 0;

    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                l.this.c();
                return true;
            }
            if (i10 != 1) {
                return true;
            }
            l.this.d((Runnable) message.obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f21082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f21083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f21084d;

        /* JADX INFO: compiled from: SelfDestructiveThread.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f21086b;

            a(Object obj) {
                this.f21086b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f21084d.a(this.f21086b);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f21082b = callable;
            this.f21083c = handler;
            this.f21084d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f21082b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f21083c.post(new a(objCall));
        }
    }

    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f21088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callable f21089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f21090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f21091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Condition f21092f;

        c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f21088b = atomicReference;
            this.f21089c = callable;
            this.f21090d = reentrantLock;
            this.f21091e = atomicBoolean;
            this.f21092f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f21088b.set(this.f21089c.call());
            } catch (Exception unused) {
            }
            this.f21090d.lock();
            try {
                this.f21091e.set(false);
                this.f21092f.signal();
            } finally {
                this.f21090d.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    public interface d<T> {
        void a(T t10);
    }

    public l(String str, int i10, int i11) {
        this.f21080h = str;
        this.f21079g = i10;
        this.f21078f = i11;
    }

    private void e(Runnable runnable) {
        synchronized (this.f21073a) {
            if (this.f21074b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f21080h, this.f21079g);
                this.f21074b = handlerThread;
                handlerThread.start();
                this.f21075c = new Handler(this.f21074b.getLooper(), this.f21077e);
                this.f21076d++;
            }
            this.f21075c.removeMessages(0);
            Handler handler = this.f21075c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    @j1
    public int a() {
        int i10;
        synchronized (this.f21073a) {
            i10 = this.f21076d;
        }
        return i10;
    }

    @j1
    public boolean b() {
        boolean z10;
        synchronized (this.f21073a) {
            z10 = this.f21074b != null;
        }
        return z10;
    }

    void c() {
        synchronized (this.f21073a) {
            if (this.f21075c.hasMessages(1)) {
                return;
            }
            this.f21074b.quit();
            this.f21074b = null;
            this.f21075c = null;
        }
    }

    void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f21073a) {
            this.f21075c.removeMessages(0);
            Handler handler = this.f21075c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f21078f);
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, androidx.core.provider.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i10) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t10 = (T) atomicReference.get();
                reentrantLock.unlock();
                return t10;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t11 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t11;
                }
            } while (nanos > 0);
            throw new InterruptedException(l5.a.f130839h0);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
