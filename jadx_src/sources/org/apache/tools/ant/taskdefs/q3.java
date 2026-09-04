package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Local.java */
/* JADX INFO: loaded from: classes5.dex */
public class q3 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135591k;

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f135591k == null) {
            throw new BuildException("Missing attribute name");
        }
        org.apache.tools.ant.property.b.j(b()).f(this.f135591k);
    }

    public void i2(String str) {
        this.f135591k = str;
    }
}
