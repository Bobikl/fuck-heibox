package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Antlib.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends org.apache.tools.ant.u2 implements org.apache.tools.ant.x2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f134583n = "antlib";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ClassLoader f134584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134585l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<org.apache.tools.ant.u2> f134586m = new ArrayList();

    public static n i2(Project project, URL url, String str) {
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setUseCaches(false);
            uRLConnectionOpenConnection.connect();
            org.apache.tools.ant.u uVarY = org.apache.tools.ant.u.y(project);
            uVarY.r(str);
            org.apache.tools.ant.types.resources.s1 s1Var = new org.apache.tools.ant.types.resources.s1(url);
            try {
                Object objW0 = project.w0("ant.projectHelper");
                org.apache.tools.ant.e2 e2VarJ = null;
                if (objW0 instanceof org.apache.tools.ant.e2) {
                    org.apache.tools.ant.e2 e2Var = (org.apache.tools.ant.e2) objW0;
                    if (e2Var.f(s1Var)) {
                        e2VarJ = e2Var;
                    }
                }
                if (e2VarJ == null) {
                    e2VarJ = org.apache.tools.ant.l2.g().j(s1Var);
                }
                org.apache.tools.ant.z2 z2VarY = e2VarJ.y(project, s1Var);
                if (!f134583n.equals(z2VarY.s2())) {
                    throw new BuildException("Unexpected tag " + z2VarY.s2() + " expecting " + f134583n, z2VarY.w1());
                }
                n nVar = new n();
                nVar.J(project);
                nVar.A1(z2VarY.w1());
                nVar.g2(f134583n);
                nVar.V1();
                z2VarY.k2(nVar);
                uVarY.s();
                return nVar;
            } catch (Throwable th2) {
                uVarY.s();
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Unable to find " + url, e10);
        }
    }

    private ClassLoader j2() {
        if (this.f134584k == null) {
            this.f134584k = n.class.getClassLoader();
        }
        return this.f134584k;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        Iterator<org.apache.tools.ant.u2> it = this.f134586m.iterator();
        while (it.hasNext()) {
            org.apache.tools.ant.z2 z2Var = (org.apache.tools.ant.z2) it.next();
            A1(z2Var.w1());
            z2Var.a2();
            Object objR2 = z2Var.r2();
            if (objR2 != null) {
                if (!(objR2 instanceof o)) {
                    throw new BuildException("Invalid task in antlib %s %s does not extend %s", z2Var.s2(), objR2.getClass(), o.class.getName());
                }
                o oVar = (o) objR2;
                oVar.l2(this.f134585l);
                oVar.k2(j2());
                oVar.V1();
                oVar.D1();
            }
        }
    }

    @Override // org.apache.tools.ant.x2
    public void c1(org.apache.tools.ant.u2 u2Var) {
        this.f134586m.add(u2Var);
    }

    protected void k2(ClassLoader classLoader) {
        this.f134584k = classLoader;
    }

    protected void l2(String str) {
        this.f134585l = str;
    }
}
