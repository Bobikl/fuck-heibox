package anetwork.channel.entity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService[] f30220a = new ExecutorService[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicInteger f30221b = new AtomicInteger(0);

    static {
        for (int i10 = 0; i10 < 2; i10++) {
            f30220a[i10] = Executors.newSingleThreadExecutor(new f());
        }
    }

    public static void b(int i10, Runnable runnable) {
        f30220a[Math.abs(i10 % 2)].submit(runnable);
    }
}
