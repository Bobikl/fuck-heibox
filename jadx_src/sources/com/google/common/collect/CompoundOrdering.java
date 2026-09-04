package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Comparator<? super T>[] f57153d;

    CompoundOrdering(Iterable<? extends Comparator<? super T>> iterable) {
        this.f57153d = (Comparator[]) l1.R(iterable, new Comparator[0]);
    }

    CompoundOrdering(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f57153d = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@x1 T t10, @x1 T t11) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f57153d;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.f57153d, ((CompoundOrdering) obj).f57153d);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f57153d);
    }

    public String toString() {
        String string = Arrays.toString(this.f57153d);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 19);
        sb2.append("Ordering.compound(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
