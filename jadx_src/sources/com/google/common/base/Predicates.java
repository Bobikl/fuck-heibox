package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@g
public final class Predicates {

    public static class AndPredicate<T> implements x<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<? extends x<? super T>> f56623b;

        private AndPredicate(List<? extends x<? super T>> list) {
            this.f56623b = list;
        }

        @Override // com.google.common.base.x
        public boolean apply(@t T t10) {
            for (int i10 = 0; i10 < this.f56623b.size(); i10++) {
                if (!this.f56623b.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof AndPredicate) {
                return this.f56623b.equals(((AndPredicate) obj).f56623b);
            }
            return false;
        }

        public int hashCode() {
            return this.f56623b.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.w("and", this.f56623b);
        }
    }

    public static class CompositionPredicate<A, B> implements x<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x<B> f56624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final n<A, ? extends B> f56625c;

        private CompositionPredicate(x<B> xVar, n<A, ? extends B> nVar) {
            this.f56624b = (x) w.E(xVar);
            this.f56625c = (n) w.E(nVar);
        }

        @Override // com.google.common.base.x
        public boolean apply(@t A a10) {
            return this.f56624b.apply(this.f56625c.apply(a10));
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            return this.f56625c.equals(compositionPredicate.f56625c) && this.f56624b.equals(compositionPredicate.f56624b);
        }

        public int hashCode() {
            return this.f56625c.hashCode() ^ this.f56624b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56624b);
            String strValueOf2 = String.valueOf(this.f56625c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @o9.c
    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        ContainsPatternFromStringPredicate(String str) {
            super(v.b(str));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
            String strE = this.f56626b.e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strE).length() + 28);
            sb2.append("Predicates.containsPattern(");
            sb2.append(strE);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @o9.c
    public static class ContainsPatternPredicate implements x<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e f56626b;

        ContainsPatternPredicate(e eVar) {
            this.f56626b = (e) w.E(eVar);
        }

