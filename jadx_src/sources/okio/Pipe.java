package okio;

import dl.d;
import dl.e;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;
import qb.a;
import xh.h;
import yh.l;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b.\u0010/J&\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0082\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000f\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0010\u001a\u00020\u0004R\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\f8G¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010*\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lokio/Pipe;", "", "Lokio/Sink;", "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlin/t;", "block", "forward", "sink", "fold", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", "source", "cancel", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "", a.f138642e, "Z", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "setFoldedSink$okio", "(Lokio/Sink;)V", "Lokio/Source;", "", "maxBufferSize", "J", "getMaxBufferSize$okio", "()J", "<init>", "(J)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class Pipe {

    @d
    private final Buffer buffer = new Buffer();
    private boolean canceled;

    @e
    private Sink foldedSink;
    private final long maxBufferSize;

    @d
    private final Sink sink;
    private boolean sinkClosed;

    @d
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j10) {
        this.maxBufferSize = j10;
        if (j10 >= 1) {
            this.sink = new Sink() { // from class: okio.Pipe.sink.1
                private final Timeout timeout = new Timeout();

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    boolean hasDeadline;
                    synchronized (Pipe.this.getBuffer()) {
                        if (Pipe.this.getSinkClosed()) {
                            return;
                        }
                        Sink foldedSink = Pipe.this.getFoldedSink();
                        if (foldedSink == null) {
                            if (Pipe.this.getSourceClosed() && Pipe.this.getBuffer().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            Pipe.this.setSinkClosed$okio(true);
                            Buffer buffer = Pipe.this.getBuffer();
                            if (buffer == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            buffer.notifyAll();
                            foldedSink = null;
                        }
                        b2 b2Var = b2.f124493a;
                        if (foldedSink != null) {
                            Pipe pipe = Pipe.this;
                            Timeout timeout = foldedSink.getTimeout();
                            Timeout timeout2 = pipe.sink().getTimeout();
                            long timeoutNanos = timeout.getTimeoutNanos();
                            timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                            if (!timeout.getHasDeadline()) {
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                }
                                try {
                                    foldedSink.close();
                                    if (hasDeadline) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.getHasDeadline()) {
                                        timeout.clearDeadline();
                                    }
                                }
                            }
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink.close();
                            } finally {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                    }
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() {
                    Sink foldedSink;
                    boolean hasDeadline;
                    synchronized (Pipe.this.getBuffer()) {
                        if (!(!Pipe.this.getSinkClosed())) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (Pipe.this.getCanceled()) {
                            throw new IOException(a.f138642e);
                        }
                        foldedSink = Pipe.this.getFoldedSink();
                        if (foldedSink == null) {
                            if (Pipe.this.getSourceClosed() && Pipe.this.getBuffer().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            foldedSink = null;
                        }
                        b2 b2Var = b2.f124493a;
                    }
                    if (foldedSink != null) {
                        Pipe pipe = Pipe.this;
                        Timeout timeout = foldedSink.getTimeout();
                        Timeout timeout2 = pipe.sink().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                        if (!timeout.getHasDeadline()) {
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink.flush();
                                if (hasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink.flush();
                        } finally {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                }

                @Override // okio.Sink
                @d
                /* JADX INFO: renamed from: timeout, reason: from getter */
                public Timeout getTimeout() {
                    return this.timeout;
                }

                @Override // okio.Sink
                public void write(@d Buffer source, long j11) {
                    Sink foldedSink;
                    boolean hasDeadline;
                    f0.p(source, "source");
                    synchronized (Pipe.this.getBuffer()) {
                        if (!(!Pipe.this.getSinkClosed())) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (Pipe.this.getCanceled()) {
                            throw new IOException(a.f138642e);
                        }
                        while (true) {
                            if (j11 <= 0) {
                                foldedSink = null;
                                break;
                            }
                            foldedSink = Pipe.this.getFoldedSink();
                            if (foldedSink != null) {
                                break;
                            }
                            if (Pipe.this.getSourceClosed()) {
                                throw new IOException("source is closed");
                            }
                            long maxBufferSize = Pipe.this.getMaxBufferSize() - Pipe.this.getBuffer().size();
                            if (maxBufferSize == 0) {
                                this.timeout.waitUntilNotified(Pipe.this.getBuffer());
                                if (Pipe.this.getCanceled()) {
                                    throw new IOException(a.f138642e);
                                }
                            } else {
                                long jMin = Math.min(maxBufferSize, j11);
                                Pipe.this.getBuffer().write(source, jMin);
                                j11 -= jMin;
                                Buffer buffer = Pipe.this.getBuffer();
                                if (buffer == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                buffer.notifyAll();
                            }
                        }
                        b2 b2Var = b2.f124493a;
                    }
                    if (foldedSink != null) {
                        Pipe pipe = Pipe.this;
                        Timeout timeout = foldedSink.getTimeout();
                        Timeout timeout2 = pipe.sink().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                        if (!timeout.getHasDeadline()) {
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink.write(source, j11);
                                if (hasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink.write(source, j11);
                        } finally {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                }
            };
            this.source = new Source() { // from class: okio.Pipe.source.1
                private final Timeout timeout = new Timeout();

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    synchronized (Pipe.this.getBuffer()) {
                        Pipe.this.setSourceClosed$okio(true);
                        Buffer buffer = Pipe.this.getBuffer();
                        if (buffer == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                        buffer.notifyAll();
                        b2 b2Var = b2.f124493a;
                    }
                }

                @Override // okio.Source
                public long read(@d Buffer sink, long byteCount) {
                    f0.p(sink, "sink");
                    synchronized (Pipe.this.getBuffer()) {
                        if (!(!Pipe.this.getSourceClosed())) {
                            throw new IllegalStateException("closed".toString());
                        }
                        if (Pipe.this.getCanceled()) {
                            throw new IOException(a.f138642e);
                        }
                        while (Pipe.this.getBuffer().size() == 0) {
                            if (Pipe.this.getSinkClosed()) {
                                return -1L;
                            }
                            this.timeout.waitUntilNotified(Pipe.this.getBuffer());
                            if (Pipe.this.getCanceled()) {
                                throw new IOException(a.f138642e);
                            }
                        }
                        long j11 = Pipe.this.getBuffer().read(sink, byteCount);
                        Buffer buffer = Pipe.this.getBuffer();
                        if (buffer == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                        buffer.notifyAll();
                        return j11;
                    }
                }

                @Override // okio.Source
                @d
                /* JADX INFO: renamed from: timeout, reason: from getter */
                public Timeout getTimeout() {
                    return this.timeout;
                }
            };
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j10).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forward(Sink sink, l<? super Sink, b2> lVar) {
        Timeout timeout = sink.getTimeout();
        Timeout timeout2 = sink().getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
        if (!timeout.getHasDeadline()) {
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                lVar.invoke(sink);
                c0.d(1);
                return;
            } finally {
                c0.d(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.clearDeadline();
                }
                c0.c(1);
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.getHasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            lVar.invoke(sink);
            c0.d(1);
        } finally {
            c0.d(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            c0.c(1);
        }
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "sink", imports = {}))
    @h(name = "-deprecated_sink")
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name and from getter */
    public final Sink getSink() {
        return this.sink;
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "source", imports = {}))
    @h(name = "-deprecated_source")
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name and from getter */
    public final Source getSource() {
        return this.source;
    }

    public final void cancel() {
        synchronized (this.buffer) {
            this.canceled = true;
            this.buffer.clear();
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            buffer.notifyAll();
            b2 b2Var = b2.f124493a;
        }
    }

    public final void fold(@d Sink sink) throws IOException {
        boolean z10;
        Buffer buffer;
        f0.p(sink, "sink");
        while (true) {
            synchronized (this.buffer) {
                if (!(this.foldedSink == null)) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException(a.f138642e);
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                }
                z10 = this.sinkClosed;
                buffer = new Buffer();
                Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                Buffer buffer3 = this.buffer;
                if (buffer3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                buffer3.notifyAll();
                b2 b2Var = b2.f124493a;
            }
            try {
                sink.write(buffer, buffer.size());
                if (z10) {
                    sink.close();
                } else {
                    sink.flush();
                }
            } catch (Throwable th2) {
                synchronized (this.buffer) {
                    this.sourceClosed = true;
                    Buffer buffer4 = this.buffer;
                    if (buffer4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    buffer4.notifyAll();
                    b2 b2Var2 = b2.f124493a;
                    throw th2;
                }
            }
        }
    }

    @d
    /* JADX INFO: renamed from: getBuffer$okio, reason: from getter */
    public final Buffer getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: getCanceled$okio, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    @e
    /* JADX INFO: renamed from: getFoldedSink$okio, reason: from getter */
    public final Sink getFoldedSink() {
        return this.foldedSink;
    }

    /* JADX INFO: renamed from: getMaxBufferSize$okio, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* JADX INFO: renamed from: getSinkClosed$okio, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    /* JADX INFO: renamed from: getSourceClosed$okio, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z10) {
        this.canceled = z10;
    }

    public final void setFoldedSink$okio(@e Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z10) {
        this.sinkClosed = z10;
    }

    public final void setSourceClosed$okio(boolean z10) {
        this.sourceClosed = z10;
    }

    @d
    @h(name = "sink")
    public final Sink sink() {
        return this.sink;
    }

    @d
    @h(name = "source")
    public final Source source() {
        return this.source;
    }
}
