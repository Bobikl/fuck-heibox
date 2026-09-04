package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k0;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.l0;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
public class StringsKt__StringsKt extends u {

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a extends kotlin.collections.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f128546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f128547c;

        a(CharSequence charSequence) {
            this.f128547c = charSequence;
        }

        @Override // kotlin.collections.q
        public char b() {
            CharSequence charSequence = this.f128547c;
            int i10 = this.f128546b;
            this.f128546b = i10 + 1;
            return charSequence.charAt(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128546b < this.f128547c.length();
        }
    }

    @sh.f
    private static final boolean A3(CharSequence charSequence) {
        return charSequence == null || u.V1(charSequence);
    }

    public static /* synthetic */ String A4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return y4(str, c10, str2, str3);
    }

    @dl.d
    public static final String A5(@dl.d String str, @dl.d String delimiter, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        if (iG3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iG3);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @sh.f
    private static final boolean B3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String B4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return z4(str, str2, str3, str4);
    }

    public static /* synthetic */ String B5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return z5(str, c10, str2);
    }

    @dl.d
    public static final kotlin.collections.q C3(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return new a(charSequence);
    }

    @dl.d
    public static final String C4(@dl.d String str, char c10, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        return iF3 == -1 ? missingDelimiterValue : J4(str, 0, iF3, replacement).toString();
    }

    public static /* synthetic */ String C5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return A5(str, str2, str3);
    }

    public static final int D3(@dl.d CharSequence charSequence, char c10, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? I3(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    @dl.d
    public static final String D4(@dl.d String str, @dl.d String delimiter, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        return iG3 == -1 ? missingDelimiterValue : J4(str, 0, iG3, replacement).toString();
    }

    @u0(version = s0.f136928s)
    public static final boolean D5(@dl.d String str) {
        f0.p(str, "<this>");
        if (f0.g(str, "true")) {
            return true;
        }
        if (f0.g(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int E3(@dl.d CharSequence charSequence, @dl.d String string, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(string, "string");
        return (z10 || !(charSequence instanceof String)) ? p3(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ String E4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return C4(str, c10, str2, str3);
    }

    @u0(version = s0.f136928s)
    @dl.e
    public static final Boolean E5(@dl.d String str) {
        f0.p(str, "<this>");
        if (f0.g(str, "true")) {
            return Boolean.TRUE;
        }
        if (f0.g(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int F3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return D3(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String F4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return D4(str, str2, str3, str4);
    }

    @dl.d
    public static final CharSequence F5(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zR = b.r(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zR) {
                    break;
                }
                length--;
            } else if (zR) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int G3(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return E3(charSequence, str, i10, z10);
    }

    @sh.f
    private static final String G4(CharSequence charSequence, Regex regex, String replacement) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        f0.p(replacement, "replacement");
        return regex.o(charSequence, replacement);
    }

    @dl.d
    public static final CharSequence G5(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(charSequence.charAt(!z10 ? i10 : length))).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int H3(@dl.d CharSequence charSequence, @dl.d Collection<String> strings, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(strings, "strings");
        Pair<Integer, String> pairE3 = e3(charSequence, strings, i10, z10, true);
        if (pairE3 != null) {
            return pairE3.e().intValue();
        }
        return -1;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @l0
    @xh.h(name = "replaceFirstCharWithChar")
    @sh.f
    private static final String H4(String str, yh.l<? super Character, Character> transform) {
        f0.p(str, "<this>");
        f0.p(transform, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
        String strSubstring = str.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return cCharValue + strSubstring;
    }

    @dl.d
    public static final CharSequence H5(@dl.d CharSequence charSequence, @dl.d char... chars) {
        f0.p(charSequence, "<this>");
        f0.p(chars, "chars");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zO8 = ArraysKt___ArraysKt.O8(chars, charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zO8) {
                    break;
                }
                length--;
            } else if (zO8) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int I3(@dl.d CharSequence charSequence, @dl.d char[] chars, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt___ArraysKt.xt(chars), i10);
        }
        for (int iB = fi.u.B(i10, j3(charSequence)); -1 < iB; iB--) {
            char cCharAt = charSequence.charAt(iB);
            boolean z11 = false;
            for (char c10 : chars) {
                if (c.J(c10, cCharAt, z10)) {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                return iB;
            }
        }
        return -1;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class})
    @l0
    @xh.h(name = "replaceFirstCharWithCharSequence")
    @sh.f
    private static final String I4(String str, yh.l<? super Character, ? extends CharSequence> transform) {
        f0.p(str, "<this>");
        f0.p(transform, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
        String strSubstring = str.substring(1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @sh.f
    private static final String I5(String str) {
        f0.p(str, "<this>");
        return F5(str).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return H3(charSequence, collection, i10, z10);
    }

    @dl.d
    public static final CharSequence J4(@dl.d CharSequence charSequence, int i10, int i11, @dl.d CharSequence replacement) {
        f0.p(charSequence, "<this>");
        f0.p(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            f0.o(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            f0.o(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    @dl.d
    public static final String J5(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(str.charAt(!z10 ? i10 : length))).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ int K3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return I3(charSequence, cArr, i10, z10);
    }

    @dl.d
    public static final CharSequence K4(@dl.d CharSequence charSequence, @dl.d fi.l range, @dl.d CharSequence replacement) {
        f0.p(charSequence, "<this>");
        f0.p(range, "range");
        f0.p(replacement, "replacement");
        return J4(charSequence, range.D().intValue(), range.e().intValue() + 1, replacement);
    }

    @dl.d
    public static final String K5(@dl.d String str, @dl.d char... chars) {
        f0.p(str, "<this>");
        f0.p(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zO8 = ArraysKt___ArraysKt.O8(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zO8) {
                    break;
                }
                length--;
            } else if (zO8) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    @dl.d
    public static final kotlin.sequences.m<String> L3(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return a5(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @sh.f
    private static final String L4(String str, int i10, int i11, CharSequence replacement) {
        f0.p(str, "<this>");
        f0.p(replacement, "replacement");
        return J4(str, i10, i11, replacement).toString();
    }

    @dl.d
    public static final CharSequence L5(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!b.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return "";
    }

    @dl.d
    public static final List<String> M3(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return SequencesKt___SequencesKt.c3(L3(charSequence));
    }

    @sh.f
    private static final String M4(String str, fi.l range, CharSequence replacement) {
        f0.p(str, "<this>");
        f0.p(range, "range");
        f0.p(replacement, "replacement");
        return K4(str, range, replacement).toString();
    }

    @dl.d
    public static final CharSequence M5(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    @sh.f
    private static final boolean N3(CharSequence charSequence, Regex regex) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        return regex.k(charSequence);
    }

    public static final void N4(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    @dl.d
    public static final CharSequence N5(@dl.d CharSequence charSequence, @dl.d char... chars) {
        f0.p(charSequence, "<this>");
        f0.p(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!ArraysKt___ArraysKt.O8(chars, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return "";
    }

    @dl.d
    public static final String O2(@dl.d CharSequence charSequence, @dl.d CharSequence other, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        int i10 = 0;
        while (i10 < iMin && c.J(charSequence.charAt(i10), other.charAt(i10), z10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (k3(charSequence, i11) || k3(other, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    @sh.f
    private static final String O3(String str) {
        return str == null ? "" : str;
    }

    @sh.f
    private static final List<String> O4(CharSequence charSequence, Regex regex, int i10) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        return regex.p(charSequence, i10);
    }

    @sh.f
    private static final String O5(String str) {
        f0.p(str, "<this>");
        return L5(str).toString();
    }

    public static /* synthetic */ String P2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O2(charSequence, charSequence2, z10);
    }

    @dl.d
    public static final CharSequence P3(@dl.d CharSequence charSequence, int i10, char c10) {
        f0.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        k0 k0VarL = new fi.l(1, i10 - charSequence.length()).iterator();
        while (k0VarL.hasNext()) {
            k0VarL.nextInt();
            sb2.append(c10);
        }
        return sb2;
    }

    @dl.d
    public static final List<String> P4(@dl.d CharSequence charSequence, @dl.d char[] delimiters, boolean z10, int i10) {
        f0.p(charSequence, "<this>");
        f0.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return R4(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableN = SequencesKt___SequencesKt.N(Z3(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(iterableN, 10));
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            arrayList.add(k5(charSequence, (fi.l) it.next()));
        }
        return arrayList;
    }

    @dl.d
    public static final String P5(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!predicate.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    @dl.d
    public static final String Q2(@dl.d CharSequence charSequence, @dl.d CharSequence other, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(other, "other");
        int length = charSequence.length();
        int length2 = other.length();
        int iMin = Math.min(length, length2);
        int i10 = 0;
        while (i10 < iMin && c.J(charSequence.charAt((length - i10) - 1), other.charAt((length2 - i10) - 1), z10)) {
            i10++;
        }
        if (k3(charSequence, (length - i10) - 1) || k3(other, (length2 - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(length - i10, length).toString();
    }

    @dl.d
    public static final String Q3(@dl.d String str, int i10, char c10) {
        f0.p(str, "<this>");
        return P3(str, i10, c10).toString();
    }

    @dl.d
    public static final List<String> Q4(@dl.d CharSequence charSequence, @dl.d String[] delimiters, boolean z10, int i10) {
        f0.p(charSequence, "<this>");
        f0.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return R4(charSequence, str, z10, i10);
            }
        }
        Iterable iterableN = SequencesKt___SequencesKt.N(a4(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(iterableN, 10));
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            arrayList.add(k5(charSequence, (fi.l) it.next()));
        }
        return arrayList;
    }

    @dl.d
    public static final String Q5(@dl.d String str, @dl.d char... chars) {
        CharSequence charSequenceSubSequence;
        f0.p(str, "<this>");
        f0.p(chars, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!ArraysKt___ArraysKt.O8(chars, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ String R2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Q2(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ CharSequence R3(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return P3(charSequence, i10, c10);
    }

    private static final List<String> R4(CharSequence charSequence, String str, boolean z10, int i10) {
        N4(i10);
        int length = 0;
        int iO3 = o3(charSequence, str, 0, z10);
        if (iO3 == -1 || i10 == 1) {
            return kotlin.collections.s.k(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? fi.u.B(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iO3).toString());
            length = str.length() + iO3;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iO3 = o3(charSequence, str, length, z10);
        } while (iO3 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    @dl.d
    public static final CharSequence R5(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!b.r(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean S2(@dl.d CharSequence charSequence, char c10, boolean z10) {
        f0.p(charSequence, "<this>");
        return r3(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ String S3(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return Q3(str, i10, c10);
    }

    static /* synthetic */ List S4(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        return regex.p(charSequence, i10);
    }

    @dl.d
    public static final CharSequence S5(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean T2(@dl.d CharSequence charSequence, @dl.d CharSequence other, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(other, "other");
        if (other instanceof String) {
            if (s3(charSequence, (String) other, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (q3(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    @dl.d
    public static final CharSequence T3(@dl.d CharSequence charSequence, int i10, char c10) {
        f0.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        k0 k0VarL = new fi.l(1, i10 - charSequence.length()).iterator();
        while (k0VarL.hasNext()) {
            k0VarL.nextInt();
            sb2.append(c10);
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static /* synthetic */ List T4(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return P4(charSequence, cArr, z10, i10);
    }

    @dl.d
    public static final CharSequence T5(@dl.d CharSequence charSequence, @dl.d char... chars) {
        f0.p(charSequence, "<this>");
        f0.p(chars, "chars");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!ArraysKt___ArraysKt.O8(chars, charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    @sh.f
    private static final boolean U2(CharSequence charSequence, Regex regex) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        return regex.b(charSequence);
    }

    @dl.d
    public static final String U3(@dl.d String str, int i10, char c10) {
        f0.p(str, "<this>");
        return T3(str, i10, c10).toString();
    }

    public static /* synthetic */ List U4(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Q4(charSequence, strArr, z10, i10);
    }

    @sh.f
    private static final String U5(String str) {
        f0.p(str, "<this>");
        return R5(str).toString();
    }

    public static /* synthetic */ boolean V2(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S2(charSequence, c10, z10);
    }

    public static /* synthetic */ CharSequence V3(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return T3(charSequence, i10, c10);
    }

    @u0(version = s0.f136930u)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final kotlin.sequences.m<String> V4(CharSequence charSequence, Regex regex, int i10) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        return regex.r(charSequence, i10);
    }

    @dl.d
    public static final String V5(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ boolean W2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return T2(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String W3(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return U3(str, i10, c10);
    }

    @dl.d
    public static final kotlin.sequences.m<String> W4(@dl.d final CharSequence charSequence, @dl.d char[] delimiters, boolean z10, int i10) {
        f0.p(charSequence, "<this>");
        f0.p(delimiters, "delimiters");
        return SequencesKt___SequencesKt.k1(Z3(charSequence, delimiters, 0, z10, i10, 2, null), new yh.l<fi.l, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d fi.l it) {
                f0.p(it, "it");
                return StringsKt__StringsKt.k5(charSequence, it);
            }
        });
    }

    @dl.d
    public static final String W5(@dl.d String str, @dl.d char... chars) {
        CharSequence charSequenceSubSequence;
        f0.p(str, "<this>");
        f0.p(chars, "chars");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!ArraysKt___ArraysKt.O8(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static final boolean X2(@dl.e CharSequence charSequence, @dl.e CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return u.L1((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!c.J(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<fi.l> X3(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        N4(i11);
        return new f(charSequence, i10, i11, new yh.p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @dl.e
            public final Pair<Integer, Integer> a(@dl.d CharSequence $receiver, int i12) {
                f0.p($receiver, "$this$$receiver");
                int iU3 = StringsKt__StringsKt.u3($receiver, cArr, i12, z10);
                if (iU3 < 0) {
                    return null;
                }
                return c1.a(Integer.valueOf(iU3), 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return a(charSequence2, num.intValue());
            }
        });
    }

    @dl.d
    public static final kotlin.sequences.m<String> X4(@dl.d final CharSequence charSequence, @dl.d String[] delimiters, boolean z10, int i10) {
        f0.p(charSequence, "<this>");
        f0.p(delimiters, "delimiters");
        return SequencesKt___SequencesKt.k1(a4(charSequence, delimiters, 0, z10, i10, 2, null), new yh.l<fi.l, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d fi.l it) {
                f0.p(it, "it");
                return StringsKt__StringsKt.k5(charSequence, it);
            }
        });
    }

    public static final boolean Y2(@dl.e CharSequence charSequence, @dl.e CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return f0.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<fi.l> Y3(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        N4(i11);
        final List listT = kotlin.collections.m.t(strArr);
        return new f(charSequence, i10, i11, new yh.p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @dl.e
            public final Pair<Integer, Integer> a(@dl.d CharSequence $receiver, int i12) {
                f0.p($receiver, "$this$$receiver");
                Pair pairE3 = StringsKt__StringsKt.e3($receiver, listT, i12, z10, false);
                if (pairE3 != null) {
                    return c1.a(pairE3.e(), Integer.valueOf(((String) pairE3.f()).length()));
                }
                return null;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return a(charSequence2, num.intValue());
            }
        });
    }

    static /* synthetic */ kotlin.sequences.m Y4(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        return regex.r(charSequence, i10);
    }

    public static final boolean Z2(@dl.d CharSequence charSequence, char c10, boolean z10) {
        f0.p(charSequence, "<this>");
        return charSequence.length() > 0 && c.J(charSequence.charAt(j3(charSequence)), c10, z10);
    }

    static /* synthetic */ kotlin.sequences.m Z3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return X3(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ kotlin.sequences.m Z4(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return W4(charSequence, cArr, z10, i10);
    }

    public static final boolean a3(@dl.d CharSequence charSequence, @dl.d CharSequence suffix, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? u.K1((String) charSequence, (String) suffix, false, 2, null) : b4(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    static /* synthetic */ kotlin.sequences.m a4(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return Y3(charSequence, strArr, i10, z10, i11);
    }

    public static /* synthetic */ kotlin.sequences.m a5(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return X4(charSequence, strArr, z10, i10);
    }

    public static /* synthetic */ boolean b3(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Z2(charSequence, c10, z10);
    }

    public static final boolean b4(@dl.d CharSequence charSequence, int i10, @dl.d CharSequence other, int i11, int i12, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.J(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b5(@dl.d CharSequence charSequence, char c10, boolean z10) {
        f0.p(charSequence, "<this>");
        return charSequence.length() > 0 && c.J(charSequence.charAt(0), c10, z10);
    }

    public static /* synthetic */ boolean c3(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a3(charSequence, charSequence2, z10);
    }

    @dl.d
    public static final CharSequence c4(@dl.d CharSequence charSequence, @dl.d CharSequence prefix) {
        f0.p(charSequence, "<this>");
        f0.p(prefix, "prefix");
        return g5(charSequence, prefix, false, 2, null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean c5(@dl.d CharSequence charSequence, @dl.d CharSequence prefix, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? u.u2((String) charSequence, (String) prefix, i10, false, 4, null) : b4(charSequence, i10, prefix, 0, prefix.length(), z10);
    }

    @dl.e
    public static final Pair<Integer, String> d3(@dl.d CharSequence charSequence, @dl.d Collection<String> strings, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(strings, "strings");
        return e3(charSequence, strings, i10, z10, false);
    }

    @dl.d
    public static final String d4(@dl.d String str, @dl.d CharSequence prefix) {
        f0.p(str, "<this>");
        f0.p(prefix, "prefix");
        if (!g5(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final boolean d5(@dl.d CharSequence charSequence, @dl.d CharSequence prefix, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? u.v2((String) charSequence, (String) prefix, false, 2, null) : b4(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, String> e3(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object next;
        String str;
        Object next2;
        String str2;
        if (!z10 && collection.size() == 1) {
            String str3 = (String) CollectionsKt___CollectionsKt.a5(collection);
            int iS3 = !z11 ? s3(charSequence, str3, i10, false, 4, null) : G3(charSequence, str3, i10, false, 4, null);
            if (iS3 < 0) {
                return null;
            }
            return c1.a(Integer.valueOf(iS3), str3);
        }
        fi.j lVar = !z11 ? new fi.l(fi.u.u(i10, 0), charSequence.length()) : fi.u.k0(fi.u.B(i10, j3(charSequence)), 0);
        if (charSequence instanceof String) {
            int iH = lVar.h();
            int i11 = lVar.i();
            int iJ = lVar.j();
            if ((iJ > 0 && iH <= i11) || (iJ < 0 && i11 <= iH)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str2 = (String) next2;
                    } while (!u.e2(str2, 0, (String) charSequence, iH, str2.length(), z10));
                    String str4 = (String) next2;
                    if (str4 != null) {
                        return c1.a(Integer.valueOf(iH), str4);
                    }
                    if (iH != i11) {
                        iH += iJ;
                    }
                }
            }
        } else {
            int iH2 = lVar.h();
            int i12 = lVar.i();
            int iJ2 = lVar.j();
            if ((iJ2 > 0 && iH2 <= i12) || (iJ2 < 0 && i12 <= iH2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str = (String) next;
                    } while (!b4(str, 0, charSequence, iH2, str.length(), z10));
                    String str5 = (String) next;
                    if (str5 != null) {
                        return c1.a(Integer.valueOf(iH2), str5);
                    }
                    if (iH2 != i12) {
                        iH2 += iJ2;
                    }
                }
            }
        }
        return null;
    }

    @dl.d
    public static final CharSequence e4(@dl.d CharSequence charSequence, int i10, int i11) {
        f0.p(charSequence, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
        }
        if (i11 == i10) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i11 - i10));
        sb2.append(charSequence, 0, i10);
        f0.o(sb2, "this.append(value, startIndex, endIndex)");
        sb2.append(charSequence, i11, charSequence.length());
        f0.o(sb2, "this.append(value, startIndex, endIndex)");
        return sb2;
    }

    public static /* synthetic */ boolean e5(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b5(charSequence, c10, z10);
    }

    public static /* synthetic */ Pair f3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return d3(charSequence, collection, i10, z10);
    }

    @dl.d
    public static final CharSequence f4(@dl.d CharSequence charSequence, @dl.d fi.l range) {
        f0.p(charSequence, "<this>");
        f0.p(range, "range");
        return e4(charSequence, range.D().intValue(), range.e().intValue() + 1);
    }

    public static /* synthetic */ boolean f5(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return c5(charSequence, charSequence2, i10, z10);
    }

    @dl.e
    public static final Pair<Integer, String> g3(@dl.d CharSequence charSequence, @dl.d Collection<String> strings, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(strings, "strings");
        return e3(charSequence, strings, i10, z10, true);
    }

    @sh.f
    private static final String g4(String str, int i10, int i11) {
        f0.p(str, "<this>");
        return e4(str, i10, i11).toString();
    }

    public static /* synthetic */ boolean g5(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d5(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ Pair h3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return g3(charSequence, collection, i10, z10);
    }

    @sh.f
    private static final String h4(String str, fi.l range) {
        f0.p(str, "<this>");
        f0.p(range, "range");
        return f4(str, range).toString();
    }

    @dl.d
    public static final CharSequence h5(@dl.d CharSequence charSequence, @dl.d fi.l range) {
        f0.p(charSequence, "<this>");
        f0.p(range, "range");
        return charSequence.subSequence(range.D().intValue(), range.e().intValue() + 1);
    }

    @dl.d
    public static final fi.l i3(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return new fi.l(0, charSequence.length() - 1);
    }

    @dl.d
    public static final CharSequence i4(@dl.d CharSequence charSequence, @dl.d CharSequence suffix) {
        f0.p(charSequence, "<this>");
        f0.p(suffix, "suffix");
        return c3(charSequence, suffix, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @kotlin.k(message = "Use parameters named startIndex and endIndex.", replaceWith = @kotlin.s0(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @sh.f
    private static final CharSequence i5(String str, int i10, int i11) {
        f0.p(str, "<this>");
        return str.subSequence(i10, i11);
    }

    public static final int j3(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @dl.d
    public static final String j4(@dl.d String str, @dl.d CharSequence suffix) {
        f0.p(str, "<this>");
        f0.p(suffix, "suffix");
        if (!c3(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @sh.f
    private static final String j5(CharSequence charSequence, int i10, int i11) {
        f0.p(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final boolean k3(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        return new fi.l(0, charSequence.length() + (-2)).s(i10) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }

    @dl.d
    public static final CharSequence k4(@dl.d CharSequence charSequence, @dl.d CharSequence delimiter) {
        f0.p(charSequence, "<this>");
        f0.p(delimiter, "delimiter");
        return l4(charSequence, delimiter, delimiter);
    }

    @dl.d
    public static final String k5(@dl.d CharSequence charSequence, @dl.d fi.l range) {
        f0.p(charSequence, "<this>");
        f0.p(range, "range");
        return charSequence.subSequence(range.D().intValue(), range.e().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @sh.f
    private static final <C extends CharSequence & R, R> R l3(C c10, yh.a<? extends R> defaultValue) {
        f0.p(defaultValue, "defaultValue");
        return u.V1(c10) ? defaultValue.invoke() : c10;
    }

    @dl.d
    public static final CharSequence l4(@dl.d CharSequence charSequence, @dl.d CharSequence prefix, @dl.d CharSequence suffix) {
        f0.p(charSequence, "<this>");
        f0.p(prefix, "prefix");
        f0.p(suffix, "suffix");
        return (charSequence.length() >= prefix.length() + suffix.length() && g5(charSequence, prefix, false, 2, null) && c3(charSequence, suffix, false, 2, null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @dl.d
    public static final String l5(@dl.d String str, @dl.d fi.l range) {
        f0.p(str, "<this>");
        f0.p(range, "range");
        String strSubstring = str.substring(range.D().intValue(), range.e().intValue() + 1);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @sh.f
    private static final <C extends CharSequence & R, R> R m3(C c10, yh.a<? extends R> defaultValue) {
        f0.p(defaultValue, "defaultValue");
        return c10.length() == 0 ? defaultValue.invoke() : c10;
    }

    @dl.d
    public static final String m4(@dl.d String str, @dl.d CharSequence delimiter) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        return n4(str, delimiter, delimiter);
    }

    static /* synthetic */ String m5(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        f0.p(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final int n3(@dl.d CharSequence charSequence, char c10, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? u3(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    @dl.d
    public static final String n4(@dl.d String str, @dl.d CharSequence prefix, @dl.d CharSequence suffix) {
        f0.p(str, "<this>");
        f0.p(prefix, "prefix");
        f0.p(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !g5(str, prefix, false, 2, null) || !c3(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @dl.d
    public static final String n5(@dl.d String str, char c10, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, c10, 0, false, 6, null);
        if (iR3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iR3 + 1, str.length());
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int o3(@dl.d CharSequence charSequence, @dl.d String string, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(string, "string");
        return (z10 || !(charSequence instanceof String)) ? q3(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    @sh.f
    private static final String o4(CharSequence charSequence, Regex regex, String replacement) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        f0.p(replacement, "replacement");
        return regex.m(charSequence, replacement);
    }

    @dl.d
    public static final String o5(@dl.d String str, @dl.d String delimiter, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iS3 = s3(str, delimiter, 0, false, 6, null);
        if (iS3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iS3 + delimiter.length(), str.length());
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private static final int p3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        fi.j lVar = !z11 ? new fi.l(fi.u.u(i10, 0), fi.u.B(i11, charSequence.length())) : fi.u.k0(fi.u.B(i10, j3(charSequence)), fi.u.u(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iH = lVar.h();
            int i12 = lVar.i();
            int iJ = lVar.j();
            if ((iJ <= 0 || iH > i12) && (iJ >= 0 || i12 > iH)) {
                return -1;
            }
            while (!u.e2((String) charSequence2, 0, (String) charSequence, iH, charSequence2.length(), z10)) {
                if (iH == i12) {
                    return -1;
                }
                iH += iJ;
            }
            return iH;
        }
        int iH2 = lVar.h();
        int i13 = lVar.i();
        int iJ2 = lVar.j();
        if ((iJ2 <= 0 || iH2 > i13) && (iJ2 >= 0 || i13 > iH2)) {
            return -1;
        }
        while (!b4(charSequence2, 0, charSequence, iH2, charSequence2.length(), z10)) {
            if (iH2 == i13) {
                return -1;
            }
            iH2 += iJ2;
        }
        return iH2;
    }

    @sh.f
    private static final String p4(CharSequence charSequence, Regex regex, yh.l<? super k, ? extends CharSequence> transform) {
        f0.p(charSequence, "<this>");
        f0.p(regex, "regex");
        f0.p(transform, "transform");
        return regex.n(charSequence, transform);
    }

    public static /* synthetic */ String p5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return n5(str, c10, str2);
    }

    static /* synthetic */ int q3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return p3(charSequence, charSequence2, i10, i11, z10, z11);
    }

    @dl.d
    public static final String q4(@dl.d String str, char c10, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, c10, 0, false, 6, null);
        return iR3 == -1 ? missingDelimiterValue : J4(str, iR3 + 1, str.length(), replacement).toString();
    }

    public static /* synthetic */ String q5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return o5(str, str2, str3);
    }

    public static /* synthetic */ int r3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n3(charSequence, c10, i10, z10);
    }

    @dl.d
    public static final String r4(@dl.d String str, @dl.d String delimiter, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iS3 = s3(str, delimiter, 0, false, 6, null);
        return iS3 == -1 ? missingDelimiterValue : J4(str, iS3 + delimiter.length(), str.length(), replacement).toString();
    }

    @dl.d
    public static final String r5(@dl.d String str, char c10, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        if (iF3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iF3 + 1, str.length());
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ int s3(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return o3(charSequence, str, i10, z10);
    }

    public static /* synthetic */ String s4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return q4(str, c10, str2, str3);
    }

    @dl.d
    public static final String s5(@dl.d String str, @dl.d String delimiter, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        if (iG3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iG3 + delimiter.length(), str.length());
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int t3(@dl.d CharSequence charSequence, @dl.d Collection<String> strings, int i10, boolean z10) {
        f0.p(charSequence, "<this>");
        f0.p(strings, "strings");
        Pair<Integer, String> pairE3 = e3(charSequence, strings, i10, z10, false);
        if (pairE3 != null) {
            return pairE3.e().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String t4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return r4(str, str2, str3, str4);
    }

    public static /* synthetic */ String t5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return r5(str, c10, str2);
    }

    public static final int u3(@dl.d CharSequence charSequence, @dl.d char[] chars, int i10, boolean z10) {
        boolean z11;
        f0.p(charSequence, "<this>");
        f0.p(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt___ArraysKt.xt(chars), i10);
        }
        k0 k0VarL = new fi.l(fi.u.u(i10, 0), j3(charSequence)).iterator();
        while (k0VarL.hasNext()) {
            int iNextInt = k0VarL.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            int length = chars.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (c.J(chars[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iNextInt;
            }
        }
        return -1;
    }

    @dl.d
    public static final String u4(@dl.d String str, char c10, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        return iF3 == -1 ? missingDelimiterValue : J4(str, iF3 + 1, str.length(), replacement).toString();
    }

    public static /* synthetic */ String u5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return s5(str, str2, str3);
    }

    public static /* synthetic */ int v3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return t3(charSequence, collection, i10, z10);
    }

    @dl.d
    public static final String v4(@dl.d String str, @dl.d String delimiter, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        return iG3 == -1 ? missingDelimiterValue : J4(str, iG3 + delimiter.length(), str.length(), replacement).toString();
    }

    @dl.d
    public static final String v5(@dl.d String str, char c10, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, c10, 0, false, 6, null);
        if (iR3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iR3);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ int w3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return u3(charSequence, cArr, i10, z10);
    }

    public static /* synthetic */ String w4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return u4(str, c10, str2, str3);
    }

    @dl.d
    public static final String w5(@dl.d String str, @dl.d String delimiter, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iS3 = s3(str, delimiter, 0, false, 6, null);
        if (iS3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iS3);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @sh.f
    private static final boolean x3(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static /* synthetic */ String x4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return v4(str, str2, str3, str4);
    }

    public static /* synthetic */ String x5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return v5(str, c10, str2);
    }

    @sh.f
    private static final boolean y3(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return !u.V1(charSequence);
    }

    @dl.d
    public static final String y4(@dl.d String str, char c10, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, c10, 0, false, 6, null);
        return iR3 == -1 ? missingDelimiterValue : J4(str, 0, iR3, replacement).toString();
    }

    public static /* synthetic */ String y5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return w5(str, str2, str3);
    }

    @sh.f
    private static final boolean z3(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @dl.d
    public static final String z4(@dl.d String str, @dl.d String delimiter, @dl.d String replacement, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(delimiter, "delimiter");
        f0.p(replacement, "replacement");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iS3 = s3(str, delimiter, 0, false, 6, null);
        return iS3 == -1 ? missingDelimiterValue : J4(str, 0, iS3, replacement).toString();
    }

    @dl.d
    public static final String z5(@dl.d String str, char c10, @dl.d String missingDelimiterValue) {
        f0.p(str, "<this>");
        f0.p(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        if (iF3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iF3);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
