package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    IndexedImmutableSet() {
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList<E> A() {
        return new ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // java.util.List
            public E get(int i10) {
                return (E) IndexedImmutableSet.this.get(i10);
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean i() {
                return IndexedImmutableSet.this.i();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    @o9.c
    int b(Object[] objArr, int i10) {
        return a().b(objArr, i10);
    }

    abstract E get(int i10);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<E> iterator() {
        return a().iterator();
    }
}
