package com.google.common.collect;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class AllEqualOrdering extends Ordering<Object> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final AllEqualOrdering f57074d = new AllEqualOrdering();
    private static final long serialVersionUID = 0;

    AllEqualOrdering() {
    }

    private Object H() {
        return f57074d;
    }

    @Override // com.google.common.collect.Ordering
    public <S> Ordering<S> E() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public <E> List<E> F(Iterable<E> iterable) {
        return Lists.r(iterable);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.Ordering
    public <E> ImmutableList<E> l(Iterable<E> iterable) {
        return ImmutableList.u(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
