package kotlin.text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.c1;
import kotlin.collections.d0;
import kotlin.collections.d1;
import kotlin.collections.h0;
import kotlin.collections.i0;
import kotlin.collections.k0;
import kotlin.collections.r0;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.l0;
import kotlin.n1;
import kotlin.r1;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
public class StringsKt___StringsKt extends v {

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class a implements Iterable<Character>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f128554b;

        public a(CharSequence charSequence) {
            this.f128554b = charSequence;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.C3(this.f128554b);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class b implements kotlin.sequences.m<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f128555a;

        public b(CharSequence charSequence) {
            this.f128555a = charSequence;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.C3(this.f128555a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    /* JADX INFO: compiled from: _Strings.kt */
    public static final class c<K> implements d0<Character, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f128556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<Character, K> f128557b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(CharSequence charSequence, yh.l<? super Character, ? extends K> lVar) {
            this.f128556a = charSequence;
            this.f128557b = lVar;
        }

        @Override // kotlin.collections.d0
        public /* bridge */ /* synthetic */ Object a(Character ch2) {
            return c(ch2.charValue());
        }

        @Override // kotlin.collections.d0
        @dl.d
        public Iterator<Character> b() {
            return StringsKt__StringsKt.C3(this.f128556a);
        }

        public K c(char c10) {
            return this.f128557b.invoke(Character.valueOf(c10));
        }
    }

    @dl.d
    public static final CharSequence A6(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(fi.u.B(i10, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<R> A7(@dl.d CharSequence charSequence, @dl.d yh.p<? super Integer, ? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @dl.d
    public static final CharSequence A8(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        f0.o(sbReverse, "StringBuilder(this).reverse()");
        return sbReverse;
    }

    @dl.d
    public static final String B6(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(fi.u.B(i10, str.length()));
            f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C B7(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @sh.f
    private static final String B8(String str) {
        f0.p(str, "<this>");
        return A8(str).toString();
    }

    @dl.d
    public static final CharSequence C6(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        if (i10 >= 0) {
            return X8(charSequence, fi.u.u(charSequence.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C C7(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = "1.4")
    @dl.d
    public static final <R> List<R> C8(@dl.d CharSequence charSequence, R r10, @dl.d yh.p<? super R, ? super Character, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.d
    public static final String D6(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        if (i10 >= 0) {
            return Y8(str, fi.u.u(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<R> D7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @dl.d
    public static final <R> List<R> D8(@dl.d CharSequence charSequence, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.d
    public static final CharSequence E6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int iJ3 = StringsKt__StringsKt.j3(charSequence); -1 < iJ3; iJ3--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(iJ3))).booleanValue()) {
                return charSequence.subSequence(0, iJ3 + 1);
            }
        }
        return "";
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C E7(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.l<? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @u0(version = "1.4")
    @dl.d
    public static final List<Character> E8(@dl.d CharSequence charSequence, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i10 = 1; i10 < length; i10++) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @dl.d
    public static final String F6(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        for (int iJ3 = StringsKt__StringsKt.j3(str); -1 < iJ3; iJ3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iJ3))).booleanValue()) {
                String strSubstring = str.substring(0, iJ3 + 1);
                f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        }
        return "";
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C F7(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.l<? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return destination;
    }

    @u0(version = "1.4")
    @dl.d
    public static final List<Character> F8(@dl.d CharSequence charSequence, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i10 = 1; i10 < length; i10++) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @dl.d
    public static final CharSequence G6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
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

    @u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Character G7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        k0 it = new fi.l(1, iJ3).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <R> List<R> G8(@dl.d CharSequence charSequence, R r10, @dl.d yh.p<? super R, ? super Character, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @dl.d
    public static final String H6(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(i10);
                f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
        }
        return "";
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char H7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 == 0) {
            return cCharAt;
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        k0 it = new fi.l(1, iJ3).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <R> List<R> H8(@dl.d CharSequence charSequence, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.s.k(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @sh.f
    private static final char I6(CharSequence charSequence, int i10, yh.l<? super Integer, Character> defaultValue) {
        f0.p(charSequence, "<this>");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > StringsKt__StringsKt.j3(charSequence)) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final double I7(CharSequence charSequence, yh.l<? super Character, Double> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    public static final char I8(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @sh.f
    private static final Character J6(CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        return m7(charSequence, i10);
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final float J7(CharSequence charSequence, yh.l<? super Character, Float> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    public static final char J8(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        f0.n(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    @dl.d
    public static final CharSequence K6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) throws IOException {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R extends Comparable<? super R>> R K7(CharSequence charSequence, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dl.e
    public static final Character K8(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @dl.d
    public static final String L6(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) throws IOException {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        f0.o(string, "filterTo(StringBuilder(), predicate).toString()");
        return string;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R extends Comparable<? super R>> R L7(CharSequence charSequence, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dl.e
    public static final Character L8(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        boolean z10 = false;
        Character chValueOf = null;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @dl.d
    public static final CharSequence M6(@dl.d CharSequence charSequence, @dl.d yh.p<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final Double M7(CharSequence charSequence, yh.l<? super Character, Double> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @dl.d
    public static final CharSequence M8(@dl.d CharSequence charSequence, @dl.d fi.l indices) {
        f0.p(charSequence, "<this>");
        f0.p(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.h5(charSequence, indices);
    }

    @dl.d
    public static final String N6(@dl.d String str, @dl.d yh.p<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        String string = sb2.toString();
        f0.o(string, "filterIndexedTo(StringBu…(), predicate).toString()");
        return string;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final Float N7(CharSequence charSequence, yh.l<? super Character, Float> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @dl.d
    public static final CharSequence N8(@dl.d CharSequence charSequence, @dl.d Iterable<Integer> indices) {
        f0.p(charSequence, "<this>");
        f0.p(indices, "indices");
        int iY = kotlin.collections.t.Y(indices, 10);
        if (iY == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iY);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb2.append(charSequence.charAt(it.next().intValue()));
        }
        return sb2;
    }

    @dl.d
    public static final <C extends Appendable> C O6(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.p<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R> R O7(CharSequence charSequence, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dl.d
    public static final String O8(@dl.d String str, @dl.d fi.l indices) {
        f0.p(str, "<this>");
        f0.p(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.l5(str, indices);
    }

    @dl.d
    public static final CharSequence P6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) throws IOException {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R> R P7(CharSequence charSequence, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @sh.f
    private static final String P8(String str, Iterable<Integer> indices) {
        f0.p(str, "<this>");
        f0.p(indices, "indices");
        return N8(str, indices).toString();
    }

    @dl.d
    public static final String Q6(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) throws IOException {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        f0.o(string, "filterNotTo(StringBuilder(), predicate).toString()");
        return string;
    }

    @u0(version = "1.4")
    @dl.e
    public static final Character Q7(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (f0.t(cCharAt, cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = s0.f136928s)
    public static final int Q8(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Integer> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).intValue();
        }
        return iIntValue;
    }

    @dl.d
    public static final <C extends Appendable> C R6(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.l<? super Character, Boolean> predicate) throws IOException {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "maxOrThrow")
    public static final char R7(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (f0.t(cCharAt, cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @kotlin.k(message = "Use sumOf instead.", replaceWith = @kotlin.s0(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.l(warningSince = s0.f136928s)
    public static final double R8(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Double> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @dl.d
    public static final <C extends Appendable> C S6(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.l<? super Character, Boolean> predicate) throws IOException {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @u0(version = "1.4")
    @dl.e
    public static final Character S7(@dl.d CharSequence charSequence, @dl.d Comparator<? super Character> comparator) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfDouble")
    @sh.f
    private static final double S8(CharSequence charSequence, yh.l<? super Character, Double> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @sh.f
    private static final Character T6(CharSequence charSequence, yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "maxWithOrThrow")
    public static final char T7(@dl.d CharSequence charSequence, @dl.d Comparator<? super Character> comparator) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfInt")
    @sh.f
    private static final int T8(CharSequence charSequence, yh.l<? super Character, Integer> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).intValue();
        }
        return iIntValue;
    }

    @sh.f
    private static final Character U6(CharSequence charSequence, yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @u0(version = "1.4")
    @dl.e
    public static final <R extends Comparable<? super R>> Character U7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        k0 it = new fi.l(1, iJ3).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfLong")
    @sh.f
    private static final long U8(CharSequence charSequence, yh.l<? super Character, Long> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        long jLongValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            jLongValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).longValue();
        }
        return jLongValue;
    }

    public static final char V6(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char V7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 == 0) {
            return cCharAt;
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        k0 it = new fi.l(1, iJ3).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @l0
    @xh.h(name = "sumOfUInt")
    @sh.f
    private static final int V8(CharSequence charSequence, yh.l<? super Character, n1> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        int iH = n1.h(0);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iH = n1.h(iH + selector.invoke(Character.valueOf(charSequence.charAt(i10))).q0());
        }
        return iH;
    }

    public static final char W6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final double W7(CharSequence charSequence, yh.l<? super Character, Double> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @l0
    @xh.h(name = "sumOfULong")
    @sh.f
    private static final long W8(CharSequence charSequence, yh.l<? super Character, r1> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        long jH = r1.h(0L);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            jH = r1.h(jH + selector.invoke(Character.valueOf(charSequence.charAt(i10))).q0());
        }
        return jH;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @u0(version = s0.f136928s)
    @sh.f
    private static final <R> R X6(CharSequence charSequence, yh.l<? super Character, ? extends R> transform) {
        R rInvoke;
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final float X7(CharSequence charSequence, yh.l<? super Character, Float> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @dl.d
    public static final CharSequence X8(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(0, fi.u.B(i10, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @u0(version = s0.f136928s)
    @sh.f
    private static final <R> R Y6(CharSequence charSequence, yh.l<? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Y7(CharSequence charSequence, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dl.d
    public static final String Y8(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, fi.u.B(i10, str.length()));
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @dl.e
    public static final Character Z6(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R extends Comparable<? super R>> R Z7(CharSequence charSequence, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dl.d
    public static final CharSequence Z8(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        if (i10 >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - fi.u.B(i10, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @dl.e
    public static final Character a7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final Double a8(CharSequence charSequence, yh.l<? super Character, Double> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @dl.d
    public static final String a9(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - fi.u.B(i10, length));
            f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @dl.d
    public static final <R> List<R> b7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends Iterable<? extends R>> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            kotlin.collections.x.n0(arrayList, transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final Float b8(CharSequence charSequence, yh.l<? super Character, Float> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @dl.d
    public static final CharSequence b9(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int iJ3 = StringsKt__StringsKt.j3(charSequence); -1 < iJ3; iJ3--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(iJ3))).booleanValue()) {
                return charSequence.subSequence(iJ3 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "flatMapIndexedIterable")
    @sh.f
    private static final <R> List<R> c7(CharSequence charSequence, yh.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            kotlin.collections.x.n0(arrayList, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R> R c8(CharSequence charSequence, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dl.d
    public static final String c9(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        for (int iJ3 = StringsKt__StringsKt.j3(str); -1 < iJ3; iJ3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iJ3))).booleanValue()) {
                String strSubstring = str.substring(iJ3 + 1);
                f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
        }
        return str;
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "flatMapIndexedIterableTo")
    @sh.f
    private static final <R, C extends Collection<? super R>> C d7(CharSequence charSequence, C destination, yh.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            kotlin.collections.x.n0(destination, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0(version = "1.4")
    @l0
    @sh.f
    private static final <R> R d8(CharSequence charSequence, Comparator<? super R> comparator, yh.l<? super Character, ? extends R> selector) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @dl.d
    public static final CharSequence d9(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return charSequence.subSequence(0, i10);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @dl.d
    public static final <R, C extends Collection<? super R>> C e7(@dl.d CharSequence charSequence, @dl.d C destination, @dl.d yh.l<? super Character, ? extends Iterable<? extends R>> transform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            kotlin.collections.x.n0(destination, transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return destination;
    }

    @u0(version = "1.4")
    @dl.e
    public static final Character e8(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (f0.t(cCharAt, cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @dl.d
    public static final String e9(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(0, i10);
                f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final <R> R f7(@dl.d CharSequence charSequence, R r10, @dl.d yh.p<? super R, ? super Character, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
        }
        return r10;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "minOrThrow")
    public static final char f8(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (f0.t(cCharAt, cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @dl.d
    public static final <C extends Collection<? super Character>> C f9(@dl.d CharSequence charSequence, @dl.d C destination) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }

    public static final <R> R g7(@dl.d CharSequence charSequence, R r10, @dl.d yh.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @u0(version = "1.4")
    @dl.e
    public static final Character g8(@dl.d CharSequence charSequence, @dl.d Comparator<? super Character> comparator) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @dl.d
    public static final HashSet<Character> g9(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return (HashSet) f9(charSequence, new HashSet(r0.j(fi.u.B(charSequence.length(), 128))));
    }

    public static final boolean h6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R h7(@dl.d CharSequence charSequence, R r10, @dl.d yh.p<? super Character, ? super R, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        for (int iJ3 = StringsKt__StringsKt.j3(charSequence); iJ3 >= 0; iJ3--) {
            r10 = operation.invoke(Character.valueOf(charSequence.charAt(iJ3)), r10);
        }
        return r10;
    }

    @u0(version = s0.f136932w)
    @xh.h(name = "minWithOrThrow")
    public static final char h8(@dl.d CharSequence charSequence, @dl.d Comparator<? super Character> comparator) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @dl.d
    public static final List<Character> h9(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? i9(charSequence) : kotlin.collections.s.k(Character.valueOf(charSequence.charAt(0)));
        }
        return CollectionsKt__CollectionsKt.E();
    }

    public static final boolean i6(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final <R> R i7(@dl.d CharSequence charSequence, R r10, @dl.d yh.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        for (int iJ3 = StringsKt__StringsKt.j3(charSequence); iJ3 >= 0; iJ3--) {
            r10 = operation.invoke(Integer.valueOf(iJ3), Character.valueOf(charSequence.charAt(iJ3)), r10);
        }
        return r10;
    }

    public static final boolean i8(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @dl.d
    public static final List<Character> i9(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return (List) f9(charSequence, new ArrayList(charSequence.length()));
    }

    public static final boolean j6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void j7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, b2> action) {
        f0.p(charSequence, "<this>");
        f0.p(action, "action");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            action.invoke(Character.valueOf(charSequence.charAt(i10)));
        }
    }

    public static final boolean j8(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final Set<Character> j9(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? (Set) f9(charSequence, new LinkedHashSet(r0.j(fi.u.B(charSequence.length(), 128)))) : c1.f(Character.valueOf(charSequence.charAt(0)));
        }
        return d1.k();
    }

    @dl.d
    public static final Iterable<Character> k6(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return CollectionsKt__CollectionsKt.E();
            }
        }
        return new a(charSequence);
    }

    public static final void k7(@dl.d CharSequence charSequence, @dl.d yh.p<? super Integer, ? super Character, b2> action) {
        f0.p(charSequence, "<this>");
        f0.p(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
    }

    @u0(version = "1.1")
    @dl.d
    public static final <S extends CharSequence> S k8(@dl.d S s10, @dl.d yh.l<? super Character, b2> action) {
        f0.p(s10, "<this>");
        f0.p(action, "action");
        for (int i10 = 0; i10 < s10.length(); i10++) {
            action.invoke(Character.valueOf(s10.charAt(i10)));
        }
        return s10;
    }

    @u0(version = "1.2")
    @dl.d
    public static final List<String> k9(@dl.d CharSequence charSequence, int i10, int i11, boolean z10) {
        f0.p(charSequence, "<this>");
        return l9(charSequence, i10, i11, z10, new yh.l<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$windowed$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d CharSequence it) {
                f0.p(it, "it");
                return it.toString();
            }
        });
    }

    @dl.d
    public static final kotlin.sequences.m<Character> l6(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return SequencesKt__SequencesKt.g();
            }
        }
        return new b(charSequence);
    }

    @sh.f
    private static final char l7(CharSequence charSequence, int i10, yh.l<? super Integer, Character> defaultValue) {
        f0.p(charSequence, "<this>");
        f0.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > StringsKt__StringsKt.j3(charSequence)) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @u0(version = "1.4")
    @dl.d
    public static final <S extends CharSequence> S l8(@dl.d S s10, @dl.d yh.p<? super Integer, ? super Character, b2> action) {
        f0.p(s10, "<this>");
        f0.p(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < s10.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(s10.charAt(i10)));
            i10++;
            i11++;
        }
        return s10;
    }

    @u0(version = "1.2")
    @dl.d
    public static final <R> List<R> l9(@dl.d CharSequence charSequence, int i10, int i11, boolean z10, @dl.d yh.l<? super CharSequence, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        SlidingWindowKt.a(i10, i11);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < length)) {
                break;
            }
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    @dl.d
    public static final <K, V> Map<K, V> m6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    @dl.e
    public static final Character m7(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        if (i10 < 0 || i10 > StringsKt__StringsKt.j3(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    @dl.d
    public static final Pair<CharSequence, CharSequence> m8(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        return new Pair<>(sb2, sb3);
    }

    public static /* synthetic */ List m9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return k9(charSequence, i10, i11, z10);
    }

    @dl.d
    public static final <K> Map<K, Character> n6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        f0.p(charSequence, "<this>");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K> Map<K, List<Character>> n7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        f0.p(charSequence, "<this>");
        f0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final Pair<String, String> n8(@dl.d String str, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(str, "<this>");
        f0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        String string = sb2.toString();
        f0.o(string, "first.toString()");
        String string2 = sb3.toString();
        f0.o(string2, "second.toString()");
        return new Pair<>(string, string2);
    }

    public static /* synthetic */ List n9(CharSequence charSequence, int i10, int i11, boolean z10, yh.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return l9(charSequence, i10, i11, z10, lVar);
    }

    @dl.d
    public static final <K, V> Map<K, V> o6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        f0.p(charSequence, "<this>");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V> Map<K, List<V>> o7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        f0.p(charSequence, "<this>");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @u0(version = "1.3")
    @sh.f
    private static final char o8(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return p8(charSequence, Random.f125033b);
    }

    @u0(version = "1.2")
    @dl.d
    public static final kotlin.sequences.m<String> o9(@dl.d CharSequence charSequence, int i10, int i11, boolean z10) {
        f0.p(charSequence, "<this>");
        return p9(charSequence, i10, i11, z10, new yh.l<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d CharSequence it) {
                f0.p(it, "it");
                return it.toString();
            }
        });
    }

    @dl.d
    public static final <K, M extends Map<? super K, ? super Character>> M p6(@dl.d CharSequence charSequence, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    @dl.d
    public static final <K, M extends Map<? super K, List<Character>>> M p7(@dl.d CharSequence charSequence, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    @u0(version = "1.3")
    public static final char p8(@dl.d CharSequence charSequence, @dl.d Random random) {
        f0.p(charSequence, "<this>");
        f0.p(random, "random");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(random.m(charSequence.length()));
    }

    @u0(version = "1.2")
    @dl.d
    public static final <R> kotlin.sequences.m<R> p9(@dl.d final CharSequence charSequence, final int i10, int i11, boolean z10, @dl.d final yh.l<? super CharSequence, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        SlidingWindowKt.a(i10, i11);
        return SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(fi.u.B1(z10 ? StringsKt__StringsKt.i3(charSequence) : fi.u.W1(0, (charSequence.length() - i10) + 1), i11)), new yh.l<Integer, R>() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R a(int i12) {
                int length = i10 + i12;
                if (length < 0 || length > charSequence.length()) {
                    length = charSequence.length();
                }
                return transform.invoke(charSequence.subSequence(i12, length));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        });
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M q6(@dl.d CharSequence charSequence, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <K, V, M extends Map<? super K, List<V>>> M q7(@dl.d CharSequence charSequence, @dl.d M destination, @dl.d yh.l<? super Character, ? extends K> keySelector, @dl.d yh.l<? super Character, ? extends V> valueTransform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(keySelector, "keySelector");
        f0.p(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final Character q8(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return r8(charSequence, Random.f125033b);
    }

    public static /* synthetic */ kotlin.sequences.m q9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return o9(charSequence, i10, i11, z10);
    }

    @dl.d
    public static final <K, V, M extends Map<? super K, ? super V>> M r6(@dl.d CharSequence charSequence, @dl.d M destination, @dl.d yh.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            destination.put(pairInvoke.e(), pairInvoke.f());
        }
        return destination;
    }

    @u0(version = "1.1")
    @dl.d
    public static final <K> d0<Character, K> r7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends K> keySelector) {
        f0.p(charSequence, "<this>");
        f0.p(keySelector, "keySelector");
        return new c(charSequence, keySelector);
    }

    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Character r8(@dl.d CharSequence charSequence, @dl.d Random random) {
        f0.p(charSequence, "<this>");
        f0.p(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.m(charSequence.length())));
    }

    public static /* synthetic */ kotlin.sequences.m r9(CharSequence charSequence, int i10, int i11, boolean z10, yh.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return p9(charSequence, i10, i11, z10, lVar);
    }

    @u0(version = "1.3")
    @dl.d
    public static final <V> Map<Character, V> s6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends V> valueSelector) {
        f0.p(charSequence, "<this>");
        f0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(fi.u.B(charSequence.length(), 128)), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static final int s7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final char s8(@dl.d CharSequence charSequence, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return cCharAt;
    }

    @dl.d
    public static final Iterable<h0<Character>> s9(@dl.d final CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return new i0(new yh.a<Iterator<? extends Character>>() { // from class: kotlin.text.StringsKt___StringsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<Character> invoke() {
                return StringsKt__StringsKt.C3(charSequence);
            }
        });
    }

    @u0(version = "1.3")
    @dl.d
    public static final <V, M extends Map<? super Character, ? super V>> M t6(@dl.d CharSequence charSequence, @dl.d M destination, @dl.d yh.l<? super Character, ? extends V> valueSelector) {
        f0.p(charSequence, "<this>");
        f0.p(destination, "destination");
        f0.p(valueSelector, "valueSelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final int t7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    public static final char t8(@dl.d CharSequence charSequence, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return cCharAt;
    }

    @dl.d
    public static final List<Pair<Character, Character>> t9(@dl.d CharSequence charSequence, @dl.d CharSequence other) {
        f0.p(charSequence, "<this>");
        f0.p(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(kotlin.c1.a(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    @u0(version = "1.2")
    @dl.d
    public static final List<String> u6(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        return k9(charSequence, i10, i10, true);
    }

    public static final char u7(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(StringsKt__StringsKt.j3(charSequence));
    }

    @u0(version = "1.4")
    @dl.e
    public static final Character u8(@dl.d CharSequence charSequence, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @dl.d
    public static final <V> List<V> u9(@dl.d CharSequence charSequence, @dl.d CharSequence other, @dl.d yh.p<? super Character, ? super Character, ? extends V> transform) {
        f0.p(charSequence, "<this>");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    @u0(version = "1.2")
    @dl.d
    public static final <R> List<R> v6(@dl.d CharSequence charSequence, int i10, @dl.d yh.l<? super CharSequence, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        return l9(charSequence, i10, i10, true, transform);
    }

    public static final char v7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return cCharAt;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Character v8(@dl.d CharSequence charSequence, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        k0 it = new fi.l(1, StringsKt__StringsKt.j3(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @u0(version = "1.2")
    @dl.d
    public static final List<Pair<Character, Character>> v9(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            i10++;
            arrayList.add(kotlin.c1.a(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @u0(version = "1.2")
    @dl.d
    public static final kotlin.sequences.m<String> w6(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        return x6(charSequence, i10, new yh.l<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$chunkedSequence$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d CharSequence it) {
                f0.p(it, "it");
                return it.toString();
            }
        });
    }

    @dl.e
    public static final Character w7(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char w8(@dl.d CharSequence charSequence, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iJ3);
        for (int i10 = iJ3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @u0(version = "1.2")
    @dl.d
    public static final <R> List<R> w9(@dl.d CharSequence charSequence, @dl.d yh.p<? super Character, ? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i10));
            i10++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @u0(version = "1.2")
    @dl.d
    public static final <R> kotlin.sequences.m<R> x6(@dl.d CharSequence charSequence, int i10, @dl.d yh.l<? super CharSequence, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        return p9(charSequence, i10, i10, true, transform);
    }

    @dl.e
    public static final Character x7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static final char x8(@dl.d CharSequence charSequence, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iJ3);
        for (int i10 = iJ3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @sh.f
    private static final int y6(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return charSequence.length();
    }

    @dl.d
    public static final <R> List<R> y7(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @dl.e
    public static final Character y8(@dl.d CharSequence charSequence, @dl.d yh.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iJ3);
        for (int i10 = iJ3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final int z6(@dl.d CharSequence charSequence, @dl.d yh.l<? super Character, Boolean> predicate) {
        f0.p(charSequence, "<this>");
        f0.p(predicate, "predicate");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @dl.d
    public static final <R> List<R> z7(@dl.d CharSequence charSequence, @dl.d yh.p<? super Integer, ? super Character, ? extends R> transform) {
        f0.p(charSequence, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final Character z8(@dl.d CharSequence charSequence, @dl.d yh.p<? super Character, ? super Character, Character> operation) {
        f0.p(charSequence, "<this>");
        f0.p(operation, "operation");
        int iJ3 = StringsKt__StringsKt.j3(charSequence);
        if (iJ3 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iJ3);
        for (int i10 = iJ3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }
}
