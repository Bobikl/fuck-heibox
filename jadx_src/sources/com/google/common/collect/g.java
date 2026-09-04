package com.google.common.collect;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractSequentialIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class g<T> extends b3<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private T f58078b;

    protected g(@CheckForNull T t10) {
        this.f58078b = t10;
    }

    @CheckForNull
    protected abstract T a(T t10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f58078b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t10 = this.f58078b;
        if (t10 == null) {
            throw new NoSuchElementException();
        }
        this.f58078b = a(t10);
        return t10;
    }
}
