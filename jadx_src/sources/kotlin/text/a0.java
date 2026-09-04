package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 {
    @dl.d
    public static final String a(char c10) {
        String strValueOf = String.valueOf(c10);
        f0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        f0.n(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return cCharAt + lowerCase;
    }
}
