package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CancellationTokenSource.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f35471b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d> f35472c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f35473d = b.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledFuture<?> f35474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35476g;

    /* JADX INFO: compiled from: CancellationTokenSource.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.f35471b) {
                e.this.f35474e = null;
            }
            e.this.cancel();
        }
    }

    private void d(long j10, TimeUnit timeUnit) {
        if (j10 < -1) {
            throw new IllegalArgumentException("Delay must be >= -1");
        }
        if (j10 == 0) {
            cancel();
            return;
        }
        synchronized (this.f35471b) {
            if (this.f35475f) {
                return;
            }
            e();
            if (j10 != -1) {
                this.f35474e = this.f35473d.schedule(new a(), j10, timeUnit);
            }
        }
    }

    private void e() {
        ScheduledFuture<?> scheduledFuture = this.f35474e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f35474e = null;
        }
    }

    private void i(List<d> list) {
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void n() {
        if (this.f35476g) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public void c(long j10) {
        d(j10, TimeUnit.MILLISECONDS);
    }

    public void cancel() {
        synchronized (this.f35471b) {
            n();
            if (this.f35475f) {
                return;
            }
            e();
            this.f35475f = true;
            i(new ArrayList(this.f35472c));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f35471b) {
            if (this.f35476g) {
                return;
            }
            e();
            Iterator<d> it = this.f35472c.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f35472c.clear();
            this.f35476g = true;
        }
    }

    public c f() {
        c cVar;
        synchronized (this.f35471b) {
            n();
            cVar = new c(this);
        }
        return cVar;
    }

    public boolean g() {
        boolean z10;
        synchronized (this.f35471b) {
            n();
            z10 = this.f35475f;
        }
        return z10;
    }

    d k(Runnable runnable) {
        d dVar;
        synchronized (this.f35471b) {
            n();
            dVar = new d(this, runnable);
            if (this.f35475f) {
                dVar.a();
            } else {
                this.f35472c.add(dVar);
            }
        }
        return dVar;
    }

    void m() throws CancellationException {
        synchronized (this.f35471b) {
            n();
            if (this.f35475f) {
                throw new CancellationException();
            }
        }
    }

    void o(d dVar) {
        synchronized (this.f35471b) {
            n();
            this.f35472c.remove(dVar);
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(g()));
    }
}
