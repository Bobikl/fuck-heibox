package org.apache.tools.ant.types;

import java.io.IOException;
import java.util.Map;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: TarScanner.java */
/* JADX INFO: loaded from: classes5.dex */
public class z1 extends l {
    @Override // org.apache.tools.ant.types.l
    protected void P0(s1 s1Var, String str, Map<String, s1> map, Map<String, s1> map2, Map<String, s1> map3, Map<String, s1> map4) {
        try {
            org.apache.tools.tar.f fVar = new org.apache.tools.tar.f(s1Var.h2(), str);
            while (true) {
                try {
                    try {
                        org.apache.tools.tar.d dVarF = fVar.f();
                        if (dVarF == null) {
                            fVar.close();
                            return;
                        }
                        org.apache.tools.ant.types.resources.m1 m1Var = new org.apache.tools.ant.types.resources.m1(s1Var, dVarF);
                        String strN = dVarF.n();
                        if (dVarF.v()) {
                            String strZ0 = l.Z0(strN);
                            map3.put(strZ0, m1Var);
                            if (T0(strZ0)) {
                                map4.put(strZ0, m1Var);
                            }
                        } else {
                            map.put(strN, m1Var);
                            if (T0(strN)) {
                                map2.put(strN, m1Var);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            fVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw new BuildException("problem reading " + this.L, e10);
                }
            }
        } catch (IOException e11) {
            throw new BuildException("problem opening " + this.L, e11);
        }
    }
}
