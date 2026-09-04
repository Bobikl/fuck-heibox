package okio.internal;

import androidx.constraintlayout.core.motion.utils.w;
import androidx.exifinterface.media.a;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q2;
import com.tekartik.sqflite.b;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.text.y;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Platform;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio.Util;
import yh.p;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000f\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aA\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0018\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0000\u001a%\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\nH\u0080\b\u001a\r\u0010!\u001a\u00020 *\u00020\nH\u0080\b\u001a\r\u0010\"\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010#\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\u0015\u0010%\u001a\u00020\u001e*\u00020\n2\u0006\u0010$\u001a\u00020\u000bH\u0080\b\u001a\r\u0010'\u001a\u00020&*\u00020\nH\u0080\b\u001a\u0015\u0010(\u001a\u00020&*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a)\u0010+\u001a\u00020\n*\u00020\n2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010.\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00100\u001a\u00020\u0000*\u00020\n2\u0006\u0010/\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u0004H\u0080\b\u001a%\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00102\u001a\u00020\u0004*\u00020\nH\u0080\b\u001a\u0015\u00102\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00104\u001a\u00020\u0002*\u00020\n2\u0006\u00103\u001a\u00020\u0004H\u0080\b\u001a\u0015\u00105\u001a\u00020&*\u00020\n2\u0006\u00103\u001a\u00020\u0004H\u0080\b\u001a%\u00104\u001a\u00020\u0002*\u00020\n2\u0006\u00103\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00106\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u00107\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u00108\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u00108\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00109\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0080\b\u001a\u001d\u00105\u001a\u00020&*\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010;\u001a\u00020\u000b*\u00020\n2\u0006\u00103\u001a\u00020:H\u0080\b\u001a\u0015\u0010<\u001a\u00020\r*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u000f\u0010=\u001a\u0004\u0018\u00010\r*\u00020\nH\u0080\b\u001a\u0015\u0010?\u001a\u00020\r*\u00020\n2\u0006\u0010>\u001a\u00020\u000bH\u0080\b\u001a\r\u0010@\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a%\u0010D\u001a\u00020\n*\u00020\n2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010F\u001a\u00020\n*\u00020\n2\u0006\u0010E\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010H\u001a\u00020\u000b*\u00020\n2\u0006\u00101\u001a\u00020GH\u0080\b\u001a\u001d\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010+\u001a\u00020&*\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u001d\u00104\u001a\u00020\u000b*\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a%\u0010Q\u001a\u00020\u000b*\u00020\n2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010S\u001a\u00020\u000b*\u00020\n2\u0006\u0010R\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a-\u0010T\u001a\u00020\b*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0017\u0010W\u001a\u00020\b*\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010UH\u0080\b\u001a\r\u0010X\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010Y\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u0010Z\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u0010Z\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\"\u001a\u0010[\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0014\u0010_\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b_\u0010`\"\u0014\u0010a\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\ba\u0010b\"\u0014\u0010c\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\bc\u0010b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"Lokio/Segment;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "Lokio/Buffer;", "", "newline", "", "readUtf8Line", a.f23244d5, "fromIndex", "Lkotlin/Function2;", "lambda", "seek", "(Lokio/Buffer;JLyh/p;)Ljava/lang/Object;", "Lokio/Options;", b.f98586e, "selectTruncated", "selectPrefix", "out", w.c.R, "byteCount", "commonCopyTo", "commonCompleteSegmentByteCount", "", "commonReadByte", "", "commonReadShort", "commonReadInt", "commonReadLong", "pos", "commonGet", "Lkotlin/b2;", "commonClear", "commonSkip", "Lokio/ByteString;", "byteString", "commonWrite", "v", "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "source", "commonReadByteArray", "sink", "commonRead", "commonReadFully", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "commonSelect", "Lokio/Sink;", "commonReadAll", "commonReadUtf8", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", w.b.f17895e, "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonWriteUtf8", "codePoint", "commonWriteUtf8CodePoint", "Lokio/Source;", "commonWriteAll", "b", "commonWriteByte", ak.aB, "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "toIndex", "commonIndexOf", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "", "other", "commonEquals", "commonHashCode", "commonCopy", "commonSnapshot", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", "I", "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START", "okio"}, k = 2, mv = {1, 4, 0})
public final class BufferKt {