        @Override // com.google.common.base.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(CharSequence charSequence) {
            return this.f56626b.d(charSequence).b();
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
            return s.a(this.f56626b.e(), containsPatternPredicate.f56626b.e()) && this.f56626b.b() == containsPatternPredicate.f56626b.b();
        }

        public int hashCode() {
            return s.b(this.f56626b.e(), Integer.valueOf(this.f56626b.b()));
        }

        public String toString() {
            String string = q.c(this.f56626b).f(org.apache.tools.ant.types.selectors.m.f136546u, this.f56626b.e()).d("pattern.flags", this.f56626b.b()).toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 21);
            sb2.append("Predicates.contains(");
            sb2.append(string);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class InPredicate<T> implements x<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection<?> f56627b;

        private InPredicate(Collection<?> collection) {
            this.f56627b = (Collection) w.E(collection);
        }

        @Override // com.google.common.base.x
        public boolean apply(@t T t10) {
            try {
                return this.f56627b.contains(t10);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof InPredicate) {
                return this.f56627b.equals(((InPredicate) obj).f56627b);
            }
            return false;
        }

        public int hashCode() {
            return this.f56627b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56627b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 15);
            sb2.append("Predicates.in(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @o9.c
    public static class InstanceOfPredicate<T> implements x<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?> f56628b;

        private InstanceOfPredicate(Class<?> cls) {
            this.f56628b = (Class) w.E(cls);
        }

        @Override // com.google.common.base.x
        public boolean apply(@t T t10) {
            return this.f56628b.isInstance(t10);
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.f56628b == ((InstanceOfPredicate) obj).f56628b;
        }

        public int hashCode() {
            return this.f56628b.hashCode();
        }

        public String toString() {
            String name = this.f56628b.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 23);
            sb2.append("Predicates.instanceOf(");
            sb2.append(name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class IsEqualToPredicate implements x<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f56629b;

        private IsEqualToPredicate(Object obj) {
            this.f56629b = obj;
        }

        <T> x<T> a() {
            return this;
        }

        @Override // com.google.common.base.x
        public boolean apply(@CheckForNull Object obj) {
            return this.f56629b.equals(obj);
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.f56629b.equals(((IsEqualToPredicate) obj).f56629b);
            }
            return false;
        }

        public int hashCode() {
            return this.f56629b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56629b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Predicates.equalTo(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class NotPredicate<T> implements x<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x<T> f56630b;

        NotPredicate(x<T> xVar) {
            this.f56630b = (x) w.E(xVar);
        }

        @Override // com.google.common.base.x
        public boolean apply(@t T t10) {
            return !this.f56630b.apply(t10);
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof NotPredicate) {
                return this.f56630b.equals(((NotPredicate) obj).f56630b);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f56630b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56630b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16);
            sb2.append("Predicates.not(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public enum ObjectPredicate implements x<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.x
            public boolean apply(@CheckForNull Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.x
            public boolean apply(@CheckForNull Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.x
            public boolean apply(@CheckForNull Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.x
            public boolean apply(@CheckForNull Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        <T> x<T> withNarrowedType() {
            return this;
        }
    }

    public static class OrPredicate<T> implements x<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<? extends x<? super T>> f56631b;

        private OrPredicate(List<? extends x<? super T>> list) {
            this.f56631b = list;
        }

        @Override // com.google.common.base.x
        public boolean apply(@t T t10) {
            for (int i10 = 0; i10 < this.f56631b.size(); i10++) {
                if (this.f56631b.get(i10).apply(t10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof OrPredicate) {
                return this.f56631b.equals(((OrPredicate) obj).f56631b);
            }
            return false;
        }

        public int hashCode() {
            return this.f56631b.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.w("or", this.f56631b);
        }
    }

    @o9.c
    public static class SubtypeOfPredicate implements x<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?> f56632b;

        private SubtypeOfPredicate(Class<?> cls) {
            this.f56632b = (Class) w.E(cls);
        }

        @Override // com.google.common.base.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> cls) {
            return this.f56632b.isAssignableFrom(cls);
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            return (obj instanceof SubtypeOfPredicate) && this.f56632b == ((SubtypeOfPredicate) obj).f56632b;
        }

        public int hashCode() {
            return this.f56632b.hashCode();
        }

        public String toString() {
            String name = this.f56632b.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 22);
            sb2.append("Predicates.subtypeOf(");
            sb2.append(name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private Predicates() {
    }

    @o9.b(serializable = true)
    public static <T> x<T> b() {
        return ObjectPredicate.ALWAYS_FALSE.withNarrowedType();
    }

    @o9.b(serializable = true)
    public static <T> x<T> c() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> x<T> d(x<? super T> xVar, x<? super T> xVar2) {
        return new AndPredicate(g((x) w.E(xVar), (x) w.E(xVar2)));
    }

    public static <T> x<T> e(Iterable<? extends x<? super T>> iterable) {
        return new AndPredicate(k(iterable));
    }

    @SafeVarargs
    public static <T> x<T> f(x<? super T>... xVarArr) {
        return new AndPredicate(l(xVarArr));
    }

    private static <T> List<x<? super T>> g(x<? super T> xVar, x<? super T> xVar2) {
        return Arrays.asList(xVar, xVar2);
    }

    public static <A, B> x<A> h(x<B> xVar, n<A, ? extends B> nVar) {
        return new CompositionPredicate(xVar, nVar);
    }

    @o9.c("java.util.regex.Pattern")
    public static x<CharSequence> i(Pattern pattern) {
        return new ContainsPatternPredicate(new JdkPattern(pattern));
    }

    @o9.c
    public static x<CharSequence> j(String str) {
        return new ContainsPatternFromStringPredicate(str);
    }

    static <T> List<T> k(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(w.E(it.next()));
        }
        return arrayList;
    }

    private static <T> List<T> l(T... tArr) {
        return k(Arrays.asList(tArr));
    }

    public static <T> x<T> m(@t T t10) {
        return t10 == null ? p() : new IsEqualToPredicate(t10).a();
    }

    public static <T> x<T> n(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    @o9.c
    public static <T> x<T> o(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    @o9.b(serializable = true)
    public static <T> x<T> p() {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static <T> x<T> q(x<T> xVar) {
        return new NotPredicate(xVar);
    }

    @o9.b(serializable = true)
    public static <T> x<T> r() {
        return ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    public static <T> x<T> s(x<? super T> xVar, x<? super T> xVar2) {
        return new OrPredicate(g((x) w.E(xVar), (x) w.E(xVar2)));
    }

    public static <T> x<T> t(Iterable<? extends x<? super T>> iterable) {
        return new OrPredicate(k(iterable));
    }

    @SafeVarargs
    public static <T> x<T> u(x<? super T>... xVarArr) {
        return new OrPredicate(l(xVarArr));
    }

    @o9.a
    @o9.c
    public static x<Class<?>> v(Class<?> cls) {
        return new SubtypeOfPredicate(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
