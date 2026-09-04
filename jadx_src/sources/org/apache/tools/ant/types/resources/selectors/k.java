package org.apache.tools.ant.types.resources.selectors;

import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: Not.java */
/* JADX INFO: loaded from: classes5.dex */
public class k implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f136448b;

    public k() {
    }

    public k(n nVar) {
        b(nVar);
    }

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public boolean a(s1 s1Var) {
        return !this.f136448b.a(s1Var);
    }

    public void b(n nVar) {
        if (this.f136448b != null) {
            throw new IllegalStateException("The Not ResourceSelector accepts a single nested ResourceSelector");
        }
        this.f136448b = nVar;
    }
}
