package org.apache.tools.ant.taskdefs.optional.unix;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.condition.z;
import org.apache.tools.ant.taskdefs.p1;
import org.apache.tools.ant.types.b0;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: AbstractAccessTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends p1 {
    public a() {
        super.w3(true);
        super.y3(true);
    }

    public void B3(File file) {
        b0 b0Var = new b0();
        b0Var.V2(file);
        d3(b0Var);
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    public void C2(o oVar) {
        throw new BuildException(L1() + " doesn't support the command attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void q3(boolean z10) {
        throw new BuildException(L1() + " doesn't support the addsourcefile attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    protected boolean u2() {
        return (o2() == null && p2() == null) ? z.b(z.f133976r) : super.u2();
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void y3(boolean z10) {
        throw new BuildException(L1() + " doesn't support the skipemptyfileset attribute", w1());
    }
}
