package org.apache.tools.ant.taskdefs.rmic;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: RmicAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f135707a = "Class not found: ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f135708b = "Class of unexpected Type: ";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f135709c = "default";

    private f() {
    }

    public static e a(String str, u2 u2Var) throws BuildException {
        return b(str, u2Var, null);
    }

    public static e b(String str, u2 u2Var, o0 o0Var) throws BuildException {
        if ("default".equalsIgnoreCase(str) || str.isEmpty()) {
            if (d.v()) {
                str = "kaffe";
            } else {
                str = s0.n("9") ? "forking" : "sun";
            }
        }
        if ("sun".equalsIgnoreCase(str)) {
            return new g();
        }
        if ("kaffe".equalsIgnoreCase(str)) {
            return new d();
        }
        if (h.f135717n.equalsIgnoreCase(str)) {
            return new h();
        }
        if ("forking".equalsIgnoreCase(str)) {
            return new c();
        }
        return i.f135723n.equalsIgnoreCase(str) ? new i() : c(str, u2Var.b().z(o0Var));
    }

    private static e c(String str, ClassLoader classLoader) throws BuildException {
        if (classLoader == null) {
            classLoader = f.class.getClassLoader();
        }
        return (e) org.apache.tools.ant.util.i.k(str, classLoader, e.class);
    }
}
