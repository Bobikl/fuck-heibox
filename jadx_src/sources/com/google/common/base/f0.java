package com.google.common.base;

/* JADX INFO: compiled from: Utf8.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.b(emulated = true)
@g
public final class f0 {
    private f0() {
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iB = length;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt >= 2048) {
                iB += b(charSequence, i10);
                break;
            }
            iB += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iB >= length) {
            return iB;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) iB) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) == cCharAt) {
                        throw new IllegalArgumentException(f(i10));
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    public static boolean c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static boolean d(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        w.f0(i10, i12, bArr.length);
        while (i10 < i12) {
            if (bArr[i10] < 0) {
                return e(bArr, i10, i12);
            }
            i10++;
        }
        return true;
    }

    private static boolean e(byte[] bArr, int i10, int i11) {
        byte b10;
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 < 0) {
                if (b11 < -32) {
                    if (i12 != i11 && b11 >= -62) {
                        i10 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return false;
                }
                if (b11 < -16) {
                    int i13 = i12 + 1;
                    if (i13 < i11 && (b10 = bArr[i12]) <= -65 && ((b11 != -32 || b10 >= -96) && (b11 != -19 || -96 > b10))) {
                        i10 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return false;
                }
                if (i12 + 2 >= i11) {
                    return false;
                }
                int i14 = i12 + 1;
                byte b12 = bArr[i12];
                if (b12 <= -65 && (((b11 << a.F) + (b12 + 112)) >> 30) == 0) {
                    int i15 = i14 + 1;
                    if (bArr[i14] <= -65) {
                        i12 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                    }
                }
                return false;
            }
            i10 = i12;
        }
        return true;
    }

    private static String f(int i10) {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i10);
        return sb2.toString();
    }
}
