package org.apache.tools.ant.util.regexp;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.util.i;

/* JADX INFO: compiled from: RegexpMatcherFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {
    public static boolean d(Project project) {
        try {
            new f().c(project);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    protected e a(String str) throws BuildException {
        return (e) i.k(str, f.class.getClassLoader(), e.class);
    }

    public e b() throws BuildException {
        return c(null);
    }

    public e c(Project project) throws BuildException {
        String property = project == null ? System.getProperty(j1.f133497u) : project.u0(j1.f133497u);
        return property != null ? a(property) : new a();
    }

    protected void e(String str) throws BuildException {
        try {
            Class.forName(str);
        } catch (Throwable th2) {
            throw new BuildException(th2);
        }
    }
}
