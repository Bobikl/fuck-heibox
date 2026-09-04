package okio;

import dl.d;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import l5.a;

/* JADX INFO: renamed from: okio.OutputStreamSink, reason: from toString */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "Lkotlin/b2;", "write", "flush", "close", "Lokio/Timeout;", a.f130839h0, "", "toString", "Ljava/io/OutputStream;", "out", "Ljava/io/OutputStream;", "Lokio/Timeout;", "<init>", "(Ljava/io/OutputStream;Lokio/Timeout;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class sink implements Sink {
    private final OutputStream out;
    private final Timeout timeout;

    public sink(@d OutputStream out, @d Timeout timeout) {
        f0.p(out, "out");
        f0.p(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // okio.Sink
    @d
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public Timeout getThis$0() {
        return this.timeout;
    }

    @d
    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // okio.Sink
    public void write(@d Buffer source, long j10) throws IOException {
        f0.p(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j10);
        while (j10 > 0) {
            this.timeout.throwIfReached();
            Segment segment = source.head;
            f0.m(segment);
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.setSize$okio(source.size() - j11);
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
