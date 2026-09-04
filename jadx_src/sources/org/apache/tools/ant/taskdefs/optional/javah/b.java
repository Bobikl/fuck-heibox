package org.apache.tools.ant.taskdefs.optional.javah;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.optional.Javah;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Gcjh.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f135224a = "gcjh";

    private o b(Javah javah) {
        o oVar = new o();
        oVar.w(s0.h(f135224a));
        if (javah.w2() != null) {
            oVar.h().O1("-d");
            oVar.h().G1(javah.w2());
        }
        if (javah.z2() != null) {
            oVar.h().O1("-o");
            oVar.h().G1(javah.z2());
        }
        o0 o0Var = new o0(javah.b());
        if (javah.s2() != null) {
            o0Var.n2(javah.s2());
        }
        o0 o0VarQ2 = o0Var.q2(z0.b.f136024i);
        if (javah.u2() != null) {
            o0VarQ2.n2(javah.u2());
        }
        if (o0VarQ2.size() > 0) {
            oVar.h().O1("--classpath");
            oVar.h().I1(o0VarQ2);
        }
        if (!javah.y2()) {
            oVar.h().O1("-jni");
        }
        oVar.c(javah.v2());
        javah.F2(oVar);
        return oVar;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.javah.c
    public boolean a(Javah javah) throws BuildException {
        try {
            n1.v(javah, b(javah).s());
            return true;
        } catch (BuildException e10) {
            if (e10.getMessage().contains("failed with return code")) {
                return false;
            }
            throw e10;
        }
    }
}
