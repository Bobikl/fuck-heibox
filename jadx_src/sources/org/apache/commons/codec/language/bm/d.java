package org.apache.commons.codec.language.bm;

import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.apache.tools.ant.taskdefs.condition.z;

/* JADX INFO: compiled from: PhoneticEngine.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<NameType, Set<String>> f132932e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.commons.codec.language.bm.b f132933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NameType f132934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RuleType f132935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f132936d;

    /* JADX INFO: compiled from: PhoneticEngine.java */
    public static final class a implements CharSequence {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f132937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence[][] f132938c;

        a(CharSequence charSequence, CharSequence[][] charSequenceArr) {
            this.f132937b = charSequence;
            this.f132938c = charSequenceArr;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i10) {
            return this.f132937b.charAt(i10);
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f132937b.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i10, int i11) {
            if (i10 == i11) {
                return "";
            }
            int i12 = i11 - 1;
            CharSequence charSequence = this.f132938c[i10][i12];
            if (charSequence != null) {
                return charSequence;
            }
            CharSequence charSequenceSubSequence = this.f132937b.subSequence(i10, i11);
            this.f132938c[i10][i12] = charSequenceSubSequence;
            return charSequenceSubSequence;
        }
    }

    /* JADX INFO: compiled from: PhoneticEngine.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f132939a;

        static {
            int[] iArr = new int[NameType.values().length];
            f132939a = iArr;
            try {
                iArr[NameType.SEPHARDIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f132939a[NameType.ASHKENAZI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f132939a[NameType.GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: PhoneticEngine.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<f.k> f132940a;

        private c(Set<f.k> set) {
            this.f132940a = set;
        }

        /* synthetic */ c(Set set, a aVar) {
            this(set);
        }

        public static c c(org.apache.commons.codec.language.bm.c.AbstractC1224c abstractC1224c) {
            return new c(Collections.singleton(new f.k("", abstractC1224c)));
        }

        public c a(CharSequence charSequence) {
            HashSet hashSet = new HashSet();
            Iterator<f.k> it = this.f132940a.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().c(charSequence));
            }
            return new c(hashSet);
        }

        public c b(f.l lVar) {
            HashSet hashSet = new HashSet();
            for (f.k kVar : this.f132940a) {
                Iterator<f.k> it = lVar.a().iterator();
                while (it.hasNext()) {
                    f.k kVarF = kVar.f(it.next());
                    if (!kVarF.d().d()) {
                        hashSet.add(kVarF);
                    }
                }
            }
            return new c(hashSet);
        }

        public Set<f.k> d() {
            return this.f132940a;
        }

        public String e() {
            StringBuilder sb2 = new StringBuilder();
            for (f.k kVar : this.f132940a) {
                if (sb2.length() > 0) {
                    sb2.append("|");
                }
                sb2.append(kVar.e());
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PhoneticEngine.java */
    public static final class C1225d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<f> f132941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f132942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f132943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f132944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f132945e;

        public C1225d(List<f> list, CharSequence charSequence, c cVar, int i10) {
            if (list == null) {
                throw new NullPointerException("The finalRules argument must not be null");
            }
            this.f132941a = list;
            this.f132943c = cVar;
            this.f132942b = charSequence;
            this.f132944d = i10;
        }

        public int a() {
            return this.f132944d;
        }

        public c b() {
            return this.f132943c;
        }

        public C1225d c() {
            int i10 = 0;
            this.f132945e = false;
            Iterator<f> it = this.f132941a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f next = it.next();
                int length = next.l().length();
                if (next.s(this.f132942b, this.f132944d)) {
                    this.f132943c = this.f132943c.b(next.m());
                    this.f132945e = true;
                    i10 = length;
                    break;
                }
                i10 = length;
            }
            this.f132944d += this.f132945e ? i10 : 1;
            return this;
        }

        public boolean d() {
            return this.f132945e;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(NameType.class);
        f132932e = enumMap;
        enumMap.put(NameType.ASHKENAZI, Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", SocializeProtocolConstants.PROTOCOL_KEY_DE, "van", "von"))));
        enumMap.put(NameType.SEPHARDIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", SocializeProtocolConstants.PROTOCOL_KEY_DE, "del", "dela", "de la", "della", "des", "di", "do", z.f133973o, com.umeng.analytics.pro.d.W, "van", "von"))));
        enumMap.put(NameType.GENERIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", SocializeProtocolConstants.PROTOCOL_KEY_DE, "del", "dela", "de la", "della", "des", "di", "do", z.f133973o, com.umeng.analytics.pro.d.W, "van", "von"))));
    }

    public d(NameType nameType, RuleType ruleType, boolean z10) {
        RuleType ruleType2 = RuleType.RULES;
        if (ruleType == ruleType2) {
            throw new IllegalArgumentException("ruleType must not be " + ruleType2);
        }
        this.f132934b = nameType;
        this.f132935c = ruleType;
        this.f132936d = z10;
        this.f132933a = org.apache.commons.codec.language.bm.b.c(nameType);
    }

    private c a(c cVar, List<f> list) {
        if (list == null) {
            throw new NullPointerException("finalRules can not be null");
        }
        if (list.isEmpty()) {
            return cVar;
        }
        TreeSet treeSet = new TreeSet(f.k.f132974c);
        for (f.k kVar : cVar.d()) {
            c cVarC = c.c(kVar.d());
            CharSequence charSequenceB = b(kVar.e());
            int iA = 0;
            while (iA < charSequenceB.length()) {
                C1225d c1225dC = new C1225d(list, charSequenceB, cVarC, iA).c();
                boolean zD = c1225dC.d();
                c cVarB = c1225dC.b();
                c cVarA = !zD ? cVarB.a(charSequenceB.subSequence(iA, iA + 1)) : cVarB;
                iA = c1225dC.a();
                cVarC = cVarA;
            }
            treeSet.addAll(cVarC.d());
        }
        return new c(treeSet, null);
    }

    private static CharSequence b(CharSequence charSequence) {
        return new a(charSequence, (CharSequence[][]) Array.newInstance((Class<?>) CharSequence.class, charSequence.length(), charSequence.length()));
    }

    private static String i(Iterable<String> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
        }
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public String c(String str) {
        return d(str, this.f132933a.b(str));
    }

    public String d(String str, org.apache.commons.codec.language.bm.c.AbstractC1224c abstractC1224c) {
        String strI;
        List<f> listJ = f.j(this.f132934b, RuleType.RULES, abstractC1224c);
        List<f> listI = f.i(this.f132934b, this.f132935c, "common");
        List<f> listJ2 = f.j(this.f132934b, this.f132935c, abstractC1224c);
        String strTrim = str.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
        int iA = 0;
        if (this.f132934b == NameType.GENERIC) {
            if (strTrim.length() >= 2 && strTrim.substring(0, 2).equals("d'")) {
                String strSubstring = strTrim.substring(2);
                return "(" + c(strSubstring) + ")-(" + c("d" + strSubstring) + ")";
            }
            for (String str2 : f132932e.get(this.f132934b)) {
                if (strTrim.startsWith(str2 + " ")) {
                    String strSubstring2 = strTrim.substring(str2.length() + 1);
                    return "(" + c(strSubstring2) + ")-(" + c(str2 + strSubstring2) + ")";
                }
            }
        }
        List listAsList = Arrays.asList(strTrim.split("\\s+"));
        ArrayList<String> arrayList = new ArrayList();
        int i10 = b.f132939a[this.f132934b.ordinal()];
        if (i10 == 1) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = ((String) it.next()).split("'");
                arrayList.add(strArrSplit[strArrSplit.length - 1]);
            }
            arrayList.removeAll(f132932e.get(this.f132934b));
        } else if (i10 == 2) {
            arrayList.addAll(listAsList);
            arrayList.removeAll(f132932e.get(this.f132934b));
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unreachable case: " + this.f132934b);
            }
            arrayList.addAll(listAsList);
        }
        if (this.f132936d) {
            strI = i(arrayList, " ");
        } else {
            if (arrayList.size() != 1) {
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : arrayList) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    sb2.append(c(str3));
                }
                return sb2.substring(1);
            }
            strI = (String) listAsList.iterator().next();
        }
        c cVarC = c.c(abstractC1224c);
        CharSequence charSequenceB = b(strI);
        while (iA < charSequenceB.length()) {
            C1225d c1225dC = new C1225d(listJ, charSequenceB, cVarC, iA).c();
            iA = c1225dC.a();
            cVarC = c1225dC.b();
        }
        return a(a(cVarC, listI), listJ2).e();
    }

    public org.apache.commons.codec.language.bm.b e() {
        return this.f132933a;
    }

    public NameType f() {
        return this.f132934b;
    }

    public RuleType g() {
        return this.f132935c;
    }

    public boolean h() {
        return this.f132936d;
    }
}
