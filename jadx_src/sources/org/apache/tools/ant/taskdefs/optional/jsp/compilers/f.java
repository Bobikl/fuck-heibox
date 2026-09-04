package org.apache.tools.ant.taskdefs.optional.jsp.compilers;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.g;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: JspCompilerAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private f() {
    }

    public static e a(String str, u2 u2Var) throws BuildException {
        return b(str, u2Var, u2Var.b().z(null));
    }

    public static e b(String str, u2 u2Var, g gVar) throws BuildException {
        if ("jasper".equalsIgnoreCase(str)) {
            return new d(new org.apache.tools.ant.taskdefs.optional.jsp.d());
        }
        return "jasper41".equalsIgnoreCase(str) ? new d(new org.apache.tools.ant.taskdefs.optional.jsp.a()) : c(str, gVar);
    }

    private static e c(String str, g gVar) throws BuildException {
        try {
            return (e) gVar.findClass(str).asSubclass(e.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException e10) {
            throw new BuildException(str + " isn't the classname of a compiler adapter.", e10);
        } catch (ClassNotFoundException e11) {
            throw new BuildException(str + " can't be found.", e11);
        } catch (Throwable th2) {
            throw new BuildException(str + " caused an interesting exception.", th2);
        }
    }
}
