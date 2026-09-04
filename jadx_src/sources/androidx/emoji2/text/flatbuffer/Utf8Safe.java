package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Utf8Safe extends Utf8 {

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    private static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iK = length;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt >= 2048) {
                iK += k(charSequence, i10);
                break;
            }
            iK += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iK >= length) {
            return iK;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iK) + 4294967296L));
    }

    public static String g(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!Utf8.a.g(b10)) {
                break;
            }
            i10++;
            Utf8.a.b(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (Utf8.a.g(b11)) {
                int i16 = i14 + 1;
                Utf8.a.b(b11, cArr, i14);
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    if (!Utf8.a.g(b12)) {
                        break;
                    }
                    i15++;
                    Utf8.a.b(b12, cArr, i16);
                    i16++;
                }
                i10 = i15;
                i14 = i16;
            } else if (Utf8.a.i(b11)) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                Utf8.a.d(b11, bArr[i15], cArr, i14);
                i10 = i15 + 1;
                i14++;
            } else if (Utf8.a.h(b11)) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = i15 + 1;
                Utf8.a.c(b11, bArr[i15], bArr[i17], cArr, i14);
                i10 = i17 + 1;
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = i15 + 1;
                byte b13 = bArr[i15];
                int i19 = i18 + 1;
                Utf8.a.a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                i10 = i19 + 1;
                i14 = i14 + 1 + 1;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static String h(ByteBuffer byteBuffer, int i10, int i11) {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (!Utf8.a.g(b10)) {
                break;
            }
            i10++;
            Utf8.a.b(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (Utf8.a.g(b11)) {
                int i16 = i14 + 1;
                Utf8.a.b(b11, cArr, i14);
                while (i15 < i12) {
                    byte b12 = byteBuffer.get(i15);
                    if (!Utf8.a.g(b12)) {
                        break;
                    }
                    i15++;
                    Utf8.a.b(b12, cArr, i16);
                    i16++;
                }
                i10 = i15;
                i14 = i16;
            } else if (Utf8.a.i(b11)) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                Utf8.a.d(b11, byteBuffer.get(i15), cArr, i14);
                i10 = i15 + 1;
                i14++;
            } else if (Utf8.a.h(b11)) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = i15 + 1;
                Utf8.a.c(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                i10 = i17 + 1;
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = i15 + 1;
                byte b13 = byteBuffer.get(i15);
                int i19 = i18 + 1;
                Utf8.a.a(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                i10 = i19 + 1;
                i14 = i14 + 1 + 1;
            }
        }
        return new String(cArr, 0, i14);
    }

    private static int i(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 >= 128 || i17 >= i15) {
                if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | bb.c.b.f31065yf);
                    i17 = i18 + 1;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                throw new UnpairedSurrogateException(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                        }
                        int i19 = i16 + 1;
                        if (i19 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i20 = i17 + 1;
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                int i21 = i20 + 1;
                                bArr[i20] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i22 = i21 + 1;
                                bArr[i21] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 = i22 + 1;
                                bArr[i22] = (byte) ((codePoint & 63) | 128);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new UnpairedSurrogateException(i16 - 1, length);
                    }
                    int i23 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i24 = i23 + 1;
                    bArr[i23] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i12 = i24 + 1;
                    bArr[i24] = (byte) ((cCharAt2 & '?') | 128);
                }
                i16++;
            } else {
                i12 = i17 + 1;
                bArr[i17] = (byte) cCharAt2;
            }
            i17 = i12;
            i16++;
        }
        return i17;
    }

    private static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i10 = 0;
        while (i10 < length) {
            try {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i10, (byte) cCharAt);
                i10++;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (i10 == length) {
            byteBuffer.position(iPosition + i10);
            return;
        }
        iPosition += i10;
        while (i10 < length) {
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i11 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i11;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i11;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i13 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    iPosition = i13 + 1;
                                    byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    i13 = iPosition + 1;
                                    byteBuffer.put(iPosition, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i13, (byte) ((codePoint & 63) | 128));
                                    iPosition = i13;
                                    i10 = i12;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i13;
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                        i10 = i12;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
                    }
                    throw new UnpairedSurrogateException(i10, length);
                }
                int i14 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition = i14 + 1;
                byteBuffer.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i10++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    private static int k(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new UnpairedSurrogateException(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String a(ByteBuffer byteBuffer, int i10, int i11) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? g(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11) : h(byteBuffer, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            j(charSequence, byteBuffer);
        } else {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(i(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int c(CharSequence charSequence) {
        return f(charSequence);
    }
}
