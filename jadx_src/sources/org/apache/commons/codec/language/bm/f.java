package org.apache.commons.codec.language.bm;

import com.meituan.robust.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Rule.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f132951f = "ALL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f132952g = "\"";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f132953h = "#include";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f132955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f132956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f132957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f132958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f132950e = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<NameType, Map<RuleType, Map<String, List<f>>>> f132954i = new EnumMap(NameType.class);

    /* JADX INFO: compiled from: Rule.java */
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Pattern f132959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f132960b;

        a(String str) {
            this.f132960b = str;
            this.f132959a = Pattern.compile(str);
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return this.f132959a.matcher(charSequence).find();
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class b implements n {
        b() {
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return true;
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class c extends f {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f132961j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f132962k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f132963l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f132964m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, String str3, l lVar, int i10, String str4) {
            super(str, str2, str3, lVar);
            this.f132963l = i10;
            this.f132964m = str4;
            this.f132961j = i10;
            this.f132962k = str4;
        }

        public String toString() {
            return "Rule{line=" + this.f132961j + ", loc='" + this.f132962k + "'}";
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class d implements n {
        d() {
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class e implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f132965a;

        e(String str) {
            this.f132965a = str;
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.equals(this.f132965a);
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Rule.java */
    public static final class C1226f implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f132966a;

        C1226f(String str) {
            this.f132966a = str;
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return f.t(charSequence, this.f132966a);
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class g implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f132967a;

        g(String str) {
            this.f132967a = str;
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return f.h(charSequence, this.f132967a);
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class h implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f132968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f132969b;

        h(String str, boolean z10) {
            this.f132968a = str;
            this.f132969b = z10;
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() == 1 && f.d(this.f132968a, charSequence.charAt(0)) == this.f132969b;
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class i implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f132970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f132971b;

        i(String str, boolean z10) {
            this.f132970a = str;
            this.f132971b = z10;
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() > 0 && f.d(this.f132970a, charSequence.charAt(0)) == this.f132971b;
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class j implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f132972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f132973b;

        j(String str, boolean z10) {
            this.f132972a = str;
            this.f132973b = z10;
        }

        @Override // org.apache.commons.codec.language.bm.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() > 0 && f.d(this.f132972a, charSequence.charAt(charSequence.length() - 1)) == this.f132973b;
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class k implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Comparator<k> f132974c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f132975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.apache.commons.codec.language.bm.c.AbstractC1224c f132976b;

        /* JADX INFO: compiled from: Rule.java */
        public static final class a implements Comparator<k> {
            a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(k kVar, k kVar2) {
                for (int i10 = 0; i10 < kVar.f132975a.length(); i10++) {
                    if (i10 >= kVar2.f132975a.length()) {
                        return 1;
                    }
                    int iCharAt = kVar.f132975a.charAt(i10) - kVar2.f132975a.charAt(i10);
                    if (iCharAt != 0) {
                        return iCharAt;
                    }
                }
                return kVar.f132975a.length() < kVar2.f132975a.length() ? -1 : 0;
            }
        }

        public k(CharSequence charSequence, org.apache.commons.codec.language.bm.c.AbstractC1224c abstractC1224c) {
            this.f132975a = charSequence;
            this.f132976b = abstractC1224c;
        }

        @Override // org.apache.commons.codec.language.bm.f.l
        public Iterable<k> a() {
            return Collections.singleton(this);
        }

        public k c(CharSequence charSequence) {
            return new k(this.f132975a.toString() + charSequence.toString(), this.f132976b);
        }

        public org.apache.commons.codec.language.bm.c.AbstractC1224c d() {
            return this.f132976b;
        }

        public CharSequence e() {
            return this.f132975a;
        }

        public k f(k kVar) {
            return new k(this.f132975a.toString() + kVar.f132975a.toString(), this.f132976b.f(kVar.f132976b));
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public interface l {
        Iterable<k> a();
    }

    /* JADX INFO: compiled from: Rule.java */
    public static final class m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<k> f132977a;

        public m(List<k> list) {
            this.f132977a = list;
        }

        @Override // org.apache.commons.codec.language.bm.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<k> a() {
            return this.f132977a;
        }
    }

    /* JADX INFO: compiled from: Rule.java */
    public interface n {
        boolean a(CharSequence charSequence);
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (RuleType ruleType : RuleType.values()) {
                HashMap map = new HashMap();
                for (String str : org.apache.commons.codec.language.bm.c.b(nameType).c()) {
                    try {
                        map.put(str, q(g(nameType, ruleType, str), e(nameType, ruleType, str)));
                    } catch (IllegalStateException e10) {
                        throw new IllegalStateException("Problem processing " + e(nameType, ruleType, str), e10);
                    }
                }
                if (!ruleType.equals(RuleType.RULES)) {
                    map.put("common", q(g(nameType, ruleType, "common"), e(nameType, ruleType, "common")));
                }
                enumMap.put(ruleType, Collections.unmodifiableMap(map));
            }
            f132954i.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public f(String str, String str2, String str3, l lVar) {
        this.f132956b = str;
        this.f132955a = r(str2 + "$");
        this.f132958d = r("^" + str3);
        this.f132957c = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(CharSequence charSequence, char c10) {
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (charSequence.charAt(i10) == c10) {
                return true;
            }
        }
        return false;
    }

    private static String e(NameType nameType, RuleType ruleType, String str) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", nameType.getName(), ruleType.getName(), str);
    }

    private static Scanner f(String str) {
        String str2 = String.format("org/apache/commons/codec/language/bm/%s.txt", str);
        InputStream resourceAsStream = org.apache.commons.codec.language.bm.c.class.getClassLoader().getResourceAsStream(str2);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + str2);
    }

    private static Scanner g(NameType nameType, RuleType ruleType, String str) {
        String strE = e(nameType, ruleType, str);
        InputStream resourceAsStream = org.apache.commons.codec.language.bm.c.class.getClassLoader().getResourceAsStream(strE);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int length = charSequence.length() - 1;
        for (int length2 = charSequence2.length() - 1; length2 >= 0; length2--) {
            if (charSequence.charAt(length) != charSequence2.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static List<f> i(NameType nameType, RuleType ruleType, String str) {
        List<f> list = f132954i.get(nameType).get(ruleType).get(str);
        if (list != null) {
            return list;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", nameType.getName(), ruleType.getName(), str));
    }

    public static List<f> j(NameType nameType, RuleType ruleType, org.apache.commons.codec.language.bm.c.AbstractC1224c abstractC1224c) {
        return i(nameType, ruleType, abstractC1224c.e() ? abstractC1224c.c() : org.apache.commons.codec.language.bm.c.f132926b);
    }

    private static k o(String str) {
        int iIndexOf = str.indexOf(Constants.ARRAY_TYPE);
        if (iIndexOf < 0) {
            return new k(str, org.apache.commons.codec.language.bm.c.f132929e);
        }
        if (str.endsWith("]")) {
            return new k(str.substring(0, iIndexOf), org.apache.commons.codec.language.bm.c.AbstractC1224c.b(new HashSet(Arrays.asList(str.substring(iIndexOf + 1, str.length() - 1).split("[+]")))));
        }
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
    }

    private static l p(String str) {
        if (!str.startsWith("(")) {
            return o(str);
        }
        if (!str.endsWith(")")) {
            throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        ArrayList arrayList = new ArrayList();
        String strSubstring = str.substring(1, str.length() - 1);
        for (String str2 : strSubstring.split("[|]")) {
            arrayList.add(o(str2));
        }
        if (strSubstring.startsWith("|") || strSubstring.endsWith("|")) {
            arrayList.add(new k("", org.apache.commons.codec.language.bm.c.f132929e));
        }
        return new m(arrayList);
    }

    private static List<f> q(Scanner scanner, String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        while (scanner.hasNextLine()) {
            i10++;
            String strNextLine = scanner.nextLine();
            if (z10) {
                if (strNextLine.endsWith("*/")) {
                    z10 = false;
                }
            } else if (strNextLine.startsWith("/*")) {
                z10 = true;
            } else {
                int iIndexOf = strNextLine.indexOf("//");
                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                if (strTrim.length() == 0) {
                    continue;
                } else if (strTrim.startsWith(f132953h)) {
                    String strTrim2 = strTrim.substring(8).trim();
                    if (strTrim2.contains(" ")) {
                        System.err.println("Warining: malformed import statement: " + strNextLine);
                    } else {
                        arrayList.addAll(q(f(strTrim2), str + "->" + strTrim2));
                    }
                } else {
                    String[] strArrSplit = strTrim.split("\\s+");
                    if (strArrSplit.length != 4) {
                        System.err.println("Warning: malformed rule statement split into " + strArrSplit.length + " parts: " + strNextLine);
                    } else {
                        try {
                            arrayList.add(new c(u(strArrSplit[0]), u(strArrSplit[1]), u(strArrSplit[2]), p(u(strArrSplit[3])), i10, str));
                        } catch (IllegalArgumentException e10) {
                            throw new IllegalStateException("Problem parsing line " + i10, e10);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static n r(String str) {
        boolean zStartsWith = str.startsWith("^");
        boolean zEndsWith = str.endsWith("$");
        int length = str.length();
        if (zEndsWith) {
            length--;
        }
        String strSubstring = str.substring(zStartsWith ? 1 : 0, length);
        if (strSubstring.contains(Constants.ARRAY_TYPE)) {
            boolean zStartsWith2 = strSubstring.startsWith(Constants.ARRAY_TYPE);
            boolean zEndsWith2 = strSubstring.endsWith("]");
            if (zStartsWith2 && zEndsWith2) {
                String strSubstring2 = strSubstring.substring(1, strSubstring.length() - 1);
                if (!strSubstring2.contains(Constants.ARRAY_TYPE)) {
                    boolean zStartsWith3 = strSubstring2.startsWith("^");
                    if (zStartsWith3) {
                        strSubstring2 = strSubstring2.substring(1);
                    }
                    boolean z10 = !zStartsWith3;
                    if (zStartsWith && zEndsWith) {
                        return new h(strSubstring2, z10);
                    }
                    if (zStartsWith) {
                        return new i(strSubstring2, z10);
                    }
                    if (zEndsWith) {
                        return new j(strSubstring2, z10);
                    }
                }
            }
        } else {
            if (zStartsWith && zEndsWith) {
                return strSubstring.length() == 0 ? new d() : new e(strSubstring);
            }
            if ((zStartsWith || zEndsWith) && strSubstring.length() == 0) {
                return f132950e;
            }
            if (zStartsWith) {
                return new C1226f(strSubstring);
            }
            if (zEndsWith) {
                return new g(strSubstring);
            }
        }
        return new a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i10 = 0; i10 < charSequence2.length(); i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    private static String u(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public n k() {
        return this.f132955a;
    }

    public String l() {
        return this.f132956b;
    }

    public l m() {
        return this.f132957c;
    }

    public n n() {
        return this.f132958d;
    }

    public boolean s(CharSequence charSequence, int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int length = this.f132956b.length() + i10;
        if (length > charSequence.length()) {
            return false;
        }
        return charSequence.subSequence(i10, length).equals(this.f132956b) && this.f132958d.a(charSequence.subSequence(length, charSequence.length())) && this.f132955a.a(charSequence.subSequence(0, i10));
    }
}
