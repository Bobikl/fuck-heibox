package org.apache.tools.ant.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: AntFilterReader.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f136178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<m0> f136179h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f136180i;

    private j j2() {
        return (j) O1(j.class);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            o0 o0Var = this.f136180i;
            if (o0Var != null) {
                s.a2(o0Var, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (!this.f136179h.isEmpty() || this.f136178g != null || this.f136180i != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void e2(m0 m0Var) {
        if (Y1()) {
            throw Z1();
        }
        this.f136179h.add(m0Var);
    }

    public o0 f2() {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136180i == null) {
            this.f136180i = new o0(b());
        }
        b2(false);
        return this.f136180i.u2();
    }

    public String g2() {
        if (Y1()) {
            return j2().g2();
        }
        H1();
        return this.f136178g;
    }

    public o0 h2() {
        if (Y1()) {
            j2().h2();
        }
        H1();
        return this.f136180i;
    }

    public m0[] i2() {
        if (Y1()) {
            j2().i2();
        }
        H1();
        List<m0> list = this.f136179h;
        return (m0[]) list.toArray(new m0[list.size()]);
    }

    public void k2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136178g = str;
    }

    public void l2(o0 o0Var) {
        if (Y1()) {
            throw d2();
        }
        o0 o0Var2 = this.f136180i;
        if (o0Var2 == null) {
            this.f136180i = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
        b2(false);
    }

    public void m2(q1 q1Var) {
        if (Y1()) {
            throw d2();
        }
        f2().c2(q1Var);
    }
}
