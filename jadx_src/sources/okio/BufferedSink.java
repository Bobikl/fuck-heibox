package okio;

import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import dl.d;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.k;
import kotlin.s0;

/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\u0007\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&J \u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bH&J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H&J(\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\bH&J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\bH&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\bH&J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\bH&J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eH&J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eH&J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eH&J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eH&J\b\u0010(\u001a\u00020'H&J\b\u0010)\u001a\u00020\u0000H&J\b\u0010*\u001a\u00020\u0000H&J\b\u0010,\u001a\u00020+H&R\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/Buffer;", "buffer", "Lokio/ByteString;", "byteString", "write", "", w.c.R, "byteCount", "", "source", "Lokio/Source;", "", "writeAll", "", w.b.f17895e, "writeUtf8", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "codePoint", "writeUtf8CodePoint", "Ljava/nio/charset/Charset;", "charset", "writeString", "b", "writeByte", ak.aB, "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "Lkotlin/b2;", "flush", "emit", "emitCompleteSegments", "Ljava/io/OutputStream;", "outputStream", "getBuffer", "()Lokio/Buffer;", "okio"}, k = 1, mv = {1, 4, 0})
public interface BufferedSink extends Sink, WritableByteChannel {
    @d
    @k(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @s0(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: buffer */
    Buffer getBufferField();

    @d
    BufferedSink emit() throws IOException;

    @d
    BufferedSink emitCompleteSegments() throws IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws IOException;

    @d
    Buffer getBuffer();

    @d
    OutputStream outputStream();

    @d
    BufferedSink write(@d ByteString byteString) throws IOException;

    @d
    BufferedSink write(@d ByteString byteString, int offset, int byteCount) throws IOException;

    @d
    BufferedSink write(@d Source source, long byteCount) throws IOException;

    @d
    BufferedSink write(@d byte[] source) throws IOException;

    @d
    BufferedSink write(@d byte[] source, int offset, int byteCount) throws IOException;

    long writeAll(@d Source source) throws IOException;

    @d
    BufferedSink writeByte(int b10) throws IOException;

    @d
    BufferedSink writeDecimalLong(long v10) throws IOException;

    @d
    BufferedSink writeHexadecimalUnsignedLong(long v10) throws IOException;

    @d
    BufferedSink writeInt(int i10) throws IOException;

    @d
    BufferedSink writeIntLe(int i10) throws IOException;

    @d
    BufferedSink writeLong(long v10) throws IOException;

    @d
    BufferedSink writeLongLe(long v10) throws IOException;

    @d
    BufferedSink writeShort(int s10) throws IOException;

    @d
    BufferedSink writeShortLe(int s10) throws IOException;

    @d
    BufferedSink writeString(@d String string, int beginIndex, int endIndex, @d Charset charset) throws IOException;

    @d
    BufferedSink writeString(@d String string, @d Charset charset) throws IOException;

    @d
    BufferedSink writeUtf8(@d String string) throws IOException;

    @d
    BufferedSink writeUtf8(@d String string, int beginIndex, int endIndex) throws IOException;

    @d
    BufferedSink writeUtf8CodePoint(int codePoint) throws IOException;
}
