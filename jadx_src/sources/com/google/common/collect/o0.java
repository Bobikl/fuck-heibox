package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: ForwardingIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class o0<T> extends y0 implements Iterator<T> {
    protected o0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> X0();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return X0().hasNext();
    }

    @x1
    @s9.a
    public T next() {
        return X0().next();
    }

    public void remove() {
        X0().remove();
    }
}
