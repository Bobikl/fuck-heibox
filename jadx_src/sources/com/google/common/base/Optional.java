package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@s9.f("Use Optional.of(value) or Optional.absent()")
@g
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public class a implements Iterable<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f56619b;

        /* JADX INFO: renamed from: com.google.common.base.Optional$a$a, reason: collision with other inner class name */
        public class C0440a extends AbstractIterator<T> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Iterator<? extends Optional<? extends T>> f56620d;

            C0440a() {
                this.f56620d = (Iterator) w.E(a.this.f56619b.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            @CheckForNull
            protected T a() {
                while (this.f56620d.hasNext()) {
                    Optional<? extends T> next = this.f56620d.next();
                    if (next.e()) {
                        return next.d();
                    }
                }
                return b();
            }
        }

        a(Iterable iterable) {
            this.f56619b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0440a();
        }
    }

    Optional() {
    }

    public static <T> Optional<T> a() {
        return Absent.n();
    }

    public static <T> Optional<T> c(@CheckForNull T t10) {
        return t10 == null ? a() : new Present(t10);
    }

    public static <T> Optional<T> f(T t10) {
        return new Present(w.E(t10));
    }

    @o9.a
    public static <T> Iterable<T> k(Iterable<? extends Optional<? extends T>> iterable) {
        w.E(iterable);
        return new a(iterable);
    }

    public abstract Set<T> b();

    public abstract T d();

    public abstract boolean e();

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract Optional<T> g(Optional<? extends T> optional);

    @o9.a
    public abstract T h(c0<? extends T> c0Var);

    public abstract int hashCode();

    public abstract T i(T t10);

    @CheckForNull
    public abstract T j();

    public abstract <V> Optional<V> l(n<? super T, V> nVar);

    public abstract String toString();
}
