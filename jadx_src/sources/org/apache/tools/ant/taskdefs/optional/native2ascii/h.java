package org.apache.tools.ant.taskdefs.optional.native2ascii;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Native2AsciiAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {
    public static g a(String str, b2 b2Var) throws BuildException {
        return b(str, b2Var, null);
    }

    public static g b(String str, b2 b2Var, o0 o0Var) throws BuildException {
        if ((e() && str == null) || "kaffe".equals(str)) {
            return new f();
        }
        if ("sun".equals(str)) {
            return new i();
        }
        if (!"builtin".equals(str) && str != null) {
            return d(str, b2Var.b().z(o0Var));
        }
        return new d();
    }

    public static String c() {
        return e() ? "kaffe" : "builtin";
    }

    private static g d(String str, ClassLoader classLoader) throws BuildException {
        if (classLoader == null) {
            classLoader = h.class.getClassLoader();
        }
        return (g) org.apache.tools.ant.util.i.k(str, classLoader, g.class);
    }

    private static final boolean e() {
        return s0.r() || s0.o();
    }
}
