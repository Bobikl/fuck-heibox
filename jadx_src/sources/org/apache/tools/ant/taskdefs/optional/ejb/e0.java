package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import java.util.Hashtable;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: WeblogicTOPLinkDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class e0 extends d0 {

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String f134941y1 = "http://www.objectpeople.com/tlwl/dtd/toplink-cmp_2_5_1.dtd";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f134942p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private String f134943x1;

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.d0, org.apache.tools.ant.taskdefs.optional.ejb.h, org.apache.tools.ant.taskdefs.optional.ejb.f
    public void c() throws BuildException {
        super.c();
        if (this.f134942p1 == null) {
            throw new BuildException("The toplinkdescriptor attribute must be specified");
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.d0, org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(Hashtable<String, File> hashtable, String str) {
        super.g(hashtable, str);
        File file = new File(n().f134952b, str + this.f134942p1);
        if (file.exists()) {
            hashtable.put("META-INF/" + this.f134942p1, file);
            return;
        }
        x("Unable to locate toplink deployment descriptor. It was expected to be in " + file.getPath(), 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected e o(File file) {
        e eVarO = super.o(file);
        String str = this.f134943x1;
        if (str != null) {
            eVarO.e("-//The Object People, Inc.//DTD TOPLink for WebLogic CMP 2.5.1//EN", str);
        } else {
            eVarO.e("-//The Object People, Inc.//DTD TOPLink for WebLogic CMP 2.5.1//EN", f134941y1);
        }
        return eVarO;
    }

    public void r0(String str) {
        this.f134942p1 = str;
    }

    public void s0(String str) {
        this.f134943x1 = str;
    }
}
