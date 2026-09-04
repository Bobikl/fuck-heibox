package com.google.common.base;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Equals f56601b = new Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        private Object k() {
            return f56601b;
        }

        @Override // com.google.common.base.Equivalence
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements x<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Equivalence<T> f56602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private final T f56603c;

        EquivalentToPredicate(Equivalence<T> equivalence, @CheckForNull T t10) {
            this.f56602b = (Equivalence) w.E(equivalence);
            this.f56603c = t10;
        }

        @Override // com.google.common.base.x
        public boolean apply(@CheckForNull T t10) {
            return this.f56602b.d(t10, this.f56603c);
        }

        @Override // com.google.common.base.x
        public boolean equals(@CheckForNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            return this.f56602b.equals(equivalentToPredicate.f56602b) && s.a(this.f56603c, equivalentToPredicate.f56603c);
        }

        public int hashCode() {
            return s.b(this.f56602b, this.f56603c);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56602b);
            String strValueOf2 = String.valueOf(this.f56603c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 15 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(".equivalentTo(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Identity f56604b = new Identity();
        private static final long serialVersionUID = 1;

        Identity() {
        }

        private Object k() {
            return f56604b;
        }

        @Override // com.google.common.base.Equivalence
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Equivalence<? super T> f56605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @t
        private final T f56606c;

        private Wrapper(Equivalence<? super T> equivalence, @t T t10) {
            this.f56605b = (Equivalence) w.E(equivalence);
            this.f56606c = t10;
        }

        @t
        public T a() {
            return this.f56606c;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.f56605b.equals(wrapper.f56605b)) {
                return this.f56605b.d(this.f56606c, wrapper.f56606c);
            }
            return false;
        }

        public int hashCode() {
            return this.f56605b.f(this.f56606c);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56605b);
            String strValueOf2 = String.valueOf(this.f56606c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(".wrap(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> c() {
        return Equals.f56601b;
    }

    public static Equivalence<Object> g() {
        return Identity.f56604b;
    }

    @s9.g
    protected abstract boolean a(T t10, T t11);

    @s9.g
    protected abstract int b(T t10);

    public final boolean d(@CheckForNull T t10, @CheckForNull T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }

    public final x<T> e(@CheckForNull T t10) {
        return new EquivalentToPredicate(this, t10);
    }

    public final int f(@CheckForNull T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }

    public final <F> Equivalence<F> h(n<? super F, ? extends T> nVar) {
        return new FunctionalEquivalence(nVar, this);
    }

    @o9.b(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> i() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> j(@t S s10) {
        return new Wrapper<>(s10);
    }
}
