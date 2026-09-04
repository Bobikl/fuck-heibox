package org.apache.tools.ant.taskdefs.compilers;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: CompilerAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f133831a = "com.sun.tools.javac.Main";

    private c() {
    }

    private static boolean a() {
        try {
            try {
                Class.forName(f133831a);
                return true;
            } catch (ClassNotFoundException unused) {
                ClassLoader classLoader = c.class.getClassLoader();
                if (classLoader == null) {
                    return false;
                }
                classLoader.loadClass(f133831a);
                return true;
            }
        } catch (ClassNotFoundException unused2) {
            return false;
        }
    }

    public static a b(String str, u2 u2Var) throws BuildException {
        return c(str, u2Var, null);
    }

    public static a c(String str, u2 u2Var, o0 o0Var) throws BuildException {
        if ("jikes".equalsIgnoreCase(str)) {
            return new m();
        }
        if ("extjavac".equalsIgnoreCase(str)) {
            return new l();
        }
        if ("classic".equalsIgnoreCase(str) || "javac1.1".equalsIgnoreCase(str) || "javac1.2".equalsIgnoreCase(str)) {
            u2Var.x1("This version of java does not support the classic compiler; upgrading to modern", 1);
            str = "modern";
        }
        if ("modern".equalsIgnoreCase(str) || "javac1.3".equalsIgnoreCase(str) || "javac1.4".equalsIgnoreCase(str) || "javac1.5".equalsIgnoreCase(str) || "javac1.6".equalsIgnoreCase(str) || "javac1.7".equalsIgnoreCase(str) || "javac1.8".equalsIgnoreCase(str) || "javac1.9".equalsIgnoreCase(str) || "javac9".equalsIgnoreCase(str) || "javac10+".equalsIgnoreCase(str)) {
            if (a()) {
                return new k();
            }
            throw new BuildException("Unable to find a javac compiler;\n%s is not on the classpath.\nPerhaps JAVA_HOME does not point to the JDK.\nIt is currently set to \"%s\"", f133831a, s0.e());
        }
        if ("jvc".equalsIgnoreCase(str) || "microsoft".equalsIgnoreCase(str)) {
            return new n();
        }
        if ("kjc".equalsIgnoreCase(str)) {
            return new o();
        }
        if ("gcj".equalsIgnoreCase(str)) {
            return new i();
        }
        return ("sj".equalsIgnoreCase(str) || "symantec".equalsIgnoreCase(str)) ? new p() : d(str, u2Var.b().z(o0Var));
    }

    private static a d(String str, ClassLoader classLoader) throws BuildException {
        if (classLoader == null) {
            classLoader = c.class.getClassLoader();
        }
        return (a) org.apache.tools.ant.util.i.k(str, classLoader, a.class);
    }
}
