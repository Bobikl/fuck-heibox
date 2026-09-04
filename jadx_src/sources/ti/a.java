package ti;

import dl.d;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: capitalizeDecapitalize.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @d
    public static final String a(@d String str) {
        f0.p(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if ('a' <= cCharAt && cCharAt < '{') {
            z10 = true;
        }
        if (!z10) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    @d
    public static final String b(@d String str) {
        f0.p(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if ('A' <= cCharAt && cCharAt < '[') {
            z10 = true;
        }
        if (!z10) {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + strSubstring;
    }

    @d
    public static final String c(@d String str, boolean z10) {
        Integer next;
        f0.p(str, "<this>");
        if ((str.length() == 0) || !d(str, 0, z10)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z10)) {
            if (z10) {
                return b(str);
            }
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + strSubstring;
        }
        Iterator<Integer> it = StringsKt__StringsKt.i3(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!d(str, next.intValue(), z10)));
        Integer num = next;
        if (num == null) {
            return e(str, z10);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(e(strSubstring2, z10));
        String strSubstring3 = str.substring(iIntValue);
        f0.o(strSubstring3, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    private static final boolean d(String str, int i10, boolean z10) {
        char cCharAt = str.charAt(i10);
        if (z10) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return Character.isUpperCase(cCharAt);
    }

    private static final String e(String str, boolean z10) {
        if (z10) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @d
    public static final String f(@d String str) {
        f0.p(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        f0.o(string, "builder.toString()");
        return string;
    }
}
