package org.apache.tools.ant.taskdefs;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: War.java */
/* JADX INFO: loaded from: classes5.dex */
public class q7 extends t2 {
    private static final org.apache.tools.ant.util.j0 W3 = org.apache.tools.ant.util.j0.O();
    private static final String X3 = "WEB-INF/web.xml";
    private File T3;
    private boolean U3 = true;
    private File V3;

    public q7() {
        this.f134381w = "war";
        this.f134382x = TopicHashtagWrapper.TYPE_CREATE;
    }

    @Override // org.apache.tools.ant.taskdefs.t2, org.apache.tools.ant.taskdefs.j8
    protected void O2() {
        if (this.V3 == null && this.T3 == null && this.U3 && !r3() && l3()) {
            throw new BuildException("No WEB-INF/web.xml file was added.\nIf this is your intent, set needxmlfile='false' ");
        }
        this.V3 = null;
        super.O2();
    }

    public void Y4(org.apache.tools.ant.types.d2 d2Var) {
        d2Var.C3("WEB-INF/classes/");
        super.G2(d2Var);
    }

    public void Z4(org.apache.tools.ant.types.d2 d2Var) {
        d2Var.C3("WEB-INF/lib/");
        super.G2(d2Var);
    }

    public void a5(org.apache.tools.ant.types.d2 d2Var) {
        d2Var.C3("WEB-INF/");
        super.G2(d2Var);
    }

    public void b5(boolean z10) {
        this.U3 = z10;
    }

    @Deprecated
    public void c5(File file) {
        M3(file);
    }

    public void d5(File file) {
        this.T3 = file;
        if (!file.exists()) {
            throw new BuildException("Deployment descriptor:  does not exist.", this.T3);
        }
        org.apache.tools.ant.types.d2 d2Var = new org.apache.tools.ant.types.d2();
        d2Var.V2(this.T3);
        d2Var.B3(X3);
        super.G2(d2Var);
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected void f4(File file, org.apache.tools.zip.z zVar, String str, int i10) throws IOException {
        boolean z10 = true;
        if (X3.equalsIgnoreCase(str)) {
            File file2 = this.V3;
            if (file2 != null) {
                if (!W3.J(file2, file)) {
                    y3("Warning: selected " + this.f134381w + " files include a second " + X3 + " which will be ignored.\nThe duplicate entry is at " + file + "\nThe file that will be used is " + this.V3, 1);
                }
                z10 = false;
            } else {
                this.V3 = file;
                this.T3 = file;
            }
        }
        if (z10) {
            super.f4(file, zVar, str, i10);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.t2, org.apache.tools.ant.taskdefs.j8
    protected void m3(org.apache.tools.zip.z zVar) throws IOException, BuildException {
        super.m3(zVar);
    }
}
