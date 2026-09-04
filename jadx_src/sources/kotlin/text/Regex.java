package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f128524d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Pattern f128525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Set<? extends RegexOption> f128526c;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final a f128527d = new a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final String f128528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f128529c;

        /* JADX INFO: compiled from: Regex.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
                this();
            }
        }

        public Serialized(@dl.d String pattern, int i10) {
            f0.p(pattern, "pattern");
            this.f128528b = pattern;
            this.f128529c = i10;
        }

        private final Object c() {
            Pattern patternCompile = Pattern.compile(this.f128528b, this.f128529c);
            f0.o(patternCompile, "compile(pattern, flags)");
            return new Regex(patternCompile);
        }

        public final int a() {
            return this.f128529c;
        }

        @dl.d
        public final String b() {
            return this.f128528b;
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        @dl.d
        public final String c(@dl.d String literal) {
            f0.p(literal, "literal");
            String strQuote = Pattern.quote(literal);
            f0.o(strQuote, "quote(literal)");
            return strQuote;
        }

        @dl.d
        public final String d(@dl.d String literal) {
            f0.p(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            f0.o(strQuoteReplacement, "quoteReplacement(literal)");
            return strQuoteReplacement;
        }

        @dl.d
        public final Regex e(@dl.d String literal) {
            f0.p(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@dl.d String pattern) {
        f0.p(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        f0.o(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@dl.d String pattern, @dl.d Set<? extends RegexOption> options) {
        f0.p(pattern, "pattern");
        f0.p(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, f128524d.b(RegexKt.k(options)));
        f0.o(patternCompile, "compile(pattern, ensureU…odeCase(options.toInt()))");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@dl.d String pattern, @dl.d RegexOption option) {
        f0.p(pattern, "pattern");
        f0.p(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f128524d.b(option.getValue()));
        f0.o(patternCompile, "compile(pattern, ensureUnicodeCase(option.value))");
        this(patternCompile);
    }

    @r0
    public Regex(@dl.d Pattern nativePattern) {
        f0.p(nativePattern, "nativePattern");
        this.f128525b = nativePattern;
    }

    public static /* synthetic */ k d(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.c(charSequence, i10);
    }

    public static /* synthetic */ kotlin.sequences.m f(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.e(charSequence, i10);
    }

    public static /* synthetic */ List q(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.p(charSequence, i10);
    }

    public static /* synthetic */ kotlin.sequences.m s(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.r(charSequence, i10);
    }

    private final Object u() {
        String strPattern = this.f128525b.pattern();
        f0.o(strPattern, "nativePattern.pattern()");
        return new Serialized(strPattern, this.f128525b.flags());
    }

    public final boolean b(@dl.d CharSequence input) {
        f0.p(input, "input");
        return this.f128525b.matcher(input).find();
    }

    @dl.e
    public final k c(@dl.d CharSequence input, int i10) {
        f0.p(input, "input");
        Matcher matcher = this.f128525b.matcher(input);
        f0.o(matcher, "nativePattern.matcher(input)");
        return RegexKt.f(matcher, i10, input);
    }

    @dl.d
    public final kotlin.sequences.m<k> e(@dl.d final CharSequence input, final int i10) {
        f0.p(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            return SequencesKt__SequencesKt.n(new yh.a<k>() { // from class: kotlin.text.Regex$findAll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k invoke() {
                    return this.f128530b.c(input, i10);
                }
            }, Regex$findAll$2.f128533d);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + input.length());
    }

    @dl.d
    public final Set<RegexOption> g() {
        Set set = this.f128526c;
        if (set != null) {
            return set;
        }
        final int iFlags = this.f128525b.flags();
        EnumSet fromInt$lambda$1 = EnumSet.allOf(RegexOption.class);
        f0.o(fromInt$lambda$1, "fromInt$lambda$1");
        kotlin.collections.x.N0(fromInt$lambda$1, new yh.l<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(RegexOption regexOption) {
                RegexOption regexOption2 = regexOption;
                return Boolean.valueOf((iFlags & regexOption2.getMask()) == regexOption2.getValue());
            }
        });
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        f0.o(setUnmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this.f128526c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @dl.d
    public final String h() {
        String strPattern = this.f128525b.pattern();
        f0.o(strPattern, "nativePattern.pattern()");
        return strPattern;
    }

    @u0(version = s0.f136932w)
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public final k i(@dl.d CharSequence input, int i10) {
        f0.p(input, "input");
        Matcher matcherRegion = this.f128525b.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        f0.o(matcherRegion, "this");
        return new MatcherMatchResult(matcherRegion, input);
    }

    @dl.e
    public final k j(@dl.d CharSequence input) {
        f0.p(input, "input");
        Matcher matcher = this.f128525b.matcher(input);
        f0.o(matcher, "nativePattern.matcher(input)");
        return RegexKt.h(matcher, input);
    }

    public final boolean k(@dl.d CharSequence input) {
        f0.p(input, "input");
        return this.f128525b.matcher(input).matches();
    }

    @u0(version = s0.f136932w)
    @e2(markerClass = {kotlin.q.class})
    public final boolean l(@dl.d CharSequence input, int i10) {
        f0.p(input, "input");
        return this.f128525b.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length()).lookingAt();
    }

    @dl.d
    public final String m(@dl.d CharSequence input, @dl.d String replacement) {
        f0.p(input, "input");
        f0.p(replacement, "replacement");
        String strReplaceAll = this.f128525b.matcher(input).replaceAll(replacement);
        f0.o(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    @dl.d
    public final String n(@dl.d CharSequence input, @dl.d yh.l<? super k, ? extends CharSequence> transform) {
        f0.p(input, "input");
        f0.p(transform, "transform");
        int iIntValue = 0;
        k kVarD = d(this, input, 0, 2, null);
        if (kVarD == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, kVarD.d().D().intValue());
            sb2.append(transform.invoke(kVarD));
            iIntValue = kVarD.d().e().intValue() + 1;
            kVarD = kVarD.next();
            if (iIntValue >= length) {
                break;
            }
        } while (kVarD != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        return string;
    }

    @dl.d
    public final String o(@dl.d CharSequence input, @dl.d String replacement) {
        f0.p(input, "input");
        f0.p(replacement, "replacement");
        String strReplaceFirst = this.f128525b.matcher(input).replaceFirst(replacement);
        f0.o(strReplaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return strReplaceFirst;
    }

    @dl.d
    public final List<String> p(@dl.d CharSequence input, int i10) {
        f0.p(input, "input");
        StringsKt__StringsKt.N4(i10);
        Matcher matcher = this.f128525b.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return kotlin.collections.s.k(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? fi.u.B(i10, 10) : 10);
        int iEnd = 0;
        int i11 = i10 - 1;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @u0(version = s0.f136930u)
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public final kotlin.sequences.m<String> r(@dl.d CharSequence input, int i10) {
        f0.p(input, "input");
        StringsKt__StringsKt.N4(i10);
        return kotlin.sequences.q.b(new Regex$splitToSequence$1(this, input, i10, null));
    }

    @dl.d
    public final Pattern t() {
        return this.f128525b;
    }

    @dl.d
    public String toString() {
        String string = this.f128525b.toString();
        f0.o(string, "nativePattern.toString()");
        return string;
    }
}
