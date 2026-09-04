package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class NullsLastOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Ordering<? super T> f57767d;

    NullsLastOrdering(Ordering<? super T> ordering) {
        this.f57767d = ordering;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> A() {
        return this.f57767d.A();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> B() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> E() {
        return this.f57767d.E().A();
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@CheckForNull T t10, @CheckForNull T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return 1;
        }
        if (t11 == null) {
            return -1;
        }
        return this.f57767d.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsLastOrdering) {
            return this.f57767d.equals(((NullsLastOrdering) obj).f57767d);
        }
        return false;
    }

    public int hashCode() {
        return this.f57767d.hashCode() ^ (-921210296);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f57767d);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
        sb2.append(strValueOf);
        sb2.append(".nullsLast()");
        return sb2.toString();
    }
}
