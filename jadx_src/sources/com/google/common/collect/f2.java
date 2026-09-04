package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: RowSortedTable.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public interface f2<R, C, V> extends u2<R, C, V> {
    @Override // com.google.common.collect.u2
    /* bridge */ /* synthetic */ Map h();

    @Override // com.google.common.collect.u2
    SortedMap<R, Map<C, V>> h();

    @Override // com.google.common.collect.u2
    /* bridge */ /* synthetic */ Set j();

    @Override // com.google.common.collect.u2
    SortedSet<R> j();
}
