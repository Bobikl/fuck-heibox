package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import java.util.Hashtable;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: JbossDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class q extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final String f135008w = "jboss.xml";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final String f135009x = "jaws.xml";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final String f135010y = "jbosscmp-jdbc.xml";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f135011v = ".jar";

    private g G() {
        return (g) u();
    }

    public void H(String str) {
        this.f135011v = str;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h, org.apache.tools.ant.taskdefs.optional.ejb.f
    public void c() throws BuildException {
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(Hashtable<String, File> hashtable, String str) {
        File file = new File(n().f134952b, str + f135008w);
        if (!file.exists()) {
            x("Unable to locate jboss deployment descriptor. It was expected to be in " + file.getPath(), 1);
            return;
        }
        hashtable.put("META-INF/jboss.xml", file);
        String str2 = g.a.f134950d.equals(G().K2()) ? f135010y : f135009x;
        File file2 = new File(n().f134952b, str + str2);
        if (file2.exists()) {
            hashtable.put("META-INF/" + str2, file2);
            return;
        }
        x("Unable to locate jboss cmp descriptor. It was expected to be in " + file2.getPath(), 3);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    File w(String str) {
        if (p() == null && G().L2() == null) {
            throw new BuildException("DestDir not specified");
        }
        if (p() == null) {
            return new File(G().L2(), str + this.f135011v);
        }
        return new File(p(), str + this.f135011v);
    }
}
