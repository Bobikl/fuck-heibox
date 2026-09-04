package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gu implements Runnable {
    protected abstract void a() throws Throwable;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }
}
