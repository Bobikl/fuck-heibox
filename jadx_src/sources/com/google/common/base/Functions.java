package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class Functions {

    public static class ConstantFunction<E> implements n<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @t
        private final E f56609b;

        public ConstantFunction(@t E e10) {
            this.f56609b = e10;
        }

        @Override // com.google.common.base.n
        @t
        public E apply(@CheckForNull Object obj) {
            return this.f56609b;
        }

        @Override // com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof ConstantFunction) {
                return s.a(this.f56609b, ((ConstantFunction) obj).f56609b);
            }
            return false;
        }

        public int hashCode() {
            E e10 = this.f56609b;
            if (e10 == null) {
                return 0;
            }
            return e10.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56609b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Functions.constant(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class ForMapWithDefault<K, V> implements n<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<K, ? extends V> f56610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @t
        final V f56611c;

        ForMapWithDefault(Map<K, ? extends V> map, @t V v10) {
            this.f56610b = (Map) w.E(map);
            this.f56611c = v10;
        }

        @Override // com.google.common.base.n
        @t
        public V apply(@t K k10) {
            V v10 = this.f56610b.get(k10);
            return (v10 != null || this.f56610b.containsKey(k10)) ? (V) r.a(v10) : this.f56611c;
        }

        @Override // com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ForMapWithDefault)) {
                return false;
            }
            ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
            return this.f56610b.equals(forMapWithDefault.f56610b) && s.a(this.f56611c, forMapWithDefault.f56611c);
        }

        public int hashCode() {
            return s.b(this.f56610b, this.f56611c);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56610b);
            String strValueOf2 = String.valueOf(this.f56611c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
            sb2.append("Functions.forMap(");
            sb2.append(strValueOf);
            sb2.append(", defaultValue=");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class FunctionComposition<A, B, C> implements n<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n<B, C> f56612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n<A, ? extends B> f56613c;

        public FunctionComposition(n<B, C> nVar, n<A, ? extends B> nVar2) {
            this.f56612b = (n) w.E(nVar);
            this.f56613c = (n) w.E(nVar2);
        }

        @Override // com.google.common.base.n
        @t
        public C apply(@t A a10) {
            return (C) this.f56612b.apply(this.f56613c.apply(a10));
        }

        @Override // com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof FunctionComposition)) {
                return false;
            }
            FunctionComposition functionComposition = (FunctionComposition) obj;
            return this.f56613c.equals(functionComposition.f56613c) && this.f56612b.equals(functionComposition.f56612b);
        }

        public int hashCode() {
            return this.f56613c.hashCode() ^ this.f56612b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56612b);
            String strValueOf2 = String.valueOf(this.f56613c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class FunctionForMapNoDefault<K, V> implements n<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<K, V> f56614b;

        FunctionForMapNoDefault(Map<K, V> map) {
            this.f56614b = (Map) w.E(map);
        }

        @Override // com.google.common.base.n
        @t
        public V apply(@t K k10) {
            V v10 = this.f56614b.get(k10);
            w.u(v10 != null || this.f56614b.containsKey(k10), "Key '%s' not present in map", k10);
            return (V) r.a(v10);
        }

        @Override // com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.f56614b.equals(((FunctionForMapNoDefault) obj).f56614b);
            }
            return false;
        }

        public int hashCode() {
            return this.f56614b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56614b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
            sb2.append("Functions.forMap(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public enum IdentityFunction implements n<Object, Object> {
        INSTANCE;

        @Override // com.google.common.base.n
        @CheckForNull
        public Object apply(@CheckForNull Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    public static class PredicateFunction<T> implements n<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x<T> f56615b;

        private PredicateFunction(x<T> xVar) {
            this.f56615b = (x) w.E(xVar);
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(@t T t10) {
            return Boolean.valueOf(this.f56615b.apply(t10));
        }

        @Override // com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.f56615b.equals(((PredicateFunction) obj).f56615b);
            }
            return false;
        }

        public int hashCode() {
            return this.f56615b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56615b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("Functions.forPredicate(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class SupplierFunction<F, T> implements n<F, T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0<T> f56616b;

        private SupplierFunction(c0<T> c0Var) {
            this.f56616b = (c0) w.E(c0Var);
        }

        @Override // com.google.common.base.n
        @t
        public T apply(@t F f10) {
            return this.f56616b.get();
        }

        @Override // com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.f56616b.equals(((SupplierFunction) obj).f56616b);
            }
            return false;
        }

        public int hashCode() {
            return this.f56616b.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56616b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
            sb2.append("Functions.forSupplier(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public enum ToStringFunction implements n<Object, String> {
        INSTANCE;

        @Override // com.google.common.base.n
        public String apply(Object obj) {
            w.E(obj);
            return obj.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }
    }

    private Functions() {
    }

    public static <A, B, C> n<A, C> a(n<B, C> nVar, n<A, ? extends B> nVar2) {
        return new FunctionComposition(nVar, nVar2);
    }

    public static <E> n<Object, E> b(@t E e10) {
        return new ConstantFunction(e10);
    }

    public static <K, V> n<K, V> c(Map<K, V> map) {
        return new FunctionForMapNoDefault(map);
    }

    public static <K, V> n<K, V> d(Map<K, ? extends V> map, @t V v10) {
        return new ForMapWithDefault(map, v10);
    }

    public static <T> n<T, Boolean> e(x<T> xVar) {
        return new PredicateFunction(xVar);
    }

    public static <F, T> n<F, T> f(c0<T> c0Var) {
        return new SupplierFunction(c0Var);
    }

    public static <E> n<E, E> g() {
        return IdentityFunction.INSTANCE;
    }

    public static n<Object, String> h() {
        return ToStringFunction.INSTANCE;
    }
}
