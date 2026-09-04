package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Table.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@s9.f("Use ImmutableTable, HashBasedTable, or another implementation")
@u
public interface u2<R, C, V> {

    /* JADX INFO: compiled from: Table.java */
    public interface a<R, C, V> {
        @x1
        C a();

        @x1
        R b();

        boolean equals(@CheckForNull Object obj);

        @x1
        V getValue();

        int hashCode();
    }

    boolean A0(@CheckForNull @s9.c("R") Object obj);

    Map<C, V> E0(@x1 R r10);

    @CheckForNull
    V Y(@CheckForNull @s9.c("R") Object obj, @CheckForNull @s9.c("C") Object obj2);

    boolean Z(@CheckForNull @s9.c("C") Object obj);

    Map<C, Map<R, V>> a0();

    Map<R, V> b0(@x1 C c10);

    void clear();

    boolean containsValue(@CheckForNull @s9.c(androidx.exifinterface.media.a.X4) Object obj);

    @s9.a
    @CheckForNull
    V d0(@x1 R r10, @x1 C c10, @x1 V v10);

    boolean equals(@CheckForNull Object obj);

    Map<R, Map<C, V>> h();

    boolean h0(@CheckForNull @s9.c("R") Object obj, @CheckForNull @s9.c("C") Object obj2);

    int hashCode();

    boolean isEmpty();

    Set<R> j();

    @s9.a
    @CheckForNull
    V remove(@CheckForNull @s9.c("R") Object obj, @CheckForNull @s9.c("C") Object obj2);

    void s0(u2<? extends R, ? extends C, ? extends V> u2Var);

    int size();

    Set<a<R, C, V>> v0();

    Collection<V> values();

    Set<C> y0();
}
