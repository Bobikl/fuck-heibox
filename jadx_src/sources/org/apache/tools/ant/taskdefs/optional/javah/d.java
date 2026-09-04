package org.apache.tools.ant.taskdefs.optional.javah;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.i;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: JavahAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static c a(String str, b2 b2Var) throws BuildException {
        return b(str, b2Var, null);
    }

    public static c b(String str, b2 b2Var, o0 o0Var) throws BuildException {
        if ((s0.r() && str == null) || e.f135225a.equals(str)) {
            return new e();
        }
        if ((s0.p() && str == null) || b.f135224a.equals(str)) {
            return new b();
        }
        if (s0.n("10") && (str == null || "forking".equals(str))) {
            throw new BuildException("javah does not exist under Java 10 and higher, use the javac task with nativeHeaderDir instead");
        }
        if ("forking".equals(str)) {
            return new a();
        }
        if ("sun".equals(str)) {
            return new f();
        }
        return str != null ? d(str, b2Var.b().z(o0Var)) : new a();
    }

    public static String c() {
        if (s0.r()) {
            return e.f135225a;
        }
        return s0.p() ? b.f135224a : "forking";
    }

    private static c d(String str, ClassLoader classLoader) throws BuildException {
        if (classLoader == null) {
            classLoader = d.class.getClassLoader();
        }
        return (c) i.k(str, classLoader, c.class);
    }
}
