package com.google.common.base;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.b
@g
public final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<? super F, ? extends T> f56607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Equivalence<T> f56608c;

    FunctionalEquivalence(n<? super F, ? extends T> nVar, Equivalence<T> equivalence) {
        this.f56607b = (n) w.E(nVar);
        this.f56608c = (Equivalence) w.E(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    protected boolean a(F f10, F f11) {
        return this.f56608c.d(this.f56607b.apply(f10), this.f56607b.apply(f11));
    }

    @Override // com.google.common.base.Equivalence
    protected int b(F f10) {
        return this.f56608c.f(this.f56607b.apply(f10));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
        return this.f56607b.equals(functionalEquivalence.f56607b) && this.f56608c.equals(functionalEquivalence.f56608c);
    }

    public int hashCode() {
        return s.b(this.f56607b, this.f56608c);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f56608c);
        String strValueOf2 = String.valueOf(this.f56607b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(".onResultOf(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
