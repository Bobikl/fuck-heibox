package org.apache.tools.ant.taskdefs.rmic;

import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.taskdefs.z5;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: ForkingSunRmic.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f135704m = "forking";

    @Override // org.apache.tools.ant.taskdefs.rmic.e
    public boolean execute() throws BuildException {
        z5 z5VarK = k();
        o oVarR = r();
        Project projectB = z5VarK.b();
        String strP2 = z5VarK.P2();
        if (strP2 == null) {
            if (s0.n("15")) {
                throw new BuildException("rmic does not exist under Java 15 and higher, use rmic of an older JDK and explicitly set the executable attribute");
            }
            strP2 = s0.h(u());
        }
        oVarR.w(strP2);
        String[] strArrS = oVarR.s();
        try {
            n1 n1Var = new n1(new s3((u2) z5VarK, 2, 1));
            n1Var.w(projectB);
            n1Var.E(projectB.Z());
            n1Var.x(strArrS);
            n1Var.e();
            return !n1Var.n();
        } catch (IOException e10) {
            throw new BuildException("Error running " + u() + " -maybe it is not on the path", e10);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    protected boolean h() {
        boolean z10 = !s0.n("11");
        if (z10 || k().P2() == null) {
            return z10;
        }
        k().b().M0("Allowing -iiop and -idl for forked rmic even though this version of Java doesn't support it.", 2);
        return true;
    }

    protected String u() {
        return g.f135712o;
    }
}
