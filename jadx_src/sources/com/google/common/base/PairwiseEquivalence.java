package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@g
public final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Equivalence<E> f56622b;

    PairwiseEquivalence(Equivalence<E> equivalence) {
        this.f56622b = (Equivalence) w.E(equivalence);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.f56622b.equals(((PairwiseEquivalence) obj).f56622b);
        }
        return false;
    }

    public int hashCode() {
        return this.f56622b.hashCode() ^ 1185147655;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f56622b.d(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int b(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iF = 78721;
        while (it.hasNext()) {
            iF = (iF * 24943) + this.f56622b.f(it.next());
        }
        return iF;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f56622b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 11);
        sb2.append(strValueOf);
        sb2.append(".pairwise()");
        return sb2.toString();
    }
}
