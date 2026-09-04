package org.apache.tools.ant.taskdefs.rmic;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.o1;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: KaffeRmic.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f135705m = {"gnu.classpath.tools.rmi.rmic.RMIC", "gnu.java.rmi.rmic.RMIC", "kaffe.rmi.rmic.RMIC"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f135706n = "kaffe";

    private static Class<?> u() {
        String[] strArr = f135705m;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            try {
                return Class.forName(strArr[i10]);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean v() {
        return u() != null;
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.e
    public boolean execute() throws BuildException {
        k().x1("Using Kaffe rmic", 3);
        o oVarR = r();
        Class<?> clsU = u();
        if (clsU != null) {
            oVarR.w(clsU.getName());
            String name = clsU.getName();
            String[] strArr = f135705m;
            if (!name.equals(strArr[strArr.length - 1])) {
                oVarR.h().O1(org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
                k().log(o.p(oVarR));
            }
            o1 o1Var = new o1();
            o1Var.f(oVarR);
            return o1Var.c(k()) == 0;
        }
        StringBuilder sb2 = new StringBuilder("Cannot use Kaffe rmic, as it is not available.  None of ");
        for (String str : f135705m) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" have been found. A common solution is to set the environment variable JAVA_HOME or CLASSPATH.");
        throw new BuildException(sb2.toString(), k().w1());
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    protected boolean h() {
        return true;
    }
}
