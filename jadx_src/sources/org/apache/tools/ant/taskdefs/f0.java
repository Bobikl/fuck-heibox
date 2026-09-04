package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Chmod.java */
/* JADX INFO: loaded from: classes5.dex */
public class f0 extends p1 {
    private org.apache.tools.ant.types.b0 Z = new org.apache.tools.ant.types.b0();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f134144a0 = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f134145b0 = false;

    public f0() {
        super.G2("chmod");
        super.w3(true);
        super.y3(true);
    }

    public org.apache.tools.ant.types.w0.c B3() {
        this.f134144a0 = true;
        return this.Z.r2();
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    public void C2(org.apache.tools.ant.types.o oVar) {
        throw new BuildException(L1() + " doesn't support the command attribute", w1());
    }

    public org.apache.tools.ant.types.w0.c C3() {
        this.f134144a0 = true;
        return this.Z.t2();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
    @Override // org.apache.tools.ant.taskdefs.j1, org.apache.tools.ant.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D1() throws org.apache.tools.ant.BuildException {
        /*
            r5 = this;
            boolean r0 = r5.f134144a0
            if (r0 != 0) goto L68
            org.apache.tools.ant.types.b0 r0 = r5.Z
            org.apache.tools.ant.Project r1 = r5.b()
            java.io.File r0 = r0.z2(r1)
            if (r0 != 0) goto L11
            goto L68
        L11:
            boolean r0 = r5.u2()
            if (r0 == 0) goto L82
            org.apache.tools.ant.taskdefs.n1 r0 = r5.x2()
            org.apache.tools.ant.types.o r1 = r5.f134310r
            java.lang.Object r1 = r1.clone()
            org.apache.tools.ant.types.o r1 = (org.apache.tools.ant.types.o) r1
            org.apache.tools.ant.types.o$a r2 = r1.h()
            org.apache.tools.ant.types.b0 r3 = r5.Z
            org.apache.tools.ant.Project r4 = r5.b()
            java.io.File r3 = r3.z2(r4)
            java.lang.String r3 = r3.getPath()
            r2.O1(r3)
            java.lang.String[] r1 = r1.s()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r0.x(r1)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r5.A2(r0)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r5.v2()
            goto L82
        L46:
            r0 = move-exception
            goto L64
        L48:
            r0 = move-exception
            org.apache.tools.ant.BuildException r1 = new org.apache.tools.ant.BuildException     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "Execute failed: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L46
            r2.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L46
            org.apache.tools.ant.Location r3 = r5.w1()     // Catch: java.lang.Throwable -> L46
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L46
            throw r1     // Catch: java.lang.Throwable -> L46
        L64:
            r5.v2()
            throw r0
        L68:
            super.D1()     // Catch: java.lang.Throwable -> L83
            boolean r0 = r5.f134144a0
            if (r0 == 0) goto L82
            org.apache.tools.ant.types.b0 r0 = r5.Z
            org.apache.tools.ant.Project r1 = r5.b()
            java.io.File r0 = r0.z2(r1)
            if (r0 == 0) goto L82
            java.util.Vector<org.apache.tools.ant.types.i> r0 = r5.H
            org.apache.tools.ant.types.b0 r1 = r5.Z
            r0.removeElement(r1)
        L82:
            return
        L83:
            r0 = move-exception
            boolean r1 = r5.f134144a0
            if (r1 == 0) goto L9b
            org.apache.tools.ant.types.b0 r1 = r5.Z
            org.apache.tools.ant.Project r2 = r5.b()
            java.io.File r1 = r1.z2(r2)
            if (r1 == 0) goto L9b
            java.util.Vector<org.apache.tools.ant.types.i> r1 = r5.H
            org.apache.tools.ant.types.b0 r2 = r5.Z
            r1.removeElement(r2)
        L9b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tools.ant.taskdefs.f0.D1():void");
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    public void D2(File file) {
        this.Z.R2(file);
    }

    public org.apache.tools.ant.types.w0 D3() {
        this.f134144a0 = true;
        return this.Z.v2();
    }

    public void E3(boolean z10) {
        this.f134144a0 = true;
        this.Z.Q2(z10);
    }

    public void F3(String str) {
        this.f134144a0 = true;
        this.Z.T2(str);
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    public void G2(String str) {
        throw new BuildException(L1() + " doesn't support the executable attribute", w1());
    }

    public void G3(File file) {
        org.apache.tools.ant.types.b0 b0Var = new org.apache.tools.ant.types.b0();
        b0Var.V2(file);
        d3(b0Var);
    }

    public void H3(String str) {
        this.f134144a0 = true;
        this.Z.X2(str);
    }

    public void I3(String str) {
        l2().O1(str);
        this.f134145b0 = true;
    }

    @Override // org.apache.tools.ant.b2
    public void J(Project project) {
        super.J(project);
        this.Z.J(project);
    }

    @Override // org.apache.tools.ant.taskdefs.p1, org.apache.tools.ant.taskdefs.j1
    protected void k2() {
        if (!this.f134145b0) {
            throw new BuildException("Required attribute perm not set in chmod", w1());
        }
        if (this.f134144a0 && this.Z.z2(b()) != null) {
            d3(this.Z);
        }
        super.k2();
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void q3(boolean z10) {
        throw new BuildException(L1() + " doesn't support the addsourcefile attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    protected boolean u2() {
        return (o2() == null && p2() == null) ? org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133976r) : super.u2();
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void y3(boolean z10) {
        throw new BuildException(L1() + " doesn't support the skipemptyfileset attribute", w1());
    }
}
