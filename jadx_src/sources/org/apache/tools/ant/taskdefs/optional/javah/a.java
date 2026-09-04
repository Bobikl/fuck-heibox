package org.apache.tools.ant.taskdefs.optional.javah;

import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.optional.Javah;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: ForkingJavah.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f135223a = "forking";

    @Override // org.apache.tools.ant.taskdefs.optional.javah.c
    public boolean a(Javah javah) throws BuildException {
        o oVarB = f.b(javah);
        Project projectB = javah.b();
        String strH = s0.h("javah");
        javah.x1("Running " + strH, 3);
        oVarB.w(strH);
        String[] strArrS = oVarB.s();
        try {
            n1 n1Var = new n1(new s3((u2) javah, 2, 1));
            n1Var.w(projectB);
            n1Var.E(projectB.Z());
            n1Var.x(strArrS);
            n1Var.e();
            return !n1Var.n();
        } catch (IOException e10) {
            throw new BuildException("Error running " + strH + " -maybe it is not on the path", e10);
        }
    }
}
