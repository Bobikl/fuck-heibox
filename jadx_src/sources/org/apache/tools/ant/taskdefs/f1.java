package org.apache.tools.ant.taskdefs;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Ear.java */
/* JADX INFO: loaded from: classes5.dex */
public class f1 extends t2 {
    private static final org.apache.tools.ant.util.j0 V3 = org.apache.tools.ant.util.j0.O();
    private static final String W3 = "META-INF/application.xml";
    private File T3;
    private boolean U3;

    public f1() {
        this.f134381w = "ear";
        this.f134382x = TopicHashtagWrapper.TYPE_CREATE;
    }

    @Override // org.apache.tools.ant.taskdefs.t2, org.apache.tools.ant.taskdefs.j8
    protected void O2() {
        this.U3 = false;
        super.O2();
    }

    public void Y4(org.apache.tools.ant.types.d2 d2Var) {
        d2Var.C3("/");
        super.G2(d2Var);
    }

    public void Z4(File file) {
        this.T3 = file;
        if (!file.exists()) {
            throw new BuildException("Deployment descriptor: %s does not exist.", this.T3);
        }
        org.apache.tools.ant.types.d2 d2Var = new org.apache.tools.ant.types.d2();
        d2Var.V2(this.T3);
        d2Var.B3(W3);
        super.G2(d2Var);
    }

    @Deprecated
    public void a5(File file) {
        M3(file);
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected void f4(File file, org.apache.tools.zip.z zVar, String str, int i10) throws IOException {
        if (!W3.equalsIgnoreCase(str)) {
            super.f4(file, zVar, str, i10);
            return;
        }
        File file2 = this.T3;
        if (file2 != null && V3.J(file2, file) && !this.U3) {
            super.f4(file, zVar, str, i10);
            this.U3 = true;
            return;
        }
        y3("Warning: selected " + this.f134381w + " files include a " + W3 + " which will be ignored (please use appxml attribute to " + this.f134381w + " task)", 1);
    }

    @Override // org.apache.tools.ant.taskdefs.t2, org.apache.tools.ant.taskdefs.j8
    protected void m3(org.apache.tools.zip.z zVar) throws IOException, BuildException {
        if (this.T3 == null && !r3()) {
            throw new BuildException("appxml attribute is required", w1());
        }
        super.m3(zVar);
    }
}
