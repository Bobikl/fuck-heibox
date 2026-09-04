package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.e2;

/* JADX INFO: compiled from: TypeFound.java */
/* JADX INFO: loaded from: classes5.dex */
public class f0 extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133889f;

    protected boolean B1(String str) {
        org.apache.tools.ant.u uVarY = org.apache.tools.ant.u.y(b());
        String strL = e2.l(this.f133889f, str);
        org.apache.tools.ant.h hVarC = uVarY.C(strL);
        if (hVarC == null) {
            return false;
        }
        boolean z10 = hVarC.g(b()) != null;
        if (!z10) {
            x1(uVarY.q(strL, "type"), 3);
        }
        return z10;
    }

    public void D1(String str) {
        this.f133888e = str;
    }

    public void G1(String str) {
        this.f133889f = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        String str = this.f133888e;
        if (str != null) {
            return B1(str);
        }
        throw new BuildException("No type specified");
    }
}
