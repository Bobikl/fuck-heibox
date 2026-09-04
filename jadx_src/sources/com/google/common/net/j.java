package com.google.common.net;

import com.google.common.base.w;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: PercentEscaper.java */
/* JADX INFO: loaded from: classes7.dex */
@a
@o9.b
public final class j extends com.google.common.escape.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f58998e = {'+'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char[] f58999f = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f59000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f59001d;

    public j(String str, boolean z10) {
        w.E(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z10 && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f59000c = z10;
        this.f59001d = h(strConcat);
    }

    private static boolean[] h(String str) {
        char[] charArray = str.toCharArray();
        int iMax = -1;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.l, com.google.common.escape.h
    public String b(String str) {
        w.E(str);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            boolean[] zArr = this.f59001d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return e(str, i10);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.l
    @CheckForNull
    protected char[] d(int i10) {
        boolean[] zArr = this.f59001d;
        if (i10 < zArr.length && zArr[i10]) {
            return null;
        }
        if (i10 == 32 && this.f59000c) {
            return f58998e;
        }
        if (i10 <= 127) {
            char[] cArr = f58999f;
            return new char[]{'%', cArr[i10 >>> 4], cArr[i10 & 15]};
        }
        if (i10 <= 2047) {
            char[] cArr2 = f58999f;
            char[] cArr3 = {'%', cArr2[(i >>> 4) | 12], cArr2[i & 15], '%', cArr2[(i & 3) | 8], cArr2[i10 & 15]};
            int i11 = i10 >>> 4;
            int i12 = i11 >>> 2;
            return cArr3;
        }
        if (i10 <= 65535) {
            char[] cArr4 = f58999f;
            char[] cArr5 = {'%', 'E', cArr4[i >>> 2], '%', cArr4[(i & 3) | 8], cArr4[i & 15], '%', cArr4[(i & 3) | 8], cArr4[i10 & 15]};
            int i13 = i10 >>> 4;
            int i14 = i13 >>> 2;
            int i15 = i14 >>> 4;
            return cArr5;
        }
        if (i10 > 1114111) {
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid unicode character value ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        char[] cArr6 = f58999f;
        char[] cArr7 = {'%', 'F', cArr6[(i >>> 2) & 7], '%', cArr6[(i & 3) | 8], cArr6[i & 15], '%', cArr6[(i & 3) | 8], cArr6[i & 15], '%', cArr6[(i & 3) | 8], cArr6[i10 & 15]};
        int i16 = i10 >>> 4;
        int i17 = i16 >>> 2;
        int i18 = i17 >>> 4;
        int i19 = i18 >>> 2;
        int i20 = i19 >>> 4;
        return cArr7;
    }

    @Override // com.google.common.escape.l
    protected int g(CharSequence charSequence, int i10, int i11) {
        w.E(charSequence);
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            boolean[] zArr = this.f59001d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i10++;
        }
        return i10;
    }
}
