package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSet.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class a1<E> extends h0<E> implements Set<E> {
    protected a1() {
    }

    @Override // com.google.common.collect.h0
    protected boolean S0(Collection<?> collection) {
        return Sets.I(this, (Collection) com.google.common.base.w.E(collection));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h0
    public abstract Set<E> X0();

    protected boolean Z0(@CheckForNull Object obj) {
        return Sets.g(this, obj);
    }

    protected int a1() {
        return Sets.k(this);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || X0().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return X0().hashCode();
    }
}
