package org.apache.tools.ant.taskdefs.compilers;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: Jikes.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends h {
    private void Y(org.apache.tools.ant.types.o oVar) {
        String strU0 = this.f133852r.u0("build.compiler.emacs");
        if (strU0 != null && Project.t1(strU0)) {
            oVar.h().O1("+E");
        }
        String strU1 = this.f133852r.u0("build.compiler.warnings");
        if (strU1 != null) {
            this.f133859y.x1("!! the build.compiler.warnings property is deprecated. !!", 1);
            this.f133859y.x1("!! Use the nowarn attribute instead. !!", 1);
            if (!Project.t1(strU1)) {
                oVar.h().O1("-nowarn");
            }
        }
        if (this.f133859y.u3()) {
            oVar.h().O1("-nowarn");
        }
        String strU2 = this.f133852r.u0("build.compiler.pedantic");
        if (strU2 != null && Project.t1(strU2)) {
            oVar.h().O1("+P");
        }
        String strU3 = this.f133852r.u0("build.compiler.fulldepend");
        if (strU3 == null || !Project.t1(strU3)) {
            return;
        }
        oVar.h().O1("+F");
    }

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using jikes compiler", 3);
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        o0 o0Var = this.f133850p;
        if (o0Var == null) {
            o0Var = this.f133835a;
        }
        if (!o0Var.isEmpty()) {
            oVar.h().O1("-sourcepath");
            oVar.h().I1(o0Var);
        }
        o0 o0Var2 = new o0(this.f133852r);
        o0 o0Var3 = this.f133845k;
        if (o0Var3 == null || o0Var3.isEmpty()) {
            this.f133855u = true;
        }
        o0Var2.n2(F());
        String property = System.getProperty("jikes.class.path");
        if (property != null) {
            o0Var2.n2(new o0(this.f133852r, property));
        }
        o0 o0Var4 = this.f133846l;
        if (o0Var4 != null && !o0Var4.isEmpty()) {
            oVar.h().O1("-extdirs");
            oVar.h().I1(this.f133846l);
        }
        String strG3 = H().g3();
        if (strG3 == null) {
            strG3 = "jikes";
        }
        oVar.w(strG3);
        if (this.f133840f) {
            oVar.h().O1("-deprecation");
        }
        if (this.f133836b != null) {
            oVar.h().O1("-d");
            oVar.h().G1(this.f133836b);
        }
        oVar.h().O1("-classpath");
        oVar.h().I1(o0Var2);
        if (this.f133837c != null) {
            oVar.h().O1("-encoding");
            oVar.h().O1(this.f133837c);
        }
        if (this.f133838d) {
            String strB3 = this.f133859y.b3();
            if (strB3 != null) {
                oVar.h().O1("-g:" + strB3);
            } else {
                oVar.h().O1("-g");
            }
        } else {
            oVar.h().O1("-g:none");
        }
        if (this.f133839e) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.vss.g.f135456e3);
        }
        if (this.f133842h) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
        }
        if (this.f133841g) {
            oVar.h().O1("-depend");
        }
        if (this.f133843i != null) {
            oVar.h().O1("-target");
            oVar.h().O1(this.f133843i);
        }
        Y(oVar);
        if (this.f133859y.x3() != null) {
            oVar.h().O1("-source");
            String strX3 = this.f133859y.x3();
            if ("1.1".equals(strX3) || "1.2".equals(strX3)) {
                this.f133859y.log("Jikes doesn't support '-source " + strX3 + "', will use '-source 1.3' instead");
                oVar.h().O1("1.3");
            } else {
                oVar.h().O1(strX3);
            }
        }
        e(oVar);
        int iY = oVar.y();
        o0 o0VarE = E();
        if (!o0VarE.isEmpty()) {
            oVar.h().O1("-bootclasspath");
            oVar.h().I1(o0VarE);
        }
        P(oVar);
        return C(oVar.s(), iY) == 0;
    }
}
