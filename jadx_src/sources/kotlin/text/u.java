package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.collections.k0;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.s0;
import kotlin.u0;

/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class u extends t {
    @sh.f
    private static final boolean A1(String str, StringBuffer stringBuilder) {
        f0.p(str, "<this>");
        f0.p(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    @sh.f
    private static final char[] A2(String str) {
        f0.p(str, "<this>");
        char[] charArray = str.toCharArray();
        f0.o(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    @dl.d
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @s0(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final String B1(@dl.d String str) {
        f0.p(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase();
        f0.o(lowerCase, "this as java.lang.String).toLowerCase()");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        f0.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final char[] B2(@dl.d String str, int i10, int i11) {
        f0.p(str, "<this>");
        kotlin.collections.b.Companion.a(i10, i11, str.length());
        char[] cArr = new char[i11 - i10];
        str.getChars(i10, i11, cArr, 0);
        return cArr;
    }

    @u0(version = "1.4")
    @dl.d
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @s0(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @e2(markerClass = {kotlin.q.class})
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    @sh.h
    public static final String C1(@dl.d String str, @dl.d Locale locale) {
        f0.p(str, "<this>");
        f0.p(locale, "locale");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        f0.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    @sh.f
    private static final char[] C2(String str, char[] destination, int i10, int i11, int i12) {
        f0.p(str, "<this>");
        f0.p(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final String D1(@dl.d byte[] bArr) {
        f0.p(bArr, "<this>");
        return new String(bArr, d.f128566b);
    }

    public static /* synthetic */ char[] D2(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B2(str, i10, i11);
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final String E1(@dl.d byte[] bArr, int i10, int i11, boolean z10) {
        f0.p(bArr, "<this>");
        kotlin.collections.b.Companion.a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, d.f128566b);
        }
        String string = d.f128566b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        f0.o(string, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return string;
    }

    static /* synthetic */ char[] E2(String str, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        f0.p(str, "<this>");
        f0.p(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    public static /* synthetic */ String F1(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return E1(bArr, i10, i11, z10);
    }

    @kotlin.k(message = "Use lowercase() instead.", replaceWith = @s0(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final String F2(String str) {
        f0.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        f0.o(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final byte[] G1(@dl.d String str) {
        f0.p(str, "<this>");
        byte[] bytes = str.getBytes(d.f128566b);
        f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @kotlin.k(message = "Use lowercase() instead.", replaceWith = @s0(expression = "lowercase(locale)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final String G2(String str, Locale locale) {
        f0.p(str, "<this>");
        f0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final byte[] H1(@dl.d String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        f0.p(str, "<this>");
        kotlin.collections.b.Companion.a(i10, i11, str.length());
        if (!z10) {
            String strSubstring = str.substring(i10, i11);
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = d.f128566b;
            f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            f0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer byteBufferEncode = d.f128566b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            f0.m(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                f0.o(bArrArray2, "{\n        byteBuffer.array()\n    }");
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    @sh.f
    private static final Pattern H2(String str, int i10) {
        f0.p(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        f0.o(patternCompile, "compile(this, flags)");
        return patternCompile;
    }

    public static /* synthetic */ byte[] I1(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return H1(str, i10, i11, z10);
    }

    static /* synthetic */ Pattern I2(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        f0.p(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        f0.o(patternCompile, "compile(this, flags)");
        return patternCompile;
    }

    public static final boolean J1(@dl.d String str, @dl.d String suffix, boolean z10) {
        f0.p(str, "<this>");
        f0.p(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : e2(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    @kotlin.k(message = "Use uppercase() instead.", replaceWith = @s0(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final String J2(String str) {
        f0.p(str, "<this>");
        String upperCase = str.toUpperCase();
        f0.o(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static /* synthetic */ boolean K1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J1(str, str2, z10);
    }

    @kotlin.k(message = "Use uppercase() instead.", replaceWith = @s0(expression = "uppercase(locale)", imports = {}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    @sh.f
    private static final String K2(String str, Locale locale) {
        f0.p(str, "<this>");
        f0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final boolean L1(@dl.e String str, @dl.e String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final String L2(String str) {
        f0.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static /* synthetic */ boolean M1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L1(str, str2, z10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final String M2(String str, Locale locale) {
        f0.p(str, "<this>");
        f0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String N1(String str, Locale locale, Object... args) {
        f0.p(str, "<this>");
        f0.p(locale, "locale");
        f0.p(args, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(args, args.length));
        f0.o(str2, "format(locale, this, *args)");
        return str2;
    }

    @sh.f
    private static final String O1(String str, Object... args) {
        f0.p(str, "<this>");
        f0.p(args, "args");
        String str2 = String.format(str, Arrays.copyOf(args, args.length));
        f0.o(str2, "format(this, *args)");
        return str2;
    }

    @sh.f
    private static final String P1(v0 v0Var, String format, Object... args) {
        f0.p(v0Var, "<this>");
        f0.p(format, "format");
        f0.p(args, "args");
        String str = String.format(format, Arrays.copyOf(args, args.length));
        f0.o(str, "format(format, *args)");
        return str;
    }

    @kotlin.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.l(hiddenSince = "1.4")
    @sh.f
    private static final /* synthetic */ String Q1(v0 v0Var, Locale locale, String format, Object... args) {
        f0.p(v0Var, "<this>");
        f0.p(locale, "locale");
        f0.p(format, "format");
        f0.p(args, "args");
        String str = String.format(locale, format, Arrays.copyOf(args, args.length));
        f0.o(str, "format(locale, format, *args)");
        return str;
    }

    @u0(version = "1.4")
    @xh.h(name = "formatNullable")
    @sh.f
    private static final String R1(String str, Locale locale, Object... args) {
        f0.p(str, "<this>");
        f0.p(args, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(args, args.length));
        f0.o(str2, "format(locale, this, *args)");
        return str2;
    }

    @u0(version = "1.4")
    @xh.h(name = "formatNullable")
    @sh.f
    private static final String S1(v0 v0Var, Locale locale, String format, Object... args) {
        f0.p(v0Var, "<this>");
        f0.p(format, "format");
        f0.p(args, "args");
        String str = String.format(locale, format, Arrays.copyOf(args, args.length));
        f0.o(str, "format(locale, format, *args)");
        return str;
    }

    @dl.d
    public static final Comparator<String> T1(@dl.d v0 v0Var) {
        f0.p(v0Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        f0.o(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @sh.f
    private static final String U1(String str) {
        f0.p(str, "<this>");
        String strIntern = str.intern();
        f0.o(strIntern, "this as java.lang.String).intern()");
        return strIntern;
    }

    public static final boolean V1(@dl.d CharSequence charSequence) {
        boolean z10;
        f0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable iterableI3 = StringsKt__StringsKt.i3(charSequence);
            if (!(iterableI3 instanceof Collection) || !((Collection) iterableI3).isEmpty()) {
                Iterator it = iterableI3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    if (!b.r(charSequence.charAt(((k0) it).nextInt()))) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final String W1(String str) {
        f0.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final String X1(String str, Locale locale) {
        f0.p(str, "<this>");
        f0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @sh.f
    private static final int Y1(String str, char c10, int i10) {
        f0.p(str, "<this>");
        return str.indexOf(c10, i10);
    }

    @sh.f
    private static final int Z1(String str, String str2, int i10) {
        f0.p(str, "<this>");
        f0.p(str2, "str");
        return str.indexOf(str2, i10);
    }

    @sh.f
    private static final int a2(String str, char c10, int i10) {
        f0.p(str, "<this>");
        return str.lastIndexOf(c10, i10);
    }

    @sh.f
    private static final int b2(String str, String str2, int i10) {
        f0.p(str, "<this>");
        f0.p(str2, "str");
        return str.lastIndexOf(str2, i10);
    }

    @sh.f
    private static final int c2(String str, int i10, int i11) {
        f0.p(str, "<this>");
        return str.offsetByCodePoints(i10, i11);
    }

    public static final boolean d2(@dl.d CharSequence charSequence, int i10, @dl.d CharSequence other, int i11, int i12, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? e2((String) charSequence, i10, (String) other, i11, i12, z10) : StringsKt__StringsKt.b4(charSequence, i10, other, i11, i12, z10);
    }

    @sh.f
    private static final String e1(StringBuffer stringBuffer) {
        f0.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    public static final boolean e2(@dl.d String str, int i10, @dl.d String other, int i11, int i12, boolean z10) {
        f0.p(str, "<this>");
        f0.p(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    @sh.f
    private static final String f1(StringBuilder stringBuilder) {
        f0.p(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    public static /* synthetic */ boolean f2(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return d2(charSequence, i10, charSequence2, i11, i12, z10);
    }

    @sh.f
    private static final String g1(byte[] bytes) {
        f0.p(bytes, "bytes");
        return new String(bytes, d.f128566b);
    }

    public static /* synthetic */ boolean g2(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return e2(str, i10, str2, i11, i12, z10);
    }

    @sh.f
    private static final String h1(byte[] bytes, int i10, int i11) {
        f0.p(bytes, "bytes");
        return new String(bytes, i10, i11, d.f128566b);
    }

    @dl.d
    public static final String h2(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + lg.a.f131414g).toString());
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        k0 k0VarL = new fi.l(1, i10).iterator();
        while (k0VarL.hasNext()) {
            k0VarL.nextInt();
            sb2.append(charSequence);
        }
        String string = sb2.toString();
        f0.o(string, "{\n                    va…tring()\n                }");
        return string;
    }

    @sh.f
    private static final String i1(byte[] bytes, int i10, int i11, Charset charset) {
        f0.p(bytes, "bytes");
        f0.p(charset, "charset");
        return new String(bytes, i10, i11, charset);
    }

    @dl.d
    public static final String i2(@dl.d String str, char c10, char c11, boolean z10) {
        f0.p(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            f0.o(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (c.J(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @sh.f
    private static final String j1(byte[] bytes, Charset charset) {
        f0.p(bytes, "bytes");
        f0.p(charset, "charset");
        return new String(bytes, charset);
    }

    @dl.d
    public static final String j2(@dl.d String str, @dl.d String oldValue, @dl.d String newValue, boolean z10) {
        f0.p(str, "<this>");
        f0.p(oldValue, "oldValue");
        f0.p(newValue, "newValue");
        int i10 = 0;
        int iO3 = StringsKt__StringsKt.o3(str, oldValue, 0, z10);
        if (iO3 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iU = fi.u.u(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iO3);
            sb2.append(newValue);
            i10 = iO3 + length;
            if (iO3 >= str.length()) {
                break;
            }
            iO3 = StringsKt__StringsKt.o3(str, oldValue, iO3 + iU, z10);
        } while (iO3 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        f0.o(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    @sh.f
    private static final String k1(char[] chars) {
        f0.p(chars, "chars");
        return new String(chars);
    }

    public static /* synthetic */ String k2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return i2(str, c10, c11, z10);
    }

    @sh.f
    private static final String l1(char[] chars, int i10, int i11) {
        f0.p(chars, "chars");
        return new String(chars, i10, i11);
    }

    public static /* synthetic */ String l2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return j2(str, str2, str3, z10);
    }

    @sh.f
    private static final String m1(int[] codePoints, int i10, int i11) {
        f0.p(codePoints, "codePoints");
        return new String(codePoints, i10, i11);
    }

    @dl.d
    public static final String m2(@dl.d String str, char c10, char c11, boolean z10) {
        f0.p(str, "<this>");
        int iR3 = StringsKt__StringsKt.r3(str, c10, 0, z10, 2, null);
        return iR3 < 0 ? str : StringsKt__StringsKt.J4(str, iR3, iR3 + 1, String.valueOf(c11)).toString();
    }

    @dl.d
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @s0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    public static final String n1(@dl.d String str) {
        f0.p(str, "<this>");
        Locale locale = Locale.getDefault();
        f0.o(locale, "getDefault()");
        return o1(str, locale);
    }

    @dl.d
    public static final String n2(@dl.d String str, @dl.d String oldValue, @dl.d String newValue, boolean z10) {
        f0.p(str, "<this>");
        f0.p(oldValue, "oldValue");
        f0.p(newValue, "newValue");
        int iS3 = StringsKt__StringsKt.s3(str, oldValue, 0, z10, 2, null);
        return iS3 < 0 ? str : StringsKt__StringsKt.J4(str, iS3, oldValue.length() + iS3, newValue).toString();
    }

    @u0(version = "1.4")
    @dl.d
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @s0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @e2(markerClass = {kotlin.q.class})
    @kotlin.l(warningSince = org.apache.tools.ant.util.s0.f136928s)
    @sh.h
    public static final String o1(@dl.d String str, @dl.d Locale locale) {
        f0.p(str, "<this>");
        f0.p(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            f0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        f0.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring2);
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String o2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m2(str, c10, c11, z10);
    }

    @sh.f
    private static final int p1(String str, int i10) {
        f0.p(str, "<this>");
        return str.codePointAt(i10);
    }

    public static /* synthetic */ String p2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return n2(str, str2, str3, z10);
    }

    @sh.f
    private static final int q1(String str, int i10) {
        f0.p(str, "<this>");
        return str.codePointBefore(i10);
    }

    @dl.d
    public static final List<String> q2(@dl.d CharSequence charSequence, @dl.d Pattern regex, int i10) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        StringsKt__StringsKt.N4(i10);
        if (i10 == 0) {
            i10 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i10);
        f0.o(strArrSplit, "regex.split(this, if (limit == 0) -1 else limit)");
        return kotlin.collections.m.t(strArrSplit);
    }

    @sh.f
    private static final int r1(String str, int i10, int i11) {
        f0.p(str, "<this>");
        return str.codePointCount(i10, i11);
    }

    public static /* synthetic */ List r2(CharSequence charSequence, Pattern pattern, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return q2(charSequence, pattern, i10);
    }

    public static final int s1(@dl.d String str, @dl.d String other, boolean z10) {
        f0.p(str, "<this>");
        f0.p(other, "other");
        return z10 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static final boolean s2(@dl.d String str, @dl.d String prefix, int i10, boolean z10) {
        f0.p(str, "<this>");
        f0.p(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : e2(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ int t1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s1(str, str2, z10);
    }

    public static final boolean t2(@dl.d String str, @dl.d String prefix, boolean z10) {
        f0.p(str, "<this>");
        f0.p(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : e2(str, 0, prefix, 0, prefix.length(), z10);
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final String u1(@dl.d char[] cArr) {
        f0.p(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ boolean u2(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return s2(str, str2, i10, z10);
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final String v1(@dl.d char[] cArr, int i10, int i11) {
        f0.p(cArr, "<this>");
        kotlin.collections.b.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static /* synthetic */ boolean v2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t2(str, str2, z10);
    }

    public static /* synthetic */ String w1(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        return v1(cArr, i10, i11);
    }

    @sh.f
    private static final String w2(String str, int i10) {
        f0.p(str, "<this>");
        String strSubstring = str.substring(i10);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    public static final boolean x1(@dl.e CharSequence charSequence, @dl.e CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? StringsKt__StringsKt.Y2(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @sh.f
    private static final String x2(String str, int i10, int i11) {
        f0.p(str, "<this>");
        String strSubstring = str.substring(i10, i11);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    public static final boolean y1(@dl.e CharSequence charSequence, @dl.e CharSequence charSequence2, boolean z10) {
        return z10 ? StringsKt__StringsKt.X2(charSequence, charSequence2) : x1(charSequence, charSequence2);
    }

    @sh.f
    private static final byte[] y2(String str, Charset charset) {
        f0.p(str, "<this>");
        f0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @sh.f
    private static final boolean z1(String str, CharSequence charSequence) {
        f0.p(str, "<this>");
        f0.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    static /* synthetic */ byte[] z2(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = d.f128566b;
        }
        f0.p(str, "<this>");
        f0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
