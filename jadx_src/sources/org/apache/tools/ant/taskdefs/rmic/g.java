package org.apache.tools.ant.taskdefs.rmic;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.r3;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: SunRmic.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f135710m = "sun.rmi.rmic.Main";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f135711n = "sun";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f135712o = "rmic";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f135713p = "Cannot use SUN rmic, as it is not available.  A common solution is to set the environment variable JAVA_HOME";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f135714q = "Cannot use SUN rmic, as it is not available.  The class we try to use is part of the jdk.rmic module which may not be. Please use the 'forking' compiler for JDK 9+";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f135715r = "Error starting SUN rmic: ";

    @Override // org.apache.tools.ant.taskdefs.rmic.e
    public boolean execute() throws BuildException {
        k().x1("Using SUN rmic compiler", 3);
        o oVarR = r();
        r3 r3Var = new r3((u2) k(), 1);
        try {
            try {
                try {
                    Class<?> cls = Class.forName(f135710m);
                    Object objNewInstance = cls.getConstructor(OutputStream.class, String.class).newInstance(r3Var, f135712o);
                    boolean zEquals = Boolean.TRUE.equals(cls.getMethod("compile", String[].class).invoke(objNewInstance, oVarR.r()));
                    try {
                        r3Var.close();
                        return zEquals;
                    } catch (IOException e10) {
                        throw new BuildException(e10);
                    }
                } catch (Exception e11) {
                    if (e11 instanceof BuildException) {
                        throw ((BuildException) e11);
                    }
                    throw new BuildException(f135715r, e11, k().w1());
                }
            } catch (ClassNotFoundException unused) {
                if (s0.n("9")) {
                    throw new BuildException(f135714q, k().w1());
                }
                throw new BuildException(f135713p, k().w1());
            }
        } catch (Throwable th2) {
            try {
                r3Var.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    protected String[] q(String[] strArr) {
        return i(strArr);
    }
}
