package okio;

import com.taobao.accs.common.Constants;
import dl.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l5.a;
import xh.e;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001J\"\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0086\bø\u0001\u0000R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lokio/Timeout;", "", "", a.f130839h0, "Ljava/util/concurrent/TimeUnit;", "unit", "timeoutNanos", "", "hasDeadline", "deadlineNanoTime", "duration", "deadline", "clearTimeout", "clearDeadline", "Lkotlin/b2;", "throwIfReached", Constants.KEY_MONIROT, "waitUntilNotified", "other", "Lkotlin/Function0;", "block", "intersectWith", "Z", "J", "<init>", "()V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
public class Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @d
    @e
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        @d
        public Timeout deadlineNanoTime(long deadlineNanoTime) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        @d
        public Timeout timeout(long timeout, @d TimeUnit unit) {
            f0.p(unit, "unit");
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* JADX INFO: compiled from: Timeout.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokio/Timeout$Companion;", "", "()V", "NONE", "Lokio/Timeout;", "minTimeout", "", "aNanos", "bNanos", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final long minTimeout(long aNanos, long bNanos) {
            return (aNanos != 0 && (bNanos == 0 || aNanos < bNanos)) ? aNanos : bNanos;
        }
    }

    @d
    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @d
    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @d
    public final Timeout deadline(long duration, @d TimeUnit unit) {
        f0.p(unit, "unit");
        if (duration > 0) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(duration));
        }
        throw new IllegalArgumentException(("duration <= 0: " + duration).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @d
    public Timeout deadlineNanoTime(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }

    /* JADX INFO: renamed from: hasDeadline, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(@d Timeout other, @d yh.a<b2> block) {
        f0.p(other, "other");
        f0.p(block, "block");
        long timeoutNanos = getTimeoutNanos();
        timeout(INSTANCE.minTimeout(other.getTimeoutNanos(), getTimeoutNanos()), TimeUnit.NANOSECONDS);
        if (!getHasDeadline()) {
            if (other.getHasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                block.invoke();
                c0.d(1);
                return;
            } finally {
                c0.d(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.getHasDeadline()) {
                    clearDeadline();
                }
                c0.c(1);
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.getHasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            block.invoke();
            c0.d(1);
        } finally {
            c0.d(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.getHasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            c0.c(1);
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @d
    public Timeout timeout(long timeout, @d TimeUnit unit) {
        f0.p(unit, "unit");
        if (timeout >= 0) {
            this.timeoutNanos = unit.toNanos(timeout);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + timeout).toString());
    }

    /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@d Object monitor) throws InterruptedIOException {
        f0.p(monitor, "monitor");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long jNanoTime = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (timeoutNanos > 0) {
                long j10 = timeoutNanos / 1000000;
                Long.signum(j10);
                monitor.wait(j10, (int) (timeoutNanos - (1000000 * j10)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= timeoutNanos) {
                throw new InterruptedIOException(a.f130839h0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
