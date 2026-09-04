package pl.droidsonroids.gif;

/* JADX INFO: compiled from: SafeRunnable.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d f138397b;

    q(d dVar) {
        this.f138397b = dVar;
    }

    abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f138397b.x()) {
                return;
            }
            a();
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
            throw th2;
        }
    }
}
