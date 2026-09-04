package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.j;
import dl.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import xh.i;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\t\b\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J$\u0010\b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lokio/Throttler;", "", "", "nanosToBytes", "bytesToNanos", "nanosToWait", "Lkotlin/b2;", "waitNanos", "bytesPerSecond", "waitByteCount", "maxByteCount", "byteCount", "take$okio", "(J)J", "take", "now", "byteCountOrWaitNanos$okio", "(JJ)J", "byteCountOrWaitNanos", "Lokio/Source;", "source", "Lokio/Sink;", "sink", "J", "allocatedUntil", "<init>", "(J)V", "()V", "okio"}, k = 1, mv = {1, 4, 0})
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler() {
        this(System.nanoTime());
    }

    public Throttler(long j10) {
        this.allocatedUntil = j10;
        this.waitByteCount = 8192L;
        this.maxByteCount = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = throttler.waitByteCount;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            j12 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j10, j13, j12);
    }

    private final long bytesToNanos(long j10) {
        return (j10 * j.f46409j) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j10) {
        return (j10 * this.bytesPerSecond) / j.f46409j;
    }

    private final void waitNanos(long j10) throws InterruptedException {
        long j11 = j10 / 1000000;
        wait(j11, (int) (j10 - (1000000 * j11)));
    }

    public final long byteCountOrWaitNanos$okio(long now, long byteCount) {
        if (this.bytesPerSecond == 0) {
            return byteCount;
        }
        long jMax = Math.max(this.allocatedUntil - now, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= byteCount) {
            this.allocatedUntil = now + jMax + bytesToNanos(byteCount);
            return byteCount;
        }
        long j10 = this.waitByteCount;
        if (jNanosToBytes >= j10) {
            this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
            return jNanosToBytes;
        }
        long jMin = Math.min(j10, byteCount);
        long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
        if (jBytesToNanos != 0) {
            return -jBytesToNanos;
        }
        this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
        return jMin;
    }

    @i
    public final void bytesPerSecond(long j10) {
        bytesPerSecond$default(this, j10, 0L, 0L, 6, null);
    }

    @i
    public final void bytesPerSecond(long j10, long j11) {
        bytesPerSecond$default(this, j10, j11, 0L, 4, null);
    }

    @i
    public final void bytesPerSecond(long j10, long j11, long j12) {
        synchronized (this) {
            try {
                if (!(j10 >= 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(j11 > 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(j12 >= j11)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                this.bytesPerSecond = j10;
                this.waitByteCount = j11;
                this.maxByteCount = j12;
                notifyAll();
                b2 b2Var = b2.f124493a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @d
    public final Sink sink(@d final Sink sink) {
        f0.p(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(@d Buffer source, long j10) throws IOException {
                f0.p(source, "source");
                while (j10 > 0) {
                    try {
                        long jTake$okio = Throttler.this.take$okio(j10);
                        super.write(source, jTake$okio);
                        j10 -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @d
    public final Source source(@d final Source source) {
        f0.p(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler.source.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(@d Buffer sink, long byteCount) throws InterruptedIOException {
                f0.p(sink, "sink");
                try {
                    return super.read(sink, Throttler.this.take$okio(byteCount));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long byteCount) {
        long jByteCountOrWaitNanos$okio;
        if (!(byteCount > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            while (true) {
                jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), byteCount);
                if (jByteCountOrWaitNanos$okio < 0) {
                    waitNanos(-jByteCountOrWaitNanos$okio);
                }
            }
        }
        return jByteCountOrWaitNanos$okio;
    }
}
