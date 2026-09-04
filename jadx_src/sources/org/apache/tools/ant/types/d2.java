package org.apache.tools.ant.types;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ZipFileSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class d2 extends k {
    public d2() {
    }

    protected d2(b0 b0Var) {
        super(b0Var);
    }

    protected d2(d2 d2Var) {
        super((k) d2Var);
    }

    @Override // org.apache.tools.ant.types.b0, org.apache.tools.ant.types.i
    protected i E2(Project project) {
        K1(project);
        Object objD = V1().d(project);
        if (objD instanceof d2) {
            return (i) objD;
        }
        if (objD instanceof b0) {
            d2 d2Var = new d2((b0) objD);
            f3(d2Var);
            return d2Var;
        }
        throw new BuildException(V1().b() + " doesn't denote a zipfileset or a fileset");
    }

    @Override // org.apache.tools.ant.types.k, org.apache.tools.ant.types.b0, org.apache.tools.ant.types.i, org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        return Y1() ? p3().clone() : super.clone();
    }

    @Override // org.apache.tools.ant.types.k
    protected i p3() {
        return E2(b());
    }

    @Override // org.apache.tools.ant.types.k
    protected l w3() {
        g2 g2Var = new g2();
        g2Var.V0(i3());
        return g2Var;
    }
}
