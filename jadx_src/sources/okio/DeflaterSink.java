package okio;

import dl.d;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import l5.a;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "", "syncFlush", "Lkotlin/b2;", "deflate", "Lokio/Buffer;", "source", "", "byteCount", "write", "flush", "finishDeflate$okio", "()V", "finishDeflate", "close", "Lokio/Timeout;", a.f130839h0, "", "toString", "closed", "Z", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSink;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "<init>", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(@d BufferedSink sink, @d Deflater deflater) {
        f0.p(sink, "sink");
        f0.p(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(@d Sink sink, @d Deflater deflater) {
        this(Okio.buffer(sink), deflater);
        f0.p(sink, "sink");
        f0.p(deflater, "deflater");
    }

    @IgnoreJRERequirement
    private final void deflate(boolean z10) throws IOException {
        Segment segmentWritableSegment$okio;
        int iDeflate;
        Buffer buffer = this.sink.getBuffer();
        while (true) {
            segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            if (z10) {
                Deflater deflater = this.deflater;
                byte[] bArr = segmentWritableSegment$okio.data;
                int i10 = segmentWritableSegment$okio.limit;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = segmentWritableSegment$okio.data;
                int i11 = segmentWritableSegment$okio.limit;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                segmentWritableSegment$okio.limit += iDeflate;
                buffer.setSize$okio(buffer.size() + ((long) iDeflate));
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        Throwable th2 = null;
        try {
            finishDeflate$okio();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.deflater.end();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        this.closed = true;
        if (th2 != null) {
            throw th2;
        }
    }

    public final void finishDeflate$okio() throws IOException {
        this.deflater.finish();
        deflate(false);
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    @Override // okio.Sink
    @d
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @d
    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // okio.Sink
    public void write(@d Buffer source, long j10) throws IOException {
        f0.p(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j10);
        while (j10 > 0) {
            Segment segment = source.head;
            f0.m(segment);
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, iMin);
            deflate(false);
            long j11 = iMin;
            source.setSize$okio(source.size() - j11);
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j10 -= j11;
        }
    }
}
