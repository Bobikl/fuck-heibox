package org.apache.tools.ant.taskdefs.optional.extension;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ExtraAttribute.java */
/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f135078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f135079b;

    String a() {
        return this.f135078a;
    }

    String b() {
        return this.f135079b;
    }

    public void c(String str) {
        this.f135078a = str;
    }

    public void d(String str) {
        this.f135079b = str;
    }

    public void e() throws BuildException {
        if (this.f135078a == null) {
            throw new BuildException("Missing name from parameter.");
        }
        if (this.f135079b != null) {
            return;
        }
        throw new BuildException("Missing value from parameter " + this.f135078a + ".");
    }
}
