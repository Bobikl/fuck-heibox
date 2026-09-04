package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Strings.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class b0 {
    private b0() {
    }

    public static String a(CharSequence charSequence, CharSequence charSequence2) {
        w.E(charSequence);
        w.E(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < iMin && charSequence.charAt(i10) == charSequence2.charAt(i10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (k(charSequence, i11) || k(charSequence2, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        w.E(charSequence);
        w.E(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < iMin && charSequence.charAt((charSequence.length() - i10) - 1) == charSequence2.charAt((charSequence2.length() - i10) - 1)) {
            i10++;
        }
        if (k(charSequence, (charSequence.length() - i10) - 1) || k(charSequence2, (charSequence2.length() - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(charSequence.length() - i10, charSequence.length()).toString();
    }

    @CheckForNull
    public static String c(@CheckForNull String str) {
        return v.c(str);
    }

    public static boolean d(@CheckForNull String str) {
        return v.k(str);
    }

    public static String e(@CheckForNull String str, @CheckForNull Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i10 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i11 = 0; i11 < objArr.length; i11++) {
                objArr[i11] = f(objArr[i11]);
            }
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) strValueOf, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String f(@CheckForNull Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb2.append(name);
            sb2.append('@');
            sb2.append(hexString);
            String string = sb2.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(string);
            logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
            sb3.append("<");
            sb3.append(string);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static String g(@CheckForNull String str) {
        return v.h(str);
    }

    public static String h(String str, int i10, char c10) {
        w.E(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public static String i(String str, int i10, char c10) {
        w.E(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(String str, int i10) {
        w.E(str);
        if (i10 <= 1) {
            w.k(i10 >= 0, "invalid count: %s", i10);
            return i10 == 0 ? "" : str;
        }
        int length = str.length();
        long j10 = ((long) length) * ((long) i10);
        int i11 = (int) j10;
        if (i11 != j10) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Required array size too large: ");
            sb2.append(j10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        char[] cArr = new char[i11];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i12 = i11 - length;
            if (length >= i12) {
                System.arraycopy(cArr, 0, cArr, length, i12);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @o9.d
    static boolean k(CharSequence charSequence, int i10) {
        return i10 >= 0 && i10 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }
}