    @d
    private static final byte[] HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@d Buffer commonClear) throws EOFException {
        f0.p(commonClear, "$this$commonClear");
        commonClear.skip(commonClear.size());
    }

    public static final long commonCompleteSegmentByteCount(@d Buffer commonCompleteSegmentByteCount) {
        f0.p(commonCompleteSegmentByteCount, "$this$commonCompleteSegmentByteCount");
        long size = commonCompleteSegmentByteCount.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = commonCompleteSegmentByteCount.head;
        f0.m(segment);
        Segment segment2 = segment.prev;
        f0.m(segment2);
        int i10 = segment2.limit;
        return (i10 >= 8192 || !segment2.owner) ? size : size - ((long) (i10 - segment2.pos));
    }

    @d
    public static final Buffer commonCopy(@d Buffer commonCopy) {
        f0.p(commonCopy, "$this$commonCopy");
        Buffer buffer = new Buffer();
        if (commonCopy.size() == 0) {
            return buffer;
        }
        Segment segment = commonCopy.head;
        f0.m(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            f0.m(segment3);
            f0.m(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(commonCopy.size());
        return buffer;
    }

    @d
    public static final Buffer commonCopyTo(@d Buffer commonCopyTo, @d Buffer out, long j10, long j11) {
        f0.p(commonCopyTo, "$this$commonCopyTo");
        f0.p(out, "out");
        Util.checkOffsetAndCount(commonCopyTo.size(), j10, j11);
        if (j11 == 0) {
            return commonCopyTo;
        }
        out.setSize$okio(out.size() + j11);
        Segment segment = commonCopyTo.head;
        while (true) {
            f0.m(segment);
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            segment = segment.next;
        }
        while (j11 > 0) {
            f0.m(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            int i12 = segmentSharedCopy.pos + ((int) j10);
            segmentSharedCopy.pos = i12;
            segmentSharedCopy.limit = Math.min(i12 + ((int) j11), segmentSharedCopy.limit);
            Segment segment2 = out.head;
            if (segment2 == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy;
                out.head = segmentSharedCopy;
            } else {
                f0.m(segment2);
                Segment segment3 = segment2.prev;
                f0.m(segment3);
                segment3.push(segmentSharedCopy);
            }
            j11 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
            segment = segment.next;
            j10 = 0;
        }
        return commonCopyTo;
    }

    public static final boolean commonEquals(@d Buffer commonEquals, @e Object obj) {
        f0.p(commonEquals, "$this$commonEquals");
        if (commonEquals == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (commonEquals.size() != buffer.size()) {
            return false;
        }
        if (commonEquals.size() == 0) {
            return true;
        }
        Segment segment = commonEquals.head;
        f0.m(segment);
        Segment segment2 = buffer.head;
        f0.m(segment2);
        int i10 = segment.pos;
        int i11 = segment2.pos;
        long j10 = 0;
        while (j10 < commonEquals.size()) {
            long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (segment.data[i10] != segment2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == segment.limit) {
                segment = segment.next;
                f0.m(segment);
                i10 = segment.pos;
            }
            if (i11 == segment2.limit) {
                segment2 = segment2.next;
                f0.m(segment2);
                i11 = segment2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    public static final byte commonGet(@d Buffer commonGet, long j10) {
        f0.p(commonGet, "$this$commonGet");
        Util.checkOffsetAndCount(commonGet.size(), j10, 1L);
        Segment segment = commonGet.head;
        if (segment == null) {
            f0.m(null);
            throw null;
        }
        if (commonGet.size() - j10 < j10) {
            long size = commonGet.size();
            while (size > j10) {
                segment = segment.prev;
                f0.m(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            f0.m(segment);
            return segment.data[(int) ((((long) segment.pos) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                f0.m(segment);
                return segment.data[(int) ((((long) segment.pos) + j10) - j11)];
            }
            segment = segment.next;
            f0.m(segment);
            j11 = j12;
        }
    }

    public static final int commonHashCode(@d Buffer commonHashCode) {
        f0.p(commonHashCode, "$this$commonHashCode");
        Segment segment = commonHashCode.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            f0.m(segment);
        } while (segment != commonHashCode.head);
        return i10;
    }

    public static final long commonIndexOf(@d Buffer commonIndexOf, byte b10, long j10, long j11) {
        Segment segment;
        int i10;
        f0.p(commonIndexOf, "$this$commonIndexOf");
        long size = 0;
        if (!(0 <= j10 && j11 >= j10)) {
            throw new IllegalArgumentException(("size=" + commonIndexOf.size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > commonIndexOf.size()) {
            j11 = commonIndexOf.size();
        }
        if (j10 == j11 || (segment = commonIndexOf.head) == null) {
            return -1L;
        }
        if (commonIndexOf.size() - j10 < j10) {
            size = commonIndexOf.size();
            while (size > j10) {
                segment = segment.prev;
                f0.m(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j11) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
                i10 = (int) ((((long) segment.pos) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                f0.m(segment);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + size;
            if (j12 > j10) {
                break;
            }
            segment = segment.next;
            f0.m(segment);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
            i10 = (int) ((((long) segment.pos) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            f0.m(segment);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - segment.pos)) + size;
    }

    public static final long commonIndexOf(@d Buffer commonIndexOf, @d ByteString bytes, long j10) {
        long j11 = j10;
        f0.p(commonIndexOf, "$this$commonIndexOf");
        f0.p(bytes, "bytes");
        boolean z10 = true;
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j12 = 0;
        if (!(j11 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        Segment segment = commonIndexOf.head;
        if (segment == null) {
            return -1L;
        }
        if (commonIndexOf.size() - j11 < j11) {
            long size = commonIndexOf.size();
            while (size > j11) {
                segment = segment.prev;
                f0.m(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b10 = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (commonIndexOf.size() - ((long) size2)) + 1;
            while (size < size3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                for (int i10 = (int) ((((long) segment.pos) + j11) - size); i10 < iMin; i10++) {
                    if (bArr[i10] == b10 && rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                        return ((long) (i10 - segment.pos)) + size;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                f0.m(segment);
                j11 = size;
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (segment.limit - segment.pos)) + j12;
            if (j13 > j11) {
                break;
            }
            segment = segment.next;
            f0.m(segment);
            j12 = j13;
            z10 = z10;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b11 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (commonIndexOf.size() - ((long) size4)) + 1;
        while (j12 < size5) {
            byte[] bArr2 = segment.data;
            long j14 = j12;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - j12);
            for (int i11 = (int) ((((long) segment.pos) + j11) - j14); i11 < iMin2; i11++) {
                if (bArr2[i11] == b11 && rangeEquals(segment, i11 + 1, bArrInternalArray$okio2, 1, size4)) {
                    return ((long) (i11 - segment.pos)) + j14;
                }
            }
            j12 = j14 + ((long) (segment.limit - segment.pos));
            segment = segment.next;
            f0.m(segment);
            j11 = j12;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(@d Buffer commonIndexOfElement, @d ByteString targetBytes, long j10) {
        int i10;
        int i11;
        f0.p(commonIndexOfElement, "$this$commonIndexOfElement");
        f0.p(targetBytes, "targetBytes");
        long size = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        Segment segment = commonIndexOfElement.head;
        if (segment == null) {
            return -1L;
        }
        if (commonIndexOfElement.size() - j10 < j10) {
            size = commonIndexOfElement.size();
            while (size > j10) {
                segment = segment.prev;
                f0.m(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < commonIndexOfElement.size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i12 = segment.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            f0.m(segment);
                            j10 = size;
                        } else {
                            byte b12 = bArr[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = segment.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < commonIndexOfElement.size()) {
                    byte[] bArr2 = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i13 = segment.limit;
                    while (true) {
                        if (i10 < i13) {
                            byte b13 = bArr2[i10];
                            int length = bArrInternalArray$okio.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b13 == bArrInternalArray$okio[i14]) {
                                    i11 = segment.pos;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            f0.m(segment);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + size;
            if (j11 > j10) {
                break;
            }
            segment = segment.next;
            f0.m(segment);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < commonIndexOfElement.size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i15 = segment.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        f0.m(segment);
                        j10 = size;
                    } else {
                        byte b16 = bArr3[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < commonIndexOfElement.size()) {
                byte[] bArr4 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i16 = segment.limit;
                while (true) {
                    if (i10 < i16) {
                        byte b17 = bArr4[i10];
                        int length2 = bArrInternalArray$okio2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b17 == bArrInternalArray$okio2[i17]) {
                                i11 = segment.pos;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        f0.m(segment);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public static final boolean commonRangeEquals(@d Buffer commonRangeEquals, long j10, @d ByteString bytes, int i10, int i11) {
        f0.p(commonRangeEquals, "$this$commonRangeEquals");
        f0.p(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || commonRangeEquals.size() - j10 < i11 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (commonRangeEquals.getByte(((long) i12) + j10) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@d Buffer commonRead, @d byte[] sink) {
        f0.p(commonRead, "$this$commonRead");
        f0.p(sink, "sink");
        return commonRead.read(sink, 0, sink.length);
    }

    public static final int commonRead(@d Buffer commonRead, @d byte[] sink, int i10, int i11) {
        f0.p(commonRead, "$this$commonRead");
        f0.p(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i10, i11);
        Segment segment = commonRead.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i11, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i12 = segment.pos;
        m.W0(bArr, sink, i10, i12, i12 + iMin);
        segment.pos += iMin;
        commonRead.setSize$okio(commonRead.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            commonRead.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final long commonRead(@d Buffer commonRead, @d Buffer sink, long j10) {
        f0.p(commonRead, "$this$commonRead");
        f0.p(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (commonRead.size() == 0) {
            return -1L;
        }
        if (j10 > commonRead.size()) {
            j10 = commonRead.size();
        }
        sink.write(commonRead, j10);
        return j10;
    }

    public static final long commonReadAll(@d Buffer commonReadAll, @d Sink sink) throws IOException {
        f0.p(commonReadAll, "$this$commonReadAll");
        f0.p(sink, "sink");
        long size = commonReadAll.size();
        if (size > 0) {
            sink.write(commonReadAll, size);
        }
        return size;
    }

    public static final byte commonReadByte(@d Buffer commonReadByte) throws EOFException {
        f0.p(commonReadByte, "$this$commonReadByte");
        if (commonReadByte.size() == 0) {
            throw new EOFException();
        }
        Segment segment = commonReadByte.head;
        f0.m(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        int i12 = i10 + 1;
        byte b10 = segment.data[i10];
        commonReadByte.setSize$okio(commonReadByte.size() - 1);
        if (i12 == i11) {
            commonReadByte.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i12;
        }
        return b10;
    }

    @d
    public static final byte[] commonReadByteArray(@d Buffer commonReadByteArray) {
        f0.p(commonReadByteArray, "$this$commonReadByteArray");
        return commonReadByteArray.readByteArray(commonReadByteArray.size());
    }

    @d
    public static final byte[] commonReadByteArray(@d Buffer commonReadByteArray, long j10) throws EOFException {
        f0.p(commonReadByteArray, "$this$commonReadByteArray");
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (commonReadByteArray.size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        commonReadByteArray.readFully(bArr);
        return bArr;
    }

    @d
    public static final ByteString commonReadByteString(@d Buffer commonReadByteString) {
        f0.p(commonReadByteString, "$this$commonReadByteString");
        return commonReadByteString.readByteString(commonReadByteString.size());
    }

    @d
    public static final ByteString commonReadByteString(@d Buffer commonReadByteString, long j10) throws EOFException {
        f0.p(commonReadByteString, "$this$commonReadByteString");
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (commonReadByteString.size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new ByteString(commonReadByteString.readByteArray(j10));
        }
        ByteString byteStringSnapshot = commonReadByteString.snapshot((int) j10);
        commonReadByteString.skip(j10);
        return byteStringSnapshot;
    }

    public static final long commonReadDecimalLong(@d Buffer commonReadDecimalLong) throws EOFException {
        Segment segment;
        byte b10;
        f0.p(commonReadDecimalLong, "$this$commonReadDecimalLong");
        long j10 = 0;
        if (commonReadDecimalLong.size() == 0) {
            throw new EOFException();
        }
        long j11 = -7;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        loop0: while (true) {
            Segment segment2 = commonReadDecimalLong.head;
            f0.m(segment2);
            byte[] bArr = segment2.data;
            int i11 = segment2.pos;
            int i12 = segment2.limit;
            while (true) {
                if (i11 >= i12) {
                    segment = segment2;
                    break;
                }
                b10 = bArr[i11];
                byte b11 = (byte) 48;
                if (b10 >= b11 && b10 <= ((byte) 57)) {
                    int i13 = b11 - b10;
                    if (j10 < OVERFLOW_ZONE) {
                        break loop0;
                    }
                    segment = segment2;
                    if (j10 == OVERFLOW_ZONE && i13 < j11) {
                        break loop0;
                    }
                    j10 = (j10 * 10) + ((long) i13);
                } else {
                    segment = segment2;
                    if (b10 != ((byte) 45) || i10 != 0) {
                        if (i10 != 0) {
                            z11 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Util.toHexString(b10));
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
                z11 = z11;
                segment2 = segment;
            }
            if (i11 == i12) {
                commonReadDecimalLong.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            if (z11 || commonReadDecimalLong.head == null) {
                commonReadDecimalLong.setSize$okio(commonReadDecimalLong.size() - ((long) i10));
                return z10 ? j10 : -j10;
            }
        }
        Buffer bufferWriteByte = new Buffer().writeDecimalLong(j10).writeByte((int) b10);
        if (!z10) {
            bufferWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
    }

    public static final void commonReadFully(@d Buffer commonReadFully, @d Buffer sink, long j10) throws EOFException {
        f0.p(commonReadFully, "$this$commonReadFully");
        f0.p(sink, "sink");
        if (commonReadFully.size() >= j10) {
            sink.write(commonReadFully, j10);
        } else {
            sink.write(commonReadFully, commonReadFully.size());
            throw new EOFException();
        }
    }

    public static final void commonReadFully(@d Buffer commonReadFully, @d byte[] sink) throws EOFException {
        f0.p(commonReadFully, "$this$commonReadFully");
        f0.p(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = commonReadFully.read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@d Buffer commonReadHexadecimalUnsignedLong) throws EOFException {
        int i10;
        f0.p(commonReadHexadecimalUnsignedLong, "$this$commonReadHexadecimalUnsignedLong");
        if (commonReadHexadecimalUnsignedLong.size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            Segment segment = commonReadHexadecimalUnsignedLong.head;
            f0.m(segment);
            byte[] bArr = segment.data;
            int i12 = segment.pos;
            int i13 = segment.limit;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                byte b11 = (byte) 48;
                if (b10 < b11 || b10 > ((byte) 57)) {
                    byte b12 = (byte) 97;
                    if ((b10 < b12 || b10 > ((byte) 102)) && (b10 < (b12 = (byte) 65) || b10 > ((byte) 70))) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Util.toHexString(b10));
                    }
                    i10 = (b10 - b12) + 10;
                } else {
                    i10 = b10 - b11;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new Buffer().writeHexadecimalUnsignedLong(j10).writeByte((int) b10).readUtf8());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                commonReadHexadecimalUnsignedLong.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (commonReadHexadecimalUnsignedLong.head != null);
        commonReadHexadecimalUnsignedLong.setSize$okio(commonReadHexadecimalUnsignedLong.size() - ((long) i11));
        return j10;
    }

    public static final int commonReadInt(@d Buffer commonReadInt) throws EOFException {
        f0.p(commonReadInt, "$this$commonReadInt");
        if (commonReadInt.size() < 4) {
            throw new EOFException();
        }
        Segment segment = commonReadInt.head;
        f0.m(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 4) {
            return (commonReadInt.readByte() & 255) | ((commonReadInt.readByte() & 255) << 24) | ((commonReadInt.readByte() & 255) << 16) | ((commonReadInt.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        commonReadInt.setSize$okio(commonReadInt.size() - 4);
        if (i17 == i11) {
            commonReadInt.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i17;
        }
        return i18;
    }

    public static final long commonReadLong(@d Buffer commonReadLong) throws EOFException {
        f0.p(commonReadLong, "$this$commonReadLong");
        if (commonReadLong.size() < 8) {
            throw new EOFException();
        }
        Segment segment = commonReadLong.head;
        f0.m(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 8) {
            return ((((long) commonReadLong.readInt()) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) commonReadLong.readInt()));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 48) | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 24);
        int i17 = i16 + 1;
        long j13 = j12 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i17 + 1;
        long j14 = j13 | ((((long) bArr[i17]) & 255) << 8);
        int i19 = i18 + 1;
        long j15 = j14 | (((long) bArr[i18]) & 255);
        commonReadLong.setSize$okio(commonReadLong.size() - 8);
        if (i19 == i11) {
            commonReadLong.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i19;
        }
        return j15;
    }

    public static final short commonReadShort(@d Buffer commonReadShort) throws EOFException {
        f0.p(commonReadShort, "$this$commonReadShort");
        if (commonReadShort.size() < 2) {
            throw new EOFException();
        }
        Segment segment = commonReadShort.head;
        f0.m(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 2) {
            return (short) ((commonReadShort.readByte() & 255) | ((commonReadShort.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        commonReadShort.setSize$okio(commonReadShort.size() - 2);
        if (i13 == i11) {
            commonReadShort.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    @d
    public static final String commonReadUtf8(@d Buffer commonReadUtf8, long j10) throws EOFException {
        f0.p(commonReadUtf8, "$this$commonReadUtf8");
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (commonReadUtf8.size() < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        Segment segment = commonReadUtf8.head;
        f0.m(segment);
        int i10 = segment.pos;
        if (((long) i10) + j10 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(commonReadUtf8.readByteArray(j10), 0, 0, 3, null);
        }
        int i11 = (int) j10;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i10, i10 + i11);
        segment.pos += i11;
        commonReadUtf8.setSize$okio(commonReadUtf8.size() - j10);
        if (segment.pos == segment.limit) {
            commonReadUtf8.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@d Buffer commonReadUtf8CodePoint) throws EOFException {
        int i10;
        int i11;
        int i12;
        f0.p(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        if (commonReadUtf8CodePoint.size() == 0) {
            throw new EOFException();
        }
        byte b10 = commonReadUtf8CodePoint.getByte(0L);
        if ((b10 & 128) == 0) {
            i10 = b10 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & 240) == 224) {
            i10 = b10 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                commonReadUtf8CodePoint.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (commonReadUtf8CodePoint.size() < j10) {
            throw new EOFException("size < " + i11 + ": " + commonReadUtf8CodePoint.size() + " (to read code point prefixed 0x" + Util.toHexString(b10) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = commonReadUtf8CodePoint.getByte(j11);
            if ((b11 & 192) != 128) {
                commonReadUtf8CodePoint.skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        commonReadUtf8CodePoint.skip(j10);
        if (i10 > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 <= i10 && 57343 >= i10) || i10 < i12) ? Utf8.REPLACEMENT_CODE_POINT : i10;
    }

    @e
    public static final String commonReadUtf8Line(@d Buffer commonReadUtf8Line) {
        f0.p(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(commonReadUtf8Line, jIndexOf);
        }
        if (commonReadUtf8Line.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.size());
        }
        return null;
    }

    @d
    public static final String commonReadUtf8LineStrict(@d Buffer commonReadUtf8LineStrict, long j10) throws EOFException {
        f0.p(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        byte b10 = (byte) 10;
        long jIndexOf = commonReadUtf8LineStrict.indexOf(b10, 0L, j11);
        if (jIndexOf != -1) {
            return readUtf8Line(commonReadUtf8LineStrict, jIndexOf);
        }
        if (j11 < commonReadUtf8LineStrict.size() && commonReadUtf8LineStrict.getByte(j11 - 1) == ((byte) 13) && commonReadUtf8LineStrict.getByte(j11) == b10) {
            return readUtf8Line(commonReadUtf8LineStrict, j11);
        }
        Buffer buffer = new Buffer();
        commonReadUtf8LineStrict.copyTo(buffer, 0L, Math.min(32, commonReadUtf8LineStrict.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.size(), j10) + " content=" + buffer.readByteString().hex() + y.F);
    }

    public static final int commonSelect(@d Buffer commonSelect, @d Options options) throws EOFException {
        f0.p(commonSelect, "$this$commonSelect");
        f0.p(options, "options");
        int iSelectPrefix$default = selectPrefix$default(commonSelect, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        commonSelect.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@d Buffer commonSkip, long j10) throws EOFException {
        f0.p(commonSkip, "$this$commonSkip");
        while (j10 > 0) {
            Segment segment = commonSkip.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            long j11 = iMin;
            commonSkip.setSize$okio(commonSkip.size() - j11);
            j10 -= j11;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                commonSkip.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @d
    public static final ByteString commonSnapshot(@d Buffer commonSnapshot) {
        f0.p(commonSnapshot, "$this$commonSnapshot");
        if (commonSnapshot.size() <= ((long) Integer.MAX_VALUE)) {
            return commonSnapshot.snapshot((int) commonSnapshot.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + commonSnapshot.size()).toString());
    }

    @d
    public static final ByteString commonSnapshot(@d Buffer commonSnapshot, int i10) {
        f0.p(commonSnapshot, "$this$commonSnapshot");
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(commonSnapshot.size(), 0L, i10);
        Segment segment = commonSnapshot.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            f0.m(segment);
            int i14 = segment.limit;
            int i15 = segment.pos;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        Segment segment2 = commonSnapshot.head;
        int i16 = 0;
        while (i11 < i10) {
            f0.m(segment2);
            bArr[i16] = segment2.data;
            i11 += segment2.limit - segment2.pos;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = segment2.pos;
            segment2.shared = true;
            i16++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @d
    public static final Segment commonWritableSegment(@d Buffer commonWritableSegment, int i10) {
        f0.p(commonWritableSegment, "$this$commonWritableSegment");
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = commonWritableSegment.head;
        if (segment != null) {
            f0.m(segment);
            Segment segment2 = segment.prev;
            f0.m(segment2);
            return (segment2.limit + i10 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        commonWritableSegment.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @d
    public static final Buffer commonWrite(@d Buffer commonWrite, @d ByteString byteString, int i10, int i11) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(byteString, "byteString");
        byteString.write$okio(commonWrite, i10, i11);
        return commonWrite;
    }

    @d
    public static final Buffer commonWrite(@d Buffer commonWrite, @d Source source, long j10) throws IOException {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        while (j10 > 0) {
            long j11 = source.read(commonWrite, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return commonWrite;
    }

    @d
    public static final Buffer commonWrite(@d Buffer commonWrite, @d byte[] source) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        return commonWrite.write(source, 0, source.length);
    }

    @d
    public static final Buffer commonWrite(@d Buffer commonWrite, @d byte[] source, int i10, int i11) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        long j10 = i11;
        Util.checkOffsetAndCount(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Segment segmentWritableSegment$okio = commonWrite.writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - segmentWritableSegment$okio.limit);
            int i13 = i10 + iMin;
            m.W0(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i10, i13);
            segmentWritableSegment$okio.limit += iMin;
            i10 = i13;
        }
        commonWrite.setSize$okio(commonWrite.size() + j10);
        return commonWrite;
    }

    public static final void commonWrite(@d Buffer commonWrite, @d Buffer source, long j10) {
        Segment segment;
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(source, "source");
        if (!(source != commonWrite)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        Util.checkOffsetAndCount(source.size(), 0L, j10);
        while (j10 > 0) {
            Segment segment2 = source.head;
            f0.m(segment2);
            int i10 = segment2.limit;
            Segment segment3 = source.head;
            f0.m(segment3);
            if (j10 < i10 - segment3.pos) {
                Segment segment4 = commonWrite.head;
                if (segment4 != null) {
                    f0.m(segment4);
                    segment = segment4.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + j10) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        Segment segment5 = source.head;
                        f0.m(segment5);
                        segment5.writeTo(segment, (int) j10);
                        source.setSize$okio(source.size() - j10);
                        commonWrite.setSize$okio(commonWrite.size() + j10);
                        return;
                    }
                }
                Segment segment6 = source.head;
                f0.m(segment6);
                source.head = segment6.split((int) j10);
            }
            Segment segment7 = source.head;
            f0.m(segment7);
            long j11 = segment7.limit - segment7.pos;
            source.head = segment7.pop();
            Segment segment8 = commonWrite.head;
            if (segment8 == null) {
                commonWrite.head = segment7;
                segment7.prev = segment7;
                segment7.next = segment7;
            } else {
                f0.m(segment8);
                Segment segment9 = segment8.prev;
                f0.m(segment9);
                segment9.push(segment7).compact();
            }
            source.setSize$okio(source.size() - j11);
            commonWrite.setSize$okio(commonWrite.size() + j11);
            j10 -= j11;
        }
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer commonWrite, ByteString byteString, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteString.size();
        }
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(byteString, "byteString");
        byteString.write$okio(commonWrite, i10, i11);
        return commonWrite;
    }

    public static final long commonWriteAll(@d Buffer commonWriteAll, @d Source source) throws IOException {
        f0.p(commonWriteAll, "$this$commonWriteAll");
        f0.p(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(commonWriteAll, 8192);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @d
    public static final Buffer commonWriteByte(@d Buffer commonWriteByte, int i10) {
        f0.p(commonWriteByte, "$this$commonWriteByte");
        Segment segmentWritableSegment$okio = commonWriteByte.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i11 + 1;
        bArr[i11] = (byte) i10;
        commonWriteByte.setSize$okio(commonWriteByte.size() + 1);
        return commonWriteByte;
    }

    @d
    public static final Buffer commonWriteDecimalLong(@d Buffer commonWriteDecimalLong, long j10) {
        int i10;
        f0.p(commonWriteDecimalLong, "$this$commonWriteDecimalLong");
        if (j10 == 0) {
            return commonWriteDecimalLong.writeByte(48);
        }
        boolean z10 = false;
        int i11 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return commonWriteDecimalLong.writeUtf8("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i11 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
            i11 = i10;
        } else if (j10 < q2.f47326n) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i11 = j10 < j.f46409j ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
                i11 = i10;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i11 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
                i11 = i10;
            }
        } else if (j10 < 100000000000000000L) {
            i11 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i11 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i11++;
        }
        Segment segmentWritableSegment$okio = commonWriteDecimalLong.writableSegment$okio(i11);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i12 = segmentWritableSegment$okio.limit + i11;
        while (j10 != 0) {
            long j11 = 10;
            i12--;
            bArr[i12] = getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i12 - 1] = (byte) 45;
        }
        segmentWritableSegment$okio.limit += i11;
        commonWriteDecimalLong.setSize$okio(commonWriteDecimalLong.size() + ((long) i11));
        return commonWriteDecimalLong;
    }

    @d
    public static final Buffer commonWriteHexadecimalUnsignedLong(@d Buffer commonWriteHexadecimalUnsignedLong, long j10) {
        f0.p(commonWriteHexadecimalUnsignedLong, "$this$commonWriteHexadecimalUnsignedLong");
        if (j10 == 0) {
            return commonWriteHexadecimalUnsignedLong.writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = commonWriteHexadecimalUnsignedLong.writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        commonWriteHexadecimalUnsignedLong.setSize$okio(commonWriteHexadecimalUnsignedLong.size() + ((long) i10));
        return commonWriteHexadecimalUnsignedLong;
    }

    @d
    public static final Buffer commonWriteInt(@d Buffer commonWriteInt, int i10) {
        f0.p(commonWriteInt, "$this$commonWriteInt");
        Segment segmentWritableSegment$okio = commonWriteInt.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i14 + 1;
        commonWriteInt.setSize$okio(commonWriteInt.size() + 4);
        return commonWriteInt;
    }

    @d
    public static final Buffer commonWriteLong(@d Buffer commonWriteLong, long j10) {
        f0.p(commonWriteLong, "$this$commonWriteLong");
        Segment segmentWritableSegment$okio = commonWriteLong.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        segmentWritableSegment$okio.limit = i17 + 1;
        commonWriteLong.setSize$okio(commonWriteLong.size() + 8);
        return commonWriteLong;
    }

    @d
    public static final Buffer commonWriteShort(@d Buffer commonWriteShort, int i10) {
        f0.p(commonWriteShort, "$this$commonWriteShort");
        Segment segmentWritableSegment$okio = commonWriteShort.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i12 + 1;
        commonWriteShort.setSize$okio(commonWriteShort.size() + 2);
        return commonWriteShort;
    }

    @d
    public static final Buffer commonWriteUtf8(@d Buffer commonWriteUtf8, @d String string, int i10, int i11) {
        f0.p(commonWriteUtf8, "$this$commonWriteUtf8");
        f0.p(string, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt = string.charAt(i10);
            if (cCharAt < 128) {
                Segment segmentWritableSegment$okio = commonWriteUtf8.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i12 = segmentWritableSegment$okio.limit - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt;
                while (i13 < iMin) {
                    char cCharAt2 = string.charAt(i13);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i13 + i12] = (byte) cCharAt2;
                    i13++;
                }
                int i14 = segmentWritableSegment$okio.limit;
                int i15 = (i12 + i13) - i14;
                segmentWritableSegment$okio.limit = i14 + i15;
                commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + ((long) i15));
                i10 = i13;
            } else {
                if (cCharAt < 2048) {
                    Segment segmentWritableSegment$okio2 = commonWriteUtf8.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i16 = segmentWritableSegment$okio2.limit;
                    bArr2[i16] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio2.limit = i16 + 2;
                    commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    Segment segmentWritableSegment$okio3 = commonWriteUtf8.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i17 = segmentWritableSegment$okio3.limit;
                    bArr3[i17] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio3.limit = i17 + 3;
                    commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        commonWriteUtf8.writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = commonWriteUtf8.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i20 = segmentWritableSegment$okio4.limit;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i20 + 4;
                        commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return commonWriteUtf8;
    }

    @d
    public static final Buffer commonWriteUtf8CodePoint(@d Buffer commonWriteUtf8CodePoint, int i10) {
        f0.p(commonWriteUtf8CodePoint, "$this$commonWriteUtf8CodePoint");
        if (i10 < 128) {
            commonWriteUtf8CodePoint.writeByte(i10);
        } else if (i10 < 2048) {
            Segment segmentWritableSegment$okio = commonWriteUtf8CodePoint.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i11 = segmentWritableSegment$okio.limit;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio.limit = i11 + 2;
            commonWriteUtf8CodePoint.setSize$okio(commonWriteUtf8CodePoint.size() + 2);
        } else if (55296 <= i10 && 57343 >= i10) {
            commonWriteUtf8CodePoint.writeByte(63);
        } else if (i10 < 65536) {
            Segment segmentWritableSegment$okio2 = commonWriteUtf8CodePoint.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i12 = segmentWritableSegment$okio2.limit;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio2.limit = i12 + 3;
            commonWriteUtf8CodePoint.setSize$okio(commonWriteUtf8CodePoint.size() + 3);
        } else {
            if (i10 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i10));
            }
            Segment segmentWritableSegment$okio3 = commonWriteUtf8CodePoint.writableSegment$okio(4);
            byte[] bArr3 = segmentWritableSegment$okio3.data;
            int i13 = segmentWritableSegment$okio3.limit;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio3.limit = i13 + 4;
            commonWriteUtf8CodePoint.setSize$okio(commonWriteUtf8CodePoint.size() + 4);
        }
        return commonWriteUtf8CodePoint;
    }

    @d
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@d Segment segment, int i10, @d byte[] bytes, int i11, int i12) {
        f0.p(segment, "segment");
        f0.p(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                f0.m(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @d
    public static final String readUtf8Line(@d Buffer readUtf8Line, long j10) throws EOFException {
        f0.p(readUtf8Line, "$this$readUtf8Line");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (readUtf8Line.getByte(j11) == ((byte) 13)) {
                String utf8 = readUtf8Line.readUtf8(j11);
                readUtf8Line.skip(2L);
                return utf8;
            }
        }
        String utf9 = readUtf8Line.readUtf8(j10);
        readUtf8Line.skip(1L);
        return utf9;
    }

    public static final <T> T seek(@d Buffer seek, long j10, @d p<? super Segment, ? super Long, ? extends T> lambda) {
        f0.p(seek, "$this$seek");
        f0.p(lambda, "lambda");
        Segment segment = seek.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (seek.size() - j10 < j10) {
            long size = seek.size();
            while (size > j10) {
                segment = segment.prev;
                f0.m(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                return lambda.invoke(segment, Long.valueOf(j11));
            }
            segment = segment.next;
            f0.m(segment);
            j11 = j12;
        }
    }

    public static final int selectPrefix(@d Buffer selectPrefix, @d Options options, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        Segment segment;
        f0.p(selectPrefix, "$this$selectPrefix");
        f0.p(options, "options");
        Segment segment2 = selectPrefix.head;
        if (segment2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i14 = segment2.pos;
        int i15 = segment2.limit;
        int[] trie$okio = options.getTrie();
        Segment segment3 = segment2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = trie$okio[i17];
            int i20 = i18 + 1;
            int i21 = trie$okio[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (segment3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == trie$okio[i20]) {
                        i11 = trie$okio[i20 + i19];
                        if (i10 == i15) {
                            segment3 = segment3.next;
                            f0.m(segment3);
                            i10 = segment3.pos;
                            bArr = segment3.data;
                            i15 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != trie$okio[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    f0.m(segment3);
                    Segment segment4 = segment3.next;
                    f0.m(segment4);
                    i13 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i12 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    Segment segment5 = segment3;
                    i12 = i15;
                    i13 = i25;
                    segment = segment5;
                }
                if (z11) {
                    i11 = trie$okio[i26];
                    i10 = i13;
                    i15 = i12;
                    segment3 = segment;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i20 = i26;
                segment3 = segment;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return selectPrefix(buffer, options, z10);
    }
}
