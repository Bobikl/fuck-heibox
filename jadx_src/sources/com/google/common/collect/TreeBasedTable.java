package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Comparator<? super C> f57971i;

    public static class Factory<C, V> implements com.google.common.base.c0<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator<? super C> f57972b;

        Factory(Comparator<? super C> comparator) {
            this.f57972b = comparator;
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.f57972b);
        }
    }

    public class a extends AbstractIterator<C> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        C f57973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Iterator f57974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Comparator f57975f;

        a(TreeBasedTable treeBasedTable, Iterator it, Comparator comparator) {
            this.f57974e = it;
            this.f57975f = comparator;
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected C a() {
            while (this.f57974e.hasNext()) {
                C c10 = (C) this.f57974e.next();
                C c11 = this.f57973d;
                if (!(c11 != null && this.f57975f.compare(c10, c11) == 0)) {
                    this.f57973d = c10;
                    return c10;
                }
            }
            this.f57973d = null;
            return b();
        }
    }

    public class b extends StandardTable<R, C, V>.g implements SortedMap<C, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        final C f57976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        final C f57977f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        transient SortedMap<C, V> f57978g;

        b(TreeBasedTable treeBasedTable, R r10) {
            this(r10, null, null);
        }

        b(@CheckForNull R r10, @CheckForNull C c10, C c11) {
            super(r10);
            this.f57976e = c10;
            this.f57977f = c11;
            com.google.common.base.w.d(c10 == null || c11 == null || f(c10, c11) <= 0);
        }

        @Override // com.google.common.collect.StandardTable.g
        void c() {
            j();
            SortedMap<C, V> sortedMap = this.f57978g;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.f57895d.remove(this.f57922b);
            this.f57978g = null;
            this.f57923c = null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.t();
        }

        @Override // com.google.common.collect.StandardTable.g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return i(obj) && super.containsKey(obj);
        }

        int f(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            d();
            Map<C, V> map = this.f57923c;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.StandardTable.g
        @CheckForNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> b() {
            j();
            SortedMap<C, V> sortedMapTailMap = this.f57978g;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c10 = this.f57976e;
            if (c10 != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c10);
            }
            C c11 = this.f57977f;
            return c11 != null ? sortedMapTailMap.headMap(c11) : sortedMapTailMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new Maps.e0(this);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c10) {
            com.google.common.base.w.d(i(com.google.common.base.w.E(c10)));
            return new b(this.f57922b, this.f57976e, c10);
        }

        boolean i(@CheckForNull Object obj) {
            C c10;
            C c11;
            return obj != null && ((c10 = this.f57976e) == null || f(c10, obj) <= 0) && ((c11 = this.f57977f) == null || f(c11, obj) > 0);
        }

        void j() {
            SortedMap<C, V> sortedMap = this.f57978g;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.f57895d.containsKey(this.f57922b))) {
                this.f57978g = (SortedMap) TreeBasedTable.this.f57895d.get(this.f57922b);
            }
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            d();
            Map<C, V> map = this.f57923c;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.g, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(C c10, V v10) {
            com.google.common.base.w.d(i(com.google.common.base.w.E(c10)));
            return (V) super.put(c10, v10);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c10, C c11) {
            com.google.common.base.w.d(i(com.google.common.base.w.E(c10)) && i(com.google.common.base.w.E(c11)));
            return new b(this.f57922b, c10, c11);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c10) {
            com.google.common.base.w.d(i(com.google.common.base.w.E(c10)));
            return new b(this.f57922b, c10, this.f57977f);
        }
    }

    TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new Factory(comparator2));
        this.f57971i = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> u() {
        return new TreeBasedTable<>(Ordering.z(), Ordering.z());
    }

    public static <R, C, V> TreeBasedTable<R, C, V> v(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.z(), treeBasedTable.t());
        treeBasedTable2.s0(treeBasedTable);
        return treeBasedTable2;
    }

    public static <R, C, V> TreeBasedTable<R, C, V> w(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        com.google.common.base.w.E(comparator);
        com.google.common.base.w.E(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator x(Map map) {
        return map.keySet().iterator();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean A0(@CheckForNull Object obj) {
        return super.A0(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    @CheckForNull
    public /* bridge */ /* synthetic */ Object Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.Y(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean Z(@CheckForNull Object obj) {
        return super.Z(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Map a0() {
        return super.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Map b0(Object obj) {
        return super.b0(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object d0(Object obj, Object obj2, Object obj3) {
        return super.d0(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.u2
    public SortedMap<R, Map<C, V>> h() {
        return super.h();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.h0(obj, obj2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public SortedSet<R> j() {
        return super.j();
    }

    @Override // com.google.common.collect.StandardTable
    Iterator<C> k() {
        Comparator<? super C> comparatorT = t();
        return new a(this, Iterators.O(l1.U(this.f57895d.values(), new com.google.common.base.n() { // from class: com.google.common.collect.y2
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return TreeBasedTable.x((Map) obj);
            }
        }), comparatorT), comparatorT);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ void s0(u2 u2Var) {
        super.s0(u2Var);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Deprecated
    public Comparator<? super C> t() {
        return this.f57971i;
    }

    @Override // com.google.common.collect.i
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Set v0() {
        return super.v0();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public SortedMap<C, V> E0(R r10) {
        return new b(this, r10);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Set y0() {
        return super.y0();
    }

    @Deprecated
    public Comparator<? super R> z() {
        Comparator<? super R> comparator = j().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }
}
