package org.apache.tools.ant.taskdefs.cvslib;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: CvsUser.java */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f134016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f134017b;

    public String a() {
        return this.f134017b;
    }

    public String b() {
        return this.f134016a;
    }

    public void c(String str) {
        this.f134017b = str;
    }

    public void d(String str) {
        this.f134016a = str;
    }

    public void e() throws BuildException {
        if (this.f134016a == null) {
            throw new BuildException("Username attribute must be set.");
        }
        if (this.f134017b == null) {
            throw new BuildException("Displayname attribute must be set for userID %s", this.f134016a);
        }
    }
}
