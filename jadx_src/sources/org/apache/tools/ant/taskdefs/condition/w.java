package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.r1;

/* JADX INFO: compiled from: Matches.java */
/* JADX INFO: loaded from: classes5.dex */
public class w extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f133960f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133961g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f133962h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r1 f133963i;

    public void B1(r1 r1Var) {
        if (this.f133963i != null) {
            throw new BuildException("Only one regular expression is allowed.");
        }
        this.f133963i = r1Var;
    }

    public void D1(boolean z10) {
        this.f133960f = z10;
    }

    public void G1(boolean z10) {
        this.f133961g = z10;
    }

    public void H1(String str) {
        if (this.f133963i != null) {
            throw new BuildException("Only one regular expression is allowed.");
        }
        r1 r1Var = new r1();
        this.f133963i = r1Var;
        r1Var.j2(str);
    }

    public void I1(boolean z10) {
        this.f133962h = z10;
    }

    public void K1(String str) {
        this.f133959e = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        if (this.f133959e == null) {
            throw new BuildException("Parameter string is required in matches.");
        }
        if (this.f133963i == null) {
            throw new BuildException("Missing pattern in matches.");
        }
        return this.f133963i.g2(b()).e(this.f133959e, org.apache.tools.ant.util.regexp.g.c(this.f133960f, this.f133961g, this.f133962h));
    }
}
