package ei;

import dl.d;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PlatformThreadLocalRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends kotlin.random.a {
    @Override // kotlin.random.Random
    public double i(double d10) {
        return ThreadLocalRandom.current().nextDouble(d10);
    }

    @Override // kotlin.random.Random
    public int n(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // kotlin.random.Random
    public long p(long j10) {
        return ThreadLocalRandom.current().nextLong(j10);
    }

    @Override // kotlin.random.Random
    public long q(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // kotlin.random.a
    @d
    public Random r() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        f0.o(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
