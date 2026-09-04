package com.google.common.escape;

import com.google.common.base.w;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: UnicodeEscaper.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public abstract class l extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58271b = 32;

    protected l() {
    }

    protected static int c(CharSequence charSequence, int i10, int i11) {
        w.E(charSequence);
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i12 = i10 + 1;
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            String strValueOf = String.valueOf(charSequence);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 88);
            sb2.append("Unexpected low surrogate character '");
            sb2.append(cCharAt);
            sb2.append("' with value ");
            sb2.append((int) cCharAt);
            sb2.append(" at index ");
            sb2.append(i12 - 1);
            sb2.append(" in '");
            sb2.append(strValueOf);
            sb2.append("'");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i12 == i11) {
            return -cCharAt;
        }
        char cCharAt2 = charSequence.charAt(i12);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        String strValueOf2 = String.valueOf(charSequence);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 89);
        sb3.append("Expected low surrogate but got char '");
        sb3.append(cCharAt2);
        sb3.append("' with value ");
        sb3.append((int) cCharAt2);
        sb3.append(" at index ");
        sb3.append(i12);
        sb3.append(" in '");
        sb3.append(strValueOf2);
        sb3.append("'");
        throw new IllegalArgumentException(sb3.toString());
    }

    private static char[] f(char[] cArr, int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i11];
        if (i10 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i10);
        }
        return cArr2;
    }

    @Override // com.google.common.escape.h
    public String b(String str) {
        w.E(str);
        int length = str.length();
        int iG = g(str, 0, length);
        return iG == length ? str : e(str, iG);
    }

    @CheckForNull
    protected abstract char[] d(int i10);

    protected final String e(String str, int i10) {
        int length = str.length();
        char[] cArrA = k.a();
        int i11 = 0;
        int length2 = 0;
        while (i10 < length) {
            int iC = c(str, i10, length);
            if (iC < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrD = d(iC);
            int i12 = (Character.isSupplementaryCodePoint(iC) ? 2 : 1) + i10;
            if (cArrD != null) {
                int i13 = i10 - i11;
                int i14 = length2 + i13;
                int length3 = cArrD.length + i14;
                if (cArrA.length < length3) {
                    cArrA = f(cArrA, length2, length3 + (length - i10) + 32);
                }
                if (i13 > 0) {
                    str.getChars(i11, i10, cArrA, length2);
                    length2 = i14;
                }
                if (cArrD.length > 0) {
                    System.arraycopy(cArrD, 0, cArrA, length2, cArrD.length);
                    length2 += cArrD.length;
                }
                i11 = i12;
            }
            i10 = g(str, i12, length);
        }
        int i15 = length - i11;
        if (i15 > 0) {
            int i16 = i15 + length2;
            if (cArrA.length < i16) {
                cArrA = f(cArrA, length2, i16);
            }
            str.getChars(i11, length, cArrA, length2);
            length2 = i16;
        }
        return new String(cArrA, 0, length2);
    }

    protected int g(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            int iC = c(charSequence, i10, i11);
            if (iC < 0 || d(iC) != null) {
                break;
            }
            i10 += Character.isSupplementaryCodePoint(iC) ? 2 : 1;
        }
        return i10;
    }
}
