package vi;

import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: compiled from: Timing.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "TimingKt")
public final class b {
    public static final long a(@d yh.a<b2> block) {
        f0.p(block, "block");
        long jNanoTime = System.nanoTime();
        block.invoke();
        return System.nanoTime() - jNanoTime;
    }

    public static final long b(@d yh.a<b2> block) {
        f0.p(block, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
