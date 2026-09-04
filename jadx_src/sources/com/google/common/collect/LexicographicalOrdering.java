package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class LexicographicalOrdering<T> extends Ordering<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Comparator<? super T> f57459d;

    LexicographicalOrdering(Comparator<? super T> comparator) {
        this.f57459d = comparator;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f57459d.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LexicographicalOrdering) {
            return this.f57459d.equals(((LexicographicalOrdering) obj).f57459d);
        }
        return false;
    }

    public int hashCode() {
        return this.f57459d.hashCode() ^ 2075626741;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f57459d);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
        sb2.append(strValueOf);
        sb2.append(".lexicographical()");
        return sb2.toString();
    }
}
