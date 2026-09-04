package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements o2<E> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private transient UnmodifiableSortedMultiset<E> f58038e;

    UnmodifiableSortedMultiset(o2<E> o2Var) {
        super(o2Var);
    }

    @Override // com.google.common.collect.o2
    public o2<E> F1(@x1 E e10, BoundType boundType) {
        return Multisets.B(X0().F1(e10, boundType));
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.v0, com.google.common.collect.s1
    public NavigableSet<E> c() {
        return (NavigableSet) super.c();
    }

    @Override // com.google.common.collect.o2, com.google.common.collect.j2
    public Comparator<? super E> comparator() {
        return X0().comparator();
    }

    @Override // com.google.common.collect.o2
    public o2<E> e0() {
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.f58038e;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset<>(X0().e0());
        unmodifiableSortedMultiset2.f58038e = this;
        this.f58038e = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> firstEntry() {
        return X0().firstEntry();
    }

    @Override // com.google.common.collect.o2
    public o2<E> j1(@x1 E e10, BoundType boundType, @x1 E e11, BoundType boundType2) {
        return Multisets.B(X0().j1(e10, boundType, e11, boundType2));
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> lastEntry() {
        return X0().lastEntry();
    }

    @Override // com.google.common.collect.o2
    public o2<E> m0(@x1 E e10, BoundType boundType) {
        return Multisets.B(X0().m0(e10, boundType));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> m1() {
        return Sets.O(X0().c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.v0
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public o2<E> X0() {
        return (o2) super.X0();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o2
    @CheckForNull
    public s1.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }
}
