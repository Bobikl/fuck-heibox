package okio;

import androidx.exifinterface.media.a;
import com.alipay.sdk.m.x.d;
import dl.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.r0;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ'\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "", "now", "remainingNanos", "Lkotlin/b2;", "enter", "", d.A, "timedOut", "Lokio/Sink;", "sink", "Lokio/Source;", "source", a.f23244d5, "Lkotlin/Function0;", "block", "withTimeout", "(Lyh/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "newTimeoutException", "inQueue", "Z", "next", "Lokio/AsyncTimeout;", "timeoutAt", "J", "<init>", "()V", "Companion", "Watchdog", "okio"}, k = 1, mv = {1, 4, 0})
public class AsyncTimeout extends Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "Lokio/AsyncTimeout;", "node", "", "timeoutNanos", "", "hasDeadline", "Lkotlin/b2;", "scheduleTimeout", "cancelScheduledTimeout", "awaitTimeout$okio", "()Lokio/AsyncTimeout;", "awaitTimeout", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lokio/AsyncTimeout;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout node) {
            synchronized (AsyncTimeout.class) {
                for (AsyncTimeout asyncTimeout = AsyncTimeout.head; asyncTimeout != null; asyncTimeout = asyncTimeout.next) {
                    if (asyncTimeout.next == node) {
                        asyncTimeout.next = node.next;
                        node.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(AsyncTimeout asyncTimeout, long j10, boolean z10) {
            synchronized (AsyncTimeout.class) {
                if (AsyncTimeout.head == null) {
                    AsyncTimeout.head = new AsyncTimeout();
                    new Watchdog().start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    asyncTimeout.timeoutAt = Math.min(j10, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    asyncTimeout.timeoutAt = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
                }
                long jRemainingNanos = asyncTimeout.remainingNanos(jNanoTime);
                AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
                f0.m(asyncTimeout2);
                while (asyncTimeout2.next != null) {
                    AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                    f0.m(asyncTimeout3);
                    if (jRemainingNanos < asyncTimeout3.remainingNanos(jNanoTime)) {
                        break;
                    }
                    asyncTimeout2 = asyncTimeout2.next;
                    f0.m(asyncTimeout2);
                }
                asyncTimeout.next = asyncTimeout2.next;
                asyncTimeout2.next = asyncTimeout;
                if (asyncTimeout2 == AsyncTimeout.head) {
                    AsyncTimeout.class.notify();
                }
                b2 b2Var = b2.f124493a;
            }
        }

        @e
        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            f0.m(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                AsyncTimeout.class.wait(AsyncTimeout.IDLE_TIMEOUT_MILLIS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                f0.m(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                long j10 = jRemainingNanos / 1000000;
                AsyncTimeout.class.wait(j10, (int) (jRemainingNanos - (1000000 * j10)));
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            f0.m(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "Lkotlin/b2;", "run", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncTimeout asyncTimeoutAwaitTimeout$okio;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        asyncTimeoutAwaitTimeout$okio = AsyncTimeout.INSTANCE.awaitTimeout$okio();
                        if (asyncTimeoutAwaitTimeout$okio == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            return;
                        }
                        b2 b2Var = b2.f124493a;
                    }
                    if (asyncTimeoutAwaitTimeout$okio != null) {
                        asyncTimeoutAwaitTimeout$okio.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    @dl.d
    @r0
    public final IOException access$newTimeoutException(@e IOException cause) {
        return newTimeoutException(cause);
    }

    public final void enter() {
        if (!(!this.inQueue)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            INSTANCE.scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return INSTANCE.cancelScheduledTimeout(this);
    }

    @dl.d
    protected IOException newTimeoutException(@e IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(l5.a.f130839h0);
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @dl.d
    public final Sink sink(@dl.d final Sink sink) {
        f0.p(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        sink.close();
                        b2 b2Var = b2.f124493a;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e10) {
                        if (!asyncTimeout.exit()) {
                            throw e10;
                        }
                        throw asyncTimeout.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        sink.flush();
                        b2 b2Var = b2.f124493a;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e10) {
                        if (!asyncTimeout.exit()) {
                            throw e10;
                        }
                        throw asyncTimeout.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Sink
            @dl.d
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getTimeout() {
                return AsyncTimeout.this;
            }

            @dl.d
            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public void write(@dl.d Buffer source, long j10) throws IOException {
                f0.p(source, "source");
                Util.checkOffsetAndCount(source.size(), 0L, j10);
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    f0.m(segment);
                    while (j11 < 65536) {
                        j11 += (long) (segment.limit - segment.pos);
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        } else {
                            segment = segment.next;
                            f0.m(segment);
                        }
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink.write(source, j11);
                            b2 b2Var = b2.f124493a;
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            j10 -= j11;
                        } catch (IOException e10) {
                            if (!asyncTimeout.exit()) {
                                throw e10;
                            }
                            throw asyncTimeout.access$newTimeoutException(e10);
                        }
                    } catch (Throwable th2) {
                        asyncTimeout.exit();
                        throw th2;
                    }
                }
            }
        };
    }

    @dl.d
    public final Source source(@dl.d final Source source) {
        f0.p(source, "source");
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        source.close();
                        b2 b2Var = b2.f124493a;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e10) {
                        if (!asyncTimeout.exit()) {
                            throw e10;
                        }
                        throw asyncTimeout.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Source
            public long read(@dl.d Buffer sink, long byteCount) throws IOException {
                f0.p(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        long j10 = source.read(sink, byteCount);
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        return j10;
                    } catch (IOException e10) {
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Source
            @dl.d
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getTimeout() {
                return AsyncTimeout.this;
            }

            @dl.d
            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }
        };
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(@dl.d yh.a<? extends T> block) throws IOException {
        f0.p(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                c0.d(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                c0.c(1);
                return tInvoke;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            c0.d(1);
            exit();
            c0.c(1);
            throw th2;
        }
    }
}
