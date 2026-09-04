package okio.internal;

import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import dl.d;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import okio.buffer;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0006\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0080\b\u001a%\u0010\u0006\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0080\b\u001a%\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u0006\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0013H\u0080\b\u001a%\u0010\u0006\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0006\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010 \u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\"\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0080\b\u001a\r\u0010#\u001a\u00020\t*\u00020\u0000H\u0080\b\u001a\r\u0010$\u001a\u00020\t*\u00020\u0000H\u0080\b\u001a\r\u0010%\u001a\u00020\u0005*\u00020\u0000H\u0080\b\u001a\r\u0010&\u001a\u00020\u0005*\u00020\u0000H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0000H\u0080\b\u001a\r\u0010)\u001a\u00020\f*\u00020\u0000H\u0080\b¨\u0006*"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/Buffer;", "source", "", "byteCount", "Lkotlin/b2;", "commonWrite", "Lokio/ByteString;", "byteString", "Lokio/BufferedSink;", "", w.c.R, "", w.b.f17895e, "commonWriteUtf8", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "codePoint", "commonWriteUtf8CodePoint", "", "Lokio/Source;", "commonWriteAll", "b", "commonWriteByte", ak.aB, "commonWriteShort", "commonWriteShortLe", "i", "commonWriteInt", "commonWriteIntLe", "v", "commonWriteLong", "commonWriteLongLe", "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "commonEmitCompleteSegments", "commonEmit", "commonFlush", "commonClose", "Lokio/Timeout;", "commonTimeout", "commonToString", "okio"}, k = 2, mv = {1, 4, 0})
public final class RealBufferedSinkKt {
    public static final void commonClose(@d buffer commonClose) throws Throwable {
        f0.p(commonClose, "$this$commonClose");
        if (commonClose.closed) {
            return;
        }
        Throwable th2 = null;
        try {
            if (commonClose.bufferField.size() > 0) {
                Sink sink = commonClose.sink;
                Buffer buffer = commonClose.bufferField;
                sink.write(buffer, buffer.size());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            commonClose.sink.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        commonClose.closed = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @d
    public static final BufferedSink commonEmit(@d buffer commonEmit) throws IOException {
        f0.p(commonEmit, "$this$commonEmit");
        if (!(!commonEmit.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = commonEmit.bufferField.size();
        if (size > 0) {
            commonEmit.sink.write(commonEmit.bufferField, size);
        }
        return commonEmit;
    }

    @d
    public static final BufferedSink commonEmitCompleteSegments(@d buffer commonEmitCompleteSegments) throws IOException {
        f0.p(commonEmitCompleteSegments, "$this$commonEmitCompleteSegments");
        if (!(!commonEmitCompleteSegments.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = commonEmitCompleteSegments.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            commonEmitCompleteSegments.sink.write(commonEmitCompleteSegments.bufferField, jCompleteSegmentByteCount);
        }
        return commonEmitCompleteSegments;
    }

    public static final void commonFlush(@d buffer commonFlush) throws IOException {
        f0.p(commonFlush, "$this$commonFlush");
        if (!(!commonFlush.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (commonFlush.bufferField.size() > 0) {
            Sink sink = commonFlush.sink;
            Buffer buffer = commonFlush.bufferField;
            sink.write(buffer, buffer.size());
        }
        commonFlush.sink.flush();
    }

    @d
    public static final Timeout commonTimeout(@d buffer commonTimeout) {
        f0.p(commonTimeout, "$this$commonTimeout");
        return commonTimeout.sink.getTimeout();
    }

    @d
    public static final String commonToString(@d buffer commonToString) {
        f0.p(commonToString, "$this$commonToString");
        return "buffer(" + commonToString.sink + ')';
    }

    @d
    public static final BufferedSink commonWrite(@d buffer commonWrite, @d ByteString byteString) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(byteString, "byteString");
        if (!(!commonWrite.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWrite.bufferField.write(byteString);
        return commonWrite.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWrite(@d buffer commonWrite, @d ByteString byteString, int i10, int i11) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(byteString, "byteString");
        if (!(!commonWrite.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWrite.bufferField.write(byteString, i10, i11);
        return commonWrite.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWrite(@d buffer commonWrite, @d Source source, long j10) throws IOException {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        while (j10 > 0) {
            long j11 = source.read(commonWrite.bufferField, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
            commonWrite.emitCompleteSegments();
        }
        return commonWrite;
    }

    @d
    public static final BufferedSink commonWrite(@d buffer commonWrite, @d byte[] source) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        if (!(!commonWrite.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWrite.bufferField.write(source);
        return commonWrite.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWrite(@d buffer commonWrite, @d byte[] source, int i10, int i11) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        if (!(!commonWrite.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWrite.bufferField.write(source, i10, i11);
        return commonWrite.emitCompleteSegments();
    }

    public static final void commonWrite(@d buffer commonWrite, @d Buffer source, long j10) throws IOException {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        if (!(!commonWrite.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWrite.bufferField.write(source, j10);
        commonWrite.emitCompleteSegments();
    }

    public static final long commonWriteAll(@d buffer commonWriteAll, @d Source source) throws IOException {
        f0.p(commonWriteAll, "$this$commonWriteAll");
        f0.p(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(commonWriteAll.bufferField, 8192);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            commonWriteAll.emitCompleteSegments();
        }
    }

    @d
    public static final BufferedSink commonWriteByte(@d buffer commonWriteByte, int i10) {
        f0.p(commonWriteByte, "$this$commonWriteByte");
        if (!(!commonWriteByte.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteByte.bufferField.writeByte(i10);
        return commonWriteByte.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteDecimalLong(@d buffer commonWriteDecimalLong, long j10) {
        f0.p(commonWriteDecimalLong, "$this$commonWriteDecimalLong");
        if (!(!commonWriteDecimalLong.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteDecimalLong.bufferField.writeDecimalLong(j10);
        return commonWriteDecimalLong.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@d buffer commonWriteHexadecimalUnsignedLong, long j10) {
        f0.p(commonWriteHexadecimalUnsignedLong, "$this$commonWriteHexadecimalUnsignedLong");
        if (!(!commonWriteHexadecimalUnsignedLong.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteHexadecimalUnsignedLong.bufferField.writeHexadecimalUnsignedLong(j10);
        return commonWriteHexadecimalUnsignedLong.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteInt(@d buffer commonWriteInt, int i10) {
        f0.p(commonWriteInt, "$this$commonWriteInt");
        if (!(!commonWriteInt.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteInt.bufferField.writeInt(i10);
        return commonWriteInt.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteIntLe(@d buffer commonWriteIntLe, int i10) {
        f0.p(commonWriteIntLe, "$this$commonWriteIntLe");
        if (!(!commonWriteIntLe.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteIntLe.bufferField.writeIntLe(i10);
        return commonWriteIntLe.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteLong(@d buffer commonWriteLong, long j10) {
        f0.p(commonWriteLong, "$this$commonWriteLong");
        if (!(!commonWriteLong.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteLong.bufferField.writeLong(j10);
        return commonWriteLong.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteLongLe(@d buffer commonWriteLongLe, long j10) {
        f0.p(commonWriteLongLe, "$this$commonWriteLongLe");
        if (!(!commonWriteLongLe.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteLongLe.bufferField.writeLongLe(j10);
        return commonWriteLongLe.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteShort(@d buffer commonWriteShort, int i10) {
        f0.p(commonWriteShort, "$this$commonWriteShort");
        if (!(!commonWriteShort.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteShort.bufferField.writeShort(i10);
        return commonWriteShort.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteShortLe(@d buffer commonWriteShortLe, int i10) {
        f0.p(commonWriteShortLe, "$this$commonWriteShortLe");
        if (!(!commonWriteShortLe.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteShortLe.bufferField.writeShortLe(i10);
        return commonWriteShortLe.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteUtf8(@d buffer commonWriteUtf8, @d String string) {
        f0.p(commonWriteUtf8, "$this$commonWriteUtf8");
        f0.p(string, "string");
        if (!(!commonWriteUtf8.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteUtf8.bufferField.writeUtf8(string);
        return commonWriteUtf8.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteUtf8(@d buffer commonWriteUtf8, @d String string, int i10, int i11) {
        f0.p(commonWriteUtf8, "$this$commonWriteUtf8");
        f0.p(string, "string");
        if (!(!commonWriteUtf8.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteUtf8.bufferField.writeUtf8(string, i10, i11);
        return commonWriteUtf8.emitCompleteSegments();
    }

    @d
    public static final BufferedSink commonWriteUtf8CodePoint(@d buffer commonWriteUtf8CodePoint, int i10) {
        f0.p(commonWriteUtf8CodePoint, "$this$commonWriteUtf8CodePoint");
        if (!(!commonWriteUtf8CodePoint.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteUtf8CodePoint.bufferField.writeUtf8CodePoint(i10);
        return commonWriteUtf8CodePoint.emitCompleteSegments();
    }
}
