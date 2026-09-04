package okio.internal;

import androidx.constraintlayout.core.motion.utils.w;
import com.tekartik.sqflite.b;
import dl.d;
import dl.e;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.Sink;
import okio.Timeout;
import okio.Util;
import okio.buffer;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0080\b\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0080\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\r\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0013H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0080\b\u001a\u001d\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0017H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0019*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0019*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0000H\u0080\b\u001a\r\u0010 \u001a\u00020\u001f*\u00020\u0000H\u0080\b\u001a\r\u0010!\u001a\u00020\u001f*\u00020\u0000H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0011*\u00020\u0000H\u0080\b\u001a\r\u0010#\u001a\u00020\u0011*\u00020\u0000H\u0080\b\u001a\r\u0010$\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010%\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010&\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010'\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a%\u0010,\u001a\u00020\u0003*\u00020\u00002\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0003*\u00020\u00002\u0006\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0003H\u0080\b\u001a\u001d\u0010/\u001a\u00020\u0003*\u00020\u00002\u0006\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0003H\u0080\b\u001a-\u00101\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0080\b\u001a\r\u00103\u001a\u000202*\u00020\u0000H\u0080\b\u001a\r\u00104\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u00106\u001a\u000205*\u00020\u0000H\u0080\b\u001a\r\u00107\u001a\u00020\u0019*\u00020\u0000H\u0080\b¨\u00068"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/Buffer;", "sink", "", "byteCount", "commonRead", "", "commonExhausted", "Lkotlin/b2;", "commonRequire", "commonRequest", "", "commonReadByte", "Lokio/ByteString;", "commonReadByteString", "Lokio/Options;", b.f98586e, "", "commonSelect", "", "commonReadByteArray", "commonReadFully", w.c.R, "Lokio/Sink;", "commonReadAll", "", "commonReadUtf8", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "", "commonReadShort", "commonReadShortLe", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonSkip", "b", "fromIndex", "toIndex", "commonIndexOf", "bytes", "targetBytes", "commonIndexOfElement", "bytesOffset", "commonRangeEquals", "Lokio/BufferedSource;", "commonPeek", "commonClose", "Lokio/Timeout;", "commonTimeout", "commonToString", "okio"}, k = 2, mv = {1, 4, 0})
public final class RealBufferedSourceKt {
    public static final void commonClose(@d buffer commonClose) throws IOException {
        f0.p(commonClose, "$this$commonClose");
        if (commonClose.closed) {
            return;
        }
        commonClose.closed = true;
        commonClose.source.close();
        commonClose.bufferField.clear();
    }

