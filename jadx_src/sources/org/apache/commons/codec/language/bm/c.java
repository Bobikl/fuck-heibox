package org.apache.commons.codec.language.bm;

import java.io.InputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

/* JADX INFO: compiled from: Languages.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f132926b = "any";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<NameType, c> f132927c = new EnumMap(NameType.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1224c f132928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1224c f132929e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f132930a;

    /* JADX INFO: compiled from: Languages.java */
    public static final class a extends AbstractC1224c {
        a() {
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean a(String str) {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public String c() {
            throw new NoSuchElementException("Can't fetch any language from the empty language set.");
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean d() {
            return true;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean e() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public AbstractC1224c f(AbstractC1224c abstractC1224c) {
            return this;
        }

        public String toString() {
            return "NO_LANGUAGES";
        }
    }

    /* JADX INFO: compiled from: Languages.java */
    public static final class b extends AbstractC1224c {
        b() {
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean a(String str) {
            return true;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public String c() {
            throw new NoSuchElementException("Can't fetch any language from the any language set.");
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean d() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean e() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public AbstractC1224c f(AbstractC1224c abstractC1224c) {
            return abstractC1224c;
        }

        public String toString() {
            return "ANY_LANGUAGE";
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Languages.java */
    public static abstract class AbstractC1224c {
        public static AbstractC1224c b(Set<String> set) {
            return set.isEmpty() ? c.f132928d : new d(set, null);
        }

        public abstract boolean a(String str);

        public abstract String c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract AbstractC1224c f(AbstractC1224c abstractC1224c);
    }

    /* JADX INFO: compiled from: Languages.java */
    public static final class d extends AbstractC1224c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<String> f132931a;

        private d(Set<String> set) {
            this.f132931a = Collections.unmodifiableSet(set);
        }

        /* synthetic */ d(Set set, a aVar) {
            this(set);
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean a(String str) {
            return this.f132931a.contains(str);
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public String c() {
            return this.f132931a.iterator().next();
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean d() {
            return this.f132931a.isEmpty();
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public boolean e() {
            return this.f132931a.size() == 1;
        }

        @Override // org.apache.commons.codec.language.bm.c.AbstractC1224c
        public AbstractC1224c f(AbstractC1224c abstractC1224c) {
            if (abstractC1224c == c.f132928d) {
                return abstractC1224c;
            }
            if (abstractC1224c == c.f132929e) {
                return this;
            }
            d dVar = (d) abstractC1224c;
            if (dVar.f132931a.containsAll(this.f132931a)) {
                return this;
            }
            HashSet hashSet = new HashSet(this.f132931a);
            hashSet.retainAll(dVar.f132931a);
            return AbstractC1224c.b(hashSet);
        }

        public Set<String> g() {
            return this.f132931a;
        }

        public String toString() {
            return "Languages(" + this.f132931a.toString() + ")";
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            f132927c.put(nameType, a(d(nameType)));
        }
        f132928d = new a();
        f132929e = new b();
    }

    private c(Set<String> set) {
        this.f132930a = set;
    }

    public static c a(String str) {
        HashSet hashSet = new HashSet();
        InputStream resourceAsStream = c.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IllegalArgumentException("Unable to resolve required resource: " + str);
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z10 = false;
            while (scanner.hasNextLine()) {
                String strTrim = scanner.nextLine().trim();
                if (z10) {
                    if (strTrim.endsWith("*/")) {
                    }
                } else if (strTrim.startsWith("/*")) {
                    z10 = true;
                } else if (strTrim.length() > 0) {
                    hashSet.add(strTrim);
                }
            }
            return new c(Collections.unmodifiableSet(hashSet));
        }
    }

    public static c b(NameType nameType) {
        return f132927c.get(nameType);
    }

    private static String d(NameType nameType) {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", nameType.getName());
    }

    public Set<String> c() {
        return this.f132930a;
    }
}
