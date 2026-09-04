package org.apache.tools.ant.taskdefs.optional.clearcase;

import java.util.Optional;
import java.util.function.Supplier;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCUnlock.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends p {
    public static final String G = "-comment";
    public static final String H = "-pname";
    private String E = null;
    private String F = null;

    private void A2(org.apache.tools.ant.types.o oVar) {
        if (z2() == null) {
            return;
        }
        oVar.h().O1("-pname");
        oVar.h().O1(z2());
    }

    private void u2(org.apache.tools.ant.types.o oVar) {
        w2(oVar);
        if (k2() == null && z2() == null) {
            throw new BuildException("Should select either an element (pname) or an object (objselect)");
        }
        A2(oVar);
        if (k2() != null) {
            oVar.h().O1(k2());
        }
    }

    private void w2(org.apache.tools.ant.types.o oVar) {
        if (v2() == null) {
            return;
        }
        oVar.h().O1("-comment");
        oVar.h().O1(v2());
    }

    private String y2() {
        return (String) Optional.ofNullable(z2()).orElseGet(new Supplier() { // from class: org.apache.tools.ant.taskdefs.optional.clearcase.m
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f134716a.k2();
            }
        });
    }

    public void B2(String str) {
        this.E = str;
    }

    public void C2(String str) {
        s2(str);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1("unlock");
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + y2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public void D2(String str) {
        s2(str);
    }

    public void E2(String str) {
        this.F = str;
    }

    public String v2() {
        return this.E;
    }

    public String x2() {
        return k2();
    }

    public String z2() {
        return this.F;
    }
}
