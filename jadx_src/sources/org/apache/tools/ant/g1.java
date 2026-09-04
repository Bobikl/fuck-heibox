package org.apache.tools.ant;

/* JADX INFO: compiled from: ExtensionPoint.java */
/* JADX INFO: loaded from: classes5.dex */
public class g1 extends t2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f133341l = "you must not nest child elements into an extension-point";

    public g1() {
    }

    public g1(t2 t2Var) {
        super(t2Var);
    }

    @Override // org.apache.tools.ant.t2
    public final void c(RuntimeConfigurable runtimeConfigurable) {
        throw new BuildException(f133341l);
    }

    @Override // org.apache.tools.ant.t2, org.apache.tools.ant.x2
    public final void c1(u2 u2Var) {
        throw new BuildException(f133341l);
    }
}
