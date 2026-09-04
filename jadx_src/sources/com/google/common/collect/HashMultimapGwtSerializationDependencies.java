package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
public abstract class HashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    HashMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}
