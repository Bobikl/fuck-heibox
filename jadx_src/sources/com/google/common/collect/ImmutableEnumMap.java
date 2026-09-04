package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient EnumMap<K, V> f57274g;

    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final EnumMap<K, V> f57275b;

        EnumSerializedForm(EnumMap<K, V> enumMap) {
            this.f57275b = enumMap;
        }

        Object a() {
            return new ImmutableEnumMap(this.f57275b);
        }
    }

    private ImmutableEnumMap(EnumMap<K, V> enumMap) {
        this.f57274g = enumMap;
        com.google.common.base.w.d(!enumMap.isEmpty());
    }

    static <K extends Enum<K>, V> ImmutableMap<K, V> K(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return ImmutableMap.v();
        }
        if (size != 1) {
            return new ImmutableEnumMap(enumMap);
        }
        Map.Entry entry = (Map.Entry) l1.z(enumMap.entrySet());
        return ImmutableMap.w((Enum) entry.getKey(), entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableMap
    Object I() {
        return new EnumSerializedForm(this.f57274g);
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    b3<Map.Entry<K, V>> J() {
        return Maps.I0(this.f57274g.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return this.f57274g.containsKey(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).f57274g;
        }
        return this.f57274g.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return this.f57274g.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean p() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    b3<K> r() {
        return Iterators.f0(this.f57274g.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f57274g.size();
    }
}
