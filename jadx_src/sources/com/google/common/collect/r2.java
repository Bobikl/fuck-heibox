package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: SortedMultisets.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class r2 {

    /* JADX INFO: compiled from: SortedMultisets.java */
    public static class a<E> extends Multisets.h<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        private final o2<E> f58169b;

        a(o2<E> o2Var) {
            this.f58169b = o2Var;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return h().comparator();
        }

        @Override // java.util.SortedSet
        @x1
        public E first() {
            return (E) r2.d(h().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@x1 E e10) {
            return h().m0(e10, BoundType.OPEN).c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final o2<E> h() {
            return this.f58169b;
        }

        @Override // com.google.common.collect.Multisets.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.h(h().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @x1
        public E last() {
            return (E) r2.d(h().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@x1 E e10, @x1 E e11) {
            return h().j1(e10, BoundType.CLOSED, e11, BoundType.OPEN).c();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@x1 E e10) {
            return h().F1(e10, BoundType.CLOSED).c();
        }
    }

    /* JADX INFO: compiled from: SortedMultisets.java */
    @o9.c
    public static class b<E> extends a<E> implements NavigableSet<E> {
        b(o2<E> o2Var) {
            super(o2Var);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@x1 E e10) {
            return (E) r2.c(h().F1(e10, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(h().e0());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@x1 E e10) {
            return (E) r2.c(h().m0(e10, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@x1 E e10, boolean z10) {
            return new b(h().m0(e10, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@x1 E e10) {
            return (E) r2.c(h().F1(e10, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@x1 E e10) {
            return (E) r2.c(h().m0(e10, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return (E) r2.c(h().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return (E) r2.c(h().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@x1 E e10, boolean z10, @x1 E e11, boolean z11) {
            return new b(h().j1(e10, BoundType.forBoolean(z10), e11, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@x1 E e10, boolean z10) {
            return new b(h().F1(e10, BoundType.forBoolean(z10)));
        }
    }

    private r2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public static <E> E c(@CheckForNull s1.a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E d(@CheckForNull s1.a<E> aVar) {
        if (aVar != null) {
            return aVar.a();
        }
        throw new NoSuchElementException();
    }
}
