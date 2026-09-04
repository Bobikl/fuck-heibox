package n5;

import com.tencent.qcloud.core.util.IOUtils;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f132006a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f132007b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132008c = 24;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132009d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132010e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f132011f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f132012g = -128;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f132013h = '=';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f132014i = new byte[128];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f132015j = new char[64];

    static {
        int i10;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < 128; i13++) {
            f132014i[i13] = -1;
        }
        for (int i14 = 90; i14 >= 65; i14--) {
            f132014i[i14] = (byte) (i14 - 65);
        }
        int i15 = 122;
        while (true) {
            i10 = 26;
            if (i15 < 97) {
                break;
            }
            f132014i[i15] = (byte) ((i15 - 97) + 26);
            i15--;
        }
        int i16 = 57;
        while (true) {
            i11 = 52;
            if (i16 < 48) {
                break;
            }
            f132014i[i16] = (byte) ((i16 - 48) + 52);
            i16--;
        }
        byte[] bArr = f132014i;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
        for (int i17 = 0; i17 <= 25; i17++) {
            f132015j[i17] = (char) (i17 + 65);
        }
        int i18 = 0;
        while (i10 <= 51) {
            f132015j[i10] = (char) (i18 + 97);
            i10++;
            i18++;
        }
        while (i11 <= 61) {
            f132015j[i11] = (char) (i12 + 48);
            i11++;
            i12++;
        }
        char[] cArr = f132015j;
        cArr[62] = '+';
        cArr[63] = IOUtils.DIR_SEPARATOR_UNIX;
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (!f(cArr[i11])) {
                cArr[i10] = cArr[i11];
                i10++;
            }
        }
        return i10;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i10 = length % 24;
        int i11 = length / 24;
        char[] cArr = new char[(i10 != 0 ? i11 + 1 : i11) * 4];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            int i15 = i13 + 1;
            byte b10 = bArr[i13];
            int i16 = i15 + 1;
            byte b11 = bArr[i15];
            int i17 = i16 + 1;
            byte b12 = bArr[i16];
            byte b13 = (byte) (b11 & 15);
            byte b14 = (byte) (b10 & 3);
            int i18 = b10 & (-128);
            int i19 = b10 >> 2;
            if (i18 != 0) {
                i19 ^= 192;
            }
            byte b15 = (byte) i19;
            int i20 = b11 & (-128);
            int i21 = b11 >> 4;
            if (i20 != 0) {
                i21 ^= 240;
            }
            byte b16 = (byte) i21;
            int i22 = (b12 & (-128)) == 0 ? b12 >> 6 : (b12 >> 6) ^ 252;
            int i23 = i14 + 1;
            char[] cArr2 = f132015j;
            cArr[i14] = cArr2[b15];
            int i24 = i23 + 1;
            cArr[i23] = cArr2[(b14 << 4) | b16];
            int i25 = i24 + 1;
            cArr[i24] = cArr2[(b13 << 2) | ((byte) i22)];
            cArr[i25] = cArr2[b12 & Utf8.REPLACEMENT_BYTE];
            i12++;
            i14 = i25 + 1;
            i13 = i17;
        }
        if (i10 == 8) {
            byte b17 = bArr[i13];
            byte b18 = (byte) (b17 & 3);
            int i26 = b17 & (-128);
            int i27 = b17 >> 2;
            if (i26 != 0) {
                i27 ^= 192;
            }
            int i28 = i14 + 1;
            char[] cArr3 = f132015j;
            cArr[i14] = cArr3[(byte) i27];
            int i29 = i28 + 1;
            cArr[i28] = cArr3[b18 << 4];
            cArr[i29] = f132013h;
            cArr[i29 + 1] = f132013h;
        } else if (i10 == 16) {
            byte b19 = bArr[i13];
            byte b20 = bArr[i13 + 1];
            byte b21 = (byte) (b20 & 15);
            byte b22 = (byte) (b19 & 3);
            int i30 = b19 & (-128);
            int i31 = b19 >> 2;
            if (i30 != 0) {
                i31 ^= 192;
            }
            byte b23 = (byte) i31;
            int i32 = b20 & (-128);
            int i33 = b20 >> 4;
            if (i32 != 0) {
                i33 ^= 240;
            }
            int i34 = i14 + 1;
            char[] cArr4 = f132015j;
            cArr[i14] = cArr4[b23];
            int i35 = i34 + 1;
            cArr[i34] = cArr4[((byte) i33) | (b22 << 4)];
            cArr[i35] = cArr4[b21 << 2];
            cArr[i35 + 1] = f132013h;
        }
        return new String(cArr);
    }

    public static boolean c(char c10) {
        return c10 < 128 && f132014i[c10] != -1;
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int iA = a(charArray);
        if (iA % 4 != 0) {
            return null;
        }
        int i10 = iA / 4;
        if (i10 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10 * 3];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i10 - 1) {
            int i14 = i12 + 1;
            char c10 = charArray[i12];
            if (c(c10)) {
                int i15 = i14 + 1;
                char c11 = charArray[i14];
                if (c(c11)) {
                    int i16 = i15 + 1;
                    char c12 = charArray[i15];
                    if (c(c12)) {
                        int i17 = i16 + 1;
                        char c13 = charArray[i16];
                        if (c(c13)) {
                            byte[] bArr2 = f132014i;
                            byte b10 = bArr2[c10];
                            byte b11 = bArr2[c11];
                            byte b12 = bArr2[c12];
                            byte b13 = bArr2[c13];
                            int i18 = i13 + 1;
                            bArr[i13] = (byte) ((b10 << 2) | (b11 >> 4));
                            int i19 = i18 + 1;
                            bArr[i18] = (byte) (((b11 & 15) << 4) | ((b12 >> 2) & 15));
                            i13 = i19 + 1;
                            bArr[i19] = (byte) ((b12 << 6) | b13);
                            i11++;
                            i12 = i17;
                        }
                    }
                }
            }
            return null;
        }
        int i20 = i12 + 1;
        char c14 = charArray[i12];
        if (!c(c14)) {
            return null;
        }
        int i21 = i20 + 1;
        char c15 = charArray[i20];
        if (!c(c15)) {
            return null;
        }
        byte[] bArr3 = f132014i;
        byte b14 = bArr3[c14];
        byte b15 = bArr3[c15];
        int i22 = i21 + 1;
        char c16 = charArray[i21];
        char c17 = charArray[i22];
        if (c(c16) && c(c17)) {
            byte b16 = bArr3[c16];
            byte b17 = bArr3[c17];
            int i23 = i13 + 1;
            bArr[i13] = (byte) ((b14 << 2) | (b15 >> 4));
            bArr[i23] = (byte) (((b15 & 15) << 4) | ((b16 >> 2) & 15));
            bArr[i23 + 1] = (byte) (b17 | (b16 << 6));
            return bArr;
        }
        if (e(c16) && e(c17)) {
            if ((b15 & 15) != 0) {
                return null;
            }
            int i24 = i11 * 3;
            byte[] bArr4 = new byte[i24 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i24);
            bArr4[i13] = (byte) ((b14 << 2) | (b15 >> 4));
            return bArr4;
        }
        if (e(c16) || !e(c17)) {
            return null;
        }
        byte b18 = bArr3[c16];
        if ((b18 & 3) != 0) {
            return null;
        }
        int i25 = i11 * 3;
        byte[] bArr5 = new byte[i25 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i25);
        bArr5[i13] = (byte) ((b14 << 2) | (b15 >> 4));
        bArr5[i13 + 1] = (byte) (((b18 >> 2) & 15) | ((b15 & 15) << 4));
        return bArr5;
    }

    public static boolean e(char c10) {
        return c10 == '=';
    }

    public static boolean f(char c10) {
        return c10 == ' ' || c10 == '\r' || c10 == '\n' || c10 == '\t';
    }
}
