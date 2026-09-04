package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSortedSet.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class e1<E> extends a1<E> implements SortedSet<E> {
    protected e1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h0
    @o9.a
    protected boolean N0(@CheckForNull Object obj) {
        try {
            return c1.X0(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h0
    @o9.a
    protected boolean R0(@CheckForNull Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (c1.X0(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.a1
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract SortedSet<E> X0();

    @o9.a
    protected SortedSet<E> c1(@x1 E e10, @x1 E e11) {
        return tailSet(e10).headSet(e11);
    }

    @CheckForNull
    public Comparator<? super E> comparator() {
        return H0().comparator();
    }

    @x1
    public E first() {
        return H0().first();
    }

    public SortedSet<E> headSet(@x1 E e10) {
        return H0().headSet(e10);
    }

    @x1
    public E last() {
        return H0().last();
    }

    public SortedSet<E> subSet(@x1 E e10, @x1 E e11) {
        return H0().subSet(e10, e11);
    }

    public SortedSet<E> tailSet(@x1 E e10) {
        return H0().tailSet(e10);
    }
}
