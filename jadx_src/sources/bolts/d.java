package bolts;

import java.io.Closeable;

/* JADX INFO: compiled from: CancellationTokenRegistration.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f35467b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f35468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f35469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35470e;

    d(e eVar, Runnable runnable) {
        this.f35468c = eVar;
        this.f35469d = runnable;
    }

    private void b() {
        if (this.f35470e) {
            throw new IllegalStateException("Object already closed");
        }
    }

    void a() {
        synchronized (this.f35467b) {
            b();
            this.f35469d.run();
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f35467b) {
            if (this.f35470e) {
                return;
            }
            this.f35470e = true;
            this.f35468c.o(this);
            this.f35468c = null;
            this.f35469d = null;
        }
    }
}
