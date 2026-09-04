package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient EnumSet<E> f57276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @t9.b
    private transient int f57277h;

    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final EnumSet<E> f57278b;

        EnumSerializedForm(EnumSet<E> enumSet) {
            this.f57278b = enumSet;
        }

        Object a() {
            return new ImmutableEnumSet(this.f57278b.clone());
        }
    }

    private ImmutableEnumSet(EnumSet<E> enumSet) {
        this.f57276g = enumSet;
    }

    static ImmutableSet N(EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            return size != 1 ? new ImmutableEnumSet(enumSet) : ImmutableSet.E(l1.z(enumSet));
        }
        return ImmutableSet.D();
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean B() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f57276g.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).f57276g;
        }
        return this.f57276g.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).f57276g;
        }
        return this.f57276g.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int i10 = this.f57277h;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f57276g.hashCode();
        this.f57277h = iHashCode;
        return iHashCode;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f57276g.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<E> iterator() {
        return Iterators.f0(this.f57276g.iterator());
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    Object l() {
        return new EnumSerializedForm(this.f57276g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f57276g.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f57276g.toString();
    }
}
