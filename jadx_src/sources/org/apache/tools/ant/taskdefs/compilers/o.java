package org.apache.tools.ant.taskdefs.compilers;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.o1;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: Kjc.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends h {
    protected org.apache.tools.ant.types.o Y() {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        o0 o0VarF = F();
        if (this.f133840f) {
            oVar.h().O1("-deprecation");
        }
        if (this.f133836b != null) {
            oVar.h().O1("-d");
            oVar.h().G1(this.f133836b);
        }
        oVar.h().O1("-classpath");
        o0 o0Var = new o0(this.f133852r);
        o0 o0VarE = E();
        if (!o0VarE.isEmpty()) {
            o0Var.n2(o0VarE);
        }
        o0 o0Var2 = this.f133846l;
        if (o0Var2 != null) {
            o0Var.j2(o0Var2);
        }
        o0Var.n2(o0VarF);
        o0 o0Var3 = this.f133850p;
        if (o0Var3 != null) {
            o0Var.n2(o0Var3);
        } else {
            o0Var.n2(this.f133835a);
        }
        oVar.h().I1(o0Var);
        if (this.f133837c != null) {
            oVar.h().O1("-encoding");
            oVar.h().O1(this.f133837c);
        }
        if (this.f133838d) {
            oVar.h().O1("-g");
        }
        if (this.f133839e) {
            oVar.h().O1("-O2");
        }
        if (this.f133842h) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
        }
        e(oVar);
        P(oVar);
        return oVar;
    }

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using kjc compiler", 3);
        org.apache.tools.ant.types.o oVarY = Y();
        oVarY.w("at.dms.kjc.Main");
        o1 o1Var = new o1();
        o1Var.f(oVarY);
        return o1Var.c(H()) == 0;
    }
}
