package okio;

import androidx.constraintlayout.core.motion.utils.w;
import dl.d;
import dl.e;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import okio.internal.SegmentedByteStringKt;
import org.apache.tools.ant.taskdefs.optional.ejb.g;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0>\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bH\u0010IJ\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016J\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001f\u0010 J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u0010\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016J'\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0010¢\u0006\u0004\b.\u0010/J(\u00103\u001a\u0002022\u0006\u0010,\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016J(\u00103\u001a\u0002022\u0006\u0010,\u001a\u00020\u00162\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016J\u0018\u00105\u001a\u00020\u00162\u0006\u00100\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0016H\u0016J\u0018\u00106\u001a\u00020\u00162\u0006\u00100\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0016H\u0016J\u000f\u00109\u001a\u00020\"H\u0010¢\u0006\u0004\b7\u00108J\u0013\u0010;\u001a\u0002022\b\u00100\u001a\u0004\u0018\u00010:H\u0096\u0002J\b\u0010<\u001a\u00020\u0016H\u0016J\b\u0010=\u001a\u00020\u0007H\u0016R \u0010?\u001a\b\u0012\u0004\u0012\u00020\"0>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "toByteString", "Ljava/lang/Object;", "writeReplace", "Ljava/nio/charset/Charset;", "charset", "", w.b.f17895e, "base64", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "", "toByteArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "out", "Lkotlin/b2;", "write", "Lokio/Buffer;", "buffer", w.c.R, "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "fromIndex", "indexOf", "lastIndexOf", "internalArray$okio", "()[B", "internalArray", "", "equals", "hashCode", "toString", "", "segments", "[[B", "getSegments$okio", "()[[B", "", g.d.f134963d, "[I", "getDirectory$okio", "()[I", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class SegmentedByteString extends ByteString {

    @d
    private final transient int[] directory;

    @d
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(@d byte[][] segments, @d int[] directory) {
        super(ByteString.EMPTY.getData());
        f0.p(segments, "segments");
        f0.p(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        if (byteString != null) {
            return byteString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // okio.ByteString
    @d
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        f0.o(byteBufferAsReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    @d
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    @d
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    @d
    public ByteString digest$okio(@d String algorithm) throws NoSuchAlgorithmException {
        f0.p(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            messageDigest.update(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        f0.o(bArrDigest, "digest.digest()");
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public boolean equals(@e Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ByteString) {
            ByteString byteString = (ByteString) other;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @d
    /* JADX INFO: renamed from: getDirectory$okio, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    @d
    /* JADX INFO: renamed from: getSegments$okio, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            byte[] bArr = getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        setHashCode$okio(i11);
        return i11;
    }

    @Override // okio.ByteString
    @d
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    @d
    public ByteString hmac$okio(@d String algorithm, @d ByteString key) throws NoSuchAlgorithmException {
        f0.p(algorithm, "algorithm");
        f0.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments().length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = getDirectory()[length + i10];
                int i13 = getDirectory()[i10];
                mac.update(getSegments()[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            byte[] bArrDoFinal = mac.doFinal();
            f0.o(bArrDoFinal, "mac.doFinal()");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // okio.ByteString
    public int indexOf(@d byte[] other, int fromIndex) {
        f0.p(other, "other");
        return toByteString().indexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    @d
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int pos) {
        Util.checkOffsetAndCount(getDirectory()[getSegments().length - 1], pos, 1L);
        int iSegment = SegmentedByteStringKt.segment(this, pos);
        return getSegments()[iSegment][(pos - (iSegment == 0 ? 0 : getDirectory()[iSegment - 1])) + getDirectory()[getSegments().length + iSegment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(@d byte[] other, int fromIndex) {
        f0.p(other, "other");
        return toByteString().lastIndexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, @d ByteString other, int otherOffset, int byteCount) {
        f0.p(other, "other");
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iSegment = SegmentedByteStringKt.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!other.rangeEquals(otherOffset, getSegments()[iSegment], i13 + (offset - i11), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, @d byte[] other, int otherOffset, int byteCount) {
        f0.p(other, "other");
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iSegment = SegmentedByteStringKt.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!Util.arrayRangeEquals(getSegments()[iSegment], i13 + (offset - i11), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    @d
    public String string(@d Charset charset) {
        f0.p(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    @d
    public ByteString substring(int beginIndex, int endIndex) {
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + beginIndex + " < 0").toString());
        }
        if (!(endIndex <= size())) {
            throw new IllegalArgumentException(("endIndex=" + endIndex + " > length(" + size() + ')').toString());
        }
        int i10 = endIndex - beginIndex;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + endIndex + " < beginIndex=" + beginIndex).toString());
        }
        if (beginIndex == 0 && endIndex == size()) {
            return this;
        }
        if (beginIndex == endIndex) {
            return ByteString.EMPTY;
        }
        int iSegment = SegmentedByteStringKt.segment(this, beginIndex);
        int iSegment2 = SegmentedByteStringKt.segment(this, endIndex - 1);
        byte[][] bArr = (byte[][]) m.M1(getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i11 = 0;
            int i12 = iSegment;
            while (true) {
                iArr[i11] = Math.min(getDirectory()[i12] - beginIndex, i10);
                int i13 = i11 + 1;
                iArr[i11 + bArr.length] = getDirectory()[getSegments().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i11 = i13;
            }
        }
        int i14 = iSegment != 0 ? getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (beginIndex - i14);
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    @d
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    @d
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    @d
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            int i15 = i14 - i11;
            m.W0(getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.ByteString
    @d
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(@d OutputStream out) throws IOException {
        f0.p(out, "out");
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            out.write(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
    }

    @Override // okio.ByteString
    public void write$okio(@d Buffer buffer, int offset, int byteCount) {
        f0.p(buffer, "buffer");
        int i10 = byteCount + offset;
        int iSegment = SegmentedByteStringKt.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = i13 + (offset - i11);
            Segment segment = new Segment(getSegments()[iSegment], i14, i14 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                f0.m(segment2);
                Segment segment3 = segment2.prev;
                f0.m(segment3);
                segment3.push(segment);
            }
            offset += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) size()));
    }
}
