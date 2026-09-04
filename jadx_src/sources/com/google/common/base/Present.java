package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f56633b;

    Present(T t10) {
        this.f56633b = t10;
    }

    @Override // com.google.common.base.Optional
    public Set<T> b() {
        return Collections.singleton(this.f56633b);
    }

    @Override // com.google.common.base.Optional
    public T d() {
        return this.f56633b;
    }

    @Override // com.google.common.base.Optional
    public boolean e() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Present) {
            return this.f56633b.equals(((Present) obj).f56633b);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public Optional<T> g(Optional<? extends T> optional) {
        w.E(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    public T h(c0<? extends T> c0Var) {
        w.E(c0Var);
        return this.f56633b;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.f56633b.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public T i(T t10) {
        w.F(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f56633b;
    }

    @Override // com.google.common.base.Optional
    public T j() {
        return this.f56633b;
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> l(n<? super T, V> nVar) {
        return new Present(w.F(nVar.apply(this.f56633b), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        String strValueOf = String.valueOf(this.f56633b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
