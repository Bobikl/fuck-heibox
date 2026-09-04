package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.g0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: AsyncTaskLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<D> extends c<D> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f24346p = "AsyncTaskLoader";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final boolean f24347q = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f24348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile a<D>.RunnableC0180a f24349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    volatile a<D>.RunnableC0180a f24350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f24351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f24352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Handler f24353o;

    /* JADX INFO: renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTaskLoader.java */
    public final class RunnableC0180a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final CountDownLatch f24354r = new CountDownLatch(1);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f24355s;

        RunnableC0180a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void m(D d10) {
            try {
                a.this.E(this, d10);
            } finally {
                this.f24354r.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void n(D d10) {
            try {
                a.this.F(this, d10);
            } finally {
                this.f24354r.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24355s = false;
            a.this.G();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.K();
            } catch (OperationCanceledException e10) {
                if (k()) {
                    return null;
                }
                throw e10;
            }
        }

        public void v() {
            try {
                this.f24354r.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@n0 Context context) {
        this(context, ModernAsyncTask.f24329m);
    }

    private a(@n0 Context context, @n0 Executor executor) {
        super(context);
        this.f24352n = -10000L;
        this.f24348j = executor;
    }

    public void D() {
    }

    void E(a<D>.RunnableC0180a runnableC0180a, D d10) {
        J(d10);
        if (this.f24350l == runnableC0180a) {
            x();
            this.f24352n = SystemClock.uptimeMillis();
            this.f24350l = null;
            e();
            G();
        }
    }

    void F(a<D>.RunnableC0180a runnableC0180a, D d10) {
        if (this.f24349k != runnableC0180a) {
            E(runnableC0180a, d10);
            return;
        }
        if (k()) {
            J(d10);
            return;
        }
        c();
        this.f24352n = SystemClock.uptimeMillis();
        this.f24349k = null;
        f(d10);
    }

    void G() {
        if (this.f24350l != null || this.f24349k == null) {
            return;
        }
        if (this.f24349k.f24355s) {
            this.f24349k.f24355s = false;
            this.f24353o.removeCallbacks(this.f24349k);
        }
        if (this.f24351m <= 0 || SystemClock.uptimeMillis() >= this.f24352n + this.f24351m) {
            this.f24349k.e(this.f24348j, null);
        } else {
            this.f24349k.f24355s = true;
            this.f24353o.postAtTime(this.f24349k, this.f24352n + this.f24351m);
        }
    }

    public boolean H() {
        return this.f24350l != null;
    }

    @p0
    public abstract D I();

    public void J(@p0 D d10) {
    }

    @p0
    protected D K() {
        return I();
    }

    public void L(long j10) {
        this.f24351m = j10;
        if (j10 != 0) {
            this.f24353o = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void M() {
        a<D>.RunnableC0180a runnableC0180a = this.f24349k;
        if (runnableC0180a != null) {
            runnableC0180a.v();
        }
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f24349k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f24349k);
            printWriter.print(" waiting=");
            printWriter.println(this.f24349k.f24355s);
        }
        if (this.f24350l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f24350l);
            printWriter.print(" waiting=");
            printWriter.println(this.f24350l.f24355s);
        }
        if (this.f24351m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            g0.c(this.f24351m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            g0.b(this.f24352n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // androidx.loader.content.c
    protected boolean o() {
        if (this.f24349k == null) {
            return false;
        }
        if (!this.f24369e) {
            this.f24372h = true;
        }
        if (this.f24350l != null) {
            if (this.f24349k.f24355s) {
                this.f24349k.f24355s = false;
                this.f24353o.removeCallbacks(this.f24349k);
            }
            this.f24349k = null;
            return false;
        }
        if (this.f24349k.f24355s) {
            this.f24349k.f24355s = false;
            this.f24353o.removeCallbacks(this.f24349k);
            this.f24349k = null;
            return false;
        }
        boolean zA = this.f24349k.a(false);
        if (zA) {
            this.f24350l = this.f24349k;
            D();
        }
        this.f24349k = null;
        return zA;
    }

    @Override // androidx.loader.content.c
    protected void q() {
        super.q();
        b();
        this.f24349k = new RunnableC0180a();
        G();
    }
}
