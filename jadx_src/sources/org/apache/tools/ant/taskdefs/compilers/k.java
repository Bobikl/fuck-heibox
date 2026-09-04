package org.apache.tools.ant.taskdefs.compilers;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Javac13.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends h {
    private static final int C = 0;

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public boolean execute() throws BuildException {
        this.f133859y.x1("Using modern compiler", 3);
        org.apache.tools.ant.types.o oVarW = W();
        try {
            Class<?> cls = Class.forName("com.sun.tools.javac.Main");
            return ((Integer) cls.getMethod("compile", String[].class).invoke(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), oVarW.r())).intValue() == 0;
        } catch (Exception e10) {
            if (e10 instanceof BuildException) {
                throw ((BuildException) e10);
            }
            throw new BuildException("Error starting modern compiler", e10, this.f133853s);
        }
    }
}
