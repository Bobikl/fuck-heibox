package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.b3;
import java.util.AbstractSet;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: EdgesConnecting.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class s<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<?, E> f58437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f58438c;

    s(Map<?, E> map, Object obj) {
        this.f58437b = (Map) com.google.common.base.w.E(map);
        this.f58438c = com.google.common.base.w.E(obj);
    }

    @CheckForNull
    private E a() {
        return this.f58437b.get(this.f58438c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b3<E> iterator() {
        E eA = a();
        return eA == null ? ImmutableSet.D().iterator() : Iterators.Y(eA);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        E eA = a();
        return eA != null && eA.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return a() == null ? 0 : 1;
    }
}
