package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ar implements Runnable {
    public abstract void a();

    public void a(Throwable th2) {
    }

    public void b() {
        try {
            new Thread(this).start();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable th2) {
            a(th2);
        }
    }
}
