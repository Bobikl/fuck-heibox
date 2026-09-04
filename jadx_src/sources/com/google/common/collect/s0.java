package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class s0<K, V> extends y0 implements Map<K, V> {

    /* JADX INFO: compiled from: ForwardingMap.java */
    @o9.a
    public abstract class a extends Maps.q<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.Maps.q
        Map<K, V> h() {
            return s0.this;
        }
    }

    /* JADX INFO: compiled from: ForwardingMap.java */
    @o9.a
    public class b extends Maps.z<K, V> {
        public b(s0 s0Var) {
            super(s0Var);
        }
    }

    /* JADX INFO: compiled from: ForwardingMap.java */
    @o9.a
    public class c extends Maps.m0<K, V> {
        public c(s0 s0Var) {
            super(s0Var);
        }
    }

    protected s0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    public abstract Map<K, V> H0();

    protected void J0() {
        Iterators.h(entrySet().iterator());
    }

    @o9.a
    protected boolean L0(@CheckForNull Object obj) {
        return Maps.q(this, obj);
    }

    protected boolean N0(@CheckForNull Object obj) {
        return Maps.r(this, obj);
    }

    protected boolean O0(@CheckForNull Object obj) {
        return Maps.w(this, obj);
    }

    protected int P0() {
        return Sets.k(entrySet());
    }

    protected boolean R0() {
        return !entrySet().iterator().hasNext();
    }

    protected void S0(Map<? extends K, ? extends V> map) {
        Maps.j0(this, map);
    }

    @o9.a
    @CheckForNull
    protected V T0(@CheckForNull Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (com.google.common.base.s.a(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected String U0() {
        return Maps.w0(this);
    }

    public void clear() {
        H0().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return H0().containsKey(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return H0().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return H0().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || H0().equals(obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return H0().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return H0().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return H0().isEmpty();
    }

    public Set<K> keySet() {
        return H0().keySet();
    }

    @s9.a
    @CheckForNull
    public V put(@x1 K k10, @x1 V v10) {
        return H0().put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        H0().putAll(map);
    }

    @s9.a
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        return H0().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return H0().size();
    }

    public Collection<V> values() {
        return H0().values();
    }
}
