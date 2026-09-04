package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.google.common.base.n<F, ? extends T> f57100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Ordering<T> f57101e;

    ByFunctionOrdering(com.google.common.base.n<F, ? extends T> nVar, Ordering<T> ordering) {
        this.f57100d = (com.google.common.base.n) com.google.common.base.w.E(nVar);
        this.f57101e = (Ordering) com.google.common.base.w.E(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@x1 F f10, @x1 F f11) {
        return this.f57101e.compare(this.f57100d.apply(f10), this.f57100d.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.f57100d.equals(byFunctionOrdering.f57100d) && this.f57101e.equals(byFunctionOrdering.f57101e);
    }

    public int hashCode() {
        return com.google.common.base.s.b(this.f57100d, this.f57101e);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f57101e);
        String strValueOf2 = String.valueOf(this.f57100d);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(".onResultOf(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
