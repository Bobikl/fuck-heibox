package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.k0;
import kotlin.jvm.internal.f0;
import kotlin.l0;
import kotlin.s0;
import kotlin.u0;

/* JADX INFO: compiled from: _StringsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class v extends StringsKt__StringsKt {
    @sh.f
    private static final char X5(CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        return charSequence.charAt(i10);
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @s0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character Y5(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return StringsKt___StringsKt.Q7(charSequence);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @s0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Z5(CharSequence charSequence, yh.l<? super Character, ? extends R> selector) {
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

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @s0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character a6(CharSequence charSequence, Comparator comparator) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        return StringsKt___StringsKt.S7(charSequence, comparator);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @s0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character b6(CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return StringsKt___StringsKt.e8(charSequence);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @s0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character c6(CharSequence charSequence, yh.l<? super Character, ? extends R> selector) {
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

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @s0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, hiddenSince = org.apache.tools.ant.util.s0.f136930u, warningSince = "1.4")
    public static final /* synthetic */ Character d6(CharSequence charSequence, Comparator comparator) {
        f0.p(charSequence, "<this>");
        f0.p(comparator, "comparator");
        return StringsKt___StringsKt.g8(charSequence, comparator);
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfBigDecimal")
    @sh.f
    private static final BigDecimal e6(CharSequence charSequence, yh.l<? super Character, ? extends BigDecimal> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        f0.o(bigDecimalValueOf, "valueOf(this.toLong())");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i10))));
            f0.o(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @u0(version = "1.4")
    @l0
    @xh.h(name = "sumOfBigInteger")
    @sh.f
    private static final BigInteger f6(CharSequence charSequence, yh.l<? super Character, ? extends BigInteger> selector) {
        f0.p(charSequence, "<this>");
        f0.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        f0.o(bigIntegerValueOf, "valueOf(this.toLong())");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i10))));
            f0.o(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @dl.d
    public static final SortedSet<Character> g6(@dl.d CharSequence charSequence) {
        f0.p(charSequence, "<this>");
        return (SortedSet) StringsKt___StringsKt.f9(charSequence, new TreeSet());
    }
}