    public static final boolean commonExhausted(@d buffer commonExhausted) {
        f0.p(commonExhausted, "$this$commonExhausted");
        if (!commonExhausted.closed) {
            return commonExhausted.bufferField.exhausted() && commonExhausted.source.read(commonExhausted.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOf(@d buffer commonIndexOf, byte b10, long j10, long j11) {
        f0.p(commonIndexOf, "$this$commonIndexOf");
        if (!(!commonIndexOf.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j10 && j11 >= j10)) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long jIndexOf = commonIndexOf.bufferField.indexOf(b10, j10, j11);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = commonIndexOf.bufferField.size();
            if (size >= j11 || commonIndexOf.source.read(commonIndexOf.bufferField, 8192) == -1) {
                break;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    public static final long commonIndexOf(@d buffer commonIndexOf, @d ByteString bytes, long j10) throws IOException {
        f0.p(commonIndexOf, "$this$commonIndexOf");
        f0.p(bytes, "bytes");
        if (!(!commonIndexOf.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = commonIndexOf.bufferField.indexOf(bytes, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = commonIndexOf.bufferField.size();
            if (commonIndexOf.source.read(commonIndexOf.bufferField, 8192) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - ((long) bytes.size())) + 1);
        }
    }

    public static final long commonIndexOfElement(@d buffer commonIndexOfElement, @d ByteString targetBytes, long j10) {
        f0.p(commonIndexOfElement, "$this$commonIndexOfElement");
        f0.p(targetBytes, "targetBytes");
        if (!(!commonIndexOfElement.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = commonIndexOfElement.bufferField.indexOfElement(targetBytes, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = commonIndexOfElement.bufferField.size();
            if (commonIndexOfElement.source.read(commonIndexOfElement.bufferField, 8192) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @d
    public static final BufferedSource commonPeek(@d buffer commonPeek) {
        f0.p(commonPeek, "$this$commonPeek");
        return Okio.buffer(new PeekSource(commonPeek));
    }

    public static final boolean commonRangeEquals(@d buffer commonRangeEquals, long j10, @d ByteString bytes, int i10, int i11) {
        f0.p(commonRangeEquals, "$this$commonRangeEquals");
        f0.p(bytes, "bytes");
        if (!(!commonRangeEquals.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!commonRangeEquals.request(1 + j11) || commonRangeEquals.bufferField.getByte(j11) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@d buffer commonRead, @d byte[] sink, int i10, int i11) {
        f0.p(commonRead, "$this$commonRead");
        f0.p(sink, "sink");
        long j10 = i11;
        Util.checkOffsetAndCount(sink.length, i10, j10);
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
            return -1;
        }
        return commonRead.bufferField.read(sink, i10, (int) Math.min(j10, commonRead.bufferField.size()));
    }

    public static final long commonRead(@d buffer commonRead, @d Buffer sink, long j10) {
        f0.p(commonRead, "$this$commonRead");
        f0.p(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!commonRead.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
            return -1L;
        }
        return commonRead.bufferField.read(sink, Math.min(j10, commonRead.bufferField.size()));
    }

    public static final long commonReadAll(@d buffer commonReadAll, @d Sink sink) throws IOException {
        f0.p(commonReadAll, "$this$commonReadAll");
        f0.p(sink, "sink");
        long j10 = 0;
        while (commonReadAll.source.read(commonReadAll.bufferField, 8192) != -1) {
            long jCompleteSegmentByteCount = commonReadAll.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(commonReadAll.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (commonReadAll.bufferField.size() <= 0) {
            return j10;
        }
        long size = j10 + commonReadAll.bufferField.size();
        Buffer buffer = commonReadAll.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(@d buffer commonReadByte) throws EOFException {
        f0.p(commonReadByte, "$this$commonReadByte");
        commonReadByte.require(1L);
        return commonReadByte.bufferField.readByte();
    }

    @d
    public static final byte[] commonReadByteArray(@d buffer commonReadByteArray) throws IOException {
        f0.p(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.bufferField.writeAll(commonReadByteArray.source);
        return commonReadByteArray.bufferField.readByteArray();
    }

    @d
    public static final byte[] commonReadByteArray(@d buffer commonReadByteArray, long j10) throws EOFException {
        f0.p(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.require(j10);
        return commonReadByteArray.bufferField.readByteArray(j10);
    }

    @d
    public static final ByteString commonReadByteString(@d buffer commonReadByteString) throws IOException {
        f0.p(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.bufferField.writeAll(commonReadByteString.source);
        return commonReadByteString.bufferField.readByteString();
    }

    @d
    public static final ByteString commonReadByteString(@d buffer commonReadByteString, long j10) throws EOFException {
        f0.p(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.require(j10);
        return commonReadByteString.bufferField.readByteString(j10);
    }

    public static final long commonReadDecimalLong(@d buffer commonReadDecimalLong) throws EOFException {
        f0.p(commonReadDecimalLong, "$this$commonReadDecimalLong");
        commonReadDecimalLong.require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!commonReadDecimalLong.request(j11)) {
                break;
            }
            byte b10 = commonReadDecimalLong.bufferField.getByte(j10);
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
        return commonReadDecimalLong.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@d buffer commonReadFully, @d Buffer sink, long j10) throws IOException {
        f0.p(commonReadFully, "$this$commonReadFully");
        f0.p(sink, "sink");
        try {
            commonReadFully.require(j10);
            commonReadFully.bufferField.readFully(sink, j10);
        } catch (EOFException e10) {
            sink.writeAll(commonReadFully.bufferField);
            throw e10;
        }
    }

    public static final void commonReadFully(@d buffer commonReadFully, @d byte[] sink) throws EOFException {
        f0.p(commonReadFully, "$this$commonReadFully");
        f0.p(sink, "sink");
        try {
            commonReadFully.require(sink.length);
            commonReadFully.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (commonReadFully.bufferField.size() > 0) {
                Buffer buffer = commonReadFully.bufferField;
                int i11 = buffer.read(sink, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@d buffer commonReadHexadecimalUnsignedLong) throws EOFException {
        f0.p(commonReadHexadecimalUnsignedLong, "$this$commonReadHexadecimalUnsignedLong");
        commonReadHexadecimalUnsignedLong.require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!commonReadHexadecimalUnsignedLong.request(i11)) {
                break;
            }
            byte b10 = commonReadHexadecimalUnsignedLong.bufferField.getByte(i10);
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
        return commonReadHexadecimalUnsignedLong.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@d buffer commonReadInt) throws EOFException {
        f0.p(commonReadInt, "$this$commonReadInt");
        commonReadInt.require(4L);
        return commonReadInt.bufferField.readInt();
    }

    public static final int commonReadIntLe(@d buffer commonReadIntLe) throws EOFException {
        f0.p(commonReadIntLe, "$this$commonReadIntLe");
        commonReadIntLe.require(4L);
        return commonReadIntLe.bufferField.readIntLe();
    }

    public static final long commonReadLong(@d buffer commonReadLong) throws EOFException {
        f0.p(commonReadLong, "$this$commonReadLong");
        commonReadLong.require(8L);
        return commonReadLong.bufferField.readLong();
    }

    public static final long commonReadLongLe(@d buffer commonReadLongLe) throws EOFException {
        f0.p(commonReadLongLe, "$this$commonReadLongLe");
        commonReadLongLe.require(8L);
        return commonReadLongLe.bufferField.readLongLe();
    }

    public static final short commonReadShort(@d buffer commonReadShort) throws EOFException {
        f0.p(commonReadShort, "$this$commonReadShort");
        commonReadShort.require(2L);
        return commonReadShort.bufferField.readShort();
    }

    public static final short commonReadShortLe(@d buffer commonReadShortLe) throws EOFException {
        f0.p(commonReadShortLe, "$this$commonReadShortLe");
        commonReadShortLe.require(2L);
        return commonReadShortLe.bufferField.readShortLe();
    }

    @d
    public static final String commonReadUtf8(@d buffer commonReadUtf8) throws IOException {
        f0.p(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.bufferField.writeAll(commonReadUtf8.source);
        return commonReadUtf8.bufferField.readUtf8();
    }

    @d
    public static final String commonReadUtf8(@d buffer commonReadUtf8, long j10) throws EOFException {
        f0.p(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.require(j10);
        return commonReadUtf8.bufferField.readUtf8(j10);
    }

    public static final int commonReadUtf8CodePoint(@d buffer commonReadUtf8CodePoint) throws EOFException {
        f0.p(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        commonReadUtf8CodePoint.require(1L);
        byte b10 = commonReadUtf8CodePoint.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            commonReadUtf8CodePoint.require(2L);
        } else if ((b10 & 240) == 224) {
            commonReadUtf8CodePoint.require(3L);
        } else if ((b10 & 248) == 240) {
            commonReadUtf8CodePoint.require(4L);
        }
        return commonReadUtf8CodePoint.bufferField.readUtf8CodePoint();
    }

    @e
    public static final String commonReadUtf8Line(@d buffer commonReadUtf8Line) {
        f0.p(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(commonReadUtf8Line.bufferField, jIndexOf);
        }
        if (commonReadUtf8Line.bufferField.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.bufferField.size());
        }
        return null;
    }

    @d
    public static final String commonReadUtf8LineStrict(@d buffer commonReadUtf8LineStrict, long j10) throws EOFException {
        f0.p(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        byte b10 = (byte) 10;
        long jIndexOf = commonReadUtf8LineStrict.indexOf(b10, 0L, j11);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && commonReadUtf8LineStrict.request(j11) && commonReadUtf8LineStrict.bufferField.getByte(j11 - 1) == ((byte) 13) && commonReadUtf8LineStrict.request(1 + j11) && commonReadUtf8LineStrict.bufferField.getByte(j11) == b10) {
            return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, j11);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = commonReadUtf8LineStrict.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.bufferField.size(), j10) + " content=" + buffer.readByteString().hex() + "…");
    }

    public static final boolean commonRequest(@d buffer commonRequest, long j10) {
        f0.p(commonRequest, "$this$commonRequest");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!commonRequest.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (commonRequest.bufferField.size() < j10) {
            if (commonRequest.source.read(commonRequest.bufferField, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(@d buffer commonRequire, long j10) throws EOFException {
        f0.p(commonRequire, "$this$commonRequire");
        if (!commonRequire.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@d buffer commonSelect, @d Options options) throws EOFException {
        f0.p(commonSelect, "$this$commonSelect");
        f0.p(options, "options");
        if (!(!commonSelect.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = BufferKt.selectPrefix(commonSelect.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                commonSelect.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (commonSelect.source.read(commonSelect.bufferField, 8192) != -1);
        return -1;
    }

    public static final void commonSkip(@d buffer commonSkip, long j10) throws EOFException {
        f0.p(commonSkip, "$this$commonSkip");
        if (!(!commonSkip.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (commonSkip.bufferField.size() == 0 && commonSkip.source.read(commonSkip.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, commonSkip.bufferField.size());
            commonSkip.bufferField.skip(jMin);
            j10 -= jMin;
        }
    }

    @d
    public static final Timeout commonTimeout(@d buffer commonTimeout) {
        f0.p(commonTimeout, "$this$commonTimeout");
        return commonTimeout.source.getTimeout();
    }

    @d
    public static final String commonToString(@d buffer commonToString) {
        f0.p(commonToString, "$this$commonToString");
        return "buffer(" + commonToString.source + ')';
    }
}
