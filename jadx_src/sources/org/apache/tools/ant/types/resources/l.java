package org.apache.tools.ant.types.resources;

import java.util.Iterator;

/* JADX INFO: compiled from: BCFileSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends org.apache.tools.ant.types.b0 {
    public l() {
    }

    public l(org.apache.tools.ant.types.b0 b0Var) {
        super(b0Var);
    }

    private org.apache.tools.ant.types.b0 c3() {
        return (org.apache.tools.ant.types.b0) O1(org.apache.tools.ant.types.b0.class);
    }

    @Override // org.apache.tools.ant.types.b0, java.lang.Iterable
    public Iterator<org.apache.tools.ant.types.s1> iterator() {
        if (Y1()) {
            return c3().iterator();
        }
        a0 a0Var = new a0(b(), y2());
        a0Var.a(A2().m());
        a0Var.a(A2().j());
        return a0Var;
    }

    @Override // org.apache.tools.ant.types.b0, org.apache.tools.ant.types.u1
    public int size() {
        return Y1() ? c3().size() : A2().X() + A2().W();
    }
}
