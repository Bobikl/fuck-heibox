package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: AntlibDefinition.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134622k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ClassLoader f134623l;

    public ClassLoader i2() {
        return this.f134623l;
    }

    public String j2() {
        return this.f134622k;
    }

    public void k2(ClassLoader classLoader) {
        this.f134623l = classLoader;
    }

    public void l2(String str) throws BuildException {
        if (org.apache.tools.ant.e2.f133119c.equals(str)) {
            str = "";
        }
        if (str.startsWith("ant:")) {
            throw new BuildException("Attempt to use a reserved URI %s", str);
        }
        this.f134622k = str;
    }
}
