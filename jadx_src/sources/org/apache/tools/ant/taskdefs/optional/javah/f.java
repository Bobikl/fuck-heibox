package org.apache.tools.ant.taskdefs.optional.javah;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.launch.Locator;
import org.apache.tools.ant.taskdefs.o1;
import org.apache.tools.ant.taskdefs.optional.Javah;
import org.apache.tools.ant.taskdefs.optional.clearcase.k;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: SunJavah.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f135226a = "sun";

    static o b(Javah javah) {
        o oVar = new o();
        if (javah.w2() != null) {
            oVar.h().O1("-d");
            oVar.h().G1(javah.w2());
        }
        if (javah.z2() != null) {
            oVar.h().O1("-o");
            oVar.h().G1(javah.z2());
        }
        if (javah.u2() != null) {
            oVar.h().O1("-classpath");
            oVar.h().I1(javah.u2());
        }
        if (javah.B2()) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
        }
        if (javah.y2()) {
            oVar.h().O1("-old");
        }
        if (javah.x2()) {
            oVar.h().O1(k.N);
        }
        if (javah.A2() && !javah.y2()) {
            throw new BuildException("stubs only available in old mode.", javah.w1());
        }
        if (javah.A2()) {
            oVar.h().O1("-stubs");
        }
        o0 o0Var = new o0(javah.b());
        if (javah.s2() != null) {
            o0Var.n2(javah.s2());
        }
        o0 o0VarQ2 = o0Var.q2(z0.b.f136024i);
        if (o0VarQ2.size() > 0) {
            oVar.h().O1("-bootclasspath");
            oVar.h().I1(o0VarQ2);
        }
        oVar.c(javah.v2());
        javah.F2(oVar);
        return oVar;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.javah.c
    public boolean a(Javah javah) throws BuildException {
        Class<?> cls;
        o oVarB = b(javah);
        o1 o1Var = new o1();
        try {
            try {
                cls = Class.forName("com.sun.tools.javah.oldjavah.Main");
            } catch (ClassNotFoundException e10) {
                throw new BuildException("Can't load javah", e10, javah.w1());
            }
        } catch (ClassNotFoundException unused) {
            cls = Class.forName("com.sun.tools.javah.Main");
        }
        oVarB.w(cls.getName());
        o1Var.f(oVarB);
        File classSource = Locator.getClassSource(cls);
        if (classSource != null) {
            o1Var.e(new o0(javah.b(), classSource.getPath()));
        }
        return o1Var.c(javah) == 0;
    }
}
