package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingTable.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class g1<R, C, V> extends y0 implements u2<R, C, V> {
    protected g1() {
    }

    @Override // com.google.common.collect.u2
    public boolean A0(@CheckForNull Object obj) {
        return X0().A0(obj);
    }

    public Map<C, V> E0(@x1 R r10) {
        return X0().E0(r10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public abstract u2<R, C, V> X0();

    @Override // com.google.common.collect.u2
    @CheckForNull
    public V Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return X0().Y(obj, obj2);
    }

    @Override // com.google.common.collect.u2
    public boolean Z(@CheckForNull Object obj) {
        return X0().Z(obj);
    }

    public Map<C, Map<R, V>> a0() {
        return X0().a0();
    }

    public Map<R, V> b0(@x1 C c10) {
        return X0().b0(c10);
    }

    public void clear() {
        X0().clear();
    }

    @Override // com.google.common.collect.u2
    public boolean containsValue(@CheckForNull Object obj) {
        return X0().containsValue(obj);
    }

    @s9.a
    @CheckForNull
    public V d0(@x1 R r10, @x1 C c10, @x1 V v10) {
        return X0().d0(r10, c10, v10);
    }

    @Override // com.google.common.collect.u2
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || X0().equals(obj);
    }

    public Map<R, Map<C, V>> h() {
        return X0().h();
    }

    @Override // com.google.common.collect.u2
    public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return X0().h0(obj, obj2);
    }

    @Override // com.google.common.collect.u2
    public int hashCode() {
        return X0().hashCode();
    }

    @Override // com.google.common.collect.u2
    public boolean isEmpty() {
        return X0().isEmpty();
    }

    public Set<R> j() {
        return X0().j();
    }

    @s9.a
    @CheckForNull
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return X0().remove(obj, obj2);
    }

    public void s0(u2<? extends R, ? extends C, ? extends V> u2Var) {
        X0().s0(u2Var);
    }

    @Override // com.google.common.collect.u2
    public int size() {
        return X0().size();
    }

    public Set<u2.a<R, C, V>> v0() {
        return X0().v0();
    }

    public Collection<V> values() {
        return X0().values();
    }

    public Set<C> y0() {
        return X0().y0();
    }
}
