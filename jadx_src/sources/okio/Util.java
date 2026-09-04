package okio;

import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.x1;
import okio.internal.ByteStringKt;
import xh.h;

/* JADX INFO: renamed from: okio.-Util, reason: invalid class name */
/* JADX INFO: compiled from: -Util.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "-Util")
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0015\u0010\u000b\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\f\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\r\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0080\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0080\f\u001a\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0080\b\u001a0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\tH\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\bH\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0000¨\u0006\u0018"}, d2 = {"", UiKitSpanObj.TYPE_SIZE, w.c.R, "byteCount", "Lkotlin/b2;", "checkOffsetAndCount", "", "reverseBytes", "", "", "other", "shr", "shl", "and", ak.av, "b", "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "", "toHexString", "okio"}, k = 2, mv = {1, 4, 0})
public final class Util {
    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final long and(byte b10, long j10) {
        return ((long) b10) & j10;
    }

    public static final long and(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final boolean arrayRangeEquals(@d byte[] a10, int i10, @d byte[] b10, int i11, int i12) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final long minOf(int i10, long j10) {
        return Math.min(i10, j10);
    }

    public static final long minOf(long j10, int i10) {
        return Math.min(j10, i10);
    }

    public static final int reverseBytes(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long reverseBytes(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short reverseBytes(short s10) {
        int i10 = s10 & x1.f128661e;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static final int shl(byte b10, int i10) {
        return b10 << i10;
    }

    public static final int shr(byte b10, int i10) {
        return b10 >> i10;
    }

    @d
    public static final String toHexString(byte b10) {
        return new String(new char[]{ByteStringKt.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[b10 & 15]});
    }

    @d
    public static final String toHexString(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(i10 >> 28) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i10 >> 24) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i10 >> 20) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i10 >> 16) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i10 >> 12) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i10 >> 8) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i10 >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return new String(cArr, i11, 8 - i11);
    }

    @d
    public static final String toHexString(long j10) {
        if (j10 == 0) {
            return "0";
        }
        int i10 = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 60) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 56) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 52) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 48) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 44) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 40) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 36) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 32) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 28) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 24) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 20) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 16) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 12) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 8) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j10 >> 4) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) (j10 & 15)]};
        while (i10 < 16 && cArr[i10] == '0') {
            i10++;
        }
        return new String(cArr, i10, 16 - i10);
    }
}
