package com.google.common.collect;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ImmutableMap<T, Integer> f57216d;

    ExplicitOrdering(ImmutableMap<T, Integer> immutableMap) {
        this.f57216d = immutableMap;
    }

    ExplicitOrdering(List<T> list) {
        this(Maps.Q(list));
    }

    private int H(T t10) {
        Integer num = this.f57216d.get(t10);
        if (num != null) {
            return num.intValue();
        }
        throw new Ordering.IncomparableValueException(t10);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t10, T t11) {
        return H(t10) - H(t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof ExplicitOrdering) {
            return this.f57216d.equals(((ExplicitOrdering) obj).f57216d);
        }
        return false;
    }

    public int hashCode() {
        return this.f57216d.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f57216d.keySet());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19);
        sb2.append("Ordering.explicit(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
