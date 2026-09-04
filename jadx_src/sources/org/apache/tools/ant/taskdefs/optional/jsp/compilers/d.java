package org.apache.tools.ant.taskdefs.optional.jsp.compilers;

import com.tencent.open.SocialConstants;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.g;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.types.CommandlineJava;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: JasperC.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    org.apache.tools.ant.taskdefs.optional.jsp.c f135271b;

    public d(org.apache.tools.ant.taskdefs.optional.jsp.c cVar) {
        this.f135271b = cVar;
    }

    private o0 n() {
        o0 o0VarE2 = i().E2();
        return o0VarE2 == null ? new o0(j()).s2(SocialConstants.PARAM_ONLY) : o0VarE2.s2(z0.b.f136024i);
    }

    private boolean o() {
        try {
            g gVarZ = j().z(n());
            try {
                gVarZ.loadClass("org.apache.jasper.tagplugins.jstl.If");
                gVarZ.close();
                return true;
            } catch (Throwable th2) {
                if (gVarZ != null) {
                    try {
                        gVarZ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private CommandlineJava p() {
        CommandlineJava commandlineJava = new CommandlineJava();
        org.apache.tools.ant.taskdefs.optional.jsp.b bVarI = i();
        g(commandlineJava, "-d", bVarI.H2());
        h(commandlineJava, "-p", bVarI.K2());
        if (o()) {
            j().L0("this task doesn't support Tomcat 5.x properly, please use the Tomcat provided jspc task instead");
        } else {
            f(commandlineJava, "-v" + bVarI.O2());
        }
        g(commandlineJava, "-uriroot", bVarI.N2());
        g(commandlineJava, "-uribase", bVarI.M2());
        h(commandlineJava, "-ieplugin", bVarI.J2());
        g(commandlineJava, "-webinc", bVarI.Q2());
        g(commandlineJava, "-webxml", bVarI.R2());
        f(commandlineJava, "-die9");
        if (bVarI.T2()) {
            f(commandlineJava, "-mapped");
        }
        if (bVarI.P2() != null) {
            g(commandlineJava, "-webapp", bVarI.P2().a());
        }
        m(i(), i().F2(), commandlineJava);
        return commandlineJava;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.compilers.e
    public org.apache.tools.ant.taskdefs.optional.jsp.c c() {
        return this.f135271b;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.compilers.e
    public boolean execute() throws BuildException {
        i().x1("Using jasper compiler", 3);
        CommandlineJava commandlineJavaP = p();
        try {
            try {
                v2 v2Var = new v2(this.f135270a);
                o0 o0VarN = n();
                if (i().E2() != null) {
                    j().M0("using user supplied classpath: " + o0VarN, 4);
                } else {
                    j().M0("using system classpath: " + o0VarN, 4);
                }
                v2Var.L2(o0VarN);
                v2Var.O2(j().Z());
                v2Var.K2("org.apache.jasper.JspC");
                for (String str : commandlineJavaP.w().r()) {
                    v2Var.q2().O1(str);
                }
                v2Var.R2(i().I2());
                v2Var.S2(true);
                v2Var.g2("jasperc");
                v2Var.D1();
                i().B2();
                return true;
            } catch (Exception e10) {
                if (e10 instanceof BuildException) {
                    throw ((BuildException) e10);
                }
                throw new BuildException("Error running jsp compiler: ", e10, i().w1());
            }
        } catch (Throwable th2) {
            i().B2();
            throw th2;
        }
    }
}
