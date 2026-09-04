package com.google.common.hash;

import com.google.common.base.w;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public final class Murmur3_32HashFunction extends c implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final k f58504d = new Murmur3_32HashFunction(0, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final k f58505e = new Murmur3_32HashFunction(0, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final k f58506f = new Murmur3_32HashFunction(Hashing.f58475a, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f58507g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f58508h = -862048943;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f58509i = 461845907;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f58511c;

    @s9.a
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f58512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f58513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f58514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f58515d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f58516e = false;

        a(int i10) {
            this.f58512a = i10;
        }

        private void p(int i10, long j10) {
            long j11 = this.f58513b;
            long j12 = j10 & KeyboardMap.kValueMask;
            int i11 = this.f58514c;
            long j13 = (j12 << i11) | j11;
            this.f58513b = j13;
            int i12 = i11 + (i10 * 8);
            this.f58514c = i12;
            this.f58515d += i10;
            if (i12 >= 32) {
                this.f58512a = Murmur3_32HashFunction.x(this.f58512a, Murmur3_32HashFunction.y((int) j13));
                this.f58513b >>>= 32;
                this.f58514c -= 32;
            }
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m b(byte b10) {
            p(1, b10 & 255);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m c(int i10) {
            p(4, i10);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m d(long j10) {
            p(4, (int) j10);
            p(4, j10 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m i(char c10) {
            p(2, c10);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m k(byte[] bArr, int i10, int i11) {
            w.f0(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (true) {
                int i13 = i12 + 4;
                if (i13 > i11) {
                    break;
                }
                p(4, Murmur3_32HashFunction.w(bArr, i12 + i10));
                i12 = i13;
            }
            while (i12 < i11) {
                b(bArr[i10 + i12]);
                i12++;
            }
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m l(ByteBuffer byteBuffer) {
            ByteOrder byteOrderOrder = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                c(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                b(byteBuffer.get());
            }
            byteBuffer.order(byteOrderOrder);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m m(CharSequence charSequence, Charset charset) {
            if (!com.google.common.base.c.f56721c.equals(charset)) {
                return super.m(charSequence, charset);
            }
            int length = charSequence.length();
            int i10 = 0;
            while (true) {
                int i11 = i10 + 4;
                if (i11 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i10);
                char cCharAt2 = charSequence.charAt(i10 + 1);
                char cCharAt3 = charSequence.charAt(i10 + 2);
                char cCharAt4 = charSequence.charAt(i10 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                p(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i10 = i11;
            }
            while (i10 < length) {
                char cCharAt5 = charSequence.charAt(i10);
                if (cCharAt5 < 128) {
                    p(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    p(2, Murmur3_32HashFunction.t(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    p(3, Murmur3_32HashFunction.s(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i10);
                    if (iCodePointAt == cCharAt5) {
                        e(charSequence.subSequence(i10, length).toString().getBytes(charset));
                        return this;
                    }
                    i10++;
                    p(4, Murmur3_32HashFunction.u(iCodePointAt));
                }
                i10++;
            }
            return this;
        }

        @Override // com.google.common.hash.m
        public HashCode n() {
            w.g0(!this.f58516e);
            this.f58516e = true;
            int iY = this.f58512a ^ Murmur3_32HashFunction.y((int) this.f58513b);
            this.f58512a = iY;
            return Murmur3_32HashFunction.v(iY, this.f58515d);
        }
    }

    Murmur3_32HashFunction(int i10, boolean z10) {
        this.f58510b = i10;
        this.f58511c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long s(char c10) {
        return ((long) (c10 >>> '\f')) | 224 | ((long) ((((c10 >>> 6) & 63) | 128) << 8)) | ((long) (((c10 & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long t(char c10) {
        return ((long) (c10 >>> 6)) | 192 | ((long) (((c10 & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long u(int i10) {
        return ((long) (i10 >>> 18)) | 240 | ((((long) ((i10 >>> 12) & 63)) | 128) << 8) | ((((long) ((i10 >>> 6) & 63)) | 128) << 16) | ((((long) (i10 & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode v(int i10, int i11) {
        int i12 = i10 ^ i11;
        int i13 = (i12 ^ (i12 >>> 16)) * (-2048144789);
        int i14 = (i13 ^ (i13 >>> 13)) * (-1028477387);
        return HashCode.i(i14 ^ (i14 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(byte[] bArr, int i10) {
        return Ints.k(bArr[i10 + 3], bArr[i10 + 2], bArr[i10 + 1], bArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(int i10, int i11) {
        return (Integer.rotateLeft(i10 ^ i11, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(int i10) {
        return Integer.rotateLeft(i10 * (-862048943), 15) * f58509i;
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode c(int i10) {
        return v(x(this.f58510b, y(i10)), 4);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode e(long j10) {
        return v(x(x(this.f58510b, y((int) j10)), y((int) (j10 >>> 32))), 8);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Murmur3_32HashFunction)) {
            return false;
        }
        Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
        return this.f58510b == murmur3_32HashFunction.f58510b && this.f58511c == murmur3_32HashFunction.f58511c;
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode f(CharSequence charSequence, Charset charset) {
        if (!com.google.common.base.c.f56721c.equals(charset)) {
            return b(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int iX = this.f58510b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 4;
            if (i13 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i11);
            char cCharAt2 = charSequence.charAt(i11 + 1);
            char cCharAt3 = charSequence.charAt(i11 + 2);
            char cCharAt4 = charSequence.charAt(i11 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iX = x(iX, y((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i12 += 4;
            i11 = i13;
        }
        long jS = 0;
        while (i11 < length) {
            char cCharAt5 = charSequence.charAt(i11);
            if (cCharAt5 < 128) {
                jS |= ((long) cCharAt5) << i10;
                i10 += 8;
                i12++;
            } else if (cCharAt5 < 2048) {
                jS |= t(cCharAt5) << i10;
                i10 += 16;
                i12 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jS |= s(cCharAt5) << i10;
                i10 += 24;
                i12 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i11);
                if (iCodePointAt == cCharAt5) {
                    return b(charSequence.toString().getBytes(charset));
                }
                i11++;
                jS |= u(iCodePointAt) << i10;
                if (this.f58511c) {
                    i10 += 32;
                }
                i12 += 4;
            }
            if (i10 >= 32) {
                iX = x(iX, y((int) jS));
                jS >>>= 32;
                i10 -= 32;
            }
            i11++;
        }
        return v(y((int) jS) ^ iX, i12);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode g(CharSequence charSequence) {
        int iY = this.f58510b;
        for (int i10 = 1; i10 < charSequence.length(); i10 += 2) {
            iY = x(iY, y(charSequence.charAt(i10 - 1) | (charSequence.charAt(i10) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            iY ^= y(charSequence.charAt(charSequence.length() - 1));
        }
        return v(iY, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.k
    public int h() {
        return 32;
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.f58510b;
    }

    @Override // com.google.common.hash.k
    public m i() {
        return new a(this.f58510b);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode k(byte[] bArr, int i10, int i11) {
        w.f0(i10, i10 + i11, bArr.length);
        int iX = this.f58510b;
        int iP = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 4;
            if (i13 > i11) {
                break;
            }
            iX = x(iX, y(w(bArr, i12 + i10)));
            i12 = i13;
        }
        int i14 = i12;
        int i15 = 0;
        while (i14 < i11) {
            iP ^= UnsignedBytes.p(bArr[i10 + i14]) << i15;
            i14++;
            i15 += 8;
        }
        return v(y(iP) ^ iX, i11);
    }

    public String toString() {
        int i10 = this.f58510b;
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Hashing.murmur3_32(");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }
}
