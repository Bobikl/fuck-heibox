package org.apache.tools.ant.taskdefs.optional.windows;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.condition.z;
import org.apache.tools.ant.taskdefs.p1;
import org.apache.tools.ant.types.b0;

/* JADX INFO: compiled from: Attrib.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends p1 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f135484a0 = "R";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f135485b0 = "A";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f135486c0 = "S";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f135487p1 = "H";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String f135488x1 = "+";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String f135489y1 = "-";
    private boolean Z = false;

    public a() {
        super.G2("attrib");
        super.w3(false);
    }

    private void B3(boolean z10, String str) {
        l2().O1(C3(z10) + str);
        this.Z = true;
    }

    private static String C3(boolean z10) {
        return z10 ? f135488x1 : "-";
    }

    private boolean D3() {
        return this.Z;
    }

    public void E3(boolean z10) {
        B3(z10, "A");
    }

    public void F3(String str) {
        throw new BuildException(L1() + " doesn't support the command attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    public void G2(String str) {
        throw new BuildException(L1() + " doesn't support the executable attribute", w1());
    }

    public void G3(File file) {
        b0 b0Var = new b0();
        b0Var.V2(file);
        d3(b0Var);
    }

    public void H3(boolean z10) {
        B3(z10, f135487p1);
    }

    public void I3(boolean z10) {
        B3(z10, f135484a0);
    }

    public void J3(boolean z10) {
        B3(z10, "S");
    }

    @Override // org.apache.tools.ant.taskdefs.p1, org.apache.tools.ant.taskdefs.j1
    protected void k2() {
        if (!D3()) {
            throw new BuildException("Missing attribute parameter", w1());
        }
        super.k2();
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void q3(boolean z10) {
        throw new BuildException(L1() + " doesn't support the addsourcefile attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    protected boolean u2() {
        return (o2() == null && p2() == null) ? z.b("windows") : super.u2();
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void v3(int i10) {
        throw new BuildException(L1() + " doesn't support the maxparallel attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void w3(boolean z10) {
        throw new BuildException(L1() + " doesn't support the parallel attribute", w1());
    }

    @Override // org.apache.tools.ant.taskdefs.p1
    public void y3(boolean z10) {
        throw new BuildException(L1() + " doesn't support the skipemptyfileset attribute", w1());
    }
}
