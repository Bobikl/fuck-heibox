package okio;

import androidx.constraintlayout.core.motion.utils.w;
import com.max.hblogistics.AddressListActivity;
import com.tekartik.sqflite.b;
import dl.d;
import dl.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.k;
import kotlin.s0;
import org.apache.tools.ant.taskdefs.optional.vss.g;

/* JADX INFO: compiled from: BufferedSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH&J\b\u0010\u001f\u001a\u00020\u001eH&J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001eH&J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001eH&J \u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010 \u001a\u00020$H&J\b\u0010'\u001a\u00020&H&J\u0010\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H&J\n\u0010(\u001a\u0004\u0018\u00010&H&J\b\u0010)\u001a\u00020&H&J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0007H&J\b\u0010+\u001a\u00020\u0011H&J\u0010\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020,H&J\u0018\u0010.\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H&J\u0010\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\fH&J\u0018\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0007H&J \u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H&J\u0010\u00100\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0019H&J\u0018\u00100\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0007H&J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0019H&J\u0018\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0007H&J\u0018\u00106\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0019H&J(\u00106\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\b\u00108\u001a\u00020\u0000H&J\b\u0010:\u001a\u000209H&R\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "buffer", "", "exhausted", "", "byteCount", "Lkotlin/b2;", "require", "request", "", "readByte", "", "readShort", "readShortLe", "", "readInt", "readIntLe", "readLong", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", g.L2, "Lokio/ByteString;", "readByteString", "Lokio/Options;", b.f98586e, AddressListActivity.N, "", "readByteArray", "sink", "read", "readFully", w.c.R, "Lokio/Sink;", "readAll", "", "readUtf8", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "Ljava/nio/charset/Charset;", "charset", "readString", "b", "indexOf", "fromIndex", "toIndex", "bytes", "targetBytes", "indexOfElement", "rangeEquals", "bytesOffset", "peek", "Ljava/io/InputStream;", "inputStream", "getBuffer", "()Lokio/Buffer;", "okio"}, k = 1, mv = {1, 4, 0})
public interface BufferedSource extends Source, ReadableByteChannel {
    @d
    @k(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @s0(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: buffer */
    Buffer getBufferField();

    boolean exhausted() throws IOException;

    @d
    Buffer getBuffer();

    long indexOf(byte b10) throws IOException;

    long indexOf(byte b10, long fromIndex) throws IOException;

    long indexOf(byte b10, long fromIndex, long toIndex) throws IOException;

    long indexOf(@d ByteString bytes) throws IOException;

    long indexOf(@d ByteString bytes, long fromIndex) throws IOException;

    long indexOfElement(@d ByteString targetBytes) throws IOException;

    long indexOfElement(@d ByteString targetBytes, long fromIndex) throws IOException;

    @d
    InputStream inputStream();

    @d
    BufferedSource peek();

    boolean rangeEquals(long offset, @d ByteString bytes) throws IOException;

    boolean rangeEquals(long offset, @d ByteString bytes, int bytesOffset, int byteCount) throws IOException;

    int read(@d byte[] sink) throws IOException;

    int read(@d byte[] sink, int offset, int byteCount) throws IOException;

    long readAll(@d Sink sink) throws IOException;

    byte readByte() throws IOException;

    @d
    byte[] readByteArray() throws IOException;

    @d
    byte[] readByteArray(long byteCount) throws IOException;

    @d
    ByteString readByteString() throws IOException;

    @d
    ByteString readByteString(long byteCount) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(@d Buffer buffer, long j10) throws IOException;

    void readFully(@d byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    @d
    String readString(long byteCount, @d Charset charset) throws IOException;

    @d
    String readString(@d Charset charset) throws IOException;

    @d
    String readUtf8() throws IOException;

    @d
    String readUtf8(long byteCount) throws IOException;

    int readUtf8CodePoint() throws IOException;

    @e
    String readUtf8Line() throws IOException;

    @d
    String readUtf8LineStrict() throws IOException;

    @d
    String readUtf8LineStrict(long limit) throws IOException;

    boolean request(long byteCount) throws IOException;

    void require(long j10) throws IOException;

    int select(@d Options options) throws IOException;

    void skip(long j10) throws IOException;
}
