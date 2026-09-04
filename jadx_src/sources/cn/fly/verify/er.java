package cn.fly.verify;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* JADX INFO: loaded from: classes6.dex */
public class er extends Thread {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Looper f36352c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36351b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36350a = 0;

    public static Handler a(String str, Handler.Callback callback) {
        return a(str, null, callback);
    }

    public static Handler a(String str, final Runnable runnable, final Handler.Callback callback) {
        final Handler[] handlerArr = new Handler[1];
        er erVar = new er() { // from class: cn.fly.verify.er.1
            @Override // cn.fly.verify.er
            protected void a(Looper looper) {
                synchronized (handlerArr) {
                    handlerArr[0] = new Handler(looper, callback);
                    handlerArr.notifyAll();
                }
            }

            @Override // cn.fly.verify.er, java.lang.Thread, java.lang.Runnable
            public void run() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                super.run();
            }
        };
        synchronized (handlerArr) {
            if (str != null) {
                try {
                    erVar.setName(str);
                    erVar.start();
                    handlerArr.wait();
                } catch (Throwable th2) {
                    es.a().b(th2);
                }
            } else {
                erVar.start();
                handlerArr.wait();
            }
            throw th;
        }
        return handlerArr[0];
    }

    protected void a() {
    }

    protected void a(Looper looper) {
    }

    @Deprecated
    public void b() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            b();
            this.f36351b = Process.myTid();
            Looper.prepare();
            synchronized (this) {
                this.f36352c = Looper.myLooper();
                notifyAll();
            }
            Process.setThreadPriority(this.f36350a);
            a(this.f36352c);
            a();
            Looper.loop();
            this.f36351b = -1;
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }
}
