package com.google.common.base;

import com.tencent.qcloud.core.util.IOUtils;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@com.google.common.base.g
public abstract class b implements com.google.common.base.x<Character> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f56679b = 65536;

    /* JADX INFO: compiled from: CharMatcher.java */
    public class a extends x {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f56680d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b bVar, b bVar2, String str) {
            super(bVar2);
            this.f56680d = str;
        }

        @Override // com.google.common.base.b.w, com.google.common.base.b
        public String toString() {
            return this.f56680d;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static class a0 extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f56681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f56682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final char[] f56683e;

        a0(String str, char[] cArr, char[] cArr2) {
            this.f56681c = str;
            this.f56682d = cArr;
            this.f56683e = cArr2;
            com.google.common.base.w.d(cArr.length == cArr2.length);
            int i10 = 0;
            while (i10 < cArr.length) {
                com.google.common.base.w.d(cArr[i10] <= cArr2[i10]);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    com.google.common.base.w.d(cArr2[i10] < cArr[i11]);
                }
                i10 = i11;
            }
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            int iBinarySearch = Arrays.binarySearch(this.f56682d, c10);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i10 = (~iBinarySearch) - 1;
            return i10 >= 0 && c10 <= this.f56683e[i10];
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return this.f56681c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class C0441b extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b f56684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final b f56685d;

        C0441b(b bVar, b bVar2) {
            this.f56684c = (b) com.google.common.base.w.E(bVar);
            this.f56685d = (b) com.google.common.base.w.E(bVar2);
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return this.f56684c.B(c10) && this.f56685d.B(c10);
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f56684c.Q(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f56685d.Q(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strValueOf = String.valueOf(this.f56684c);
            String strValueOf2 = String.valueOf(this.f56685d);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19 + strValueOf2.length());
            sb2.append("CharMatcher.and(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class b0 extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final b0 f56686f = new b0();

        private b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺\ufdff\ufeffￜ".toCharArray());
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class c extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f56687d = new c();

        private c() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.b
        public int A(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return true;
        }

        @Override // com.google.common.base.b
        public boolean C(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            return true;
        }

        @Override // com.google.common.base.b
        public boolean E(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b F() {
            return b.G();
        }

        @Override // com.google.common.base.b
        public b I(b bVar) {
            com.google.common.base.w.E(bVar);
            return this;
        }

        @Override // com.google.common.base.b
        public String M(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            return "";
        }

        @Override // com.google.common.base.b
        public String N(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        @Override // com.google.common.base.b
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }

        @Override // com.google.common.base.b
        public String U(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            return "";
        }

        @Override // com.google.common.base.b
        public b b(b bVar) {
            return (b) com.google.common.base.w.E(bVar);
        }

        @Override // com.google.common.base.b
        public String h(CharSequence charSequence, char c10) {
            return charSequence.length() == 0 ? "" : String.valueOf(c10);
        }

        @Override // com.google.common.base.b
        public int i(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.b
        public int n(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.b
        public int o(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            com.google.common.base.w.d0(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    @o9.d
    public static final class c0 extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f56688d = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f56689e = 1682554634;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f56690f = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final c0 f56691g = new c0();

        c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return f56688d.charAt((f56689e * c10) >>> f56690f) == c10;
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set(f56688d.charAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class d extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char[] f56692c;

        public d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f56692c = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return Arrays.binarySearch(this.f56692c, c10) >= 0;
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            for (char c10 : this.f56692c) {
                bitSet.set(c10);
            }
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f56692c) {
                sb2.append(b.R(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class e extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f56693d = new e();

        e() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return c10 <= 127;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    @o9.c
    public static final class f extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final BitSet f56694d;

        private f(BitSet bitSet, String str) {
            super(str);
            this.f56694d = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }

        /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return this.f56694d.get(c10);
        }

        @Override // com.google.common.base.b
        void Q(BitSet bitSet) {
            bitSet.or(this.f56694d);
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class g extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f56695c = new g();

        private g() {
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 == 8199) {
                    return false;
                }
                if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                    switch (c10) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c10 >= 8192 && c10 <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class h extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f56696f = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final h f56697g = new h();

        private h() {
            super("CharMatcher.digit()", Z(), Y());
        }

        private static char[] Y() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) (f56696f.charAt(i10) + '\t');
            }
            return cArr;
        }

        private static char[] Z() {
            return f56696f.toCharArray();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class i extends b {
        i() {
        }

        @Override // com.google.common.base.b
        public b F() {
            return new x(this);
        }

        @Override // com.google.common.base.b
        public final b J() {
            return this;
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class j extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.common.base.x<? super Character> f56698c;

        j(com.google.common.base.x<? super Character> xVar) {
            this.f56698c = (com.google.common.base.x) com.google.common.base.w.E(xVar);
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return this.f56698c.apply(Character.valueOf(c10));
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean apply(Character ch2) {
            return this.f56698c.apply(com.google.common.base.w.E(ch2));
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strValueOf = String.valueOf(this.f56698c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 26);
            sb2.append("CharMatcher.forPredicate(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class k extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f56699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char f56700d;

        k(char c10, char c11) {
            com.google.common.base.w.d(c11 >= c10);
            this.f56699c = c10;
            this.f56700d = c11;
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return this.f56699c <= c10 && c10 <= this.f56700d;
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f56699c, this.f56700d + 1);
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strR = b.R(this.f56699c);
            String strR2 = b.R(this.f56700d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strR).length() + 27 + String.valueOf(strR2).length());
            sb2.append("CharMatcher.inRange('");
            sb2.append(strR);
            sb2.append("', '");
            sb2.append(strR2);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class l extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f56701f = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f56702g = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final l f56703h = new l();

        private l() {
            super("CharMatcher.invisible()", f56701f.toCharArray(), f56702g.toCharArray());
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class m extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f56704c;

        m(char c10) {
            this.f56704c = c10;
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return c10 == this.f56704c;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b F() {
            return b.s(this.f56704c);
        }

        @Override // com.google.common.base.b
        public b I(b bVar) {
            return bVar.B(this.f56704c) ? bVar : super.I(bVar);
        }

        @Override // com.google.common.base.b
        public String N(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.f56704c, c10);
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f56704c);
        }

        @Override // com.google.common.base.b
        public b b(b bVar) {
            return bVar.B(this.f56704c) ? this : b.G();
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strR = b.R(this.f56704c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strR).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(strR);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class n extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f56705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char f56706d;

        n(char c10, char c11) {
            this.f56705c = c10;
            this.f56706d = c11;
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return c10 == this.f56705c || c10 == this.f56706d;
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            bitSet.set(this.f56705c);
            bitSet.set(this.f56706d);
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strR = b.R(this.f56705c);
            String strR2 = b.R(this.f56706d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strR).length() + 21 + String.valueOf(strR2).length());
            sb2.append("CharMatcher.anyOf(\"");
            sb2.append(strR);
            sb2.append(strR2);
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class o extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f56707c;

        o(char c10) {
            this.f56707c = c10;
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return c10 != this.f56707c;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b F() {
            return b.q(this.f56707c);
        }

        @Override // com.google.common.base.b
        public b I(b bVar) {
            return bVar.B(this.f56707c) ? b.c() : this;
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            bitSet.set(0, this.f56707c);
            bitSet.set(this.f56707c + 1, 65536);
        }

        @Override // com.google.common.base.b
        public b b(b bVar) {
            return bVar.B(this.f56707c) ? super.b(bVar) : bVar;
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strR = b.R(this.f56707c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strR).length() + 21);
            sb2.append("CharMatcher.isNot('");
            sb2.append(strR);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class p extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final p f56708c = new p();

        private p() {
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return Character.isDigit(c10);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class q extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final q f56709d = new q();

        private q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return c10 <= 31 || (c10 >= 127 && c10 <= 159);
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class r extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final r f56710c = new r();

        private r() {
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return Character.isLetter(c10);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class s extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final s f56711c = new s();

        private s() {
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class t extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final t f56712c = new t();

        private t() {
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class u extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final u f56713c = new u();

        private u() {
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class v extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f56714c;

        v(String str) {
            this.f56714c = (String) com.google.common.base.w.E(str);
        }

        @Override // com.google.common.base.b
        public final String toString() {
            return this.f56714c;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static class w extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b f56715c;

        w(b bVar) {
            this.f56715c = (b) com.google.common.base.w.E(bVar);
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return !this.f56715c.B(c10);
        }

        @Override // com.google.common.base.b
        public boolean C(CharSequence charSequence) {
            return this.f56715c.E(charSequence);
        }

        @Override // com.google.common.base.b
        public boolean E(CharSequence charSequence) {
            return this.f56715c.C(charSequence);
        }

        @Override // com.google.common.base.b
        public b F() {
            return this.f56715c;
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f56715c.Q(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public int i(CharSequence charSequence) {
            return charSequence.length() - this.f56715c.i(charSequence);
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strValueOf = String.valueOf(this.f56715c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 9);
            sb2.append(strValueOf);
            sb2.append(".negate()");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static class x extends w {
        x(b bVar) {
            super(bVar);
        }

        @Override // com.google.common.base.b
        public final b J() {
            return this;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class y extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final y f56716d = new y();

        private y() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.b
        public int A(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            return -1;
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return false;
        }

        @Override // com.google.common.base.b
        public boolean C(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.b
        public boolean E(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            return true;
        }

        @Override // com.google.common.base.b.i, com.google.common.base.b
        public b F() {
            return b.c();
        }

        @Override // com.google.common.base.b
        public b I(b bVar) {
            return (b) com.google.common.base.w.E(bVar);
        }

        @Override // com.google.common.base.b
        public String M(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String N(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String O(CharSequence charSequence, CharSequence charSequence2) {
            com.google.common.base.w.E(charSequence2);
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String U(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String V(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public String W(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public b b(b bVar) {
            com.google.common.base.w.E(bVar);
            return this;
        }

        @Override // com.google.common.base.b
        public String h(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.b
        public int i(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            return 0;
        }

        @Override // com.google.common.base.b
        public int n(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            return -1;
        }

        @Override // com.google.common.base.b
        public int o(CharSequence charSequence, int i10) {
            com.google.common.base.w.d0(i10, charSequence.length());
            return -1;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class z extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b f56717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final b f56718d;

        z(b bVar, b bVar2) {
            this.f56717c = (b) com.google.common.base.w.E(bVar);
            this.f56718d = (b) com.google.common.base.w.E(bVar2);
        }

        @Override // com.google.common.base.b
        public boolean B(char c10) {
            return this.f56717c.B(c10) || this.f56718d.B(c10);
        }

        @Override // com.google.common.base.b
        @o9.c
        void Q(BitSet bitSet) {
            this.f56717c.Q(bitSet);
            this.f56718d.Q(bitSet);
        }

        @Override // com.google.common.base.b, com.google.common.base.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.b
        public String toString() {
            String strValueOf = String.valueOf(this.f56717c);
            String strValueOf2 = String.valueOf(this.f56718d);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18 + strValueOf2.length());
            sb2.append("CharMatcher.or(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    protected b() {
    }

    public static b G() {
        return y.f56716d;
    }

    public static b H(CharSequence charSequence) {
        return d(charSequence).F();
    }

    @o9.c
    private static b L(int i10, BitSet bitSet, String str) {
        if (i10 == 0) {
            return G();
        }
        if (i10 == 1) {
            return q((char) bitSet.nextSetBit(0));
        }
        if (i10 != 2) {
            return t(i10, bitSet.length()) ? com.google.common.base.y.a0(bitSet, str) : new f(bitSet, str, null);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return r(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String R(char c10) {
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static b S() {
        return b0.f56686f;
    }

    public static b X() {
        return c0.f56691g;
    }

    public static b c() {
        return c.f56687d;
    }

    public static b d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return G();
        }
        if (length != 1) {
            return length != 2 ? new d(charSequence) : r(charSequence.charAt(0), charSequence.charAt(1));
        }
        return q(charSequence.charAt(0));
    }

    public static b f() {
        return e.f56693d;
    }

    public static b g() {
        return g.f56695c;
    }

    @Deprecated
    public static b j() {
        return h.f56697g;
    }

    private String k(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (!B(cCharAt)) {
                sb2.append(cCharAt);
                z10 = false;
            } else if (!z10) {
                sb2.append(c10);
                z10 = true;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static b l(com.google.common.base.x<? super Character> xVar) {
        return xVar instanceof b ? (b) xVar : new j(xVar);
    }

    public static b m(char c10, char c11) {
        return new k(c10, c11);
    }

    @Deprecated
    public static b p() {
        return l.f56703h;
    }

    public static b q(char c10) {
        return new m(c10);
    }

    private static n r(char c10, char c11) {
        return new n(c10, c11);
    }

    public static b s(char c10) {
        return new o(c10);
    }

    @o9.c
    private static boolean t(int i10, int i11) {
        return i10 <= 1023 && i11 > (i10 * 4) * 16;
    }

    @Deprecated
    public static b u() {
        return p.f56708c;
    }

    public static b v() {
        return q.f56709d;
    }

    @Deprecated
    public static b w() {
        return r.f56710c;
    }

    @Deprecated
    public static b x() {
        return s.f56711c;
    }

    @Deprecated
    public static b y() {
        return t.f56712c;
    }

    @Deprecated
    public static b z() {
        return u.f56713c;
    }

    public int A(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (B(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean B(char c10);

    public boolean C(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence charSequence) {
        return !E(charSequence);
    }

    public boolean E(CharSequence charSequence) {
        return n(charSequence) == -1;
    }

    public b F() {
        return new w(this);
    }

    public b I(b bVar) {
        return new z(this, bVar);
    }

    public b J() {
        return com.google.common.base.v.j(this);
    }

    @o9.c
    b K() {
        String strConcat;
        BitSet bitSet = new BitSet();
        Q(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return L(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i10 = 65536 - iCardinality;
        String string = toString();
        if (string.endsWith(".negate()")) {
            strConcat = string.substring(0, string.length() - 9);
        } else {
            strConcat = ".negate()".length() != 0 ? string.concat(".negate()") : new String(string);
        }
        return new a(this, L(i10, bitSet, strConcat), string);
    }

    public String M(CharSequence charSequence) {
        String string = charSequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i10 = 1;
        while (true) {
            iN++;
            while (iN != charArray.length) {
                if (B(charArray[iN])) {
                    i10++;
                } else {
                    charArray[iN - i10] = charArray[iN];
                    iN++;
                }
            }
            return new String(charArray, 0, iN - i10);
        }
    }

    public String N(CharSequence charSequence, char c10) {
        String string = charSequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iN] = c10;
        while (true) {
            iN++;
            if (iN >= charArray.length) {
                return new String(charArray);
            }
            if (B(charArray[iN])) {
                charArray[iN] = c10;
            }
        }
    }

    public String O(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return M(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return N(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) string, i10, iN);
            sb2.append(charSequence2);
            i10 = iN + 1;
            iN = o(string, i10);
        } while (iN != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }

    public String P(CharSequence charSequence) {
        return F().M(charSequence);
    }

    @o9.c
    void Q(BitSet bitSet) {
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (B((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public String T(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && B(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && B(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return h(charSequence, c10);
        }
        int i13 = i12 + 1;
        return k(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String U(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && B(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && B(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String V(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!B(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String W(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!B(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public b b(b bVar) {
        return new C0441b(this, bVar);
    }

    @Override // com.google.common.base.x
    @Deprecated
    /* JADX INFO: renamed from: e */
    public boolean apply(Character ch2) {
        return B(ch2.charValue());
    }

    public String h(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (B(cCharAt)) {
                if (cCharAt != c10 || (i10 != length - 1 && B(charSequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return k(charSequence, i10 + 1, length, c10, sb2, true);
                }
                i10++;
            }
            i10++;
        }
        return charSequence.toString();
    }

    public int i(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (B(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public int n(CharSequence charSequence) {
        return o(charSequence, 0);
    }

    public int o(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        com.google.common.base.w.d0(i10, length);
        while (i10 < length) {
            if (B(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String toString() {
        return super.toString();
    }
}
