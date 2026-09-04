package com.alibaba.fastjson.util;

import bb.c;
import com.alibaba.fastjson.JSONException;
import com.google.common.base.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Properties;
import kotlin.text.y;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public class IOUtils {
    public static final char[] ASCII_CHARS;
    public static final char[] CA;
    static final char[] DigitOnes;
    static final char[] DigitTens;
    public static final String FASTJSON_COMPATIBLEWITHFIELDNAME = "fastjson.compatibleWithFieldName";
    public static final String FASTJSON_COMPATIBLEWITHJAVABEAN = "fastjson.compatibleWithJavaBean";
    public static final String FASTJSON_PROPERTIES = "fastjson.properties";
    public static final int[] IA;
    static final char[] digits;
    public static final boolean[] identifierFlags;
    public static final char[] replaceChars;
    static final int[] sizeTable;
    public static final byte[] specicalFlags_doubleQuotes;
    public static final boolean[] specicalFlags_doubleQuotesFlags;
    public static final byte[] specicalFlags_singleQuotes;
    public static final boolean[] specicalFlags_singleQuotesFlags;
    public static final Properties DEFAULT_PROPERTIES = new Properties();
    public static final Charset UTF8 = Charset.forName("UTF-8");
    public static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final boolean[] firstIdentifierFlags = new boolean[256];

    static {
        char c10 = 0;
        while (true) {
            boolean[] zArr = firstIdentifierFlags;
            if (c10 >= zArr.length) {
                break;
            }
            if (c10 >= 'A' && c10 <= 'Z') {
                zArr[c10] = true;
            } else if (c10 >= 'a' && c10 <= 'z') {
                zArr[c10] = true;
            } else if (c10 == '_' || c10 == '$') {
                zArr[c10] = true;
            }
            c10 = (char) (c10 + 1);
        }
        identifierFlags = new boolean[256];
        char c11 = 0;
        while (true) {
            boolean[] zArr2 = identifierFlags;
            if (c11 < zArr2.length) {
                if (c11 >= 'A' && c11 <= 'Z') {
                    zArr2[c11] = true;
                } else if (c11 >= 'a' && c11 <= 'z') {
                    zArr2[c11] = true;
                } else if (c11 == '_') {
                    zArr2[c11] = true;
                } else if (c11 >= '0' && c11 <= '9') {
                    zArr2[c11] = true;
                }
                c11 = (char) (c11 + 1);
            } else {
                try {
                    break;
                } catch (Throwable unused) {
                }
            }
        }
        loadPropertiesFromFile();
        byte[] bArr = new byte[161];
        specicalFlags_doubleQuotes = bArr;
        byte[] bArr2 = new byte[161];
        specicalFlags_singleQuotes = bArr2;
        specicalFlags_doubleQuotesFlags = new boolean[161];
        specicalFlags_singleQuotesFlags = new boolean[161];
        replaceChars = new char[93];
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i10 = 14; i10 <= 31; i10++) {
            specicalFlags_doubleQuotes[i10] = 4;
            specicalFlags_singleQuotes[i10] = 4;
        }
        for (int i11 = 127; i11 < 160; i11++) {
            specicalFlags_doubleQuotes[i11] = 4;
            specicalFlags_singleQuotes[i11] = 4;
        }
        for (int i12 = 0; i12 < 161; i12++) {
            specicalFlags_doubleQuotesFlags[i12] = specicalFlags_doubleQuotes[i12] != 0;
            specicalFlags_singleQuotesFlags[i12] = specicalFlags_singleQuotes[i12] != 0;
        }
        char[] cArr = replaceChars;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = y.f128593b;
        cArr[39] = '\'';
        cArr[47] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_UNIX;
        cArr[92] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
        ASCII_CHARS = new char[]{'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
        digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        DigitTens = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
        DigitOnes = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        sizeTable = new int[]{9, 99, 999, c.l.V0, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        CA = charArray;
        int[] iArr = new int[256];
        IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i13 = 0; i13 < length; i13++) {
            IA[CA[i13]] = i13;
        }
        IA[61] = 0;
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void decode(CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, CharBuffer charBuffer) {
        try {
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, true);
            if (!coderResultDecode.isUnderflow()) {
                coderResultDecode.throwException();
            }
            CoderResult coderResultFlush = charsetDecoder.flush(charBuffer);
            if (coderResultFlush.isUnderflow()) {
                return;
            }
            coderResultFlush.throwException();
        } catch (CharacterCodingException e10) {
            throw new JSONException("utf8 decode error, " + e10.getMessage(), e10);
        }
    }

    public static byte[] decodeBase64(String str) {
        int i10;
        int i11;
        int length = str.length();
        int i12 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i13 = length - 1;
        int i14 = 0;
        while (i14 < i13 && IA[str.charAt(i14) & 255] < 0) {
            i14++;
        }
        while (i13 > 0 && IA[str.charAt(i13) & 255] < 0) {
            i13--;
        }
        if (str.charAt(i13) == '=') {
            i10 = str.charAt(i13 + (-1)) == '=' ? 2 : 1;
        } else {
            i10 = 0;
        }
        int i15 = (i13 - i14) + 1;
        if (length > 76) {
            i11 = (str.charAt(76) == '\r' ? i15 / 78 : 0) << 1;
        } else {
            i11 = 0;
        }
        int i16 = (((i15 - i11) * 6) >> 3) - i10;
        byte[] bArr = new byte[i16];
        int i17 = (i16 / 3) * 3;
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            int[] iArr = IA;
            int i20 = i14 + 1;
            int i21 = i20 + 1;
            int i22 = (iArr[str.charAt(i14)] << 18) | (iArr[str.charAt(i20)] << 12);
            int i23 = i21 + 1;
            int i24 = i22 | (iArr[str.charAt(i21)] << 6);
            int i25 = i23 + 1;
            int i26 = i24 | iArr[str.charAt(i23)];
            int i27 = i18 + 1;
            bArr[i18] = (byte) (i26 >> 16);
            int i28 = i27 + 1;
            bArr[i27] = (byte) (i26 >> 8);
            int i29 = i28 + 1;
            bArr[i28] = (byte) i26;
            if (i11 > 0 && (i19 = i19 + 1) == 19) {
                i25 += 2;
                i19 = 0;
            }
            i14 = i25;
            i18 = i29;
        }
        if (i18 < i16) {
            int i30 = 0;
            while (i14 <= i13 - i10) {
                i12 |= IA[str.charAt(i14)] << (18 - (i30 * 6));
                i30++;
                i14++;
            }
            int i31 = 16;
            while (i18 < i16) {
                bArr[i18] = (byte) (i12 >> i31);
                i31 -= 8;
                i18++;
            }
        }
        return bArr;
    }

    public static byte[] decodeBase64(String str, int i10, int i11) {
        int i12;
        int i13;
        int i14 = 0;
        if (i11 == 0) {
            return new byte[0];
        }
        int i15 = (i10 + i11) - 1;
        while (i10 < i15 && IA[str.charAt(i10)] < 0) {
            i10++;
        }
        while (i15 > 0 && IA[str.charAt(i15)] < 0) {
            i15--;
        }
        if (str.charAt(i15) == '=') {
            i12 = str.charAt(i15 + (-1)) == '=' ? 2 : 1;
        } else {
            i12 = 0;
        }
        int i16 = (i15 - i10) + 1;
        if (i11 > 76) {
            i13 = (str.charAt(76) == '\r' ? i16 / 78 : 0) << 1;
        } else {
            i13 = 0;
        }
        int i17 = (((i16 - i13) * 6) >> 3) - i12;
        byte[] bArr = new byte[i17];
        int i18 = (i17 / 3) * 3;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i18) {
            int[] iArr = IA;
            int i21 = i10 + 1;
            int i22 = i21 + 1;
            int i23 = (iArr[str.charAt(i10)] << 18) | (iArr[str.charAt(i21)] << 12);
            int i24 = i22 + 1;
            int i25 = i23 | (iArr[str.charAt(i22)] << 6);
            int i26 = i24 + 1;
            int i27 = i25 | iArr[str.charAt(i24)];
            int i28 = i19 + 1;
            bArr[i19] = (byte) (i27 >> 16);
            int i29 = i28 + 1;
            bArr[i28] = (byte) (i27 >> 8);
            int i30 = i29 + 1;
            bArr[i29] = (byte) i27;
            if (i13 > 0 && (i20 = i20 + 1) == 19) {
                i26 += 2;
                i20 = 0;
            }
            i10 = i26;
            i19 = i30;
        }
        if (i19 < i17) {
            int i31 = 0;
            while (i10 <= i15 - i12) {
                i14 |= IA[str.charAt(i10)] << (18 - (i31 * 6));
                i31++;
                i10++;
            }
            int i32 = 16;
            while (i19 < i17) {
                bArr[i19] = (byte) (i14 >> i32);
                i32 -= 8;
                i19++;
            }
        }
        return bArr;
    }

    public static byte[] decodeBase64(char[] cArr, int i10, int i11) {
        int i12;
        int i13;
        int i14 = 0;
        if (i11 == 0) {
            return new byte[0];
        }
        int i15 = (i10 + i11) - 1;
        while (i10 < i15 && IA[cArr[i10]] < 0) {
            i10++;
        }
        while (i15 > 0 && IA[cArr[i15]] < 0) {
            i15--;
        }
        if (cArr[i15] == '=') {
            i12 = cArr[i15 + (-1)] == '=' ? 2 : 1;
        } else {
            i12 = 0;
        }
        int i16 = (i15 - i10) + 1;
        if (i11 > 76) {
            i13 = (cArr[76] == '\r' ? i16 / 78 : 0) << 1;
        } else {
            i13 = 0;
        }
        int i17 = (((i16 - i13) * 6) >> 3) - i12;
        byte[] bArr = new byte[i17];
        int i18 = (i17 / 3) * 3;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i18) {
            int[] iArr = IA;
            int i21 = i10 + 1;
            int i22 = i21 + 1;
            int i23 = (iArr[cArr[i10]] << 18) | (iArr[cArr[i21]] << 12);
            int i24 = i22 + 1;
            int i25 = i23 | (iArr[cArr[i22]] << 6);
            int i26 = i24 + 1;
            int i27 = i25 | iArr[cArr[i24]];
            int i28 = i19 + 1;
            bArr[i19] = (byte) (i27 >> 16);
            int i29 = i28 + 1;
            bArr[i28] = (byte) (i27 >> 8);
            int i30 = i29 + 1;
            bArr[i29] = (byte) i27;
            if (i13 > 0 && (i20 = i20 + 1) == 19) {
                i26 += 2;
                i20 = 0;
            }
            i10 = i26;
            i19 = i30;
        }
        if (i19 < i17) {
            int i31 = 0;
            while (i10 <= i15 - i12) {
                i14 |= IA[cArr[i10]] << (18 - (i31 * 6));
                i31++;
                i10++;
            }
            int i32 = 16;
            while (i19 < i17) {
                bArr[i19] = (byte) (i14 >> i32);
                i32 -= 8;
                i19++;
            }
        }
        return bArr;
    }

    public static int decodeUTF8(byte[] bArr, int i10, int i11, char[] cArr) {
        int i12 = i10 + i11;
        int iMin = Math.min(i11, cArr.length);
        int i13 = 0;
        while (i13 < iMin) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                cArr[i13] = (char) b11;
                i10 = i14;
                i13++;
            } else {
                if ((b11 >> 5) != -2 || (b11 & a.H) == 0) {
                    if ((b11 >> 4) == -2) {
                        int i15 = i14 + 1;
                        if (i15 < i12) {
                            byte b12 = bArr[i14];
                            int i16 = i15 + 1;
                            byte b13 = bArr[i15];
                            if ((b11 != -32 || (b12 & 224) != 128) && (b12 & 192) == 128 && (b13 & 192) == 128) {
                                char c10 = (char) (((b11 << 12) ^ (b12 << 6)) ^ ((-123008) ^ b13));
                                if (c10 >= 55296 && c10 < 57344) {
                                    return -1;
                                }
                                cArr[i13] = c10;
                                i13++;
                                i10 = i16;
                            }
                        }
                        return -1;
                    }
                    if ((b11 >> 3) == -2 && i14 + 2 < i12) {
                        int i17 = i14 + 1;
                        byte b14 = bArr[i14];
                        int i18 = i17 + 1;
                        byte b15 = bArr[i17];
                        int i19 = i18 + 1;
                        byte b16 = bArr[i18];
                        int i20 = (((b11 << a.f56668u) ^ (b14 << 12)) ^ (b15 << 6)) ^ (3678080 ^ b16);
                        if ((b14 & 192) == 128 && (b15 & 192) == 128 && (b16 & 192) == 128 && Character.isSupplementaryCodePoint(i20)) {
                            int i21 = i13 + 1;
                            cArr[i13] = (char) ((i20 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                            i13 = i21 + 1;
                            cArr[i21] = (char) ((i20 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                            i10 = i19;
                        }
                    }
                    return -1;
                }
                if (i14 >= i12) {
                    return -1;
                }
                int i22 = i14 + 1;
                byte b17 = bArr[i14];
                if ((b17 & 192) != 128) {
                    return -1;
                }
                cArr[i13] = (char) (((b11 << 6) ^ b17) ^ 3968);
                i10 = i22;
                i13++;
            }
        }
        return i13;
    }

    public static int encodeUTF8(char[] cArr, int i10, int i11, byte[] bArr) {
        int i12;
        int i13;
        int i14;
        int codePoint;
        char c10;
        int i15 = i10 + i11;
        int i16 = 0;
        int iMin = Math.min(i11, bArr.length) + 0;
        while (i16 < iMin && (c10 = cArr[i10]) < 128) {
            i10++;
            bArr[i16] = (byte) c10;
            i16++;
        }
        while (i10 < i15) {
            int i17 = i10 + 1;
            char c11 = cArr[i10];
            if (c11 < 128) {
                i12 = i16 + 1;
                bArr[i16] = (byte) c11;
            } else {
                if (c11 < 2048) {
                    int i18 = i16 + 1;
                    bArr[i16] = (byte) ((c11 >> 6) | 192);
                    i16 = i18 + 1;
                    bArr[i18] = (byte) ((c11 & '?') | 128);
                } else if (c11 < 55296 || c11 >= 57344) {
                    int i19 = i16 + 1;
                    bArr[i16] = (byte) ((c11 >> '\f') | 224);
                    int i20 = i19 + 1;
                    bArr[i19] = (byte) ((63 & (c11 >> 6)) | 128);
                    i12 = i20 + 1;
                    bArr[i20] = (byte) ((c11 & '?') | 128);
                } else {
                    int i21 = i17 - 1;
                    if (Character.isHighSurrogate(c11)) {
                        if (i15 - i21 < 2) {
                            i13 = -1;
                        } else {
                            char c12 = cArr[i21 + 1];
                            if (!Character.isLowSurrogate(c12)) {
                                throw new JSONException("encodeUTF8 error", new MalformedInputException(1));
                            }
                            codePoint = Character.toCodePoint(c11, c12);
                        }
                    } else if (Character.isLowSurrogate(c11)) {
                        i13 = c11;
                        throw new JSONException("encodeUTF8 error", new MalformedInputException(1));
                    }
                    if (i13 < 0) {
                        i13 = codePoint;
                        i14 = i16 + 1;
                        bArr[i16] = Utf8.REPLACEMENT_BYTE;
                    } else {
                        i13 = codePoint;
                        int i22 = i16 + 1;
                        bArr[i16] = (byte) ((i13 >> 18) | 240);
                        int i23 = i22 + 1;
                        bArr[i22] = (byte) (((i13 >> 12) & 63) | 128);
                        int i24 = i23 + 1;
                        bArr[i23] = (byte) ((63 & (i13 >> 6)) | 128);
                        bArr[i24] = (byte) ((i13 & 63) | 128);
                        i17++;
                        i14 = i24 + 1;
                    }
                    i16 = i14;
                }
                i10 = i17;
            }
            i10 = i17;
            i16 = i12;
        }
        return i16;
    }

    public static boolean firstIdentifier(char c10) {
        boolean[] zArr = firstIdentifierFlags;
        return c10 < zArr.length && zArr[c10];
    }

    public static void getChars(byte b10, int i10, char[] cArr) {
        char c10;
        int i11;
        if (b10 < 0) {
            c10 = '-';
            i11 = -b10;
        } else {
            c10 = 0;
            i11 = b10;
        }
        while (true) {
            int i12 = (52429 * i11) >>> 19;
            i10--;
            cArr[i10] = digits[i11 - ((i12 << 3) + (i12 << 1))];
            if (i12 == 0) {
                break;
            } else {
                i11 = i12;
            }
        }
        if (c10 != 0) {
            cArr[i10 - 1] = c10;
        }
    }

    public static void getChars(int i10, int i11, char[] cArr) {
        char c10;
        if (i10 < 0) {
            c10 = '-';
            i10 = -i10;
        } else {
            c10 = 0;
        }
        while (i10 >= 65536) {
            int i12 = i10 / 100;
            int i13 = i10 - (((i12 << 6) + (i12 << 5)) + (i12 << 2));
            int i14 = i11 - 1;
            cArr[i14] = DigitOnes[i13];
            i11 = i14 - 1;
            cArr[i11] = DigitTens[i13];
            i10 = i12;
        }
        while (true) {
            int i15 = (52429 * i10) >>> 19;
            i11--;
            cArr[i11] = digits[i10 - ((i15 << 3) + (i15 << 1))];
            if (i15 == 0) {
                break;
            } else {
                i10 = i15;
            }
        }
        if (c10 != 0) {
            cArr[i11 - 1] = c10;
        }
    }

    public static void getChars(long j10, int i10, char[] cArr) {
        char c10;
        if (j10 < 0) {
            c10 = '-';
            j10 = -j10;
        } else {
            c10 = 0;
        }
        while (j10 > 2147483647L) {
            long j11 = j10 / 100;
            int i11 = (int) (j10 - (((j11 << 6) + (j11 << 5)) + (j11 << 2)));
            int i12 = i10 - 1;
            cArr[i12] = DigitOnes[i11];
            i10 = i12 - 1;
            cArr[i10] = DigitTens[i11];
            j10 = j11;
        }
        int i13 = (int) j10;
        while (i13 >= 65536) {
            int i14 = i13 / 100;
            int i15 = i13 - (((i14 << 6) + (i14 << 5)) + (i14 << 2));
            int i16 = i10 - 1;
            cArr[i16] = DigitOnes[i15];
            i10 = i16 - 1;
            cArr[i10] = DigitTens[i15];
            i13 = i14;
        }
        while (true) {
            int i17 = (52429 * i13) >>> 19;
            i10--;
            cArr[i10] = digits[i13 - ((i17 << 3) + (i17 << 1))];
            if (i17 == 0) {
                break;
            } else {
                i13 = i17;
            }
        }
        if (c10 != 0) {
            cArr[i10 - 1] = c10;
        }
    }

    public static String getStringProperty(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? DEFAULT_PROPERTIES.getProperty(str) : property;
    }

    public static boolean isIdent(char c10) {
        boolean[] zArr = identifierFlags;
        return c10 < zArr.length && zArr[c10];
    }

    public static boolean isValidJsonpQueryParam(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '.' && !isIdent(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static void loadPropertiesFromFile() {
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: com.alibaba.fastjson.util.IOUtils.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public InputStream run() {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                return contextClassLoader != null ? contextClassLoader.getResourceAsStream(IOUtils.FASTJSON_PROPERTIES) : ClassLoader.getSystemResourceAsStream(IOUtils.FASTJSON_PROPERTIES);
            }
        });
        if (inputStream != null) {
            try {
                DEFAULT_PROPERTIES.load(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String readAll(Reader reader) {
        StringBuilder sb2 = new StringBuilder();
        try {
            char[] cArr = new char[2048];
            while (true) {
                int i10 = reader.read(cArr, 0, 2048);
                if (i10 < 0) {
                    return sb2.toString();
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Exception e10) {
            throw new JSONException("read string from reader error", e10);
        }
    }

    public static int stringSize(int i10) {
        int i11 = 0;
        while (i10 > sizeTable[i11]) {
            i11++;
        }
        return i11 + 1;
    }

    public static int stringSize(long j10) {
        long j11 = 10;
        for (int i10 = 1; i10 < 19; i10++) {
            if (j10 < j11) {
                return i10;
            }
            j11 *= 10;
        }
        return 19;
    }
}
