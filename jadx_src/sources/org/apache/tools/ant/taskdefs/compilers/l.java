package org.apache.tools.ant.taskdefs.compilers;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.condition.z;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: JavacExternal.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends h {
    private boolean Y(org.apache.tools.ant.types.o oVar, int i10) {
        File fileC = null;
        try {
            try {
                fileC = s0.c(oVar.r());
                boolean z10 = D(new String[]{oVar.t(), org.apache.tools.ant.taskdefs.optional.vss.g.T2, fileC.getPath()}, i10, true) == 0;
                j0.H(fileC);
                return z10;
            } catch (IOException unused) {
                throw new BuildException("Failed to create a temporary file for \"-V\" switch");
            }
        } catch (Throwable th2) {
            j0.H(fileC);
            throw th2;
        }
    }

    private static boolean Z(String str) {
        return (str.startsWith("-J") || str.startsWith("@")) ? false : true;
    }

    private int a0(String[] strArr) {
        int i10 = 1;
        while (i10 < strArr.length && !Z(strArr[i10])) {
            i10++;
        }
        for (int i11 = i10 + 1; i11 < strArr.length; i11++) {
            if (!Z(strArr[i11])) {
                String str = strArr[i11];
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    strArr[i12 + 1] = strArr[i12];
                }
                strArr[i10] = str;
                i10++;
            }
        }
        return i10;
    }

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using external javac compiler", 3);
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        oVar.w(H().n3());
        if (t()) {
            X(oVar);
        } else {
            V(oVar, true);
        }
        int iY = s() ? oVar.y() : -1;
        P(oVar);
        if (z.b(z.f133977s)) {
            return Y(oVar, iY);
        }
        String[] strArrS = oVar.s();
        return D(strArrS, s() ? a0(strArrS) : -1, true) == 0;
    }
}
