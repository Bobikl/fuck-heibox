package kotlin.text;

import java.util.Locale;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final String A(char c10) {
        String strValueOf = String.valueOf(c10);
        f0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final String B(char c10, @dl.d Locale locale) {
        f0.p(locale, "locale");
        String strValueOf = String.valueOf(c10);
        f0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final char C(char c10) {
        return Character.toUpperCase(c10);
    }

    @r0
    public static final int a(int i10) {
        if (new fi.l(2, 36).s(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new fi.l(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    @dl.d
    public static final CharCategory c(char c10) {
        return CharCategory.Companion.a(Character.getType(c10));
    }

    @dl.d
    public static final CharDirectionality d(char c10) {
        return CharDirectionality.Companion.b(Character.getDirectionality(c10));
    }

    @sh.f
    private static final boolean e(char c10) {
        return Character.isDefined(c10);
    }

    @sh.f
    private static final boolean f(char c10) {
        return Character.isDigit(c10);
    }

    @sh.f
    private static final boolean g(char c10) {
        return Character.isHighSurrogate(c10);
    }

    @sh.f
    private static final boolean h(char c10) {
        return Character.isISOControl(c10);
    }

    @sh.f
    private static final boolean i(char c10) {
        return Character.isIdentifierIgnorable(c10);
    }

    @sh.f
    private static final boolean j(char c10) {
        return Character.isJavaIdentifierPart(c10);
    }

    @sh.f
    private static final boolean k(char c10) {
        return Character.isJavaIdentifierStart(c10);
    }

    @sh.f
    private static final boolean l(char c10) {
        return Character.isLetter(c10);
    }

    @sh.f
    private static final boolean m(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    @sh.f
    private static final boolean n(char c10) {
        return Character.isLowSurrogate(c10);
    }

    @sh.f
    private static final boolean o(char c10) {
        return Character.isLowerCase(c10);
    }

    @sh.f
    private static final boolean p(char c10) {
        return Character.isTitleCase(c10);
    }

    @sh.f
    private static final boolean q(char c10) {
        return Character.isUpperCase(c10);
    }

    public static final boolean r(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final String s(char c10) {
        String strValueOf = String.valueOf(c10);
        f0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final String t(char c10, @dl.d Locale locale) {
        f0.p(locale, "locale");
        String strValueOf = String.valueOf(c10);
        f0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final char u(char c10) {
        return Character.toLowerCase(c10);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final String v(char c10, @dl.d Locale locale) {
        f0.p(locale, "locale");
        String strB = B(c10, locale);
        if (strB.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            f0.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            f0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !f0.g(strB, upperCase) ? strB : String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return strB;
        }
        char cCharAt = strB.charAt(0);
        f0.n(strB, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strB.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return cCharAt + lowerCase;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final char w(char c10) {
        return Character.toTitleCase(c10);
    }

    @kotlin.k(message = "Use lowercaseChar() instead.", replaceWith = @kotlin.s0(expression = "lowercaseChar()", imports = {}))
    @kotlin.l(warningSince = s0.f136928s)
    @sh.f
    private static final char x(char c10) {
        return Character.toLowerCase(c10);
    }

    @kotlin.k(message = "Use titlecaseChar() instead.", replaceWith = @kotlin.s0(expression = "titlecaseChar()", imports = {}))
    @kotlin.l(warningSince = s0.f136928s)
    @sh.f
    private static final char y(char c10) {
        return Character.toTitleCase(c10);
    }

    @kotlin.k(message = "Use uppercaseChar() instead.", replaceWith = @kotlin.s0(expression = "uppercaseChar()", imports = {}))
    @kotlin.l(warningSince = s0.f136928s)
    @sh.f
    private static final char z(char c10) {
        return Character.toUpperCase(c10);
    }
}
