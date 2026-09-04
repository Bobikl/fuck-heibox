package org.apache.commons.codec.language.bm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Lang.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<NameType, b> f132919c = new EnumMap(NameType.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f132920d = "org/apache/commons/codec/language/bm/lang.txt";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f132921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C1223b> f132922b;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Lang.java */
    public static final class C1223b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f132923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<String> f132924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Pattern f132925c;

        private C1223b(Pattern pattern, Set<String> set, boolean z10) {
            this.f132925c = pattern;
            this.f132924b = set;
            this.f132923a = z10;
        }

        public boolean c(String str) {
            return this.f132925c.matcher(str).find();
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            f132919c.put(nameType, d(f132920d, c.b(nameType)));
        }
    }

    private b(List<C1223b> list, c cVar) {
        this.f132922b = Collections.unmodifiableList(list);
        this.f132921a = cVar;
    }

    public static b c(NameType nameType) {
        return f132919c.get(nameType);
    }

    public static b d(String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        InputStream resourceAsStream = b.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt");
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z10 = false;
            while (scanner.hasNextLine()) {
                String strNextLine = scanner.nextLine();
                if (z10) {
                    if (strNextLine.endsWith("*/")) {
                    }
                } else if (strNextLine.startsWith("/*")) {
                    z10 = true;
                } else {
                    int iIndexOf = strNextLine.indexOf("//");
                    String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                    if (strTrim.length() != 0) {
                        String[] strArrSplit = strTrim.split("\\s+");
                        if (strArrSplit.length != 3) {
                            System.err.println("Warning: malformed line '" + strNextLine + "'");
                        } else {
                            arrayList.add(new C1223b(Pattern.compile(strArrSplit[0]), new HashSet(Arrays.asList(strArrSplit[1].split("\\+"))), strArrSplit[2].equals("true")));
                        }
                    }
                }
            }
            return new b(arrayList, cVar);
        }
    }

    public String a(String str) {
        c.AbstractC1224c abstractC1224cB = b(str);
        return abstractC1224cB.e() ? abstractC1224cB.c() : c.f132926b;
    }

    public c.AbstractC1224c b(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.f132921a.c());
        for (C1223b c1223b : this.f132922b) {
            if (c1223b.c(lowerCase)) {
                if (c1223b.f132923a) {
                    hashSet.retainAll(c1223b.f132924b);
                } else {
                    hashSet.removeAll(c1223b.f132924b);
                }
            }
        }
        c.AbstractC1224c abstractC1224cB = c.AbstractC1224c.b(hashSet);
        return abstractC1224cB.equals(c.f132928d) ? c.f132929e : abstractC1224cB;
    }
}
