package okio;

import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import l5.a;

/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", a.f130839h0, "Lkotlin/b2;", "close", "buffer", "Lokio/Buffer;", "Lokio/Segment;", "expectedSegment", "Lokio/Segment;", "", "expectedPos", "I", "", "closed", "Z", "pos", "J", "Lokio/BufferedSource;", "upstream", "Lokio/BufferedSource;", "<init>", "(Lokio/BufferedSource;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    public PeekSource(@d BufferedSource upstream) {
        f0.p(upstream, "upstream");
        this.upstream = upstream;
        Buffer buffer = upstream.getBuffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // okio.Source
    public long read(@d Buffer sink, long byteCount) {
        Segment segment;
        f0.p(sink, "sink");
        boolean z10 = false;
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        Segment segment2 = this.expectedSegment;
        if (segment2 == null) {
            z10 = true;
        } else {
            Segment segment3 = this.buffer.head;
            if (segment2 == segment3) {
                int i10 = this.expectedPos;
                f0.m(segment3);
                if (i10 == segment3.pos) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (!this.upstream.request(this.pos + 1)) {
            return -1L;
        }
        if (this.expectedSegment == null && (segment = this.buffer.head) != null) {
            this.expectedSegment = segment;
            f0.m(segment);
            this.expectedPos = segment.pos;
        }
        long jMin = Math.min(byteCount, this.buffer.size() - this.pos);
        this.buffer.copyTo(sink, this.pos, jMin);
        this.pos += jMin;
        return jMin;
    }

    @Override // okio.Source
    @d
    /* JADX INFO: renamed from: timeout */
    public Timeout getThis$0() {
        return this.upstream.getThis$0();
    }
}
