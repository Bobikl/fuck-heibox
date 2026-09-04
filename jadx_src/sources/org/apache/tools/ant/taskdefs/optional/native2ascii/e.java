package org.apache.tools.ant.taskdefs.optional.native2ascii;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.taskdefs.optional.s;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: DefaultNative2Ascii.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements g {
    @Override // org.apache.tools.ant.taskdefs.optional.native2ascii.g
    public final boolean a(s sVar, File file, File file2) throws BuildException {
        o oVar = new o();
        d(oVar, sVar);
        b(oVar, sVar, file, file2);
        return c(oVar, sVar);
    }

    protected void b(o oVar, b2 b2Var, File file, File file2) throws BuildException {
        oVar.h().G1(file);
        oVar.h().G1(file2);
    }

    protected abstract boolean c(o oVar, b2 b2Var) throws BuildException;

    protected void d(o oVar, s sVar) throws BuildException {
        if (sVar.G2() != null) {
            oVar.h().O1("-encoding");
            oVar.h().O1(sVar.G2());
        }
        oVar.c(sVar.F2());
    }
}
