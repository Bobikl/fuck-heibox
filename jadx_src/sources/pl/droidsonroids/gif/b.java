package pl.droidsonroids.gif;

/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f138337a;

    b() {
    }

    synchronized void a() throws InterruptedException {
        while (!this.f138337a) {
            wait();
        }
    }

    synchronized void b() {
        this.f138337a = false;
    }

    synchronized void c() {
        boolean z10 = this.f138337a;
        this.f138337a = true;
        if (!z10) {
            notify();
        }
    }

    synchronized void d(boolean z10) {
        try {
            if (z10) {
                c();
            } else {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
