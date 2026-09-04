package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public class ez implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f36438a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f36439b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f36440c = false;

    private ez() {
    }

    public static synchronized void a() {
        if (!f36439b && eh.f36284h && !f36440c) {
            f36440c = true;
            f36438a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new ez());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        boolean z10;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        try {
            es.a().a("UE handled, processing...", new Object[0]);
            es.a().d(th2);
            uncaughtExceptionHandler2 = f36438a;
            if (uncaughtExceptionHandler2 == null || (uncaughtExceptionHandler2 instanceof ez)) {
                return;
            }
        } catch (Throwable th3) {
            try {
                es.a().a(th3);
                uncaughtExceptionHandler = f36438a;
                if (uncaughtExceptionHandler == null) {
                    return;
                } else {
                    if (z10) {
                        return;
                    }
                }
            } finally {
                uncaughtExceptionHandler = f36438a;
                if (uncaughtExceptionHandler != null && !(uncaughtExceptionHandler instanceof ez)) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                }
            }
        }
        uncaughtExceptionHandler2.uncaughtException(thread, th2);
    }
}
