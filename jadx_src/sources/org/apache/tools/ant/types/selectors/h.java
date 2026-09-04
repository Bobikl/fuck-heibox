package org.apache.tools.ant.types.selectors;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: BaseSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h extends org.apache.tools.ant.types.s implements v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f136514g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Throwable f136515h;

    private h f2() {
        return (h) O1(h.class);
    }

    public abstract boolean P0(File file, String str, File file2);

    @Override // org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public /* synthetic */ boolean a(s1 s1Var) {
        return u.a(this, s1Var);
    }

    public String e2() {
        return this.f136514g;
    }

    public void g2(String str) {
        if (this.f136514g == null) {
            this.f136514g = str;
        }
    }

    public void h2(String str, Throwable th2) {
        if (this.f136514g == null) {
            this.f136514g = str;
            this.f136515h = th2;
        }
    }

    public void i2() {
        if (e2() == null) {
            j2();
        }
        if (e2() != null) {
            throw new BuildException(this.f136514g, this.f136515h);
        }
        if (Y1()) {
            return;
        }
        H1();
    }

    public void j2() {
        if (Y1()) {
            f2().j2();
        }
    }
}
