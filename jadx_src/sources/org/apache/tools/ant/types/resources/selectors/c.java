package org.apache.tools.ant.types.resources.selectors;

import java.util.Iterator;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.Quantifier;
import org.apache.tools.ant.types.resources.w1;
import org.apache.tools.ant.types.s;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.u1;

/* JADX INFO: compiled from: Compare.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends s implements n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.comparators.f f136423g = new org.apache.tools.ant.types.resources.comparators.f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Quantifier f136424h = Quantifier.f136091d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private org.apache.tools.ant.types.q f136425i = org.apache.tools.ant.types.q.f136292d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w1 f136426j;

    private n g2() {
        return (n) O1(n.class);
    }

    private BuildException h2() {
        return new BuildException("%s the <control> element should be specified exactly once.", super.toString());
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            w1 w1Var = this.f136426j;
            if (w1Var != null) {
                s.a2(w1Var, stack, project);
            }
            s.a2(this.f136423g, stack, project);
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public synchronized boolean a(s1 s1Var) {
        if (Y1()) {
            return g2().a(s1Var);
        }
        if (this.f136426j == null) {
            throw h2();
        }
        H1();
        Iterator<s1> it = this.f136426j.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            if (this.f136425i.h(this.f136423g.compare(s1Var, it.next()))) {
                i10++;
            } else {
                i11++;
            }
        }
        return this.f136424h.i(i10, i11);
    }

    public synchronized void e2(org.apache.tools.ant.types.resources.comparators.m mVar) {
        if (Y1()) {
            throw Z1();
        }
        this.f136423g.h2(mVar);
        b2(false);
    }

    public synchronized u1 f2() {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136426j != null) {
            throw h2();
        }
        this.f136426j = new w1();
        b2(false);
        return this.f136426j;
    }

    public synchronized void i2(Quantifier quantifier) {
        if (Y1()) {
            throw d2();
        }
        this.f136424h = quantifier;
    }

    public synchronized void j2(org.apache.tools.ant.types.q qVar) {
        if (Y1()) {
            throw d2();
        }
        this.f136425i = qVar;
    }
}
