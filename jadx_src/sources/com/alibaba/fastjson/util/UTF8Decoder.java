package com.alibaba.fastjson.util;

import bb.c;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public class UTF8Decoder extends CharsetDecoder {
    private static final Charset charset = Charset.forName("UTF-8");

    public static class Surrogate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final int UCS4_MAX = 1114111;
        public static final int UCS4_MIN = 65536;

        private Surrogate() {
        }

        public static char high(int i10) {
            return (char) ((((i10 - 65536) >> 10) & 1023) | 55296);
        }

        public static char low(int i10) {
            return (char) (((i10 - 65536) & 1023) | Utf8.LOG_SURROGATE_HEADER);
        }

        public static boolean neededFor(int i10) {
            return i10 >= 65536 && i10 <= 1114111;
        }
    }

    public UTF8Decoder() {
        super(charset, 1.0f, 1.0f);
    }

    private CoderResult decodeArrayLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        int i10;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iArrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
        char[] cArrArray = charBuffer.array();
        int iArrayOffset3 = charBuffer.arrayOffset() + charBuffer.position();
        int iArrayOffset4 = charBuffer.arrayOffset() + charBuffer.limit();
        int iMin = Math.min(iArrayOffset2 - iArrayOffset, iArrayOffset4 - iArrayOffset3) + iArrayOffset3;
        while (iArrayOffset3 < iMin) {
            byte b10 = bArrArray[iArrayOffset];
            if (b10 < 0) {
                break;
            }
            iArrayOffset++;
            cArrArray[iArrayOffset3] = (char) b10;
            iArrayOffset3++;
        }
        int i11 = iArrayOffset;
        while (true) {
            int i12 = iArrayOffset3;
            while (i11 < iArrayOffset2) {
                byte b11 = bArrArray[i11];
                if (b11 < 0) {
                    if ((b11 >> 5) == -2) {
                        if (iArrayOffset2 - i11 < 2 || i12 >= iArrayOffset4) {
                            return xflow(byteBuffer, i11, iArrayOffset2, charBuffer, i12, 2);
                        }
                        byte b12 = bArrArray[i11 + 1];
                        if (isMalformed2(b11, b12)) {
                            return malformed(byteBuffer, i11, charBuffer, i12, 2);
                        }
                        i10 = i12 + 1;
                        cArrArray[i12] = (char) (((b11 << 6) ^ b12) ^ 3968);
                        i11 += 2;
                    } else if ((b11 >> 4) == -2) {
                        if (iArrayOffset2 - i11 < 3 || i12 >= iArrayOffset4) {
                            return xflow(byteBuffer, i11, iArrayOffset2, charBuffer, i12, 3);
                        }
                        byte b13 = bArrArray[i11 + 1];
                        byte b14 = bArrArray[i11 + 2];
                        if (isMalformed3(b11, b13, b14)) {
                            return malformed(byteBuffer, i11, charBuffer, i12, 3);
                        }
                        i10 = i12 + 1;
                        cArrArray[i12] = (char) ((((b11 << 12) ^ (b13 << 6)) ^ b14) ^ c.k.f33632j3);
                        i11 += 3;
                    } else {
                        if ((b11 >> 3) != -2) {
                            return malformed(byteBuffer, i11, charBuffer, i12, 1);
                        }
                        if (iArrayOffset2 - i11 < 4 || iArrayOffset4 - i12 < 2) {
                            return xflow(byteBuffer, i11, iArrayOffset2, charBuffer, i12, 4);
                        }
                        byte b15 = bArrArray[i11 + 1];
                        byte b16 = bArrArray[i11 + 2];
                        byte b17 = bArrArray[i11 + 3];
                        int i13 = ((b11 & 7) << 18) | ((b15 & Utf8.REPLACEMENT_BYTE) << 12) | ((b16 & Utf8.REPLACEMENT_BYTE) << 6) | (b17 & Utf8.REPLACEMENT_BYTE);
                        if (isMalformed4(b15, b16, b17) || !Surrogate.neededFor(i13)) {
                            return malformed(byteBuffer, i11, charBuffer, i12, 4);
                        }
                        int i14 = i12 + 1;
                        cArrArray[i12] = Surrogate.high(i13);
                        i10 = i14 + 1;
                        cArrArray[i14] = Surrogate.low(i13);
                        i11 += 4;
                    }
                    i12 = i10;
                } else {
                    if (i12 >= iArrayOffset4) {
                        return xflow(byteBuffer, i11, iArrayOffset2, charBuffer, i12, 1);
                    }
                    iArrayOffset3 = i12 + 1;
                    cArrArray[i12] = (char) b11;
                    i11++;
                }
            }
            return xflow(byteBuffer, i11, iArrayOffset2, charBuffer, i12, 0);
        }
    }

    private static boolean isMalformed2(int i10, int i11) {
        return (i10 & 30) == 0 || (i11 & 192) != 128;
    }

    private static boolean isMalformed3(int i10, int i11, int i12) {
        return ((i10 != -32 || (i11 & 224) != 128) && (i11 & 192) == 128 && (i12 & 192) == 128) ? false : true;
    }

    private static boolean isMalformed4(int i10, int i11, int i12) {
        return ((i10 & 192) == 128 && (i11 & 192) == 128 && (i12 & 192) == 128) ? false : true;
    }

    private static boolean isNotContinuation(int i10) {
        return (i10 & 192) != 128;
    }

    private static CoderResult lookupN(ByteBuffer byteBuffer, int i10) {
        for (int i11 = 1; i11 < i10; i11++) {
            if (isNotContinuation(byteBuffer.get())) {
                return CoderResult.malformedForLength(i11);
            }
        }
        return CoderResult.malformedForLength(i10);
    }

    private static CoderResult malformed(ByteBuffer byteBuffer, int i10, CharBuffer charBuffer, int i11, int i12) {
        byteBuffer.position(i10 - byteBuffer.arrayOffset());
        CoderResult coderResultMalformedN = malformedN(byteBuffer, i12);
        updatePositions(byteBuffer, i10, charBuffer, i11);
        return coderResultMalformedN;
    }

    public static CoderResult malformedN(ByteBuffer byteBuffer, int i10) {
        int i11 = 1;
        if (i10 == 1) {
            byte b10 = byteBuffer.get();
            if ((b10 >> 2) == -2) {
                return byteBuffer.remaining() < 4 ? CoderResult.UNDERFLOW : lookupN(byteBuffer, 5);
            }
            if ((b10 >> 1) == -2) {
                return byteBuffer.remaining() < 5 ? CoderResult.UNDERFLOW : lookupN(byteBuffer, 6);
            }
            return CoderResult.malformedForLength(1);
        }
        if (i10 == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i10 == 3) {
            byte b11 = byteBuffer.get();
            byte b12 = byteBuffer.get();
            if ((b11 != -32 || (b12 & 224) != 128) && !isNotContinuation(b12)) {
                i11 = 2;
            }
            return CoderResult.malformedForLength(i11);
        }
        if (i10 != 4) {
            throw new IllegalStateException();
        }
        int i12 = byteBuffer.get() & 255;
        int i13 = byteBuffer.get() & 255;
        if (i12 > 244 || ((i12 == 240 && (i13 < 144 || i13 > 191)) || ((i12 == 244 && (i13 & 240) != 128) || isNotContinuation(i13)))) {
            return CoderResult.malformedForLength(1);
        }
        return isNotContinuation(byteBuffer.get()) ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
    }

    static void updatePositions(Buffer buffer, int i10, Buffer buffer2, int i11) {
        buffer.position(i10);
        buffer2.position(i11);
    }

    private static CoderResult xflow(Buffer buffer, int i10, int i11, Buffer buffer2, int i12, int i13) {
        updatePositions(buffer, i10, buffer2, i12);
        return (i13 == 0 || i11 - i10 < i13) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    @Override // java.nio.charset.CharsetDecoder
    protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        return decodeArrayLoop(byteBuffer, charBuffer);
    }
}
