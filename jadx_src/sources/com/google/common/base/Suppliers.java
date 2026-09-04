package com.google.common.base;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class Suppliers {

    @o9.d
    public static class ExpiringMemoizingSupplier<T> implements c0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c0<T> f56634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f56635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        volatile transient T f56636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile transient long f56637e;

        ExpiringMemoizingSupplier(c0<T> c0Var, long j10, TimeUnit timeUnit) {
            this.f56634b = (c0) w.E(c0Var);
            this.f56635c = timeUnit.toNanos(j10);
            w.t(j10 > 0, "duration (%s %s) must be > 0", j10, timeUnit);
        }

        @Override // com.google.common.base.c0
        @t
        public T get() {
            long j10 = this.f56637e;
            long jL = v.l();
            if (j10 == 0 || jL - j10 >= 0) {
                synchronized (this) {
                    if (j10 == this.f56637e) {
                        T t10 = this.f56634b.get();
                        this.f56636d = t10;
                        long j11 = jL + this.f56635c;
                        if (j11 == 0) {
                            j11 = 1;
                        }
                        this.f56637e = j11;
                        return t10;
                    }
                }
            }
            return (T) r.a(this.f56636d);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56634b);
            long j10 = this.f56635c;
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 62);
            sb2.append("Suppliers.memoizeWithExpiration(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(j10);
            sb2.append(", NANOS)");
            return sb2.toString();
        }
    }

    @o9.d
    public static class MemoizingSupplier<T> implements c0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c0<T> f56638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f56639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        transient T f56640d;

        MemoizingSupplier(c0<T> c0Var) {
            this.f56638b = (c0) w.E(c0Var);
        }

        @Override // com.google.common.base.c0
        @t
        public T get() {
            if (!this.f56639c) {
                synchronized (this) {
                    if (!this.f56639c) {
                        T t10 = this.f56638b.get();
                        this.f56640d = t10;
                        this.f56639c = true;
                        return t10;
                    }
                }
            }
            return (T) r.a(this.f56640d);
        }

        public String toString() {
            Object string;
            if (this.f56639c) {
                String strValueOf = String.valueOf(this.f56640d);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            } else {
                string = this.f56638b;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(strValueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public static class SupplierComposition<F, T> implements c0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n<? super F, T> f56641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c0<F> f56642c;

        SupplierComposition(n<? super F, T> nVar, c0<F> c0Var) {
            this.f56641b = (n) w.E(nVar);
            this.f56642c = (c0) w.E(c0Var);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof SupplierComposition)) {
                return false;
            }
            SupplierComposition supplierComposition = (SupplierComposition) obj;
            return this.f56641b.equals(supplierComposition.f56641b) && this.f56642c.equals(supplierComposition.f56642c);
        }

        @Override // com.google.common.base.c0
        @t
        public T get() {
            return this.f56641b.apply(this.f56642c.get());
        }

        public int hashCode() {
            return s.b(this.f56641b, this.f56642c);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56641b);
            String strValueOf2 = String.valueOf(this.f56642c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
            sb2.append("Suppliers.compose(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public enum SupplierFunctionImpl implements b<Object> {
        INSTANCE;

        @Override // com.google.common.base.n
        @CheckForNull
        public Object apply(c0<Object> c0Var) {
            return c0Var.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    public static class SupplierOfInstance<T> implements c0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @t
        final T f56643b;

        SupplierOfInstance(@t T t10) {
            this.f56643b = t10;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return s.a(this.f56643b, ((SupplierOfInstance) obj).f56643b);
            }
            return false;
        }

        @Override // com.google.common.base.c0
        @t
        public T get() {
            return this.f56643b;
        }

        public int hashCode() {
            return s.b(this.f56643b);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56643b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class ThreadSafeSupplier<T> implements c0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c0<T> f56644b;

        ThreadSafeSupplier(c0<T> c0Var) {
            this.f56644b = (c0) w.E(c0Var);
        }

        @Override // com.google.common.base.c0
        @t
        public T get() {
            T t10;
            synchronized (this.f56644b) {
                t10 = this.f56644b.get();
            }
            return t10;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56644b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
            sb2.append("Suppliers.synchronizedSupplier(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @o9.d
    public static class a<T> implements c0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        volatile c0<T> f56645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f56646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        T f56647d;

        a(c0<T> c0Var) {
            this.f56645b = (c0) w.E(c0Var);
        }

        @Override // com.google.common.base.c0
        @t
        public T get() {
            if (!this.f56646c) {
                synchronized (this) {
                    if (!this.f56646c) {
                        c0<T> c0Var = this.f56645b;
                        Objects.requireNonNull(c0Var);
                        T t10 = c0Var.get();
                        this.f56647d = t10;
                        this.f56646c = true;
                        this.f56645b = null;
                        return t10;
                    }
                }
            }
            return (T) r.a(this.f56647d);
        }

        public String toString() {
            Object string = this.f56645b;
            if (string == null) {
                String strValueOf = String.valueOf(this.f56647d);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(strValueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public interface b<T> extends n<c0<T>, T> {
    }

    private Suppliers() {
    }

    public static <F, T> c0<T> a(n<? super F, T> nVar, c0<F> c0Var) {
        return new SupplierComposition(nVar, c0Var);
    }

    public static <T> c0<T> b(c0<T> c0Var) {
        if ((c0Var instanceof a) || (c0Var instanceof MemoizingSupplier)) {
            return c0Var;
        }
        return c0Var instanceof Serializable ? new MemoizingSupplier(c0Var) : new a(c0Var);
    }

    public static <T> c0<T> c(c0<T> c0Var, long j10, TimeUnit timeUnit) {
        return new ExpiringMemoizingSupplier(c0Var, j10, timeUnit);
    }

    public static <T> c0<T> d(@t T t10) {
        return new SupplierOfInstance(t10);
    }

    public static <T> n<c0<T>, T> e() {
        return SupplierFunctionImpl.INSTANCE;
    }

    public static <T> c0<T> f(c0<T> c0Var) {
        return new ThreadSafeSupplier(c0Var);
    }
}
