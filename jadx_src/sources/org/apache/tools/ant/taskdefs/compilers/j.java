package org.apache.tools.ant.taskdefs.compilers;

import java.io.OutputStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.r3;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Javac12.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class j extends h {
    protected static final String C = "sun.tools.javac.Main";

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using classic compiler", 3);
        org.apache.tools.ant.types.o oVarT = T(true);
        try {
            r3 r3Var = new r3((u2) this.f133859y, 1);
            try {
                Class<?> cls = Class.forName(C);
                boolean zBooleanValue = ((Boolean) cls.getMethod("compile", String[].class).invoke(cls.getConstructor(OutputStream.class, String.class).newInstance(r3Var, "javac"), oVarT.r())).booleanValue();
                r3Var.close();
                return zBooleanValue;
            } catch (Throwable th2) {
                try {
                    r3Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (ClassNotFoundException unused) {
            throw new BuildException("Cannot use classic compiler, as it is not available. \n A common solution is to set the environment variable JAVA_HOME to your jdk directory.\nIt is currently set to \"" + s0.e() + "\"", this.f133853s);
        } catch (Exception e10) {
            if (e10 instanceof BuildException) {
                throw ((BuildException) e10);
            }
            throw new BuildException("Error starting classic compiler: ", e10, this.f133853s);
        }
    }
}
