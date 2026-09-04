package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Ordering<? super T> f57766d;

    NullsFirstOrdering(Ordering<? super T> ordering) {
        this.f57766d = ordering;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> A() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> B() {
        return this.f57766d.B();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> E() {
        return this.f57766d.E().B();
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@CheckForNull T t10, @CheckForNull T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return this.f57766d.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.f57766d.equals(((NullsFirstOrdering) obj).f57766d);
        }
        return false;
    }

    public int hashCode() {
        return this.f57766d.hashCode() ^ 957692532;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f57766d);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append(strValueOf);
        sb2.append(".nullsFirst()");
        return sb2.toString();
    }
}
