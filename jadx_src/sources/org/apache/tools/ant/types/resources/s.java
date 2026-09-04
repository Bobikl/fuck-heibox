package org.apache.tools.ant.types.resources;

/* JADX INFO: compiled from: CompressedResource.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s extends u {
    protected s() {
    }

    protected s(org.apache.tools.ant.types.u1 u1Var) {
        w2(u1Var);
    }

    protected abstract String D2();

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public String toString() {
        return D2() + " compressed " + super.toString();
    }
}
