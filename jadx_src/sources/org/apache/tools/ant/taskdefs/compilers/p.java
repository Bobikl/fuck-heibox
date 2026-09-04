package org.apache.tools.ant.taskdefs.compilers;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Sj.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends h {
    @Override // org.apache.tools.ant.taskdefs.compilers.h
    protected String K() {
        return null;
    }

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using symantec java compiler", 3);
        org.apache.tools.ant.types.o oVarS = S();
        String strG3 = H().g3();
        if (strG3 == null) {
            strG3 = "sj";
        }
        oVarS.w(strG3);
        return C(oVarS.s(), oVarS.y() - this.f133858x.length) == 0;
    }
}
