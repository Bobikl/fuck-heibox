package i0;

import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Lock.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final <T> T a(@dl.d yh.a<? extends T> block) {
        T tInvoke;
        f0.p(block, "block");
        synchronized (this) {
            try {
                tInvoke = block.invoke();
                c0.d(1);
            } finally {
                c0.d(1);
                c0.c(1);
            }
        }
        return tInvoke;
    }
}
