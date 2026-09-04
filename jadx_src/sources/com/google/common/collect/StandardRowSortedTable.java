package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements f2<R, C, V> {
    private static final long serialVersionUID = 0;

    public class b extends StandardTable<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        private b() {
            super();
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.r().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.n0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> g() {
            return new Maps.e0(this);
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) StandardRowSortedTable.this.r().firstKey();
        }

        @Override // com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> h() {
            return (SortedSet) super.h();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r10) {
            com.google.common.base.w.E(r10);
            return new StandardRowSortedTable(StandardRowSortedTable.this.r().headMap(r10), StandardRowSortedTable.this.f57896e).h();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) StandardRowSortedTable.this.r().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r10, R r11) {
            com.google.common.base.w.E(r10);
            com.google.common.base.w.E(r11);
            return new StandardRowSortedTable(StandardRowSortedTable.this.r().subMap(r10, r11), StandardRowSortedTable.this.f57896e).h();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r10) {
            com.google.common.base.w.E(r10);
            return new StandardRowSortedTable(StandardRowSortedTable.this.r().tailMap(r10), StandardRowSortedTable.this.f57896e).h();
        }
    }

    StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, com.google.common.base.c0<? extends Map<C, V>> c0Var) {
        super(sortedMap, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> r() {
        return (SortedMap) this.f57895d;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public SortedMap<R, Map<C, V>> h() {
        return (SortedMap) super.h();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public SortedSet<R> j() {
        return (SortedSet) h().keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.StandardTable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> l() {
        return new b();
    }
}
