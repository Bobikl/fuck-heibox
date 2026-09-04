package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: ResourceExists.java */
/* JADX INFO: loaded from: classes5.dex */
public class c0 extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s1 f133878e;

    public void B1(s1 s1Var) {
        if (this.f133878e != null) {
            throw new BuildException("only one resource can be tested");
        }
        this.f133878e = s1Var;
    }

    protected void D1() throws BuildException {
        if (this.f133878e == null) {
            throw new BuildException("resource is required");
        }
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        D1();
        return this.f133878e.p2();
    }
}
