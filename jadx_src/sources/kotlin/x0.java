package kotlin;

/* JADX INFO: compiled from: Synchronized.kt */
/* JADX INFO: loaded from: classes5.dex */
public class x0 extends w0 {
    @sh.f
    private static final <R> R l(Object lock, yh.a<? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.f0.p(lock, "lock");
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
            }
        }
        return rInvoke;
    }
}
