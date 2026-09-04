package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Comparator<T> f57152d;

    ComparatorOrdering(Comparator<T> comparator) {
        this.f57152d = (Comparator) com.google.common.base.w.E(comparator);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@x1 T t10, @x1 T t11) {
        return this.f57152d.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.f57152d.equals(((ComparatorOrdering) obj).f57152d);
        }
        return false;
    }

    public int hashCode() {
        return this.f57152d.hashCode();
    }

    public String toString() {
        return this.f57152d.toString();
    }
}
