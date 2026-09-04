package com.heytap.msp.push.encrypt;

import com.google.common.base.a;
import java.math.BigInteger;
import okio.Utf8;
import org.apache.commons.codec.binary.l;
import org.apache.tools.tar.c;

/* JADX INFO: loaded from: classes7.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private int bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, c.N, c.O, 77, 78, 79, 80, 81, 82, c.P, 84, 85, 86, 87, c.R, 89, 90, 97, 98, 99, 100, 101, 102, c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, c.Q, 121, 122, c.F, c.G, c.H, c.I, c.J, c.K, c.L, c.M, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, c.N, c.O, 77, 78, 79, 80, 81, 82, c.P, 84, 85, 86, 87, c.R, 89, 90, 97, 98, 99, 100, 101, 102, c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, c.Q, 121, 122, c.F, c.G, c.H, c.I, c.J, c.K, c.L, c.M, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, c.J, c.K, c.L, c.M, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, a.f56668u, 19, a.f56671x, a.f56672y, a.f56673z, a.A, a.B, a.C, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, a.D, a.E, a.F, a.G, a.H, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, c.F, c.G, c.H, c.I};

    public Base64() {
        this(0);
    }

    public Base64(int i10) {
        this(i10, CHUNK_SEPARATOR);
    }

    public Base64(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public Base64(int i10, byte[] bArr, boolean z10) {
        super(3, 4, i10, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr == null) {
            this.encodeSize = 4;
            this.lineSeparator = null;
        } else {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + l.o(bArr) + "]");
            }
            if (i10 > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z10 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    public Base64(boolean z10) {
        this(76, CHUNK_SEPARATOR, z10);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10) {
        return encodeBase64(bArr, z10, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10, boolean z11) {
        return encodeBase64(bArr, z10, z11, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z10 ? new Base64(z11) : new Base64(0, CHUNK_SEPARATOR, z11);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i10) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i10);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return l.o(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return l.o(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b10) {
        if (b10 != 61) {
            if (b10 >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b10 >= bArr.length || bArr[b10] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isBase64(String str) {
        return isBase64(l.g(str));
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!isBase64(bArr[i10]) && !BaseNCodec.isWhiteSpace(bArr[i10])) {
                return false;
            }
        }
        return true;
    }

    static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i10 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i10 = 0;
        }
        int i11 = iBitLength / 8;
        int i12 = i11 - length;
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, i10, bArr, i12, length);
        return bArr;
    }

    @Override // com.heytap.msp.push.encrypt.BaseNCodec
    void decode(byte[] bArr, int i10, int i11) {
        byte b10;
        if (this.eof) {
            return;
        }
        if (i11 < 0) {
            this.eof = true;
        }
        int i12 = 0;
        while (i12 < i11) {
            ensureBufferSize(this.decodeSize);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == 61) {
                this.eof = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (this.modulus + 1) % 4;
                    this.modulus = i14;
                    int i15 = (this.bitWorkArea << 6) + b10;
                    this.bitWorkArea = i15;
                    if (i14 == 0) {
                        byte[] bArr3 = this.buffer;
                        int i16 = this.pos;
                        int i17 = i16 + 1;
                        bArr3[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i17 + 1;
                        bArr3[i17] = (byte) ((i15 >> 8) & 255);
                        this.pos = i18 + 1;
                        bArr3[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (!this.eof || this.modulus == 0) {
            return;
        }
        ensureBufferSize(this.decodeSize);
        int i19 = this.modulus;
        if (i19 == 2) {
            int i20 = this.bitWorkArea >> 4;
            this.bitWorkArea = i20;
            byte[] bArr4 = this.buffer;
            int i21 = this.pos;
            this.pos = i21 + 1;
            bArr4[i21] = (byte) (i20 & 255);
            return;
        }
        if (i19 != 3) {
            return;
        }
        int i22 = this.bitWorkArea >> 2;
        this.bitWorkArea = i22;
        byte[] bArr5 = this.buffer;
        int i23 = this.pos;
        int i24 = i23 + 1;
        bArr5[i23] = (byte) ((i22 >> 8) & 255);
        this.pos = i24 + 1;
        bArr5[i24] = (byte) (i22 & 255);
    }

    @Override // com.heytap.msp.push.encrypt.BaseNCodec
    void encode(byte[] bArr, int i10, int i11) {
        if (this.eof) {
            return;
        }
        if (i11 >= 0) {
            int i12 = 0;
            while (i12 < i11) {
                ensureBufferSize(this.encodeSize);
                int i13 = (this.modulus + 1) % 3;
                this.modulus = i13;
                int i14 = i10 + 1;
                int i15 = bArr[i10];
                if (i15 < 0) {
                    i15 += 256;
                }
                int i16 = (this.bitWorkArea << 8) + i15;
                this.bitWorkArea = i16;
                if (i13 == 0) {
                    byte[] bArr2 = this.buffer;
                    int i17 = this.pos;
                    int i18 = i17 + 1;
                    byte[] bArr3 = this.encodeTable;
                    bArr2[i17] = bArr3[(i16 >> 18) & 63];
                    int i19 = i18 + 1;
                    bArr2[i18] = bArr3[(i16 >> 12) & 63];
                    int i20 = i19 + 1;
                    bArr2[i19] = bArr3[(i16 >> 6) & 63];
                    int i21 = i20 + 1;
                    this.pos = i21;
                    bArr2[i20] = bArr3[i16 & 63];
                    int i22 = this.currentLinePos + 4;
                    this.currentLinePos = i22;
                    int i23 = this.lineLength;
                    if (i23 > 0 && i23 <= i22) {
                        byte[] bArr4 = this.lineSeparator;
                        System.arraycopy(bArr4, 0, bArr2, i21, bArr4.length);
                        this.pos += this.lineSeparator.length;
                        this.currentLinePos = 0;
                    }
                }
                i12++;
                i10 = i14;
            }
            return;
        }
        this.eof = true;
        if (this.modulus == 0 && this.lineLength == 0) {
            return;
        }
        ensureBufferSize(this.encodeSize);
        int i24 = this.pos;
        int i25 = this.modulus;
        if (i25 == 1) {
            byte[] bArr5 = this.buffer;
            int i26 = i24 + 1;
            byte[] bArr6 = this.encodeTable;
            int i27 = this.bitWorkArea;
            bArr5[i24] = bArr6[(i27 >> 2) & 63];
            int i28 = i26 + 1;
            this.pos = i28;
            bArr5[i26] = bArr6[(i27 << 4) & 63];
            if (bArr6 == STANDARD_ENCODE_TABLE) {
                int i29 = i28 + 1;
                bArr5[i28] = 61;
                this.pos = i29 + 1;
                bArr5[i29] = 61;
            }
        } else if (i25 == 2) {
            byte[] bArr7 = this.buffer;
            int i30 = i24 + 1;
            byte[] bArr8 = this.encodeTable;
            int i31 = this.bitWorkArea;
            bArr7[i24] = bArr8[(i31 >> 10) & 63];
            int i32 = i30 + 1;
            bArr7[i30] = bArr8[(i31 >> 4) & 63];
            int i33 = i32 + 1;
            this.pos = i33;
            bArr7[i32] = bArr8[(i31 << 2) & 63];
            if (bArr8 == STANDARD_ENCODE_TABLE) {
                this.pos = i33 + 1;
                bArr7[i33] = 61;
            }
        }
        int i34 = this.currentLinePos;
        int i35 = this.pos;
        int i36 = i34 + (i35 - i24);
        this.currentLinePos = i36;
        if (this.lineLength <= 0 || i36 <= 0) {
            return;
        }
        byte[] bArr9 = this.lineSeparator;
        System.arraycopy(bArr9, 0, this.buffer, i35, bArr9.length);
        this.pos += this.lineSeparator.length;
    }

    @Override // com.heytap.msp.push.encrypt.BaseNCodec
    protected boolean isInAlphabet(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.decodeTable;
            if (b10 < bArr.length && bArr[b10] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }
}
