package androidx.p001datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f22342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22343b = -9187201950435737472L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f22344c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22345d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22346e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22347f = 16;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    public static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (m(b11) || (((b10 << com.google.common.base.a.F) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw InvalidProtocolBufferException.d();
            }
            int iR = ((b10 & 7) << 18) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
            cArr[i10] = l(iR);
            cArr[i10 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m(b12)))) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b10 < -62 || m(b11)) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | r(b11));
        }

        private static char l(int i10) {
            return (char) ((i10 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean m(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b10) {
            return b10 < -32;
        }

        private static char q(int i10) {
            return (char) ((i10 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int r(byte b10) {
            return b10 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static abstract class b {
        b() {
        }

        private static int m(ByteBuffer byteBuffer, int i10, int i11) {
            int iM = i10 + Utf8.m(byteBuffer, i10, i11);
            while (iM < i11) {
                int i12 = iM + 1;
                byte b10 = byteBuffer.get(iM);
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 < -62 || byteBuffer.get(i12) > -65) {
                            return -1;
                        }
                        i12++;
                    } else {
                        if (b10 >= -16) {
                            if (i12 >= i11 - 2) {
                                return Utf8.q(byteBuffer, b10, i12, i11 - i12);
                            }
                            int i13 = i12 + 1;
                            byte b11 = byteBuffer.get(i12);
                            if (b11 <= -65 && (((b10 << com.google.common.base.a.F) + (b11 + 112)) >> 30) == 0) {
                                int i14 = i13 + 1;
                                if (byteBuffer.get(i13) <= -65) {
                                    i12 = i14 + 1;
                                    if (byteBuffer.get(i14) > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i12 >= i11 - 1) {
                            return Utf8.q(byteBuffer, b10, i12, i11 - i12);
                        }
                        int i15 = i12 + 1;
                        byte b12 = byteBuffer.get(i12);
                        if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || byteBuffer.get(i15) > -65))) {
                            return -1;
                        }
                        iM = i15 + 1;
                    }
                }
                iM = i12;
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i10, i11) : c(byteBuffer, i10, i11);
        }

        abstract String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        final String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!a.n(b10)) {
                    break;
                }
                i10++;
                a.i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (a.n(b11)) {
                    int i16 = i14 + 1;
                    a.i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = byteBuffer.get(i15);
                        if (!a.n(b12)) {
                            break;
                        }
                        i15++;
                        a.i(b12, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.p(b11)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a.k(b11, byteBuffer.get(i15), cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i17 = i15 + 1;
                    a.j(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i18 = i15 + 1;
                    byte b13 = byteBuffer.get(i15);
                    int i19 = i18 + 1;
                    a.h(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        abstract String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException;

        abstract int e(CharSequence charSequence, byte[] bArr, int i10, int i11);

        final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.i(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                h(charSequence, byteBuffer);
            } else {
                g(charSequence, byteBuffer);
            }
        }

        final void g(CharSequence charSequence, ByteBuffer byteBuffer) {
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

        abstract void h(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean i(ByteBuffer byteBuffer, int i10, int i11) {
            return k(0, byteBuffer, i10, i11) == 0;
        }

        final boolean j(byte[] bArr, int i10, int i11) {
            return l(0, bArr, i10, i11) == 0;
        }

        final int k(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? o(i10, byteBuffer, i11, i12) : n(i10, byteBuffer, i11, i12);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return l(i10, byteBuffer.array(), i11 + iArrayOffset, iArrayOffset + i12);
        }

        abstract int l(int i10, byte[] bArr, int i11, int i12);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
        
            if (r8.get(r9) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int n(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L8e
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L8e
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = androidx.p001datastore.preferences.protobuf.Utf8.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L65
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L63
                int r7 = androidx.p001datastore.preferences.protobuf.Utf8.a(r0, r1)
                return r7
            L63:
                r9 = r7
                goto L68
            L65:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L68:
                if (r4 != 0) goto L78
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L77
                int r7 = androidx.p001datastore.preferences.protobuf.Utf8.b(r0, r1, r4)
                return r7
            L77:
                r9 = r7
            L78:
                if (r1 > r3) goto L8d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L8d
                if (r4 > r3) goto L8d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L8d:
                return r2
            L8e:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.b.n(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int o(int i10, ByteBuffer byteBuffer, int i11, int i12);
    }

    public static final class c extends b {
        c() {
        }

        private static int p(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return q(bArr, i10, i11);
        }

        private static int q(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return Utf8.r(bArr, i12, i11);
                        }
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && (((b10 << com.google.common.base.a.F) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i13 + 1;
                            if (bArr[i13] <= -65) {
                                i12 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return Utf8.r(bArr, i12, i11);
                    }
                    int i15 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i10 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.n(b10)) {
                    break;
                }
                i10++;
                a.i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.n(b11)) {
                    int i16 = i14 + 1;
                    a.i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!a.n(b12)) {
                            break;
                        }
                        i15++;
                        a.i(b12, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.p(b11)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a.k(b11, bArr[i15], cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i17 = i15 + 1;
                    a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    a.h(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            return c(byteBuffer, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
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

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            g(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
        
            if (r8[r9] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.p001datastore.preferences.protobuf.Utf8.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = androidx.p001datastore.preferences.protobuf.Utf8.a(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = androidx.p001datastore.preferences.protobuf.Utf8.b(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.c.l(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        int o(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            return n(i10, byteBuffer, i11, i12);
        }
    }

    public static final class d extends b {
        d() {
        }

        static boolean p() {
            return z3.S() && z3.T();
        }

        private static int q(long j10, int i10) {
            long j11;
            int iS = s(j10, i10);
            long j12 = j10 + ((long) iS);
            int i11 = i10 - iS;
            while (true) {
                byte bY = 0;
                while (i11 > 0) {
                    long j13 = j12 + 1;
                    bY = z3.y(j12);
                    if (bY < 0) {
                        j12 = j13;
                        break;
                    }
                    i11--;
                    j12 = j13;
                }
                if (i11 == 0) {
                    return 0;
                }
                int i12 = i11 - 1;
                if (bY < -32) {
                    if (i12 == 0) {
                        return bY;
                    }
                    i11 = i12 - 1;
                    if (bY >= -62) {
                        j11 = 1 + j12;
                        if (z3.y(j12) > -65) {
                        }
                    }
                    return -1;
                }
                if (bY >= -16) {
                    if (i12 < 3) {
                        return u(j12, bY, i12);
                    }
                    i11 = i12 - 3;
                    long j14 = j12 + 1;
                    byte bY2 = z3.y(j12);
                    if (bY2 <= -65 && (((bY << com.google.common.base.a.F) + (bY2 + 112)) >> 30) == 0) {
                        long j15 = j14 + 1;
                        if (z3.y(j14) <= -65) {
                            j11 = 1 + j15;
                            if (z3.y(j15) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 < 2) {
                    return u(j12, bY, i12);
                }
                i11 = i12 - 2;
                long j16 = j12 + 1;
                byte bY3 = z3.y(j12);
                if (bY3 <= -65 && ((bY != -32 || bY3 >= -96) && (bY != -19 || bY3 < -96))) {
                    j11 = 1 + j16;
                    if (z3.y(j16) > -65) {
                    }
                }
                return -1;
                j12 = j11;
            }
        }

        private static int r(byte[] bArr, long j10, int i10) {
            long j11;
            int iT = t(bArr, j10, i10);
            int i11 = i10 - iT;
            long j12 = j10 + ((long) iT);
            while (true) {
                byte bA = 0;
                while (i11 > 0) {
                    long j13 = j12 + 1;
                    bA = z3.A(bArr, j12);
                    if (bA < 0) {
                        j12 = j13;
                        break;
                    }
                    i11--;
                    j12 = j13;
                }
                if (i11 == 0) {
                    return 0;
                }
                int i12 = i11 - 1;
                if (bA < -32) {
                    if (i12 == 0) {
                        return bA;
                    }
                    i11 = i12 - 1;
                    if (bA >= -62) {
                        j11 = 1 + j12;
                        if (z3.A(bArr, j12) > -65) {
                        }
                    }
                    return -1;
                }
                if (bA >= -16) {
                    if (i12 < 3) {
                        return v(bArr, bA, j12, i12);
                    }
                    i11 = i12 - 3;
                    long j14 = j12 + 1;
                    byte bA2 = z3.A(bArr, j12);
                    if (bA2 <= -65 && (((bA << com.google.common.base.a.F) + (bA2 + 112)) >> 30) == 0) {
                        long j15 = j14 + 1;
                        if (z3.A(bArr, j14) <= -65) {
                            j11 = 1 + j15;
                            if (z3.A(bArr, j15) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 < 2) {
                    return v(bArr, bA, j12, i12);
                }
                i11 = i12 - 2;
                long j16 = j12 + 1;
                byte bA3 = z3.A(bArr, j12);
                if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                    j11 = 1 + j16;
                    if (z3.A(bArr, j16) > -65) {
                    }
                }
                return -1;
                j12 = j11;
            }
        }

        private static int s(long j10, int i10) {
            if (i10 < 16) {
                return 0;
            }
            int i11 = 8 - (((int) j10) & 7);
            int i12 = i11;
            while (i12 > 0) {
                long j11 = 1 + j10;
                if (z3.y(j10) < 0) {
                    return i11 - i12;
                }
                i12--;
                j10 = j11;
            }
            int i13 = i10 - i11;
            while (i13 >= 8 && (z3.K(j10) & (-9187201950435737472L)) == 0) {
                j10 += 8;
                i13 -= 8;
            }
            return i10 - i13;
        }

        private static int t(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            while (i11 < i10) {
                long j11 = 1 + j10;
                if (z3.A(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            return i10;
        }

        private static int u(long j10, int i10, int i11) {
            if (i11 == 0) {
                return Utf8.n(i10);
            }
            if (i11 == 1) {
                return Utf8.o(i10, z3.y(j10));
            }
            if (i11 == 2) {
                return Utf8.p(i10, z3.y(j10), z3.y(j10 + 1));
            }
            throw new AssertionError();
        }

        private static int v(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return Utf8.n(i10);
            }
            if (i11 == 1) {
                return Utf8.o(i10, z3.A(bArr, j10));
            }
            if (i11 == 2) {
                return Utf8.p(i10, z3.A(bArr, j10), z3.A(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte bA = z3.A(bArr, i10);
                if (!a.n(bA)) {
                    break;
                }
                i10++;
                a.i(bA, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte bA2 = z3.A(bArr, i10);
                if (a.n(bA2)) {
                    int i16 = i14 + 1;
                    a.i(bA2, cArr, i14);
                    while (i15 < i12) {
                        byte bA3 = z3.A(bArr, i15);
                        if (!a.n(bA3)) {
                            break;
                        }
                        i15++;
                        a.i(bA3, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.p(bA2)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a.k(bA2, z3.A(bArr, i15), cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.o(bA2)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i17 = i15 + 1;
                    a.j(bA2, z3.A(bArr, i15), z3.A(bArr, i17), cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i18 = i15 + 1;
                    byte bA4 = z3.A(bArr, i15);
                    int i19 = i18 + 1;
                    a.h(bA2, bA4, z3.A(bArr, i18), z3.A(bArr, i19), cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long jI = z3.i(byteBuffer) + ((long) i10);
            long j10 = ((long) i11) + jI;
            char[] cArr = new char[i11];
            int i12 = 0;
            while (jI < j10) {
                byte bY = z3.y(jI);
                if (!a.n(bY)) {
                    break;
                }
                jI++;
                a.i(bY, cArr, i12);
                i12++;
            }
            while (true) {
                int i13 = i12;
                while (jI < j10) {
                    long j11 = jI + 1;
                    byte bY2 = z3.y(jI);
                    if (a.n(bY2)) {
                        int i14 = i13 + 1;
                        a.i(bY2, cArr, i13);
                        while (j11 < j10) {
                            byte bY3 = z3.y(j11);
                            if (!a.n(bY3)) {
                                break;
                            }
                            j11++;
                            a.i(bY3, cArr, i14);
                            i14++;
                        }
                        i13 = i14;
                        jI = j11;
                    } else if (a.p(bY2)) {
                        if (j11 >= j10) {
                            throw InvalidProtocolBufferException.d();
                        }
                        jI = j11 + 1;
                        a.k(bY2, z3.y(j11), cArr, i13);
                        i13++;
                    } else if (a.o(bY2)) {
                        if (j11 >= j10 - 1) {
                            throw InvalidProtocolBufferException.d();
                        }
                        long j12 = j11 + 1;
                        a.j(bY2, z3.y(j11), z3.y(j12), cArr, i13);
                        i13++;
                        jI = j12 + 1;
                    } else {
                        if (j11 >= j10 - 2) {
                            throw InvalidProtocolBufferException.d();
                        }
                        long j13 = j11 + 1;
                        byte bY4 = z3.y(j11);
                        long j14 = j13 + 1;
                        byte bY5 = z3.y(j13);
                        jI = j14 + 1;
                        a.h(bY2, bY4, bY5, z3.y(j14), cArr, i13);
                        i12 = i13 + 1 + 1;
                    }
                }
                return new String(cArr, 0, i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            char c11;
            int i12;
            char cCharAt;
            long j13 = i10;
            long j14 = ((long) i11) + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                c10 = 128;
                j10 = 1;
                if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                z3.d0(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 < c10 && j13 < j14) {
                    long j15 = j13 + j10;
                    z3.d0(bArr, j13, (byte) cCharAt2);
                    j12 = j10;
                    j11 = j15;
                    c11 = c10;
                } else if (cCharAt2 < 2048 && j13 <= j14 - 2) {
                    long j16 = j13 + j10;
                    z3.d0(bArr, j13, (byte) ((cCharAt2 >>> 6) | bb.c.b.f31065yf));
                    long j17 = j16 + j10;
                    z3.d0(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    long j18 = j10;
                    c11 = 128;
                    j11 = j17;
                    j12 = j18;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                                throw new UnpairedSurrogateException(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j19 = j13 + 1;
                                z3.d0(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j20 = j19 + 1;
                                c11 = 128;
                                z3.d0(bArr, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j21 = j20 + 1;
                                z3.d0(bArr, j20, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 = 1;
                                j11 = j21 + 1;
                                z3.d0(bArr, j21, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new UnpairedSurrogateException(i13 - 1, length);
                    }
                    long j22 = j13 + j10;
                    z3.d0(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j23 = j22 + j10;
                    z3.d0(bArr, j22, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    z3.d0(bArr, j23, (byte) ((cCharAt2 & '?') | 128));
                    j11 = j23 + 1;
                    j12 = 1;
                    c11 = 128;
                }
                i13++;
                c10 = c11;
                long j24 = j12;
                j13 = j11;
                j10 = j24;
            }
            return (int) j13;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            char c10;
            long j10;
            int i10;
            int i11;
            char c11;
            char cCharAt;
            long jI = z3.i(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jI;
            long jLimit = ((long) byteBuffer.limit()) + jI;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i12 = 0;
            while (true) {
                c10 = 128;
                if (i12 >= length || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                z3.b0(jPosition, (byte) cCharAt);
                i12++;
                jPosition++;
            }
            if (i12 == length) {
                byteBuffer.position((int) (jPosition - jI));
                return;
            }
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j10 = jI;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i12 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i10)))) {
                                    throw new UnpairedSurrogateException(i12, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            i11 = i12 + 1;
                            if (i11 != length) {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    long j11 = jPosition + 1;
                                    z3.b0(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    long j12 = j11 + 1;
                                    c11 = 128;
                                    z3.b0(j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = j12 + 1;
                                    z3.b0(j12, (byte) (((codePoint >>> 6) & 63) | 128));
                                    z3.b0(j13, (byte) ((codePoint & 63) | 128));
                                    jPosition = j13 + 1;
                                } else {
                                    i12 = i11;
                                }
                            }
                            throw new UnpairedSurrogateException(i12 - 1, length);
                        }
                        long j14 = jPosition + 1;
                        z3.b0(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j15 = j14 + 1;
                        z3.b0(j14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        z3.b0(j15, (byte) ((cCharAt2 & '?') | 128));
                        jPosition = j15 + 1;
                    } else {
                        j10 = jI;
                        long j16 = jPosition + 1;
                        z3.b0(jPosition, (byte) ((cCharAt2 >>> 6) | bb.c.b.f31065yf));
                        z3.b0(j16, (byte) ((cCharAt2 & '?') | 128));
                        jPosition = j16 + 1;
                    }
                    i11 = i12;
                    c11 = 128;
                } else {
                    z3.b0(jPosition, (byte) cCharAt2);
                    i11 = i12;
                    c11 = c10;
                    jPosition++;
                    j10 = jI;
                }
                c10 = c11;
                jI = j10;
                jLimit = jLimit;
                i12 = i11 + 1;
            }
            byteBuffer.position((int) (jPosition - jI));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.p001datastore.preferences.protobuf.z3.A(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.p001datastore.preferences.protobuf.z3.A(r13, r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.d.l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (androidx.p001datastore.preferences.protobuf.z3.y(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (androidx.p001datastore.preferences.protobuf.z3.y(r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int o(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.d.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f22342a = (!d.p() || e.c()) ? new c() : new d();
    }

    private Utf8() {
    }

    static String g(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
        return f22342a.a(byteBuffer, i10, i11);
    }

    static String h(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return f22342a.b(bArr, i10, i11);
    }

    static int i(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f22342a.e(charSequence, bArr, i10, i11);
    }

    static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f22342a.f(charSequence, byteBuffer);
    }

    static int k(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iL = length;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt >= 2048) {
                iL += l(charSequence, i10);
                break;
            }
            iL += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iL >= length) {
            return iL;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iL) + 4294967296L));
    }

    private static int l(CharSequence charSequence, int i10) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(ByteBuffer byteBuffer, int i10, int i11) {
        int i12 = i11 - 7;
        int i13 = i10;
        while (i13 < i12 && (byteBuffer.getLong(i13) & (-9187201950435737472L)) == 0) {
            i13 += 8;
        }
        return i13 - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 == 0) {
            return n(i10);
        }
        if (i12 == 1) {
            return o(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return p(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return n(b10);
        }
        if (i12 == 1) {
            return o(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return p(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    static boolean s(ByteBuffer byteBuffer) {
        return f22342a.i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean t(byte[] bArr) {
        return f22342a.j(bArr, 0, bArr.length);
    }

    public static boolean u(byte[] bArr, int i10, int i11) {
        return f22342a.j(bArr, i10, i11);
    }

    static int v(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        return f22342a.k(i10, byteBuffer, i11, i12);
    }

    public static int w(int i10, byte[] bArr, int i11, int i12) {
        return f22342a.l(i10, bArr, i11, i12);
    }
}
