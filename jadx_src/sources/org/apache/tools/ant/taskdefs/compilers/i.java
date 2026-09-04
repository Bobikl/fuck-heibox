package org.apache.tools.ant.taskdefs.compilers;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: Gcj.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends h {
    private static final String[] C = {"-o", "--main=", org.apache.tools.ant.taskdefs.optional.vss.g.f135460i3, "-fjni", org.apache.tools.ant.taskdefs.optional.vss.g.f135453b3};

    public boolean Y() {
        String[] strArrZ2 = H().Z2();
        boolean zStartsWith = false;
        for (int i10 = 0; !zStartsWith && i10 < strArrZ2.length; i10++) {
            int i11 = 0;
            while (!zStartsWith) {
                String[] strArr = C;
                if (i11 >= strArr.length) {
                    break;
                }
                zStartsWith = strArrZ2[i10].startsWith(strArr[i11]);
                i11++;
            }
        }
        return zStartsWith;
    }

    protected org.apache.tools.ant.types.o Z() {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        o0 o0Var = new o0(this.f133852r);
        o0 o0VarE = E();
        if (!o0VarE.isEmpty()) {
            o0Var.n2(o0VarE);
        }
        o0 o0Var2 = this.f133846l;
        if (o0Var2 != null || this.f133855u) {
            o0Var.j2(o0Var2);
        }
        o0Var.n2(F());
        o0 o0Var3 = this.f133850p;
        if (o0Var3 != null) {
            o0Var.n2(o0Var3);
        } else {
            o0Var.n2(this.f133835a);
        }
        String strG3 = H().g3();
        if (strG3 == null) {
            strG3 = "gcj";
        }
        oVar.w(strG3);
        if (this.f133836b != null) {
            oVar.h().O1("-d");
            oVar.h().G1(this.f133836b);
            if (!this.f133836b.exists() && !this.f133836b.mkdirs() && !this.f133836b.isDirectory()) {
                throw new BuildException("Can't make output directories. Maybe permission is wrong.");
            }
        }
        oVar.h().O1("-classpath");
        oVar.h().I1(o0Var);
        if (this.f133837c != null) {
            oVar.h().O1("--encoding=" + this.f133837c);
        }
        if (this.f133838d) {
            oVar.h().O1("-g1");
        }
        if (this.f133839e) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.vss.g.f135456e3);
        }
        if (!Y()) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.vss.g.f135452a3);
        }
        if (this.f133859y.x3() != null) {
            String strX3 = this.f133859y.x3();
            oVar.h().O1("-fsource=" + strX3);
        }
        if (this.f133859y.B3() != null) {
            String strB3 = this.f133859y.B3();
            oVar.h().O1("-ftarget=" + strB3);
        }
        e(oVar);
        return oVar;
    }

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using gcj compiler", 3);
        org.apache.tools.ant.types.o oVarZ = Z();
        int iY = oVarZ.y();
        P(oVarZ);
        return C(oVarZ.s(), iY) == 0;
    }
}
