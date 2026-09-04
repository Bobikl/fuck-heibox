package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class ReverseOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Ordering<? super T> f57844d;

    ReverseOrdering(Ordering<? super T> ordering) {
        this.f57844d = (Ordering) com.google.common.base.w.E(ordering);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> E() {
        return this.f57844d;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@x1 T t10, @x1 T t11) {
        return this.f57844d.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f57844d.equals(((ReverseOrdering) obj).f57844d);
        }
        return false;
    }

    public int hashCode() {
        return -this.f57844d.hashCode();
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) this.f57844d.v(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E s(@x1 E e10, @x1 E e11) {
        return (E) this.f57844d.w(e10, e11);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E t(@x1 E e10, @x1 E e11, @x1 E e12, E... eArr) {
        return (E) this.f57844d.x(e10, e11, e12, eArr);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f57844d);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
        sb2.append(strValueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E u(Iterator<E> it) {
        return (E) this.f57844d.y(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) this.f57844d.r(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E w(@x1 E e10, @x1 E e11) {
        return (E) this.f57844d.s(e10, e11);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E x(@x1 E e10, @x1 E e11, @x1 E e12, E... eArr) {
        return (E) this.f57844d.t(e10, e11, e12, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E y(Iterator<E> it) {
        return (E) this.f57844d.u(it);
    }
}
