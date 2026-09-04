package okio;

import androidx.constraintlayout.core.motion.utils.w;
import com.max.hblogistics.AddressListActivity;
import com.tekartik.sqflite.b;
import dl.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import l5.a;
import okio.internal.BufferKt;
import org.apache.tools.ant.taskdefs.optional.vss.g;
import xh.e;

/* JADX INFO: renamed from: okio.RealBufferedSource, reason: from toString */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0015H\u0016J \u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0016J\u0010\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0019H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\rH\u0016J\u0018\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0005H\u0016J \u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J\u0018\u00100\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0018\u00106\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J(\u00106\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0016J\b\u00108\u001a\u00020\u0001H\u0016J\b\u0010:\u001a\u000209H\u0016J\b\u0010;\u001a\u00020\bH\u0016J\b\u0010<\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020=H\u0016J\b\u0010?\u001a\u00020\u001cH\u0016R\u0014\u0010@\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010\u0003\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "Lokio/Buffer;", "buffer", "sink", "", "byteCount", "read", "", "exhausted", "Lkotlin/b2;", "require", "request", "", "readByte", "Lokio/ByteString;", "readByteString", "Lokio/Options;", b.f98586e, "", AddressListActivity.N, "", "readByteArray", "readFully", w.c.R, "Ljava/nio/ByteBuffer;", "Lokio/Sink;", "readAll", "", "readUtf8", "Ljava/nio/charset/Charset;", "charset", "readString", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readShort", "readShortLe", "readInt", "readIntLe", "readLong", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", g.L2, "b", "indexOf", "fromIndex", "toIndex", "bytes", "targetBytes", "indexOfElement", "rangeEquals", "bytesOffset", "peek", "Ljava/io/InputStream;", "inputStream", "isOpen", "close", "Lokio/Timeout;", a.f130839h0, "toString", "bufferField", "Lokio/Buffer;", "closed", "Z", "Lokio/Source;", "source", "Lokio/Source;", "getBuffer", "()Lokio/Buffer;", "getBuffer$annotations", "()V", "<init>", "(Lokio/Source;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class buffer implements BufferedSource {

    @d
    @e
    public final Buffer bufferField;

    @e
    public boolean closed;

    @d
    @e
    public final Source source;

    public buffer(@d Source source) {
        f0.p(source, "source");
        this.source = source;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @d
    /* JADX INFO: renamed from: buffer, reason: from getter */
    public Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (!this.closed) {
            return this.bufferField.exhausted() && this.source.read(this.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @d
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long fromIndex) {
        return indexOf(b10, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long fromIndex, long toIndex) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= fromIndex && toIndex >= fromIndex)) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        while (fromIndex < toIndex) {
            long jIndexOf = this.bufferField.indexOf(b10, fromIndex, toIndex);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (size >= toIndex || this.source.read(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOf(@d ByteString bytes) {
        f0.p(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(@d ByteString bytes, long fromIndex) throws IOException {
        f0.p(bytes, "bytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = this.bufferField.indexOf(bytes, fromIndex);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - ((long) bytes.size())) + 1);
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@d ByteString targetBytes) {
        f0.p(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@d ByteString targetBytes, long fromIndex) {
        f0.p(targetBytes, "targetBytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = this.bufferField.indexOfElement(targetBytes, fromIndex);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // okio.BufferedSource
    @d
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource.inputStream.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                buffer bufferVar = buffer.this;
                if (bufferVar.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(bufferVar.bufferField.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                buffer.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                buffer bufferVar = buffer.this;
                if (bufferVar.closed) {
                    throw new IOException("closed");
                }
                if (bufferVar.bufferField.size() == 0) {
                    buffer bufferVar2 = buffer.this;
                    if (bufferVar2.source.read(bufferVar2.bufferField, 8192) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(@d byte[] data, int offset, int byteCount) throws IOException {
                f0.p(data, "data");
                if (buffer.this.closed) {
                    throw new IOException("closed");
                }
                Util.checkOffsetAndCount(data.length, offset, byteCount);
                if (buffer.this.bufferField.size() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, 8192) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.read(data, offset, byteCount);
            }

            @d
            public String toString() {
                return buffer.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSource
    @d
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @d ByteString bytes) {
        f0.p(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @d ByteString bytes, int bytesOffset, int byteCount) {
        f0.p(bytes, "bytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (offset >= 0 && bytesOffset >= 0 && byteCount >= 0 && bytes.size() - bytesOffset >= byteCount) {
            for (int i10 = 0; i10 < byteCount; i10++) {
                long j10 = ((long) i10) + offset;
                if (request(1 + j10) && this.bufferField.getByte(j10) == bytes.getByte(bytesOffset + i10)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@d ByteBuffer sink) {
        f0.p(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // okio.BufferedSource
    public int read(@d byte[] sink) {
        f0.p(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(@d byte[] sink, int offset, int byteCount) {
        f0.p(sink, "sink");
        long j10 = byteCount;
        Util.checkOffsetAndCount(sink.length, offset, j10);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, offset, (int) Math.min(j10, this.bufferField.size()));
    }

    @Override // okio.Source
    public long read(@d Buffer sink, long byteCount) {
        f0.p(sink, "sink");
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
            return -1L;
        }
        return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.size()));
    }

    @Override // okio.BufferedSource
    public long readAll(@d Sink sink) throws IOException {
        f0.p(sink, "sink");
        long j10 = 0;
        while (this.source.read(this.bufferField, 8192) != -1) {
            long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(this.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j10;
        }
        long size = j10 + this.bufferField.size();
        Buffer buffer = this.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    @d
    public byte[] readByteArray() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    @d
    public byte[] readByteArray(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteArray(byteCount);
    }

    @Override // okio.BufferedSource
    @d
    public ByteString readByteString() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // okio.BufferedSource
    @d
    public ByteString readByteString(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteString(byteCount);
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte b10 = this.bufferField.getByte(j10);
            if ((b10 < ((byte) 48) || b10 > ((byte) 57)) && !(j10 == 0 && b10 == ((byte) 45))) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9] or '-' character but was 0x");
                String string = Integer.toString(b10, kotlin.text.b.a(kotlin.text.b.a(16)));
                f0.o(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.bufferField.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public void readFully(@d Buffer sink, long j10) throws IOException {
        f0.p(sink, "sink");
        try {
            require(j10);
            this.bufferField.readFully(sink, j10);
        } catch (EOFException e10) {
            sink.writeAll(this.bufferField);
            throw e10;
        }
    }

    @Override // okio.BufferedSource
    public void readFully(@d byte[] sink) throws EOFException {
        f0.p(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int i11 = buffer.read(sink, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte b10 = this.bufferField.getByte(i10);
            if ((b10 < ((byte) 48) || b10 > ((byte) 57)) && ((b10 < ((byte) 97) || b10 > ((byte) 102)) && (b10 < ((byte) 65) || b10 > ((byte) 70)))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(b10, kotlin.text.b.a(kotlin.text.b.a(16)));
                f0.o(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    @d
    public String readString(long byteCount, @d Charset charset) throws EOFException {
        f0.p(charset, "charset");
        require(byteCount);
        return this.bufferField.readString(byteCount, charset);
    }

    @Override // okio.BufferedSource
    @d
    public String readString(@d Charset charset) throws IOException {
        f0.p(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    @d
    public String readUtf8() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    @d
    public String readUtf8(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readUtf8(byteCount);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        require(1L);
        byte b10 = this.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            require(2L);
        } else if ((b10 & 240) == 224) {
            require(3L);
        } else if ((b10 & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    @dl.e
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @d
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @d
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (!(limit >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        byte b10 = (byte) 10;
        long jIndexOf = indexOf(b10, 0L, j10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && this.bufferField.getByte(j10 - 1) == ((byte) 13) && request(1 + j10) && this.bufferField.getByte(j10) == b10) {
            return BufferKt.readUtf8Line(this.bufferField, j10);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), limit) + " content=" + buffer.readByteString().hex() + "…");
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.bufferField.size() < byteCount) {
            if (this.source.read(this.bufferField, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public void require(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@d Options options) throws EOFException {
        f0.p(options, "options");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = BufferKt.selectPrefix(this.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    break;
                }
                this.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (this.source.read(this.bufferField, 8192) != -1);
        return -1;
    }

    @Override // okio.BufferedSource
    public void skip(long j10) throws EOFException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.bufferField.size());
            this.bufferField.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // okio.Source
    @d
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.source.getTimeout();
    }

    @d
    public String toString() {
        return "buffer(" + this.source + ')';
    }
}
