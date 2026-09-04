package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public abstract class ImmutableAsList<E> extends ImmutableList<E> {

    @o9.c
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableCollection<?> f57263b;

        SerializedForm(ImmutableCollection<?> immutableCollection) {
            this.f57263b = immutableCollection;
        }

        Object a() {
            return this.f57263b.a();
        }
    }

    ImmutableAsList() {
    }

    @o9.c
    private void T(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract ImmutableCollection<E> Z();

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return Z().contains(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return Z().i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return Z().isEmpty();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @o9.c
    Object l() {
        return new SerializedForm(Z());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return Z().size();
    }
}
