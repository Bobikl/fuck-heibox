package okio;

import dl.d;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import l5.a;

/* JADX INFO: renamed from: okio.InputStreamSource, reason: from toString */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lkotlin/b2;", "close", "Lokio/Timeout;", a.f130839h0, "", "toString", "Ljava/io/InputStream;", "input", "Ljava/io/InputStream;", "Lokio/Timeout;", "<init>", "(Ljava/io/InputStream;Lokio/Timeout;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class source implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public source(@d InputStream input, @d Timeout timeout) {
        f0.p(input, "input");
        f0.p(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // okio.Source
    public long read(@d Buffer sink, long byteCount) throws IOException {
        f0.p(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int i10 = this.input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i10 != -1) {
                segmentWritableSegment$okio.limit += i10;
                long j10 = i10;
                sink.setSize$okio(sink.size() + j10);
                return j10;
            }
            if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                return -1L;
            }
            sink.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
            return -1L;
        } catch (AssertionError e10) {
            if (Okio.isAndroidGetsocknameError(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // okio.Source
    @d
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public Timeout getThis$0() {
        return this.timeout;
    }

    @d
    public String toString() {
        return "source(" + this.input + ')';
    }
}
