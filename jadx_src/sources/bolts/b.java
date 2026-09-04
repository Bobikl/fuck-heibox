package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: BoltsExecutors.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f35460d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f35461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f35462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f35463c;

    /* JADX INFO: renamed from: bolts.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BoltsExecutors.java */
    public static class ExecutorC0261b implements Executor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f35464c = 15;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ThreadLocal<Integer> f35465b;

        private ExecutorC0261b() {
            this.f35465b = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f35465b.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f35465b.remove();
            } else {
                this.f35465b.set(Integer.valueOf(iIntValue));
            }
            return iIntValue;
        }

        private int b() {
            Integer num = this.f35465b.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f35465b.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
                a();
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    private b() {
        this.f35461a = !c() ? Executors.newCachedThreadPool() : bolts.a.b();
        this.f35462b = Executors.newSingleThreadScheduledExecutor();
        this.f35463c = new ExecutorC0261b();
    }

    public static ExecutorService a() {
        return f35460d.f35461a;
    }

    static Executor b() {
        return f35460d.f35463c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    static ScheduledExecutorService d() {
        return f35460d.f35462b;
    }
}
