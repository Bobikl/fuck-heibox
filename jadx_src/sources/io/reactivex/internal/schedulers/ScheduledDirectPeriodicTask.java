package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes5.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, io.reactivex.schedulers.a
    public /* bridge */ /* synthetic */ Runnable a() {
        return super.a();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f123610c = Thread.currentThread();
        try {
            this.f123609b.run();
            this.f123610c = null;
        } catch (Throwable th2) {
            this.f123610c = null;
            lazySet(AbstractDirectTask.f123607d);
            io.reactivex.plugins.a.Y(th2);
        }
    }
}
