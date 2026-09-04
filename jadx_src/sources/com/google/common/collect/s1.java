package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Multiset.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public interface s1<E> extends Collection<E> {

    /* JADX INFO: compiled from: Multiset.java */
    public interface a<E> {
        @x1
        E a();

        boolean equals(@CheckForNull Object obj);

        int getCount();

        int hashCode();

        String toString();
    }

    int E1(@CheckForNull @s9.c(androidx.exifinterface.media.a.S4) Object obj);

    @s9.a
    int I0(@x1 E e10, int i10);

    @s9.a
    boolean add(@x1 E e10);

    Set<E> c();

    @s9.a
    int c0(@x1 E e10, int i10);

    boolean contains(@CheckForNull Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    Set<a<E>> entrySet();

    boolean equals(@CheckForNull Object obj);

    @s9.a
    boolean g0(@x1 E e10, int i10, int i11);

    int hashCode();

    Iterator<E> iterator();

    @s9.a
    int n1(@CheckForNull @s9.c(androidx.exifinterface.media.a.S4) Object obj, int i10);

    @s9.a
    boolean remove(@CheckForNull Object obj);

    @s9.a
    boolean removeAll(Collection<?> collection);

    @s9.a
    boolean retainAll(Collection<?> collection);

    int size();

    String toString();
}
