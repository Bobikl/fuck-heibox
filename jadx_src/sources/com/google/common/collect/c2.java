package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: RangeSet.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@s9.f("Use ImmutableRangeSet or TreeRangeSet")
@o9.c
@u
public interface c2<C extends Comparable> {
    boolean a(C c10);

    void b(Range<C> range);

    Range<C> c();

    void clear();

    c2<C> d();

    boolean e(Range<C> range);

    boolean equals(@CheckForNull Object obj);

    void f(Iterable<Range<C>> iterable);

    boolean g(c2<C> c2Var);

    @CheckForNull
    Range<C> h(C c10);

    int hashCode();

    boolean i(Range<C> range);

    boolean isEmpty();

    boolean j(Iterable<Range<C>> iterable);

    c2<C> k(Range<C> range);

    Set<Range<C>> l();

    Set<Range<C>> m();

    void n(c2<C> c2Var);

    void o(Range<C> range);

    void p(Iterable<Range<C>> iterable);

    void q(c2<C> c2Var);

    String toString();
}
