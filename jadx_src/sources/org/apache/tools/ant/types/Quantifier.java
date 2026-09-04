package org.apache.tools.ant.types;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: loaded from: classes5.dex */
public class Quantifier extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f136090c = (String[]) Stream.of((Object[]) Predicate.values()).map(new Function() { // from class: org.apache.tools.ant.types.k1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((Quantifier.Predicate) obj).getNames();
        }
    }).flatMap(new Function() { // from class: org.apache.tools.ant.types.l1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((Set) obj).stream();
        }
    }).toArray(new IntFunction() { // from class: org.apache.tools.ant.types.m1
        @Override // java.util.function.IntFunction
        public final Object apply(int i10) {
            return Quantifier.k(i10);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Quantifier f136091d = new Quantifier(Predicate.ALL);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Quantifier f136092e = new Quantifier(Predicate.ANY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Quantifier f136093f = new Quantifier(Predicate.ONE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Quantifier f136094g = new Quantifier(Predicate.MAJORITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Quantifier f136095h = new Quantifier(Predicate.NONE);

    public enum Predicate {
        ALL("all", "each", "every") { // from class: org.apache.tools.ant.types.Quantifier.Predicate.1
            @Override // org.apache.tools.ant.types.Quantifier.Predicate
            boolean eval(int i10, int i11) {
                return i11 == 0;
            }
        },
        ANY(org.apache.commons.codec.language.bm.c.f132926b, "some") { // from class: org.apache.tools.ant.types.Quantifier.Predicate.2
            @Override // org.apache.tools.ant.types.Quantifier.Predicate
            boolean eval(int i10, int i11) {
                return i10 > 0;
            }
        },
        ONE("one", new String[0]) { // from class: org.apache.tools.ant.types.Quantifier.Predicate.3
            @Override // org.apache.tools.ant.types.Quantifier.Predicate
            boolean eval(int i10, int i11) {
                return i10 == 1;
            }
        },
        MAJORITY("majority", "most") { // from class: org.apache.tools.ant.types.Quantifier.Predicate.4
            @Override // org.apache.tools.ant.types.Quantifier.Predicate
            boolean eval(int i10, int i11) {
                return i10 > i11;
            }
        },
        NONE("none", new String[0]) { // from class: org.apache.tools.ant.types.Quantifier.Predicate.5
            @Override // org.apache.tools.ant.types.Quantifier.Predicate
            boolean eval(int i10, int i11) {
                return i10 == 0;
            }
        };

        final Set<String> names;

        Predicate(String str, String... strArr) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(str);
            Collections.addAll(linkedHashSet, strArr);
            this.names = Collections.unmodifiableSet(linkedHashSet);
        }

        static Predicate get(final String str) {
            return (Predicate) Stream.of((Object[]) values()).filter(new java.util.function.Predicate() { // from class: org.apache.tools.ant.types.n1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Quantifier.Predicate.lambda$get$0(str, (Quantifier.Predicate) obj);
                }
            }).findFirst().orElseThrow(new Supplier() { // from class: org.apache.tools.ant.types.o1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return Quantifier.Predicate.lambda$get$1(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$get$0(String str, Predicate predicate) {
            return predicate.names.contains(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ IllegalArgumentException lambda$get$1(String str) {
            return new IllegalArgumentException(str);
        }

        abstract boolean eval(int i10, int i11);

        Set<String> getNames() {
            return this.names;
        }
    }

    public Quantifier() {
    }

    public Quantifier(String str) {
        g(str);
    }

    private Quantifier(Predicate predicate) {
        g(predicate.getNames().iterator().next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] k(int i10) {
        return new String[i10];
    }

    @Override // org.apache.tools.ant.types.w
    public String[] e() {
        return f136090c;
    }

    public boolean i(int i10, int i11) {
        int iB = b();
        if (iB != -1) {
            return Predicate.get(f136090c[iB]).eval(i10, i11);
        }
        throw new BuildException("Quantifier value not set.");
    }

    public boolean j(boolean[] zArr) {
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (z10) {
                i10++;
            }
        }
        return i(i10, zArr.length - i10);
    }
}
