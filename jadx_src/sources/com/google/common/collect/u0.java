package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class u0<K, V> extends y0 implements r1<K, V> {
    protected u0() {
    }

    @s9.a
    public boolean A(r1<? extends K, ? extends V> r1Var) {
        return H0().A(r1Var);
    }

    @Override // com.google.common.collect.r1
    public boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return H0().D0(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    public abstract r1<K, V> H0();

    @s9.a
    public Collection<V> a(@CheckForNull Object obj) {
        return H0().a(obj);
    }

    @s9.a
    public Collection<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return H0().b(k10, iterable);
    }

    public void clear() {
        H0().clear();
    }

    @Override // com.google.common.collect.r1
    public boolean containsKey(@CheckForNull Object obj) {
        return H0().containsKey(obj);
    }

    @Override // com.google.common.collect.r1
    public boolean containsValue(@CheckForNull Object obj) {
        return H0().containsValue(obj);
    }

    public Map<K, Collection<V>> e() {
        return H0().e();
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || H0().equals(obj);
    }

    /* JADX INFO: renamed from: get */
    public Collection<V> v(@x1 K k10) {
        return H0().v(k10);
    }

    @Override // com.google.common.collect.r1
    public int hashCode() {
        return H0().hashCode();
    }

    public Collection<Map.Entry<K, V>> i() {
        return H0().i();
    }

    @Override // com.google.common.collect.r1
    public boolean isEmpty() {
        return H0().isEmpty();
    }

    public Set<K> keySet() {
        return H0().keySet();
    }

    public s1<K> n0() {
        return H0().n0();
    }

    @s9.a
    public boolean put(@x1 K k10, @x1 V v10) {
        return H0().put(k10, v10);
    }

    @s9.a
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return H0().remove(obj, obj2);
    }

    @Override // com.google.common.collect.r1
    public int size() {
        return H0().size();
    }

    @s9.a
    public boolean t0(@x1 K k10, Iterable<? extends V> iterable) {
        return H0().t0(k10, iterable);
    }

    public Collection<V> values() {
        return H0().values();
    }
}
