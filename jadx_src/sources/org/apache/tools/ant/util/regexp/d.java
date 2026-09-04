package org.apache.tools.ant.util.regexp;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.util.i;

/* JADX INFO: compiled from: RegexpFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends f {
    protected c f(String str) throws BuildException {
        return (c) i.k(str, d.class.getClassLoader(), c.class);
    }

    public c g() throws BuildException {
        return h(null);
    }

    public c h(Project project) throws BuildException {
        String property = project == null ? System.getProperty(j1.f133497u) : project.u0(j1.f133497u);
        return property != null ? f(property) : new b();
    }
}
