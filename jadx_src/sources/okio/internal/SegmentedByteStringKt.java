package okio.internal;

import androidx.constraintlayout.core.motion.utils.w;
import dl.d;
import dl.e;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import okio.Buffer;
import okio.ByteString;
import okio.Segment;
import okio.SegmentedByteString;
import okio.Util;
import yh.q;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a]\u0010\u0012\u001a\u00020\u0010*\u00020\u00062K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0080\bø\u0001\u0000\u001aj\u0010\u0012\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0082\b\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0018\u001a\u00020\u0017*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\n*\u00020\u0006H\u0080\b\u001a%\u0010\u001d\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010!\u001a\u00020 *\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010!\u001a\u00020 *\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010#\u001a\u00020 *\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\"H\u0080\b\u001a\r\u0010$\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"", "", "value", "fromIndex", "toIndex", "binarySearch", "Lokio/SegmentedByteString;", "pos", "segment", "Lkotlin/Function3;", "", "Lkotlin/m0;", "name", "data", w.c.R, "byteCount", "Lkotlin/b2;", "action", "forEachSegment", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "Lokio/ByteString;", "commonSubstring", "", "commonInternalGet", "commonGetSize", "commonToByteArray", "Lokio/Buffer;", "buffer", "commonWrite", "other", "otherOffset", "", "commonRangeEquals", "", "commonEquals", "commonHashCode", "okio"}, k = 2, mv = {1, 4, 0})
public final class SegmentedByteStringKt {
    public static final int binarySearch(@d int[] binarySearch, int i10, int i11, int i12) {
        f0.p(binarySearch, "$this$binarySearch");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = binarySearch[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final boolean commonEquals(@d SegmentedByteString commonEquals, @e Object obj) {
        f0.p(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.size() && commonEquals.rangeEquals(0, byteString, 0, commonEquals.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@d SegmentedByteString commonGetSize) {
        f0.p(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getDirectory()[commonGetSize.getSegments().length - 1];
    }

    public static final int commonHashCode(@d SegmentedByteString commonHashCode) {
        f0.p(commonHashCode, "$this$commonHashCode");
        int hashCode = commonHashCode.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = commonHashCode.getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = commonHashCode.getDirectory()[length + i10];
            int i14 = commonHashCode.getDirectory()[i10];
            byte[] bArr = commonHashCode.getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        commonHashCode.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(@d SegmentedByteString commonInternalGet, int i10) {
        f0.p(commonInternalGet, "$this$commonInternalGet");
        Util.checkOffsetAndCount(commonInternalGet.getDirectory()[commonInternalGet.getSegments().length - 1], i10, 1L);
        int iSegment = segment(commonInternalGet, i10);
        return commonInternalGet.getSegments()[iSegment][(i10 - (iSegment == 0 ? 0 : commonInternalGet.getDirectory()[iSegment - 1])) + commonInternalGet.getDirectory()[commonInternalGet.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@d SegmentedByteString commonRangeEquals, int i10, @d ByteString other, int i11, int i12) {
        f0.p(commonRangeEquals, "$this$commonRangeEquals");
        f0.p(other, "other");
        if (i10 < 0 || i10 > commonRangeEquals.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(commonRangeEquals, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory()[iSegment - 1];
            int i15 = commonRangeEquals.getDirectory()[iSegment] - i14;
            int i16 = commonRangeEquals.getDirectory()[commonRangeEquals.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, commonRangeEquals.getSegments()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(@d SegmentedByteString commonRangeEquals, int i10, @d byte[] other, int i11, int i12) {
        f0.p(commonRangeEquals, "$this$commonRangeEquals");
        f0.p(other, "other");
        if (i10 < 0 || i10 > commonRangeEquals.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(commonRangeEquals, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory()[iSegment - 1];
            int i15 = commonRangeEquals.getDirectory()[iSegment] - i14;
            int i16 = commonRangeEquals.getDirectory()[commonRangeEquals.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!Util.arrayRangeEquals(commonRangeEquals.getSegments()[iSegment], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    @d
    public static final ByteString commonSubstring(@d SegmentedByteString commonSubstring, int i10, int i11) {
        f0.p(commonSubstring, "$this$commonSubstring");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (!(i11 <= commonSubstring.size())) {
            throw new IllegalArgumentException(("endIndex=" + i11 + " > length(" + commonSubstring.size() + ')').toString());
        }
        int i12 = i11 - i10;
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + i11 + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && i11 == commonSubstring.size()) {
            return commonSubstring;
        }
        if (i10 == i11) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(commonSubstring, i10);
        int iSegment2 = segment(commonSubstring, i11 - 1);
        byte[][] bArr = (byte[][]) m.M1(commonSubstring.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = 0;
            int i14 = iSegment;
            while (true) {
                iArr[i13] = Math.min(commonSubstring.getDirectory()[i14] - i10, i12);
                int i15 = i13 + 1;
                iArr[i13 + bArr.length] = commonSubstring.getDirectory()[commonSubstring.getSegments().length + i14];
                if (i14 == iSegment2) {
                    break;
                }
                i14++;
                i13 = i15;
            }
        }
        int i16 = iSegment != 0 ? commonSubstring.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new SegmentedByteString(bArr, iArr);
    }

    @d
    public static final byte[] commonToByteArray(@d SegmentedByteString commonToByteArray) {
        f0.p(commonToByteArray, "$this$commonToByteArray");
        byte[] bArr = new byte[commonToByteArray.size()];
        int length = commonToByteArray.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = commonToByteArray.getDirectory()[length + i10];
            int i14 = commonToByteArray.getDirectory()[i10];
            int i15 = i14 - i11;
            m.W0(commonToByteArray.getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(@d SegmentedByteString commonWrite, @d Buffer buffer, int i10, int i11) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(buffer, "buffer");
        int i12 = i11 + i10;
        int iSegment = segment(commonWrite, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : commonWrite.getDirectory()[iSegment - 1];
            int i14 = commonWrite.getDirectory()[iSegment] - i13;
            int i15 = commonWrite.getDirectory()[commonWrite.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(commonWrite.getSegments()[iSegment], i16, i16 + iMin, true, false);
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
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) commonWrite.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachSegment(SegmentedByteString segmentedByteString, int i10, int i11, q<? super byte[], ? super Integer, ? super Integer, b2> qVar) {
        int iSegment = segment(segmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : segmentedByteString.getDirectory()[iSegment - 1];
            int i13 = segmentedByteString.getDirectory()[iSegment] - i12;
            int i14 = segmentedByteString.getDirectory()[segmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            qVar.invoke(segmentedByteString.getSegments()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final void forEachSegment(@d SegmentedByteString forEachSegment, @d q<? super byte[], ? super Integer, ? super Integer, b2> action) {
        f0.p(forEachSegment, "$this$forEachSegment");
        f0.p(action, "action");
        int length = forEachSegment.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = forEachSegment.getDirectory()[length + i10];
            int i13 = forEachSegment.getDirectory()[i10];
            action.invoke(forEachSegment.getSegments()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(@d SegmentedByteString segment, int i10) {
        f0.p(segment, "$this$segment");
        int iBinarySearch = binarySearch(segment.getDirectory(), i10 + 1, 0, segment.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }
}
