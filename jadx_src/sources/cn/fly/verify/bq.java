package cn.fly.verify;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes6.dex */
public class bq implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bq f35884a = new bq();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f35885b;

    private bq() {
        String str;
        if (TextUtils.isEmpty("M-")) {
            str = null;
        } else {
            str = ep.f36338a + a("004<gdidilig");
        }
        this.f35885b = er.a(str, this);
    }

    private <T extends bh> int a(T t10) {
        int iK = t10.k();
        return iK > 0 ? iK + 10000 : iK - 10000;
    }

    public static bq a() {
        return f35884a;
    }

    public static String a(String str) {
        return el.a(str, 100);
    }

    private void a(Message message, long j10) {
        if (j10 > 0) {
            this.f35885b.sendMessageDelayed(message, j10);
        } else {
            this.f35885b.sendMessage(message);
        }
    }

    private boolean a(int i10, long j10, Runnable runnable) {
        if (this.f35885b.hasMessages(i10)) {
            return false;
        }
        b(i10, j10, runnable);
        return true;
    }

    private boolean b(int i10, long j10, Runnable runnable) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = runnable;
        a(messageObtain, j10);
        return true;
    }

    public void a(long j10, int i10, cr.b bVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1002;
        messageObtain.arg1 = i10;
        messageObtain.obj = bVar;
        a(messageObtain, j10 * 1000);
    }

    public <T extends bh> void a(long j10, T t10, int i10) {
        int iA = a(t10);
        if (i10 == 1) {
            this.f35885b.removeMessages(iA);
        } else if (i10 == 2 && this.f35885b.hasMessages(iA)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = iA;
        messageObtain.obj = t10;
        a(messageObtain, j10 * 1000);
    }

    public boolean a(long j10, Runnable runnable) {
        return a(1003, j10 * 1000, runnable);
    }

    public Handler b() {
        return this.f35885b;
    }

    public boolean b(long j10, Runnable runnable) {
        return a(1004, j10 * 1000, runnable);
    }

    public Looper c() {
        Handler handler = this.f35885b;
        if (handler != null) {
            return handler.getLooper();
        }
        return null;
    }

    public boolean c(long j10, Runnable runnable) {
        return a(1006, j10 * 1000, runnable);
    }

    public void d() {
        this.f35885b.removeMessages(1002);
    }

    public boolean d(long j10, Runnable runnable) {
        return b(1005, j10, runnable);
    }

    public void e(long j10, Runnable runnable) {
        if (this.f35885b.hasMessages(1007)) {
            return;
        }
        b(1007, j10, runnable);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Runnable runnable;
        ThreadPoolExecutor threadPoolExecutor;
        bh bhVar;
        try {
            if (!by.d()) {
                Message messageObtain = Message.obtain();
                messageObtain.copyFrom(message);
                this.f35885b.sendMessageDelayed(messageObtain, 60000L);
                return false;
            }
            int i10 = message.what;
            if (i10 == 1003 || i10 == 1004 || i10 == 1006) {
                runnable = (Runnable) message.obj;
                if (runnable != null) {
                    threadPoolExecutor = ep.f36341d;
                    threadPoolExecutor.execute(runnable);
                }
            } else if (i10 == 1002) {
                cr.b bVar = (cr.b) message.obj;
                if (bVar != null) {
                    if (!bVar.f36075a) {
                        bVar.f36075a = true;
                    }
                    ep.f36341d.execute(bVar);
                    int i11 = message.arg1;
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 1002;
                    messageObtain2.obj = bVar;
                    messageObtain2.arg1 = i11;
                    a(messageObtain2, i11 * 1000);
                }
            } else if (i10 == 1005 || i10 == 1007) {
                runnable = (Runnable) message.obj;
                if (runnable != null) {
                    threadPoolExecutor = ep.f36340c;
                    threadPoolExecutor.execute(runnable);
                }
            } else if ((i10 >= 10000 || i10 < -10000) && (bhVar = (bh) message.obj) != null) {
                bhVar.h();
            }
            return false;
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }
}
