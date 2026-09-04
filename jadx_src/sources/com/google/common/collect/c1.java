package com.google.common.collect;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSortedMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class c1<K, V> extends s0<K, V> implements SortedMap<K, V> {

    /* JADX INFO: compiled from: ForwardingSortedMap.java */
    @o9.a
    public class a extends Maps.e0<K, V> {
        public a(c1 c1Var) {
            super(c1Var);
        }
    }

    protected c1() {
    }

    static int X0(@CheckForNull Comparator<?> comparator, @CheckForNull Object obj, @CheckForNull Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.s0
    @o9.a
    protected boolean L0(@CheckForNull Object obj) {
        try {
            return X0(comparator(), tailMap(obj).firstKey(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public abstract SortedMap<K, V> H0();

    @o9.a
    protected SortedMap<K, V> W0(K k10, K k11) {
        com.google.common.base.w.e(X0(comparator(), k10, k11) <= 0, "fromKey must be <= toKey");
        return tailMap(k10).headMap(k11);
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public Comparator<? super K> comparator() {
        return X0().comparator();
    }

    @Override // java.util.SortedMap
    @x1
    public K firstKey() {
        return X0().firstKey();
    }

    public SortedMap<K, V> headMap(@x1 K k10) {
        return X0().headMap(k10);
    }

    @Override // java.util.SortedMap
    @x1
    public K lastKey() {
        return X0().lastKey();
    }

    public SortedMap<K, V> subMap(@x1 K k10, @x1 K k11) {
        return X0().subMap(k10, k11);
    }

    public SortedMap<K, V> tailMap(@x1 K k10) {
        return X0().tailMap(k10);
    }
}
