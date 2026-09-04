package org.apache.tools.ant.taskdefs.compilers;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: Jvc.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends h {
    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using jvc compiler", 3);
        o0 o0Var = new o0(this.f133852r);
        o0 o0VarE = E();
        if (!o0VarE.isEmpty()) {
            o0Var.n2(o0VarE);
        }
        if (this.f133855u) {
            o0Var.j2(this.f133846l);
        }
        o0Var.n2(F());
        o0 o0Var2 = this.f133850p;
        if (o0Var2 != null) {
            o0Var.n2(o0Var2);
        } else {
            o0Var.n2(this.f133835a);
        }
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        String strG3 = H().g3();
        if (strG3 == null) {
            strG3 = "jvc";
        }
        oVar.w(strG3);
        if (this.f133836b != null) {
            oVar.h().O1("/d");
            oVar.h().G1(this.f133836b);
        }
        oVar.h().O1("/cp:p");
        oVar.h().I1(o0Var);
        String strU0 = L().u0("build.compiler.jvc.extensions");
        if (strU0 != null ? Project.t1(strU0) : true) {
            oVar.h().O1("/x-");
            oVar.h().O1("/nomessage");
        }
        oVar.h().O1("/nologo");
        if (this.f133838d) {
            oVar.h().O1("/g");
        }
        if (this.f133839e) {
            oVar.h().O1("/O");
        }
        if (this.f133842h) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.ccm.f.f134702w);
        }
        e(oVar);
        int iY = oVar.y();
        P(oVar);
        return D(oVar.s(), iY, false) == 0;
    }
}
