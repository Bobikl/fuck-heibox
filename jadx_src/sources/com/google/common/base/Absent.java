package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class Absent<T> extends Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Absent<Object> f56581b = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object m() {
        return f56581b;
    }

    static <T> Optional<T> n() {
        return f56581b;
    }

    @Override // com.google.common.base.Optional
    public Set<T> b() {
        return Collections.emptySet();
    }

    @Override // com.google.common.base.Optional
    public T d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public boolean e() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public Optional<T> g(Optional<? extends T> optional) {
        return (Optional) w.E(optional);
    }

    @Override // com.google.common.base.Optional
    public T h(c0<? extends T> c0Var) {
        return (T) w.F(c0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public T i(T t10) {
        return (T) w.F(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    @CheckForNull
    public T j() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> l(n<? super T, V> nVar) {
        w.E(nVar);
        return Optional.a();
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }
}
