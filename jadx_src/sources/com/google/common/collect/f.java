package com.google.common.collect;

import java.lang.Comparable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractRangeSet.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class f<C extends Comparable> implements c2<C> {
    f() {
    }

    @Override // com.google.common.collect.c2
    public boolean a(C c10) {
        return h(c10) != null;
    }

    @Override // com.google.common.collect.c2
    public void b(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c2
    public void clear() {
        b(Range.a());
    }

    @Override // com.google.common.collect.c2
    public boolean e(Range<C> range) {
        return !k(range).isEmpty();
    }

    @Override // com.google.common.collect.c2
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return m().equals(((c2) obj).m());
        }
        return false;
    }

    @Override // com.google.common.collect.c2
    public void f(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    @Override // com.google.common.collect.c2
    public boolean g(c2<C> c2Var) {
        return j(c2Var.m());
    }

    @Override // com.google.common.collect.c2
    @CheckForNull
    public abstract Range<C> h(C c10);

    @Override // com.google.common.collect.c2
    public final int hashCode() {
        return m().hashCode();
    }

    @Override // com.google.common.collect.c2
    public abstract boolean i(Range<C> range);

    @Override // com.google.common.collect.c2
    public boolean isEmpty() {
        return m().isEmpty();
    }

    @Override // com.google.common.collect.c2
    public boolean j(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.c2
    public void n(c2<C> c2Var) {
        f(c2Var.m());
    }

    @Override // com.google.common.collect.c2
    public void o(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c2
    public void p(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it = iterable.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
    }

    @Override // com.google.common.collect.c2
    public void q(c2<C> c2Var) {
        p(c2Var.m());
    }

    @Override // com.google.common.collect.c2
    public final String toString() {
        return m().toString();
    }
}
