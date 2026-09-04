package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FilteredMultimapValues.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class c0<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @u9.g
    private final b0<K, V> f58064b;

    c0(b0<K, V> b0Var) {
        this.f58064b = (b0) com.google.common.base.w.E(b0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f58064b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        return this.f58064b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return Maps.O0(this.f58064b.i().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@CheckForNull Object obj) {
        com.google.common.base.x<? super Map.Entry<K, V>> xVarU = this.f58064b.U();
        Iterator<Map.Entry<K, V>> it = this.f58064b.g().i().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (xVarU.apply(next) && com.google.common.base.s.a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return l1.J(this.f58064b.g().i(), Predicates.d(this.f58064b.U(), Maps.Q0(Predicates.n(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return l1.J(this.f58064b.g().i(), Predicates.d(this.f58064b.U(), Maps.Q0(Predicates.q(Predicates.n(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f58064b.size();
    }
}
