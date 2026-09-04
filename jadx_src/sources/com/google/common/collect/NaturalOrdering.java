package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final NaturalOrdering f57763f = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private transient Ordering<Comparable<?>> f57764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private transient Ordering<Comparable<?>> f57765e;

    private NaturalOrdering() {
    }

    private Object I() {
        return f57763f;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> A() {
        Ordering<S> ordering = (Ordering<S>) this.f57764d;
        if (ordering != null) {
            return ordering;
        }
        Ordering<S> orderingA = super.A();
        this.f57764d = orderingA;
        return orderingA;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> B() {
        Ordering<S> ordering = (Ordering<S>) this.f57765e;
        if (ordering != null) {
            return ordering;
        }
        Ordering<S> orderingB = super.B();
        this.f57765e = orderingB;
        return orderingB;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> E() {
        return ReverseNaturalOrdering.f57843d;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        com.google.common.base.w.E(comparable);
        com.google.common.base.w.E(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
